package com.sept.android.lib.widget.mp4;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.util.AttributeSet;
import p000.dlg;
import p000.dlg.C4459a;
import p000.dlg.C4967b;

public class Mp4PlayerView extends VideoView implements OnErrorListener {
    /* renamed from: e */
    private dlg f19662e;
    /* renamed from: f */
    private C4967b f19663f;
    /* renamed from: g */
    private C4459a f19664g = new C44601(this);

    /* renamed from: com.sept.android.lib.widget.mp4.Mp4PlayerView$1 */
    class C44601 implements C4459a {
        /* renamed from: a */
        final /* synthetic */ Mp4PlayerView f19631a;

        C44601(Mp4PlayerView mp4PlayerView) {
            this.f19631a = mp4PlayerView;
        }

        /* renamed from: a */
        public int mo4070a() {
            return this.f19631a.getCurrentPosition();
        }

        /* renamed from: a */
        public void mo4071a(int i, int i2) {
            this.f19631a.setMeasuredDimension(i, i2);
        }

        /* renamed from: a */
        public void mo4073a(Runnable runnable) {
            this.f19631a.post(runnable);
        }

        /* renamed from: a */
        public void mo4072a(OnPreparedListener onPreparedListener) {
            this.f19631a.setOnPreparedListener(onPreparedListener);
        }
    }

    public Mp4PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24000d();
    }

    public Mp4PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24000d();
    }

    public Mp4PlayerView(Context context) {
        super(context);
        m24000d();
    }

    /* renamed from: d */
    private void m24000d() {
        this.f19662e = new dlg(this.f19664g);
        setOnErrorListener(this);
    }

    public void setDimension(int i, int i2, boolean z) {
        this.f19662e.m27831a(i, i2, z);
    }

    public void setBoundedHeight(boolean z) {
        this.f19662e.m27833a(z);
    }

    public void setOnMp4PlayerErrorListener(C4967b c4967b) {
        this.f19663f = c4967b;
    }

    public void start() {
        m24002a(null);
    }

    /* renamed from: a */
    public void m24002a(Runnable runnable) {
        super.start();
        this.f19662e.m27832a(runnable);
    }

    /* renamed from: a */
    public void mo4074a() {
        this.f19662e.m27830a();
        super.mo4074a();
    }

    /* renamed from: b */
    public void mo4075b() {
        this.f19662e.m27830a();
        super.mo4075b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4074a();
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19662e.m27834a(i, i2)) {
            super.onMeasure(i, i2);
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f19663f != null) {
            this.f19663f.m27828a(this, mediaPlayer, i, i2);
        }
        return false;
    }
}
