package com.p000;

import android.annotation.SuppressLint;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

@SuppressLint({"CommitPrefEdits"})
/* compiled from: PreferenceManager */
/* renamed from: acd */
class acd {
    /* renamed from: a */
    private final PreferenceStore f342a;

    /* renamed from: a */
    public static acd m446a(PreferenceStore preferenceStore, abk abk) {
        if (!preferenceStore.a().getBoolean("preferences_migration_complete", false)) {
            PreferenceStore preferenceStoreImpl = new PreferenceStoreImpl(abk);
            boolean z = !preferenceStore.a().contains("always_send_reports_opt_in") && preferenceStoreImpl.a().contains("always_send_reports_opt_in");
            if (z) {
                preferenceStore.a(preferenceStore.b().putBoolean("always_send_reports_opt_in", preferenceStoreImpl.a().getBoolean("always_send_reports_opt_in", false)));
            }
            preferenceStore.a(preferenceStore.b().putBoolean("preferences_migration_complete", true));
        }
        return new acd(preferenceStore);
    }

    public acd(PreferenceStore preferenceStore) {
        this.f342a = preferenceStore;
    }

    /* renamed from: a */
    void m447a(boolean z) {
        this.f342a.a(this.f342a.b().putBoolean("always_send_reports_opt_in", z));
    }

    /* renamed from: a */
    boolean m448a() {
        return this.f342a.a().getBoolean("always_send_reports_opt_in", false);
    }
}
