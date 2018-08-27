package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzan;
import p000.aoe.C0656a;

/* renamed from: aop */
public class aop implements Creator<zzan> {
    /* renamed from: a */
    public static void m4712a(zzan zzan, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzan.f14785a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzan m4713a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzan(i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzan[] m4714a(int i) {
        return new zzan[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4713a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4714a(i);
    }
}
