package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.under9.android.lib.network.model.Constants;
import java.io.File;

/* renamed from: ati */
public class ati {
    /* renamed from: a */
    public static bgy m5601a(Context context) {
        return ati.m5602a(context, null);
    }

    /* renamed from: a */
    public static bgy m5602a(Context context, bpe bpe) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + Constants.SEP + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (NameNotFoundException e) {
        }
        if (bpe == null) {
            bpe = VERSION.SDK_INT >= 9 ? new are() : new bpc(AndroidHttpClient.newInstance(str));
        }
        bgy bgy = new bgy(new bpb(file), new boh(bpe));
        bgy.m8418a();
        return bgy;
    }
}
