package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManagerImpl;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback */
/* renamed from: do */
public abstract class C5020do<E> extends dm {
    /* renamed from: a */
    private final Activity f22371a;
    /* renamed from: b */
    final Context f22372b;
    /* renamed from: c */
    final int f22373c;
    /* renamed from: d */
    public final FragmentManagerImpl f22374d;
    /* renamed from: e */
    private final Handler f22375e;
    /* renamed from: f */
    private hr<String, dw> f22376f;
    /* renamed from: g */
    private boolean f22377g;
    /* renamed from: h */
    private dx f22378h;
    /* renamed from: i */
    private boolean f22379i;
    /* renamed from: j */
    private boolean f22380j;

    /* renamed from: g */
    public abstract E m28354g();

    protected C5020do(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    C5020do(Activity activity, Context context, Handler handler, int i) {
        this.f22374d = new FragmentManagerImpl();
        this.f22371a = activity;
        this.f22372b = context;
        this.f22375e = handler;
        this.f22373c = i;
    }

    /* renamed from: a */
    public void m28342a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean m28345a(Fragment fragment) {
        return true;
    }

    /* renamed from: b */
    public LayoutInflater m28347b() {
        return (LayoutInflater) this.f22372b.getSystemService("layout_inflater");
    }

    /* renamed from: d */
    public void m28351d() {
    }

    /* renamed from: a */
    public void m28338a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f22372b.startActivity(intent);
    }

    /* renamed from: a */
    public void m28339a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        cy.m25605a(this.f22371a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    public void m28340a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public boolean m28346a(String str) {
        return false;
    }

    /* renamed from: e */
    public boolean m28352e() {
        return true;
    }

    /* renamed from: f */
    public int m28353f() {
        return this.f22373c;
    }

    /* renamed from: a */
    public View mo4489a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo4490a() {
        return true;
    }

    /* renamed from: h */
    public Activity m28355h() {
        return this.f22371a;
    }

    /* renamed from: i */
    public Context m28356i() {
        return this.f22372b;
    }

    /* renamed from: j */
    public Handler m28357j() {
        return this.f22375e;
    }

    /* renamed from: k */
    public FragmentManagerImpl m28358k() {
        return this.f22374d;
    }

    /* renamed from: l */
    dx m28359l() {
        if (this.f22378h != null) {
            return this.f22378h;
        }
        this.f22379i = true;
        this.f22378h = m28337a("(root)", this.f22380j, true);
        return this.f22378h;
    }

    /* renamed from: b */
    public void m28349b(String str) {
        if (this.f22376f != null) {
            dx dxVar = (dx) this.f22376f.get(str);
            if (dxVar != null && !dxVar.f23409f) {
                dxVar.m29728h();
                this.f22376f.remove(str);
            }
        }
    }

    /* renamed from: b */
    public void m28348b(Fragment fragment) {
    }

    /* renamed from: m */
    public boolean m28360m() {
        return this.f22377g;
    }

    /* renamed from: n */
    void m28361n() {
        if (!this.f22380j) {
            this.f22380j = true;
            if (this.f22378h != null) {
                this.f22378h.m29722b();
            } else if (!this.f22379i) {
                this.f22378h = m28337a("(root)", this.f22380j, false);
                if (!(this.f22378h == null || this.f22378h.f23408e)) {
                    this.f22378h.m29722b();
                }
            }
            this.f22379i = true;
        }
    }

    /* renamed from: a */
    void m28343a(boolean z) {
        this.f22377g = z;
        if (this.f22378h != null && this.f22380j) {
            this.f22380j = false;
            if (z) {
                this.f22378h.m29724d();
            } else {
                this.f22378h.m29723c();
            }
        }
    }

    /* renamed from: o */
    void m28362o() {
        if (this.f22378h != null) {
            this.f22378h.m29728h();
        }
    }

    /* renamed from: p */
    void m28363p() {
        if (this.f22376f != null) {
            int size = this.f22376f.size();
            dx[] dxVarArr = new dx[size];
            for (int i = size - 1; i >= 0; i--) {
                dxVarArr[i] = (dx) this.f22376f.m30557c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                dx dxVar = dxVarArr[i2];
                dxVar.m29725e();
                dxVar.m29727g();
            }
        }
    }

    /* renamed from: a */
    public dx m28337a(String str, boolean z, boolean z2) {
        if (this.f22376f == null) {
            this.f22376f = new hr();
        }
        dx dxVar = (dx) this.f22376f.get(str);
        if (dxVar == null && z2) {
            dxVar = new dx(str, this, z);
            this.f22376f.put(str, dxVar);
            return dxVar;
        } else if (!z || dxVar == null || dxVar.f23408e) {
            return dxVar;
        } else {
            dxVar.m29722b();
            return dxVar;
        }
    }

    /* renamed from: q */
    hr<String, dw> m28364q() {
        int i;
        int i2 = 0;
        if (this.f22376f != null) {
            int size = this.f22376f.size();
            dx[] dxVarArr = new dx[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                dxVarArr[i3] = (dx) this.f22376f.m30557c(i3);
            }
            boolean m = m28360m();
            i = 0;
            while (i2 < size) {
                dx dxVar = dxVarArr[i2];
                if (!dxVar.f23409f && m) {
                    if (!dxVar.f23408e) {
                        dxVar.m29722b();
                    }
                    dxVar.m29724d();
                }
                if (dxVar.f23409f) {
                    i = 1;
                } else {
                    dxVar.m29728h();
                    this.f22376f.remove(dxVar.f23407d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            return this.f22376f;
        }
        return null;
    }

    /* renamed from: a */
    void m28341a(hr<String, dw> hrVar) {
        if (hrVar != null) {
            int size = hrVar.size();
            for (int i = 0; i < size; i++) {
                ((dx) hrVar.m30557c(i)).m29718a(this);
            }
        }
        this.f22376f = hrVar;
    }

    /* renamed from: b */
    void m28350b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f22380j);
        if (this.f22378h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f22378h)));
            printWriter.println(":");
            this.f22378h.m29720a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
