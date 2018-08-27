package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Views;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* compiled from: VisibilityTracker */
/* renamed from: cab */
public class cab {
    @VisibleForTesting
    /* renamed from: a */
    final OnPreDrawListener f8389a;
    @VisibleForTesting
    /* renamed from: b */
    WeakReference<ViewTreeObserver> f8390b;
    /* renamed from: c */
    private final ArrayList<View> f8391c;
    /* renamed from: d */
    private long f8392d;
    /* renamed from: e */
    private final Map<View, C1631a> f8393e;
    /* renamed from: f */
    private final C1632b f8394f;
    /* renamed from: g */
    private C1634d f8395g;
    /* renamed from: h */
    private final C1633c f8396h;
    /* renamed from: i */
    private final Handler f8397i;
    /* renamed from: j */
    private boolean f8398j;

    /* compiled from: VisibilityTracker */
    /* renamed from: cab$1 */
    class C16301 implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ cab f8380a;

        C16301(cab cab) {
            this.f8380a = cab;
        }

        public boolean onPreDraw() {
            this.f8380a.m12015c();
            return true;
        }
    }

    /* compiled from: VisibilityTracker */
    /* renamed from: cab$a */
    static class C1631a {
        /* renamed from: a */
        int f8381a;
        /* renamed from: b */
        int f8382b;
        /* renamed from: c */
        long f8383c;
        /* renamed from: d */
        View f8384d;

        C1631a() {
        }
    }

    /* compiled from: VisibilityTracker */
    /* renamed from: cab$b */
    public static class C1632b {
        /* renamed from: a */
        private final Rect f8385a = new Rect();

        /* renamed from: a */
        public boolean m12000a(long j, int i) {
            return SystemClock.uptimeMillis() - j >= ((long) i);
        }

        /* renamed from: a */
        public boolean m12001a(View view, View view2, int i) {
            if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || !view2.getGlobalVisibleRect(this.f8385a)) {
                return false;
            }
            long height = ((long) this.f8385a.height()) * ((long) this.f8385a.width());
            long height2 = ((long) view2.getHeight()) * ((long) view2.getWidth());
            if (height2 <= 0 || height * 100 < height2 * ((long) i)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: VisibilityTracker */
    /* renamed from: cab$c */
    class C1633c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cab f8386a;
        /* renamed from: b */
        private final ArrayList<View> f8387b = new ArrayList();
        /* renamed from: c */
        private final ArrayList<View> f8388c = new ArrayList();

        C1633c(cab cab) {
            this.f8386a = cab;
        }

        public void run() {
            this.f8386a.f8398j = false;
            for (Entry entry : this.f8386a.f8393e.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((C1631a) entry.getValue()).f8381a;
                int i2 = ((C1631a) entry.getValue()).f8382b;
                View view2 = ((C1631a) entry.getValue()).f8384d;
                if (this.f8386a.f8394f.m12001a(view2, view, i)) {
                    this.f8387b.add(view);
                } else if (!this.f8386a.f8394f.m12001a(view2, view, i2)) {
                    this.f8388c.add(view);
                }
            }
            if (this.f8386a.f8395g != null) {
                this.f8386a.f8395g.onVisibilityChanged(this.f8387b, this.f8388c);
            }
            this.f8387b.clear();
            this.f8388c.clear();
        }
    }

    /* compiled from: VisibilityTracker */
    /* renamed from: cab$d */
    public interface C1634d {
        void onVisibilityChanged(List<View> list, List<View> list2);
    }

    public cab(Context context) {
        this(context, new WeakHashMap(10), new C1632b(), new Handler());
    }

    @VisibleForTesting
    cab(Context context, Map<View, C1631a> map, C1632b c1632b, Handler handler) {
        this.f8392d = 0;
        this.f8393e = map;
        this.f8394f = c1632b;
        this.f8397i = handler;
        this.f8396h = new C1633c(this);
        this.f8391c = new ArrayList(50);
        this.f8389a = new C16301(this);
        this.f8390b = new WeakReference(null);
        m12004a(context, null);
    }

    /* renamed from: a */
    private void m12004a(Context context, View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f8390b.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View topmostView = Views.getTopmostView(context, view);
            if (topmostView == null) {
                MoPubLog.d("Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            viewTreeObserver = topmostView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f8390b = new WeakReference(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f8389a);
                return;
            }
            MoPubLog.w("Visibility Tracker was unable to track views because the root view tree observer was not alive");
        }
    }

    /* renamed from: a */
    public void m12013a(C1634d c1634d) {
        this.f8395g = c1634d;
    }

    /* renamed from: a */
    public void m12010a(View view, int i) {
        m12011a(view, view, i);
    }

    /* renamed from: a */
    void m12011a(View view, View view2, int i) {
        m12012a(view, view2, i, i);
    }

    /* renamed from: a */
    public void m12012a(View view, View view2, int i, int i2) {
        m12004a(view2.getContext(), view2);
        C1631a c1631a = (C1631a) this.f8393e.get(view2);
        if (c1631a == null) {
            c1631a = new C1631a();
            this.f8393e.put(view2, c1631a);
            m12015c();
        }
        int min = Math.min(i2, i);
        c1631a.f8384d = view;
        c1631a.f8381a = i;
        c1631a.f8382b = min;
        c1631a.f8383c = this.f8392d;
        this.f8392d++;
        if (this.f8392d % 50 == 0) {
            m12003a(this.f8392d - 50);
        }
    }

    /* renamed from: a */
    private void m12003a(long j) {
        for (Entry entry : this.f8393e.entrySet()) {
            if (((C1631a) entry.getValue()).f8383c < j) {
                this.f8391c.add(entry.getKey());
            }
        }
        Iterator it = this.f8391c.iterator();
        while (it.hasNext()) {
            m12009a((View) it.next());
        }
        this.f8391c.clear();
    }

    /* renamed from: a */
    public void m12009a(View view) {
        this.f8393e.remove(view);
    }

    /* renamed from: a */
    public void m12008a() {
        this.f8393e.clear();
        this.f8397i.removeMessages(0);
        this.f8398j = false;
    }

    /* renamed from: b */
    public void m12014b() {
        m12008a();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f8390b.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f8389a);
        }
        this.f8390b.clear();
        this.f8395g = null;
    }

    /* renamed from: c */
    void m12015c() {
        if (!this.f8398j) {
            this.f8398j = true;
            this.f8397i.postDelayed(this.f8396h, 100);
        }
    }
}
