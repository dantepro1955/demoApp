package com.p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzds;
import p000.aoe.C0656a;

/* renamed from: ayz */
public class ayz implements Creator<zzds> {
    /* renamed from: a */
    public static void m6685a(zzds zzds, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzds.f14906a, false);
        aof.m4649a(parcel, 3, zzds.f14907b);
        aof.m4655a(parcel, 4, zzds.f14908c, false);
        aof.m4655a(parcel, 5, zzds.f14909d, false);
        aof.m4655a(parcel, 6, zzds.f14910e, false);
        aof.m4650a(parcel, 7, zzds.f14911f, false);
        aof.m4658a(parcel, 8, zzds.f14912g);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzds m6686a(Parcel parcel) {
        Bundle bundle = null;
        int b = aoe.m4623b(parcel);
        long j = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 6:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    bundle = aoe.m4637m(parcel, a);
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
            return new zzds(str4, j, str3, str2, str, bundle, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzds[] m6687a(int i) {
        return new zzds[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6686a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6687a(i);
    }
}
