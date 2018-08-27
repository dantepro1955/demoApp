package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzmy;
import p000.aoe.C0656a;

/* renamed from: bhs */
public class bhs implements Creator<zzmy> {
    /* renamed from: a */
    public static void m8533a(zzmy zzmy, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzmy.f15111a, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzmy m8534a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzmy(str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzmy[] m8535a(int i) {
        return new zzmy[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8534a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8535a(i);
    }
}
