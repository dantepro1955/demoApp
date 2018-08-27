package com.p000;

import android.media.MediaRecorder.AudioSource;

/* renamed from: dqb */
public final class dqb {
    /* renamed from: a */
    public static final int f22566a;

    static {
        dqf dqf = new dqf();
        Integer num = (Integer) dqf.m28717a(AudioSource.class, "VOICE_RECOGNITION");
        if (num == null) {
            num = Integer.valueOf(0);
        }
        f22566a = num.intValue();
    }
}
