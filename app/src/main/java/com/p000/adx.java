package com.p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: AudioCapabilities */
/* renamed from: adx */
public final class adx {
    /* renamed from: a */
    private static final adx f669a = new adx(new int[]{2}, 2);
    /* renamed from: b */
    private final int[] f670b;
    /* renamed from: c */
    private final int f671c;

    /* renamed from: a */
    public static adx m862a(Context context) {
        return adx.m863a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static adx m863a(Intent intent) {
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f669a;
        }
        return new adx(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    adx(int[] iArr, int i) {
        if (iArr != null) {
            this.f670b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f670b);
        } else {
            this.f670b = new int[0];
        }
        this.f671c = i;
    }

    /* renamed from: a */
    public boolean m864a(int i) {
        return Arrays.binarySearch(this.f670b, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adx)) {
            return false;
        }
        adx adx = (adx) obj;
        if (Arrays.equals(this.f670b, adx.f670b) && this.f671c == adx.f671c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f671c + (Arrays.hashCode(this.f670b) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f671c + ", supportedEncodings=" + Arrays.toString(this.f670b) + "]";
    }
}
