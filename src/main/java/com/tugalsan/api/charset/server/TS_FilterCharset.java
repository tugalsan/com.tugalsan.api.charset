package com.tugalsan.api.charset.server;

import com.tugalsan.api.unsafe.client.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter(
        urlPatterns = {"/*"},
        initParams = {
            @WebInitParam(name = "requestEncoding", value = "UTF-8")
        }
)
public class TS_FilterCharset implements Filter {

    private String encoding;

    @Override
    public void init(FilterConfig config) {
        TGS_UnSafe.execute(() -> {
            encoding = config.getInitParameter("requestEncoding");
            if (encoding == null) {
                encoding = "UTF-8";
            }
        });
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain next) {
        TGS_UnSafe.execute(() -> {
            // Respect the client-specified character encoding
            // (see HTTP specification section 3.4.1)
            if (null == request.getCharacterEncoding()) {
                request.setCharacterEncoding(encoding);
            }

            // Set the default response content type and encoding
            var contentType = String.valueOf(response.getContentType());
            if (contentType.startsWith("text/html")) {
                response.setContentType("text/html; charset=UTF-8");
            }
            response.setCharacterEncoding("UTF-8");
            next.doFilter(request, response);
        }, e -> TGS_UnSafe.execute(() -> next.doFilter(request, response)));
    }

    @Override
    public void destroy() {
    }
}
