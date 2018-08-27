package com.p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import p000.aoe.C0656a;

/* renamed from: ajh */
public class ajh implements Creator<GInAppPurchaseManagerInfoParcel> {
    /* renamed from: a */
    public static void m1850a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4651a(parcel, 3, gInAppPurchaseManagerInfoParcel.m19359b(), false);
        aof.m4651a(parcel, 4, gInAppPurchaseManagerInfoParcel.m19360c(), false);
        aof.m4651a(parcel, 5, gInAppPurchaseManagerInfoParcel.m19361d(), false);
        aof.m4651a(parcel, 6, gInAppPurchaseManagerInfoParcel.m19358a(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public GInAppPurchaseManagerInfoParcel m1851a(Parcel parcel) {
        IBinder iBinder = null;
        int b = aoe.m4623b(parcel);
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 3:
                    iBinder4 = aoe.m4636l(parcel, a);
                    break;
                case 4:
                    iBinder3 = aoe.m4636l(parcel, a);
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
            return new GInAppPurchaseManagerInfoParcel(iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GInAppPurchaseManagerInfoParcel[] m1852a(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1851a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m1852a(i);
    }
}
