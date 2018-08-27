package com.p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* compiled from: TableStatements */
/* renamed from: doi */
public class doi {
    /* renamed from: a */
    private final SQLiteDatabase f22409a;
    /* renamed from: b */
    private final String f22410b;
    /* renamed from: c */
    private final String[] f22411c;
    /* renamed from: d */
    private final String[] f22412d;
    /* renamed from: e */
    private volatile SQLiteStatement f22413e;
    /* renamed from: f */
    private volatile SQLiteStatement f22414f;
    /* renamed from: g */
    private volatile SQLiteStatement f22415g;
    /* renamed from: h */
    private volatile SQLiteStatement f22416h;
    /* renamed from: i */
    private volatile String f22417i;
    /* renamed from: j */
    private volatile String f22418j;
    /* renamed from: k */
    private volatile String f22419k;

    public doi(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f22409a = sQLiteDatabase;
        this.f22410b = str;
        this.f22411c = strArr;
        this.f22412d = strArr2;
    }

    /* renamed from: a */
    public SQLiteStatement m28431a() {
        if (this.f22413e == null) {
            SQLiteStatement compileStatement = this.f22409a.compileStatement(doh.m28419a("INSERT INTO ", this.f22410b, this.f22411c));
            synchronized (this) {
                if (this.f22413e == null) {
                    this.f22413e = compileStatement;
                }
            }
            if (this.f22413e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f22413e;
    }

    /* renamed from: b */
    public SQLiteStatement m28432b() {
        if (this.f22414f == null) {
            SQLiteStatement compileStatement = this.f22409a.compileStatement(doh.m28419a("INSERT OR REPLACE INTO ", this.f22410b, this.f22411c));
            synchronized (this) {
                if (this.f22414f == null) {
                    this.f22414f = compileStatement;
                }
            }
            if (this.f22414f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f22414f;
    }

    /* renamed from: c */
    public SQLiteStatement m28433c() {
        if (this.f22416h == null) {
            SQLiteStatement compileStatement = this.f22409a.compileStatement(doh.m28421a(this.f22410b, this.f22412d));
            synchronized (this) {
                if (this.f22416h == null) {
                    this.f22416h = compileStatement;
                }
            }
            if (this.f22416h != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f22416h;
    }

    /* renamed from: d */
    public SQLiteStatement m28434d() {
        if (this.f22415g == null) {
            SQLiteStatement compileStatement = this.f22409a.compileStatement(doh.m28422a(this.f22410b, this.f22411c, this.f22412d));
            synchronized (this) {
                if (this.f22415g == null) {
                    this.f22415g = compileStatement;
                }
            }
            if (this.f22415g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f22415g;
    }

    /* renamed from: e */
    public String m28435e() {
        if (this.f22417i == null) {
            this.f22417i = doh.m28420a(this.f22410b, "T", this.f22411c, false);
        }
        return this.f22417i;
    }

    /* renamed from: f */
    public String m28436f() {
        if (this.f22418j == null) {
            StringBuilder stringBuilder = new StringBuilder(m28435e());
            stringBuilder.append("WHERE ");
            doh.m28429b(stringBuilder, "T", this.f22412d);
            this.f22418j = stringBuilder.toString();
        }
        return this.f22418j;
    }

    /* renamed from: g */
    public String m28437g() {
        if (this.f22419k == null) {
            this.f22419k = m28435e() + "WHERE ROWID=?";
        }
        return this.f22419k;
    }
}
