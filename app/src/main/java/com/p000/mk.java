package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;
import p000.mg.C5529a;
import p000.ni.C5551a;

@TargetApi(9)
/* compiled from: AppCompatDelegateImplBase */
/* renamed from: mk */
abstract class mk extends mj {
    /* renamed from: m */
    private static boolean f24504m = true;
    /* renamed from: n */
    private static final boolean f24505n = (VERSION.SDK_INT < 21);
    /* renamed from: o */
    private static final int[] f24506o = new int[]{16842836};
    /* renamed from: a */
    final Context f24507a;
    /* renamed from: b */
    final Window f24508b;
    /* renamed from: c */
    final Callback f24509c = this.f24508b.getCallback();
    /* renamed from: d */
    final Callback f24510d;
    /* renamed from: e */
    final mi f24511e;
    /* renamed from: f */
    ActionBar f24512f;
    /* renamed from: g */
    MenuInflater f24513g;
    /* renamed from: h */
    boolean f24514h;
    /* renamed from: i */
    boolean f24515i;
    /* renamed from: j */
    boolean f24516j;
    /* renamed from: k */
    boolean f24517k;
    /* renamed from: l */
    boolean f24518l;
    /* renamed from: p */
    private CharSequence f24519p;
    /* renamed from: q */
    private boolean f24520q;
    /* renamed from: r */
    private boolean f24521r;

    /* compiled from: AppCompatDelegateImplBase */
    /* renamed from: mk$a */
    class C5532a implements C5529a {
        /* renamed from: a */
        final /* synthetic */ mk f24501a;

        C5532a(mk mkVar) {
            this.f24501a = mkVar;
        }

        /* renamed from: a */
        public void mo5172a(int i) {
            ActionBar a = this.f24501a.mo5180a();
            if (a != null) {
                a.b(i);
            }
        }
    }

    /* compiled from: AppCompatDelegateImplBase */
    /* renamed from: mk$b */
    class C5533b extends np {
        /* renamed from: a */
        final /* synthetic */ mk f24503a;

        C5533b(mk mkVar, Callback callback) {
            this.f24503a = mkVar;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f24503a.mo5202a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.f24503a.mo5201a(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof nx)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public void onContentChanged() {
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            nx nxVar;
            if (menu instanceof nx) {
                nxVar = (nx) menu;
            } else {
                nxVar = null;
            }
            if (i == 0 && nxVar == null) {
                return false;
            }
            if (nxVar != null) {
                nxVar.m33163c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (nxVar == null) {
                return onPreparePanel;
            }
            nxVar.m33163c(false);
            return onPreparePanel;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f24503a.mo5209b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f24503a.mo5194a(i, menu);
        }
    }

    /* renamed from: a */
    abstract void mo5194a(int i, Menu menu);

    /* renamed from: a */
    abstract boolean mo5201a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    abstract boolean mo5202a(KeyEvent keyEvent);

    /* renamed from: b */
    abstract ni mo5204b(C5551a c5551a);

    /* renamed from: b */
    abstract void mo5208b(CharSequence charSequence);

    /* renamed from: b */
    abstract boolean mo5209b(int i, Menu menu);

    /* renamed from: m */
    abstract void mo5214m();

    static {
        if (f24505n && !f24504m) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (m32669a(th)) {
                        Throwable notFoundException = new NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                /* renamed from: a */
                private boolean m32669a(Throwable th) {
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    if (message == null) {
                        return false;
                    }
                    if (message.contains("drawable") || message.contains("Drawable")) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    mk(Context context, Window window, mi miVar) {
        this.f24507a = context;
        this.f24508b = window;
        this.f24511e = miVar;
        if (this.f24509c instanceof C5533b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f24510d = mo5217a(this.f24509c);
        this.f24508b.setCallback(this.f24510d);
        qf a = qf.m33776a(context, null, f24506o);
        Drawable b = a.m33784b(0);
        if (b != null) {
            this.f24508b.setBackgroundDrawable(b);
        }
        a.m33781a();
    }

    /* renamed from: a */
    Callback mo5217a(Callback callback) {
        return new C5533b(this, callback);
    }

    /* renamed from: a */
    public ActionBar mo5180a() {
        mo5214m();
        return this.f24512f;
    }

    /* renamed from: n */
    final ActionBar m32688n() {
        return this.f24512f;
    }

    /* renamed from: b */
    public MenuInflater mo5182b() {
        if (this.f24513g == null) {
            mo5214m();
            this.f24513g = new nn(this.f24512f != null ? this.f24512f.c() : this.f24507a);
        }
        return this.f24513g;
    }

    /* renamed from: h */
    public final C5529a mo5187h() {
        return new C5532a(this);
    }

    /* renamed from: o */
    final Context m32689o() {
        Context context = null;
        ActionBar a = mo5180a();
        if (a != null) {
            context = a.c();
        }
        if (context == null) {
            return this.f24507a;
        }
        return context;
    }

    /* renamed from: c */
    public void mo5183c() {
        this.f24520q = true;
    }

    /* renamed from: d */
    public void mo5185d() {
        this.f24520q = false;
    }

    /* renamed from: g */
    public void mo5186g() {
        this.f24521r = true;
    }

    /* renamed from: p */
    public boolean mo5219p() {
        return false;
    }

    /* renamed from: j */
    public boolean mo5188j() {
        return false;
    }

    /* renamed from: q */
    final boolean m32691q() {
        return this.f24521r;
    }

    /* renamed from: r */
    final Callback m32692r() {
        return this.f24508b.getCallback();
    }

    /* renamed from: a */
    public final void mo5181a(CharSequence charSequence) {
        this.f24519p = charSequence;
        mo5208b(charSequence);
    }

    /* renamed from: c */
    public void mo5184c(Bundle bundle) {
    }

    /* renamed from: s */
    final CharSequence m32693s() {
        if (this.f24509c instanceof Activity) {
            return ((Activity) this.f24509c).getTitle();
        }
        return this.f24519p;
    }
}
