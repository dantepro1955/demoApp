package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzzm;
import com.google.android.gms.internal.zzzu;
import p000.aoe.C0656a;

/* renamed from: bph */
public class bph implements Creator<zzzm> {
    /* renamed from: a */
    public static void m10290a(zzzm zzzm, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 2, zzzm.f15135a, i, false);
        aof.m4659a(parcel, 3, zzzm.f15136b, false);
        aof.m4660a(parcel, 4, zzzm.f15137c, false);
        aof.m4662a(parcel, 5, zzzm.f15138d, false);
        aof.m4660a(parcel, 6, zzzm.f15139e, false);
        aof.m4663a(parcel, 7, zzzm.f15140f, false);
        aof.m4658a(parcel, 8, zzzm.f15141g);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzzm m10291a(Parcel parcel) {
        byte[][] bArr = null;
        int b = aoe.m4623b(parcel);
        boolean z = true;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        zzzu zzzu = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    zzzu = (zzzu) aoe.m4620a(parcel, a, zzzu.CREATOR);
                    break;
                case 3:
                    bArr2 = aoe.m4638n(parcel, a);
                    break;
                case 4:
                    iArr2 = aoe.m4640p(parcel, a);
                    break;
                case 5:
                    strArr = aoe.m4641q(parcel, a);
                    break;
                case 6:
                    iArr = aoe.m4640p(parcel, a);
                    break;
                case 7:
                    bArr = aoe.m4639o(parcel, a);
                    break;
                case 8:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzzm(zzzu, bArr2, iArr2, strArr, iArr, bArr, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzzm[] m10292a(int i) {
        return new zzzm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10291a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10292a(i);
    }
}
