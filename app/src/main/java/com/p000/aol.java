package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzah;
import p000.aoe.C0656a;

/* renamed from: aol */
public class aol implements Creator<zzah> {
    /* renamed from: a */
    public static void m4698a(zzah zzah, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzah.f14781a);
        aof.m4648a(parcel, 2, zzah.m19529a());
        aof.m4648a(parcel, 3, zzah.m19530b());
        aof.m4661a(parcel, 4, zzah.m19531c(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzah m4699a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) aoe.m4625b(parcel, a, Scope.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzah(i3, i2, i, scopeArr);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzah[] m4700a(int i) {
        return new zzah[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4699a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4700a(i);
    }
}
