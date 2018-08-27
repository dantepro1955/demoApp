package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;
import p000.aoe.C0656a;

/* renamed from: bqg */
public class bqg implements Creator<LocationAvailability> {
    /* renamed from: a */
    public static void m10398a(LocationAvailability locationAvailability, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, locationAvailability.f15167a);
        aof.m4648a(parcel, 2, locationAvailability.f15168b);
        aof.m4649a(parcel, 3, locationAvailability.f15169c);
        aof.m4648a(parcel, 4, locationAvailability.f15170d);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationAvailability m10399a(Parcel parcel) {
        int i = 1;
        int b = aoe.m4623b(parcel);
        int i2 = 1000;
        long j = 0;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationAvailability(i2, i3, i, j);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationAvailability[] m10400a(int i) {
        return new LocationAvailability[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10399a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10400a(i);
    }
}
