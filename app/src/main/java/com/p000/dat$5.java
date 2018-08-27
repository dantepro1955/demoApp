package com.p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Patterns;
import com.facebook.internal.ServerProtocol;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import p000.dak.C4740c;
import p000.daw.C4757b;

/* compiled from: OneSignal */
/* renamed from: dat$5 */
class dat$5 implements Runnable {
    dat$5() {
    }

    public void run() {
        C4757b b = daw.m26153b();
        Object packageName = dat.f16711c.getPackageName();
        PackageManager packageManager = dat.f16711c.getPackageManager();
        b.m26140a("app_id", dat.f16709a);
        b.m26140a("identifier", dat.i());
        Object a = dat.j().mo4299a(dat.f16711c);
        if (a == null) {
            a = new dah().mo4299a(dat.f16711c);
        }
        b.m26140a("ad_id", a);
        b.m26140a("device_os", VERSION.RELEASE);
        b.m26140a("timezone", Integer.valueOf(dat.k()));
        b.m26140a("language", Locale.getDefault().getLanguage());
        b.m26140a(ServerProtocol.DIALOG_PARAM_SDK_VERSION, (Object) "020300");
        b.m26140a("sdk_type", dat.f16713e);
        b.m26140a("android_package", packageName);
        b.m26140a("device_model", Build.MODEL);
        b.m26140a("device_type", Integer.valueOf(dat.l()));
        b.m26141b("subscribableStatus", Integer.valueOf(dat.m()));
        try {
            b.m26140a("game_version", Integer.valueOf(packageManager.getPackageInfo(packageName, 0).versionCode));
        } catch (NameNotFoundException e) {
        }
        try {
            List installedPackages = packageManager.getInstalledPackages(0);
            Object jSONArray = new JSONArray();
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            int i = 0;
            while (i < installedPackages.size()) {
                if ((((PackageInfo) installedPackages.get(i)).applicationInfo.flags & 1) == 0 && !packageName.equals(((PackageInfo) installedPackages.get(i)).packageName)) {
                    instance.update(((PackageInfo) installedPackages.get(i)).packageName.getBytes());
                    jSONArray.put(Base64.encodeToString(instance.digest(), 2));
                }
                i++;
            }
            b.m26140a("pkgs", jSONArray);
        } catch (Throwable th) {
        }
        a = dat.f(dat.f16711c).getString("OS_USER_EMAIL", null);
        if (a != null) {
            b.m26140a(MMSDK$Event.INTENT_EMAIL, a);
        } else if (C4740c.m26044a(dat.f16711c, "android.permission.GET_ACCOUNTS") == 0) {
            for (Account account : AccountManager.get(dat.f16711c).getAccounts()) {
                if (Patterns.EMAIL_ADDRESS.matcher(account.name).matches()) {
                    b.m26140a(MMSDK$Event.INTENT_EMAIL, account.name);
                    break;
                }
            }
        }
        b.m26140a("net_type", dat.n().m26101b());
        b.m26140a("carrier", dat.n().m26102c());
        b.m26140a("rooted", Boolean.valueOf(dba.m26182a()));
        b.m26140a("lat", dat.o());
        b.m26140a("long", dat.p());
        b.m26140a("loc_acc", dat.q());
        b.m26140a("loc_type", dat.r());
        daw.m26147a(b);
    }
}
