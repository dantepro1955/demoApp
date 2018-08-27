package com.p000;

import android.os.AsyncTask;
import android.os.Looper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: IgDiskCache */
/* renamed from: bwg */
public final class bwg {
    /* renamed from: a */
    static final File f7977a = new File("/dev/null");
    /* renamed from: b */
    private static final Pattern f7978b = Pattern.compile("[a-z0-9_-]{1,120}");
    /* renamed from: c */
    private static final ThreadPoolExecutor f7979c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* renamed from: d */
    private final File f7980d;
    /* renamed from: e */
    private final Object f7981e;
    /* renamed from: f */
    private final Object f7982f;
    /* renamed from: g */
    private final LinkedHashMap<String, bwf> f7983g;
    /* renamed from: h */
    private final List<bwf> f7984h;
    /* renamed from: i */
    private final AtomicLong f7985i;
    /* renamed from: j */
    private final bwh f7986j;
    /* renamed from: k */
    private int f7987k;
    /* renamed from: l */
    private long f7988l;
    /* renamed from: m */
    private int f7989m;
    /* renamed from: n */
    private int f7990n;
    /* renamed from: o */
    private final Runnable f7991o;

    /* compiled from: IgDiskCache */
    /* renamed from: bwg$1 */
    class C15581 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bwg f7976a;

        C15581(bwg bwg) {
            this.f7976a = bwg;
        }

