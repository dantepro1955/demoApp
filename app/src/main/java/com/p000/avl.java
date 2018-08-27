package com.p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbak;
import p000.aoe.C0656a;

/* renamed from: avl */
public class avl implements Creator<zzbak> {
    /* renamed from: a */
    public static void m6007a(zzbak zzbak, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, zzbak.f14890a);
        aof.m4648a(parcel, 2, zzbak.m19650a());
        aof.m4652a(parcel, 3, zzbak.m19652c(), i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzbak m6008a(Parcel parcel) {
        int i = 0;
        int b = aoe.m4623b(parcel);
        Intent intent = null;
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
                case 3:
                    intent = (Intent) aoe.m4620a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzbak(i2, i, intent);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzbak[] m6009a(int i) {
        return new zzbak[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6008a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6009a(i);
    }
}
