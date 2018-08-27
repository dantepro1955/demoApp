package com.p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbstractDaoMaster */
/* renamed from: dnu */
public abstract class dnu {
    /* renamed from: a */
    protected final SQLiteDatabase f18752a;
    /* renamed from: b */
    protected final int f18753b;
    /* renamed from: c */
    protected final Map<Class<? extends dnt<?, ?>>, doe> f18754c = new HashMap();

    public abstract dnv newSession();

    public abstract dnv newSession(dod dod);

    public dnu(SQLiteDatabase sQLiteDatabase, int i) {
        this.f18752a = sQLiteDatabase;
        this.f18753b = i;
    }

    /* renamed from: a */
    protected void m22960a(Class<? extends dnt<?, ?>> cls) {
        this.f18754c.put(cls, new doe(this.f18752a, cls));
    }

    public int getSchemaVersion() {
        return this.f18753b;
    }

    public SQLiteDatabase getDatabase() {
        return this.f18752a;
    }
}
