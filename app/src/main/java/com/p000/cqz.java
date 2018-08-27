package com.p000;

/* compiled from: TrackingUtil */
/* renamed from: cqz */
public class cqz {
    /* renamed from: a */
    public static String m24528a(cct cct) {
        boolean c = caf.a().x().c();
        if (cct.o()) {
            return c ? "overlay-image" : "overlay-image-nsfw-non-login";
        } else {
            if (cct.j()) {
                return c ? "play-gif-nsfw-safe-mode-on" : "play-gif-nsfw-non-login";
            } else {
                if (cct.m()) {
                    return c ? "play-video-nsfw-safe-mode-on" : "play-video-nsfw-non-login";
                } else {
                    return null;
                }
            }
        }
    }
}
