package com.p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;
import p000.aoe.C0656a;

/* renamed from: app */
public class app implements Creator<WakeLockEvent> {
    /* renamed from: a */
    public static void m4865a(WakeLockEvent wakeLockEvent, Parcel parcel, int i) {
        int a = aof.m4644a(parcel);
        aof.m4648a(parcel, 1, wakeLockEvent.f14800a);
        aof.m4649a(parcel, 2, wakeLockEvent.mo3131a());
        aof.m4655a(parcel, 4, wakeLockEvent.m19553e(), false);
        aof.m4648a(parcel, 5, wakeLockEvent.m19556h());
        aof.m4667b(parcel, 6, wakeLockEvent.m19557i(), false);
        aof.m4649a(parcel, 8, wakeLockEvent.m19559k());
        aof.m4655a(parcel, 10, wakeLockEvent.m19554f(), false);
        aof.m4648a(parcel, 11, wakeLockEvent.mo3132b());
        aof.m4655a(parcel, 12, wakeLockEvent.m19558j(), false);
        aof.m4655a(parcel, 13, wakeLockEvent.m19561m(), false);
        aof.m4648a(parcel, 14, wakeLockEvent.m19560l());
        aof.m4647a(parcel, 15, wakeLockEvent.m19562n());
        aof.m4649a(parcel, 16, wakeLockEvent.m19563o());
        aof.m4655a(parcel, 17, wakeLockEvent.m19555g(), false);
        aof.m4645a(parcel, a);
    }

    /* renamed from: a */
    public WakeLockEvent m4866a(Parcel parcel) {
        int b = aoe.m4623b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        long j3 = 0;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = aoe.m4618a(parcel);
            switch (aoe.m4617a(a)) {
                case 1:
                    i = aoe.m4629e(parcel, a);
                    break;
                case 2:
                    j = aoe.m4631g(parcel, a);
                    break;
                case 4:
                    str = aoe.m4635k(parcel, a);
                    break;
                case 5:
                    i3 = aoe.m4629e(parcel, a);
                    break;
                case 6:
                    list = aoe.m4643s(parcel, a);
                    break;
                case 8:
                    j2 = aoe.m4631g(parcel, a);
                    break;
                case 10:
                    str3 = aoe.m4635k(parcel, a);
                    break;
                case 11:
                    i2 = aoe.m4629e(parcel, a);
                    break;
                case 12:
                    str2 = aoe.m4635k(parcel, a);
                    break;
                case 13:
                    str4 = aoe.m4635k(parcel, a);
                    break;
                case 14:
                    i4 = aoe.m4629e(parcel, a);
                    break;
                case 15:
                    f = aoe.m4633i(parcel, a);
                    break;
                case 16:
                    j3 = aoe.m4631g(parcel, a);
                    break;
                case 17:
                    str5 = aoe.m4635k(parcel, a);
                    break;
                default:
                    aoe.m4624b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
        }
        throw new C0656a("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public WakeLockEvent[] m4867a(int i) {
        return new WakeLockEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4866a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4867a(i);
    }
}
