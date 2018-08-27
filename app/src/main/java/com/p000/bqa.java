package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zzd;
import p000.aoe.C0656a;

/* renamed from: bqa */
public class bqa implements Creator<zzd> {
    /* renamed from: a */
    public static void m10383a(zzd zzd, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzd.m19728a());
        aof.m4648a(parcel, 2, zzd.m19729b());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzd m10384a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzd(i2, i);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzd[] m10385a(int i) {
        return new zzd[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10384a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10385a(i);
    }
}
