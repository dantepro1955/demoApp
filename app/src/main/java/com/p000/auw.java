package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzasm;
import p000.aoe.C0656a;

/* renamed from: auw */
public class auw implements Creator<zzasm> {
    /* renamed from: a */
    public static void m5899a(zzasm zzasm, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4655a(parcel, 1, zzasm.getRequestId(), false);
        aof.m4649a(parcel, 2, zzasm.m19646e());
        aof.m4657a(parcel, 3, zzasm.m19642a());
        aof.m4646a(parcel, 4, zzasm.m19643b());
        aof.m4646a(parcel, 5, zzasm.m19644c());
        aof.m4647a(parcel, 6, zzasm.m19645d());
        aof.m4648a(parcel, 7, zzasm.m19647f());
        aof.m4648a(parcel, 8, zzasm.m19648g());
        aof.m4648a(parcel, 9, zzasm.m19649h());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzasm m5900a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        String str = null;
        int i = 0;
        short s = (short) 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 2:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 3:
                    s = aoe.m4628d(parcel, a);
                    break;
                case 4:
                    d = aoe.m4634j(parcel, a);
                    break;
                case 5:
                    d2 = aoe.m4634j(parcel, a);
                    break;
                case 6:
                    f = aoe.m4633i(parcel, a);
                    break;
                case 7:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 8:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 9:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzasm(str, i, s, d, d2, f, j, i2, i3);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzasm[] m5901a(int i) {
        return new zzasm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5900a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5901a(i);
    }
}
