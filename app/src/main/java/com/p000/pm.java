package com.p000;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0597m;
import android.support.v7.widget.RecyclerView.C0605t;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.C0579a;
import com.facebook.common.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
/* renamed from: pm */
public final class pm implements Runnable {
    /* renamed from: a */
    public static final ThreadLocal<pm> f25101a = new ThreadLocal();
    /* renamed from: e */
    static Comparator<C5678b> f25102e = new C56761();
    /* renamed from: b */
    ArrayList<RecyclerView> f25103b = new ArrayList();
    /* renamed from: c */
    long f25104c;
    /* renamed from: d */
    public long f25105d;
    /* renamed from: f */
    private ArrayList<C5678b> f25106f = new ArrayList();

    /* compiled from: GapWorker */
    /* renamed from: pm$1 */
    static class C56761 implements Comparator<C5678b> {
        C56761() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m33623a((C5678b) obj, (C5678b) obj2);
        }

        /* renamed from: a */
        public int m33623a(C5678b c5678b, C5678b c5678b2) {
            int i = -1;
            if ((c5678b.f25099d == null ? 1 : 0) != (c5678b2.f25099d == null ? 1 : 0)) {
                return c5678b.f25099d == null ? 1 : -1;
            } else {
                if (c5678b.f25096a != c5678b2.f25096a) {
                    if (!c5678b.f25096a) {
                        i = 1;
                    }
                    return i;
                }
                int i2 = c5678b2.f25097b - c5678b.f25097b;
                if (i2 != 0) {
                    return i2;
                }
                i2 = c5678b.f25098c - c5678b2.f25098c;
                if (i2 == 0) {
                    return 0;
                }
                return i2;
            }
        }
    }

    /* compiled from: GapWorker */
    /* renamed from: pm$a */
    public static class C5677a implements C0579a {
        /* renamed from: a */
        int f25092a;
        /* renamed from: b */
        int f25093b;
        /* renamed from: c */
        int[] f25094c;
        /* renamed from: d */
        int f25095d;

        /* renamed from: a */
        void m33625a(int i, int i2) {
            this.f25092a = i;
            this.f25093b = i2;
        }

        /* renamed from: a */
        void m33626a(RecyclerView recyclerView, boolean z) {
            this.f25095d = 0;
            if (this.f25094c != null) {
                Arrays.fill(this.f25094c, -1);
            }
            LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.m33321d()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.f25092a, this.f25093b, recyclerView.mState, this);
                }
                if (this.f25095d > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = this.f25095d;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.b();
                }
            }
        }

        /* renamed from: b */
        public void m33628b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            } else {
                int i3 = this.f25095d * 2;
                if (this.f25094c == null) {
                    this.f25094c = new int[4];
                    Arrays.fill(this.f25094c, -1);
                } else if (i3 >= this.f25094c.length) {
                    Object obj = this.f25094c;
                    this.f25094c = new int[(i3 * 2)];
                    System.arraycopy(obj, 0, this.f25094c, 0, obj.length);
                }
                this.f25094c[i3] = i;
                this.f25094c[i3 + 1] = i2;
                this.f25095d++;
            }
        }

        /* renamed from: a */
        public boolean m33627a(int i) {
            if (this.f25094c == null) {
                return false;
            }
            int i2 = this.f25095d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.f25094c[i3] == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void m33624a() {
            if (this.f25094c != null) {
                Arrays.fill(this.f25094c, -1);
            }
            this.f25095d = 0;
        }
    }

    /* compiled from: GapWorker */
    /* renamed from: pm$b */
    static class C5678b {
        /* renamed from: a */
        public boolean f25096a;
        /* renamed from: b */
        public int f25097b;
        /* renamed from: c */
        public int f25098c;
        /* renamed from: d */
        public RecyclerView f25099d;
        /* renamed from: e */
        public int f25100e;

        C5678b() {
        }

        /* renamed from: a */
        public void m33629a() {
            this.f25096a = false;
            this.f25097b = 0;
            this.f25098c = 0;
            this.f25099d = null;
            this.f25100e = 0;
        }
    }

    /* renamed from: a */
    public void m33637a(RecyclerView recyclerView) {
        this.f25103b.add(recyclerView);
    }

    /* renamed from: b */
    public void m33639b(RecyclerView recyclerView) {
        this.f25103b.remove(recyclerView);
    }

    /* renamed from: a */
    public void m33638a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f25104c == 0) {
            this.f25104c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m33625a(i, i2);
    }

    /* renamed from: a */
    private void m33631a() {
        int size = this.f25103b.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3;
            RecyclerView recyclerView = (RecyclerView) this.f25103b.get(i);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m33626a(recyclerView, false);
                i3 = recyclerView.mPrefetchRegistry.f25095d + i2;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        this.f25106f.ensureCapacity(i2);
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            recyclerView = (RecyclerView) this.f25103b.get(i4);
            if (recyclerView.getWindowVisibility() == 0) {
                C5677a c5677a = recyclerView.mPrefetchRegistry;
                int abs = Math.abs(c5677a.f25092a) + Math.abs(c5677a.f25093b);
                boolean z2 = z;
                for (i = 0; i < c5677a.f25095d * 2; i += 2) {
                    C5678b c5678b;
                    boolean z3;
                    if (z2 >= this.f25106f.size()) {
                        c5678b = new C5678b();
                        this.f25106f.add(c5678b);
                    } else {
                        c5678b = (C5678b) this.f25106f.get(z2);
                    }
                    int i5 = c5677a.f25094c[i + 1];
                    if (i5 <= abs) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c5678b.f25096a = z3;
                    c5678b.f25097b = abs;
                    c5678b.f25098c = i5;
                    c5678b.f25099d = recyclerView;
                    c5678b.f25100e = c5677a.f25094c[i];
                    z2++;
                }
                z = z2;
            }
        }
        Collections.sort(this.f25106f, f25102e);
    }

    /* renamed from: a */
    static boolean m33634a(RecyclerView recyclerView, int i) {
        int c = recyclerView.mChildHelper.m33492c();
        for (int i2 = 0; i2 < c; i2++) {
            C0605t childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m33495d(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C0605t m33630a(RecyclerView recyclerView, int i, long j) {
        if (pm.m33634a(recyclerView, i)) {
            return null;
        }
        C0597m c0597m = recyclerView.mRecycler;
        C0605t a = c0597m.a(i, false, j);
        if (a == null) {
            return a;
        }
        if (a.isBound()) {
            c0597m.a(a.itemView);
            return a;
        }
        c0597m.a(a, false);
        return a;
    }

    /* renamed from: a */
    private void m33632a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m33492c() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C5677a c5677a = recyclerView.mPrefetchRegistry;
            c5677a.m33626a(recyclerView, true);
            if (c5677a.f25095d != 0) {
                try {
                    gy.m30492a("RV Nested Prefetch");
                    recyclerView.mState.a(recyclerView.mAdapter);
                    for (int i = 0; i < c5677a.f25095d * 2; i += 2) {
                        m33630a(recyclerView, c5677a.f25094c[i], j);
                    }
                } finally {
                    gy.m30491a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m33633a(C5678b c5678b, long j) {
        C0605t a = m33630a(c5678b.f25099d, c5678b.f25100e, c5678b.f25096a ? Clock.MAX_TIME : j);
        if (a != null && a.mNestedRecyclerView != null) {
            m33632a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: b */
    private void m33635b(long j) {
        int i = 0;
        while (i < this.f25106f.size()) {
            C5678b c5678b = (C5678b) this.f25106f.get(i);
            if (c5678b.f25099d != null) {
                m33633a(c5678b, j);
                c5678b.m33629a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    void m33636a(long j) {
        m33631a();
        m33635b(j);
    }

    public void run() {
        try {
            gy.m30492a("RV Prefetch");
            if (!this.f25103b.isEmpty()) {
                int size = this.f25103b.size();
                int i = 0;
                long j = 0;
                while (i < size) {
                    long max;
                    RecyclerView recyclerView = (RecyclerView) this.f25103b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        max = Math.max(recyclerView.getDrawingTime(), j);
                    } else {
                        max = j;
                    }
                    i++;
                    j = max;
                }
                if (j == 0) {
                    this.f25104c = 0;
                    gy.m30491a();
                    return;
                }
                m33636a(TimeUnit.MILLISECONDS.toNanos(j) + this.f25105d);
                this.f25104c = 0;
                gy.m30491a();
            }
        } finally {
            this.f25104c = 0;
            gy.m30491a();
        }
    }
}
