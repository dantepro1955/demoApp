package com.p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;
import p000.aoe.C0656a;

/* renamed from: aox */
public class aox implements Creator<zzj> {
    /* renamed from: a */
    public static void m4772a(zzj zzj, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzj.f14791a);
        aof.m4648a(parcel, 2, zzj.f14792b);
        aof.m4648a(parcel, 3, zzj.f14793c);
        aof.m4655a(parcel, 4, zzj.f14794d, false);
        aof.m4651a(parcel, 5, zzj.f14795e, false);
        aof.m4661a(parcel, 6, zzj.f14796f, i, false);
        aof.m4650a(parcel, 7, zzj.f14797g, false);
        aof.m4652a(parcel, 8, zzj.f14798h, i, false);
        aof.m4661a(parcel, 10, zzj.f14799i, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzj m4773a(Parcel parcel) {
        int i = 0;
        zzc[] zzcArr = null;
        int b = aoe.m4623b(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    iBinder = aoe.m4636l(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) aoe.m4625b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = aoe.m4637m(parcel, a);
                    break;
                case 8:
                    account = (Account) aoe.m4620a(parcel, a, Account.CREATOR);
                    break;
                case 10:
                    zzcArr = (zzc[]) aoe.m4625b(parcel, a, zzc.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzj(i3, i2, i, str, iBinder, scopeArr, bundle, account, zzcArr);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzj[] m4774a(int i) {
        return new zzj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4773a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4774a(i);
    }
}
