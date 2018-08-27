package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzn;
import p000.aoe.C0656a;

/* renamed from: akg */
public class akg implements Creator<zzn> {
    /* renamed from: a */
    public static void m2190a(zzn zzn, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 2, zzn.f14525a);
        aof.m4658a(parcel, 3, zzn.f14526b);
        aof.m4655a(parcel, 4, zzn.f14527c, false);
        aof.m4658a(parcel, 5, zzn.f14528d);
        aof.m4647a(parcel, 6, zzn.f14529e);
        aof.m4648a(parcel, 7, zzn.f14530f);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzn m2191a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        String str = null;
        float f = 0.0f;
        boolean z = false;
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
                    str = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    f = aoe.m4633i(parcel, a);
                    break;
                case 7:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzn(z3, z2, str, z, f, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzn[] m2192a(int i) {
        return new zzn[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2191a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2192a(i);
    }
}
