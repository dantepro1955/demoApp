package com.p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zzad;
import p000.aoe.C0656a;

/* renamed from: aoj */
public class aoj implements Creator<zzad> {
    /* renamed from: a */
    public static void m4692a(zzad zzad, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzad.f14772a);
        aof.m4652a(parcel, 2, zzad.m19522a(), i, false);
        aof.m4648a(parcel, 3, zzad.m19523b());
        aof.m4652a(parcel, 4, zzad.m19524c(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzad m4693a(Parcel parcel) {
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int i3;
            Account account2;
            int e;
            GoogleSignInAccount googleSignInAccount2;
            int a = aoe.m4618a(parcel);
            GoogleSignInAccount googleSignInAccount3;
            switch (aoe.m4617a(a)) {
                case 1:
                    googleSignInAccount3 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    e = aoe.m4629e(parcel, a);
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 2:
                    e = i2;
                    int i4 = i;
                    account2 = (Account) aoe.m4620a(parcel, a, Account.CREATOR);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i4;
                    break;
                case 3:
                    account2 = account;
                    e = i2;
                    googleSignInAccount3 = googleSignInAccount;
                    i3 = aoe.m4629e(parcel, a);
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 4:
                    googleSignInAccount2 = (GoogleSignInAccount) aoe.m4620a(parcel, a, GoogleSignInAccount.CREATOR);
                    i3 = i;
                    account2 = account;
                    e = i2;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    e = i2;
                    break;
            }
            i2 = e;
            account = account2;
            i = i3;
            googleSignInAccount = googleSignInAccount2;
        }
        if (parcel.dataPosition() == b) {
            return new zzad(i2, account, i, googleSignInAccount);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzad[] m4694a(int i) {
        return new zzad[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4693a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4694a(i);
    }
}
