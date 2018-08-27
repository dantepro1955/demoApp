package com.p000;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bqs */
public class bqs {
    /* renamed from: a */
    public static final Object f7399a = new Object();
    /* renamed from: b */
    static final String[] f7400b = "gtm.lifetime".toString().split("\\.");
    /* renamed from: c */
    private static final Pattern f7401c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    /* renamed from: d */
    private final ConcurrentHashMap<C1417b, Integer> f7402d;
    /* renamed from: e */
    private final Map<String, Object> f7403e;
    /* renamed from: f */
    private final ReentrantLock f7404f;
    /* renamed from: g */
    private final LinkedList<Map<String, Object>> f7405g;
    /* renamed from: h */
    private final C1412c f7406h;
    /* renamed from: i */
    private final CountDownLatch f7407i;

    /* renamed from: bqs$c */
    interface C1412c {

        /* renamed from: bqs$c$a */
        public interface C1414a {
            /* renamed from: a */
            void mo1403a(List<C1416a> list);
        }

        /* renamed from: a */
        void mo1401a(C1414a c1414a);

        /* renamed from: a */
        void mo1402a(List<C1416a> list, long j);
    }

    /* renamed from: bqs$1 */
    class C14131 implements C1412c {
        C14131() {
        }

        /* renamed from: a */
        public void mo1401a(C1414a c1414a) {
            c1414a.mo1403a(new ArrayList());
        }

        /* renamed from: a */
        public void mo1402a(List<C1416a> list, long j) {
        }
    }

    /* renamed from: bqs$2 */
    class C14152 implements C1414a {
        /* renamed from: a */
        final /* synthetic */ bqs f7396a;

        C14152(bqs bqs) {
            this.f7396a = bqs;
        }

        /* renamed from: a */
        public void mo1403a(List<C1416a> list) {
            for (C1416a c1416a : list) {
                this.f7396a.m10448b(this.f7396a.m10455a(c1416a.f7397a, c1416a.f7398b));
            }
            this.f7396a.f7407i.countDown();
        }
    }

    /* renamed from: bqs$a */
    static final class C1416a {
        /* renamed from: a */
        public final String f7397a;
        /* renamed from: b */
        public final Object f7398b;

        C1416a(String str, Object obj) {
            this.f7397a = str;
            this.f7398b = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1416a)) {
                return false;
            }
            C1416a c1416a = (C1416a) obj;
            return this.f7397a.equals(c1416a.f7397a) && this.f7398b.equals(c1416a.f7398b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f7397a.hashCode()), Integer.valueOf(this.f7398b.hashCode())});
        }

        public String toString() {
            String str = this.f7397a;
            String valueOf = String.valueOf(this.f7398b.toString());
            return new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Key: ").append(str).append(" value: ").append(valueOf).toString();
        }
    }

    /* renamed from: bqs$b */
    interface C1417b {
        /* renamed from: a */
        void mo1404a(Map<String, Object> map);
    }

    bqs() {
        this(new C14131());
    }

    bqs(C1412c c1412c) {
        this.f7406h = c1412c;
        this.f7402d = new ConcurrentHashMap();
        this.f7403e = new HashMap();
        this.f7404f = new ReentrantLock();
        this.f7405g = new LinkedList();
        this.f7407i = new CountDownLatch(1);
        m10444a();
    }

    /* renamed from: a */
    static Long m10442a(String str) {
        String str2;
        Matcher matcher = f7401c.matcher(str);
        String valueOf;
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                str2 = "illegal number in _lifetime value: ";
                valueOf = String.valueOf(str);
                brd.m10495b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                parseLong = 0;
            }
            if (parseLong <= 0) {
                str2 = "non-positive _lifetime: ";
                valueOf = String.valueOf(str);
                brd.m10497c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
            valueOf = matcher.group(2);
            if (valueOf.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (valueOf.charAt(0)) {
                case 'd':
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case 'h':
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case 's':
                    return Long.valueOf(parseLong * 1000);
                default:
                    str2 = "unknown units in _lifetime: ";
                    valueOf = String.valueOf(str);
                    brd.m10495b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
            }
        }
        str2 = "unknown _lifetime: ";
        valueOf = String.valueOf(str);
        brd.m10497c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }

    /* renamed from: a */
    private void m10444a() {
        this.f7406h.mo1401a(new C14152(this));
    }

    /* renamed from: a */
    private void m10446a(Map<String, Object> map, String str, Collection<C1416a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String str3 = (String) entry.getKey();
            str3 = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
            if (entry.getValue() instanceof Map) {
                m10446a((Map) entry.getValue(), str3, collection);
            } else if (!str3.equals("gtm.lifetime")) {
                collection.add(new C1416a(str3, entry.getValue()));
            }
        }
    }

    /* renamed from: b */
    private void m10447b() {
        int i = 0;
        while (true) {
            Map map = (Map) this.f7405g.poll();
            if (map != null) {
                m10453g(map);
                int i2 = i + 1;
                if (i2 > HttpStatus.HTTP_INTERNAL_SERVER_ERROR) {
                    this.f7405g.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m10448b(Map<String, Object> map) {
        this.f7404f.lock();
        try {
            this.f7405g.offer(map);
            if (this.f7404f.getHoldCount() == 1) {
                m10447b();
            }
            m10449c(map);
        } finally {
            this.f7404f.unlock();
        }
    }

    /* renamed from: c */
    private void m10449c(Map<String, Object> map) {
        Long d = m10450d(map);
        if (d != null) {
            this.f7406h.mo1402a(m10452f(map), d.longValue());
        }
    }

    /* renamed from: d */
    private Long m10450d(Map<String, Object> map) {
        Object e = m10451e(map);
        return e == null ? null : bqs.m10442a(e.toString());
    }

    /* renamed from: e */
    private Object m10451e(Map<String, Object> map) {
        String[] strArr = f7400b;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    /* renamed from: f */
    private List<C1416a> m10452f(Map<String, Object> map) {
        Object arrayList = new ArrayList();
        m10446a(map, "", arrayList);
        return arrayList;
    }

    /* renamed from: g */
    private void m10453g(Map<String, Object> map) {
        synchronized (this.f7403e) {
            for (String str : map.keySet()) {
                m10459a(m10455a(str, map.get(str)), this.f7403e);
            }
        }
        m10454h(map);
    }

    /* renamed from: h */
    private void m10454h(Map<String, Object> map) {
        for (C1417b a : this.f7402d.keySet()) {
            a.mo1404a(map);
        }
    }

    /* renamed from: a */
    Map<String, Object> m10455a(String str, Object obj) {
        Map hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj2 = hashMap2;
        }
        map.put(split[split.length - 1], obj);
        return hashMap;
    }

    /* renamed from: a */
    void m10456a(C1417b c1417b) {
        this.f7402d.put(c1417b, Integer.valueOf(0));
    }

    /* renamed from: a */
    void m10457a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m10457a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m10459a((Map) obj, (Map) list2.get(i));
            } else if (obj != f7399a) {
                list2.set(i, obj);
            }
        }
    }

    /* renamed from: a */
    public void m10458a(Map<String, Object> map) {
        try {
            this.f7407i.await();
        } catch (InterruptedException e) {
            brd.m10495b("DataLayer.push: unexpected InterruptedException");
        }
        m10448b(map);
    }

    /* renamed from: a */
    void m10459a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m10457a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m10459a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.f7403e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : this.f7403e.entrySet()) {
                stringBuilder2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }
}
