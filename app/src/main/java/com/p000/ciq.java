package com.p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import p000.cii.C1744a;

/* compiled from: BaseAOC */
/* renamed from: ciq */
class ciq {
    /* renamed from: a */
    private static HandlerThread f9391a;
    /* renamed from: b */
    private static Handler f9392b;
    /* renamed from: c */
    private SQLiteDatabase f9393c;
    /* renamed from: d */
    private HashMap<String, String> f9394d;

    ciq() {
        f9391a = new HandlerThread("aoc");
        f9391a.start();
        f9392b = new Handler(f9391a.getLooper());
    }

    /* renamed from: J */
    public void mo1759J() {
        if (cij.m13687a().m13721c()) {
            this.f9393c = cij.m13687a().m13714b();
            return;
        }
        throw new IllegalStateException("DataController must be initialised before AppOptionController");
    }

    /* renamed from: K */
    protected void m13839K() {
        if (this.f9394d == null) {
            this.f9394d = new HashMap();
            Cursor e = cim.m13804e(this.f9393c);
            if (e != null) {
                if (e.moveToFirst()) {
                    cju cju = new cju();
                    do {
                        C1744a.m13666a(cju, e);
                        this.f9394d.put(cju.f9441b, cju.f9442c);
                    } while (e.moveToNext());
                }
                m13837a(e);
            }
        }
    }

    /* renamed from: e */
    protected String m13847e(String str) {
        m13839K();
        return (String) this.f9394d.get(str);
    }

    /* renamed from: a */
    protected void m13840a(final String str, final String str2) {
        if (this.f9394d == null) {
            this.f9394d = new HashMap();
        }
        this.f9394d.put(str, str2);
        f9392b.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ ciq f9399c;

            public void run() {
                cim.m13792a(this.f9399c.f9393c, str, str2);
            }
        });
    }

    /* renamed from: b */
    protected int m13842b(String str, int i) {
        String e = m13847e(str);
        return e == null ? i : Integer.parseInt(e);
    }

    /* renamed from: c */
    protected void m13845c(String str, int i) {
        m13840a(str, Integer.toString(i));
    }

    /* renamed from: b */
    protected long m13843b(String str, long j) {
        String e = m13847e(str);
        return e == null ? j : Long.parseLong(e);
    }

    /* renamed from: c */
    protected void m13846c(String str, long j) {
        m13840a(str, Long.toString(j));
    }

    /* renamed from: a */
    protected boolean m13841a(String str, boolean z) {
        return m13842b(str, z ? 1 : 0) == 1;
    }

    /* renamed from: b */
    protected void m13844b(String str, boolean z) {
        m13845c(str, z ? 1 : 0);
    }

    /* renamed from: a */
    private void m13837a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
