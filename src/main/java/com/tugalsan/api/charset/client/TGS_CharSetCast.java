package com.tugalsan.api.charset.client;

import java.nio.charset.Charset;
import java.util.Locale;

public class TGS_CharSetCast {

    /*
        GWT SIDE: TGC_CharSetUtils.localeTurkish();
        SERVER SIDE: TS_CharSetUtils.localeTurkish();
    */
    public static boolean TURKISH = true;

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
    public static String toLowerCase(CharSequence source) {
        return TURKISH
                ? source.toString().toLowerCase(Locale.ROOT)
                : source.toString().toLowerCase();
    }

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toUpperCase()
    public static String toUpperCase(CharSequence source) {
        return TURKISH
                ? source.toString().toUpperCase(Locale.ROOT)
                : source.toString().toUpperCase();
    }

    public static String to(CharSequence source, Charset sourceCharset, Charset destCharset) {
        return new String(source.toString().getBytes(sourceCharset), destCharset);
    }
}
