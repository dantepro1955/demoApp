package com.p000;

import com.ninegag.android.app.model.api.ApiGagMediaGroup;
import com.ninegag.android.app.model.api.ApiGagTileGroup;
import com.ninegag.android.app.model.api.ApiTagsResponse.ApiTag;
import com.ninegag.android.app.model.newdb.GagItemDao;

/* compiled from: GagItem */
/* renamed from: cld */
public class cld {
    /* renamed from: A */
    private clg f8777A;
    /* renamed from: B */
    private Long f8778B;
    /* renamed from: C */
    private ApiGagMediaGroup f8779C;
    /* renamed from: D */
    private cke f8780D;
    /* renamed from: E */
    private ckh f8781E;
    /* renamed from: F */
    private String[] f8782F;
    /* renamed from: a */
    private Long f8783a;
    /* renamed from: b */
    private String f8784b;
    /* renamed from: c */
    private String f8785c;
    /* renamed from: d */
    private String f8786d;
    /* renamed from: e */
    private String f8787e;
    /* renamed from: f */
    private String f8788f;
    /* renamed from: g */
    private String f8789g;
    /* renamed from: h */
    private Integer f8790h;
    /* renamed from: i */
    private Integer f8791i;
    /* renamed from: j */
    private Integer f8792j;
    /* renamed from: k */
    private Integer f8793k;
    /* renamed from: l */
    private Integer f8794l;
    /* renamed from: m */
    private Integer f8795m;
    /* renamed from: n */
    private Integer f8796n;
    /* renamed from: o */
    private Integer f8797o;
    /* renamed from: p */
    private String f8798p;
    /* renamed from: q */
    private String f8799q;
    /* renamed from: r */
    private String f8800r;
    /* renamed from: s */
    private String f8801s;
    /* renamed from: t */
    private String f8802t;
    /* renamed from: u */
    private String f8803u;
    /* renamed from: v */
    private Long f8804v;
    /* renamed from: w */
    private String f8805w;
    /* renamed from: x */
    private String f8806x;
    /* renamed from: y */
    private transient clc f8807y;
    /* renamed from: z */
    private transient GagItemDao f8808z;

    public cld(Long l, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str7, String str8, String str9, String str10, String str11, String str12, Long l2, String str13, String str14) {
        this.f8783a = l;
        this.f8784b = str;
        this.f8785c = str2;
        this.f8786d = str3;
        this.f8787e = str4;
        this.f8788f = str5;
        this.f8789g = str6;
        this.f8790h = num;
        this.f8791i = num2;
        this.f8792j = num3;
        this.f8793k = num4;
        this.f8794l = num5;
        this.f8795m = num6;
        this.f8796n = num7;
        this.f8797o = num8;
        this.f8798p = str7;
        this.f8799q = str8;
        this.f8800r = str9;
        this.f8801s = str10;
        this.f8802t = str11;
        this.f8803u = str12;
        this.f8804v = l2;
        this.f8805w = str13;
        this.f8806x = str14;
    }

    /* renamed from: a */
    public void m12614a(clc clc) {
        this.f8807y = clc;
        this.f8808z = clc != null ? clc.m14232b() : null;
    }

    /* renamed from: b */
    public Long m12619b() {
        return this.f8783a;
    }

    /* renamed from: a */
    public void m12617a(Long l) {
        this.f8783a = l;
    }

    /* renamed from: c */
    public String m12623c() {
        return this.f8784b;
    }

    /* renamed from: a */
    public void m12618a(String str) {
        this.f8784b = str;
    }

    /* renamed from: d */
    public String m12626d() {
        return this.f8785c;
    }

    /* renamed from: b */
    public void m12622b(String str) {
        this.f8785c = str;
    }

    /* renamed from: e */
    public String m12629e() {
        return this.f8786d;
    }

    /* renamed from: c */
    public void m12625c(String str) {
        this.f8786d = str;
    }

    /* renamed from: f */
    public String m12632f() {
        return this.f8787e;
    }

    /* renamed from: d */
    public void m12628d(String str) {
        this.f8787e = str;
    }

    /* renamed from: g */
    public String m12635g() {
        return this.f8788f;
    }

    /* renamed from: e */
    public void m12631e(String str) {
        this.f8788f = str;
    }

    /* renamed from: h */
    public String m12638h() {
        return this.f8789g;
    }

    /* renamed from: f */
    public void m12634f(String str) {
        this.f8789g = str;
    }

    /* renamed from: i */
    public Integer m12641i() {
        return this.f8790h;
    }

    /* renamed from: a */
    public void m12616a(Integer num) {
        this.f8790h = num;
    }

    /* renamed from: j */
    public Integer m12643j() {
        return this.f8791i;
    }

    /* renamed from: b */
    public void m12620b(Integer num) {
        this.f8791i = num;
    }

    /* renamed from: k */
    public Integer m12645k() {
        return this.f8792j;
    }

