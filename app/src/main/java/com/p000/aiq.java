package com.p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.internal.zzqh;
import p000.aoe.C0656a;

/* renamed from: aiq */
public class aiq implements Creator<AdOverlayInfoParcel> {
    /* renamed from: a */
    public static void m1780a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 2, adOverlayInfoParcel.f14442a, i, false);
        aof.m4651a(parcel, 3, adOverlayInfoParcel.m19289a(), false);
        aof.m4651a(parcel, 4, adOverlayInfoParcel.m19290b(), false);
        aof.m4651a(parcel, 5, adOverlayInfoParcel.m19291c(), false);
        aof.m4651a(parcel, 6, adOverlayInfoParcel.m19292d(), false);
        aof.m4655a(parcel, 7, adOverlayInfoParcel.f14447f, false);
        aof.m4658a(parcel, 8, adOverlayInfoParcel.f14448g);
        aof.m4655a(parcel, 9, adOverlayInfoParcel.f14449h, false);
        aof.m4651a(parcel, 10, adOverlayInfoParcel.m19294f(), false);
        aof.m4648a(parcel, 11, adOverlayInfoParcel.f14451j);
        aof.m4648a(parcel, 12, adOverlayInfoParcel.f14452k);
        aof.m4655a(parcel, 13, adOverlayInfoParcel.f14453l, false);
        aof.m4652a(parcel, 14, adOverlayInfoParcel.f14454m, i, false);
        aof.m4651a(parcel, 15, adOverlayInfoParcel.m19293e(), false);
        aof.m4655a(parcel, 16, adOverlayInfoParcel.f14456o, false);
        aof.m4652a(parcel, 17, adOverlayInfoParcel.f14457p, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public AdOverlayInfoParcel m1781a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        zzqh zzqh = null;
        IBinder iBinder6 = null;
        String str4 = null;
        zzn zzn = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    zzc = (zzc) aoe.m4620a(parcel, a, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = aoe.m4636l(parcel, a);
                    break;
                case 4:
                    iBinder2 = aoe.m4636l(parcel, a);
                    break;
                case 5:
                    iBinder3 = aoe.m4636l(parcel, a);
                    break;
                case 6:
                    iBinder4 = aoe.m4636l(parcel, a);
                    break;
                case 7:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 9:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 10:
                    iBinder5 = aoe.m4636l(parcel, a);
                    break;
                case 11:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 12:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 13:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 14:
                    zzqh = (zzqh) aoe.m4620a(parcel, a, zzqh.CREATOR);
                    break;
                case 15:
                    iBinder6 = aoe.m4636l(parcel, a);
                    break;
                case 16:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 17:
                    zzn = (zzn) aoe.m4620a(parcel, a, zzn.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzqh, iBinder6, str4, zzn);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public AdOverlayInfoParcel[] m1782a(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1781a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m1782a(i);
    }
}
