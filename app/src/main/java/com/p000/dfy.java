package com.p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: LifecycleModule */
/* renamed from: dfy */
public class dfy extends dfx {
    /* renamed from: a */
    private LinkedList<dfx> f21539a = new LinkedList();

    /* renamed from: a */
    public void m27141a(dfx dfx) {
        this.f21539a.add(dfx);
    }

    /* renamed from: a */
    public void mo4394a(Activity activity) {
        super.mo4394a(activity);
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4394a(activity);
        }
    }

    /* renamed from: s */
    public void mo4396s() {
        super.mo4396s();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4396s();
        }
    }

    /* renamed from: b */
    public void mo4388b(Bundle bundle) {
        super.mo4388b(bundle);
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4388b(bundle);
        }
    }

    /* renamed from: d */
    public void mo4395d() {
        super.mo4395d();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4395d();
        }
    }

    public void s_() {
        super.s_();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).s_();
        }
    }

    public void t_() {
        super.t_();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).t_();
        }
    }

    public void u_() {
        super.u_();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).u_();
        }
    }

    public void w_() {
        super.w_();
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).w_();
        }
    }

    /* renamed from: a */
    public void mo4387a(Bundle bundle) {
        super.mo4387a(bundle);
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4387a(bundle);
        }
    }

    /* renamed from: a */
    public void mo4393a(int i, int i2, Intent intent) {
        super.mo4393a(i, i2, intent);
        Iterator it = this.f21539a.iterator();
        while (it.hasNext()) {
            ((dfx) it.next()).mo4393a(i, i2, intent);
        }
    }
}
