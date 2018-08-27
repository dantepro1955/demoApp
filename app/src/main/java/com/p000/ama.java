package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import p000.aoe.C0656a;

/* renamed from: ama */
public class ama implements Creator<CredentialRequest> {
    /* renamed from: a */
    public static void m2550a(CredentialRequest credentialRequest, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 1, credentialRequest.m19422a());
        aof.m4662a(parcel, 2, credentialRequest.m19423b(), false);
        aof.m4652a(parcel, 3, credentialRequest.m19424c(), i, false);
        aof.m4652a(parcel, 4, credentialRequest.m19425d(), i, false);
        aof.m4658a(parcel, 5, credentialRequest.m19426e());
        aof.m4655a(parcel, 6, credentialRequest.m19427f(), false);
        aof.m4655a(parcel, 7, credentialRequest.m19428g(), false);
        aof.m4648a(parcel, 1000, credentialRequest.f14645a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public CredentialRequest m2551a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = aoe.m4623b(parcel);
        String str2 = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String[] strArr = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 2:
                    strArr = aoe.m4641q(parcel, a);
                    break;
                case 3:
                    credentialPickerConfig2 = (CredentialPickerConfig) aoe.m4620a(parcel, a, CredentialPickerConfig.CREATOR);
                    break;
                case 4:
                    credentialPickerConfig = (CredentialPickerConfig) aoe.m4620a(parcel, a, CredentialPickerConfig.CREATOR);
                    break;
                case 5:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    str = aoe.m4635k(parcel, a);
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
            return new CredentialRequest(i, z2, strArr, credentialPickerConfig2, credentialPickerConfig, z, str2, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public CredentialRequest[] m2552a(int i) {
        return new CredentialRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2551a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2552a(i);
    }
}
