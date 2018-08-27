package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzfc;
import p000.aoe.C0656a;

/* renamed from: bah */
public class bah implements Creator<zzfc> {
    /* renamed from: a */
    public static void m6894a(zzfc zzfc, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 2, zzfc.f14943a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzfc m6895a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzfc(i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzfc[] m6896a(int i) {
        return new zzfc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6895a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6896a(i);
    }
}
