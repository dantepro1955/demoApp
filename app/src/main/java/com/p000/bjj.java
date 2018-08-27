package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzor;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bjj */
public class bjj implements Creator<zzor> {
    /* renamed from: a */
    public static void m8865a(zzor zzor, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 2, zzor.f15116a, false);
        aof.m4655a(parcel, 3, zzor.f15117b, false);
        aof.m4658a(parcel, 4, zzor.f15118c);
        aof.m4658a(parcel, 5, zzor.f15119d);
        aof.m4667b(parcel, 6, zzor.f15120e, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzor m8866a(Parcel parcel) {
        boolean z = false;
        List list = null;
        int b = aoe.m4623b(parcel);
        boolean z2 = false;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 3:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 4:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 5:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 6:
                    list = aoe.m4643s(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzor(str2, str, z2, z, list);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzor[] m8867a(int i) {
        return new zzor[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8866a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8867a(i);
    }
}
