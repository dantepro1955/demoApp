package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzmp;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bhm */
public class bhm implements Creator<zzmp> {
    /* renamed from: a */
    public static void m8499a(zzmp zzmp, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4658a(parcel, 2, zzmp.f15101a);
        aof.m4667b(parcel, 3, zzmp.f15102b, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzmp m8500a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    list = aoe.m4643s(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzmp(z, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzmp[] m8501a(int i) {
        return new zzmp[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8500a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8501a(i);
    }
}
