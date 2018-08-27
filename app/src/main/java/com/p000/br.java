package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import p000.bp.C1385a;

@TargetApi(14)
/* compiled from: ScenePort */
/* renamed from: br */
final class br {
    /* renamed from: a */
    Runnable f7434a;
    /* renamed from: b */
    private ViewGroup f7435b;

    /* renamed from: a */
    static void m10486a(View view, br brVar) {
        view.setTag(C1385a.transition_current_scene, brVar);
    }

    /* renamed from: a */
    static br m10485a(View view) {
        return (br) view.getTag(C1385a.transition_current_scene);
    }

    /* renamed from: a */
    public void m10487a() {
        if (br.m10485a(this.f7435b) == this && this.f7434a != null) {
            this.f7434a.run();
        }
    }
}
