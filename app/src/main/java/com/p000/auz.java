package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p000.atp.C0794a;
import p000.atr.C0800a;

/* renamed from: auz */
public class auz extends ava {
    /* renamed from: s */
    private static final String f4639s = auz.class.getSimpleName();
    /* renamed from: t */
    private Info f4640t;

    protected auz(Context context) {
        super(context, "");
    }

    /* renamed from: b */
    public static auz m5916b(Context context) {
        ava.m5903a(context, true);
        return new auz(context);
    }

    /* renamed from: a */
    protected C0800a mo781a(Context context, View view) {
        return null;
    }

    /* renamed from: a */
    public String m5918a(String str, String str2) {
        return atx.m5697a(str, str2, true);
    }

    /* renamed from: a */
    protected void mo784a(avx avx, C0800a c0800a, C0794a c0794a) {
        if (!avx.m6102h()) {
            m5912a(mo785b(avx, c0800a, c0794a));
        } else if (this.f4640t != null) {
            String id = this.f4640t.getId();
            if (!TextUtils.isEmpty(id)) {
                c0800a.aa = avz.m6116a(id);
                c0800a.ab = Integer.valueOf(5);
                c0800a.ac = Boolean.valueOf(this.f4640t.isLimitAdTrackingEnabled());
            }
            this.f4640t = null;
        }
    }

    /* renamed from: a */
    public void m5920a(Info info) {
        this.f4640t = info;
    }

    /* renamed from: b */
    protected List<Callable<Void>> mo785b(avx avx, C0800a c0800a, C0794a c0794a) {
        List<Callable<Void>> arrayList = new ArrayList();
        if (avx.m6097c() == null) {
            return arrayList;
        }
        avx avx2 = avx;
        arrayList.add(new awk(avx2, avf.m5973p(), avf.m5974q(), c0800a, avx.m6112r(), 24));
        return arrayList;
    }
}
