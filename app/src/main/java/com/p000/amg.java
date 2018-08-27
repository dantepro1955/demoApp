package com.p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import p000.aoe.C0656a;

/* renamed from: amg */
public class amg implements Creator<ProxyResponse> {
    /* renamed from: a */
    public static void m2565a(ProxyResponse proxyResponse, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, proxyResponse.f14687b);
        aof.m4652a(parcel, 2, proxyResponse.f14688c, i, false);
        aof.m4648a(parcel, 3, proxyResponse.f14689d);
        aof.m4650a(parcel, 4, proxyResponse.f14690e, false);
        aof.m4659a(parcel, 5, proxyResponse.f14691f, false);
        aof.m4648a(parcel, 1000, proxyResponse.f14686a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public ProxyResponse m2566a(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        Bundle bundle = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) aoe.m4620a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 3:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                case 5:
                    bArr = aoe.m4638n(parcel, a);
                    break;
                case 1000:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProxyResponse(i3, i2, pendingIntent, i, bundle, bArr);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ProxyResponse[] m2567a(int i) {
        return new ProxyResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2566a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2567a(i);
    }
}
