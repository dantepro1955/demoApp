package com.p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: SelectionBuilder */
/* renamed from: ctl */
public class ctl {
    /* renamed from: a */
    private String f20188a = null;
    /* renamed from: b */
    private Map<String, String> f20189b = ctk.m24879a();
    /* renamed from: c */
    private StringBuilder f20190c = new StringBuilder();
    /* renamed from: d */
    private ArrayList<String> f20191d = ctj.m24878a();

    /* renamed from: a */
    public ctl m24884a(String str, String... strArr) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f20190c.length() > 0) {
                this.f20190c.append(" AND ");
            }
            this.f20190c.append("(").append(str).append(")");
            if (strArr != null) {
                Collections.addAll(this.f20191d, strArr);
            }
        } else if (strArr != null && strArr.length > 0) {
            throw new IllegalArgumentException("Valid selection required when including arguments=");
        }
        return this;
    }

    /* renamed from: a */
    public ctl m24883a(String str) {
        this.f20188a = str;
        return this;
    }

    /* renamed from: c */
    private void m24881c() {
        if (this.f20188a == null) {
            throw new IllegalStateException("Table not specified");
        }
    }

    /* renamed from: a */
    public String m24885a() {
        return this.f20190c.toString();
    }

    /* renamed from: b */
    public String[] m24886b() {
        return (String[]) this.f20191d.toArray(new String[this.f20191d.size()]);
    }

    /* renamed from: a */
    private void m24880a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = (String) this.f20189b.get(strArr[i]);
            if (str != null) {
                strArr[i] = str;
            }
        }
    }

    public String toString() {
        return "SelectionBuilder[table=" + this.f20188a + ", selection=" + m24885a() + ", selectionArgs=" + Arrays.toString(m24886b()) + "]";
    }

    /* renamed from: a */
    public Cursor m24882a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String str2, String str3, String str4) {
        m24881c();
        if (strArr != null) {
            m24880a(strArr);
        }
        return sQLiteDatabase.query(this.f20188a, strArr, m24885a(), m24886b(), str, str2, str3, str4);
    }
}
