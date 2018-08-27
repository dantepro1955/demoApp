package com.p000;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

/* compiled from: DialogStringResolver */
/* renamed from: abt */
class abt {
    /* renamed from: a */
    private final Context f288a;
    /* renamed from: b */
    private final PromptSettingsData f289b;

    public abt(Context context, PromptSettingsData promptSettingsData) {
        this.f288a = context;
        this.f289b = promptSettingsData;
    }

    /* renamed from: a */
    public String m362a() {
        return m359a("com.crashlytics.CrashSubmissionPromptTitle", this.f289b.f24221a);
    }

    /* renamed from: b */
    public String m363b() {
        return m359a("com.crashlytics.CrashSubmissionPromptMessage", this.f289b.f24222b);
    }

    /* renamed from: c */
    public String m364c() {
        return m359a("com.crashlytics.CrashSubmissionSendTitle", this.f289b.f24223c);
    }

    /* renamed from: d */
    public String m365d() {
        return m359a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f289b.f24227g);
    }

    /* renamed from: e */
    public String m366e() {
        return m359a("com.crashlytics.CrashSubmissionCancelTitle", this.f289b.f24225e);
    }

    /* renamed from: a */
    private String m359a(String str, String str2) {
        return m361b(CommonUtils.b(this.f288a, str), str2);
    }

    /* renamed from: b */
    private String m361b(String str, String str2) {
        return m360a(str) ? str2 : str;
    }

    /* renamed from: a */
    private boolean m360a(String str) {
        return str == null || str.length() == 0;
    }
}
