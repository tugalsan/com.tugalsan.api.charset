package com.tugalsan.api.charset.client;

import com.google.gwt.core.shared.GwtIncompatible;
import java.util.Locale;

public class TGS_CharSetCast {

    //UserHappy
    public static Common current() {
        return typed(TGS_CharSetLocale.cmn().currentTypeGet());
    }

    public static Common typed(TGS_CharSetLocaleTypes type) {
        if (type == TGS_CharSetLocaleTypes.TURKISH) {
            return turkish();
        }
        return english();
    }

    public static Common english() {
        return memoryHappy().english;
    }

    public static Common turkish() {
        return memoryHappy().english;
    }

    //MemoryHappy
    private static TGS_CharSetCast memoryHappy() {
        if (holder == null) {
            holder = new TGS_CharSetCast();
        }
        return holder;
    }
    private static volatile TGS_CharSetCast holder = null;

    private TGS_CharSetCast() {

    }
    final public Common english = new Common(TGS_CharSetLocaleTypes.ENGLISH);
    final public Common turkish = new Common(TGS_CharSetLocaleTypes.TURKISH);

    public static class Common extends CommonGwt {

        private Common(TGS_CharSetLocaleTypes localType) {
            super(localType);
        }

        @GwtIncompatible
        @Override
        protected void init() {
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                locale = Locale.of("tr");
                return;
            }
            locale = Locale.ENGLISH;
        }

        @GwtIncompatible
        Locale locale;

        @GwtIncompatible
        @Override
        public String toLowerCase(CharSequence source, boolean removeHiddenLetters) {
            if (removeHiddenLetters) {
                source = TGS_CharSet.cmn().removeHidden(source);
            }
            if (source == null) {
                return null;
            }
            return source.toString().toLowerCase(locale);
        }

        @GwtIncompatible
        @Override
        public String toUpperCase(CharSequence source, boolean removeHiddenLetters) {
            if (removeHiddenLetters) {
                source = TGS_CharSet.cmn().removeHidden(source);
            }
            if (source == null) {
                return null;
            }
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                return source.toString().toUpperCase(locale);
            }
            return source.toString().toUpperCase(locale);
        }

    }

    public static class CommonGwt {

        private CommonGwt(TGS_CharSetLocaleTypes localType) {
            this.localType = localType;
            init();
        }
        final public TGS_CharSetLocaleTypes localType;

        protected void init() {

        }

        public String dim() {
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                return dim_turkish;
            }
            return dim_other;
        }
        final private static String dim_other = ".";
        final private static String dim_turkish = ".";

        public String dayOfWeekName(int dayOfWeek) {
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                return dayOfWeekName_turkish[dayOfWeek - 1];
            }
            return dayOfWeekName_other[dayOfWeek - 1];
        }
        final private static String[] dayOfWeekName_other = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        final private static String[] dayOfWeekName_turkish = new String[]{"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};

        //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toLowerCase()
        public String toLowerCase(CharSequence source) {
            return toLowerCase(source, false);
        }

        public String toLowerCase(CharSequence source, boolean removeHiddenLetters) {
            if (removeHiddenLetters) {
                source = TGS_CharSet.cmn().removeHidden(source);
            }
            if (source == null) {
                return null;
            }
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                return source.toString().toLowerCase(Locale.ROOT);
            }
            return source.toString().toLowerCase(Locale.ENGLISH);
        }

        //ISSUE: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html#toUpperCase()
        public String toUpperCase(CharSequence source) {
            return toUpperCase(source, false);
        }

        public String toUpperCase(CharSequence source, boolean removeHiddenLetters) {
            if (removeHiddenLetters) {
                source = TGS_CharSet.cmn().removeHidden(source);
            }
            if (source == null) {
                return null;
            }
            if (localType == TGS_CharSetLocaleTypes.TURKISH) {
                return source.toString().toUpperCase(Locale.ROOT);
            }
            return source.toString().toUpperCase(Locale.ENGLISH);
        }

        public boolean equalsIgnoreCase(CharSequence item0, CharSequence item1) {
            return equalsIgnoreCase(item0, item1, true);
        }

        public boolean equalsIgnoreCase(CharSequence item0, CharSequence item1, boolean skipHiddenLetters) {
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
            return toUpperCase(item0, skipHiddenLetters).trim()
                    .equals(toUpperCase(item1, skipHiddenLetters).trim());
        }

        public boolean containsIgnoreCase(CharSequence fullContent, CharSequence searchTag) {
            return containsIgnoreCase(fullContent, searchTag, true);
        }

        public boolean containsIgnoreCase(CharSequence fullContent, CharSequence searchTag, boolean skipHiddenLetters) {
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
            return toUpperCase(fullContent, skipHiddenLetters).trim()
                    .contains(toUpperCase(searchTag, skipHiddenLetters).trim());
        }

        public boolean endsWithIgnoreCase(CharSequence fullContent, CharSequence endsWithTag) {
            return endsWithIgnoreCase(fullContent, endsWithTag, true);
        }

        public boolean endsWithIgnoreCase(CharSequence fullContent, CharSequence endsWithTag, boolean skipHiddenLetters) {
            if (fullContent == null && endsWithTag == null) {
                return true;
            }
            if (fullContent == null && endsWithTag != null) {
                return false;
            }
            if (fullContent != null && endsWithTag == null) {
                return false;
            }
            return toUpperCase(fullContent, skipHiddenLetters).trim()
                    .endsWith(toUpperCase(endsWithTag, skipHiddenLetters).trim());
        }

        public boolean startsWithIgnoreCase(CharSequence fullContent, CharSequence startsWithTag) {
            return startsWithIgnoreCase(fullContent, startsWithTag, true);
        }

        public boolean startsWithIgnoreCase(CharSequence fullContent, CharSequence startsWithTag, boolean skipHiddenLetters) {
            if (fullContent == null && startsWithTag == null) {
                return true;
            }
            if (fullContent == null && startsWithTag != null) {
                return false;
            }
            if (fullContent != null && startsWithTag == null) {
                return false;
            }
            return toUpperCase(fullContent, skipHiddenLetters).trim()
                    .startsWith(toUpperCase(startsWithTag, skipHiddenLetters).trim());
        }
    }

}
