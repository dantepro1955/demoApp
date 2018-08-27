package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import p000.aoe.C0656a;

/* renamed from: amz */
public class amz implements Creator<SignInAccount> {
    /* renamed from: a */
    public static void m2766a(SignInAccount signInAccount, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, signInAccount.f14737a);
        aof.m4655a(parcel, 4, signInAccount.f14738b, false);
        aof.m4652a(parcel, 7, signInAccount.m19494a(), i, false);
        aof.m4655a(parcel, 8, signInAccount.f14739c, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public SignInAccount m2767a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < b) {
            GoogleSignInAccount googleSignInAccount2;
            String str3;
            int e;
            String str4;
            int a = aoe.m4618a(parcel);
            String str5;
            switch (aoe.m4617a(a)) {
                case 1:
                    str5 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    e = aoe.m4629e(parcel, a);
                    str4 = str5;
                    break;
                case 4:
                    e = i;
                    GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
                    str3 = aoe.m4635k(parcel, a);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 7:
                    str3 = str;
                    e = i;
                    str5 = str2;
                    googleSignInAccount2 = (GoogleSignInAccount) aoe.m4620a(parcel, a, GoogleSignInAccount.CREATOR);
                    str4 = str5;
                    break;
                case 8:
                    str4 = aoe.m4635k(parcel, a);
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    e = i;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    e = i;
                    break;
            }
            i = e;
            str = str3;
            googleSignInAccount = googleSignInAccount2;
            str2 = str4;
        }
        if (parcel.dataPosition() == b) {
            return new SignInAccount(i, str, googleSignInAccount, str2);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public SignInAccount[] m2768a(int i) {
        return new SignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2767a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2768a(i);
    }
}
