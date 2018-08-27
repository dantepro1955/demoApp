package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzo;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bqk */
public class bqk implements Creator<LocationSettingsRequest> {
    /* renamed from: a */
    public static void m10410a(LocationSettingsRequest locationSettingsRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4669c(parcel, 1, locationSettingsRequest.m19708a(), false);
        aof.m4658a(parcel, 2, locationSettingsRequest.m19709b());
        aof.m4658a(parcel, 3, locationSettingsRequest.m19710c());
        aof.m4652a(parcel, 5, locationSettingsRequest.m19711d(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationSettingsRequest m10411a(Parcel parcel) {
        zzo zzo = null;
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    list = aoe.m4626c(parcel, a, LocationRequest.CREATOR);
                    break;
                case 2:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    zzo = (zzo) aoe.m4620a(parcel, a, zzo.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationSettingsRequest(list, z2, z, zzo);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationSettingsRequest[] m10412a(int i) {
        return new LocationSettingsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10411a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10412a(i);
    }
}
