package com.p000;

import android.content.Context;
import java.util.Vector;
import p000.dnm.C5007a;

/* renamed from: czx */
public final class czx {
    /* renamed from: a */
    private rk f20868a = dnn.m28258a(getClass());
    /* renamed from: b */
    private Context f20869b = null;
    /* renamed from: c */
    private boolean f20870c = false;

    public czx(Vector vector) {
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                dnm dnm = (dnm) vector.get(i);
                String a = dnm.m28248a();
                if (dnm.m28251d() == C5007a.f22310a) {
                    if (a.equals("Android_Context")) {
                        this.f20869b = (Context) dnm.m28250c();
                        if (this.f20868a.mo4276b()) {
                            this.f20868a.mo4275b("NMSP_DEFINES_ANDROID_CONTEXT is passed in as" + this.f20869b);
                        }
                    } else if (a.equals("Disable_Bluetooth") && new String(dnm.m28249b()).equalsIgnoreCase("TRUE")) {
                        if (this.f20868a.mo4276b()) {
                            this.f20868a.mo4275b((Object) "Disable_Bluetooth is true.");
                        }
                        this.f20870c = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m25913a() {
        if (this.f20870c) {
            return false;
        }
        if (this.f20869b != null) {
            dqc a = dqc.m28686a(this.f20869b);
            boolean b = a.m28690b();
            a.m28691c();
            return b;
        } else if (!this.f20868a.mo4282e()) {
            return false;
        } else {
            this.f20868a.mo4281e("ANDROID_CONTEXT parameter is not passed in!!!");
            return false;
        }
    }
}
