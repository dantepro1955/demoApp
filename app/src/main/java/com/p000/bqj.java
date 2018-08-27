package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zzo;
import p000.aoe.C0656a;

/* renamed from: bqj */
public class bqj implements Creator<zzo> {
    /* renamed from: a */
    public static void m10407a(zzo zzo, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, zzo.m19735a(), false);
        aof.m4655a(parcel, 2, zzo.m19736b(), false);
        aof.m4648a(parcel, 3, zzo.m19737c());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzo m10408a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        String str = "";
        String str2 = "";
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzo(str, str2, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzo[] m10409a(int i) {
        return new zzo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10408a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10409a(i);
    }
}
