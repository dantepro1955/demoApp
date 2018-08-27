package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import p000.aoe.C0656a;

/* renamed from: amv */
public class amv implements Creator<SignInConfiguration> {
    /* renamed from: a */
    public static void m2744a(SignInConfiguration signInConfiguration, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, signInConfiguration.f14741a);
        aof.m4655a(parcel, 2, signInConfiguration.m19495a(), false);
        aof.m4652a(parcel, 5, signInConfiguration.m19496b(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public SignInConfiguration m2745a(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) aoe.m4620a(parcel, a, GoogleSignInOptions.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInConfiguration(i, str, googleSignInOptions);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public SignInConfiguration[] m2746a(int i) {
        return new SignInConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2745a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2746a(i);
    }
}
