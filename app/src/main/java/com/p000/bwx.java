package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.karumi.dexter.DexterActivity;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DexterInstance */
/* renamed from: bwx */
final class bwx {
    /* renamed from: a */
    private static final bxl f8043a = new bxk();
    /* renamed from: b */
    private final Context f8044b;
    /* renamed from: c */
    private final bwv f8045c;
    /* renamed from: d */
    private final bwy f8046d;
    /* renamed from: e */
    private final Collection<String> f8047e;
    /* renamed from: f */
    private final bxc f8048f;
    /* renamed from: g */
    private final AtomicBoolean f8049g;
    /* renamed from: h */
    private final AtomicBoolean f8050h;
    /* renamed from: i */
    private final Object f8051i = new Object();
    /* renamed from: j */
    private Activity f8052j;
    /* renamed from: k */
    private bxl f8053k = f8043a;

    /* compiled from: DexterInstance */
    /* renamed from: bwx$a */
    final class C1571a {
        /* renamed from: a */
        final /* synthetic */ bwx f8040a;
        /* renamed from: b */
        private final Collection<String> f8041b;
        /* renamed from: c */
        private final Collection<String> f8042c;

        private C1571a(bwx bwx) {
            this.f8040a = bwx;
            this.f8041b = new LinkedList();
            this.f8042c = new LinkedList();
        }

        /* renamed from: a */
        private void m11584a(String str) {
            this.f8041b.add(str);
        }

        /* renamed from: b */
        private void m11588b(String str) {
            this.f8042c.add(str);
        }

        /* renamed from: a */
        private Collection<String> m11581a() {
            return this.f8041b;
        }

        /* renamed from: b */
        private Collection<String> m11585b() {
            return this.f8042c;
        }
    }

    bwx(Context context, bwv bwv, bwy bwy) {
        this.f8044b = context.getApplicationContext();
        this.f8045c = bwv;
        this.f8046d = bwy;
        this.f8047e = new TreeSet();
        this.f8048f = new bxc();
        this.f8049g = new AtomicBoolean();
        this.f8050h = new AtomicBoolean();
    }

    /* renamed from: a */
    void m11602a(bxo bxo, String str, bxf bxf) {
        m11591b(bxo, str, bxf);
    }

    /* renamed from: a */
    void m11601a(Activity activity) {
        this.f8052j = activity;
        C1571a c1571a = null;
        synchronized (this.f8051i) {
            if (activity != null) {
                c1571a = m11592d(this.f8047e);
            }
        }
        if (c1571a != null) {
            m11595e(c1571a.m11581a());
            m11596f(c1571a.m11585b());
        }
    }

    /* renamed from: a */
    void m11603a(Collection<String> collection) {
        m11596f(collection);
    }

    /* renamed from: b */
    void m11605b(Collection<String> collection) {
        m11597g(collection);
    }

    /* renamed from: a */
    void m11600a() {
        this.f8050h.set(true);
        m11606c(this.f8047e);
    }

    /* renamed from: b */
    void m11604b() {
        this.f8050h.set(false);
        m11597g(this.f8047e);
    }

    /* renamed from: c */
    boolean m11607c() {
        return this.f8049g.get();
    }

    /* renamed from: c */
    void m11606c(Collection<String> collection) {
        this.f8045c.m11573a(this.f8052j, (String[]) collection.toArray(new String[collection.size()]), 42);
    }

    /* renamed from: d */
    private C1571a m11592d(Collection<String> collection) {
        C1571a c1571a = new C1571a();
        for (String str : collection) {
            switch (m11589a(this.f8052j, str)) {
                case -1:
                    c1571a.m11584a(str);
                    break;
                default:
                    c1571a.m11588b(str);
                    break;
            }
        }
        return c1571a;
    }

    /* renamed from: a */
    private int m11589a(Activity activity, String str) {
        try {
            return this.f8045c.m11572a((Context) activity, str);
        } catch (RuntimeException e) {
            return -1;
        }
    }

    /* renamed from: d */
    private void m11593d() {
        Intent a = this.f8046d.m11608a(this.f8044b, DexterActivity.class);
        a.addFlags(268435456);
        this.f8044b.startActivity(a);
    }

    /* renamed from: e */
    private void m11595e(Collection<String> collection) {
        if (!collection.isEmpty()) {
            List linkedList = new LinkedList();
            for (String str : collection) {
                if (this.f8045c.m11574a(this.f8052j, str)) {
                    linkedList.add(new bxj(str));
                }
            }
            if (linkedList.isEmpty()) {
                m11606c(collection);
            } else if (!this.f8050h.get()) {
                this.f8053k.mo1587a(linkedList, new bxd(this));
            }
        }
    }

    /* renamed from: f */
    private void m11596f(Collection<String> collection) {
        for (String a : collection) {
            this.f8048f.m11623a(bxi.m11632a(a));
        }
        m11598h(collection);
    }

    /* renamed from: g */
    private void m11597g(Collection<String> collection) {
        for (String str : collection) {
            this.f8048f.m11622a(bxh.m11631a(str, !this.f8045c.m11574a(this.f8052j, str)));
        }
        m11598h(collection);
    }

    /* renamed from: h */
    private void m11598h(Collection<String> collection) {
        if (!this.f8047e.isEmpty()) {
            synchronized (this.f8051i) {
                this.f8047e.removeAll(collection);
                if (this.f8047e.isEmpty()) {
                    this.f8052j.finish();
                    this.f8052j = null;
                    this.f8049g.set(false);
                    this.f8050h.set(false);
                    bxl bxl = this.f8053k;
                    this.f8053k = f8043a;
                    bxl.mo1586a(this.f8048f);
                }
            }
        }
    }

    /* renamed from: e */
    private void m11594e() {
        if (this.f8049g.getAndSet(true)) {
            throw new IllegalStateException("Only one Dexter request at a time is allowed");
        }
    }

    /* renamed from: i */
    private void m11599i(Collection<String> collection) {
        if (collection.isEmpty()) {
            throw new IllegalStateException("Dexter has to be called with at least one permission");
        }
    }

    /* renamed from: b */
    private void m11591b(bxo bxo, String str, bxf bxf) {
        m11590a(new bxb(bxo), Collections.singleton(str), bxf);
    }

    /* renamed from: a */
    private void m11590a(bxl bxl, Collection<String> collection, bxf bxf) {
        m11594e();
        m11599i(collection);
        this.f8047e.clear();
        this.f8047e.addAll(collection);
        this.f8048f.m11625c();
        this.f8053k = new bxa(bxl, bxf);
        m11593d();
        bxf.mo1584a();
    }
}
