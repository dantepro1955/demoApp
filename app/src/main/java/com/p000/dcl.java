package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.internal.NativeProtocol;

/* compiled from: ShortcutBadger */
/* renamed from: dcl */
public abstract class dcl {
    /* renamed from: a */
    protected Context f21146a;

    /* renamed from: a */
    protected abstract void mo4320a(int i) throws dck;

    protected dcl(Context context) {
        this.f21146a = context;
    }

    /* renamed from: a */
    public static void m26373a(Context context, int i) throws dck {
        if (i < 0 || i > 99) {
            throw new dck(String.format("ShortBadger is currently not support the badgeCount \"%d\"", new Object[]{Integer.valueOf(i)}));
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        String str = context.getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST).activityInfo.packageName;
        dcl dcl = null;
        if ("com.sonyericsson.home".equals(str)) {
            dcl = new dcm(context);
        } else if ("com.sec.android.app.launcher".equals(str)) {
            dcl = new dcp(context);
        } else if ("com.lge.launcher2".equals(str)) {
            dcl = new dco(context);
        } else if ("com.htc.launcher".equals(str)) {
            dcl = new dcq(context);
        } else if ("com.android.launcher".equals(str)) {
            dcl = new dcn(context);
        }
        if (dcl == null) {
            throw new dck(String.format("ShortcutBadger is currently not support the home launcher package \"%s\"", new Object[]{str}));
        } else {
            dcl.mo4320a(i);
        }
    }

    /* renamed from: a */
    protected String m26374a() {
        return this.f21146a.getPackageManager().getLaunchIntentForPackage(this.f21146a.getPackageName()).getComponent().getClassName();
    }

    /* renamed from: b */
    protected String m26376b() {
        return this.f21146a.getPackageName();
    }
}
