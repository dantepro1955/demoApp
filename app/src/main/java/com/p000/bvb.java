package com.p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p000.bui;

/* compiled from: ConstructorConstructor */
/* renamed from: bvb */
public final class bvb {
    /* renamed from: a */
    private final Map<Type, bud<?>> f7740a;

    /* compiled from: ConstructorConstructor */
    /* renamed from: bvb$2 */
    class C15072 implements bvg<T> {
        /* renamed from: a */
        final /* synthetic */ bvb f7726a;

        C15072(bvb bvb) {
            this.f7726a = bvb;
        }

        /* renamed from: a */
        public T mo1545a() {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: bvb$3 */
    class C15083 implements bvg<T> {
        /* renamed from: a */
        final /* synthetic */ bvb f7727a;

        C15083(bvb bvb) {
            this.f7727a = bvb;
        }

        /* renamed from: a */
        public T mo1545a() {
            return new TreeMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: bvb$4 */
    class C15094 implements bvg<T> {
        /* renamed from: a */
        final /* synthetic */ bvb f7728a;

        C15094(bvb bvb) {
            this.f7728a = bvb;
        }

        /* renamed from: a */
        public T mo1545a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: bvb$5 */
    class C15105 implements bvg<T> {
        /* renamed from: a */
        final /* synthetic */ bvb f7729a;

        C15105(bvb bvb) {
            this.f7729a = bvb;
        }

        /* renamed from: a */
        public T mo1545a() {
            return new bvf();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: bvb$9 */
    class C15149 implements bvg<T> {
        /* renamed from: a */
        final /* synthetic */ bvb f7739a;

        C15149(bvb bvb) {
            this.f7739a = bvb;
        }

        /* renamed from: a */
        public T mo1545a() {
            return new TreeSet();
        }
    }

    public bvb(Map<Type, bud<?>> map) {
        this.f7740a = map;
    }

    /* renamed from: a */
    public <T> bvg<T> m11155a(bvz<T> bvz) {
        final Type b = bvz.m11005b();
        Class a = bvz.m11004a();
        final bud bud = (bud) this.f7740a.get(b);
        if (bud != null) {
            return new bvg<T>(this) {
                /* renamed from: c */
                final /* synthetic */ bvb f7725c;

                /* renamed from: a */
                public T mo1545a() {
                    return bud.m11061a(b);
                }
            };
        }
        bud = (bud) this.f7740a.get(a);
        if (bud != null) {
            return new bvg<T>(this) {
                /* renamed from: c */
                final /* synthetic */ bvb f7736c;

                /* renamed from: a */
                public T mo1545a() {
                    return bud.m11061a(b);
                }
            };
        }
        bvg<T> a2 = m11152a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = m11153a(b, a);
        return a2 == null ? m11154b(b, a) : a2;
    }

    /* renamed from: a */
    private <T> bvg<T> m11152a(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new bvg<T>(this) {
                /* renamed from: b */
                final /* synthetic */ bvb f7738b;

                /* renamed from: a */
                public T mo1545a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (Throwable e) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> bvg<T> m11153a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C15149(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new bvg<T>(this) {
                    /* renamed from: b */
                    final /* synthetic */ p000.bvb f7718b;

                    /* renamed from: a */
                    public T mo1545a() {
                        if (type instanceof ParameterizedType) {
                            Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type instanceof Class) {
                                return EnumSet.noneOf((Class) type);
                            }
                            throw new bui("Invalid EnumSet type: " + type.toString());
                        }
                        throw new bui("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new bvg<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ p000.bvb f7719a;

                    {
                        this.f7719a = r1;
                    }

                    /* renamed from: a */
                    public T mo1545a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new bvg<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ p000.bvb f7720a;

                    {
                        this.f7720a = r1;
                    }

                    /* renamed from: a */
                    public T mo1545a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new bvg<T>(this) {
                /* renamed from: a */
                final /* synthetic */ p000.bvb f7721a;

                {
                    this.f7721a = r1;
                }

                /* renamed from: a */
                public T mo1545a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new bvg<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ p000.bvb f7722a;

                    {
                        this.f7722a = r1;
                    }

                    /* renamed from: a */
                    public T mo1545a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C15072(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C15083(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(bvz.m11001a(((ParameterizedType) type).getActualTypeArguments()[0]).m11004a())) {
                return new C15105(this);
            }
            return new C15094(this);
        }
    }

    /* renamed from: b */
    private <T> bvg<T> m11154b(final Type type, final Class<? super T> cls) {
        return new bvg<T>(this) {
            /* renamed from: c */
            final /* synthetic */ bvb f7732c;
            /* renamed from: d */
            private final bvj f7733d = bvj.m11191a();

            /* renamed from: a */
            public T mo1545a() {
                try {
                    return this.f7733d.mo1547a(cls);
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    public String toString() {
        return this.f7740a.toString();
    }
}
