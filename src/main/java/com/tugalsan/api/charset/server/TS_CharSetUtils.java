package com.tugalsan.api.charset.server;

import java.util.Locale;

public class TS_CharSetUtils {

    public static String localeLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static boolean localeTurkish() {
        return localeLanguage().equals("tr");
    }
}
