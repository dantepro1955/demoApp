package com.p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: awh */
public class awh {
    /* renamed from: a */
    public static final Uri f4766a = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: b */
    public static final Uri f4767b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: c */
    public static final Pattern f4768c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    /* renamed from: d */
    public static final Pattern f4769d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* renamed from: e */
    static HashMap<String, String> f4770e;
    /* renamed from: f */
    static String[] f4771f = new String[0];
    /* renamed from: g */
    private static final AtomicBoolean f4772g = new AtomicBoolean();
    /* renamed from: h */
    private static Object f4773h;
    /* renamed from: i */
    private static boolean f4774i;

    /* renamed from: awh$1 */
    class C08601 extends ContentObserver {
        C08601(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            awh.f4772g.set(true);
        }
    }

    /* renamed from: a */
    public static long m6146a(ContentResolver contentResolver, String str, long j) {
        String a = awh.m6147a(contentResolver, str);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    @Deprecated
    /* renamed from: a */
    public static String m6147a(ContentResolver contentResolver, String str) {
        return awh.m6148a(contentResolver, str, null);
    }

    /* renamed from: a */
    public static String m6148a(ContentResolver contentResolver, String str, String str2) {
        synchronized (awh.class) {
            awh.m6151a(contentResolver);
            Object obj = f4773h;
            String str3;
            if (f4770e.containsKey(str)) {
                str3 = (String) f4770e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f4771f;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!f4774i || f4770e.isEmpty()) {
                            awh.m6155c(contentResolver, f4771f);
                            if (f4770e.containsKey(str)) {
                                str3 = (String) f4770e.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f4766a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(str2)) {
                                str3 = str2;
                            }
                            awh.m6152a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                awh.m6152a(obj, str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static Map<String, String> m6149a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f4767b, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    private static void m6151a(ContentResolver contentResolver) {
        if (f4770e == null) {
            f4772g.set(false);
            f4770e = new HashMap();
            f4773h = new Object();
            f4774i = false;
            contentResolver.registerContentObserver(f4766a, true, new C08601(null));
        } else if (f4772g.getAndSet(false)) {
            f4770e.clear();
            f4773h = new Object();
            f4774i = false;
        }
    }

    /* renamed from: a */
    private static void m6152a(Object obj, String str, String str2) {
        synchronized (awh.class) {
            if (obj == f4773h) {
                f4770e.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static String[] m6153a(String[] strArr) {
        HashSet hashSet = new HashSet((((f4771f.length + strArr.length) * 4) / 3) + 1);
        hashSet.addAll(Arrays.asList(f4771f));
        ArrayList arrayList = new ArrayList();
        for (Object obj : strArr) {
            if (hashSet.add(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new String[0];
        }
        f4771f = (String[]) hashSet.toArray(new String[hashSet.size()]);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public static void m6154b(ContentResolver contentResolver, String... strArr) {
        if (strArr.length != 0) {
            synchronized (awh.class) {
                awh.m6151a(contentResolver);
                String[] a = awh.m6153a(strArr);
                if (!f4774i || f4770e.isEmpty()) {
                    awh.m6155c(contentResolver, f4771f);
                } else if (a.length != 0) {
                    awh.m6155c(contentResolver, a);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m6155c(ContentResolver contentResolver, String[] strArr) {
        f4770e.putAll(awh.m6149a(contentResolver, strArr));
        f4774i = true;
    }
}
