package com.flowersouth.feedbase.idlist;

import java.util.Arrays;

public class IDChars {

    private static final int MAXCHARSIZE = 256;
    private static final char[] LEGAL_CHARS = "plokmijnuhbygvtfcrdxeszwaqPLOKMIJNUHBYGVTFCRDXESZWAQ1234567890_-.".toCharArray();
    private static final boolean[] LEGAL_CHAR_MAP = new boolean[MAXCHARSIZE];
    private static final int[] charIndex = new int[MAXCHARSIZE];
    public static final int LEGAL_CHAR_SIZE = LEGAL_CHARS.length;

    static {
        Arrays.fill(charIndex, -1);
        for (int i = 0; i < LEGAL_CHARS.length; i++) {
            LEGAL_CHAR_MAP[LEGAL_CHARS[i]] = true;
            charIndex[LEGAL_CHARS[i]] = i;
        }
    }

    public static boolean validateIdChars(String feedId) {
        if (feedId == null || feedId.length() == 0) {
            return false;
        }
        char[] chars = feedId.toCharArray();
        for (char c : chars) {
            if (c >= MAXCHARSIZE) {
                return false;
            }
            if (!LEGAL_CHAR_MAP[c]) {
                return false;
            }
        }
        return true;
    }

    public static int getCharIdx(char c) {
        return charIndex[c];
    }

}
