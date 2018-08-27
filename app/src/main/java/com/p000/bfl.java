package com.p000;

import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import java.util.Date;
import java.util.HashSet;
import p000.acx.C0073a;
import p000.acx.C0074b;

@bhd
/* renamed from: bfl */
public final class bfl {

    /* renamed from: bfl$1 */
    static /* synthetic */ class C11431 {
        /* renamed from: a */
        static final /* synthetic */ int[] f5962a = new int[C0074b.values().length];

        static {
            f5963b = new int[C0073a.values().length];
            try {
                f5963b[C0073a.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f5963b[C0073a.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f5963b[C0073a.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f5963b[C0073a.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f5962a[C0074b.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f5962a[C0074b.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f5962a[C0074b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: a */
    public static int m8143a(C0073a c0073a) {
        switch (c0073a) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C0074b m8144a(int i) {
        switch (i) {
            case 1:
                return C0074b.MALE;
            case 2:
                return C0074b.FEMALE;
            default:
                return C0074b.UNKNOWN;
        }
    }

    /* renamed from: a */
    public static acy m8145a(zzeg zzeg) {
        int i = 0;
        acy[] acyArr = new acy[]{acy.f420a, acy.f421b, acy.f422c, acy.f423d, acy.f424e, acy.f425f};
        while (i < 6) {
            if (acyArr[i].m508a() == zzeg.f14935e && acyArr[i].m512b() == zzeg.f14932b) {
                return acyArr[i];
            }
            i++;
        }
        return new acy(akz.m2393a(zzeg.f14935e, zzeg.f14932b, zzeg.f14931a));
    }

    /* renamed from: a */
    public static MediationAdRequest m8146a(zzec zzec) {
        return new MediationAdRequest(new Date(zzec.f14914b), bfl.m8144a(zzec.f14916d), zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14918f, zzec.f14923k);
    }
}
