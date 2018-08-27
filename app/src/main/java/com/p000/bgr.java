package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import p000.bgo.C0218a;
import p000.bjt.C1254a;

@TargetApi(19)
@bhd
/* renamed from: bgr */
public class bgr extends bgp {
    /* renamed from: g */
    private Object f6106g = new Object();
    /* renamed from: h */
    private PopupWindow f6107h;
    /* renamed from: i */
    private boolean f6108i = false;

    bgr(Context context, C1254a c1254a, blo blo, C0218a c0218a) {
        super(context, c1254a, blo, c0218a);
    }

    /* renamed from: f */
    private void m8323f() {
        synchronized (this.f6106g) {
            this.f6108i = true;
            if ((this.b instanceof Activity) && ((Activity) this.b).isDestroyed()) {
                this.f6107h = null;
            }
            if (this.f6107h != null) {
                if (this.f6107h.isShowing()) {
                    this.f6107h.dismiss();
                }
                this.f6107h = null;
            }
        }
    }

    /* renamed from: a */
    protected void mo1177a(int i) {
        m8323f();
        super.mo1177a(i);
    }

    /* renamed from: c */
    public void mo194c() {
        m8323f();
        super.mo194c();
    }

    /* renamed from: e */
    protected void mo1178e() {
        Window window = this.b instanceof Activity ? ((Activity) this.b).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.b).isDestroyed()) {
            View frameLayout = new FrameLayout(this.b);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            frameLayout.addView(this.c.mo1305b(), -1, -1);
            synchronized (this.f6106g) {
                if (this.f6108i) {
                    return;
                }
                this.f6107h = new PopupWindow(frameLayout, 1, 1, false);
                this.f6107h.setOutsideTouchable(true);
                this.f6107h.setClippingEnabled(false);
                bky.m9006b("Displaying the 1x1 popup off the screen.");
                try {
                    this.f6107h.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception e) {
                    this.f6107h = null;
                }
            }
        }
    }
}
