package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.internal.zzvi;
import p000.aoe.C0656a;

/* renamed from: bos */
public class bos implements Creator<zzvi> {
    /* renamed from: a */
    public static void m10183a(zzvi zzvi, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, zzvi.m19691a(), i, false);
        aof.m4648a(parcel, 1000, zzvi.f15131a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzvi m10184a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        PasswordSpecification passwordSpecification = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    passwordSpecification = (PasswordSpecification) aoe.m4620a(parcel, a, PasswordSpecification.CREATOR);
                    break;
                case 1000:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzvi(i, passwordSpecification);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzvi[] m10185a(int i) {
        return new zzvi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10184a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10185a(i);
    }
}
