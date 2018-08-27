package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p000.cua.C4598a;

/* compiled from: UploadDataController */
/* renamed from: ctz */
public class ctz {
    /* renamed from: a */
    private static ctz f20239a = new ctz();
    /* renamed from: b */
    private Context f20240b;
    /* renamed from: c */
    private SQLiteDatabase f20241c;
    /* renamed from: d */
    private cuc f20242d;
    /* renamed from: e */
    private boolean f20243e = false;

    private ctz() {
    }

    /* renamed from: a */
    public static ctz m24968a() {
        return f20239a;
    }

    /* renamed from: a */
    public synchronized void m24970a(Context context) {
        if (!this.f20243e) {
            this.f20243e = true;
            this.f20240b = context;
            this.f20242d = new cuc(this.f20240b);
            this.f20241c = this.f20242d.getWritableDatabase();
        }
    }

    /* renamed from: a */
    public void m24971a(cus cus) {
        cud.m24994a(this.f20241c, cus);
    }

    /* renamed from: a */
    public void m24976a(ArrayList<cut> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m24972a((cut) it.next());
            }
        }
    }

    /* renamed from: a */
    public void m24972a(cut cut) {
        cud.m24995a(this.f20241c, cut);
    }

    /* renamed from: a */
    public void m24975a(String str, String str2, int i, int i2) {
        cus a = m24969a(str);
        if (a != null) {
            a.f20260c = str2;
            a.f20263f = i;
            a.f20264g = i2;
            cud.m24994a(this.f20241c, a);
        }
    }

    /* renamed from: a */
    public void m24974a(String str, int i, String str2) {
        cus a = m24969a(str);
        if (a != null) {
            a.f20263f = i;
            a.f20262e = str2;
            cud.m24994a(this.f20241c, a);
        }
    }

    /* renamed from: a */
    public void m24973a(String str, int i) {
        cus a = m24969a(str);
        if (a != null) {
            a.f20264g = i;
            cud.m24994a(this.f20241c, a);
        }
    }

    /* renamed from: b */
    public void m24979b(String str, int i, String str2) {
        cus a = m24969a(str);
        if (a != null) {
            a.f20265h = i;
            a.f20262e = str2;
            cud.m24994a(this.f20241c, a);
        }
    }

    /* renamed from: a */
    public cus m24969a(String str) {
        Cursor a = cud.m24992a(this.f20241c, str);
        if (!a.moveToFirst()) {
            return null;
        }
        cus cus = new cus();
        C4598a.m24984a(cus, a);
        return cus;
    }

    /* renamed from: b */
    public String m24977b(String str) {
        Cursor a = cud.m24993a(this.f20241c, str, "title");
        if (!a.moveToFirst()) {
            return null;
        }
        cut cut = new cut();
        C4598a.m24985a(cut, a);
        return cut.f20270d;
    }

    /* renamed from: c */
    public ArrayList<cut> m24980c(String str) {
        ArrayList<cut> arrayList = new ArrayList();
        Cursor b = cud.m24997b(this.f20241c, str);
        if (b.moveToFirst()) {
            while (!b.isAfterLast()) {
                cut cut = new cut();
                C4598a.m24985a(cut, b);
                arrayList.add(cut);
                b.moveToNext();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public ArrayList<cus> m24978b() {
        ArrayList<cus> arrayList = new ArrayList();
        if (this.f20241c != null) {
            Cursor a = cud.m24991a(this.f20241c);
            if (a.moveToFirst()) {
                while (!a.isAfterLast()) {
                    cus cus = new cus();
                    C4598a.m24984a(cus, a);
                    arrayList.add(cus);
                    a.moveToNext();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public void m24982d(String str) {
        cud.m24998c(this.f20241c, str);
        cud.m24999d(this.f20241c, str);
    }

    /* renamed from: c */
    public void m24981c() {
        this.f20242d.m24990a();
    }
}
