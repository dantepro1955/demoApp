package com.p000;

import android.database.sqlite.SQLiteDatabase;
import com.ninegag.android.app.model.newdb.GagItemDao;
import com.ninegag.android.app.model.newdb.GagListDao;
import com.ninegag.android.app.model.newdb.GagListItemDao;
import com.ninegag.android.app.model.newdb.UserDao;
import java.util.Map;

/* compiled from: DaoSession */
/* renamed from: clc */
public class clc extends dnv {
    /* renamed from: a */
    private final doe f9624a;
    /* renamed from: b */
    private final doe f9625b;
    /* renamed from: c */
    private final doe f9626c;
    /* renamed from: d */
    private final doe f9627d;
    /* renamed from: e */
    private final UserDao f9628e = new UserDao(this.f9624a, this);
    /* renamed from: f */
    private final GagItemDao f9629f = new GagItemDao(this.f9625b, this);
    /* renamed from: g */
    private final GagListItemDao f9630g = new GagListItemDao(this.f9626c, this);
    /* renamed from: h */
    private final GagListDao f9631h = new GagListDao(this.f9627d, this);

    public clc(SQLiteDatabase sQLiteDatabase, dod dod, Map<Class<? extends dnt<?, ?>>, doe> map) {
        super(sQLiteDatabase);
        this.f9624a = ((doe) map.get(UserDao.class)).a();
        this.f9624a.a(dod);
        this.f9625b = ((doe) map.get(GagItemDao.class)).a();
        this.f9625b.a(dod);
        this.f9626c = ((doe) map.get(GagListItemDao.class)).a();
        this.f9626c.a(dod);
        this.f9627d = ((doe) map.get(GagListDao.class)).a();
        this.f9627d.a(dod);
        a(clg.class, this.f9628e);
        a(cld.class, this.f9629f);
        a(clf.class, this.f9630g);
        a(cle.class, this.f9631h);
    }

    /* renamed from: a */
    public UserDao m14231a() {
        return this.f9628e;
    }

    /* renamed from: b */
    public GagItemDao m14232b() {
        return this.f9629f;
    }

    /* renamed from: c */
    public GagListItemDao m14233c() {
        return this.f9630g;
    }

    /* renamed from: d */
    public GagListDao m14234d() {
        return this.f9631h;
    }
}
