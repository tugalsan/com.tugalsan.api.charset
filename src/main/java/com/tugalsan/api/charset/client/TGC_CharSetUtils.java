package com.tugalsan.api.charset.client;

import com.google.gwt.i18n.client.LocaleInfo;

public class TGC_CharSetUtils {

    public static String localeName() {
        return LocaleInfo.getCurrentLocale().getLocaleName();
    }

    public static boolean localeTurkish() {
        return localeName().contains("tr");//"default" ?
    }
}
