package com.p000;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;
import com.under9.android.lib.widget.mp4.Mp4PlayerView;
import com.under9.android.lib.widget.mp4.TextureMp4PlayerView;

/* compiled from: Mp4PlayerViewCompat */
/* renamed from: dlf */
public class dlf {
    /* renamed from: a */
    public static void m27820a(View view, boolean z) {
        boolean z2 = true;
        if (view instanceof Mp4PlayerView) {
            Mp4PlayerView mp4PlayerView = (Mp4PlayerView) view;
            if (z) {
                z2 = false;
            }
            mp4PlayerView.setAudioEnabled(z2);
        } else if (view instanceof TextureMp4PlayerView) {
            TextureMp4PlayerView textureMp4PlayerView = (TextureMp4PlayerView) view;
            if (z) {
                z2 = false;
            }
            textureMp4PlayerView.setAudioEnabled(z2);
        }
    }

    /* renamed from: a */
    public static boolean m27821a(View view) {
        if (view instanceof Mp4PlayerView) {
            return ((Mp4PlayerView) view).isPlaying();
        }
        if (!(view instanceof TextureMp4PlayerView)) {
            return false;
        }
        if (((TextureMp4PlayerView) view).m24039d()) {
            return ((TextureMp4PlayerView) view).m24047l();
        }
        return ((TextureMp4PlayerView) view).m24046k();
    }

    /* renamed from: b */
    public static boolean m27824b(View view) {
        if (view instanceof Mp4PlayerView) {
            return ((Mp4PlayerView) view).m23998c();
        }
        if (view instanceof TextureMp4PlayerView) {
            return ((TextureMp4PlayerView) view).m24040e();
        }
        return false;
    }

    /* renamed from: c */
    public static void m27825c(View view) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).mo4074a();
        } else if (!(view instanceof TextureMp4PlayerView)) {
        } else {
            if (((TextureMp4PlayerView) view).m24039d()) {
                ((TextureMp4PlayerView) view).m24044i();
            } else {
                ((TextureMp4PlayerView) view).mo4079b();
            }
        }
    }

    /* renamed from: d */
    public static void m27827d(View view) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).mo4075b();
        } else if (view instanceof TextureMp4PlayerView) {
            TextureMp4PlayerView textureMp4PlayerView = (TextureMp4PlayerView) view;
            if (textureMp4PlayerView.m24039d()) {
                textureMp4PlayerView.m24045j();
            } else {
                textureMp4PlayerView.mo4080c();
            }
        }
    }

    /* renamed from: b */
    public static void m27823b(View view, boolean z) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).setBoundedHeight(z);
        } else if (view instanceof TextureMp4PlayerView) {
            ((TextureMp4PlayerView) view).setBoundedHeight(z);
        }
    }

    /* renamed from: a */
    public static void m27817a(View view, int i, int i2, boolean z) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).setDimension(i, i2, z);
        } else if (view instanceof TextureMp4PlayerView) {
            ((TextureMp4PlayerView) view).setDimension(i, i2, z);
        }
    }

    /* renamed from: a */
    public static void m27819a(View view, String str) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).setVideoPath(str);
        } else if (view instanceof TextureMp4PlayerView) {
            ((TextureMp4PlayerView) view).setVideoPath(str);
        }
    }

    /* renamed from: a */
    public static void m27818a(View view, Runnable runnable) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).m24002a(runnable);
        } else if (view instanceof TextureMp4PlayerView) {
            ((TextureMp4PlayerView) view).m24053a(runnable);
        }
    }

    /* renamed from: b */
    public static void m27822b(View view, Runnable runnable) {
        if (view instanceof Mp4PlayerView) {
            ((Mp4PlayerView) view).m24002a(runnable);
        } else if (view instanceof TextureMp4PlayerView) {
            ((TextureMp4PlayerView) view).m24055b(runnable);
        }
    }

    @TargetApi(16)
    /* renamed from: c */
    public static void m27826c(View view, boolean z) {
        if (VERSION.SDK_INT >= 16 && (view instanceof TextureMp4PlayerView)) {
            ((TextureMp4PlayerView) view).setUseExoPlayer(z);
        }
    }
}
