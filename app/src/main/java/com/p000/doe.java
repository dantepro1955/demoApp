package com.p000;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DaoConfig */
/* renamed from: doe */
public final class doe implements Cloneable {
    /* renamed from: a */
    public final SQLiteDatabase f22388a;
    /* renamed from: b */
    public final String f22389b;
    /* renamed from: c */
    public final dnz[] f22390c;
    /* renamed from: d */
    public final String[] f22391d;
    /* renamed from: e */
    public final String[] f22392e;
    /* renamed from: f */
    public final String[] f22393f;
    /* renamed from: g */
    public final dnz f22394g;
    /* renamed from: h */
    public final boolean f22395h;
    /* renamed from: i */
    public final doi f22396i;
    /* renamed from: j */
    private doa<?, ?> f22397j;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m28409a();
    }

    public doe(SQLiteDatabase sQLiteDatabase, Class<? extends dnt<?, ?>> cls) {
        this.f22388a = sQLiteDatabase;
        try {
            this.f22389b = (String) cls.getField("TABLENAME").get(null);
            dnz[] a = doe.m28408a((Class) cls);
            this.f22390c = a;
            this.f22391d = new String[a.length];
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int i = 0;
            dnz dnz = null;
            while (i < a.length) {
                dnz dnz2 = a[i];
                String str = dnz2.f22370e;
                this.f22391d[i] = str;
                if (dnz2.f22369d) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                    dnz2 = dnz;
                }
                i++;
                dnz = dnz2;
            }
            this.f22393f = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            this.f22392e = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (this.f22392e.length != 1) {
                dnz = null;
            }
            this.f22394g = dnz;
            this.f22396i = new doi(sQLiteDatabase, this.f22389b, this.f22391d, this.f22392e);
            if (this.f22394g != null) {
                boolean z;
                Class cls2 = this.f22394g.f22367b;
                if (cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f22395h = z;
                return;
            }
            this.f22395h = false;
        } catch (Throwable e) {
            throw new dnw("Could not init DAOConfig", e);
        }
    }

    /* renamed from: a */
    private static dnz[] m28408a(Class<? extends dnt<?, ?>> cls) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof dnz) {
                    arrayList.add((dnz) obj);
                }
            }
        }
        dnz[] dnzArr = new dnz[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dnz dnz = (dnz) it.next();
            if (dnzArr[dnz.f22366a] != null) {
                throw new dnw("Duplicate property ordinals");
            }
            dnzArr[dnz.f22366a] = dnz;
        }
        return dnzArr;
    }

    public doe(doe doe) {
        this.f22388a = doe.f22388a;
        this.f22389b = doe.f22389b;
        this.f22390c = doe.f22390c;
        this.f22391d = doe.f22391d;
        this.f22392e = doe.f22392e;
        this.f22393f = doe.f22393f;
        this.f22394g = doe.f22394g;
        this.f22396i = doe.f22396i;
        this.f22395h = doe.f22395h;
    }

    /* renamed from: a */
    public doe m28409a() {
        return new doe(this);
    }

    /* renamed from: b */
    public doa<?, ?> m28411b() {
        return this.f22397j;
    }

    /* renamed from: a */
    public void m28410a(dod dod) {
        if (dod == dod.None) {
            this.f22397j = null;
        } else if (dod != dod.Session) {
            throw new IllegalArgumentException("Unsupported type: " + dod);
        } else if (this.f22395h) {
            this.f22397j = new dob();
        } else {
            this.f22397j = new doc();
        }
    }
}
