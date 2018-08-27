package com.p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import p000.aoe.C0656a;

/* renamed from: aok */
public class aok implements Creator<zzaf> {
    /* renamed from: a */
    public static void m4695a(zzaf zzaf, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzaf.f14776a);
        aof.m4651a(parcel, 2, zzaf.f14777b, false);
        aof.m4652a(parcel, 3, zzaf.m19526b(), i, false);
        aof.m4658a(parcel, 4, zzaf.m19527c());
        aof.m4658a(parcel, 5, zzaf.m19528d());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzaf m4696a(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    iBinder = aoe.m4636l(parcel, a);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) aoe.m4620a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzaf(i, iBinder, connectionResult, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzaf[] m4697a(int i) {
        return new zzaf[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4696a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4697a(i);
    }
}
