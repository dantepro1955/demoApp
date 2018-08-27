package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzqh;
import p000.aoe.C0656a;

/* renamed from: bla */
public class bla implements Creator<zzqh> {
    /* renamed from: a */
    public static void m9313a(zzqh zzqh, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzqh.f15121a, false);
        aof.m4648a(parcel, 3, zzqh.f15122b);
        aof.m4648a(parcel, 4, zzqh.f15123c);
        aof.m4658a(parcel, 5, zzqh.f15124d);
        aof.m4658a(parcel, 6, zzqh.f15125e);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzqh m9314a(Parcel parcel) {
        boolean z = false;
        int b = aoe.m4623b(parcel);
        String str = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzqh(str, i2, i, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzqh[] m9315a(int i) {
        return new zzqh[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9314a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9315a(i);
    }
}
