package com.p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import p000.aoe.C0656a;

/* renamed from: aod */
public class aod implements Creator<Status> {
    /* renamed from: a */
    public static void m4614a(Status status, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, status.m19520f());
        aof.m4655a(parcel, 2, status.m19517c(), false);
        aof.m4652a(parcel, 3, status.m19514a(), i, false);
        aof.m4648a(parcel, 1000, status.f14768h);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public Status m4615a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) aoe.m4620a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Status(i2, i, str, pendingIntent);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public Status[] m4616a(int i) {
        return new Status[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4615a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4616a(i);
    }
}
