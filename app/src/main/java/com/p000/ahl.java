package com.p000;

import android.widget.MediaController.MediaPlayerControl;

/* compiled from: PlayerControl */
/* renamed from: ahl */
public class ahl implements MediaPlayerControl {
    /* renamed from: a */
    private final adf f1496a;

    public ahl(adf adf) {
        this.f1496a = adf;
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        throw new UnsupportedOperationException();
    }

    public int getBufferPercentage() {
        return this.f1496a.mo73g();
    }

    public int getCurrentPosition() {
        return this.f1496a.mo71e() == -1 ? 0 : (int) this.f1496a.mo72f();
    }

    public int getDuration() {
        return this.f1496a.mo71e() == -1 ? 0 : (int) this.f1496a.mo71e();
    }

    public boolean isPlaying() {
        return this.f1496a.mo68b();
    }

    public void start() {
        this.f1496a.mo65a(true);
    }

    public void pause() {
        this.f1496a.mo65a(false);
    }

    public void seekTo(int i) {
        this.f1496a.mo62a(this.f1496a.mo71e() == -1 ? 0 : (long) Math.min(Math.max(0, i), getDuration()));
    }
}
