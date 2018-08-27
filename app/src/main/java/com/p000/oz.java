package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

@TargetApi(21)
/* compiled from: CardViewApi21 */
/* renamed from: oz */
public class oz implements pc {
    /* renamed from: a */
    public void mo5417a(pa paVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        paVar.m33435a(new pu(colorStateList, f));
        View d = paVar.m33439d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo5420b(paVar, f3);
    }

    /* renamed from: a */
    public void mo5416a(pa paVar, float f) {
        m33416j(paVar).m33706a(f);
    }

    /* renamed from: a */
    public void mo5415a() {
    }

    /* renamed from: b */
    public void mo5420b(pa paVar, float f) {
        m33416j(paVar).m33707a(f, paVar.m33436a(), paVar.m33437b());
        mo5425f(paVar);
    }

    /* renamed from: a */
    public float mo5414a(pa paVar) {
        return m33416j(paVar).m33705a();
    }

    /* renamed from: b */
    public float mo5419b(pa paVar) {
        return mo5423d(paVar) * 2.0f;
    }

    /* renamed from: c */
    public float mo5421c(pa paVar) {
        return mo5423d(paVar) * 2.0f;
    }

    /* renamed from: d */
    public float mo5423d(pa paVar) {
        return m33416j(paVar).m33709b();
    }

    /* renamed from: c */
    public void mo5422c(pa paVar, float f) {
        paVar.m33439d().setElevation(f);
    }

    /* renamed from: e */
    public float mo5424e(pa paVar) {
        return paVar.m33439d().getElevation();
    }

    /* renamed from: f */
    public void mo5425f(pa paVar) {
        if (paVar.m33436a()) {
            float a = mo5414a(paVar);
            float d = mo5423d(paVar);
            int ceil = (int) Math.ceil((double) pv.m33713b(a, d, paVar.m33437b()));
            int ceil2 = (int) Math.ceil((double) pv.m33711a(a, d, paVar.m33437b()));
            paVar.m33434a(ceil, ceil2, ceil, ceil2);
            return;
        }
        paVar.m33434a(0, 0, 0, 0);
    }

    /* renamed from: g */
    public void mo5426g(pa paVar) {
        mo5420b(paVar, mo5414a(paVar));
    }

    /* renamed from: h */
    public void mo5427h(pa paVar) {
        mo5420b(paVar, mo5414a(paVar));
    }

    /* renamed from: a */
    public void mo5418a(pa paVar, ColorStateList colorStateList) {
        m33416j(paVar).m33708a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo5428i(pa paVar) {
        return m33416j(paVar).m33710c();
    }

    /* renamed from: j */
    private pu m33416j(pa paVar) {
        return (pu) paVar.m33438c();
    }
}
