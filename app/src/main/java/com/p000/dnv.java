package com.p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbstractDaoSession */
/* renamed from: dnv */
public class dnv {
    /* renamed from: a */
    private final SQLiteDatabase f18755a;
    /* renamed from: b */
    private final Map<Class<?>, dnt<?, ?>> f18756b = new HashMap();

    public dnv(SQLiteDatabase sQLiteDatabase) {
        this.f18755a = sQLiteDatabase;
    }

    /* renamed from: a */
    protected <T> void m22963a(Class<T> cls, dnt<T, ?> dnt) {
        this.f18756b.put(cls, dnt);
    }

    /* renamed from: a */
    public <T> long m22961a(T t) {
        return m22965b(t.getClass()).insert(t);
    }

    /* renamed from: b */
    public <T> void m22966b(T t) {
        m22965b(t.getClass()).update(t);
    }

    /* renamed from: a */
    public <T> void m22962a(Class<T> cls) {
        m22965b((Class) cls).deleteAll();
    }

    /* renamed from: b */
    public dnt<?, ?> m22965b(Class<? extends Object> cls) {
        dnt<?, ?> dnt = (dnt) this.f18756b.get(cls);
        if (dnt != null) {
            return dnt;
        }
        throw new dnw("No DAO registered for " + cls);
    }

    /* renamed from: a */
    public void m22964a(Runnable runnable) {
        this.f18755a.beginTransaction();
        try {
            runnable.run();
            this.f18755a.setTransactionSuccessful();
        } finally {
            this.f18755a.endTransaction();
        }
    }

    /* renamed from: h */
    public SQLiteDatabase m22967h() {
        return this.f18755a;
    }
}