    /* renamed from: c */
    public void m12624c(Integer num) {
        this.f8792j = num;
    }

    /* renamed from: l */
    public Integer m12647l() {
        return this.f8793k;
    }

    /* renamed from: d */
    public void m12627d(Integer num) {
        this.f8793k = num;
    }

    /* renamed from: m */
    public Integer m12649m() {
        return this.f8794l;
    }

    /* renamed from: e */
    public void m12630e(Integer num) {
        this.f8794l = num;
    }

    /* renamed from: n */
    public Integer m12651n() {
        return this.f8795m;
    }

    /* renamed from: f */
    public void m12633f(Integer num) {
        this.f8795m = num;
    }

    /* renamed from: o */
    public Integer m12653o() {
        return this.f8796n;
    }

    /* renamed from: g */
    public void m12636g(Integer num) {
        this.f8796n = num;
    }

    /* renamed from: p */
    public Integer m12654p() {
        return this.f8797o;
    }

    /* renamed from: h */
    public void m12639h(Integer num) {
        this.f8797o = num;
    }

    /* renamed from: q */
    public String m12655q() {
        return this.f8798p;
    }

    /* renamed from: g */
    public void m12637g(String str) {
        this.f8798p = str;
    }

    /* renamed from: r */
    public String m12656r() {
        return this.f8799q;
    }

    /* renamed from: h */
    public void m12640h(String str) {
        this.f8799q = str;
    }

    /* renamed from: s */
    public String m12657s() {
        return this.f8800r;
    }

    /* renamed from: i */
    public void m12642i(String str) {
        this.f8800r = str;
    }

    /* renamed from: t */
    public String m12658t() {
        return this.f8801s;
    }

    /* renamed from: j */
    public void m12644j(String str) {
        this.f8801s = str;
    }

    /* renamed from: u */
    public String m12659u() {
        return this.f8802t;
    }

    /* renamed from: k */
    public void m12646k(String str) {
        this.f8802t = str;
    }

    /* renamed from: v */
    public String m12660v() {
        return this.f8803u;
    }

    /* renamed from: l */
    public void m12648l(String str) {
        this.f8803u = str;
    }

    /* renamed from: w */
    public Long m12661w() {
        return this.f8804v;
    }

    /* renamed from: b */
    public void m12621b(Long l) {
        this.f8804v = l;
    }

    /* renamed from: x */
    public String m12662x() {
        return this.f8805w;
    }

    /* renamed from: m */
    public void m12650m(String str) {
        this.f8805w = str;
    }

    /* renamed from: y */
    public String m12663y() {
        return this.f8806x;
    }

    /* renamed from: n */
    public void m12652n(String str) {
        this.f8806x = str;
    }

    /* renamed from: z */
    public clg m12664z() {
        Long l = this.f8804v;
        if (this.f8778B == null || !this.f8778B.equals(l)) {
            if (this.f8807y == null) {
                throw new dnw("Entity is detached from DAO context");
            }
            clg clg = (clg) this.f8807y.m14231a().load(l);
            synchronized (this) {
                this.f8777A = clg;
                this.f8778B = l;
            }
        }
        return this.f8777A;
    }

    /* renamed from: a */
    public void m12615a(clg clg) {
        synchronized (this) {
            this.f8777A = clg;
            this.f8804v = clg == null ? null : clg.m14271a();
            this.f8778B = this.f8804v;
        }
    }

    /* renamed from: A */
    public void m12609A() {
        if (this.f8808z == null) {
            throw new dnw("Entity is detached from DAO context");
        }
        this.f8808z.update(this);
    }

    /* renamed from: B */
    public ApiGagMediaGroup m12610B() {
        if (this.f8779C == null) {
            this.f8779C = (ApiGagMediaGroup) cpy.a(this.f8801s, ApiGagMediaGroup.class, 1);
        }
        return this.f8779C;
    }

    /* renamed from: C */
    public cke m12611C() {
        if (this.f8780D == null) {
            this.f8780D = (cke) cpy.a(this.f8803u, cke.class, 1);
        }
        return this.f8780D;
    }

    /* renamed from: D */
    public ckh m12612D() {
        if (this.f8781E == null) {
            this.f8781E = cpu.a((ApiGagTileGroup) cpy.a(this.f8802t, ApiGagTileGroup.class, 1));
        }
        return this.f8781E;
    }

    /* renamed from: E */
    public String[] m12613E() {
        if (this.f8782F == null) {
            ApiTag[] apiTagArr = (ApiTag[]) cpy.a(this.f8806x, ApiTag[].class, 1);
            if (apiTagArr != null && apiTagArr.length > 0) {
                this.f8782F = new String[apiTagArr.length];
                for (int i = 0; i < apiTagArr.length; i++) {
                    this.f8782F[i] = apiTagArr[i].key;
                }
            }
        }
        return this.f8782F;
    }
}
