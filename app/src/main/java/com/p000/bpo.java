package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzzu;
import p000.aoe.C0656a;

/* renamed from: bpo */
public class bpo implements Creator<zzzu> {
    /* renamed from: a */
    public static void m10351a(zzzu zzzu, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzzu.f15145a, false);
        aof.m4648a(parcel, 3, zzzu.f15146b);
        aof.m4648a(parcel, 4, zzzu.f15147c);
        aof.m4655a(parcel, 5, zzzu.f15148d, false);
        aof.m4655a(parcel, 6, zzzu.f15149e, false);
        aof.m4658a(parcel, 7, zzzu.f15150f);
        aof.m4655a(parcel, 8, zzzu.f15151g, false);
        aof.m4658a(parcel, 9, zzzu.f15152h);
        aof.m4648a(parcel, 10, zzzu.f15153i);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzzu m10352a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 6:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 8:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 9:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 10:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzzu(str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzzu[] m10353a(int i) {
        return new zzzu[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10352a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10353a(i);
    }
}
