package com.p000;

import com.under9.android.lib.widget.uiv.UniversalImageView;
import java.lang.ref.WeakReference;
import p000.dlb.C4462c;

/* compiled from: UIVExoPlayerMp4Listener */
/* renamed from: dlo */
public class dlo implements C4462c {
    /* renamed from: a */
    private WeakReference<UniversalImageView> f22100a;
    /* renamed from: b */
    private WeakReference<dlm> f22101b;
    /* renamed from: c */
    private boolean f22102c = false;

    public dlo(UniversalImageView universalImageView) {
        this.f22100a = new WeakReference(universalImageView);
    }

    /* renamed from: a */
    public void mo4085a(boolean z, int i) {
        if (!this.f22102c) {
            UniversalImageView universalImageView = (UniversalImageView) this.f22100a.get();
            if (universalImageView != null) {
                switch (i) {
                    case 3:
                        universalImageView.m24153a(true);
                        return;
                    case 4:
                        universalImageView.m24153a(false);
                        return;
                    case 5:
                        this.f22102c = true;
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4084a(Exception exception) {
        if (this.f22101b.get() != null) {
            diu a = diu.m27494a(2);
            a.m27495a(2, "mp4Url", ((dlm) this.f22101b.get()).f22075o);
            dit.m27476a("VideoAction", "StreamVideoFailed", exception.getMessage(), Long.valueOf(0), a);
        }
    }

    /* renamed from: a */
    public void mo4083a(int i, int i2, int i3, float f) {
    }

    /* renamed from: a */
    public void m27898a(dlm dlm) {
        this.f22101b = new WeakReference(dlm);
    }

    /* renamed from: a */
    public void m27896a() {
        this.f22102c = false;
    }
}
