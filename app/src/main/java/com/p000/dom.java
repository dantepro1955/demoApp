package com.p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: CountQuery */
/* renamed from: dom */
public class dom<T> extends doj<T> {
    /* renamed from: f */
    private final C5023a<T> f22431f;

    /* compiled from: CountQuery */
    /* renamed from: dom$a */
    static final class C5023a<T2> extends dok<T2, dom<T2>> {
        /* renamed from: b */
        protected /* synthetic */ doj mo4503b() {
            return m28448d();
        }

        private C5023a(dnt<T2, ?> dnt, String str, String[] strArr) {
            super(dnt, str, strArr);
        }

        /* renamed from: d */
        protected dom<T2> m28448d() {
            return new dom(this, this.b, this.a, (String[]) this.c.clone());
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ doj mo4502a(int i, Object obj) {
        return super.mo4502a(i, obj);
    }

    /* renamed from: a */
    static <T2> dom<T2> m28449a(dnt<T2, ?> dnt, String str, Object[] objArr) {
        return (dom) new C5023a(dnt, str, doj.m28438a(objArr)).m28441a();
    }

    private dom(C5023a<T> c5023a, dnt<T, ?> dnt, String str, String[] strArr) {
        super(dnt, str, strArr);
        this.f22431f = c5023a;
    }

    /* renamed from: b */
    public dom<T> m28451b() {
        return (dom) this.f22431f.m28442a(this);
    }

    /* renamed from: c */
    public long m28452c() {
        m28440a();
        SQLiteDatabase database = this.a.getDatabase();
        String str = this.c;
        long j = this.d;
        Cursor rawQuery = database.rawQuery(str, j);
        try {
            if (!rawQuery.moveToNext()) {
                throw new dnw("No result for count");
            } else if (!rawQuery.isLast()) {
                throw new dnw("Unexpected row count: " + rawQuery.getCount());
            } else if (rawQuery.getColumnCount() != 1) {
                throw new dnw("Unexpected column count: " + rawQuery.getColumnCount());
            } else {
                j = rawQuery.getLong(0);
                return j;
            }
        } finally {
            rawQuery.close();
        }
    }
}
