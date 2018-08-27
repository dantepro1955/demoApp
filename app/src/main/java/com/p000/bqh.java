package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.time.Clock;
import com.google.android.gms.location.LocationRequest;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import p000.aoe.C0656a;

/* renamed from: bqh */
public class bqh implements Creator<LocationRequest> {
    /* renamed from: a */
    public static void m10401a(LocationRequest locationRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, locationRequest.f15171a);
        aof.m4649a(parcel, 2, locationRequest.f15172b);
        aof.m4649a(parcel, 3, locationRequest.f15173c);
        aof.m4658a(parcel, 4, locationRequest.f15174d);
        aof.m4649a(parcel, 5, locationRequest.f15175e);
        aof.m4648a(parcel, 6, locationRequest.f15176f);
        aof.m4647a(parcel, 7, locationRequest.f15177g);
        aof.m4649a(parcel, 8, locationRequest.f15178h);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public LocationRequest m10402a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Clock.MAX_TIME;
        int i2 = MoPubClientPositioning.NO_REPEAT;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 3:
                    j2 = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    j3 = aoe.m4631g(parcel, a);
                    break;
                case 6:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 7:
                    f = aoe.m4633i(parcel, a);
                    break;
                case 8:
                    j4 = aoe.m4631g(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LocationRequest[] m10403a(int i) {
        return new LocationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10402a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10403a(i);
    }
}
