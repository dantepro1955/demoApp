package com.p000;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzfp;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: azk */
public class azk implements Creator<zzec> {
    /* renamed from: a */
    public static void m6727a(zzec zzec, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzec.f14913a);
        aof.m4649a(parcel, 2, zzec.f14914b);
        aof.m4650a(parcel, 3, zzec.f14915c, false);
        aof.m4648a(parcel, 4, zzec.f14916d);
        aof.m4667b(parcel, 5, zzec.f14917e, false);
        aof.m4658a(parcel, 6, zzec.f14918f);
        aof.m4648a(parcel, 7, zzec.f14919g);
        aof.m4658a(parcel, 8, zzec.f14920h);
        aof.m4655a(parcel, 9, zzec.f14921i, false);
        aof.m4652a(parcel, 10, zzec.f14922j, i, false);
        aof.m4652a(parcel, 11, zzec.f14923k, i, false);
        aof.m4655a(parcel, 12, zzec.f14924l, false);
        aof.m4650a(parcel, 13, zzec.f14925m, false);
        aof.m4650a(parcel, 14, zzec.f14926n, false);
        aof.m4667b(parcel, 15, zzec.f14927o, false);
        aof.m4655a(parcel, 16, zzec.f14928p, false);
        aof.m4655a(parcel, 17, zzec.f14929q, false);
        aof.m4658a(parcel, 18, zzec.f14930r);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzec m6728a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        zzfp zzfp = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 3:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                case 4:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    list = aoe.m4643s(parcel, a);
                    break;
                case 6:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 7:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 8:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 9:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 10:
                    zzfp = (zzfp) aoe.m4620a(parcel, a, zzfp.CREATOR);
                    break;
                case 11:
                    location = (Location) aoe.m4620a(parcel, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 13:
                    bundle2 = aoe.m4637m(parcel, a);
                    break;
                case 14:
                    bundle3 = aoe.m4637m(parcel, a);
                    break;
                case 15:
                    list2 = aoe.m4643s(parcel, a);
                    break;
                case 16:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 17:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 18:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzec(i, j, bundle, i2, list, z, i3, z2, str, zzfp, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzec[] m6729a(int i) {
        return new zzec[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6728a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6729a(i);
    }
}
