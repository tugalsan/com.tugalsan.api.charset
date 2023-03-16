package com.tugalsan.api.charset.client;

import java.util.Locale;

public class TGS_CharSetCast {

    //DETECT TURKISH
    public static boolean isLocaleDefaultTurkish() {
        return Locale.getDefault().getDisplayCountry().equals("Türkiye")
                && Locale.getDefault().getDisplayName().equals("Türkçe (Türkiye)");
    }

    //TURKISH FIXED
    public static String toLowerCaseFixed(CharSequence source) {
        return source.toString().toLowerCase(Locale.ROOT);
    }

    public static String toUpperCaseFixed(CharSequence source) {
        return source.toString().toUpperCase(Locale.ROOT);
    }

    //TO HOLD A GLOBAL VALUE IN YOUR PROGRAMS
    public static enum ToStringStyle {
        TURKISH,
        OTHER
    }

    public static boolean STYLE_TURKISH() {//DOUBLE TO STRING STYLE
        return CAST_2_STR_STYLE == ToStringStyle.TURKISH;
    }
    public static ToStringStyle CAST_2_STR_STYLE = ToStringStyle.TURKISH;
}
