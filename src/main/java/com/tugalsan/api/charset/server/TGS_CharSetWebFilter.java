package com.tugalsan.api.charset.server;

import com.tugalsan.api.charset.client.TGS_CharSet;
import com.tugalsan.api.log.server.TS_Log;
import com.tugalsan.api.unsafe.client.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter(
        urlPatterns = {"/*"},
        initParams = {
            @WebInitParam(name = "requestEncoding", value = TGS_CharSet.UTF8)
        }
)
public class TGS_CharSetWebFilter implements Filter {

    final private static TS_Log d = TS_Log.of(TGS_CharSetWebFilter.class);


    @Override
    public void init(FilterConfig config) {
        TGS_UnSafe.execute(() -> {
            encoding = config.getInitParameter("requestEncoding");
            if (encoding == null) {
                encoding = TGS_CharSet.UTF8;
            }
        });
    }
    private String encoding;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain next) {
        TGS_UnSafe.execute(() -> {

            //REQUEST.COMMON
            if (null == request.getCharacterEncoding()) {
                request.setCharacterEncoding(encoding);
            }

            //REQUEST.HTML
            if (String.valueOf(response.getContentType()).startsWith("text/html")) {
                response.setContentType("text/html; charset=" + TGS_CharSet.UTF8);
            }

            //RESPONSE
            response.setCharacterEncoding(TGS_CharSet.UTF8);

            //ESCALATE
            next.doFilter(request, response);
        }, e -> {
            if (e.getClass().getName().equals("org.apache.catalina.connector.ClientAbortException")) {
                d.cr("doFilter", "CLIENT GAVE UP", e.getMessage());
                return;
            }
            TGS_UnSafe.execute(() -> next.doFilter(request, response));//ESCALATE WITHOUT DEF_CHARSET
        });
    }

    @Override
    public void destroy() {
    }
}
