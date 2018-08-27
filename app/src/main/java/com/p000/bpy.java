package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.location.zza;
import p000.aoe.C0656a;

/* renamed from: bpy */
public class bpy implements Creator<zza> {
    /* renamed from: a */
    public static void m10376a(zza zza, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4649a(parcel, 1, zza.m19720a());
        aof.m4658a(parcel, 2, zza.m19721b());
        aof.m4652a(parcel, 3, zza.m19722c(), i, false);
        aof.m4655a(parcel, 4, zza.m19723d(), false);
        aof.m4660a(parcel, 5, zza.m19724e(), false);
        aof.m4658a(parcel, 6, zza.m19725f());
        aof.m4655a(parcel, 7, zza.m19726g(), false);
        aof.m4649a(parcel, 8, zza.m19727h());
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zza m10377a(Parcel parcel) {
        long j = 0;
        boolean z = false;
        String str = null;
        int b = aoe.m4623b(parcel);
        int[] iArr = null;
        String str2 = null;
        WorkSource workSource = null;
        boolean z2 = false;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    j2 = aoe.m4631g(parcel, a);
                    break;
                case 2:
                    z2 = aoe.m4627c(parcel, a);
                    break;
                case 3:
                    workSource = (WorkSource) aoe.m4620a(parcel, a, WorkSource.CREATOR);
                    break;
                case 4:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    iArr = aoe.m4640p(parcel, a);
                    break;
                case 6:
                    z = aoe.m4627c(parcel, a);
                    break;
                case 7:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 8:
                    j = aoe.m4631g(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new zza(j2, z2, workSource, str2, iArr, z, str, j);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zza[] m10378a(int i) {
        return new zza[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10377a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10378a(i);
    }
}
