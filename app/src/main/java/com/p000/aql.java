package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.zzc;
import p000.aoe.C0656a;

/* renamed from: aql */
public class aql implements Creator<zzc> {
    /* renamed from: a */
    public static void m4948a(zzc zzc, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, zzc.f14815a, false);
        aof.m4648a(parcel, 2, zzc.f14816b);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzc m4949a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzc(str, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzc[] m4950a(int i) {
        return new zzc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4949a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4950a(i);
    }
}
