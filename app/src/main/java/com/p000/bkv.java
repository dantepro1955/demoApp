package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

@TargetApi(17)
@bhd
/* renamed from: bkv */
public class bkv {
    /* renamed from: b */
    private static bkv f6788b = null;
    /* renamed from: a */
    String f6789a;

    private bkv() {
    }

    /* renamed from: a */
    public static bkv m9270a() {
        if (f6788b == null) {
            f6788b = new bkv();
        }
        return f6788b;
    }

    /* renamed from: a */
    public void m9271a(final Context context) {
        if (TextUtils.isEmpty(this.f6789a)) {
            final Context remoteContext = aqo.getRemoteContext(context);
            this.f6789a = (String) bku.m9268a(new Callable<String>(this) {
                /* renamed from: a */
                public String m9269a() {
                    SharedPreferences sharedPreferences;
                    int i = 1;
                    if (remoteContext != null) {
                        bkc.m9012a("Attempting to read user agent from Google Play Services.");
                        sharedPreferences = remoteContext.getSharedPreferences("admob_user_agent", 1);
                        i = 0;
                    } else {
                        bkc.m9012a("Attempting to read user agent from local cache.");
                        sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                    }
                    String string = sharedPreferences.getString("user_agent", "");
                    if (TextUtils.isEmpty(string)) {
                        bkc.m9012a("Reading user agent from WebSettings");
                        string = WebSettings.getDefaultUserAgent(context);
                        if (i != 0) {
                            context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", string).apply();
                            bkc.m9012a("Persisting user agent.");
                        }
                    }
                    return string;
                }

                public /* synthetic */ Object call() throws Exception {
                    return m9269a();
                }
            });
        }
    }

    /* renamed from: b */
    public void m9272b(Context context) {
        bkc.m9012a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f6789a)) {
            if (aqo.getRemoteContext(context) == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.f6789a = defaultUserAgent;
        }
        bkc.m9012a("User agent is updated.");
    }

    /* renamed from: c */
    public String m9273c(Context context) {
        m9271a(context);
        return this.f6789a;
    }
}
