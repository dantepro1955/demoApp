package com.p000;

import android.os.Parcel;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.internal.zzec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@bhd
/* renamed from: bea */
class bea {
    /* renamed from: a */
    final zzec f5739a;
    /* renamed from: b */
    final String f5740b;
    /* renamed from: c */
    final int f5741c;

    bea(bdx bdx) {
        this(bdx.m7696a(), bdx.m7700c(), bdx.m7699b());
    }

    bea(zzec zzec, String str, int i) {
        this.f5739a = zzec;
        this.f5740b = str;
        this.f5741c = i;
    }

    /* renamed from: a */
    static bea m7749a(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), Utf8Charset.NAME);
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            bea bea = new bea((zzec) zzec.CREATOR.createFromParcel(obtain), str2, parseInt);
            obtain.recycle();
            return bea;
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    String m7750a() {
        Parcel obtain = Parcel.obtain();
        String encodeToString;
        try {
            encodeToString = Base64.encodeToString(this.f5740b.getBytes(Utf8Charset.NAME), 0);
            String num = Integer.toString(this.f5741c);
            this.f5739a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            encodeToString = new StringBuilder(((String.valueOf(encodeToString).length() + 2) + String.valueOf(num).length()) + String.valueOf(encodeToString2).length()).append(encodeToString).append("\u0000").append(num).append("\u0000").append(encodeToString2).toString();
            return encodeToString;
        } catch (UnsupportedEncodingException e) {
            encodeToString = "QueueSeed encode failed because UTF-8 is not available.";
            bky.m9008c(encodeToString);
            return "";
        } finally {
            obtain.recycle();
        }
    }
}
