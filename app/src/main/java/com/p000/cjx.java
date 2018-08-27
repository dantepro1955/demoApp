package com.p000;

import android.database.sqlite.SQLiteDatabase;
import com.ninegag.android.app.model.FeaturedItemDao;
import com.ninegag.android.app.model.FeaturedListDao;
import com.ninegag.android.app.model.FeaturedListItemDao;
import com.ninegag.android.app.model.GroupItemDao;
import com.ninegag.android.app.model.GroupListDao;
import com.ninegag.android.app.model.GroupListItemDao;
import java.util.Map;

/* compiled from: DaoSession */
/* renamed from: cjx */
public class cjx extends dnv {
    /* renamed from: a */
    private final doe f9444a;
    /* renamed from: b */
    private final doe f9445b;
    /* renamed from: c */
    private final doe f9446c;
    /* renamed from: d */
    private final doe f9447d;
    /* renamed from: e */
    private final doe f9448e;
    /* renamed from: f */
    private final doe f9449f;
    /* renamed from: g */
    private final FeaturedItemDao f9450g = new FeaturedItemDao(this.f9444a, this);
    /* renamed from: h */
    private final FeaturedListItemDao f9451h = new FeaturedListItemDao(this.f9445b, this);
    /* renamed from: i */
    private final FeaturedListDao f9452i = new FeaturedListDao(this.f9446c, this);
    /* renamed from: j */
    private final GroupItemDao f9453j = new GroupItemDao(this.f9447d, this);
    /* renamed from: k */
    private final GroupListItemDao f9454k = new GroupListItemDao(this.f9448e, this);
    /* renamed from: l */
    private final GroupListDao f9455l = new GroupListDao(this.f9449f, this);

    public cjx(SQLiteDatabase sQLiteDatabase, dod dod, Map<Class<? extends dnt<?, ?>>, doe> map) {
        super(sQLiteDatabase);
        this.f9444a = ((doe) map.get(FeaturedItemDao.class)).a();
        this.f9444a.a(dod);
        this.f9445b = ((doe) map.get(FeaturedListItemDao.class)).a();
        this.f9445b.a(dod);
        this.f9446c = ((doe) map.get(FeaturedListDao.class)).a();
        this.f9446c.a(dod);
        this.f9447d = ((doe) map.get(GroupItemDao.class)).a();
        this.f9447d.a(dod);
        this.f9448e = ((doe) map.get(GroupListItemDao.class)).a();
        this.f9448e.a(dod);
        this.f9449f = ((doe) map.get(GroupListDao.class)).a();
        this.f9449f.a(dod);
        a(cjy.class, this.f9450g);
        a(cka.class, this.f9451h);
        a(cjz.class, this.f9452i);
        a(ckk.class, this.f9453j);
        a(ckm.class, this.f9454k);
        a(ckl.class, this.f9455l);
    }

    /* renamed from: a */
    public FeaturedItemDao m14107a() {
        return this.f9450g;
    }

    /* renamed from: b */
    public FeaturedListItemDao m14108b() {
        return this.f9451h;
    }

    /* renamed from: c */
    public GroupItemDao m14109c() {
        return this.f9453j;
    }

    /* renamed from: d */
    public GroupListItemDao m14110d() {
        return this.f9454k;
    }

    /* renamed from: e */
    public GroupListDao m14111e() {
        return this.f9455l;
    }
}
