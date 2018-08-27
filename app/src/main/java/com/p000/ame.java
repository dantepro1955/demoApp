package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.zza;
import p000.aoe.C0656a;

/* renamed from: ame */
public class ame implements Creator<zza> {
    /* renamed from: a */
    public static void m2559a(zza zza, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, zza.f14693b, false);
        aof.m4648a(parcel, 2, zza.f14694c);
        aof.m4649a(parcel, 3, zza.f14695d);
        aof.m4659a(parcel, 4, zza.f14696e, false);
        aof.m4655a(parcel, 5, zza.f14697f, false);
        aof.m4648a(parcel, 1000, zza.f14692a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zza m2560a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = aoe.m4623b(parcel);
        long j = 0;
        byte[] bArr = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    bArr = aoe.m4638n(parcel, a);
                    break;
                case 5:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 1000:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zza(i2, str2, i, j, bArr, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zza[] m2561a(int i) {
        return new zza[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2560a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2561a(i);
    }
}
