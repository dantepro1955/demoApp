package com.p000;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p000.byj.C1599a;
import p000.byj.C1600b;

/* compiled from: OnOffTrackerProxy */
/* renamed from: byl */
class byl<T> implements InvocationHandler {
    /* renamed from: a */
    private static final Object[] f8216a = new Object[0];
    /* renamed from: b */
    private final byj f8217b;
    /* renamed from: c */
    private final C1589a<T> f8218c;
    /* renamed from: d */
    private final C1593c<T> f8219d;
    /* renamed from: e */
    private final LinkedList<C1607b> f8220e;
    /* renamed from: f */
    private final LinkedList<C1607b> f8221f;
    /* renamed from: g */
    private boolean f8222g;
    /* renamed from: h */
    private T f8223h;

    /* compiled from: OnOffTrackerProxy */
    /* renamed from: byl$a */
    interface C1589a<T> {
        /* renamed from: a */
        byv<T> mo1600a() throws byu;
    }

    /* compiled from: OnOffTrackerProxy */
    /* renamed from: byl$c */
    interface C1593c<T> {
        /* renamed from: a */
        Class<T> mo1604a() throws byu;

        /* renamed from: a */
        boolean mo1605a(Method method) throws byu;
    }

    /* compiled from: OnOffTrackerProxy */
    /* renamed from: byl$1 */
    class C16061 implements C1599a {
        /* renamed from: a */
        final /* synthetic */ byl f8210a;
        /* renamed from: b */
        private long f8211b = System.currentTimeMillis();

        C16061(byl byl) {
            this.f8210a = byl;
        }

        /* renamed from: a */
        public void mo1619a() throws byu {
            this.f8210a.m11803b();
        }

        /* renamed from: b */
        public void mo1620b() throws byu {
        }

        /* renamed from: c */
        public boolean mo1621c() {
            return this.f8210a.f8222g;
        }

        /* renamed from: d */
        public long mo1622d() {
            return this.f8211b;
        }
    }

    /* compiled from: OnOffTrackerProxy */
    /* renamed from: byl$b */
    class C1607b {
        /* renamed from: a */
        final /* synthetic */ byl f8212a;
        /* renamed from: b */
        private final WeakReference[] f8213b;
        /* renamed from: c */
        private final LinkedList<Object> f8214c;
        /* renamed from: d */
        private final Method f8215d;

