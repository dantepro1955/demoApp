package com.p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;

/* compiled from: NavUtils */
/* renamed from: dy */
public final class dy {
    /* renamed from: a */
    private static final C5231a f23454a;

    /* compiled from: NavUtils */
    /* renamed from: dy$a */
    interface C5231a {
        /* renamed from: a */
        Intent mo4671a(Activity activity);

        /* renamed from: a */
        String mo4672a(Context context, ActivityInfo activityInfo);

        /* renamed from: a */
        boolean mo4673a(Activity activity, Intent intent);

        /* renamed from: b */
        void mo4674b(Activity activity, Intent intent);
    }

    /* compiled from: NavUtils */
    /* renamed from: dy$b */
    static class C5232b implements C5231a {
        C5232b() {
        }

        /* renamed from: a */
        public Intent mo4671a(Activity activity) {
            String b = dy.m29801b(activity);
            if (b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b);
            try {
                if (dy.m29802b((Context) activity, componentName) == null) {
                    return fd.m30153a(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (NameNotFoundException e) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
                return null;
            }
        }

        /* renamed from: a */
        public boolean mo4673a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }

        /* renamed from: b */
        public void mo4674b(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }

        /* renamed from: a */
        public String mo4672a(Context context, ActivityInfo activityInfo) {
            if (activityInfo.metaData == null) {
                return null;
            }
            String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
            if (string == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
    }

    /* compiled from: NavUtils */
    /* renamed from: dy$c */
    static class C5233c extends C5232b {
        C5233c() {
        }

        /* renamed from: a */
        public Intent mo4671a(Activity activity) {
            Intent a = dz.m29905a(activity);
            if (a == null) {
                return m29796b(activity);
            }
            return a;
        }

        /* renamed from: b */
        Intent m29796b(Activity activity) {
            return super.mo4671a(activity);
        }

        /* renamed from: a */
        public boolean mo4673a(Activity activity, Intent intent) {
            return dz.m29907a(activity, intent);
        }

        /* renamed from: b */
        public void mo4674b(Activity activity, Intent intent) {
            dz.m29908b(activity, intent);
        }

        /* renamed from: a */
        public String mo4672a(Context context, ActivityInfo activityInfo) {
            String a = dz.m29906a(activityInfo);
            if (a == null) {
                return super.mo4672a(context, activityInfo);
            }
            return a;
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f23454a = new C5233c();
        } else {
            f23454a = new C5232b();
        }
    }

    /* renamed from: a */
    public static boolean m29800a(Activity activity, Intent intent) {
        return f23454a.mo4673a(activity, intent);
    }

    /* renamed from: b */
    public static void m29803b(Activity activity, Intent intent) {
        f23454a.mo4674b(activity, intent);
    }

    /* renamed from: a */
    public static Intent m29798a(Activity activity) {
        return f23454a.mo4671a(activity);
    }

    /* renamed from: a */
    public static Intent m29799a(Context context, ComponentName componentName) throws NameNotFoundException {
        String b = dy.m29802b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (dy.m29802b(context, componentName2) == null) {
            return fd.m30153a(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: b */
    public static String m29801b(Activity activity) {
        try {
            return dy.m29802b((Context) activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static String m29802b(Context context, ComponentName componentName) throws NameNotFoundException {
        return f23454a.mo4672a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }
}
