package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: ane */
public class ane implements Creator<AccountChangeEventsResponse> {
    /* renamed from: a */
    public static void m4504a(AccountChangeEventsResponse accountChangeEventsResponse, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, accountChangeEventsResponse.f14618a);
        aof.m4669c(parcel, 2, accountChangeEventsResponse.f14619b, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public AccountChangeEventsResponse m4505a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    list = aoe.m4626c(parcel, a, AccountChangeEvent.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsResponse(i, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public AccountChangeEventsResponse[] m4506a(int i) {
        return new AccountChangeEventsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4505a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4506a(i);
    }
}
