package com.p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: amx */
public class amx implements Creator<GoogleSignInAccount> {
    /* renamed from: a */
    public static void m2760a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, googleSignInAccount.f14700b);
        aof.m4655a(parcel, 2, googleSignInAccount.m19448a(), false);
        aof.m4655a(parcel, 3, googleSignInAccount.m19450b(), false);
        aof.m4655a(parcel, 4, googleSignInAccount.m19451c(), false);
        aof.m4655a(parcel, 5, googleSignInAccount.m19452d(), false);
        aof.m4652a(parcel, 6, googleSignInAccount.m19455g(), i, false);
        aof.m4655a(parcel, 7, googleSignInAccount.m19456h(), false);
        aof.m4649a(parcel, 8, googleSignInAccount.m19457i());
        aof.m4655a(parcel, 9, googleSignInAccount.m19459k(), false);
        aof.m4669c(parcel, 10, googleSignInAccount.f14701c, false);
        aof.m4655a(parcel, 11, googleSignInAccount.m19453e(), false);
        aof.m4655a(parcel, 12, googleSignInAccount.m19454f(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public GoogleSignInAccount m2761a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 4:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 6:
                    uri = (Uri) aoe.m4620a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 9:
                    str6 = aoe.m4635k(parcel, a);
                    break;
                case 10:
                    list = aoe.m4626c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = aoe.m4635k(parcel, a);
                    break;
                case 12:
                    str8 = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GoogleSignInAccount[] m2762a(int i) {
        return new GoogleSignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2761a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2762a(i);
    }
}
