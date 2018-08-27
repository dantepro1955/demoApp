package com.p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;

/* renamed from: dnn */
public final class dnn implements qy {
    /* renamed from: a */
    private MediaPlayer f22327a;
    /* renamed from: b */
    private qw f22328b;
    /* renamed from: c */
    private Object f22329c;
    /* renamed from: d */
    private boolean f22330d;
    /* renamed from: e */
    private boolean f22331e;
    /* renamed from: f */
    private AssetFileDescriptor f22332f;

    /* renamed from: dnn$2 */
    class C50092 implements OnErrorListener {
        /* renamed from: a */
        private /* synthetic */ dnn f22325a;

        C50092(dnn dnn) {
            this.f22325a = dnn;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            czl.m25831c(this.f22325a, "Error during audio prompt: " + i);
            qu.m33922a(new Runnable(this.f22325a, true) {
                /* renamed from: b */
                private /* synthetic */ dnn f22324b;

                public final void run() {
                    if (this.f22324b.f22327a != null && !this.f22324b.f22331e) {
                        if (r2) {
                            this.f22324b.f22327a.release();
                            this.f22324b.f22327a = null;
                            this.f22324b.f22327a = this.f22324b.m28263d();
                            if (this.f22324b.f22327a == null) {
                                if (this.f22324b.f22328b != null) {
                                    this.f22324b.f22328b.mo4745a(this.f22324b.f22329c);
                                    this.f22324b.f22328b = null;
                                    this.f22324b.f22329c = null;
                                }
                                this.f22324b.mo4474b();
                                return;
                            }
                        }
                        if (this.f22324b.f22330d) {
                            this.f22324b.m28262c();
                            return;
                        }
                        if (this.f22324b.f22328b != null) {
                            if (r2) {
                                this.f22324b.f22328b.mo4745a(this.f22324b.f22329c);
                            } else {
                                this.f22324b.f22328b.mo4747c(this.f22324b.f22329c);
                            }
                        }
                        this.f22324b.f22328b = null;
                        this.f22324b.f22329c = null;
                    }
                }
            });
            return true;
        }
    }

    /* renamed from: dnn$3 */
    class C50103 implements OnCompletionListener {
        /* renamed from: a */
        private /* synthetic */ dnn f22326a;

        C50103(dnn dnn) {
            this.f22326a = dnn;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            czl.m25828a(this.f22326a, "Audio prompt completed");
            qu.m33922a(/* anonymous class already generated */);
        }
    }

    /* renamed from: a */
    public static rk m28258a(Class cls) {
        return new daa(cls);
    }

    /* renamed from: c */
    private void m28262c() {
        this.f22330d = false;
        this.f22327a.start();
        this.f22328b.mo4746b(this.f22329c);
    }

    /* renamed from: d */
    private MediaPlayer m28263d() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            long startOffset = this.f22332f.getStartOffset();
            long length = this.f22332f.getLength();
            if (length == -1) {
                czl.m25828a((Object) this, "Attempting to initialize MediaPlayer with asset file of unknown length");
                mediaPlayer.setDataSource(this.f22332f.getFileDescriptor());
            } else {
                mediaPlayer.setDataSource(this.f22332f.getFileDescriptor(), startOffset, length);
            }
            mediaPlayer.prepare();
            mediaPlayer.getDuration();
            mediaPlayer.setOnErrorListener(new C50092(this));
            mediaPlayer.setOnCompletionListener(new C50103(this));
            return mediaPlayer;
        } catch (Throwable e) {
            czl.m25829a(this, "Unable to create MediaPlayer for audio prompt", e);
            try {
                mediaPlayer.release();
            } catch (Exception e2) {
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo4472a() {
        if (this.f22327a != null) {
            this.f22330d = false;
            if (this.f22327a.isPlaying()) {
                try {
                    this.f22327a.stop();
                } catch (Throwable th) {
                    czl.m25829a(this, "Error stopping player", th);
                }
                this.f22327a.release();
                this.f22327a = null;
                this.f22327a = m28263d();
                if (this.f22327a == null) {
                    mo4474b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4473a(Object obj, qw qwVar, Object obj2) {
        if (this.f22327a == null || this.f22331e) {
            czl.m25831c(this, "Can't start disposed audio prompt");
            qwVar.mo4745a(obj2);
            return;
        }
        czl.m25828a((Object) this, "Starting audio prompt");
        this.f22328b = qwVar;
        this.f22329c = obj2;
        if (this.f22327a.isPlaying()) {
            czl.m25830b(this, "Audio prompt is already playing. Stopping to restart.");
            this.f22327a.stop();
            this.f22330d = true;
            return;
        }
        m28262c();
    }

    /* renamed from: b */
    public final void mo4474b() {
        this.f22331e = true;
        if (this.f22327a != null) {
            this.f22327a.release();
            this.f22327a = null;
        }
        if (this.f22332f != null) {
            try {
                this.f22332f.close();
            } catch (Throwable e) {
                czl.m25829a(this, "Error closing audio prompt file", e);
            }
            this.f22332f = null;
        }
        if (this.f22328b != null) {
            this.f22328b.mo4745a(this.f22329c);
            this.f22328b = null;
        }
        this.f22329c = null;
    }
}
