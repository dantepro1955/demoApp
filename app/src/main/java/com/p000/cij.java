package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ninegag.android.app.model.FeaturedItemDao;
import com.ninegag.android.app.model.FeaturedListItemDao;
import com.ninegag.android.app.model.GroupItemDao;
import com.ninegag.android.app.model.GroupListDao.Properties;
import com.ninegag.android.app.model.GroupListItemDao;
import com.ninegag.android.app.model.api.ApiFeaturedItem;
import com.ninegag.android.app.model.api.ApiGroup;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.otto.LogoutDoneEvent;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.cii.C1744a;
import p000.cii.C1746c;
import p000.cnw.C1651a;

/* compiled from: DataController */
/* renamed from: cij */
public class cij {
    /* renamed from: e */
    private static cij f9367e = new cij();
    /* renamed from: a */
    protected HashSet<String> f9368a = new HashSet();
    /* renamed from: b */
    public C1750a f9369b;
    /* renamed from: c */
    public cin f9370c;
    /* renamed from: d */
    public cio f9371d;
    /* renamed from: f */
    private Context f9372f;
    /* renamed from: g */
    private cil f9373g;
    /* renamed from: h */
    private SQLiteDatabase f9374h;
    /* renamed from: i */
    private cjw f9375i;
    /* renamed from: j */
    private cjx f9376j;
    /* renamed from: k */
    private clb f9377k;
    /* renamed from: l */
    private clc f9378l;
    /* renamed from: m */
    private boolean f9379m = false;
    /* renamed from: n */
    private ckn f9380n;
    /* renamed from: o */
    private HashMap<String, ckb> f9381o = new HashMap();
    /* renamed from: p */
    private boolean f9382p = false;
    /* renamed from: q */
    private cqc<String, String> f9383q = new cqc(100);
    /* renamed from: r */
    private cqc<String, cki> f9384r = new cqc(100);
    /* renamed from: s */
    private Object f9385s = new Object();

    /* compiled from: DataController */
    /* renamed from: cij$1 */
    class C17471 extends C1651a<Void, Void> {
        /* renamed from: a */
        final /* synthetic */ cij f9362a;

        C17471(cij cij) {
            this.f9362a = cij;
        }

        /* renamed from: a */
        protected Void m13676a(Void... voidArr) {
            this.f9362a.m13740o();
            dct.a().j();
            return null;
        }
    }

    /* compiled from: DataController */
    /* renamed from: cij$2 */
    class C17482 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cij f9363a;

        C17482(cij cij) {
            this.f9363a = cij;
        }

