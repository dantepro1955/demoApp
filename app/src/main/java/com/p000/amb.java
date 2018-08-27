package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.IdToken;
import p000.aoe.C0656a;

/* renamed from: amb */
public class amb implements Creator<IdToken> {
    /* renamed from: a */
    public static void m2553a(IdToken idToken, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, idToken.m19429a(), false);
        aof.m4655a(parcel, 2, idToken.m19430b(), false);
        aof.m4648a(parcel, 1000, idToken.f14653a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public IdToken m2554a(Parcel parcel) {
        String str = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 2:
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
            return new IdToken(i, str2, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public IdToken[] m2555a(int i) {
        return new IdToken[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2554a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2555a(i);
    }
}
