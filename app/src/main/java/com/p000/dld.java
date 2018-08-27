package com.p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;

@TargetApi(16)
/* compiled from: HackySurfaceTexture */
/* renamed from: dld */
public class dld extends SurfaceTexture {
    /* renamed from: a */
    private C4468a f21979a;

    /* compiled from: HackySurfaceTexture */
    /* renamed from: dld$a */
    public interface C4468a {
        /* renamed from: a */
        void mo4086a(String str);
    }

    public dld(int i) {
        super(i);
    }

    /* renamed from: a */
    public void m27810a(C4468a c4468a) {
        this.f21979a = c4468a;
    }

    public void attachToGLContext(int i) {
        try {
            super.attachToGLContext(i);
        } catch (Exception e) {
            if (this.f21979a != null) {
                this.f21979a.mo4086a("Caught exception from HackySurfaceTexture attachToGLContext: " + e.getMessage());
            }
        }
    }

    public void detachFromGLContext() {
        try {
            super.detachFromGLContext();
        } catch (Exception e) {
            if (this.f21979a != null) {
                this.f21979a.mo4086a("Caught exception from HackySurfaceTexture detachFromGLContext: " + e.getMessage());
            }
        }
    }
}
