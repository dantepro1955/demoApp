package com.p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zzt;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: bqn */
public class bqn implements Creator<zzt> {
    /* renamed from: a */
    public static void m10419a(zzt zzt, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4667b(parcel, 1, zzt.m19738a(), false);
        aof.m4652a(parcel, 2, zzt.m19739b(), i, false);
        aof.m4655a(parcel, 3, zzt.m19740c(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public zzt m10420a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int b = aoe.m4623b(parcel);
        String str = "";
        List list = null;
        while (parcel.dataPosition() < b) {
            PendingIntent pendingIntent2;
            String str2;
            List list2;
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    String str3 = str;
                    pendingIntent2 = pendingIntent;
                    Object s = aoe.m4643s(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    list2 = list;
                    PendingIntent pendingIntent3 = (PendingIntent) aoe.m4620a(parcel, a, PendingIntent.CREATOR);
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 3:
                    str2 = aoe.m4635k(parcel, a);
                    pendingIntent2 = pendingIntent;
                    list2 = list;
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    str2 = str;
                    pendingIntent2 = pendingIntent;
                    list2 = list;
                    break;
            }
            list = list2;
            pendingIntent = pendingIntent2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new zzt(list, pendingIntent, str);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public zzt[] m10421a(int i) {
        return new zzt[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m10420a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m10421a(i);
    }
}
