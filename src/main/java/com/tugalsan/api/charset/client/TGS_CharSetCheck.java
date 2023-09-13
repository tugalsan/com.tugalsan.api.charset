package com.tugalsan.api.charset.client;

import java.nio.charset.StandardCharsets;

public class TGS_CharSetCheck {

    public static boolean isASCII(CharSequence text) {
        return StandardCharsets.US_ASCII.newEncoder().canEncode(text);
    }

    public static CharSequence toASCII(CharSequence text, CharSequence dummy) {
        if (isASCII(text)) {
            return text;
        }
        return text.toString().replaceAll("[^\\p{ASCII}]", dummy == null ? "" : dummy.toString());
    }

    //https://www.ascii-code.com/
    public static boolean isASCIIVisible(CharSequence text) {
        return text.codePoints().allMatch(c -> c > 31 && c < 127);
    }

}
