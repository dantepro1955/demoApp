package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzarw;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzf;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bqb */
public class bqb implements Creator<zzf> {
    /* renamed from: a */
    public static void m10386a(zzf zzf, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4669c(parcel, 1, zzf.m19732a(), false);
        aof.m4655a(parcel, 2, zzf.m19733b(), false);
        aof.m4669c(parcel, 3, zzf.m19734c(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzf m10387a(Parcel parcel) {
        List list = null;
        int b = aoe.m4623b(parcel);
        String str = null;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    list2 = aoe.m4626c(parcel, a, zzd.CREATOR);
                    break;
                case 2:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    list = aoe.m4626c(parcel, a, zzarw.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzf(list2, str, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzf[] m10388a(int i) {
        return new zzf[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10387a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10388a(i);
    }
}
