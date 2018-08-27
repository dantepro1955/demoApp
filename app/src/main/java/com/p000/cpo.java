package com.p000;

import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;

/* compiled from: Base64Helper */
/* renamed from: cpo */
public class cpo {
    /* renamed from: a */
    public static String m24310a(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m24311b(String str) {
        try {
            return new String(Base64.decode(str, 0), Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
