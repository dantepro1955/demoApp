package com.p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzasi;
import com.google.android.gms.internal.zzask;
import p000.aoe.C0656a;

/* renamed from: auv */
public class auv implements Creator<zzask> {
    /* renamed from: a */
    public static void m5896a(zzask zzask, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzask.f14875a);
        aof.m4652a(parcel, 2, zzask.f14876b, i, false);
        aof.m4651a(parcel, 3, zzask.m19633a(), false);
        aof.m4652a(parcel, 4, zzask.f14878d, i, false);
        aof.m4651a(parcel, 5, zzask.m19634b(), false);
        aof.m4651a(parcel, 6, zzask.m19635c(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzask m5897a(Parcel parcel) {
        IBinder iBinder = null;
        int b = aoe.m4623b(parcel);
        int i = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        zzasi zzasi = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    zzasi = (zzasi) aoe.m4620a(parcel, a, zzasi.CREATOR);
                    break;
                case 3:
                    iBinder3 = aoe.m4636l(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) aoe.m4620a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = aoe.m4636l(parcel, a);
                    break;
                case 6:
                    iBinder = aoe.m4636l(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzask(i, zzasi, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzask[] m5898a(int i) {
        return new zzask[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5897a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5898a(i);
    }
}
