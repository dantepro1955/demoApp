package com.p000;

import android.database.sqlite.SQLiteDatabase;
import com.ninegag.android.app.model.newdb.GagItemDao;
import com.ninegag.android.app.model.newdb.GagListDao;
import com.ninegag.android.app.model.newdb.GagListItemDao;
import com.ninegag.android.app.model.newdb.UserDao;

/* compiled from: DaoMaster */
/* renamed from: clb */
public class clb extends dnu {
    public /* synthetic */ dnv newSession() {
        return m14229a();
    }

    public /* synthetic */ dnv newSession(dod dod) {
        return m14230a(dod);
    }

    public clb(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, 1);
        a(UserDao.class);
        a(GagItemDao.class);
        a(GagListItemDao.class);
        a(GagListDao.class);
    }

    /* renamed from: a */
    public clc m14229a() {
        return new clc(this.a, dod.f22385a, this.c);
    }

    /* renamed from: a */
    public clc m14230a(dod dod) {
        return new clc(this.a, dod, this.c);
    }
}
