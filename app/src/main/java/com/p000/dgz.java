package com.p000;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Bus */
/* renamed from: dgz */
public class dgz {
    /* renamed from: a */
    private final ConcurrentMap<Class<?>, Set<dhb>> f21608a;
    /* renamed from: b */
    private final ConcurrentMap<Class<?>, dhc> f21609b;
    /* renamed from: c */
    private final String f21610c;
    /* renamed from: d */
    private final dhh f21611d;
    /* renamed from: e */
    private final dhd f21612e;
    /* renamed from: f */
    private final ThreadLocal<ConcurrentLinkedQueue<C4903a>> f21613f;
    /* renamed from: g */
    private final ThreadLocal<Boolean> f21614g;
    /* renamed from: h */
    private final Map<Class<?>, Set<Class<?>>> f21615h;

    /* compiled from: Bus */
    /* renamed from: dgz$1 */
    class C49011 extends ThreadLocal<ConcurrentLinkedQueue<C4903a>> {
        /* renamed from: a */
        final /* synthetic */ dgz f21604a;

        C49011(dgz dgz) {
            this.f21604a = dgz;
        }

        protected /* synthetic */ Object initialValue() {
            return m27256a();
        }

        /* renamed from: a */
        protected ConcurrentLinkedQueue<C4903a> m27256a() {
            return new ConcurrentLinkedQueue();
        }
    }

    /* compiled from: Bus */
    /* renamed from: dgz$2 */
    class C49022 extends ThreadLocal<Boolean> {
        /* renamed from: a */
        final /* synthetic */ dgz f21605a;

        C49022(dgz dgz) {
            this.f21605a = dgz;
        }

        protected /* synthetic */ Object initialValue() {
            return m27257a();
        }

        /* renamed from: a */
        protected Boolean m27257a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Bus */
    /* renamed from: dgz$a */
    static class C4903a {
        /* renamed from: a */
        final Object f21606a;
        /* renamed from: b */
        final dhb f21607b;

        public C4903a(Object obj, dhb dhb) {
            this.f21606a = obj;
            this.f21607b = dhb;
        }
    }

    public dgz() {
        this("default");
    }

    public dgz(String str) {
        this(dhh.f21629b, str);
    }

    public dgz(dhh dhh) {
        this(dhh, "default");
    }

    public dgz(dhh dhh, String str) {
        this(dhh, str, dhd.f21626a);
    }

    dgz(dhh dhh, String str, dhd dhd) {
        this.f21608a = new ConcurrentHashMap();
        this.f21609b = new ConcurrentHashMap();
        this.f21613f = new C49011(this);
        this.f21614g = new C49022(this);
        this.f21615h = new HashMap();
        this.f21611d = dhh;
        this.f21610c = str;
        this.f21612e = dhd;
    }

    public String toString() {
        return "[Bus \"" + this.f21610c + "\"]";
    }

