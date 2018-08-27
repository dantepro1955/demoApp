package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

/* compiled from: AnswersPreferenceManager */
/* renamed from: aaa */
class aaa {
    /* renamed from: a */
    private final PreferenceStore f48a;

    /* renamed from: a */
    public static aaa m46a(Context context) {
        return new aaa(new PreferenceStoreImpl(context, "settings"));
    }

    aaa(PreferenceStore preferenceStore) {
        this.f48a = preferenceStore;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public void m47a() {
        this.f48a.a(this.f48a.b().putBoolean("analytics_launched", true));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public boolean m48b() {
        return this.f48a.a().getBoolean("analytics_launched", false);
    }
}
