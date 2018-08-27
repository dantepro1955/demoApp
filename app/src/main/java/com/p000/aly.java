package com.p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: aly */
public class aly implements Creator<Credential> {
    /* renamed from: a */
    public static void m2543a(Credential credential, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, credential.m19404a(), false);
        aof.m4655a(parcel, 2, credential.m19405b(), false);
        aof.m4652a(parcel, 3, credential.m19406c(), i, false);
        aof.m4669c(parcel, 4, credential.m19407d(), false);
        aof.m4655a(parcel, 5, credential.m19408e(), false);
        aof.m4655a(parcel, 6, credential.m19410g(), false);
        aof.m4655a(parcel, 7, credential.m19409f(), false);
        aof.m4648a(parcel, 1000, credential.f14626a);
        aof.m4655a(parcel, 8, credential.m19411h(), false);
        aof.m4655a(parcel, 9, credential.m19412i(), false);
        aof.m4655a(parcel, 10, credential.m19413j(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public Credential m2544a(Parcel parcel) {
        String str = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        Uri uri = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str8 = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    str7 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    uri = (Uri) aoe.m4620a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = aoe.m4626c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str6 = aoe.m4635k(parcel, a);
                    break;
                case 6:
                    str5 = aoe.m4635k(parcel, a);
                    break;
                case 7:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 9:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 10:
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
            return new Credential(i, str8, str7, uri, list, str6, str5, str4, str3, str2, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public Credential[] m2545a(int i) {
        return new Credential[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2544a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2545a(i);
    }
}
