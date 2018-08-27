package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.TokenData;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: anh */
public class anh implements Creator<TokenData> {
    /* renamed from: a */
    public static void m4513a(TokenData tokenData, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, tokenData.f14620a);
        aof.m4655a(parcel, 2, tokenData.m19399a(), false);
        aof.m4654a(parcel, 3, tokenData.m19400b(), false);
        aof.m4658a(parcel, 4, tokenData.m19401c());
        aof.m4658a(parcel, 5, tokenData.m19402d());
        aof.m4667b(parcel, 6, tokenData.m19403e(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public TokenData m4514a(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    l = aoe.m4632h(parcel, a);
                    break;
                case 4:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    list = aoe.m4643s(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public TokenData[] m4515a(int i) {
        return new TokenData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4514a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4515a(i);
    }
}
