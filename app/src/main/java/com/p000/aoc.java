package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import p000.aoe.C0656a;

/* renamed from: aoc */
public class aoc implements Creator<Scope> {
    /* renamed from: a */
    public static void m4611a(Scope scope, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, scope.f14759a);
        aof.m4655a(parcel, 2, scope.m19513a(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public Scope m4612a(Parcel parcel) {
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
            return new Scope(i, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public Scope[] m4613a(int i) {
        return new Scope[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4612a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4613a(i);
    }
}
