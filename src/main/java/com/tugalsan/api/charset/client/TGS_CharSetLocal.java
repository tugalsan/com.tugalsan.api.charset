package com.tugalsan.api.charset.client;

import com.google.gwt.core.shared.GwtIncompatible;
import com.google.gwt.i18n.client.LocaleInfo;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;

public class TGS_CharSetLocal {

    //MemoryHappy
    private static TGS_CharSetLocal of() {
        if (holder == null) {
            holder = new TGS_CharSetLocal();
        }
        return holder;
    }
    private static volatile TGS_CharSetLocal holder = null;

    private TGS_CharSetLocal() {

    }
    final public CommonCombined common = new CommonCombined();
    final public OnlyJre jre = new OnlyJre();

    //OnlyJREHappy
    public static class OnlyJre {

        @GwtIncompatible
        public static void setDefaultLocaleToTurkish() {
            Locale.forLanguageTag("tr-TR");
        }

        @GwtIncompatible
        public static boolean isASCIIPrintable(CharSequence text) {
            return text.codePoints().allMatch(c -> c > 31 && c < 127);
        }

        @GwtIncompatible
        public static boolean isASCII(CharSequence text) {
            return StandardCharsets.US_ASCII.newEncoder().canEncode(text);
        }

        @GwtIncompatible
        public static String makePrintable(CharSequence text) {
            if (text == null) {
                return "";
            }
            return text.toString().replaceAll("\\P{Print}", "");
        }

        @GwtIncompatible
        public static boolean isPrintable_slow(CharSequence text) {
            return Objects.equals(text, makePrintable(text));
        }
    }

    //JREHappy
    protected static class CommonCombined extends CommonGwt {

        @Override
        @GwtIncompatible
        public String localeName() {
            return Locale.getDefault().getLanguage();
        }
    }

    //GWTHappy
    protected static class CommonGwt {

        public String localeName() {
            return LocaleInfo.getCurrentLocale().getLocaleName();
        }

        public boolean localeTurkish() {
            return localeName().contains("tr");//"default" ?
        }
    }
}
