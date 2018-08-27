package com.p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.overlay.zzc;
import p000.aoe.C0656a;

/* renamed from: ain */
public class ain implements Creator<zzc> {
    /* renamed from: a */
    public static void m1716a(zzc zzc, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzc.f14458a, false);
        aof.m4655a(parcel, 3, zzc.f14459b, false);
        aof.m4655a(parcel, 4, zzc.f14460c, false);
        aof.m4655a(parcel, 5, zzc.f14461d, false);
        aof.m4655a(parcel, 6, zzc.f14462e, false);
        aof.m4655a(parcel, 7, zzc.f14463f, false);
        aof.m4655a(parcel, 8, zzc.f14464g, false);
        aof.m4652a(parcel, 9, zzc.f14465h, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzc m1717a(Parcel parcel) {
        Intent intent = null;
        int b = aoe.m4623b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str7 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    str6 = aoe.m4635k(parcel, a);
                    break;
                case 4:
                    str5 = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 6:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 9:
                    intent = (Intent) aoe.m4620a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzc(str7, str6, str5, str4, str3, str2, str, intent);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzc[] m1718a(int i) {
        return new zzc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1717a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m1718a(i);
    }
}
