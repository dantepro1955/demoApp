package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzarz;
import p000.aoe.C0656a;

/* renamed from: aum */
public class aum implements Creator<zzarz> {
    /* renamed from: a */
    public static void m5787a(zzarz zzarz, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, zzarz.mo325b(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzarz m5788a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    status = (Status) aoe.m4620a(parcel, a, Status.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzarz(status);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzarz[] m5789a(int i) {
        return new zzarz[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5788a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5789a(i);
    }
}
