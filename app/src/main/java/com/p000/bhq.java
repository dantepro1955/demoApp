package com.p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzmv;
import p000.aoe.C0656a;

/* renamed from: bhq */
public class bhq implements Creator<zzmv> {
    /* renamed from: a */
    public static void m8511a(zzmv zzmv, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4652a(parcel, 2, zzmv.f15108a, i, false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzmv m8512a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) aoe.m4620a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zzmv(parcelFileDescriptor);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzmv[] m8513a(int i) {
        return new zzmv[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8512a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8513a(i);
    }
}
