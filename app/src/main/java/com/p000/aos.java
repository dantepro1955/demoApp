package com.p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzd;
import p000.aoe.C0656a;

/* renamed from: aos */
public class aos implements Creator<zzd> {
    /* renamed from: a */
    public static void m4717a(zzd zzd, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzd.f14786a);
        aof.m4651a(parcel, 2, zzd.f14787b, false);
        aof.m4661a(parcel, 3, zzd.f14788c, i, false);
        aof.m4653a(parcel, 4, zzd.f14789d, false);
        aof.m4653a(parcel, 5, zzd.f14790e, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzd m4718a(Parcel parcel) {
        Integer num = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        Integer num2 = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    iBinder = aoe.m4636l(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) aoe.m4625b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num2 = aoe.m4630f(parcel, a);
                    break;
                case 5:
                    num = aoe.m4630f(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzd(i, iBinder, scopeArr, num2, num);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzd[] m4719a(int i) {
        return new zzd[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4718a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4719a(i);
    }
}
