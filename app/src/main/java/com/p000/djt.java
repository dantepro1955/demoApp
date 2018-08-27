package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* compiled from: SimpleLocalStorage */
/* renamed from: djt */
public class djt {
    /* renamed from: a */
    private final SharedPreferences f21810a;

    public djt(Context context) {
        this.f21810a = context.getSharedPreferences("SimpleLocalStorage", 0);
    }

    /* renamed from: a */
    public void m27622a(String str, String str2) {
        Editor edit = this.f21810a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: a */
    public String m27619a(String str) {
        return this.f21810a.getString(str, null);
    }

    /* renamed from: a */
    public void m27620a(String str, int i) {
        Editor edit = this.f21810a.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: b */
    public int m27624b(String str, int i) {
        return this.f21810a.getInt(str, i);
    }

    /* renamed from: a */
    public void m27621a(String str, long j) {
        Editor edit = this.f21810a.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    /* renamed from: b */
    public long m27625b(String str, long j) {
        return this.f21810a.getLong(str, j);
    }

    /* renamed from: a */
    public void m27623a(String str, boolean z) {
        Editor edit = this.f21810a.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    /* renamed from: b */
    public boolean m27626b(String str) {
        return this.f21810a.getBoolean(str, false);
    }
}
