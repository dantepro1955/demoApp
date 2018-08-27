package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.Map;

/* renamed from: bdv */
public class bdv {
    /* renamed from: a */
    public final int f5707a;
    /* renamed from: b */
    public final byte[] f5708b;
    /* renamed from: c */
    public final Map<String, String> f5709c;
    /* renamed from: d */
    public final boolean f5710d;
    /* renamed from: e */
    public final long f5711e;

    public bdv(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f5707a = i;
        this.f5708b = bArr;
        this.f5709c = map;
        this.f5710d = z;
        this.f5711e = j;
    }

    public bdv(byte[] bArr, Map<String, String> map) {
        this(HttpStatus.HTTP_OK, bArr, map, false, 0);
    }
}