    /* renamed from: a */
    public void m27263a(Object obj) {
        this.f21611d.mo4410a(this);
        Map a = this.f21612e.mo4408a(obj);
        for (Class cls : a.keySet()) {
            dhc dhc = (dhc) a.get(cls);
            dhc dhc2 = (dhc) this.f21609b.putIfAbsent(cls, dhc);
            if (dhc2 != null) {
                throw new IllegalArgumentException("Producer method for type " + cls + " found on type " + dhc.f21622a.getClass() + ", but already registered by type " + dhc2.f21622a.getClass() + ".");
            }
            Set<dhb> set = (Set) this.f21608a.get(cls);
            if (!(set == null || set.isEmpty())) {
                for (dhb a2 : set) {
                    m27258a(a2, dhc);
                }
            }
        }
        a = this.f21612e.mo4409b(obj);
        for (Class cls2 : a.keySet()) {
            Set set2 = (Set) this.f21608a.get(cls2);
            if (set2 == null) {
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                set2 = (Set) this.f21608a.putIfAbsent(cls2, copyOnWriteArraySet);
                if (set2 == null) {
                    set2 = copyOnWriteArraySet;
                }
            }
            set2.addAll((Set) a.get(cls2));
        }
        for (Entry entry : a.entrySet()) {
            dhc = (dhc) this.f21609b.get((Class) entry.getKey());
            if (dhc != null && dhc.m27273a()) {
                for (dhb a22 : (Set) entry.getValue()) {
                    if (!dhc.m27273a()) {
                        break;
                    } else if (a22.m27271a()) {
                        m27258a(a22, dhc);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m27258a(dhb dhb, dhc dhc) {
        Object obj = null;
        try {
            obj = dhc.m27275c();
        } catch (InvocationTargetException e) {
            dgz.m27259a("Producer " + dhc + " threw an exception.", e);
        }
        if (obj != null) {
            m27267b(obj, dhb);
        }
    }

    /* renamed from: b */
    public void m27266b(Object obj) {
        this.f21611d.mo4410a(this);
        for (Entry entry : this.f21612e.mo4408a(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            dhc a = m27261a(cls);
            dhc dhc = (dhc) entry.getValue();
            if (dhc == null || !dhc.equals(a)) {
                throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
            }
            ((dhc) this.f21609b.remove(cls)).m27274b();
        }
        for (Entry entry2 : this.f21612e.mo4409b(obj).entrySet()) {
            Set<dhb> b = m27265b((Class) entry2.getKey());
            Collection collection = (Collection) entry2.getValue();
            if (b == null || !b.containsAll(collection)) {
                throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
            }
            for (dhb dhb : b) {
                if (collection.contains(dhb)) {
                    dhb.m27272b();
                }
            }
            b.removeAll(collection);
        }
    }

    /* renamed from: c */
    public void m27269c(Object obj) {
        this.f21611d.mo4410a(this);
        Object obj2 = null;
        for (Class b : m27268c(obj.getClass())) {
            Set<dhb> b2 = m27265b(b);
            if (!(b2 == null || b2.isEmpty())) {
                obj2 = 1;
                for (dhb a : b2) {
                    m27264a(obj, a);
                }
            }
            obj2 = obj2;
        }
        if (obj2 == null && !(obj instanceof dha)) {
            m27269c(new dha(this, obj));
        }
        m27262a();
    }

    /* renamed from: a */
    protected void m27264a(Object obj, dhb dhb) {
        ((ConcurrentLinkedQueue) this.f21613f.get()).offer(new C4903a(obj, dhb));
    }

    /* renamed from: a */
    protected void m27262a() {
        if (!((Boolean) this.f21614g.get()).booleanValue()) {
            this.f21614g.set(Boolean.valueOf(true));
            while (true) {
                C4903a c4903a = (C4903a) ((ConcurrentLinkedQueue) this.f21613f.get()).poll();
                if (c4903a == null) {
                    break;
                }
                try {
                    if (c4903a.f21607b.m27271a()) {
                        m27267b(c4903a.f21606a, c4903a.f21607b);
                    }
                } finally {
                    this.f21614g.set(Boolean.valueOf(false));
                }
            }
        }
    }

    /* renamed from: b */
    protected void m27267b(Object obj, dhb dhb) {
        try {
            dhb.m27270a(obj);
        } catch (InvocationTargetException e) {
            dgz.m27259a("Could not dispatch event: " + obj.getClass() + " to handler " + dhb, e);
        }
    }

    /* renamed from: a */
    dhc m27261a(Class<?> cls) {
        return (dhc) this.f21609b.get(cls);
    }

    /* renamed from: b */
    Set<dhb> m27265b(Class<?> cls) {
        return (Set) this.f21608a.get(cls);
    }

    /* renamed from: c */
    Set<Class<?>> m27268c(Class<?> cls) {
        Set<Class<?>> set = (Set) this.f21615h.get(cls);
        if (set != null) {
            return set;
        }
        set = m27260d(cls);
        this.f21615h.put(cls, set);
        return set;
    }

    /* renamed from: d */
    private Set<Class<?>> m27260d(Class<?> cls) {
        List linkedList = new LinkedList();
        Set<Class<?>> hashSet = new HashSet();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove(0);
            hashSet.add(cls2);
            cls2 = cls2.getSuperclass();
            if (cls2 != null) {
                linkedList.add(cls2);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m27259a(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            throw new RuntimeException(str, cause);
        }
        throw new RuntimeException(str);
    }
}
