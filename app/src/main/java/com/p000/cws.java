package com.p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PropertyValuesHolder */
/* renamed from: cws */
public class cws implements Cloneable {
    /* renamed from: i */
    private static final cwt f20434i = new cwn();
    /* renamed from: j */
    private static final cwt f20435j = new cwl();
    /* renamed from: k */
    private static Class[] f20436k = new Class[]{Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
    /* renamed from: l */
    private static Class[] f20437l = new Class[]{Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
    /* renamed from: m */
    private static Class[] f20438m = new Class[]{Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    /* renamed from: n */
    private static final HashMap<Class, HashMap<String, Method>> f20439n = new HashMap();
    /* renamed from: o */
    private static final HashMap<Class, HashMap<String, Method>> f20440o = new HashMap();
    /* renamed from: a */
    String f20441a;
    /* renamed from: b */
    protected cwx f20442b;
    /* renamed from: c */
    Method f20443c;
    /* renamed from: d */
    Class f20444d;
    /* renamed from: e */
    cwp f20445e;
    /* renamed from: f */
    final ReentrantReadWriteLock f20446f;
    /* renamed from: g */
    final Object[] f20447g;
    /* renamed from: h */
    private Method f20448h;
    /* renamed from: p */
    private cwt f20449p;
    /* renamed from: q */
    private Object f20450q;

    /* compiled from: PropertyValuesHolder */
    /* renamed from: cws$a */
    static class C4636a extends cws {
        /* renamed from: h */
        cwm f20451h;
        /* renamed from: i */
        float f20452i;
        /* renamed from: j */
        private cwv f20453j;

        /* renamed from: a */
        public /* synthetic */ cws mo4203a() {
            return m25367e();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m25367e();
        }

        public C4636a(String str, float... fArr) {
            super(str);
            mo4206a(fArr);
        }

        public C4636a(cwx cwx, float... fArr) {
            super(cwx);
            mo4206a(fArr);
            if (cwx instanceof cwv) {
                this.f20453j = (cwv) this.b;
            }
        }

        /* renamed from: a */
        public void mo4206a(float... fArr) {
            super.mo4206a(fArr);
            this.f20451h = (cwm) this.e;
        }

        /* renamed from: a */
        void mo4204a(float f) {
            this.f20452i = this.f20451h.m25228b(f);
        }

        /* renamed from: d */
        Object mo4209d() {
            return Float.valueOf(this.f20452i);
        }

        /* renamed from: e */
        public C4636a m25367e() {
            C4636a c4636a = (C4636a) super.mo4203a();
            c4636a.f20451h = (cwm) c4636a.e;
            return c4636a;
        }

        /* renamed from: b */
        void mo4207b(Object obj) {
            if (this.f20453j != null) {
                this.f20453j.mo4202a(obj, this.f20452i);
            } else if (this.b != null) {
                this.b.mo4200a(obj, Float.valueOf(this.f20452i));
            } else if (this.c != null) {
                try {
                    this.g[0] = Float.valueOf(this.f20452i);
                    this.c.invoke(obj, this.g);
                } catch (InvocationTargetException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        /* renamed from: a */
        void mo4205a(Class cls) {
            if (this.b == null) {
                super.mo4205a(cls);
            }
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4203a();
    }

    private cws(String str) {
        this.f20443c = null;
        this.f20448h = null;
        this.f20445e = null;
        this.f20446f = new ReentrantReadWriteLock();
        this.f20447g = new Object[1];
        this.f20441a = str;
    }

    private cws(cwx cwx) {
        this.f20443c = null;
        this.f20448h = null;
        this.f20445e = null;
        this.f20446f = new ReentrantReadWriteLock();
        this.f20447g = new Object[1];
        this.f20442b = cwx;
        if (cwx != null) {
            this.f20441a = cwx.m25285a();
        }
    }

    /* renamed from: a */
    public static cws m25345a(String str, float... fArr) {
        return new C4636a(str, fArr);
    }

    /* renamed from: a */
    public static cws m25344a(cwx<?, Float> cwx, float... fArr) {
        return new C4636a((cwx) cwx, fArr);
    }

    /* renamed from: a */
    public void mo4206a(float... fArr) {
        this.f20444d = Float.TYPE;
        this.f20445e = cwp.m25222a(fArr);
    }

    /* renamed from: a */
    private Method m25347a(Class cls, String str, Class cls2) {
        Method declaredMethod;
        Method method = null;
        String a = cws.m25346a(str, this.f20441a);
        Class[] clsArr = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(a, clsArr);
            } catch (NoSuchMethodException e) {
                try {
                    declaredMethod = cls.getDeclaredMethod(a, clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (NoSuchMethodException e2) {
                        Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f20441a + ": " + e);
                        return declaredMethod;
                    }
                } catch (NoSuchMethodException e3) {
                    declaredMethod = null;
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f20441a + ": " + e);
                    return declaredMethod;
                }
            }
        }
        Class[] clsArr2 = new Class[1];
        if (this.f20444d.equals(Float.class)) {
            clsArr = f20436k;
        } else if (this.f20444d.equals(Integer.class)) {
            clsArr = f20437l;
        } else {
            clsArr = this.f20444d.equals(Double.class) ? f20438m : new Class[]{this.f20444d};
        }
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls3 = clsArr[i];
            clsArr2[0] = cls3;
            try {
                method = cls.getMethod(a, clsArr2);
                this.f20444d = cls3;
                return method;
            } catch (NoSuchMethodException e4) {
                try {
                    method = cls.getDeclaredMethod(a, clsArr2);
                    method.setAccessible(true);
                    this.f20444d = cls3;
                    return method;
                } catch (NoSuchMethodException e5) {
                    i++;
                }
            }
        }
        Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f20441a + " with value type " + this.f20444d);
        return method;
    }

    /* renamed from: a */
    private Method m25348a(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        Method method = null;
        try {
            this.f20446f.writeLock().lock();
            HashMap hashMap2 = (HashMap) hashMap.get(cls);
            if (hashMap2 != null) {
                method = (Method) hashMap2.get(this.f20441a);
            }
            if (method == null) {
                method = m25347a(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f20441a, method);
            }
            Method method2 = method;
            this.f20446f.writeLock().unlock();
            return method2;
        } catch (Throwable th) {
            this.f20446f.writeLock().unlock();
        }
    }

    /* renamed from: a */
    void mo4205a(Class cls) {
        this.f20443c = m25348a(cls, f20439n, "set", this.f20444d);
    }

    /* renamed from: b */
    private void m25349b(Class cls) {
        this.f20448h = m25348a(cls, f20440o, "get", null);
    }

    /* renamed from: a */
    void m25354a(Object obj) {
        cwo cwo;
        if (this.f20442b != null) {
            try {
                this.f20442b.mo4201a(obj);
                Iterator it = this.f20445e.f20374e.iterator();
                while (it.hasNext()) {
                    cwo = (cwo) it.next();
                    if (!cwo.m25236a()) {
                        cwo.mo4185a(this.f20442b.mo4201a(obj));
                    }
                }
                return;
            } catch (ClassCastException e) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f20442b.m25285a() + ") on target object " + obj + ". Trying reflection instead");
                this.f20442b = null;
            }
        }
        Class cls = obj.getClass();
        if (this.f20443c == null) {
            mo4205a(cls);
        }
        Iterator it2 = this.f20445e.f20374e.iterator();
        while (it2.hasNext()) {
            cwo = (cwo) it2.next();
            if (!cwo.m25236a()) {
                if (this.f20448h == null) {
                    m25349b(cls);
                }
                try {
                    cwo.mo4185a(this.f20448h.invoke(obj, new Object[0]));
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (IllegalAccessException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public cws mo4203a() {
        try {
            cws cws = (cws) super.clone();
            cws.f20441a = this.f20441a;
            cws.f20442b = this.f20442b;
            cws.f20445e = this.f20445e.mo4183b();
            cws.f20449p = this.f20449p;
            return cws;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* renamed from: b */
    void mo4207b(Object obj) {
        if (this.f20442b != null) {
            this.f20442b.mo4200a(obj, mo4209d());
        }
        if (this.f20443c != null) {
            try {
                this.f20447g[0] = mo4209d();
                this.f20443c.invoke(obj, this.f20447g);
            } catch (InvocationTargetException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (IllegalAccessException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    /* renamed from: b */
    void m25357b() {
        if (this.f20449p == null) {
            cwt cwt = this.f20444d == Integer.class ? f20434i : this.f20444d == Float.class ? f20435j : null;
            this.f20449p = cwt;
        }
        if (this.f20449p != null) {
            this.f20445e.m25224a(this.f20449p);
        }
    }

    /* renamed from: a */
    void mo4204a(float f) {
        this.f20450q = this.f20445e.mo4182a(f);
    }

    /* renamed from: a */
    public void m25355a(String str) {
        this.f20441a = str;
    }

    /* renamed from: a */
    public void m25352a(cwx cwx) {
        this.f20442b = cwx;
    }

    /* renamed from: c */
    public String m25359c() {
        return this.f20441a;
    }

    /* renamed from: d */
    Object mo4209d() {
        return this.f20450q;
    }

    public String toString() {
        return this.f20441a + ": " + this.f20445e.toString();
    }

    /* renamed from: a */
    static String m25346a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char toUpperCase = Character.toUpperCase(str2.charAt(0));
        return str + toUpperCase + str2.substring(1);
    }
}
