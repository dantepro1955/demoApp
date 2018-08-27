package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzoa;
import p000.aoe.C0656a;

/* renamed from: biv */
public class biv implements Creator<zzoa> {
    /* renamed from: a */
    public static void m8759a(zzoa zzoa, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 2, zzoa.f15112a, i, false);
        aof.m4655a(parcel, 3, zzoa.f15113b, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzoa m8760a(Parcel parcel) {
        String str = null;
        int b = aoe.m4623b(parcel);
        zzec zzec = null;
        while (parcel.dataPosition() < b) {
            zzec zzec2;
            String str2;
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    String str3 = str;
                    zzec2 = (zzec) aoe.m4620a(parcel, a, zzec.CREATOR);
                    str2 = str3;
                    break;
                case 3:
                    str2 = aoe.m4635k(parcel, a);
                    zzec2 = zzec;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    str2 = str;
                    zzec2 = zzec;
                    break;
            }
            zzec = zzec2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new zzoa(zzec, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzoa[] m8761a(int i) {
        return new zzoa[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8760a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8761a(i);
    }
}
