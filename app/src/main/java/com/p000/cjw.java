package com.p000;

import android.database.sqlite.SQLiteDatabase;
import com.ninegag.android.app.model.FeaturedItemDao;
import com.ninegag.android.app.model.FeaturedListDao;
import com.ninegag.android.app.model.FeaturedListItemDao;
import com.ninegag.android.app.model.GroupItemDao;
import com.ninegag.android.app.model.GroupListDao;
import com.ninegag.android.app.model.GroupListItemDao;

/* compiled from: DaoMaster */
/* renamed from: cjw */
public class cjw extends dnu {
    public /* synthetic */ dnv newSession() {
        return m14105a();
    }

    public /* synthetic */ dnv newSession(dod dod) {
        return m14106a(dod);
    }

    public cjw(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, 1);
        a(FeaturedItemDao.class);
        a(FeaturedListItemDao.class);
        a(FeaturedListDao.class);
        a(GroupItemDao.class);
        a(GroupListItemDao.class);
        a(GroupListDao.class);
    }

    /* renamed from: a */
    public cjx m14105a() {
        return new cjx(this.a, dod.f22385a, this.c);
    }

    /* renamed from: a */
    public cjx m14106a(dod dod) {
        return new cjx(this.a, dod, this.c);
    }
}
