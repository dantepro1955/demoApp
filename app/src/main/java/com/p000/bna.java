package com.p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.stetho.common.Utf8Charset;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: bna */
class bna extends bmu implements Closeable {
    /* renamed from: a */
    private static final String f7067a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    /* renamed from: b */
    private static final String f7068b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    /* renamed from: c */
    private final C1348a f7069c;
    /* renamed from: d */
    private final bod f7070d = new bod(zznR());
    /* renamed from: e */
    private final bod f7071e = new bod(zznR());

    /* renamed from: bna$a */
    class C1348a extends SQLiteOpenHelper {
        /* renamed from: a */
        final /* synthetic */ bna f7066a;

        C1348a(bna bna, Context context, String str) {
            this.f7066a = bna;
            super(context, str, null, 1);
        }

        /* renamed from: a */
        private void m9839a(SQLiteDatabase sQLiteDatabase) {
            int i = 1;
            Set b = m9841b(sQLiteDatabase, "hits2");
            String[] strArr = new String[]{"hit_id", "hit_string", "hit_time", "hit_url"};
            int i2 = 0;
            while (i2 < 4) {
                Object obj = strArr[i2];
                if (b.remove(obj)) {
                    i2++;
                } else {
                    String str = "Database hits2 is missing required column: ";
                    String valueOf = String.valueOf(obj);
                    throw new SQLiteException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            if (b.remove("hit_app_id")) {
                i = 0;
            }
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (i != 0) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }

        /* renamed from: a */
        private boolean m9840a(SQLiteDatabase sQLiteDatabase, String str) {
            Object e;
            Throwable th;
            Cursor cursor = null;
            Cursor query;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        this.f7066a.zzc("Error querying for table", str, e);
                        if (query != null) {
                            query.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                this.f7066a.zzc("Error querying for table", str, e);
                if (query != null) {
                    query.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: b */
        private Set<String> m9841b(SQLiteDatabase sQLiteDatabase, String str) {
            Set<String> hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        /* renamed from: b */
        private void m9842b(SQLiteDatabase sQLiteDatabase) {
            int i = 0;
            Set b = m9841b(sQLiteDatabase, "properties");
            String[] strArr = new String[]{"app_uid", "cid", "tid", NativeProtocol.WEB_DIALOG_PARAMS, AdDatabaseHelper.COLUMN_AD_ID, "hits_count"};
            while (i < 6) {
                Object obj = strArr[i];
                if (b.remove(obj)) {
                    i++;
                } else {
                    String str = "Database properties is missing required column: ";
                    String valueOf = String.valueOf(obj);
                    throw new SQLiteException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            if (!b.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            if (this.f7066a.f7071e.m10113a(3600000)) {
                SQLiteDatabase writableDatabase;
                try {
                    writableDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.f7066a.f7071e.m10112a();
                    this.f7066a.zzbT("Opening the database failed, dropping the table and recreating it");
                    this.f7066a.getContext().getDatabasePath(this.f7066a.m9852k()).delete();
                    try {
                        writableDatabase = super.getWritableDatabase();
                        this.f7066a.f7071e.m10114b();
                    } catch (SQLiteException e2) {
                        this.f7066a.zze("Failed to open freshly created database", e2);
                        throw e2;
                    }
                }
                return writableDatabase;
            }
            throw new SQLiteException("Database open failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            bno.m9974a(sQLiteDatabase.getPath());
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
            if (m9840a(sQLiteDatabase, "hits2")) {
                m9839a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(bna.f7067a);
            }
            if (m9840a(sQLiteDatabase, "properties")) {
                m9842b(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    bna(bmw bmw) {
        super(bmw);
        this.f7069c = new C1348a(this, bmw.m9767b(), m9852k());
    }

    /* renamed from: a */
    private long m9843a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = m9871h().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private long m9844a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = m9871h().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private static String m9846a(Map<String, String> map) {
        aoi.m4679a((Object) map);
        Builder builder = new Builder();
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    /* renamed from: b */
    private String m9848b(bns bns) {
        return bns.m10013f() ? zznT().m9949n() : zznT().m9950o();
    }

    /* renamed from: c */
    private static String m9849c(bns bns) {
        aoi.m4679a((Object) bns);
        Builder builder = new Builder();
        for (Entry entry : bns.m10009b().entrySet()) {
            String str = (String) entry.getKey();
            if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str))) {
                builder.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    /* renamed from: j */
    private void m9851j() {
        int x = zznT().m9959x();
        long d = m9866d();
        if (d > ((long) (x - 1))) {
            List a = m9854a((d - ((long) x)) + 1);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(a.size()));
            m9860a(a);
        }
    }

    /* renamed from: k */
    private String m9852k() {
        return zznT().m9961z();
    }

    /* renamed from: a */
    public long m9853a(long j, String str, String str2) {
        aoi.m4681a(str);
        aoi.m4681a(str2);
        zzob();
        zzmR();
        return m9844a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    /* renamed from: a */
    public List<Long> m9854a(long j) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzmR();
        zzob();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase h = m9871h();
        List<Long> arrayList = new ArrayList();
        try {
            query = h.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzd("Error selecting hit ids", e);
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            zzd("Error selecting hit ids", e);
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    Map<String, String> m9855a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String str2 = "?";
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            return aqa.m4905a(new URI(str), Utf8Charset.NAME);
        } catch (URISyntaxException e) {
            zze("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: a */
    public void m9856a() {
        zzob();
        m9871h().beginTransaction();
    }

    /* renamed from: a */
    public void m9857a(long j, String str) {
        aoi.m4681a(str);
        zzob();
        zzmR();
        int delete = m9871h().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(j), str});
        if (delete > 0) {
            zza("Deleted property records", Integer.valueOf(delete));
        }
    }

    /* renamed from: a */
    public void m9858a(bmy bmy) {
        aoi.m4679a((Object) bmy);
        zzob();
        zzmR();
        SQLiteDatabase h = m9871h();
        String a = bna.m9846a(bmy.m9811f());
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_uid", Long.valueOf(bmy.m9805a()));
        contentValues.put("cid", bmy.m9807b());
        contentValues.put("tid", bmy.m9808c());
        contentValues.put(AdDatabaseHelper.COLUMN_AD_ID, Integer.valueOf(bmy.m9809d() ? 1 : 0));
        contentValues.put("hits_count", Long.valueOf(bmy.m9810e()));
        contentValues.put(NativeProtocol.WEB_DIALOG_PARAMS, a);
        try {
            if (h.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                zzbT("Failed to insert/update a property (got -1)");
            }
        } catch (SQLiteException e) {
            zze("Error storing a property", e);
        }
    }

    /* renamed from: a */
    public void m9859a(bns bns) {
        aoi.m4679a((Object) bns);
        zzmR();
        zzob();
        String c = bna.m9849c(bns);
        if (c.length() > Utility.DEFAULT_STREAM_BUFFER_SIZE) {
            zznS().m10041a(bns, "Hit length exceeds the maximum allowed size");
            return;
        }
        m9851j();
        SQLiteDatabase h = m9871h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", c);
        contentValues.put("hit_time", Long.valueOf(bns.m10011d()));
        contentValues.put("hit_app_id", Integer.valueOf(bns.m10008a()));
        contentValues.put("hit_url", m9848b(bns));
        try {
            long insert = h.insert("hits2", null, contentValues);
            if (insert == -1) {
                zzbT("Failed to insert a hit (got -1)");
            } else {
                zzb("Hit saved to database. db-id, hit", Long.valueOf(insert), bns);
            }
        } catch (SQLiteException e) {
            zze("Error storing a hit", e);
        }
    }

    /* renamed from: a */
    public void m9860a(List<Long> list) {
        aoi.m4679a((Object) list);
        zzmR();
        zzob();
        if (!list.isEmpty()) {
            int i;
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            for (i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(l);
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase h = m9871h();
                zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                i = h.delete("hits2", stringBuilder2, null);
                if (i != list.size()) {
                    zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i), stringBuilder2);
                }
            } catch (SQLiteException e) {
                zze("Error deleting hits", e);
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public List<p000.bns> m9861b(long r14) {
        /*
        r13 = this;
        r0 = 1;
        r1 = 0;
        r9 = 0;
        r2 = 0;
        r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x008f;
    L_0x0009:
        p000.aoi.m4688b(r0);
        r13.zzmR();
        r13.zzob();
        r0 = r13.m9871h();
        r1 = "hits2";
        r2 = 5;
        r2 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = "hit_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 1;
        r4 = "hit_time";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 2;
        r4 = "hit_string";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 3;
        r4 = "hit_url";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 4;
        r4 = "hit_app_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = "%s ASC";
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = 0;
        r11 = "hit_id";
        r8[r10] = r11;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r8 = java.lang.Long.toString(r14);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.<init>();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 == 0) goto L_0x0089;
    L_0x0059:
        r0 = 0;
        r6 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 1;
        r3 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 2;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = 3;
        r1 = r9.getString(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = 4;
        r8 = r9.getInt(r2);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = r13.m9855a(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r5 = p000.bof.m10143d(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = new bns;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = r13;
        r0.<init>(r1, r2, r3, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.add(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 != 0) goto L_0x0059;
    L_0x0089:
        if (r9 == 0) goto L_0x008e;
    L_0x008b:
        r9.close();
    L_0x008e:
        return r10;
    L_0x008f:
        r0 = r1;
        goto L_0x0009;
    L_0x0092:
        r0 = move-exception;
        r1 = r9;
    L_0x0094:
        r2 = "Error loading hits from the database";
        r13.zze(r2, r0);	 Catch:{ all -> 0x009a }
        throw r0;	 Catch:{ all -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        r9 = r1;
    L_0x009c:
        if (r9 == 0) goto L_0x00a1;
    L_0x009e:
        r9.close();
    L_0x00a1:
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        goto L_0x009c;
    L_0x00a4:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: bna.b(long):java.util.List<bns>");
    }

    /* renamed from: b */
    Map<String, String> m9862b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String str2 = "?";
            String valueOf = String.valueOf(str);
            return aqa.m4905a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), Utf8Charset.NAME);
        } catch (URISyntaxException e) {
            zze("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: b */
    public void m9863b() {
        zzob();
        m9871h().setTransactionSuccessful();
    }

    /* renamed from: c */
    public void m9864c() {
        zzob();
        m9871h().endTransaction();
    }

    /* renamed from: c */
    public void m9865c(long j) {
        zzmR();
        zzob();
        List arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        zza("Deleting hit, id", Long.valueOf(j));
        m9860a(arrayList);
    }

    public void close() {
        try {
            this.f7069c.close();
        } catch (SQLiteException e) {
            zze("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            zze("Error closing database", e2);
        }
    }

    /* renamed from: d */
    public long m9866d() {
        zzmR();
        zzob();
        return m9843a("SELECT COUNT(*) FROM hits2", null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public List<p000.bmy> m9867d(long r14) {
        /*
        r13 = this;
        r13.zzob();
        r13.zzmR();
        r0 = r13.m9871h();
        r9 = 0;
        r1 = 5;
        r2 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 0;
        r3 = "cid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 1;
        r3 = "tid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 2;
        r3 = "adid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 3;
        r3 = "hits_count";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 4;
        r3 = "params";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = r13.zznT();	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r10 = r1.m9960y();	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r8 = java.lang.String.valueOf(r10);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r3 = "app_uid=?";
        r1 = 1;
        r4 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 0;
        r5 = java.lang.String.valueOf(r14);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r4[r1] = r5;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = "properties";
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r11 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r11.<init>();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x008b;
    L_0x0053:
        r0 = 0;
        r3 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 1;
        r4 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 2;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x009c;
    L_0x0064:
        r5 = 1;
    L_0x0065:
        r0 = 3;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r6 = (long) r0;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 4;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r8 = r13.m9862b(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 != 0) goto L_0x0080;
    L_0x007a:
        r0 = android.text.TextUtils.isEmpty(r4);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x009e;
    L_0x0080:
        r0 = "Read property with empty client id or tracker id";
        r13.zzc(r0, r3, r4);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
    L_0x0085:
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 != 0) goto L_0x0053;
    L_0x008b:
        r0 = r11.size();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 < r10) goto L_0x0096;
    L_0x0091:
        r0 = "Sending hits to too many properties. Campaign report might be incorrect";
        r13.zzbS(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
    L_0x0096:
        if (r9 == 0) goto L_0x009b;
    L_0x0098:
        r9.close();
    L_0x009b:
        return r11;
    L_0x009c:
        r5 = 0;
        goto L_0x0065;
    L_0x009e:
        r0 = new bmy;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r1 = r14;
        r0.<init>(r1, r3, r4, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r11.add(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        goto L_0x0085;
    L_0x00a8:
        r0 = move-exception;
        r1 = r9;
    L_0x00aa:
        r2 = "Error loading hits from the database";
        r13.zze(r2, r0);	 Catch:{ all -> 0x00b0 }
        throw r0;	 Catch:{ all -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        r9 = r1;
    L_0x00b2:
        if (r9 == 0) goto L_0x00b7;
    L_0x00b4:
        r9.close();
    L_0x00b7:
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        goto L_0x00b2;
    L_0x00ba:
        r0 = move-exception;
        r1 = r9;
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: bna.d(long):java.util.List<bmy>");
    }

    /* renamed from: e */
    boolean m9868e() {
        return m9866d() == 0;
    }

    /* renamed from: f */
    public int m9869f() {
        zzmR();
        zzob();
        if (!this.f7070d.m10113a(86400000)) {
            return 0;
        }
        this.f7070d.m10112a();
        zzbP("Deleting stale hits (if any)");
        int delete = m9871h().delete("hits2", "hit_time < ?", new String[]{Long.toString(zznR().mo606a() - 2592000000L)});
        zza("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: g */
    public long m9870g() {
        zzmR();
        zzob();
        return m9844a(f7068b, null, 0);
    }

    /* renamed from: h */
    SQLiteDatabase m9871h() {
        try {
            return this.f7069c.getWritableDatabase();
        } catch (SQLiteException e) {
            zzd("Error opening database", e);
            throw e;
        }
    }

    protected void zzmS() {
    }
}
