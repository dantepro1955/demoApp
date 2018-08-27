package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@TargetApi(14)
@bhd
/* renamed from: aim */
public class aim implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private final AudioManager f1576a;
    /* renamed from: b */
    private final C0196a f1577b;
    /* renamed from: c */
    private boolean f1578c;
    /* renamed from: d */
    private boolean f1579d;
    /* renamed from: e */
    private boolean f1580e;
    /* renamed from: f */
    private float f1581f = 1.0f;

    /* renamed from: aim$a */
    public interface C0196a {
        /* renamed from: a */
        void mo3093a();
    }

    public aim(Context context, C0196a c0196a) {
        this.f1576a = (AudioManager) context.getSystemService("audio");
        this.f1577b = c0196a;
    }

    /* renamed from: d */
    private void m1708d() {
        Object obj = (!this.f1579d || this.f1580e || this.f1581f <= 0.0f) ? null : 1;
        if (obj != null && !this.f1578c) {
            m1709e();
            this.f1577b.mo3093a();
        } else if (obj == null && this.f1578c) {
            m1710f();
            this.f1577b.mo3093a();
        }
    }

    /* renamed from: e */
    private void m1709e() {
        boolean z = true;
        if (this.f1576a != null && !this.f1578c) {
            if (this.f1576a.requestAudioFocus(this, 3, 2) != 1) {
                z = false;
            }
            this.f1578c = z;
        }
    }

    /* renamed from: f */
    private void m1710f() {
        if (this.f1576a != null && this.f1578c) {
            this.f1578c = this.f1576a.abandonAudioFocus(this) == 0;
        }
    }

    /* renamed from: a */
    public float m1711a() {
        return this.f1578c ? this.f1580e ? 0.0f : this.f1581f : 0.0f;
    }

    /* renamed from: a */
    public void m1712a(float f) {
        this.f1581f = f;
        m1708d();
    }

    /* renamed from: a */
    public void m1713a(boolean z) {
        this.f1580e = z;
        m1708d();
    }

    /* renamed from: b */
    public void m1714b() {
        this.f1579d = true;
        m1708d();
    }

    /* renamed from: c */
    public void m1715c() {
        this.f1579d = false;
        m1708d();
    }

    public void onAudioFocusChange(int i) {
        this.f1578c = i > 0;
        this.f1577b.mo3093a();
    }
}
