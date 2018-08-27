package com.p000;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.internal.zzoo;
import java.util.Map;

@bhd
/* renamed from: bdi */
public class bdi implements bcy {
    /* renamed from: a */
    private final C0251a f5648a;

    /* renamed from: bdi$a */
    public interface C0251a {
        /* renamed from: O */
        void mo304O();

        /* renamed from: b */
        void mo307b(zzoo zzoo);
    }

    public bdi(C0251a c0251a) {
        this.f5648a = c0251a;
    }

    /* renamed from: a */
    public static void m7583a(blo blo, C0251a c0251a) {
        blo.mo1322l().m9419a("/reward", new bdi(c0251a));
    }

    /* renamed from: a */
    private void m7584a(Map<String, String> map) {
        zzoo zzoo;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str = (String) map.get("type");
            if (!TextUtils.isEmpty(str)) {
                zzoo = new zzoo(str, parseInt);
                this.f5648a.mo307b(zzoo);
            }
        } catch (Throwable e) {
            bky.m9009c("Unable to parse reward amount.", e);
        }
        zzoo = null;
        this.f5648a.mo307b(zzoo);
    }

    /* renamed from: b */
    private void m7585b(Map<String, String> map) {
        this.f5648a.mo304O();
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if ("grant".equals(str)) {
            m7584a(map);
        } else if ("video_start".equals(str)) {
            m7585b(map);
        }
    }
}
