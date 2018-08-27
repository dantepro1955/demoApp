package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import p000.aoe.C0656a;

/* renamed from: alz */
public class alz implements Creator<CredentialPickerConfig> {
    /* renamed from: a */
    public static void m2546a(CredentialPickerConfig credentialPickerConfig, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 1, credentialPickerConfig.m19418a());
        aof.m4658a(parcel, 2, credentialPickerConfig.m19419b());
        aof.m4658a(parcel, 3, credentialPickerConfig.m19420c());
        aof.m4648a(parcel, 4, credentialPickerConfig.m19421d());
        aof.m4648a(parcel, 1000, credentialPickerConfig.f14640a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public CredentialPickerConfig m2547a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                case 2:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 4:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 1000:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CredentialPickerConfig(i2, z3, z2, z, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public CredentialPickerConfig[] m2548a(int i) {
        return new CredentialPickerConfig[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2547a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2548a(i);
    }
}
