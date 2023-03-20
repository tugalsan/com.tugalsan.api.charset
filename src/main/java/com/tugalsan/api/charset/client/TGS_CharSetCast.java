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
        if (source == null) {
            return null;
        }
        return TURKISH
                ? source.toString().toLowerCase(Locale.ROOT)
                : source.toString().toLowerCase();
    }

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toUpperCase()
    public static String toLocaleUpperCase(CharSequence source) {
        if (source == null) {
            return null;
        }
        return TURKISH
                ? source.toString().toUpperCase(Locale.ROOT)
                : source.toString().toUpperCase();
    }

    public static boolean equalsLocaleIgnoreCase(CharSequence item0, CharSequence item1) {
        if (item0 == null && item1 == null) {
            return true;
        }
        if (item0 == null && item1 != null) {
            return false;
        }
        if (item0 != null && item1 == null) {
            return false;
        }
        return toLocaleUpperCase(item0).equals(toLocaleUpperCase(item1));
    }

    public static boolean containsLocaleIgnoreCase(CharSequence fullContent, CharSequence searchTag) {
        if (fullContent == null && searchTag == null) {
            return true;
        }
        if (fullContent == null && searchTag != null) {
            return false;
        }
        if (fullContent != null && searchTag == null) {
            return false;
        }
        return TGS_CharSetCast.toLocaleUpperCase(fullContent).contains(TGS_CharSetCast.toLocaleUpperCase(searchTag));
    }

    public static String to(CharSequence source, Charset sourceCharset, Charset destCharset) {
        return new String(source.toString().getBytes(sourceCharset), destCharset);
    }
}
