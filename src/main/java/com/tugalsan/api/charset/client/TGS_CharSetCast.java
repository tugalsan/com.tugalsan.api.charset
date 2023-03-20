package com.tugalsan.api.charset.client;

import java.nio.charset.Charset;
import java.util.Locale;

public class TGS_CharSetCast {

    /*
        GWT    SIDE INIT: TURKISH = TGC_CharSetUtils.localeTurkish();
        SERVER SIDE INIT: TURKISH = TS_CharSetUtils.localeTurkish();
     */
    public static boolean TURKISH = true;

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
    public static String toLocaleLowerCase(CharSequence source) {
        return TURKISH
                ? source.toString().toLowerCase(Locale.ROOT)
                : source.toString().toLowerCase();
    }

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toUpperCase()
    public static String toLocaleUpperCase(CharSequence source) {
        return TURKISH
                ? source.toString().toUpperCase(Locale.ROOT)
                : source.toString().toUpperCase();
    }

    public static boolean equalsLocaleIgnoreCase(CharSequence item0, CharSequence item1) {
        return toLocaleUpperCase(item0).equals(toLocaleUpperCase(item1));
    }

    public static String to(CharSequence source, Charset sourceCharset, Charset destCharset) {
        return new String(source.toString().getBytes(sourceCharset), destCharset);
    }
}
