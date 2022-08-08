package com.tugalsan.api.charset.client;

import java.nio.charset.*;
import java.util.*;

public class TGS_CharacterSets {

//    public static String UTF8_DISTINCT (){return  "◐";}
//    public static String UTF8_STAR (){return  "☆";}
//    public static String UTF8_EMAILSEND (){return  "📩";}
//    public static String UTF8_BROOM (){return  "🧹";}
//    public static String UTF8_COFFEE (){return  "⛾";}
//    public static String UTF8_PLUS_CIRCLE (){return  "⨁";}
//    public static String UTF8_FOLDER_CLOSED (){return  "📁";}//🗁
//    public static String UTF8_FOLDER_OPENED (){return  "📂";}//🗀
//    public static String UTF8_PAPER_BOTH (){return  "🖻";}
//    public static String UTF8_PAPER_PICTURE (){return  "🖺";}
//    public static String UTF8_PAPER_EMPTY (){return  "🗋";}
    public static String UTF8_HAND_VICTORY() {
        return "✌";
    }
//    public static String UTF8_APPLE (){return  "🍎";}
//    public static String UTF8_MOVIE (){return  "🎥";}
//    public static String UTF8_BOOK (){return  "📚";}
//    public static String UTF8_BIRD (){return  "🐦";}
//    public static String UTF8_MUSIC (){return  "🎵";}
//    public static String UTF8_ZERO (){return  "∅";}
//    public static String UTF8_WATCH (){return  "⏰";}//⌚
//    public static String UTF8_CALENDER (){return  "📅";}
//    public static String UTF8_RUN (){return  "🏃";}
//    public static String UTF8_PHONELAND (){return  "☏";}//☎
//    public static String UTF8_EMAIL (){return  "✉";}
//    public static String UTF8_ARROWRIGHTPLUS (){return  "⥅";}
//    public static String UTF8_SAVE (){return  "💾";}
//    public static String UTF8_SELECT_TRUE (){return  "☑";}
//    public static String UTF8_SELECT_FALSE (){return  "☐";}
//    public static String UTF8_FLAGWHITE (){return  "⚐";}
//    public static String UTF8_ARROWUP (){return  "🠕";}
//    public static String UTF8_ARROWDOWN (){return  "🠗";}
//    public static String UTF8_QUESTION (){return  "❔";}
//    public static String UTF8_WARNING (){return  "❕";}
//    public static String UTF8_PRINT (){return  "⎙";}
//    public static String UTF8_PC (){return  "💻";}
//    public static String UTF8_FACTORY (){return  "🏭";}
//    public static String UTF8_TRASHBIN (){return  "🗑";}
//    public static String UTF8_PENCIL (){return  "🖉";}
//    public static String UTF8_PAGERIGHT (){return  "⎘";}
//    public static String UTF8_PAGELEFT (){return  "⎗";}
//    public static String UTF8_PAGESTART (){return  "⭶";}//⤓⭰
//    public static String UTF8_PAGEEND (){return  "️⭸";}//⤒⇥
//    public static String UTF8_SPREADSHEET (){return  "📋";}
//    public static String UTF8_INPUTNUMBERS (){return  "🔢";}
//    public static String UTF8_INPUTCHARSMALL (){return  " 🔡";}
//    public static String UTF8_INPUTCHARBIG (){return  "🔠";}
//    public static String UTF8_FAVORITE (){return  "⌘";}
//    public static String UTF8_PROCESSEMPTY (){return  "▱";}
//    public static String UTF8_PROCESSFULL (){return  "▰";}
//    public static String UTF8_KEY (){return  "🔑";}
//    public static String UTF8_DOOR (){return  "🚪";}
//    public static String UTF8_NEWS (){return  "📰";}
//    public static String UTF8_NEWSROLLED (){return  "🗞";}
//    public static String UTF8_PERSONINFO (){return  "💁";}
//    public static String UTF8_CLOSE (){return  "❎";}//☒
//    public static String UTF8_REFRESH (){return  "⟳";}
//    public static String UTF8_REPORTS (){return  "📈";}
//    public static String UTF8_FILE_CABINET (){return  "🗄";}
//    public static String UTF8_PAPER_TEXT (){return  "🗎";}
//    public static String UTF8_PAPER_DOUBLE (){return  "🗟";}
//    public static String UTF8_GLASSES (){return  "👓";}
//    public static String UTF8_CHECK (){return  "✔";}

    public static String UTF8_PRAY() {
        return "\uE41D";
    }

    public static String UTF8_HOURGLASS() {
        return "⌛";
    }

    public static String UTF8_SORTDESC() {
        return "◣";
    }

    public static String UTF8_SORTASC() {
        return "◢";
    }

    public static String UTF8_CROSS() {
        return "✘";
    }

    public static String UTF8_FILTER() {
        return "∀";
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
//    public static String OS (){return  Charset.defaultCharset().name();}//GWT does not like u; check on 2.10 version again!

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
