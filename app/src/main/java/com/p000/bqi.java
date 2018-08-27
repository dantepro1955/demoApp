package com.p000;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bqi */
public class bqi implements Creator<LocationResult> {
    /* renamed from: a */
    public static void m10404a(LocationResult locationResult, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4669c(parcel, 1, locationResult.m19705a(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationResult m10405a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        List list = LocationResult.f15179a;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    list = aoe.m4626c(parcel, a, Location.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationResult(list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationResult[] m10406a(int i) {
        return new LocationResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10405a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10406a(i);
    }
}
