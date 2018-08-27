package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: amc */
public class amc implements Creator<PasswordSpecification> {
    /* renamed from: a */
    public static void m2556a(PasswordSpecification passwordSpecification, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, passwordSpecification.f14664d, false);
        aof.m4667b(parcel, 2, passwordSpecification.f14665e, false);
        aof.m4656a(parcel, 3, passwordSpecification.f14666f, false);
        aof.m4648a(parcel, 4, passwordSpecification.f14667g);
        aof.m4648a(parcel, 5, passwordSpecification.f14668h);
        aof.m4648a(parcel, 1000, passwordSpecification.f14663c);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public PasswordSpecification m2557a(Parcel parcel) {
        List list = null;
        int i = 0;
        int b = aoe.m4623b(parcel);
        int i2 = 0;
        List list2 = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    list2 = aoe.m4643s(parcel, a);
                    break;
                case 3:
                    list = aoe.m4642r(parcel, a);
                    break;
                case 4:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 1000:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PasswordSpecification(i3, str, list2, list, i2, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public PasswordSpecification[] m2558a(int i) {
        return new PasswordSpecification[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2557a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2558a(i);
    }
}
