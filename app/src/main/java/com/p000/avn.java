package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzban;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: avn */
public class avn implements Creator<zzban> {
    /* renamed from: a */
    public static void m6010a(zzban zzban, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzban.f14893a);
        aof.m4658a(parcel, 2, zzban.f14894b);
        aof.m4669c(parcel, 3, zzban.f14895c, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzban m6011a(Parcel parcel) {
        boolean z = false;
        int b = aoe.m4623b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    list = aoe.m4626c(parcel, a, Scope.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzban(i, z, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzban[] m6012a(int i) {
        return new zzban[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6011a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6012a(i);
    }
}