        public void run() {
            if (this.f7976a.f7985i.get() > this.f7976a.f7988l || this.f7976a.m11518a() > this.f7976a.f7987k) {
                this.f7976a.m11513d();
            }
        }
    }

    public bwg(File file) {
        this(file, 31457280, 1000, AsyncTask.SERIAL_EXECUTOR);
    }

    public bwg(File file, long j, int i, Executor executor) {
        this.f7981e = new Object();
        this.f7982f = new Object();
        this.f7985i = new AtomicLong();
        this.f7991o = new C15581(this);
        bwg.m11517e();
        if (file == null) {
            file = f7977a;
        }
        this.f7980d = file;
        this.f7987k = i;
        this.f7988l = j;
        this.f7984h = new LinkedList();
        this.f7985i.set(0);
        this.f7989m = 0;
        this.f7990n = 0;
        this.f7986j = new bwh(this.f7980d, this, executor);
        this.f7983g = new LinkedHashMap(0, 0.75f, true);
        Map a = this.f7986j.m11533a();
        if (a == null) {
            this.f7980d.mkdirs();
            this.f7986j.m11536b();
            return;
        }
        this.f7983g.putAll(a);
        for (bwf c : this.f7983g.values()) {
            this.f7985i.getAndAdd(c.m11504c());
        }
    }

    /* renamed from: a */
    public bwi<bwj> m11519a(String str) {
        bwg.m11516d(str);
        synchronized (this.f7981e) {
            bwf bwf = (bwf) this.f7983g.get(str);
        }
        if (bwf == null || !bwf.m11505d()) {
            this.f7989m++;
            return bwi.m11539c();
        }
        this.f7990n++;
        try {
            return bwi.m11538a(new bwj(bwf));
        } catch (IOException e) {
            return bwi.m11539c();
        }
    }

    /* renamed from: b */
    public bwi<bwe> m11521b(String str) {
        bwg.m11516d(str);
        if (this.f7988l == 0 || this.f7987k == 0 || f7977a.equals(this.f7980d)) {
            return bwi.m11539c();
        }
        bwf bwf;
        synchronized (this.f7981e) {
            bwf = (bwf) this.f7983g.get(str);
        }
        if (bwf == null) {
            bwf = new bwf(this.f7980d, str);
            synchronized (this.f7981e) {
                this.f7983g.put(str, bwf);
            }
        } else if (bwf.m11506e() != null) {
            throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
        }
        this.f7986j.m11534a(str);
        return m11511c(bwf);
    }

    /* renamed from: c */
    private synchronized bwi<bwe> m11511c(bwf bwf) {
        bwi<bwe> c;
        bwe bwe;
        if (bwf.m11506e() != null) {
            throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
        }
        try {
            bwe = new bwe(bwf, this);
        } catch (FileNotFoundException e) {
            this.f7980d.mkdirs();
            try {
                bwe = new bwe(bwf, this);
            } catch (FileNotFoundException e2) {
                c = bwi.m11539c();
            }
        }
        bwf.m11502a(bwe);
        c = bwi.m11538a(bwe);
        return c;
    }

    /* renamed from: c */
    public void m11524c(String str) throws IllegalStateException {
        bwg.m11516d(str);
        synchronized (this.f7981e) {
            bwf bwf = (bwf) this.f7983g.remove(str);
        }
        if (bwf == null) {
            return;
        }
        if (bwf.m11506e() != null) {
            throw new IllegalStateException("trying to remove a disk cache entry that is still under edit.");
        }
        File a = bwf.m11500a();
        if (!a.exists() || a.delete()) {
            this.f7985i.getAndAdd(-bwf.m11504c());
            return;
        }
        synchronized (this.f7982f) {
            this.f7984h.add(bwf);
        }
    }

    /* renamed from: a */
    public int m11518a() {
        int size;
        synchronized (this.f7981e) {
            size = this.f7983g.size();
        }
        return size;
    }

    /* renamed from: c */
    private void m11512c() {
        synchronized (this.f7982f) {
            Iterator listIterator = this.f7984h.listIterator();
            while (listIterator.hasNext()) {
                bwf bwf = (bwf) listIterator.next();
                if (bwf != null) {
                    File a = bwf.m11500a();
                    if (a.exists() && a.delete()) {
                        this.f7985i.getAndAdd(-bwf.m11504c());
                        listIterator.remove();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m11513d() {
        m11512c();
        synchronized (this.f7981e) {
            while (true) {
                if (this.f7985i.get() > this.f7988l || this.f7983g.size() > this.f7987k) {
                    try {
                        m11524c((String) ((Entry) this.f7983g.entrySet().iterator().next()).getKey());
                    } catch (IllegalStateException e) {
                    } catch (NoSuchElementException e2) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m11516d(String str) {
        if (!f7978b.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: a */
    void m11520a(bwf bwf) {
        File b = bwf.m11503b();
        if (b.exists()) {
            File a = bwf.m11500a();
            if (b.renameTo(a)) {
                long c = bwf.m11504c();
                long length = a.length();
                bwf.m11501a(length);
                this.f7985i.getAndAdd(length - c);
                m11514d(bwf);
                return;
            }
            m11523b(bwf);
            m11524c(bwf.m11507f());
            return;
        }
        bwf.m11502a(null);
        m11514d(bwf);
    }

    /* renamed from: b */
    void m11523b(bwf bwf) {
        File b = bwf.m11503b();
        if (b.exists()) {
            b.delete();
        }
        bwf.m11502a(null);
        m11514d(bwf);
    }

    /* renamed from: d */
    private void m11514d(bwf bwf) {
        if (bwf.m11505d()) {
            this.f7986j.m11535a(bwf.m11507f(), bwf.m11504c());
        } else {
            synchronized (this.f7981e) {
                this.f7983g.remove(bwf.m11507f());
            }
        }
        if (this.f7985i.get() > this.f7988l || m11518a() > this.f7987k) {
            f7979c.execute(this.f7991o);
        }
    }

    /* renamed from: b */
    ArrayList<bwf> m11522b() {
        ArrayList<bwf> arrayList;
        synchronized (this.f7981e) {
            arrayList = new ArrayList(this.f7983g.values());
        }
        return arrayList;
    }

    /* renamed from: e */
    private static void m11517e() throws IllegalStateException {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("This operation can't be run on UI thread.");
        }
    }
}
