package com.p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import p000.aoe.C0656a;

/* renamed from: and */
public class and implements Creator<AccountChangeEventsRequest> {
    /* renamed from: a */
    public static void m2812a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, accountChangeEventsRequest.f14614a);
        aof.m4648a(parcel, 2, accountChangeEventsRequest.f14615b);
        aof.m4655a(parcel, 3, accountChangeEventsRequest.f14616c, false);
        aof.m4652a(parcel, 4, accountChangeEventsRequest.f14617d, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public AccountChangeEventsRequest m2813a(Parcel parcel) {
        Account account = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 4:
                    account = (Account) aoe.m4620a(parcel, a, Account.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public AccountChangeEventsRequest[] m2814a(int i) {
        return new AccountChangeEventsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2813a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2814a(i);
    }
}
