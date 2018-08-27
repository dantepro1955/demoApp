package com.p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p000.bqs.C1412c;
import p000.bqs.C1412c.C1414a;
import p000.bqs.C1416a;

/* renamed from: bsg */
class bsg implements C1412c {
    /* renamed from: a */
    private static final String f7518a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    /* renamed from: b */
    private final Executor f7519b;
    /* renamed from: c */
    private final Context f7520c;
    /* renamed from: d */
    private C1439a f7521d;
    /* renamed from: e */
    private apt f7522e;
    /* renamed from: f */
    private int f7523f;

    /* renamed from: bsg$a */
    class C1439a extends SQLiteOpenHelper {
        /* renamed from: a */
        final /* synthetic */ bsg f7515a;

        C1439a(bsg bsg, Context context, String str) {
            this.f7515a = bsg;
            super(context, str, null, 1);
        }

        /* renamed from: a */
        private void m10615a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove("ID") || !hashSet.remove("expires")) {
                    throw new SQLiteException("Database column missing");
                } else if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                }
            } finally {
                rawQuery.close();
            }
        }

        /* renamed from: a */
        private boolean m10616a(String str, SQLiteDatabase sQLiteDatabase) {
            Cursor cursor;
            String str2;
            String valueOf;
            Throwable th;
            Cursor cursor2 = null;
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    cursor = query;
                    try {
                        str2 = "Error querying for table ";
                        valueOf = String.valueOf(str);
                        brd.m10495b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        cursor2 = cursor;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                cursor = null;
                str2 = "Error querying for table ";
                valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                }
                brd.m10495b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.f7515a.f7520c.getDatabasePath("google_tagmanager.db").delete();
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            bqy.m10483a(sQLiteDatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (m10616a("datalayer", sQLiteDatabase)) {
                m10615a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(bsg.f7518a);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* renamed from: bsg$b */
    static class C1440b {
        /* renamed from: a */
        final String f7516a;
        /* renamed from: b */
        final byte[] f7517b;

        C1440b(String str, byte[] bArr) {
            this.f7516a = str;
            this.f7517b = bArr;
        }

        public String toString() {
            String str = this.f7516a;
            return new StringBuilder(String.valueOf(str).length() + 54).append("KeyAndSerialized: key = ").append(str).append(" serialized hash = ").append(Arrays.hashCode(this.f7517b)).toString();
        }
    }

    public bsg(Context context) {
        this(context, apv.m4885d(), "google_tagmanager.db", AdError.SERVER_ERROR_CODE, Executors.newSingleThreadExecutor());
    }

    bsg(Context context, apt apt, String str, int i, Executor executor) {
        this.f7520c = context;
        this.f7522e = apt;
        this.f7523f = i;
        this.f7519b = executor;
        this.f7521d = new C1439a(this, this.f7520c, str);
    }

    /* renamed from: a */
    private SQLiteDatabase m10617a(String str) {
        try {
            return this.f7521d.getWritableDatabase();
        } catch (SQLiteException e) {
            brd.m10495b(str);
            return null;
        }
    }

    /* renamed from: a */
    private Object m10618a(byte[] bArr) {
        Object readObject;
        Throwable th;
        ObjectInputStream objectInputStream = null;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2;
        try {
            objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
            try {
                readObject = objectInputStream2.readObject();
                try {
                    objectInputStream2.close();
                    byteArrayInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (ClassNotFoundException e8) {
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream2 = objectInputStream;
            th = th4;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return readObject;
    }

    /* renamed from: a */
    private List<C1416a> m10621a(List<C1440b> list) {
        List<C1416a> arrayList = new ArrayList();
        for (C1440b c1440b : list) {
            arrayList.add(new C1416a(c1440b.f7516a, m10618a(c1440b.f7517b)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m10622a(int i) {
        int d = (m10634d() - this.f7523f) + i;
        if (d > 0) {
            List b = m10629b(d);
            brd.m10497c("DataLayer store full, deleting " + b.size() + " entries to make room.");
            m10625a((String[]) b.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    private void m10623a(long j) {
        SQLiteDatabase a = m10617a("Error opening database for deleteOlderThan.");
        if (a != null) {
            try {
                brd.m10498d("Deleted " + a.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items");
            } catch (SQLiteException e) {
                brd.m10495b("Error deleting old entries.");
            }
        }
    }

    /* renamed from: a */
    private void m10625a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            SQLiteDatabase a = m10617a("Error opening database for deleteEntries.");
            if (a != null) {
                try {
                    a.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                } catch (SQLiteException e) {
                    String str = "Error deleting entries ";
                    String valueOf = String.valueOf(Arrays.toString(strArr));
                    brd.m10495b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
        }
    }

    /* renamed from: a */
    private byte[] m10626a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = bArr;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectOutputStream = bArr;
            th = th4;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    /* renamed from: b */
    private List<C1416a> m10628b() {
        try {
            m10623a(this.f7522e.mo606a());
            List<C1416a> a = m10621a(m10632c());
            return a;
        } finally {
            m10635e();
        }
    }

    /* renamed from: b */
    private List<String> m10629b(int i) {
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        List<String> arrayList = new ArrayList();
        if (i <= 0) {
            brd.m10495b("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase a = m10617a("Error opening database for peekEntryIds.");
        if (a == null) {
            return arrayList;
        }
        Cursor query;
        try {
            query = a.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    str = "Error in peekEntries fetching entryIds: ";
                    valueOf = String.valueOf(e.getMessage());
                    brd.m10495b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            str = "Error in peekEntries fetching entryIds: ";
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            brd.m10495b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<C1440b> m10630b(List<C1416a> list) {
        List<C1440b> arrayList = new ArrayList();
        for (C1416a c1416a : list) {
            arrayList.add(new C1440b(c1416a.f7397a, m10626a(c1416a.f7398b)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private synchronized void m10631b(List<C1440b> list, long j) {
        try {
            long a = this.f7522e.mo606a();
            m10623a(a);
            m10622a(list.size());
            m10633c(list, a + j);
            m10635e();
        } catch (Throwable th) {
            m10635e();
        }
    }

    /* renamed from: c */
    private List<C1440b> m10632c() {
        SQLiteDatabase a = m10617a("Error opening database for loadSerialized.");
        List<C1440b> arrayList = new ArrayList();
        if (a == null) {
            return arrayList;
        }
        Cursor query = a.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C1440b(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m10633c(List<C1440b> list, long j) {
        SQLiteDatabase a = m10617a("Error opening database for writeEntryToDatabase.");
        if (a != null) {
            for (C1440b c1440b : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", c1440b.f7516a);
                contentValues.put("value", c1440b.f7517b);
                a.insert("datalayer", null, contentValues);
            }
        }
    }

    /* renamed from: d */
    private int m10634d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase a = m10617a("Error opening database for getNumStoredEntries.");
        if (a != null) {
            try {
                cursor = a.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                brd.m10495b("Error getting numStoredEntries");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    private void m10635e() {
        try {
            this.f7521d.close();
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: a */
    public void mo1401a(final C1414a c1414a) {
        this.f7519b.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bsg f7514b;

            public void run() {
                c1414a.mo1403a(this.f7514b.m10628b());
            }
        });
    }

    /* renamed from: a */
    public void mo1402a(List<C1416a> list, final long j) {
        final List b = m10630b((List) list);
        this.f7519b.execute(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bsg f7512c;

            public void run() {
                this.f7512c.m10631b(b, j);
            }
        });
    }
}
