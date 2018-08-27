package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzaqk;
import p000.aoe.C0656a;

/* renamed from: auf */
public class auf implements Creator<zzaqk> {
    /* renamed from: a */
    public static void m5751a(zzaqk zzaqk, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzaqk.f14861a);
        aof.m4659a(parcel, 2, zzaqk.m19628a(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzaqk m5752a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    bArr = aoe.m4638n(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzaqk(i, bArr);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzaqk[] m5753a(int i) {
        return new zzaqk[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5752a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5753a(i);
    }
}
