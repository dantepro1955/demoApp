package com.p000;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: DeleteQuery */
/* renamed from: don */
public class don<T> extends doj<T> {
    /* renamed from: f */
    private final C5025a<T> f22432f;

    /* compiled from: DeleteQuery */
    /* renamed from: don$a */
    static final class C5025a<T2> extends dok<T2, don<T2>> {
        /* renamed from: b */
        protected /* synthetic */ doj mo4503b() {
            return m28454d();
        }

        private C5025a(dnt<T2, ?> dnt, String str, String[] strArr) {
            super(dnt, str, strArr);
        }

        /* renamed from: d */
        protected don<T2> m28454d() {
            return new don(this, this.b, this.a, (String[]) this.c.clone());
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ doj mo4502a(int i, Object obj) {
        return super.mo4502a(i, obj);
    }

    /* renamed from: a */
    static <T2> don<T2> m28455a(dnt<T2, ?> dnt, String str, Object[] objArr) {
        return (don) new C5025a(dnt, str, doj.m28438a(objArr)).m28441a();
    }

    private don(C5025a<T> c5025a, dnt<T, ?> dnt, String str, String[] strArr) {
        super(dnt, str, strArr);
        this.f22432f = c5025a;
    }

    /* renamed from: b */
    public don<T> m28457b() {
        return (don) this.f22432f.m28442a(this);
    }

    /* renamed from: c */
    public void m28458c() {
        m28440a();
        SQLiteDatabase database = this.a.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            this.a.getDatabase().execSQL(this.c, this.d);
            return;
        }
        database.beginTransaction();
        try {
            this.a.getDatabase().execSQL(this.c, this.d);
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
