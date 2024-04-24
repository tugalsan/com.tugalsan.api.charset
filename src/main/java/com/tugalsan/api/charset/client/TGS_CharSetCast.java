package com.tugalsan.api.charset.client;

import java.util.Locale;

public class TGS_CharSetCast {

    /*
        GWT    SIDE INIT: TGS_CharSetCast.LOCALE2CAST = TGC_CharSetUtils.localeTurkish() ? TGS_CharSetCast.Locale2Cast.TURKISH : TGS_CharSetCast.Locale2Cast.OTHER;
        SERVER SIDE INIT: TGS_CharSetCast.LOCALE2CAST = TS_CharSetUtils.localeTurkish()  ? TGS_CharSetCast.Locale2Cast.TURKISH : TGS_CharSetCast.Locale2Cast.OTHER;
     */
    public static enum Locale2Cast {
        TURKISH, OTHER
    }

    public static Locale2Cast LOCALE2CAST = Locale2Cast.TURKISH;

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
    public static String toLocaleLowerCase(CharSequence source) {
        return toLocaleLowerCase(source, false);
    }

    public static String toLocaleLowerCase(CharSequence source, boolean removeHiddenLetters) {
        if (removeHiddenLetters) {
            source = TGS_CharSet.cmn().removeHidden(source);
        }
        if (source == null) {
            return null;
        }
        return LOCALE2CAST == Locale2Cast.TURKISH
                ? source.toString().toLowerCase(Locale.forLanguageTag("tr-TR"))
                : source.toString().toLowerCase();
    }

    //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toUpperCase()
    public static String toLocaleUpperCase(CharSequence source) {
        return toLocaleUpperCase(source, false);
    }

    public static String toLocaleUpperCase(CharSequence source, boolean removeHiddenLetters) {
        if (removeHiddenLetters) {
            source = TGS_CharSet.cmn().removeHidden(source);
        }
        if (source == null) {
            return null;
        }
        return LOCALE2CAST == Locale2Cast.TURKISH
                ? source.toString().toUpperCase(Locale.forLanguageTag("tr-TR"))
                : source.toString().toUpperCase();
    }

    public static boolean equalsLocaleIgnoreCase(CharSequence item0, CharSequence item1) {
        return equalsLocaleIgnoreCase(item0, item1, true);
    }

    public static boolean equalsLocaleIgnoreCase(CharSequence item0, CharSequence item1, boolean skipHiddenLetters) {
        if (skipHiddenLetters) {
            item0 = TGS_CharSet.cmn().removeHidden(item0);
            item1 = TGS_CharSet.cmn().removeHidden(item1);
        }
        if (item0 == null && item1 == null) {
            return true;
        }
        if (item0 == null && item1 != null) {
            return false;
        }
        if (item0 != null && item1 == null) {
            return false;
        }
        return toLocaleUpperCase(item0, skipHiddenLetters).trim()
                .equals(toLocaleUpperCase(item1, skipHiddenLetters).trim());
    }

    public static boolean containsLocaleIgnoreCase(CharSequence fullContent, CharSequence searchTag) {
        return containsLocaleIgnoreCase(fullContent, searchTag, true);
    }

    public static boolean containsLocaleIgnoreCase(CharSequence fullContent, CharSequence searchTag, boolean skipHiddenLetters) {
        if (skipHiddenLetters) {
            fullContent = TGS_CharSet.cmn().removeHidden(fullContent);
            searchTag = TGS_CharSet.cmn().removeHidden(searchTag);
        }
        if (fullContent == null && searchTag == null) {
            return true;
        }
        if (fullContent == null && searchTag != null) {
            return false;
        }
        if (fullContent != null && searchTag == null) {
            return false;
        }
        return toLocaleUpperCase(fullContent, skipHiddenLetters).trim()
                .contains(toLocaleUpperCase(searchTag, skipHiddenLetters).trim());
    }

    public static boolean endsWithLocaleIgnoreCase(CharSequence fullContent, CharSequence endsWithTag) {
        return endsWithLocaleIgnoreCase(fullContent, endsWithTag, true);
    }

    public static boolean endsWithLocaleIgnoreCase(CharSequence fullContent, CharSequence endsWithTag, boolean skipHiddenLetters) {
        if (fullContent == null && endsWithTag == null) {
            return true;
        }
        if (fullContent == null && endsWithTag != null) {
            return false;
        }
        if (fullContent != null && endsWithTag == null) {
            return false;
        }
        return toLocaleUpperCase(fullContent, skipHiddenLetters).trim()
                .endsWith(toLocaleUpperCase(endsWithTag, skipHiddenLetters).trim());
    }

    public static boolean startsWithLocaleIgnoreCase(CharSequence fullContent, CharSequence startsWithTag) {
        return startsWithLocaleIgnoreCase(fullContent, startsWithTag, true);
    }

    public static boolean startsWithLocaleIgnoreCase(CharSequence fullContent, CharSequence startsWithTag, boolean skipHiddenLetters) {
        if (fullContent == null && startsWithTag == null) {
            return true;
        }
        if (fullContent == null && startsWithTag != null) {
            return false;
        }
        if (fullContent != null && startsWithTag == null) {
            return false;
        }
        return toLocaleUpperCase(fullContent, skipHiddenLetters).trim()
                .startsWith(toLocaleUpperCase(startsWithTag, skipHiddenLetters).trim());
    }

}
