package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzasm;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bqd */
public class bqd implements Creator<GeofencingRequest> {
    /* renamed from: a */
    public static void m10392a(GeofencingRequest geofencingRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4669c(parcel, 1, geofencingRequest.m19699a(), false);
        aof.m4648a(parcel, 2, geofencingRequest.m19700b());
        aof.m4655a(parcel, 3, geofencingRequest.m19701c(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public GeofencingRequest m10393a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        List list = null;
        int i = 0;
        String str = "";
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    list = aoe.m4626c(parcel, a, zzasm.CREATOR);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    str = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GeofencingRequest(list, i, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GeofencingRequest[] m10394a(int i) {
        return new GeofencingRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10393a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10394a(i);
    }
}
