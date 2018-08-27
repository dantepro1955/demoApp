package com.p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzbar;
import p000.aoe.C0656a;

/* renamed from: avq */
public class avq implements Creator<zzbar> {
    /* renamed from: a */
    public static void m6041a(zzbar zzbar, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzbar.f14896a);
        aof.m4652a(parcel, 2, zzbar.m19653a(), i, false);
        aof.m4661a(parcel, 3, zzbar.m19654b(), i, false);
        aof.m4655a(parcel, 4, zzbar.m19655c(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzbar m6042a(Parcel parcel) {
        String str = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            Scope[] scopeArr2;
            Account account2;
            int e;
            String str2;
            int a = aoe.m4618a(parcel);
            String str3;
            switch (aoe.m4617a(a)) {
                case 1:
                    str3 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = aoe.m4629e(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    e = i;
                    Scope[] scopeArr3 = scopeArr;
                    account2 = (Account) aoe.m4620a(parcel, a, Account.CREATOR);
                    str2 = str;
                    scopeArr2 = scopeArr3;
                    break;
                case 3:
                    account2 = account;
                    e = i;
                    str3 = str;
                    scopeArr2 = (Scope[]) aoe.m4625b(parcel, a, Scope.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = aoe.m4635k(parcel, a);
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = i;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    str2 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = i;
                    break;
            }
            i = e;
            account = account2;
            scopeArr = scopeArr2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new zzbar(i, account, scopeArr, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzbar[] m6043a(int i) {
        return new zzbar[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6042a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6043a(i);
    }
}
