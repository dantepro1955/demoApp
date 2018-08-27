package com.p000;

/* compiled from: MoatAdEventType */
/* renamed from: bxz */
public enum bxz {
    AD_EVT_FIRST_QUARTILE("AdVideoFirstQuartile"),
    AD_EVT_MID_POINT("AdVideoMidpoint"),
    AD_EVT_THIRD_QUARTILE("AdVideoThirdQuartile"),
    AD_EVT_COMPLETE("AdVideoComplete"),
    AD_EVT_PAUSED("AdPaused"),
    AD_EVT_PLAYING("AdPlaying"),
    AD_EVT_START("AdVideoStart"),
    AD_EVT_STOPPED("AdStopped"),
    AD_EVT_SKIPPED("AdSkipped"),
    AD_EVT_VOLUME_CHANGE("AdVolumeChange"),
    AD_EVT_ENTER_FULLSCREEN("fullScreen"),
    AD_EVT_EXIT_FULLSCREEN("exitFullscreen");
    
    /* renamed from: m */
    private final String f8160m;

    private bxz(String str) {
        this.f8160m = str;
    }

    public String toString() {
        return this.f8160m;
    }

    /* renamed from: a */
    public static bxz m11714a(String str) {
        if (str != null) {
            for (bxz bxz : bxz.values()) {
                if (str.equalsIgnoreCase(bxz.toString())) {
                    return bxz;
                }
            }
        }
        return null;
    }
}
