package com.p000;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;

/* compiled from: UpdatesController */
/* renamed from: abb */
interface abb {
    /* renamed from: a */
    void mo7a(Context context, aau aau, IdManager idManager, BetaSettingsData betaSettingsData, aav aav, PreferenceStore preferenceStore, CurrentTimeProvider currentTimeProvider, HttpRequestFactory httpRequestFactory);
}