        public void run() {
            dhe.a().c(new LogoutDoneEvent());
        }
    }

    /* compiled from: DataController */
    /* renamed from: cij$a */
    public class C1750a {
        /* renamed from: a */
        final /* synthetic */ cij f9366a;

        public C1750a(cij cij) {
            this.f9366a = cij;
        }

        /* renamed from: a */
        public ckl m13678a(String str) {
            List d = this.f9366a.f9376j.m14111e().queryBuilder().a(Properties.f18213b.a(str), new dos[0]).d();
            if (d.size() == 0) {
                return null;
            }
            return (ckl) d.get(0);
        }

        /* renamed from: b */
        public ckl m13682b(String str) {
            ckl a = m13678a(str);
            if (a != null) {
                return a;
            }
            a = new ckl();
            a.m14187a(str);
            a.m14189b("");
            a.m14185a(Boolean.valueOf(true));
            this.f9366a.f9376j.m14111e().insert(a);
            return a;
        }

        /* renamed from: c */
        public boolean m13683c(String str) {
            return m13682b(str).m14191d().booleanValue();
        }

        /* renamed from: a */
        public void m13680a(String str, String str2, boolean z) {
            ckl b = m13682b(str);
            b.m14189b(str2);
            b.m14185a(Boolean.valueOf(z));
            this.f9366a.f9376j.m14111e().update(b);
        }

        /* renamed from: a */
        public List<ckm> m13679a(String str, int i) {
            return this.f9366a.f9376j.m14110d().queryBuilder().a(GroupListItemDao.Properties.f18218c.a(str), new dos[0]).a(new dnz[]{GroupListItemDao.Properties.f18216a}).b(i).a(1000).d();
        }

        /* renamed from: d */
        public void m13684d(String str) {
            this.f9366a.f9376j.m14110d().queryBuilder().a(GroupListItemDao.Properties.f18218c.a(str), new dos[0]).b().c();
            m13680a(str, "", true);
        }

        /* renamed from: a */
        public void m13681a(String str, ApiGroup[] apiGroupArr) {
            for (ApiGroup apiGroup : apiGroupArr) {
                ckk a = m13677a(apiGroup);
                ckm ckm = new ckm();
                ckm.m14196a(str);
                ckm.m14194a(a);
                ckm.m14199b(apiGroup.id);
                this.f9366a.f9376j.m14110d().insert(ckm);
            }
        }

        /* renamed from: a */
        public ckk m13677a(ApiGroup apiGroup) {
            ckk ckk;
            boolean z;
            boolean z2 = true;
            ckk e = m13685e(apiGroup.id);
            if (e == null) {
                ckk = new ckk();
                z = true;
            } else {
                ckk = e;
                z = false;
            }
            ckk.m14169a(apiGroup.id);
            ckk.m14173c(apiGroup.name);
            ckk.m14171b(apiGroup.url);
            ckk.m14175d(apiGroup.ogImageUrl);
            ckk.m14177e(apiGroup.listType2);
            ckk.m14179f(apiGroup.description);
            if (apiGroup.userUploadEnabled != 1) {
                z2 = false;
            }
            ckk.m14167a(Boolean.valueOf(z2));
            ckk.m14181g(djm.a(apiGroup.posts));
            if (apiGroup.listType2 != null) {
                ckk.m14177e(apiGroup.listType2);
            } else {
                ckk.m14177e(apiGroup.listType);
            }
            if (z) {
                this.f9366a.f9376j.m14109c().insert(ckk);
            } else {
                this.f9366a.f9376j.m14109c().update(ckk);
            }
            return ckk;
        }

        /* renamed from: e */
        public ckk m13685e(String str) {
            List d = this.f9366a.f9376j.m14109c().queryBuilder().a(GroupItemDao.Properties.f18204b.a(str), new dos[0]).d();
            if (d.size() == 0) {
                return null;
            }
            return (ckk) d.get(0);
        }

        /* renamed from: f */
        public ckk m13686f(String str) {
            List d = this.f9366a.f9376j.m14109c().queryBuilder().a(GroupItemDao.Properties.f18205c.a(str), new dos[0]).d();
            if (d.size() == 0) {
                return null;
            }
            return (ckk) d.get(0);
        }
    }

    /* renamed from: a */
    public static cij m13687a() {
        return f9367e;
    }

    private cij() {
    }

    /* renamed from: a */
    public void m13698a(Context context) {
        this.f9372f = context;
        m13693s();
        this.f9379m = true;
        this.f9369b = new C1750a(this);
        this.f9370c = new cin(this.f9378l);
        this.f9371d = new cio(this.f9378l);
        cip.m13967a().mo1759J();
    }

    /* renamed from: s */
    private synchronized void m13693s() {
        if (this.f9373g == null) {
            this.f9373g = new cil(this.f9372f);
        }
        if (this.f9374h == null) {
            this.f9374h = this.f9373g.getWritableDatabase();
        }
        if (this.f9375i == null) {
            this.f9375i = new cjw(this.f9374h);
        }
        if (this.f9376j == null) {
            this.f9376j = this.f9375i.m14105a();
        }
        if (this.f9377k == null) {
            this.f9377k = new clb(this.f9374h);
        }
        if (this.f9378l == null) {
            this.f9378l = this.f9377k.m14229a();
        }
    }

    /* renamed from: b */
    public SQLiteDatabase m13714b() {
        return this.f9374h;
    }

    /* renamed from: c */
    public boolean m13721c() {
        return this.f9379m;
    }

    /* renamed from: d */
    public void m13724d() {
        this.f9373g.m13761a();
    }

    /* renamed from: e */
    public void m13726e() {
        cip a = cip.m13967a();
        a.m13984a(null, 0, 0);
        a.m13885f(null);
        a.m13993c(null);
        a.m13866a(5);
        a.m13932p(null);
        a.m13881e(true);
        a.m13910k(null);
        m13741p();
        caf.m12046a().m12094x().m12106e();
        ccs.F();
        dct.a().a(this.f9372f, a.aN(), new can(), true, false);
        dct.a().i();
        new C17471(this).m12222b(new Void[0]);
        new Handler(Looper.getMainLooper()).post(new C17482(this));
        caf.m12046a().m12069d(this.f9372f);
        chn.m13387b();
    }

    /* renamed from: a */
    private void m13692a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: f */
    public boolean m13727f() {
        return this.f9382p;
    }

    /* renamed from: a */
    public void m13710a(boolean z) {
        this.f9382p = z;
    }

    /* renamed from: a */
    public ckb m13696a(String str) {
        if (str == null) {
            return null;
        }
        if (this.f9381o.containsKey(str)) {
            return (ckb) this.f9381o.get(str);
        }
        Cursor a = cim.m13787a(this.f9374h, str);
        if (a == null) {
            return null;
        }
        if (a.moveToFirst()) {
            ckb a2 = m13689a(null, a);
            m13692a(a);
            this.f9381o.put(str, a2);
            return a2;
        }
        m13692a(a);
        return null;
    }

    /* renamed from: a */
    public void m13700a(ckb ckb) {
        if (ckb != null) {
            synchronized (this.f9385s) {
                this.f9381o.remove(ckb.f9492b);
                cim.m13778a(this.f9374h, ckb);
            }
        }
    }

    /* renamed from: a */
    public void m13697a(long j, boolean z) {
        this.f9370c.m13819a(j, z);
    }

    /* renamed from: a */
    private ckb m13689a(ckb ckb, Cursor cursor) {
        if (ckb == null) {
            ckb = new ckb(true);
        }
        C1744a.m13667a(ckb, cursor);
        C1744a.m13673a(ckb.f9479B, cursor);
        int columnIndex = cursor.getColumnIndex("gli_featured_image_url");
        if (columnIndex != -1) {
            ckb.f9514x = cursor.getString(columnIndex);
        }
        cke[] ckeArr = (cke[]) cpy.a(ckb.f9515y, cke[].class, 1);
        ckb.f9480C.clear();
        ckb.f9480C.addAll(Arrays.asList(ckeArr));
        ckb.f9481D = (ckh) cpy.a(ckb.f9516z, ckh.class, 1);
        return ckb;
    }

    /* renamed from: a */
    private ckj m13691a(ckj ckj, Cursor cursor) {
        if (ckj == null) {
            ckj = new ckj();
        }
        C1744a.m13669a(ckj, cursor);
        return ckj;
    }

    /* renamed from: a */
    private cki m13690a(cki cki, Cursor cursor) {
        if (cki == null) {
            cki = new cki();
        }
        C1744a.m13668a(cki, cursor);
        return cki;
    }

    /* renamed from: a */
    public void m13703a(ckn ckn) {
        this.f9380n = ckn;
        cim.m13776a(this.f9374h, ckn);
    }

    /* renamed from: g */
    public ckn m13729g() {
        if (this.f9380n != null) {
            return this.f9380n;
        }
        Cursor a = cim.m13783a(this.f9374h);
        ckn ckn = new ckn();
        if (a != null) {
            if (a.moveToFirst()) {
                C1744a.m13670a(ckn, a);
            }
            m13692a(a);
        }
        this.f9380n = ckn;
        return ckn;
    }

    /* renamed from: h */
    public boolean m13732h() {
        return m13729g().f9581r;
    }

    /* renamed from: b */
    public void m13716b(boolean z) {
        ckn g = m13729g();
        g.f9581r = z;
        m13703a(g);
    }

    /* renamed from: a */
    public void m13706a(cks cks) {
        cim.m13791a(this.f9374h, cks);
    }

    /* renamed from: i */
    public int m13733i() {
        Cursor a = cim.m13784a(this.f9374h, 2);
        int count = a.getCount();
        m13692a(a);
        return count;
    }

    /* renamed from: j */
    public cks[] m13735j() {
        return m13713a(2);
    }

    /* renamed from: a */
    public cks[] m13713a(int i) {
        Cursor a = cim.m13784a(this.f9374h, i);
        cks[] cksArr = new cks[a.getCount()];
        int i2 = 0;
        if (a.moveToFirst()) {
            while (!a.isAfterLast()) {
                cksArr[i2] = new cks();
                C1744a.m13674a(cksArr[i2], a);
                a.moveToNext();
                i2++;
            }
        }
        m13692a(a);
        return cksArr;
    }

    /* renamed from: b */
    public void m13715b(String str) {
        cim.m13794b(this.f9374h, str, 1);
    }

    /* renamed from: a */
    public void m13705a(ckq ckq) {
        cim.m13790a(this.f9374h, ckq);
    }

    /* renamed from: k */
    public int m13736k() {
        Cursor b = cim.m13795b(this.f9374h, 2);
        int count = b.getCount();
        m13692a(b);
        return count;
    }

    /* renamed from: l */
    public ckq[] m13737l() {
        return m13717b(2);
    }

    /* renamed from: b */
    public ckq[] m13717b(int i) {
        Cursor b = cim.m13795b(this.f9374h, i);
        ckq[] ckqArr = new ckq[b.getCount()];
        int i2 = 0;
        if (b.moveToFirst()) {
            while (!b.isAfterLast()) {
                ckqArr[i2] = new ckq();
                C1744a.m13672a(ckqArr[i2], b);
                b.moveToNext();
                i2++;
            }
        }
        m13692a(b);
        return ckqArr;
    }

    /* renamed from: c */
    public void m13720c(String str) {
        cim.m13798c(this.f9374h, str, 1);
    }

    /* renamed from: a */
    public void m13702a(ckj ckj) {
        this.f9383q.put(ckj.f9537b, ckj.f9538c);
        cim.m13780a(this.f9374h, ckj);
    }

    /* renamed from: a */
    public void m13701a(cki cki) {
        this.f9384r.put(cki.f9534b, cki);
        cim.m13779a(this.f9374h, cki);
    }

    /* renamed from: c */
    public void m13719c(int i) {
        try {
            this.f9383q.clear();
            cim.m13801c(this.f9374h, i);
        } catch (Exception e) {
        }
    }

    /* renamed from: d */
    public ckj m13722d(String str) {
        if (this.f9383q.containsKey(str)) {
            ckj ckj = new ckj();
            ckj.f9537b = str;
            ckj.f9538c = (String) this.f9383q.get(str);
            return ckj;
        }
        try {
            Cursor b = cim.m13796b(this.f9374h, str);
            if (b != null) {
                if (b.moveToFirst()) {
                    ckj a = m13691a(null, b);
                    m13692a(b);
                    this.f9383q.put(str, a.f9538c);
                    return a;
                }
                m13692a(b);
            }
        } catch (Exception e) {
        }
        return null;
    }

    /* renamed from: e */
    public cki m13725e(String str) {
        cki cki;
        if (this.f9384r.containsKey(str)) {
            cki = (cki) this.f9384r.get(str);
            if (cki.f9536d >= m13694t()) {
                return cki;
            }
            this.f9384r.remove(str);
            return null;
        }
        Cursor c = cim.m13799c(this.f9374h, str);
        if (c != null) {
            if (c.moveToFirst()) {
                cki = m13690a(null, c);
                m13692a(c);
                if (cki.f9536d <= m13694t()) {
                    return null;
                }
                this.f9384r.put(str, cki);
                return cki;
            }
            m13692a(c);
        }
        return null;
    }

    /* renamed from: f */
    public boolean m13728f(String str) {
        if (str == null || cim.m13803d(this.f9374h, str) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private long m13694t() {
        return cqw.a() - 300000;
    }

    /* renamed from: g */
    public boolean m13730g(String str) {
        if (str == null || cim.m13782a(this.f9374h, str, m13694t()) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public ckp[] m13711a(int i, int i2) {
        return m13712a(i, i2, 2);
    }

    /* renamed from: a */
    public ckp[] m13712a(int i, int i2, int i3) {
        Cursor a = cim.m13785a(this.f9374h, i, i2, i3);
        ckp[] ckpArr = new ckp[a.getCount()];
        int i4 = 0;
        if (a.moveToFirst()) {
            while (!a.isAfterLast()) {
                ckpArr[i4] = new ckp();
                C1744a.m13671a(ckpArr[i4], a);
                a.moveToNext();
                i4++;
            }
        }
        m13692a(a);
        return ckpArr;
    }

    /* renamed from: m */
    public void m13738m() {
        cim.m13805e(this.f9374h, C1746c.f9358k);
    }

    /* renamed from: a */
    public void m13704a(ckp ckp) {
        SQLiteDatabase sQLiteDatabase = this.f9374h;
        sQLiteDatabase.beginTransaction();
        try {
            if (ckp.f9597i != ckp.f9591c && this.f9368a.contains(ckp.f9592d)) {
                ckp.f9597i = ckp.f9591c;
            }
            cim.m13789a(sQLiteDatabase, ckp, ckp.f9597i != ckp.f9591c);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public void m13708a(String str, int i) {
        if (i == ckp.f9591c) {
            this.f9368a.add(str);
        } else {
            this.f9368a.remove(str);
        }
        cim.m13777a(this.f9374h, str, i);
    }

    /* renamed from: n */
    public int m13739n() {
        return cim.m13802d(this.f9374h);
    }

    /* renamed from: o */
    public void m13740o() {
        this.f9370c.m13818a();
        cim.m13805e(this.f9374h, C1746c.f9358k);
        this.f9371d.m13835a();
        cim.m13805e(this.f9374h, C1746c.f9352e);
        cim.m13805e(this.f9374h, C1746c.f9353f);
        chr.m13522a().m13552a(true, -1);
    }

    /* renamed from: p */
    public void m13741p() {
        cim.m13805e(this.f9374h, C1746c.f9348a);
        cip.m13967a().m13973E();
        this.f9380n = null;
    }

    /* renamed from: q */
    public void m13742q() {
        cim.m13797b(this.f9374h);
        cim.m13800c(this.f9374h);
    }

    /* renamed from: r */
    public void m13743r() {
        cip a = cip.m13967a();
        Object N = a.m13853N();
        if (!TextUtils.isEmpty(N)) {
            try {
                Key H = a.m13976H();
                String e = ctm.e(N, H);
                if (Integer.parseInt(e.split("\\|")[0]) > 0) {
                    a.m13993c(ctm.c(e, H));
                }
            } catch (Exception e2) {
                m13740o();
                m13741p();
            }
        }
    }

    /* renamed from: h */
    public ApiUser m13731h(String str) {
        if (str == null || str.isEmpty() || str.equals(m13729g().f9565b)) {
            return m13729g().m14203a();
        }
        return caf.m12046a().m12051a(str);
    }

    /* renamed from: a */
    public void m13707a(Runnable runnable) {
        this.f9376j.a(runnable);
    }

    /* renamed from: i */
    public cjy m13734i(String str) {
        List d = this.f9376j.m14107a().queryBuilder().a(FeaturedItemDao.Properties.f18181b.a(str), new dos[0]).d();
        if (d.size() > 0) {
            return (cjy) d.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public cjy m13695a(ApiFeaturedItem apiFeaturedItem) {
        cjy i = m13734i(apiFeaturedItem.id);
        Object obj = null;
        if (i == null) {
            obj = 1;
            i = new cjy();
            i.m14114a(apiFeaturedItem.id);
        }
        i.m14116b(apiFeaturedItem.url);
        i.m14118c(apiFeaturedItem.title);
        i.m14120d(apiFeaturedItem.featuredImageUrl);
        if (obj != null) {
            this.f9376j.m14107a().insert(i);
        } else {
            this.f9376j.m14107a().update(i);
        }
        return i;
    }

    /* renamed from: c */
    public List<cka> m13718c(boolean z) {
        doq queryBuilder = this.f9376j.m14108b().queryBuilder();
        if (z) {
            queryBuilder = queryBuilder.a(new dnz[]{FeaturedListItemDao.Properties.f18198b});
        } else {
            queryBuilder = queryBuilder.b(new dnz[]{FeaturedListItemDao.Properties.f18199c});
        }
        return queryBuilder.d();
    }

    /* renamed from: a */
    public void m13709a(List<cka> list) {
        this.f9376j.m14108b().deleteAll();
        for (cka insert : list) {
            this.f9376j.m14108b().insert(insert);
        }
    }

    /* renamed from: d */
    public List<cka> m13723d(boolean z) {
        List<cka> c = m13718c(z);
        for (cka cka : c) {
            switch (cka.m14143d().intValue()) {
                case 1:
                    cka.m14134a(this.f9370c.m13832i(cka.m14144e()));
                    break;
                case 2:
                    cka.m14133a(m13734i(cka.m14144e()));
                    break;
                default:
                    break;
            }
        }
        return c;
    }

    /* renamed from: a */
    public void m13699a(final cka cka) {
        this.f9376j.a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ cij f9365b;

            public void run() {
                int i;
                List c = this.f9365b.m13718c(true);
                int intValue = cka.m14138b().intValue();
                int size = c.size();
                for (i = 0; i < size; i++) {
                    cka cka = (cka) c.get(i);
                    if (cka.m14138b().intValue() > intValue) {
                        cka.m14135a(Integer.valueOf(cka.m14138b().intValue() - 1));
                    }
                }
                cka.m14135a(Integer.valueOf(((cka) c.get(c.size() - 1)).m14138b().intValue() + 1));
                i = c.size();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f9365b.f9376j.m14108b().update(c.get(i2));
                }
                this.f9365b.f9376j.m14108b().update(cka);
            }
        });
    }
}
