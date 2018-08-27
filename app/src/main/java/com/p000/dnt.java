package com.p000;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.under9.android.lib.network.model.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractDao */
/* renamed from: dnt */
public abstract class dnt<T, K> {
    /* renamed from: a */
    protected final SQLiteDatabase f18185a;
    /* renamed from: b */
    protected final doe f18186b;
    /* renamed from: c */
    protected doa<K, T> f18187c;
    /* renamed from: d */
    protected dob<T> f18188d;
    /* renamed from: e */
    protected doi f18189e;
    /* renamed from: f */
    protected final dnv f18190f;
    /* renamed from: g */
    protected final int f18191g;

    /* renamed from: a */
    protected abstract K mo3754a(T t, long j);

    /* renamed from: a */
    protected abstract void mo3755a(SQLiteStatement sQLiteStatement, T t);

    /* renamed from: a */
    protected abstract boolean mo3756a();

    protected abstract K getKey(T t);

    protected abstract T readEntity(Cursor cursor, int i);

    protected abstract void readEntity(Cursor cursor, T t, int i);

    protected abstract K readKey(Cursor cursor, int i);

    public dnt(doe doe) {
        this(doe, null);
    }

    public dnt(doe doe, dnv dnv) {
        this.f18186b = doe;
        this.f18190f = dnv;
        this.f18185a = doe.f22388a;
        this.f18187c = doe.m28411b();
        if (this.f18187c instanceof dob) {
            this.f18188d = (dob) this.f18187c;
        }
        this.f18189e = doe.f22396i;
        this.f18191g = doe.f22394g != null ? doe.f22394g.f22366a : -1;
    }

    public dnv getSession() {
        return this.f18190f;
    }

    public String getTablename() {
        return this.f18186b.f22389b;
    }

    public dnz[] getProperties() {
        return this.f18186b.f22390c;
    }

    public dnz getPkProperty() {
        return this.f18186b.f22394g;
    }

    public String[] getAllColumns() {
        return this.f18186b.f22391d;
    }

    public String[] getPkColumns() {
        return this.f18186b.f22392e;
    }

    public String[] getNonPkColumns() {
        return this.f18186b.f22393f;
    }

    public T load(K k) {
        m22359b();
        if (k == null) {
            return null;
        }
        if (this.f18187c != null) {
            T a = this.f18187c.mo4491a((Object) k);
            if (a != null) {
                return a;
            }
        }
        return m22348a(this.f18185a.rawQuery(this.f18189e.m28436f(), new String[]{k.toString()}));
    }

    public T loadByRowId(long j) {
        return m22348a(this.f18185a.rawQuery(this.f18189e.m28437g(), new String[]{Long.toString(j)}));
    }

    /* renamed from: a */
    protected T m22348a(Cursor cursor) {
        try {
            T b = m22357b(cursor);
            return b;
        } finally {
            cursor.close();
        }
    }

