package com.p000;

import java.util.Date;
import java.util.List;

/* compiled from: WhereCondition */
/* renamed from: dos */
public interface dos {

    /* compiled from: WhereCondition */
    /* renamed from: dos$a */
    public static abstract class C5028a implements dos {
        /* renamed from: a */
        protected final boolean f22456a;
        /* renamed from: b */
        protected final Object f22457b;
        /* renamed from: c */
        protected final Object[] f22458c;

        public C5028a() {
            this.f22456a = false;
            this.f22457b = null;
            this.f22458c = null;
        }

        public C5028a(Object obj) {
            this.f22457b = obj;
            this.f22456a = true;
            this.f22458c = null;
        }

        public C5028a(Object[] objArr) {
            this.f22457b = null;
            this.f22456a = false;
            this.f22458c = objArr;
        }

        /* renamed from: a */
        public void mo4505a(List<Object> list) {
            if (this.f22456a) {
                list.add(this.f22457b);
            } else if (this.f22458c != null) {
                for (Object add : this.f22458c) {
                    list.add(add);
                }
            }
        }
    }

    /* compiled from: WhereCondition */
    /* renamed from: dos$b */
    public static class C5029b extends C5028a {
        /* renamed from: d */
        public final dnz f22459d;
        /* renamed from: e */
        public final String f22460e;

        /* renamed from: a */
        private static Object m28499a(dnz dnz, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new dnw("Illegal value: found array, but simple object required");
            } else if (dnz.f22367b == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                throw new dnw("Illegal date value: expected java.util.Date or Long for value " + obj);
            } else if (dnz.f22367b != Boolean.TYPE && dnz.f22367b != Boolean.class) {
                return obj;
            } else {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    if (intValue == 0 || intValue == 1) {
                        return obj;
                    }
                    throw new dnw("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                } else if (!(obj instanceof String)) {
                    return obj;
                } else {
                    String str = (String) obj;
                    if ("TRUE".equalsIgnoreCase(str)) {
                        return Integer.valueOf(1);
                    }
                    if ("FALSE".equalsIgnoreCase(str)) {
                        return Integer.valueOf(0);
                    }
                    throw new dnw("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                }
            }
        }

        /* renamed from: a */
        private static Object[] m28500a(dnz dnz, Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = C5029b.m28499a(dnz, objArr[i]);
            }
            return objArr;
        }

        public C5029b(dnz dnz, String str) {
            this.f22459d = dnz;
            this.f22460e = str;
        }

        public C5029b(dnz dnz, String str, Object obj) {
            super(C5029b.m28499a(dnz, obj));
            this.f22459d = dnz;
            this.f22460e = str;
        }

        public C5029b(dnz dnz, String str, Object[] objArr) {
            super(C5029b.m28500a(dnz, objArr));
            this.f22459d = dnz;
            this.f22460e = str;
        }

        /* renamed from: a */
        public void mo4506a(StringBuilder stringBuilder, String str) {
            doh.m28425a(stringBuilder, str, this.f22459d).append(this.f22460e);
        }
    }

    /* compiled from: WhereCondition */
    /* renamed from: dos$c */
    public static class C5030c extends C5028a {
        /* renamed from: d */
        protected final String f22461d;

        public C5030c(String str, Object obj) {
            super(obj);
            this.f22461d = str;
        }

        public C5030c(String str, Object... objArr) {
            super(objArr);
            this.f22461d = str;
        }

        /* renamed from: a */
        public void mo4506a(StringBuilder stringBuilder, String str) {
            stringBuilder.append(this.f22461d);
        }
    }

    /* renamed from: a */
    void mo4506a(StringBuilder stringBuilder, String str);

    /* renamed from: a */
    void mo4505a(List<Object> list);
}
