package com.p000;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.lib.network.model.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p000.bpf.C1392b;

/* renamed from: bpn */
public class bpn implements C1392b {
    /* renamed from: a */
    static Boolean f7378a = null;
    /* renamed from: c */
    private static final Charset f7379c = Charset.forName(Utf8Charset.NAME);
    /* renamed from: b */
    final C1402a f7380b;

    /* renamed from: bpn$a */
    static class C1402a {
        /* renamed from: a */
        final ContentResolver f7374a;

        C1402a(Context context) {
            if (context == null || !C1402a.m10343a(context)) {
                this.f7374a = null;
                return;
            }
            this.f7374a = context.getContentResolver();
            awh.m6154b(this.f7374a, "gms:playlog:service:sampling_");
        }

        /* renamed from: a */
        private static boolean m10343a(Context context) {
            if (bpn.f7378a == null) {
                bpn.f7378a = Boolean.valueOf(ato.m5611b(context).m5604a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            return bpn.f7378a.booleanValue();
        }

        /* renamed from: a */
        long m10344a() {
            return this.f7374a == null ? 0 : awh.m6146a(this.f7374a, "android_id", 0);
        }

        /* renamed from: a */
        String m10345a(String str) {
            if (this.f7374a == null) {
                return null;
            }
            ContentResolver contentResolver = this.f7374a;
            String valueOf = String.valueOf("gms:playlog:service:sampling_");
            String valueOf2 = String.valueOf(str);
            return awh.m6148a(contentResolver, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null);
        }
    }

    /* renamed from: bpn$b */
    static class C1403b {
        /* renamed from: a */
        public final String f7375a;
        /* renamed from: b */
        public final long f7376b;
        /* renamed from: c */
        public final long f7377c;

        public C1403b(String str, long j, long j2) {
            this.f7375a = str;
            this.f7376b = j;
            this.f7377c = j2;
        }
    }

    public bpn() {
        this(new C1402a(null));
    }

    public bpn(Context context) {
        this(new C1402a(context));
    }

    bpn(C1402a c1402a) {
        this.f7380b = (C1402a) aoi.m4679a((Object) c1402a);
    }

    /* renamed from: a */
    static long m10346a(long j) {
        return bpk.m10320a(ByteBuffer.allocate(8).putLong(j).array());
    }

    /* renamed from: a */
    static long m10347a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return bpn.m10346a(j);
        }
        byte[] bytes = str.getBytes(f7379c);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return bpk.m10320a(allocate.array());
    }

    /* renamed from: a */
    static C1403b m10348a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            str2 = "LogSamplerImpl";
            String str3 = "Failed to parse the rule: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new C1403b(str2, parseLong, parseLong2);
            }
            Log.e("LogSamplerImpl", "negative values not supported: " + parseLong + Constants.SEP + parseLong2);
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            str3 = "LogSamplerImpl";
            String str4 = "parseLong() failed while parsing: ";
            valueOf = String.valueOf(str);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m10349a(long j, long j2, long j3) {
        if (j2 >= 0 && j3 >= 0) {
            return j3 > 0 && bpp.m10354a(j, j3) < j2;
        } else {
            throw new IllegalArgumentException("negative values not supported: " + j2 + Constants.SEP + j3);
        }
    }

    /* renamed from: a */
    public boolean mo1394a(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str == null) {
            return true;
        }
        long a = this.f7380b.m10344a();
        C1403b a2 = bpn.m10348a(this.f7380b.m10345a(str));
        return a2 != null ? bpn.m10349a(bpn.m10347a(a2.f7375a, a), a2.f7376b, a2.f7377c) : true;
    }
}