        private C1607b(byl byl, Method method, Object... objArr) {
            int i = 0;
            this.f8212a = byl;
            this.f8214c = new LinkedList();
            if (objArr == null) {
                objArr = byl.f8216a;
            }
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer)) {
                    this.f8214c.add(obj);
                }
                int i3 = i2 + 1;
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2 = i3;
            }
            this.f8213b = weakReferenceArr;
            this.f8215d = method;
        }
    }

    byl(byj byj, C1589a<T> c1589a, C1593c<T> c1593c) throws byu {
        bys.m11828a(byj);
        bys.m11828a(c1589a);
        bys.m11828a(c1593c);
        this.f8217b = byj;
        this.f8218c = c1589a;
        this.f8219d = c1593c;
        if (bxu.f8112a.booleanValue()) {
            m11800a((C1593c) c1593c);
        }
        byj.mo1614a(new C16061(this));
        this.f8220e = new LinkedList();
        this.f8221f = new LinkedList();
    }

    /* renamed from: a */
    private void m11800a(C1593c<T> c1593c) throws byu {
        for (Method method : c1593c.mo1604a().getMethods()) {
            if (!Object.class.equals(method.getDeclaringClass())) {
                Class returnType = method.getReturnType();
                if (!(Void.TYPE.equals(returnType) || Boolean.TYPE.equals(returnType))) {
                    if (c1593c.mo1605a(method)) {
                        throw new RuntimeException("Cannot proxy a tracker with non-void, non-boolean return types.");
                    }
                    throw new RuntimeException("Cannot proxy a tracker with nonpostponable method: " + method);
                }
            }
        }
    }

    /* renamed from: a */
    static <T> T m11797a(byj byj, C1589a<T> c1589a, C1593c<T> c1593c) throws byu {
        return Proxy.newProxyInstance(c1593c.mo1604a().getClassLoader(), new Class[]{r0}, new byl(byj, c1589a, c1593c));
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return m11799a(method, objArr);
        } catch (Exception e) {
            byt.m11829a(e);
            return m11798a(method);
        }
    }

    /* renamed from: a */
    private Object m11799a(Method method, Object[] objArr) throws byu, IllegalAccessException, InvocationTargetException {
        if (Object.class.equals(method.getDeclaringClass())) {
            String name = method.getName();
            Class a = this.f8219d.mo1604a();
            if ("getClass".equals(name)) {
                return a;
            }
            if (!"toString".equals(name)) {
                return method.invoke(this, objArr);
            }
            Object invoke = method.invoke(this, objArr);
            return (invoke + "").replace(byl.class.getName(), a.getName());
        } else if (this.f8222g && this.f8223h == null) {
            m11806c();
            return m11798a(method);
        } else {
            if (this.f8217b.mo1613a() == C1600b.ON) {
                m11803b();
                if (this.f8223h != null) {
                    return method.invoke(this.f8223h, objArr);
                }
            }
            if (this.f8217b.mo1613a() == C1600b.OFF && !(this.f8222g && this.f8223h == null)) {
                m11804b(method, objArr);
            }
            return m11798a(method);
        }
    }

    /* renamed from: b */
    private void m11803b() throws byu {
        if (!this.f8222g) {
            try {
                this.f8223h = this.f8218c.mo1600a().m11833b(null);
            } catch (Throwable e) {
                if (bxu.f8112a.booleanValue()) {
                    Log.e("OnOffTrackerProxy", "Could not create instance", e);
                }
            }
            this.f8222g = true;
        }
        if (this.f8223h != null) {
            List<LinkedList> linkedList = new LinkedList();
            linkedList.add(this.f8220e);
            linkedList.add(this.f8221f);
            for (LinkedList linkedList2 : linkedList) {
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    C1607b c1607b = (C1607b) it.next();
                    try {
                        Object[] objArr = new Object[c1607b.f8213b.length];
                        WeakReference[] a = c1607b.f8213b;
                        int length = a.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            objArr[i2] = a[i].get();
                            i++;
                            i2 = i3;
                        }
                        c1607b.f8215d.invoke(this.f8223h, objArr);
                    } catch (Exception e2) {
                        Throwable e3 = e2;
                        if (bxu.f8112a.booleanValue()) {
                            Throwable cause = e3.getCause();
                            if (cause != null) {
                                e3 = cause;
                            }
                            Log.e("OnOffTrackerProxy", "Could not resurrect call to " + c1607b.f8215d + ": " + Log.getStackTraceString(e3));
                        }
                    }
                }
                linkedList2.clear();
            }
        }
    }

    /* renamed from: b */
    private void m11804b(Method method, Object[] objArr) throws byu {
        if (this.f8220e.size() < 5) {
            this.f8220e.add(new C1607b(method, objArr));
            return;
        }
        if (this.f8221f.size() >= 10) {
            this.f8221f.removeFirst();
        }
        this.f8221f.add(new C1607b(method, objArr));
    }

    /* renamed from: c */
    private void m11806c() {
        this.f8220e.clear();
        this.f8221f.clear();
    }

    /* renamed from: a */
    private Object m11798a(Method method) throws byu {
        if (!bxu.f8112a.booleanValue() || this.f8219d.mo1605a(method)) {
            try {
                if (Boolean.TYPE.equals(method.getReturnType())) {
                    return Boolean.valueOf(true);
                }
            } catch (Exception e) {
                byt.m11829a(e);
            }
            return null;
        }
        throw new RuntimeException("Cannot queue method call: " + method);
    }
}
