package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzeg;
import p000.aoe.C0656a;

/* renamed from: azm */
public class azm implements Creator<zzeg> {
    /* renamed from: a */
    public static void m6732a(zzeg zzeg, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzeg.f14931a, false);
        aof.m4648a(parcel, 3, zzeg.f14932b);
        aof.m4648a(parcel, 4, zzeg.f14933c);
        aof.m4658a(parcel, 5, zzeg.f14934d);
        aof.m4648a(parcel, 6, zzeg.f14935e);
        aof.m4648a(parcel, 7, zzeg.f14936f);
        aof.m4661a(parcel, 8, zzeg.f14937g, i, false);
        aof.m4658a(parcel, 9, zzeg.f14938h);
        aof.m4658a(parcel, 10, zzeg.f14939i);
        aof.m4658a(parcel, 11, zzeg.f14940j);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzeg m6733a(Parcel parcel) {
        zzeg[] zzegArr = null;
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    i4 = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    z4 = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 7:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 8:
                    zzegArr = (zzeg[]) aoe.m4625b(parcel, a, zzeg.CREATOR);
                    break;
                case 9:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                case 10:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 11:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzeg(str, i4, i3, z4, i2, i, zzegArr, z3, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzeg[] m6734a(int i) {
        return new zzeg[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6733a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6734a(i);
    }
}
