package com.p000;

/* compiled from: VideoTrackingEvent */
/* renamed from: bzl */
public enum bzl {
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    COMPANION_AD_VIEW("companionAdView"),
    COMPANION_AD_CLICK("companionAdClick"),
    UNKNOWN("");
    
    /* renamed from: a */
    private final String f8298a;

    private bzl(String str) {
        this.f8298a = str;
    }

    public String getName() {
        return this.f8298a;
    }

    public static bzl fromString(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (bzl bzl : bzl.values()) {
            if (str.equals(bzl.getName())) {
                return bzl;
            }
        }
        return UNKNOWN;
    }
}
