package com.p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import p000.jm.C5438a;

/* compiled from: ViewCompat */
/* renamed from: jd$j */
class jd$j extends jd$i {
    jd$j() {
    }

    /* renamed from: w */
    public String mo5013w(View view) {
        return jm.m31740a(view);
    }

    /* renamed from: y */
    public void mo5015y(View view) {
        jm.m31747b(view);
    }

    /* renamed from: h */
    public void mo4998h(View view, float f) {
        jm.m31741a(view, f);
    }

    /* renamed from: z */
    public float mo5016z(View view) {
        return jm.m31749c(view);
    }

    /* renamed from: A */
    public float mo5018A(View view) {
        return jm.m31750d(view);
    }

    /* renamed from: a */
    public void mo4967a(View view, final iu iuVar) {
        if (iuVar == null) {
            jm.m31745a(view, null);
        } else {
            jm.m31745a(view, new C5438a(this) {
                /* renamed from: b */
                final /* synthetic */ jd$j f24278b;

                /* renamed from: a */
                public Object mo5019a(View view, Object obj) {
                    return kb.a(iuVar.a(view, kb.a(obj)));
                }
            });
        }
    }

    /* renamed from: E */
    public boolean mo4946E(View view) {
        return jm.m31753g(view);
    }

    /* renamed from: H */
    public void mo4949H(View view) {
        jm.m31754h(view);
    }

    /* renamed from: F */
    public ColorStateList mo4947F(View view) {
        return jm.m31751e(view);
    }

    /* renamed from: a */
    public void mo4962a(View view, ColorStateList colorStateList) {
        jm.m31743a(view, colorStateList);
    }

    /* renamed from: a */
    public void mo4964a(View view, Mode mode) {
        jm.m31744a(view, mode);
    }

    /* renamed from: G */
    public Mode mo4948G(View view) {
        return jm.m31752f(view);
    }

    /* renamed from: a */
    public kb mo4957a(View view, kb kbVar) {
        return kb.a(jm.m31739a(view, kb.a(kbVar)));
    }

    /* renamed from: b */
    public kb mo4976b(View view, kb kbVar) {
        return kb.a(jm.m31746b(view, kb.a(kbVar)));
    }

    /* renamed from: J */
    public float mo4951J(View view) {
        return jm.m31755i(view);
    }

    /* renamed from: e */
    public void mo4991e(View view, int i) {
        jm.m31748b(view, i);
    }

    /* renamed from: f */
    public void mo4994f(View view, int i) {
        jm.m31742a(view, i);
    }
}
