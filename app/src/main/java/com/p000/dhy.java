package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.under9.android.lib.network.model.Constants;

/* compiled from: IntentActionItem */
/* renamed from: dhy */
public class dhy extends dhx {
    /* renamed from: a */
    public Intent f21678a;
    /* renamed from: b */
    public ActivityInfo f21679b;
    /* renamed from: c */
    public dib f21680c;

    /* renamed from: a */
    public static dhy m27348a(PackageManager packageManager, Intent intent, ResolveInfo resolveInfo, dib dib) {
        ComponentName componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        dhy dhy = new dhy();
        dhy.f21678a = intent2;
        dhy.f21679b = resolveInfo.activityInfo;
        dhy.f21680c = dib;
        return dhy;
    }

    /* renamed from: a */
    public void mo4415a(Context context) {
        context.startActivity(this.f21678a);
    }

    /* renamed from: a */
    public String mo4414a() {
        if (this.f21678a == null) {
            return "";
        }
        if (this.f21678a.getComponent() == null) {
            return "";
        }
        return this.f21679b.packageName + Constants.SEP + this.f21679b.name;
    }

    /* renamed from: b */
    public void mo4416b(Context context) {
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            dia dia = null;
            String a = mo4414a();
            if (this.f21680c != null) {
                dia = (dia) this.f21680c.get(a);
            }
            if (dia == null) {
                dia = new dia(this.f21679b.loadLabel(packageManager), this.f21679b.loadIcon(packageManager));
            }
            m27344a(dia.f21681a);
            m27343a(dia.f21682b);
            if (this.f21680c != null) {
                this.f21680c.put(a, dia);
            }
        }
    }
}
