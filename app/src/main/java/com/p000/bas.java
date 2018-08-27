package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import java.util.concurrent.Callable;

@bhd
/* renamed from: bas */
public class bas {
    /* renamed from: a */
    private final Context f5285a;

    /* renamed from: bas$1 */
    class C09711 implements Callable<Boolean> {
        C09711() {
        }

        /* renamed from: a */
        public Boolean m7044a() {
            return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
        }

        public /* synthetic */ Object call() throws Exception {
            return m7044a();
        }
    }

    public bas(Context context) {
        aoi.m4680a((Object) context, (Object) "Context can not be null");
        this.f5285a = context;
    }

    /* renamed from: d */
    public static boolean m7045d() {
        return ((Boolean) bku.m9268a(new C09711())).booleanValue();
    }

    /* renamed from: a */
    public boolean m7046a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m7047a(intent);
    }

    /* renamed from: a */
    public boolean m7047a(Intent intent) {
        aoi.m4680a((Object) intent, (Object) "Intent can not be null");
        return !this.f5285a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: b */
    public boolean m7048b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m7047a(intent);
    }

    /* renamed from: c */
    public boolean m7049c() {
        return bas.m7045d() && ato.m5611b(this.f5285a).m5604a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: e */
    public boolean m7050e() {
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        int i = VERSION.SDK_INT;
        return m7047a(type);
    }
}
