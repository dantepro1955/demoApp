package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzarw;
import com.google.android.gms.internal.zzasi;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: auu */
public class auu implements Creator<zzasi> {
    /* renamed from: a */
    public static void m5893a(zzasi zzasi, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, zzasi.f14869b, i, false);
        aof.m4669c(parcel, 5, zzasi.f14870c, false);
        aof.m4655a(parcel, 6, zzasi.f14871d, false);
        aof.m4658a(parcel, 7, zzasi.f14872e);
        aof.m4658a(parcel, 8, zzasi.f14873f);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzasi m5894a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = aoe.m4623b(parcel);
        List list = zzasi.f14868a;
        boolean z2 = false;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    locationRequest = (LocationRequest) aoe.m4620a(parcel, a, LocationRequest.CREATOR);
                    break;
                case 5:
                    list = aoe.m4626c(parcel, a, zzarw.CREATOR);
                    break;
                case 6:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    z2 = aoe.m4627c(parcel, a);
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
            return new zzasi(locationRequest, list, str, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzasi[] m5895a(int i) {
        return new zzasi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5894a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5895a(i);
    }
}
