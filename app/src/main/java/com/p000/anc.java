package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;
import p000.aoe.C0656a;

/* renamed from: anc */
public class anc implements Creator<AccountChangeEvent> {
    /* renamed from: a */
    public static void m2809a(AccountChangeEvent accountChangeEvent, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, accountChangeEvent.f14608a);
        aof.m4649a(parcel, 2, accountChangeEvent.f14609b);
        aof.m4655a(parcel, 3, accountChangeEvent.f14610c, false);
        aof.m4648a(parcel, 4, accountChangeEvent.f14611d);
        aof.m4648a(parcel, 5, accountChangeEvent.f14612e);
        aof.m4655a(parcel, 6, accountChangeEvent.f14613f, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public AccountChangeEvent m2810a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 3:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 4:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 6:
                    str = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEvent(i3, j, str2, i2, i, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public AccountChangeEvent[] m2811a(int i) {
        return new AccountChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2810a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2811a(i);
    }
}
