package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzfp;
import p000.aoe.C0656a;

/* renamed from: bap */
public class bap implements Creator<zzfp> {
    /* renamed from: a */
    public static void m7034a(zzfp zzfp, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 2, zzfp.f14944a);
        aof.m4648a(parcel, 3, zzfp.f14945b);
        aof.m4648a(parcel, 4, zzfp.f14946c);
        aof.m4648a(parcel, 5, zzfp.f14947d);
        aof.m4648a(parcel, 6, zzfp.f14948e);
        aof.m4648a(parcel, 7, zzfp.f14949f);
        aof.m4648a(parcel, 8, zzfp.f14950g);
        aof.m4648a(parcel, 9, zzfp.f14951h);
        aof.m4655a(parcel, 10, zzfp.f14952i, false);
        aof.m4648a(parcel, 11, zzfp.f14953j);
        aof.m4655a(parcel, 12, zzfp.f14954k, false);
        aof.m4648a(parcel, 13, zzfp.f14955l);
        aof.m4648a(parcel, 14, zzfp.f14956m);
        aof.m4655a(parcel, 15, zzfp.f14957n, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzfp m7035a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        int i9 = 0;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 3:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 4:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 5:
                    i4 = aoe.m4629e(parcel, a);
                    break;
                case 6:
                    i5 = aoe.m4629e(parcel, a);
                    break;
                case 7:
                    i6 = aoe.m4629e(parcel, a);
                    break;
                case 8:
                    i7 = aoe.m4629e(parcel, a);
                    break;
                case 9:
                    i8 = aoe.m4629e(parcel, a);
                    break;
                case 10:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 11:
                    i9 = aoe.m4629e(parcel, a);
                    break;
                case 12:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 13:
                    i10 = aoe.m4629e(parcel, a);
                    break;
                case 14:
                    i11 = aoe.m4629e(parcel, a);
                    break;
                case 15:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzfp(i, i2, i3, i4, i5, i6, i7, i8, str, i9, str2, i10, i11, str3);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzfp[] m7036a(int i) {
        return new zzfp[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7035a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7036a(i);
    }
}
