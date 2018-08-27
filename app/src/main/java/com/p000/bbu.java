package com.p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;
import p000.bby.C0997a;
import p000.bck.C1001a;

@bhd
/* renamed from: bbu */
public class bbu extends C1001a implements C0997a {
    /* renamed from: a */
    private final bbq f5504a;
    /* renamed from: b */
    private final String f5505b;
    /* renamed from: c */
    private final hr<String, bbr> f5506c;
    /* renamed from: d */
    private final hr<String, String> f5507d;
    /* renamed from: e */
    private baf f5508e;
    /* renamed from: f */
    private View f5509f;
    /* renamed from: g */
    private final Object f5510g = new Object();
    /* renamed from: h */
    private bby f5511h;

    /* renamed from: bbu$1 */
    class C10001 implements bbv {
        /* renamed from: a */
        final /* synthetic */ bbu f5503a;

        C10001(bbu bbu) {
            this.f5503a = bbu;
        }

        /* renamed from: a */
        public void mo950a() {
            this.f5503a.mo958c("_videoMediaView");
        }

        /* renamed from: a */
        public void mo951a(MotionEvent motionEvent) {
        }
    }

    public bbu(String str, hr<String, bbr> hrVar, hr<String, String> hrVar2, bbq bbq, baf baf, View view) {
        this.f5505b = str;
        this.f5506c = hrVar;
        this.f5507d = hrVar2;
        this.f5504a = bbq;
        this.f5508e = baf;
        this.f5509f = view;
    }

    /* renamed from: a */
    public String mo952a(String str) {
        return (String) this.f5507d.get(str);
    }

    /* renamed from: a */
    public List<String> mo953a() {
        int i = 0;
        String[] strArr = new String[(this.f5506c.size() + this.f5507d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5506c.size(); i3++) {
            strArr[i2] = (String) this.f5506c.b(i3);
            i2++;
        }
        while (i < this.f5507d.size()) {
            strArr[i2] = (String) this.f5507d.b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: a */
    public void mo925a(bby bby) {
        synchronized (this.f5510g) {
            this.f5511h = bby;
        }
    }

    /* renamed from: a */
    public boolean mo954a(aqq aqq) {
        if (this.f5511h == null) {
            bky.m9008c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f5509f == null) {
            return false;
        } else {
            View view = (FrameLayout) aqr.m4968a(aqq);
            this.f5511h.mo964a(view, new C10001(this));
            return true;
        }
    }

    /* renamed from: b */
    public baf mo955b() {
        return this.f5508e;
    }

    /* renamed from: b */
    public bcc mo956b(String str) {
        return (bcc) this.f5506c.get(str);
    }

    /* renamed from: c */
    public void mo957c() {
        synchronized (this.f5510g) {
            if (this.f5511h == null) {
                bky.m9008c("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.f5511h.mo966a(null, null);
        }
    }

    /* renamed from: c */
    public void mo958c(String str) {
        synchronized (this.f5510g) {
            if (this.f5511h == null) {
                bky.m9008c("Attempt to call performClick before ad initialized.");
                return;
            }
            this.f5511h.mo965a(null, str, null, null, null);
        }
    }

    /* renamed from: d */
    public aqq mo959d() {
        return aqr.m4967a(this.f5511h.mo972f().getApplicationContext());
    }

    /* renamed from: e */
    public void mo960e() {
        this.f5511h = null;
        this.f5508e = null;
        this.f5509f = null;
    }

    /* renamed from: k */
    public String mo935k() {
        return "3";
    }

    /* renamed from: l */
    public String mo936l() {
        return this.f5505b;
    }

    /* renamed from: m */
    public bbq mo937m() {
        return this.f5504a;
    }

    /* renamed from: o */
    public View mo939o() {
        return this.f5509f;
    }
}
