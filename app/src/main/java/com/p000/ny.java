package com.p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.inmobi.commons.internal.ApiStatCollector.ApiEventType;
import p000.mh.C5530a;
import p000.mx.C5574g;
import p000.oe.C5548a;

/* compiled from: MenuDialogHelper */
/* renamed from: ny */
class ny implements OnClickListener, OnDismissListener, OnKeyListener, C5548a {
    /* renamed from: a */
    nv f24875a;
    /* renamed from: b */
    private nx f24876b;
    /* renamed from: c */
    private mh f24877c;
    /* renamed from: d */
    private C5548a f24878d;

    public ny(nx nxVar) {
        this.f24876b = nxVar;
    }

    /* renamed from: a */
    public void m33186a(IBinder iBinder) {
        nx nxVar = this.f24876b;
        C5530a c5530a = new C5530a(nxVar.m33170e());
        this.f24875a = new nv(c5530a.m32622a(), C5574g.abc_list_menu_item_layout);
        this.f24875a.mo5256a((C5548a) this);
        this.f24876b.m33149a(this.f24875a);
        c5530a.m32629a(this.f24875a.m33120d(), (OnClickListener) this);
        View o = nxVar.m33181o();
        if (o != null) {
            c5530a.m32628a(o);
        } else {
            c5530a.m32627a(nxVar.m33180n()).m32630a(nxVar.m33179m());
        }
        c5530a.m32626a((OnKeyListener) this);
        this.f24877c = c5530a.m32636b();
        this.f24877c.setOnDismissListener(this);
        LayoutParams attributes = this.f24877c.getWindow().getAttributes();
        attributes.type = ApiEventType.API_IMAI_PING;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f24877c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f24877c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f24877c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f24876b.m33159b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f24876b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void m33185a() {
        if (this.f24877c != null) {
            this.f24877c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f24875a.mo5255a(this.f24876b, true);
    }

    /* renamed from: a */
    public void mo5221a(nx nxVar, boolean z) {
        if (z || nxVar == this.f24876b) {
            m33185a();
        }
        if (this.f24878d != null) {
            this.f24878d.mo5221a(nxVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo5222a(nx nxVar) {
        if (this.f24878d != null) {
            return this.f24878d.mo5222a(nxVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f24876b.m33152a((nz) this.f24875a.m33120d().getItem(i), 0);
    }
}
