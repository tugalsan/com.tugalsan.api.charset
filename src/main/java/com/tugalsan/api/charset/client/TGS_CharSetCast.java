package com.tugalsan.api.charset.client;

import java.util.Locale;

//ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
//ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
public class TGS_CharSetCast {
    final public static boolean TURKISH = Locale.getDefault().getDisplayCountry().equals("Türkiye")
            && Locale.getDefault().getDisplayName().equals("Türkçe (Türkiye)");

    public static String toLowerCase(CharSequence source) {
        return TURKISH
                ? source.toString().toLowerCase(Locale.ROOT)
                : source.toString().toLowerCase();
    }

    public static String toUpperCase(CharSequence source) {
        return TURKISH
                ? source.toString().toUpperCase(Locale.ROOT)
                : source.toString().toUpperCase();
    }
}
