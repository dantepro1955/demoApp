package com.p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import p000.aoe.C0656a;

/* renamed from: amf */
public class amf implements Creator<ProxyRequest> {
    /* renamed from: a */
    public static void m2562a(ProxyRequest proxyRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, proxyRequest.f14681k, false);
        aof.m4648a(parcel, 2, proxyRequest.f14682l);
        aof.m4649a(parcel, 3, proxyRequest.f14683m);
        aof.m4659a(parcel, 4, proxyRequest.f14684n, false);
        aof.m4650a(parcel, 5, proxyRequest.f14685o, false);
        aof.m4648a(parcel, 1000, proxyRequest.f14680j);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public ProxyRequest m2563a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = aoe.m4623b(parcel);
        long j = 0;
        byte[] bArr = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    bArr = aoe.m4638n(parcel, a);
                    break;
                case 5:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                case 1000:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProxyRequest(i2, str, i, j, bArr, bundle);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ProxyRequest[] m2564a(int i) {
        return new ProxyRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2563a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2564a(i);
    }
}
