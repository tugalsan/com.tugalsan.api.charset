package com.tugalsan.api.charset.client;

import java.nio.charset.*;
import java.util.*;

public class TGS_CharacterSets {

//    public static String UTF8_DISTINCT (){return  "โ";}
//    public static String UTF8_STAR (){return  "โ";}
//    public static String UTF8_EMAILSEND (){return  "๐ฉ";}
//    public static String UTF8_BROOM (){return  "๐งน";}
//    public static String UTF8_COFFEE (){return  "โพ";}
//    public static String UTF8_PLUS_CIRCLE (){return  "โจ";}
//    public static String UTF8_FOLDER_CLOSED (){return  "๐";}//๐
//    public static String UTF8_FOLDER_OPENED (){return  "๐";}//๐
//    public static String UTF8_PAPER_BOTH (){return  "๐ป";}
//    public static String UTF8_PAPER_PICTURE (){return  "๐บ";}
//    public static String UTF8_PAPER_EMPTY (){return  "๐";}
    public static String UTF8_HAND_VICTORY() {
        return "โ";
    }
//    public static String UTF8_APPLE (){return  "๐";}
//    public static String UTF8_MOVIE (){return  "๐ฅ";}
//    public static String UTF8_BOOK (){return  "๐";}
//    public static String UTF8_BIRD (){return  "๐ฆ";}
//    public static String UTF8_MUSIC (){return  "๐ต";}
//    public static String UTF8_ZERO (){return  "โ";}
//    public static String UTF8_WATCH (){return  "โฐ";}//โ
//    public static String UTF8_CALENDER (){return  "๐";}
//    public static String UTF8_RUN (){return  "๐";}
//    public static String UTF8_PHONELAND (){return  "โ";}//โ
//    public static String UTF8_EMAIL (){return  "โ";}
//    public static String UTF8_ARROWRIGHTPLUS (){return  "โฅ";}
//    public static String UTF8_SAVE (){return  "๐พ";}
//    public static String UTF8_SELECT_TRUE (){return  "โ";}
//    public static String UTF8_SELECT_FALSE (){return  "โ";}
//    public static String UTF8_FLAGWHITE (){return  "โ";}
//    public static String UTF8_ARROWUP (){return  "๐ ";}
//    public static String UTF8_ARROWDOWN (){return  "๐ ";}
//    public static String UTF8_QUESTION (){return  "โ";}
//    public static String UTF8_WARNING (){return  "โ";}
//    public static String UTF8_PRINT (){return  "โ";}
//    public static String UTF8_PC (){return  "๐ป";}
//    public static String UTF8_FACTORY (){return  "๐ญ";}
//    public static String UTF8_TRASHBIN (){return  "๐";}
//    public static String UTF8_PENCIL (){return  "๐";}
//    public static String UTF8_PAGERIGHT (){return  "โ";}
//    public static String UTF8_PAGELEFT (){return  "โ";}
//    public static String UTF8_PAGESTART (){return  "โญถ";}//โคโญฐ
//    public static String UTF8_PAGEEND (){return  "๏ธโญธ";}//โคโฅ
//    public static String UTF8_SPREADSHEET (){return  "๐";}
//    public static String UTF8_INPUTNUMBERS (){return  "๐ข";}
//    public static String UTF8_INPUTCHARSMALL (){return  " ๐ก";}
//    public static String UTF8_INPUTCHARBIG (){return  "๐ ";}
//    public static String UTF8_FAVORITE (){return  "โ";}
//    public static String UTF8_PROCESSEMPTY (){return  "โฑ";}
//    public static String UTF8_PROCESSFULL (){return  "โฐ";}
//    public static String UTF8_KEY (){return  "๐";}
//    public static String UTF8_DOOR (){return  "๐ช";}
//    public static String UTF8_NEWS (){return  "๐ฐ";}
//    public static String UTF8_NEWSROLLED (){return  "๐";}
//    public static String UTF8_PERSONINFO (){return  "๐";}
//    public static String UTF8_CLOSE (){return  "โ";}//โ
//    public static String UTF8_REFRESH (){return  "โณ";}
//    public static String UTF8_REPORTS (){return  "๐";}
//    public static String UTF8_FILE_CABINET (){return  "๐";}
//    public static String UTF8_PAPER_TEXT (){return  "๐";}
//    public static String UTF8_PAPER_DOUBLE (){return  "๐";}
//    public static String UTF8_GLASSES (){return  "๐";}
//    public static String UTF8_CHECK (){return  "โ";}

    public static String UTF8_PRAY() {
        return "\uE41D";
    }

    public static String UTF8_HOURGLASS() {
        return "โ";
    }

    public static String UTF8_SORTDESC() {
        return "โฃ";
    }

    public static String UTF8_SORTASC() {
        return "โข";
    }

    public static String UTF8_CROSS() {
        return "โ";
    }

    public static String UTF8_FILTER() {
        return "โ";
    }

//see impl of StandardCharsets
    public static String ISO_TURKISH() {
        return "ISO_8859_9";
    }

    public static String IBM_TURKISH() {
        return "Cp857";
    }

    public static String UTF8() {
        return StandardCharsets.UTF_8.name();
    }
//    public static String OS (){return  Charset.defaultCharset().name();}//GWT doesnt like that

    public static Charset of(CharSequence charsetName) {
        return Charset.availableCharsets().get(charsetName.toString());
    }

    public static String to(CharSequence source, Charset sourceCharset, Charset destCharset) {
        return new String(source.toString().getBytes(sourceCharset), destCharset);
    }

    public static String toLowerCase_TR(CharSequence source) {
        return source.toString().toLowerCase(Locale.ROOT);
    }

    public static String toUpperCase_TR(CharSequence source) {
        return source.toString().toUpperCase(Locale.ROOT);
    }

    public static boolean STYLE_TURKISH() {//DOUBLE TO STRING STYLE
        return true;
    }
}
