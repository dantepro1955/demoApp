package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzoo;
import p000.aoe.C0656a;

/* renamed from: bjh */
public class bjh implements Creator<zzoo> {
    /* renamed from: a */
    public static void m8862a(zzoo zzoo, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzoo.f15114a, false);
        aof.m4648a(parcel, 3, zzoo.f15115b);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzoo m8863a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzoo(str, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzoo[] m8864a(int i) {
        return new zzoo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8863a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8864a(i);
    }
}
