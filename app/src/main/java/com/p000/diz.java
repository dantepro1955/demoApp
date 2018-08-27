package com.p000;

/* compiled from: ApiPrimitiveTypeCheckDeserializer */
/* renamed from: diz */
public abstract class diz<T> implements bug<T> {
    /* renamed from: a */
    protected void m22421a(String str, String str2, String str3) throws bul {
        throw new bul("Field \"" + str + "\" is in wrong type '" + str2 + "', expecting '" + str3 + "'");
    }

    /* renamed from: a */
    protected String m22418a(buh buh) {
        if (buh.h()) {
            return "array";
        }
        if (buh.k()) {
            return "json_null";
        }
        if (buh.i()) {
            return "object";
        }
        if (buh.j()) {
            bun n = buh.n();
            if (n.a()) {
                return "boolean";
            }
            if (n.p()) {
                return "number";
            }
            if (n.q()) {
                return "string";
            }
        }
        return "";
    }

    /* renamed from: a */
    protected String m22419a(buk buk, String str) throws bul {
        return m22420a(buk, str, false);
    }

    /* renamed from: b */
    protected String m22422b(buk buk, String str) throws bul {
        return m22420a(buk, str, true);
    }

    /* renamed from: a */
    protected String m22420a(buk buk, String str, boolean z) throws bul {
        buh b = buk.b(str);
        if (b != null) {
            if (!b.j()) {
                m22421a(str, m22418a(b), "string");
            }
            if (!b.n().q()) {
                m22421a(str, m22418a(b), "string");
            }
            return b.c();
        } else if (!z) {
            return null;
        } else {
            throw new bul("No such field \"" + str + "\"");
        }
    }

    /* renamed from: c */
    protected int m22423c(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            throw new bul("No such field \"" + str + "\"");
        }
        if (!b.j()) {
            m22421a(str, m22418a(b), "number");
        }
        if (!b.n().p()) {
            m22421a(str, m22418a(b), "number");
        }
        return b.f();
    }

    /* renamed from: d */
    protected long m22424d(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            throw new bul("No such field \"" + str + "\"");
        }
        if (!b.j()) {
            m22421a(str, m22418a(b), "number");
        }
        if (!b.n().p()) {
            m22421a(str, m22418a(b), "number");
        }
        return b.e();
    }

    /* renamed from: e */
    protected boolean m22425e(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            throw new bul("No such field \"" + str + "\"");
        }
        if (!b.j()) {
            m22421a(str, m22418a(b), "boolean");
        }
        if (!b.n().a()) {
            m22421a(str, m22418a(b), "boolean");
        }
        return b.g();
    }

    /* renamed from: f */
    protected buh m22426f(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            throw new bul("No such field \"" + str + "\"");
        }
        if (!b.i()) {
            m22421a(str, m22418a(b), "object");
        }
        return b;
    }

    /* renamed from: g */
    protected buh m22427g(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            return null;
        }
        if (b.i()) {
            return b;
        }
        m22421a(str, m22418a(b), "object");
        return b;
    }

    /* renamed from: h */
    protected buh m22428h(buk buk, String str) throws bul {
        buh b = buk.b(str);
        if (b == null) {
            return null;
        }
        if (b.h()) {
            return b;
        }
        m22421a(str, m22418a(b), "array");
        return b;
    }
}
