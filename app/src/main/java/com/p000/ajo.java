package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@bhd
/* renamed from: ajo */
public class ajo {
    /* renamed from: a */
    private static final String f1711a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});
    /* renamed from: c */
    private static final Object f1712c = new Object();
    /* renamed from: d */
    private static ajo f1713d;
    /* renamed from: b */
    private final C0213a f1714b;

    /* renamed from: ajo$a */
    public class C0213a extends SQLiteOpenHelper {
        public C0213a(ajo ajo, Context context, String str) {
            super(context, str, null, 4);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(ajo.f1711a);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            bky.m9010d("Database updated from version " + i + " to version " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sQLiteDatabase);
        }
    }

    ajo(Context context) {
        this.f1714b = new C0213a(this, context, "google_inapp_purchase.db");
    }

    /* renamed from: a */
    public static ajo m1896a(Context context) {
        ajo ajo;
        synchronized (f1712c) {
            if (f1713d == null) {
                f1713d = new ajo(context);
            }
            ajo = f1713d;
        }
        return ajo;
    }

    /* renamed from: a */
    public ajm m1898a(Cursor cursor) {
        return cursor == null ? null : new ajm(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    /* renamed from: a */
    public SQLiteDatabase m1899a() {
        try {
            return this.f1714b.getWritableDatabase();
        } catch (SQLiteException e) {
            bky.m9011e("Error opening writable conversion tracking database");
            return null;
        }
    }

    /* renamed from: a */
    public List<ajm> m1900a(long j) {
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        synchronized (f1712c) {
            List<ajm> linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase a = m1899a();
            if (a == null) {
                return linkedList;
            }
            Cursor query;
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                try {
                    if (query.moveToFirst()) {
                        do {
                            linkedList.add(m1898a(query));
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        str = "Error extracing purchase info: ";
                        valueOf = String.valueOf(e.getMessage());
                        bky.m9011e(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                        if (query != null) {
                            query.close();
                        }
                        return linkedList;
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
                str = "Error extracing purchase info: ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                bky.m9011e(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                if (query != null) {
                    query.close();
                }
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m1901a(ajm ajm) {
        if (ajm != null) {
            synchronized (f1712c) {
                SQLiteDatabase a = m1899a();
                if (a == null) {
                    return;
                }
                a.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[]{"purchase_id", Long.valueOf(ajm.f1701a)}), null);
            }
        }
    }

    /* renamed from: b */
    public int m1902b() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f1712c) {
            SQLiteDatabase a = m1899a();
            if (a == null) {
            } else {
                try {
                    cursor = a.rawQuery("select count(*) from InAppPurchase", null);
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    String str = "Error getting record count";
                    String valueOf = String.valueOf(e.getMessage());
                    bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m1903b(p000.ajm r7) {
        /*
        r6 = this;
        if (r7 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = f1712c;
        monitor-enter(r1);
        r0 = r6.m1899a();	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0002;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r2 = new android.content.ContentValues;	 Catch:{ all -> 0x000e }
        r2.<init>();	 Catch:{ all -> 0x000e }
        r3 = "product_id";
        r4 = r7.f1703c;	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "developer_payload";
        r4 = r7.f1702b;	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "record_time";
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x000e }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "InAppPurchase";
        r4 = 0;
        r2 = r0.insert(r3, r4, r2);	 Catch:{ all -> 0x000e }
        r7.f1701a = r2;	 Catch:{ all -> 0x000e }
        r0 = r6.m1902b();	 Catch:{ all -> 0x000e }
        r2 = (long) r0;	 Catch:{ all -> 0x000e }
        r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0048;
    L_0x0045:
        r6.m1904c();	 Catch:{ all -> 0x000e }
    L_0x0048:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajo.b(ajm):void");
    }

    /* renamed from: c */
    public void m1904c() {
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        synchronized (f1712c) {
            SQLiteDatabase a = m1899a();
            if (a == null) {
                return;
            }
            Cursor query;
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            m1901a(m1898a(query));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            str = "Error remove oldest record";
                            valueOf = String.valueOf(e.getMessage());
                            bky.m9011e(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                            if (query != null) {
                                query.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                str = "Error remove oldest record";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                bky.m9011e(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }
}
