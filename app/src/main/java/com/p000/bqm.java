package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsStates;
import p000.aoe.C0656a;

/* renamed from: bqm */
public class bqm implements Creator<LocationSettingsStates> {
    /* renamed from: a */
    public static void m10416a(LocationSettingsStates locationSettingsStates, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 1, locationSettingsStates.m19714a());
        aof.m4658a(parcel, 2, locationSettingsStates.m19716c());
        aof.m4658a(parcel, 3, locationSettingsStates.m19718e());
        aof.m4658a(parcel, 4, locationSettingsStates.m19715b());
        aof.m4658a(parcel, 5, locationSettingsStates.m19717d());
        aof.m4658a(parcel, 6, locationSettingsStates.m19719f());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationSettingsStates m10417a(Parcel parcel) {
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    z6 = aoe.m4627c(parcel, a);
                    break;
                case 2:
                    z5 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    z4 = aoe.m4627c(parcel, a);
                    break;
                case 4:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    z = aoe.m4627c(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationSettingsStates(z6, z5, z4, z3, z2, z);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationSettingsStates[] m10418a(int i) {
        return new LocationSettingsStates[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10417a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10418a(i);
    }
}
