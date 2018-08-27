package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzarw;
import p000.aoe.C0656a;

/* renamed from: auj */
public class auj implements Creator<zzarw> {
    /* renamed from: a */
    public static void m5768a(zzarw zzarw, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzarw.f14864a);
        aof.m4655a(parcel, 2, zzarw.f14865b, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzarw m5769a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzarw(i, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzarw[] m5770a(int i) {
        return new zzarw[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5769a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5770a(i);
    }
}
