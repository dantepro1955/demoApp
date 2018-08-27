package com.p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p000.aoe.C0656a;

/* renamed from: amy */
public class amy implements Creator<GoogleSignInOptions> {
    /* renamed from: a */
    public static void m2763a(GoogleSignInOptions googleSignInOptions, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, googleSignInOptions.f14727g);
        aof.m4669c(parcel, 2, googleSignInOptions.m19485a(), false);
        aof.m4652a(parcel, 3, googleSignInOptions.m19486b(), i, false);
        aof.m4658a(parcel, 4, googleSignInOptions.m19487c());
        aof.m4658a(parcel, 5, googleSignInOptions.m19488d());
        aof.m4658a(parcel, 6, googleSignInOptions.m19489e());
        aof.m4655a(parcel, 7, googleSignInOptions.m19490f(), false);
        aof.m4655a(parcel, 8, googleSignInOptions.m19491g(), false);
        aof.m4669c(parcel, 9, googleSignInOptions.m19492h(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public GoogleSignInOptions m2764a(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int b = aoe.m4623b(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    arrayList2 = aoe.m4626c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) aoe.m4620a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z3 = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 7:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 9:
                    arrayList = aoe.m4626c(parcel, a, zzg.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInOptions(i, arrayList2, account, z3, z2, z, str2, str, arrayList);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GoogleSignInOptions[] m2765a(int i) {
        return new GoogleSignInOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2764a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2765a(i);
    }
}
