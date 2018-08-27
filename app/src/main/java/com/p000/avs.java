package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbau;
import p000.aoe.C0656a;

/* renamed from: avs */
public class avs implements Creator<zzbau> {
    /* renamed from: a */
    public static void m6056a(zzbau zzbau, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzbau.f14900a);
        aof.m4652a(parcel, 2, zzbau.m19656a(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzbau m6057a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        zzad zzad = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    zzad = (zzad) aoe.m4620a(parcel, a, zzad.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzbau(i, zzad);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzbau[] m6058a(int i) {
        return new zzbau[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6057a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6058a(i);
    }
}
