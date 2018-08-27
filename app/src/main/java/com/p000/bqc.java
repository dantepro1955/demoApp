package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DetectedActivity;
import p000.aoe.C0656a;

/* renamed from: bqc */
public class bqc implements Creator<DetectedActivity> {
    /* renamed from: a */
    public static void m10389a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, detectedActivity.f15162d);
        aof.m4648a(parcel, 2, detectedActivity.f15163e);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public DetectedActivity m10390a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DetectedActivity(i2, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public DetectedActivity[] m10391a(int i) {
        return new DetectedActivity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10390a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10391a(i);
    }
}
