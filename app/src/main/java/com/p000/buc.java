package com.p000;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder */
/* renamed from: buc */
public final class buc {
    /* renamed from: a */
    private bvc f7685a = bvc.f7747a;
    /* renamed from: b */
    private bur f7686b = bur.DEFAULT;
    /* renamed from: c */
    private bua f7687c = btz.IDENTITY;
    /* renamed from: d */
    private final Map<Type, bud<?>> f7688d = new HashMap();
    /* renamed from: e */
    private final List<but> f7689e = new ArrayList();
    /* renamed from: f */
    private final List<but> f7690f = new ArrayList();
    /* renamed from: g */
    private boolean f7691g = false;
    /* renamed from: h */
    private String f7692h;
    /* renamed from: i */
    private int f7693i = 2;
    /* renamed from: j */
    private int f7694j = 2;
    /* renamed from: k */
    private boolean f7695k = false;
    /* renamed from: l */
    private boolean f7696l = false;
    /* renamed from: m */
    private boolean f7697m = true;
    /* renamed from: n */
    private boolean f7698n = false;
    /* renamed from: o */
    private boolean f7699o = false;
    /* renamed from: p */
    private boolean f7700p = false;

    /* renamed from: a */
    public buc m11060a(Type type, Object obj) {
        boolean z = (obj instanceof bup) || (obj instanceof bug) || (obj instanceof bud) || (obj instanceof bus);
        buz.m11116a(z);
        if (obj instanceof bud) {
            this.f7688d.put(type, (bud) obj);
        }
        if ((obj instanceof bup) || (obj instanceof bug)) {
            this.f7689e.add(bvv.m11351b(bvz.m11001a(type), obj));
        }
        if (obj instanceof bus) {
            this.f7689e.add(bvx.m11486a(bvz.m11001a(type), (bus) obj));
        }
        return this;
    }

    /* renamed from: a */
    public bub m11059a() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.f7689e);
        Collections.reverse(arrayList);
        arrayList.addAll(this.f7690f);
        m11058a(this.f7692h, this.f7693i, this.f7694j, arrayList);
        return new bub(this.f7685a, this.f7687c, this.f7688d, this.f7691g, this.f7695k, this.f7699o, this.f7697m, this.f7698n, this.f7700p, this.f7696l, this.f7686b, arrayList);
    }

    /* renamed from: a */
    private void m11058a(String str, int i, int i2, List<but> list) {
        Object btw;
        if (str != null && !"".equals(str.trim())) {
            btw = new btw(str);
        } else if (i != 2 && i2 != 2) {
            btw = new btw(i, i2);
        } else {
            return;
        }
        list.add(bvv.m11349a(bvz.m11003b(Date.class), btw));
        list.add(bvv.m11349a(bvz.m11003b(Timestamp.class), btw));
        list.add(bvv.m11349a(bvz.m11003b(java.sql.Date.class), btw));
    }
}
