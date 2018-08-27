package com.p000;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher */
/* renamed from: ms */
class ms {
    /* renamed from: a */
    private static Field f24603a;
    /* renamed from: b */
    private static boolean f24604b;
    /* renamed from: c */
    private static Class f24605c;
    /* renamed from: d */
    private static boolean f24606d;
    /* renamed from: e */
    private static Field f24607e;
    /* renamed from: f */
    private static boolean f24608f;
    /* renamed from: g */
    private static Field f24609g;
    /* renamed from: h */
    private static boolean f24610h;

    /* renamed from: a */
    static boolean m32811a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ms.m32815d(resources);
        }
        if (i >= 23) {
            return ms.m32814c(resources);
        }
        if (i >= 21) {
            return ms.m32813b(resources);
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m32813b(Resources resources) {
        if (!f24604b) {
            try {
                f24603a = Resources.class.getDeclaredField("mDrawableCache");
                f24603a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f24604b = true;
        }
        if (f24603a != null) {
            Map map;
            try {
                map = (Map) f24603a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m32814c(Resources resources) {
        Object obj;
        boolean z = true;
        if (!f24604b) {
            try {
                f24603a = Resources.class.getDeclaredField("mDrawableCache");
                f24603a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f24604b = true;
        }
        if (f24603a != null) {
            try {
                obj = f24603a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (obj == null) {
                return false;
            }
            if (obj == null || !ms.m32812a(obj)) {
                z = false;
            }
            return z;
        }
        obj = null;
        if (obj == null) {
            return false;
        }
        z = false;
        return z;
    }

    /* renamed from: d */
    private static boolean m32815d(Resources resources) {
        boolean z = true;
        if (!f24610h) {
            try {
                f24609g = Resources.class.getDeclaredField("mResourcesImpl");
                f24609g.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f24610h = true;
        }
        if (f24609g == null) {
            return false;
        }
        Object obj;
        try {
            obj = f24609g.get(resources);
        } catch (Throwable e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        Object obj2;
        if (!f24604b) {
            try {
                f24603a = obj.getClass().getDeclaredField("mDrawableCache");
                f24603a.setAccessible(true);
            } catch (Throwable e22) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e22);
            }
            f24604b = true;
        }
        if (f24603a != null) {
            try {
                obj2 = f24603a.get(obj);
            } catch (Throwable e222) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e222);
            }
            if (obj2 == null || !ms.m32812a(obj2)) {
                z = false;
            }
            return z;
        }
        obj2 = null;
        z = false;
        return z;
    }

    /* renamed from: a */
    private static boolean m32812a(Object obj) {
        if (!f24606d) {
            try {
                f24605c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f24606d = true;
        }
        if (f24605c == null) {
            return false;
        }
        if (!f24608f) {
            try {
                f24607e = f24605c.getDeclaredField("mUnthemedEntries");
                f24607e.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f24608f = true;
        }
        if (f24607e == null) {
            return false;
        }
        LongSparseArray longSparseArray;
        try {
            longSparseArray = (LongSparseArray) f24607e.get(obj);
        } catch (Throwable e22) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e22);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }
}
