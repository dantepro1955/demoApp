package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import p000.aoe.C0656a;

/* renamed from: bql */
public class bql implements Creator<LocationSettingsResult> {
    /* renamed from: a */
    public static void m10413a(LocationSettingsResult locationSettingsResult, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, locationSettingsResult.mo325b(), i, false);
        aof.m4652a(parcel, 2, locationSettingsResult.m19712a(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationSettingsResult m10414a(Parcel parcel) {
        LocationSettingsStates locationSettingsStates = null;
        int b = aoe.m4623b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            Status status2;
            LocationSettingsStates locationSettingsStates2;
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    LocationSettingsStates locationSettingsStates3 = locationSettingsStates;
                    status2 = (Status) aoe.m4620a(parcel, a, Status.CREATOR);
                    locationSettingsStates2 = locationSettingsStates3;
                    break;
                case 2:
                    locationSettingsStates2 = (LocationSettingsStates) aoe.m4620a(parcel, a, LocationSettingsStates.CREATOR);
                    status2 = status;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    locationSettingsStates2 = locationSettingsStates;
                    status2 = status;
                    break;
            }
            status = status2;
            locationSettingsStates = locationSettingsStates2;
        }
        if (parcel.dataPosition() == b) {
            return new LocationSettingsResult(status, locationSettingsStates);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationSettingsResult[] m10415a(int i) {
        return new LocationSettingsResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10414a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10415a(i);
    }
}
