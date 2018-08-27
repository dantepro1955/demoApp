package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.zzvg;
import p000.aoe.C0656a;

/* renamed from: bor */
public class bor implements Creator<zzvg> {
    /* renamed from: a */
    public static void m10180a(zzvg zzvg, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 1, zzvg.m19690a(), i, false);
        aof.m4648a(parcel, 1000, zzvg.f15129a);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzvg m10181a(Parcel parcel) {
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
            return new zzvg(i, credential);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzvg[] m10182a(int i) {
        return new zzvg[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10181a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10182a(i);
    }
}
