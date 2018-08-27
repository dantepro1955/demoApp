package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.zzvm;
import p000.aoe.C0656a;

/* renamed from: bov */
public class bov implements Creator<zzvm> {
    /* renamed from: a */
    public static void m10204a(zzvm zzvm, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, zzvm.m19692a(), i, false);
        aof.m4648a(parcel, 1000, zzvm.f15133a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzvm m10205a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    credential = (Credential) aoe.m4620a(parcel, a, Credential.CREATOR);
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
            return new zzvm(i, credential);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzvm[] m10206a(int i) {
        return new zzvm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10205a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10206a(i);
    }
}
