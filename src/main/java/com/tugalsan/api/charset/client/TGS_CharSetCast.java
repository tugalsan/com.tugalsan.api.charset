package com.tugalsan.api.charset.client;

import java.util.Locale;

public class TGS_CharSetCast {

    public static enum ToStringStyle {
        TURKISH,
        ENGLISH
    }

    public static boolean STYLE_TURKISH() {//DOUBLE TO STRING STYLE
        return CAST_2_STR_STYLE == ToStringStyle.TURKISH;
    }
    public static ToStringStyle CAST_2_STR_STYLE = ToStringStyle.TURKISH;

    public static String toLowerCaseFixed(CharSequence source) {
        return source.toString().toLowerCase(Locale.ROOT);
    }

    public static String toUpperCaseFixed(CharSequence source) {
        return source.toString().toUpperCase(Locale.ROOT);
    }
}
