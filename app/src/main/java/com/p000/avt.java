package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbaw;
import p000.aoe.C0656a;

/* renamed from: avt */
public class avt implements Creator<zzbaw> {
    /* renamed from: a */
    public static void m6059a(zzbaw zzbaw, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzbaw.f14902a);
        aof.m4652a(parcel, 2, zzbaw.m19657a(), i, false);
        aof.m4652a(parcel, 3, zzbaw.m19658b(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzbaw m6060a(Parcel parcel) {
        zzaf zzaf = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < b) {
            ConnectionResult connectionResult2;
            int e;
            zzaf zzaf2;
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    zzaf zzaf3 = zzaf;
                    connectionResult2 = connectionResult;
                    e = aoe.m4629e(parcel, a);
                    zzaf2 = zzaf3;
                    break;
                case 2:
                    e = i;
                    ConnectionResult connectionResult3 = (ConnectionResult) aoe.m4620a(parcel, a, ConnectionResult.CREATOR);
                    zzaf2 = zzaf;
                    connectionResult2 = connectionResult3;
                    break;
                case 3:
                    zzaf2 = (zzaf) aoe.m4620a(parcel, a, zzaf.CREATOR);
                    connectionResult2 = connectionResult;
                    e = i;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    zzaf2 = zzaf;
                    connectionResult2 = connectionResult;
                    e = i;
                    break;
            }
            i = e;
            connectionResult = connectionResult2;
            zzaf = zzaf2;
        }
        if (parcel.dataPosition() == b) {
            return new zzbaw(i, connectionResult, zzaf);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzbaw[] m6061a(int i) {
        return new zzbaw[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6060a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6061a(i);
    }
}
