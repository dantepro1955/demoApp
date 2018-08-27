package com.p000;

import android.graphics.Point;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: Mp4PlayerViewMixin */
/* renamed from: dlg */
public class dlg {
    /* renamed from: a */
    private Timer f21985a;
    /* renamed from: b */
    private Point f21986b;
    /* renamed from: c */
    private C4459a f21987c;
    /* renamed from: d */
    private boolean f21988d = false;
    /* renamed from: e */
    private boolean f21989e;
    /* renamed from: f */
    private boolean f21990f = false;

    /* compiled from: Mp4PlayerViewMixin */
    /* renamed from: dlg$a */
    public interface C4459a {
        /* renamed from: a */
        int mo4070a();

        /* renamed from: a */
        void mo4071a(int i, int i2);

        /* renamed from: a */
        void mo4072a(OnPreparedListener onPreparedListener);

        /* renamed from: a */
        void mo4073a(Runnable runnable);
    }

    /* compiled from: Mp4PlayerViewMixin */
    /* renamed from: dlg$1 */
    class C49651 implements OnPreparedListener {
        /* renamed from: a */
        final /* synthetic */ dlg f21981a;

        C49651(dlg dlg) {
            this.f21981a = dlg;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(true);
        }
    }

    /* compiled from: Mp4PlayerViewMixin */
    /* renamed from: dlg$b */
    public interface C4967b {
        /* renamed from: a */
        boolean m27828a(View view, MediaPlayer mediaPlayer, int i, int i2);
    }

    public dlg(C4459a c4459a) {
        this.f21987c = c4459a;
        this.f21987c.mo4072a(new C49651(this));
    }

    /* renamed from: a */
    public void m27831a(int i, int i2, boolean z) {
        if (this.f21986b == null) {
            this.f21986b = new Point();
        }
        this.f21988d = z;
        this.f21986b.set(i, i2);
    }

    /* renamed from: a */
    public void m27833a(boolean z) {
        this.f21989e = z;
    }

    /* renamed from: a */
    public void m27832a(final Runnable runnable) {
        if (this.f21985a == null) {
            this.f21985a = new Timer("mp4-onstart-timer");
            this.f21990f = false;
            if (runnable != null) {
                this.f21985a.scheduleAtFixedRate(new TimerTask(this) {
                    /* renamed from: a */
                    Runnable f21982a = runnable;
                    /* renamed from: c */
                    final /* synthetic */ dlg f21984c;

                    public void run() {
                        try {
                            if (this.f21984c.f21987c.mo4070a() > 0 && this.f21982a != null) {
                                this.f21984c.f21987c.mo4073a(this.f21982a);
                                this.f21982a = null;
                                cancel();
                            }
                        } catch (Exception e) {
                        }
                    }
                }, 0, 10);
            }
        }
    }

    /* renamed from: a */
    public void m27830a() {
        if (this.f21985a != null) {
            this.f21985a.cancel();
            this.f21985a = null;
        }
        this.f21990f = true;
    }

    /* renamed from: a */
    public boolean m27834a(int i, int i2) {
        if (this.f21986b == null) {
            return true;
        }
        if (this.f21988d) {
            this.f21987c.mo4071a(this.f21986b.x, this.f21986b.y);
            return false;
        } else if (MeasureSpec.getMode(i2) != 0) {
            return true;
        } else {
            float f = (((float) this.f21986b.y) * 1.0f) / ((float) this.f21986b.x);
            int size = MeasureSpec.getSize(i);
            int i3 = (int) (((float) size) * f);
            if (!this.f21989e || i3 <= size) {
                int i4 = i3;
                i3 = size;
                size = i4;
            } else {
                i3 = (int) (((float) size) / f);
            }
            this.f21987c.mo4071a(i3, size);
            return false;
        }
    }
}
