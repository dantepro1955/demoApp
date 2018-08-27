package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;
import p000.cz.C4663a;
import p000.da.C4667c;
import p000.da.C4721a;
import p000.es.C4665a;

/* compiled from: ActivityCompat */
/* renamed from: cy */
public class cy extends ew {

    /* compiled from: ActivityCompat */
    /* renamed from: cy$a */
    public interface C4662a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    /* renamed from: cy$b */
    static class C4664b extends C4663a {
        /* renamed from: a */
        private es f20660a;

        public C4664b(es esVar) {
            this.f20660a = esVar;
        }

        /* renamed from: a */
        public void mo4218a(List<String> list, List<View> list2, List<View> list3) {
            this.f20660a.m30083a((List) list, (List) list2, (List) list3);
        }

        /* renamed from: b */
        public void mo4220b(List<String> list, List<View> list2, List<View> list3) {
            this.f20660a.m30085b(list, list2, list3);
        }

        /* renamed from: a */
        public void mo4217a(List<View> list) {
            this.f20660a.m30081a((List) list);
        }

        /* renamed from: a */
        public void mo4219a(List<String> list, Map<String, View> map) {
            this.f20660a.m30084a((List) list, (Map) map);
        }

        /* renamed from: a */
        public Parcelable mo4215a(View view, Matrix matrix, RectF rectF) {
            return this.f20660a.m30079a(view, matrix, rectF);
        }

        /* renamed from: a */
        public View mo4216a(Context context, Parcelable parcelable) {
            return this.f20660a.m30080a(context, parcelable);
        }
    }

    /* compiled from: ActivityCompat */
    /* renamed from: cy$c */
    static class C4668c extends C4667c {
        /* renamed from: a */
        private es f20663a;

        public C4668c(es esVar) {
            this.f20663a = esVar;
        }

        /* renamed from: a */
        public void mo4218a(List<String> list, List<View> list2, List<View> list3) {
            this.f20663a.m30083a((List) list, (List) list2, (List) list3);
        }

        /* renamed from: b */
        public void mo4220b(List<String> list, List<View> list2, List<View> list3) {
            this.f20663a.m30085b(list, list2, list3);
        }

        /* renamed from: a */
        public void mo4217a(List<View> list) {
            this.f20663a.m30081a((List) list);
        }

        /* renamed from: a */
        public void mo4219a(List<String> list, Map<String, View> map) {
            this.f20663a.m30084a((List) list, (Map) map);
        }

        /* renamed from: a */
        public Parcelable mo4215a(View view, Matrix matrix, RectF rectF) {
            return this.f20663a.m30079a(view, matrix, rectF);
        }

        /* renamed from: a */
        public View mo4216a(Context context, Parcelable parcelable) {
            return this.f20663a.m30080a(context, parcelable);
        }

        /* renamed from: a */
        public void mo4222a(List<String> list, List<View> list2, final C4721a c4721a) {
            this.f20663a.m30082a((List) list, (List) list2, new C4665a(this) {
                /* renamed from: b */
                final /* synthetic */ C4668c f20662b;

                /* renamed from: a */
                public void mo4221a() {
                    c4721a.mo4271a();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m25604a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            dc.m26317a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m25605a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            dc.m26318a(activity, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m25603a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            dc.m26316a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m25610b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            cz.m25729a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m25606a(Activity activity, es esVar) {
        if (VERSION.SDK_INT >= 23) {
            da.m25937a(activity, cy.m25609b(esVar));
        } else if (VERSION.SDK_INT >= 21) {
            cz.m25730a(activity, cy.m25602a(esVar));
        }
    }

    /* renamed from: b */
    public static void m25611b(Activity activity, es esVar) {
        if (VERSION.SDK_INT >= 23) {
            da.m25940b(activity, cy.m25609b(esVar));
        } else if (VERSION.SDK_INT >= 21) {
            cz.m25732b(activity, cy.m25602a(esVar));
        }
    }

    /* renamed from: c */
    public static void m25612c(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            cz.m25731b(activity);
        }
    }

    /* renamed from: d */
    public static void m25613d(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            cz.m25733c(activity);
        }
    }

    /* renamed from: a */
    public static void m25607a(final Activity activity, final String[] strArr, final int i) {
        if (VERSION.SDK_INT >= 23) {
            da.m25938a(activity, strArr, i);
        } else if (activity instanceof C4662a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C4662a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m25608a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return da.m25939a(activity, str);
        }
        return false;
    }

    /* renamed from: a */
    private static C4663a m25602a(es esVar) {
        if (esVar != null) {
            return new C4664b(esVar);
        }
        return null;
    }

    /* renamed from: b */
    private static C4667c m25609b(es esVar) {
        if (esVar != null) {
            return new C4668c(esVar);
        }
        return null;
    }
}
