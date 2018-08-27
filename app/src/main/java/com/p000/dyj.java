package com.p000;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxJavaPlugins */
/* renamed from: dyj */
public class dyj {
    /* renamed from: a */
    static final dyf f16848a = new dyj$1();
    /* renamed from: b */
    private static final dyj f16849b = new dyj();
    /* renamed from: c */
    private final AtomicReference<dyf> f16850c = new AtomicReference();
    /* renamed from: d */
    private final AtomicReference<dyh> f16851d = new AtomicReference();
    /* renamed from: e */
    private final AtomicReference<dyl> f16852e = new AtomicReference();
    /* renamed from: f */
    private final AtomicReference<dye> f16853f = new AtomicReference();
    /* renamed from: g */
    private final AtomicReference<dyk> f16854g = new AtomicReference();

    @Deprecated
    /* renamed from: a */
    public static dyj m21107a() {
        return f16849b;
    }

    dyj() {
    }

    /* renamed from: b */
    public dyf m21109b() {
        if (this.f16850c.get() == null) {
            Object a = dyj.m21108a(dyf.class, System.getProperties());
            if (a == null) {
                this.f16850c.compareAndSet(null, f16848a);
            } else {
                this.f16850c.compareAndSet(null, (dyf) a);
            }
        }
        return (dyf) this.f16850c.get();
    }

    /* renamed from: c */
    public dyh m21110c() {
        if (this.f16851d.get() == null) {
            Object a = dyj.m21108a(dyh.class, System.getProperties());
            if (a == null) {
                this.f16851d.compareAndSet(null, dyi.a());
            } else {
                this.f16851d.compareAndSet(null, (dyh) a);
            }
        }
        return (dyh) this.f16851d.get();
    }

    /* renamed from: d */
    public dyl m21111d() {
        if (this.f16852e.get() == null) {
            Object a = dyj.m21108a(dyl.class, System.getProperties());
            if (a == null) {
                this.f16852e.compareAndSet(null, dym.a());
            } else {
                this.f16852e.compareAndSet(null, (dyl) a);
            }
        }
        return (dyl) this.f16852e.get();
    }

    /* renamed from: e */
    public dye m21112e() {
        if (this.f16853f.get() == null) {
            Object a = dyj.m21108a(dye.class, System.getProperties());
            if (a == null) {
                this.f16853f.compareAndSet(null, new dyj$2(this));
            } else {
                this.f16853f.compareAndSet(null, (dye) a);
            }
        }
        return (dye) this.f16853f.get();
    }

    /* renamed from: a */
    static Object m21108a(Class<?> cls, Properties properties) {
        String str;
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String str2 = "rxjava.plugin.";
        String property = properties2.getProperty(str2 + simpleName + ".implementation");
        if (property == null) {
            String str3 = ".class";
            String str4 = ".impl";
            for (Entry entry : properties2.entrySet()) {
                String obj = entry.getKey().toString();
                if (obj.startsWith(str2) && obj.endsWith(str3) && simpleName.equals(entry.getValue().toString())) {
                    str = str2 + obj.substring(0, obj.length() - str3.length()).substring(str2.length()) + str4;
                    String property2 = properties2.getProperty(str);
                    if (property2 == null) {
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                    str = property2;
                    if (str != null) {
                        return null;
                    }
                    try {
                        return Class.forName(str).asSubclass(cls).newInstance();
                    } catch (Throwable e) {
                        throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + str, e);
                    } catch (Throwable e2) {
                        throw new IllegalStateException(simpleName + " implementation class not found: " + str, e2);
                    } catch (Throwable e22) {
                        throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + str, e22);
                    } catch (Throwable e222) {
                        throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + str, e222);
                    }
                }
            }
        }
        str = property;
        if (str != null) {
            return null;
        }
        return Class.forName(str).asSubclass(cls).newInstance();
    }

    /* renamed from: f */
    public dyk m21113f() {
        if (this.f16854g.get() == null) {
            Object a = dyj.m21108a(dyk.class, System.getProperties());
            if (a == null) {
                this.f16854g.compareAndSet(null, dyk.m21120g());
            } else {
                this.f16854g.compareAndSet(null, (dyk) a);
            }
        }
        return (dyk) this.f16854g.get();
    }
}
