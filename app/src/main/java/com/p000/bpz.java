package com.p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bpz */
public class bpz implements Creator<ActivityRecognitionResult> {
    /* renamed from: a */
    public static void m10379a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4669c(parcel, 1, activityRecognitionResult.f15154a, false);
        aof.m4649a(parcel, 2, activityRecognitionResult.f15155b);
        aof.m4649a(parcel, 3, activityRecognitionResult.f15156c);
        aof.m4648a(parcel, 4, activityRecognitionResult.f15157d);
        aof.m4650a(parcel, 5, activityRecognitionResult.f15158e, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public ActivityRecognitionResult m10380a(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        long j2 = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    list = aoe.m4626c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = aoe.m4631g(parcel, a);
                    break;
                case 3:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(list, j2, j, i, bundle);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ActivityRecognitionResult[] m10381a(int i) {
        return new ActivityRecognitionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10380a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10381a(i);
    }
}
