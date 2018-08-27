package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzaqi;
import p000.aoe.C0656a;

/* renamed from: aue */
public class aue implements Creator<zzaqi> {
    /* renamed from: a */
    public static void m5748a(zzaqi zzaqi, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzaqi.f14858a);
        aof.m4655a(parcel, 2, zzaqi.f14859b, false);
        aof.m4655a(parcel, 3, zzaqi.f14860c, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzaqi m5749a(Parcel parcel) {
        String str = null;
        int b = aoe.m4623b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    str = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzaqi(i, str2, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzaqi[] m5750a(int i) {
        return new zzaqi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5749a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5750a(i);
    }
}
