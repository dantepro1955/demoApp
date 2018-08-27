package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@bhd
/* renamed from: ayf */
public class ayf implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: c */
    private static final long f4998c = ((Long) bbb.bo.m7064c()).longValue();
    /* renamed from: a */
    BroadcastReceiver f4999a;
    /* renamed from: b */
    WeakReference<View> f5000b;
    /* renamed from: d */
    private final Context f5001d;
    /* renamed from: e */
    private Application f5002e;
    /* renamed from: f */
    private final WindowManager f5003f;
    /* renamed from: g */
    private final PowerManager f5004g;
    /* renamed from: h */
    private final KeyguardManager f5005h;
    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f5006i;
    /* renamed from: j */
    private ayg f5007j;
    /* renamed from: k */
    private bkr f5008k = new bkr(f4998c);
    /* renamed from: l */
    private boolean f5009l = false;
    /* renamed from: m */
    private int f5010m = -1;
    /* renamed from: n */
    private HashSet<C0903b> f5011n = new HashSet();
    /* renamed from: o */
    private DisplayMetrics f5012o;

    /* renamed from: ayf$1 */
    class C09001 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ayf f4983a;

        C09001(ayf ayf) {
            this.f4983a = ayf;
        }

        public void run() {
            this.f4983a.m6553a(3);
        }
    }

    /* renamed from: ayf$2 */
    class C09012 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ ayf f4984a;

        C09012(ayf ayf) {
            this.f4984a = ayf;
        }

        public void onReceive(Context context, Intent intent) {
            this.f4984a.m6553a(3);
        }
    }

    /* renamed from: ayf$a */
    public static class C0902a {
        /* renamed from: a */
        public final long f4985a;
        /* renamed from: b */
        public final boolean f4986b;
        /* renamed from: c */
        public final boolean f4987c;
        /* renamed from: d */
        public final int f4988d;
        /* renamed from: e */
        public final Rect f4989e;
        /* renamed from: f */
        public final Rect f4990f;
        /* renamed from: g */
        public final Rect f4991g;
        /* renamed from: h */
        public final boolean f4992h;
        /* renamed from: i */
        public final Rect f4993i;
        /* renamed from: j */
        public final boolean f4994j;
        /* renamed from: k */
        public final Rect f4995k;
        /* renamed from: l */
        public final float f4996l;
        /* renamed from: m */
        public final boolean f4997m;

        public C0902a(long j, boolean z, boolean z2, int i, Rect rect, Rect rect2, Rect rect3, boolean z3, Rect rect4, boolean z4, Rect rect5, float f, boolean z5) {
            this.f4985a = j;
            this.f4986b = z;
            this.f4987c = z2;
            this.f4988d = i;
            this.f4989e = rect;
            this.f4990f = rect2;
            this.f4991g = rect3;
            this.f4992h = z3;
            this.f4993i = rect4;
            this.f4994j = z4;
            this.f4995k = rect5;
            this.f4996l = f;
            this.f4997m = z5;
        }
    }

    /* renamed from: ayf$b */
    public interface C0903b {
        /* renamed from: a */
        void mo1249a(C0902a c0902a);
    }

    public ayf(Context context, View view) {
        this.f5001d = context.getApplicationContext();
        this.f5003f = (WindowManager) context.getSystemService("window");
        this.f5004g = (PowerManager) this.f5001d.getSystemService("power");
        this.f5005h = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f5001d instanceof Application) {
            this.f5002e = (Application) this.f5001d;
            this.f5007j = new ayg((Application) this.f5001d, this);
        }
        this.f5012o = context.getResources().getDisplayMetrics();
        m6564a(view);
    }

    /* renamed from: a */
    private void m6553a(int i) {
        if (this.f5011n.size() != 0 && this.f5000b != null) {
            View view = (View) this.f5000b.get();
            Object obj = i == 1 ? 1 : null;
            Object obj2 = view == null ? 1 : null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            boolean z = false;
            Rect rect3 = new Rect();
            boolean z2 = false;
            Rect rect4 = new Rect();
            Rect rect5 = new Rect();
            rect5.right = this.f5003f.getDefaultDisplay().getWidth();
            rect5.bottom = this.f5003f.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                z = view.getGlobalVisibleRect(rect2);
                z2 = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Throwable e) {
                    bky.m9007b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f5010m != -1) {
                windowVisibility = this.f5010m;
            }
            boolean z3 = obj2 == null && ako.m2343e().m9114a(view, this.f5004g, this.f5005h) && z && z2 && windowVisibility == 0;
            if (obj != null && !this.f5008k.m9265a() && z3 == this.f5009l) {
                return;
            }
            if (z3 || this.f5009l || i != 1) {
                C0902a c0902a = new C0902a(ako.m2349k().mo607b(), this.f5004g.isScreenOn(), view != null ? ako.m2345g().mo1278a(view) : false, view != null ? view.getWindowVisibility() : 8, m6562a(rect5), m6562a(rect), m6562a(rect2), z, m6562a(rect3), z2, m6562a(rect4), this.f5012o.density, z3);
                Iterator it = this.f5011n.iterator();
                while (it.hasNext()) {
                    ((C0903b) it.next()).mo1249a(c0902a);
                }
                this.f5009l = z3;
            }
        }
    }

    /* renamed from: a */
    private void m6554a(Activity activity, int i) {
        if (this.f5000b != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f5000b.get();
                if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                    this.f5010m = i;
                }
            }
        }
    }

    /* renamed from: b */
    private int m6556b(int i) {
        return (int) (((float) i) / this.f5012o.density);
    }

    /* renamed from: b */
    private void m6557b() {
        ako.m2343e();
        bkg.f6710a.post(new C09001(this));
    }

    /* renamed from: b */
    private void m6558b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f5006i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m6559c();
        if (this.f5002e != null) {
            try {
                this.f5002e.registerActivityLifecycleCallbacks(this.f5007j);
            } catch (Throwable e) {
                bky.m9007b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: c */
    private void m6559c() {
        if (this.f4999a == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f4999a = new C09012(this);
            this.f5001d.registerReceiver(this.f4999a, intentFilter);
        }
    }

    /* renamed from: c */
    private void m6560c(View view) {
        ViewTreeObserver viewTreeObserver;
        try {
            if (this.f5006i != null) {
                viewTreeObserver = (ViewTreeObserver) this.f5006i.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f5006i = null;
            }
        } catch (Throwable e) {
            bky.m9007b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this);
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        } catch (Throwable e2) {
            bky.m9007b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        m6561d();
        if (this.f5002e != null) {
            try {
                this.f5002e.unregisterActivityLifecycleCallbacks(this.f5007j);
            } catch (Throwable e22) {
                bky.m9007b("Error registering activity lifecycle callbacks.", e22);
            }
        }
    }

    /* renamed from: d */
    private void m6561d() {
        if (this.f4999a != null) {
            try {
                this.f5001d.unregisterReceiver(this.f4999a);
            } catch (Throwable e) {
                bky.m9007b("Failed trying to unregister the receiver", e);
            } catch (Throwable e2) {
                ako.m2347i().m8934a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f4999a = null;
        }
    }

    /* renamed from: a */
    Rect m6562a(Rect rect) {
        return new Rect(m6556b(rect.left), m6556b(rect.top), m6556b(rect.right), m6556b(rect.bottom));
    }

    /* renamed from: a */
    public void m6563a() {
        m6553a(4);
    }

    /* renamed from: a */
    public void m6564a(View view) {
        View view2 = this.f5000b != null ? (View) this.f5000b.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m6560c(view2);
        }
        this.f5000b = new WeakReference(view);
        if (view != null) {
            if (ako.m2345g().mo1278a(view)) {
                m6558b(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public void m6565a(C0903b c0903b) {
        this.f5011n.add(c0903b);
        m6553a(3);
    }

    /* renamed from: b */
    public void m6566b(C0903b c0903b) {
        this.f5011n.remove(c0903b);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m6554a(activity, 0);
        m6553a(3);
        m6557b();
    }

    public void onActivityDestroyed(Activity activity) {
        m6553a(3);
        m6557b();
    }

    public void onActivityPaused(Activity activity) {
        m6554a(activity, 4);
        m6553a(3);
        m6557b();
    }

    public void onActivityResumed(Activity activity) {
        m6554a(activity, 0);
        m6553a(3);
        m6557b();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6553a(3);
        m6557b();
    }

    public void onActivityStarted(Activity activity) {
        m6554a(activity, 0);
        m6553a(3);
        m6557b();
    }

    public void onActivityStopped(Activity activity) {
        m6553a(3);
        m6557b();
    }

    public void onGlobalLayout() {
        m6553a(2);
        m6557b();
    }

    public void onScrollChanged() {
        m6553a(1);
    }

    public void onViewAttachedToWindow(View view) {
        this.f5010m = -1;
        m6558b(view);
        m6553a(3);
    }

    public void onViewDetachedFromWindow(View view) {
        this.f5010m = -1;
        m6553a(3);
        m6557b();
        m6560c(view);
    }
}
