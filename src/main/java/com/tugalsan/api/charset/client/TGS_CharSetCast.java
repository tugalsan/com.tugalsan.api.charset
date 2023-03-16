package com.tugalsan.api.charset.client;

import java.util.Locale;

public class TGS_CharSetCast {

    //TURKISH FIXED
    public static String toLowerCaseFixed(CharSequence source) {
        return isTurkish
                ? source.toString().toLowerCase(Locale.ROOT)
                : source.toString().toLowerCase();
    }

    public static String toUpperCaseFixed(CharSequence source) {
        return isTurkish
                ? source.toString().toUpperCase(Locale.ROOT)
                : source.toString().toUpperCase();
    }

    //TO HOLD A GLOBAL VALUE IN YOUR PROGRAMS
    final public static boolean isTurkish = Locale.getDefault().getDisplayCountry().equals("Türkiye")
            && Locale.getDefault().getDisplayName().equals("Türkçe (Türkiye)");
}
