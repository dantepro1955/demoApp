package com.p000;

import android.content.Intent;
import android.util.Log;

/* compiled from: ComposerModule */
/* renamed from: dkk$b */
public class dkk$b {
    /* renamed from: a */
    final /* synthetic */ dkk f21896a;

    protected dkk$b(dkk dkk) {
        this.f21896a = dkk;
    }

    /* renamed from: a */
    public void m27716a(Intent intent) {
        if (this.f21896a.g()) {
            Log.d("ComposerModule", "ComposeListener::onImageSelected() mScope=" + this.f21896a.v());
        }
        if (this.f21896a.N() != null) {
            this.f21896a.N().setEnabled(true);
        }
    }

    /* renamed from: a */
    public void m27715a() {
        if (this.f21896a.g()) {
            Log.d("ComposerModule", "ComposeListener::onImageSelectCancelled() mScope=" + this.f21896a.v());
        }
        if (this.f21896a.N() != null && this.f21896a.M().toString().length() == 0) {
            this.f21896a.N().setEnabled(false);
        }
    }

    /* renamed from: b */
    public boolean m27717b() {
        if (dkk.i(this.f21896a) == null || dkk.i(this.f21896a).m27714a()) {
            return true;
        }
        return false;
    }
}
