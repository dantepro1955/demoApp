package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzhc;
import p000.aoe.C0656a;

/* renamed from: bca */
public class bca implements Creator<zzhc> {
    /* renamed from: a */
    public static void m7399a(zzhc zzhc, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzhc.f14961a);
        aof.m4658a(parcel, 2, zzhc.f14962b);
        aof.m4648a(parcel, 3, zzhc.f14963c);
        aof.m4658a(parcel, 4, zzhc.f14964d);
        aof.m4648a(parcel, 5, zzhc.f14965e);
        aof.m4652a(parcel, 6, zzhc.f14966f, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzhc m7400a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        zzft zzft = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 6:
                    zzft = (zzft) aoe.m4620a(parcel, a, zzft.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzhc(i3, z2, i2, z, i, zzft);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzhc[] m7401a(int i) {
        return new zzhc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7400a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7401a(i);
    }
}
