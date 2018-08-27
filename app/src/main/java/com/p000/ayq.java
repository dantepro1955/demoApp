package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.lang.Character.UnicodeBlock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

@bhd
/* renamed from: ayq */
public class ayq {
    /* renamed from: a */
    public static int m6638a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        return aqc.m4910a(bytes, 0, bytes.length, 0);
    }

    /* renamed from: a */
    static boolean m6639a(int i) {
        return Character.isLetter(i) && (ayq.m6640a(UnicodeBlock.of(i)) || ayq.m6644c(i));
    }

    /* renamed from: a */
    private static boolean m6640a(UnicodeBlock unicodeBlock) {
        return unicodeBlock == UnicodeBlock.BOPOMOFO || unicodeBlock == UnicodeBlock.BOPOMOFO_EXTENDED || unicodeBlock == UnicodeBlock.CJK_COMPATIBILITY || unicodeBlock == UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlock == UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || unicodeBlock == UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlock == UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlock == UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlock == UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || unicodeBlock == UnicodeBlock.HANGUL_JAMO || unicodeBlock == UnicodeBlock.HANGUL_SYLLABLES || unicodeBlock == UnicodeBlock.HIRAGANA || unicodeBlock == UnicodeBlock.KATAKANA || unicodeBlock == UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS;
    }

    /* renamed from: a */
    public static String[] m6641a(String str, boolean z) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] toCharArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4;
            int codePointAt = Character.codePointAt(toCharArray, i3);
            int charCount = Character.charCount(codePointAt);
            if (ayq.m6639a(codePointAt)) {
                if (i != 0) {
                    arrayList.add(new String(toCharArray, i2, i3 - i2));
                }
                arrayList.add(new String(toCharArray, i3, charCount));
                i = i2;
                i2 = 0;
            } else if (Character.isLetterOrDigit(codePointAt) || Character.getType(codePointAt) == 6 || Character.getType(codePointAt) == 8) {
                if (i == 0) {
                    i2 = i3;
                }
                i = i2;
                i2 = 1;
            } else if (z && Character.charCount(codePointAt) == 1 && Character.toChars(codePointAt)[0] == '\'') {
                if (i == 0) {
                    i2 = i3;
                }
                i = i2;
                i2 = 1;
            } else if (i != 0) {
                arrayList.add(new String(toCharArray, i2, i3 - i2));
                i = i2;
                i2 = 0;
            } else {
                i4 = i;
                i = i2;
                i2 = i4;
            }
            i3 += charCount;
            i4 = i2;
            i2 = i;
            i = i4;
        }
        if (i != 0) {
            arrayList.add(new String(toCharArray, i2, i3 - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public static byte[] m6642b(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        return allocate.array();
    }

    /* renamed from: b */
    public static String[] m6643b(String str) {
        return ayq.m6641a(str, false);
    }

    /* renamed from: c */
    private static boolean m6644c(int i) {
        return (i >= 65382 && i <= 65437) || (i >= 65441 && i <= 65500);
    }
}
