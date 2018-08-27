package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzft;
import p000.aoe.C0656a;

/* renamed from: bar */
public class bar implements Creator<zzft> {
    /* renamed from: a */
    public static void m7041a(zzft zzft, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 2, zzft.f14958a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzft m7042a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzft(z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzft[] m7043a(int i) {
        return new zzft[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7042a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7043a(i);
    }
}
