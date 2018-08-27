package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzmr;
import p000.aoe.C0656a;

/* renamed from: bhn */
public class bhn implements Creator<zzmr> {
    /* renamed from: a */
    public static void m8502a(zzmr zzmr, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 2, zzmr.f15103a);
        aof.m4658a(parcel, 3, zzmr.f15104b);
        aof.m4658a(parcel, 4, zzmr.f15105c);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzmr m8503a(Parcel parcel) {
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 4:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzmr(z3, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzmr[] m8504a(int i) {
        return new zzmr[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8503a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8504a(i);
    }
}
