package com.p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import p000.aoe.C0656a;

/* renamed from: aqk */
public class aqk implements Creator<ConnectionResult> {
    /* renamed from: a */
    public static void m4945a(ConnectionResult connectionResult, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, connectionResult.f14749b);
        aof.m4648a(parcel, 2, connectionResult.m19506c());
        aof.m4652a(parcel, 3, connectionResult.m19507d(), i, false);
        aof.m4655a(parcel, 4, connectionResult.m19508e(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public ConnectionResult m4946a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            PendingIntent pendingIntent2;
            int i3;
            String str2;
            int a = aoe.m4618a(parcel);
            String str3;
            switch (aoe.m4617a(a)) {
                case 1:
                    str3 = str;
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = aoe.m4629e(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    i = i2;
                    PendingIntent pendingIntent3 = pendingIntent;
                    i3 = aoe.m4629e(parcel, a);
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 3:
                    i3 = i;
                    i = i2;
                    str3 = str;
                    pendingIntent2 = (PendingIntent) aoe.m4620a(parcel, a, PendingIntent.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = aoe.m4635k(parcel, a);
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = i2;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    str2 = str;
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = i2;
                    break;
            }
            i2 = i;
            i = i3;
            pendingIntent = pendingIntent2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionResult(i2, i, pendingIntent, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ConnectionResult[] m4947a(int i) {
        return new ConnectionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4946a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4947a(i);
    }
}