    /* renamed from: b */
    protected T m22357b(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return m22349a(cursor, 0, true);
        }
        throw new dnw("Expected unique result, but count was " + cursor.getCount());
    }

    public List<T> loadAll() {
        return m22360c(this.f18185a.rawQuery(this.f18189e.m28435e(), null));
    }

    public boolean detach(T t) {
        if (this.f18187c == null) {
            return false;
        }
        return this.f18187c.mo4501c(m22358b((Object) t), t);
    }

    public void detachAll() {
        if (this.f18187c != null) {
            this.f18187c.mo4492a();
        }
    }

    /* renamed from: c */
    protected List<T> m22360c(Cursor cursor) {
        try {
            List<T> d = m22361d(cursor);
            return d;
        } finally {
            cursor.close();
        }
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, mo3756a());
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), mo3756a());
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
        m22344a(this.f18189e.m28431a(), (Iterable) iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
        m22344a(this.f18189e.m28432b(), (Iterable) iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, mo3756a());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), mo3756a());
    }

    /* renamed from: a */
    private void m22344a(SQLiteStatement sQLiteStatement, Iterable<T> iterable, boolean z) {
        this.f18185a.beginTransaction();
        try {
            synchronized (sQLiteStatement) {
                if (this.f18187c != null) {
                    this.f18187c.mo4497b();
                }
                try {
                    for (Object next : iterable) {
                        mo3755a(sQLiteStatement, next);
                        if (z) {
                            m22353a(next, sQLiteStatement.executeInsert(), false);
                        } else {
                            sQLiteStatement.execute();
                        }
                    }
                    if (this.f18187c != null) {
                        this.f18187c.mo4499c();
                    }
                } catch (Throwable th) {
                    if (this.f18187c != null) {
                        this.f18187c.mo4499c();
                    }
                }
            }
            this.f18185a.setTransactionSuccessful();
        } finally {
            this.f18185a.endTransaction();
        }
    }

    public long insert(T t) {
        return m22342a((Object) t, this.f18189e.m28431a());
    }

    public long insertWithoutSettingPk(T t) {
        long executeInsert;
        SQLiteStatement a = this.f18189e.m28431a();
        if (this.f18185a.isDbLockedByCurrentThread()) {
            synchronized (a) {
                mo3755a(a, (Object) t);
                executeInsert = a.executeInsert();
            }
        } else {
            this.f18185a.beginTransaction();
            try {
                synchronized (a) {
                    mo3755a(a, (Object) t);
                    executeInsert = a.executeInsert();
                }
                this.f18185a.setTransactionSuccessful();
            } finally {
                this.f18185a.endTransaction();
            }
        }
        return executeInsert;
    }

    public long insertOrReplace(T t) {
        return m22342a((Object) t, this.f18189e.m28432b());
    }

    /* renamed from: a */
    private long m22342a(T t, SQLiteStatement sQLiteStatement) {
        long executeInsert;
        if (this.f18185a.isDbLockedByCurrentThread()) {
            synchronized (sQLiteStatement) {
                mo3755a(sQLiteStatement, (Object) t);
                executeInsert = sQLiteStatement.executeInsert();
            }
        } else {
            this.f18185a.beginTransaction();
            try {
                synchronized (sQLiteStatement) {
                    mo3755a(sQLiteStatement, (Object) t);
                    executeInsert = sQLiteStatement.executeInsert();
                }
                this.f18185a.setTransactionSuccessful();
            } finally {
                this.f18185a.endTransaction();
            }
        }
        m22353a((Object) t, executeInsert, true);
        return executeInsert;
    }

    /* renamed from: a */
    protected void m22353a(T t, long j, boolean z) {
        if (j != -1) {
            m22355a(mo3754a((Object) t, j), (Object) t, z);
        } else {
            dnx.m28324b("Could not insert row (executeInsert returned -1)");
        }
    }

    /* renamed from: d */
    protected List<T> m22361d(Cursor cursor) {
        int count = cursor.getCount();
        if (count == 0) {
            return new ArrayList();
        }
        Object obj;
        CursorWindow cursorWindow;
        List<T> arrayList = new ArrayList(count);
        if (cursor instanceof CrossProcessCursor) {
            CursorWindow window = ((CrossProcessCursor) cursor).getWindow();
            if (window != null) {
                if (window.getNumRows() == count) {
                    cursor = new dof(window);
                    obj = 1;
                    cursorWindow = window;
                } else {
                    dnx.m28322a("Window vs. result size: " + window.getNumRows() + Constants.SEP + count);
                }
            }
            obj = null;
            cursorWindow = window;
        } else {
            cursorWindow = null;
            obj = null;
        }
        if (cursor.moveToFirst()) {
            if (this.f18187c != null) {
                this.f18187c.mo4497b();
                this.f18187c.mo4493a(count);
            }
            if (obj == null && cursorWindow != null) {
                try {
                    if (this.f18187c != null) {
                        m22343a(cursor, cursorWindow, (List) arrayList);
                        if (this.f18187c != null) {
                            this.f18187c.mo4499c();
                        }
                    }
                } catch (Throwable th) {
                    if (this.f18187c != null) {
                        this.f18187c.mo4499c();
                    }
                }
            }
            do {
                arrayList.add(m22349a(cursor, 0, false));
            } while (cursor.moveToNext());
            if (this.f18187c != null) {
                this.f18187c.mo4499c();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m22343a(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i = 0;
        while (true) {
            list.add(m22349a(cursor, 0, false));
            i++;
            if (i >= startPosition) {
                CursorWindow e = m22347e(cursor);
                if (e != null) {
                    startPosition = e.getNumRows() + e.getStartPosition();
                } else {
                    return;
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i++;
        }
    }

    /* renamed from: e */
    private CursorWindow m22347e(Cursor cursor) {
        this.f18187c.mo4499c();
        try {
            if (cursor.moveToNext()) {
                CursorWindow window = ((CrossProcessCursor) cursor).getWindow();
                return window;
            }
            this.f18187c.mo4497b();
            return null;
        } finally {
            this.f18187c.mo4497b();
        }
    }

    /* renamed from: a */
    protected final T m22349a(Cursor cursor, int i, boolean z) {
        T a;
        Object readEntity;
        if (this.f18188d != null) {
            if (i != 0 && cursor.isNull(this.f18191g + i)) {
                return null;
            }
            long j = cursor.getLong(this.f18191g + i);
            a = z ? this.f18188d.m28376a(j) : this.f18188d.m28385b(j);
            if (a != null) {
                return a;
            }
            readEntity = readEntity(cursor, i);
            mo3761a(readEntity);
            if (z) {
                this.f18188d.m28381a(j, readEntity);
                return readEntity;
            }
            this.f18188d.m28389b(j, readEntity);
            return readEntity;
        } else if (this.f18187c != null) {
            Object readKey = readKey(cursor, i);
            if (i != 0 && readKey == null) {
                return null;
            }
            a = z ? this.f18187c.mo4491a(readKey) : this.f18187c.mo4496b(readKey);
            if (a != null) {
                return a;
            }
            readEntity = readEntity(cursor, i);
            m22355a(readKey, readEntity, z);
            return readEntity;
        } else if (i != 0 && readKey(cursor, i) == null) {
            return null;
        } else {
            readEntity = readEntity(cursor, i);
            mo3761a(readEntity);
            return readEntity;
        }
    }

    public List<T> queryRaw(String str, String... strArr) {
        return m22360c(this.f18185a.rawQuery(this.f18189e.m28435e() + str, strArr));
    }

    public dop<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public dop<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return dop.m28461a(this, this.f18189e.m28435e() + str, collection.toArray());
    }

    public void deleteAll() {
        this.f18185a.execSQL("DELETE FROM '" + this.f18186b.f22389b + "'");
        if (this.f18187c != null) {
            this.f18187c.mo4492a();
        }
    }

    public void delete(T t) {
        m22359b();
        deleteByKey(m22358b((Object) t));
    }

    public void deleteByKey(K k) {
        m22359b();
        SQLiteStatement c = this.f18189e.m28433c();
        if (this.f18185a.isDbLockedByCurrentThread()) {
            synchronized (c) {
                m22346b(k, c);
            }
        } else {
            this.f18185a.beginTransaction();
            try {
                synchronized (c) {
                    m22346b(k, c);
                }
                this.f18185a.setTransactionSuccessful();
            } finally {
                this.f18185a.endTransaction();
            }
        }
        if (this.f18187c != null) {
            this.f18187c.mo4500c(k);
        }
    }

    /* renamed from: b */
    private void m22346b(K k, SQLiteStatement sQLiteStatement) {
        if (k instanceof Long) {
            sQLiteStatement.bindLong(1, ((Long) k).longValue());
        } else if (k == null) {
            throw new dnw("Cannot delete entity, key is null");
        } else {
            sQLiteStatement.bindString(1, k.toString());
        }
        sQLiteStatement.execute();
    }

    /* renamed from: a */
    private void m22345a(Iterable<T> iterable, Iterable<K> iterable2) {
        m22359b();
        SQLiteStatement c = this.f18189e.m28433c();
        Iterable iterable3 = null;
        this.f18185a.beginTransaction();
        try {
            synchronized (c) {
                Object b;
                if (this.f18187c != null) {
                    this.f18187c.mo4497b();
                    iterable3 = new ArrayList();
                }
                if (iterable != null) {
                    try {
                        for (T b2 : iterable) {
                            b = m22358b((Object) b2);
                            m22346b(b, c);
                            if (iterable3 != null) {
                                iterable3.add(b);
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f18187c != null) {
                            this.f18187c.mo4499c();
                        }
                    }
                }
                if (iterable2 != null) {
                    for (Object b3 : iterable2) {
                        m22346b(b3, c);
                        if (iterable3 != null) {
                            iterable3.add(b3);
                        }
                    }
                }
                if (this.f18187c != null) {
                    this.f18187c.mo4499c();
                }
            }
            this.f18185a.setTransactionSuccessful();
            if (!(iterable3 == null || this.f18187c == null)) {
                this.f18187c.mo4494a(iterable3);
            }
            this.f18185a.endTransaction();
        } catch (Throwable th2) {
            this.f18185a.endTransaction();
        }
    }

    public void deleteInTx(Iterable<T> iterable) {
        m22345a((Iterable) iterable, null);
    }

    public void deleteInTx(T... tArr) {
        m22345a(Arrays.asList(tArr), null);
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        m22345a(null, (Iterable) iterable);
    }

    public void deleteByKeyInTx(K... kArr) {
        m22345a(null, Arrays.asList(kArr));
    }

    public void refresh(T t) {
        m22359b();
        Object b = m22358b((Object) t);
        Cursor rawQuery = this.f18185a.rawQuery(this.f18189e.m28436f(), new String[]{b.toString()});
        try {
            if (!rawQuery.moveToFirst()) {
                throw new dnw("Entity does not exist in the database anymore: " + t.getClass() + " with key " + b);
            } else if (rawQuery.isLast()) {
                readEntity(rawQuery, t, 0);
                m22355a(b, (Object) t, true);
            } else {
                throw new dnw("Expected unique result, but count was " + rawQuery.getCount());
            }
        } finally {
            rawQuery.close();
        }
    }

    public void update(T t) {
        m22359b();
        SQLiteStatement d = this.f18189e.m28434d();
        if (this.f18185a.isDbLockedByCurrentThread()) {
            synchronized (d) {
                m22354a((Object) t, d, true);
            }
            return;
        }
        this.f18185a.beginTransaction();
        try {
            synchronized (d) {
                m22354a((Object) t, d, true);
            }
            this.f18185a.setTransactionSuccessful();
        } finally {
            this.f18185a.endTransaction();
        }
    }

    public doq<T> queryBuilder() {
        return doq.m28469a(this);
    }

    /* renamed from: a */
    protected void m22354a(T t, SQLiteStatement sQLiteStatement, boolean z) {
        mo3755a(sQLiteStatement, (Object) t);
        int length = this.f18186b.f22391d.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key == null) {
            throw new dnw("Cannot update entity without key - was it inserted before?");
        } else {
            sQLiteStatement.bindString(length, key.toString());
        }
        sQLiteStatement.execute();
        m22355a(key, (Object) t, z);
    }

    /* renamed from: a */
    protected final void m22355a(K k, T t, boolean z) {
        mo3761a((Object) t);
        if (this.f18187c != null && k != null) {
            if (z) {
                this.f18187c.mo4495a(k, t);
            } else {
                this.f18187c.mo4498b(k, t);
            }
        }
    }

    /* renamed from: a */
    protected void mo3761a(T t) {
    }

    public void updateInTx(Iterable<T> iterable) {
        SQLiteStatement d = this.f18189e.m28434d();
        this.f18185a.beginTransaction();
        try {
            synchronized (d) {
                if (this.f18187c != null) {
                    this.f18187c.mo4497b();
                }
                try {
                    for (T a : iterable) {
                        m22354a((Object) a, d, false);
                    }
                    if (this.f18187c != null) {
                        this.f18187c.mo4499c();
                    }
                } catch (Throwable th) {
                    if (this.f18187c != null) {
                        this.f18187c.mo4499c();
                    }
                }
            }
            this.f18185a.setTransactionSuccessful();
        } catch (RuntimeException e) {
        } finally {
            try {
                this.f18185a.endTransaction();
            } catch (Throwable e2) {
                if (null != null) {
                    dnx.m28323a("Could not end transaction (rethrowing initial exception)", e2);
                    throw null;
                }
                throw e2;
            }
        }
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }

    /* renamed from: b */
    protected void m22359b() {
        if (this.f18186b.f22392e.length != 1) {
            throw new dnw(this + " (" + this.f18186b.f22389b + ") does not have a single-column primary key");
        }
    }

    public long count() {
        return DatabaseUtils.queryNumEntries(this.f18185a, '\'' + this.f18186b.f22389b + '\'');
    }

    /* renamed from: b */
    protected K m22358b(T t) {
        K key = getKey(t);
        if (key != null) {
            return key;
        }
        if (t == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new dnw("Entity has no key");
    }

    public SQLiteDatabase getDatabase() {
        return this.f18185a;
    }
}
