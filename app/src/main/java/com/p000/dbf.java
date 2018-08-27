package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeLauncher;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.SolidHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.XiaomiHomeBadger;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ShortcutBadger */
/* renamed from: dbf */
public final class dbf {
    /* renamed from: a */
    private static final String f21037a = dbf.class.getSimpleName();
    /* renamed from: b */
    private static final List<Class<? extends dbd>> f21038b = new LinkedList();
    /* renamed from: c */
    private static dbd f21039c;
    /* renamed from: d */
    private static ComponentName f21040d;

    static {
        f21038b.add(AdwHomeBadger.class);
        f21038b.add(ApexHomeBadger.class);
        f21038b.add(NewHtcHomeBadger.class);
        f21038b.add(NovaHomeBadger.class);
        f21038b.add(SolidHomeBadger.class);
        f21038b.add(SonyHomeBadger.class);
        f21038b.add(XiaomiHomeBadger.class);
        f21038b.add(AsusHomeLauncher.class);
    }

    /* renamed from: a */
    public static boolean m26211a(Context context, int i) {
        try {
            dbf.m26212b(context, i);
            return true;
        } catch (dbe e) {
            Log.e(f21037a, "Unable to execute badge:" + e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static void m26212b(Context context, int i) throws dbe {
        if (f21039c == null) {
            dbf.m26210a(context);
        }
        try {
            f21039c.mo3875a(context, f21040d, i);
        } catch (Throwable th) {
            dbe dbe = new dbe("Unable to execute badge:" + th.getMessage());
        }
    }

    /* renamed from: a */
    private static void m26210a(Context context) {
        f21040d = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent();
        Log.d(f21037a, "Finding badger");
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            String str = context.getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST).activityInfo.packageName;
            for (Class newInstance : f21038b) {
                dbd dbd = (dbd) newInstance.newInstance();
                if (dbd.mo3874a().contains(str)) {
                    f21039c = dbd;
                    break;
                }
            }
            if (f21039c == null && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                f21039c = new XiaomiHomeBadger();
                return;
            }
        } catch (Throwable e) {
            Log.e(f21037a, e.getMessage(), e);
        }
        if (f21039c == null) {
            f21039c = new DefaultBadger();
        }
        Log.d(f21037a, "Current badger:" + f21039c.getClass().getCanonicalName());
    }

    private dbf() {
    }
}
