package com.p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.zzg;
import p000.aoe.C0656a;

/* renamed from: amp */
public class amp implements Creator<zzg> {
    /* renamed from: a */
    public static void m2724a(zzg zzg, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzg.f14745a);
        aof.m4648a(parcel, 2, zzg.m19501a());
        aof.m4650a(parcel, 3, zzg.m19502b(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzg m2725a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzg(i2, i, bundle);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzg[] m2726a(int i) {
        return new zzg[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2725a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2726a(i);
    }
}
