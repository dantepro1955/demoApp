package com.sept.android.lib.widget.mp4;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.util.AttributeSet;
import p000.dlg;
import p000.dlg.C4459a;
import p000.dlg.C4967b;

@TargetApi(14)
public class TextureMp4PlayerView extends TextureVideoView implements OnErrorListener {
    /* renamed from: b */
    private dlg f19691b;
    /* renamed from: c */
    private C4967b f19692c;
    /* renamed from: d */
    private C4459a f19693d = new C44611(this);

    /* renamed from: com.sept.android.lib.widget.mp4.TextureMp4PlayerView$1 */
    class C44611 implements C4459a {
        /* renamed from: a */
        final /* synthetic */ TextureMp4PlayerView f19665a;

        C44611(TextureMp4PlayerView textureMp4PlayerView) {
            this.f19665a = textureMp4PlayerView;
        }

        /* renamed from: a */
        public int mo4070a() {
            return this.f19665a.getCurrentPosition();
        }

        /* renamed from: a */
        public void mo4071a(int i, int i2) {
            this.f19665a.setMeasuredDimension(i, i2);
        }

        /* renamed from: a */
        public void mo4073a(Runnable runnable) {
            this.f19665a.post(runnable);
        }

        /* renamed from: a */
        public void mo4072a(OnPreparedListener onPreparedListener) {
            this.f19665a.setOnPreparedListener(onPreparedListener);
        }
    }

    public TextureMp4PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24051o();
    }

    public TextureMp4PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24051o();
    }

    public TextureMp4PlayerView(Context context) {
        super(context);
        m24051o();
    }

    /* renamed from: o */
    private void m24051o() {
        this.f19691b = new dlg(this.f19693d);
        setOnErrorListener(this);
    }

    public void setDimension(int i, int i2, boolean z) {
        this.f19691b.m27831a(i, i2, z);
    }

    public void setBoundedHeight(boolean z) {
        this.f19691b.m27833a(z);
    }

    public void setOnMp4PlayerErrorListener(C4967b c4967b) {
        this.f19692c = c4967b;
    }

    /* renamed from: a */
    public void mo4078a() {
        m24053a(null);
    }

    /* renamed from: a */
    public void m24053a(Runnable runnable) {
        if (m24039d()) {
            super.m24048m();
            postDelayed(runnable, 200);
            return;
        }
        super.mo4078a();
        this.f19691b.m27832a(runnable);
    }

    /* renamed from: b */
    public void m24055b(Runnable runnable) {
        if (m24039d()) {
            super.m24049n();
            postDelayed(runnable, 200);
            return;
        }
        super.mo4078a();
        this.f19691b.m27832a(runnable);
    }

    /* renamed from: b */
    public void mo4079b() {
        if (m24039d()) {
            super.m24044i();
            return;
        }
        this.f19691b.m27830a();
        super.mo4079b();
    }

    /* renamed from: c */
    public void mo4080c() {
        if (m24039d()) {
            super.m24045j();
            return;
        }
        this.f19691b.m27830a();
        super.mo4080c();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4079b();
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19691b.m27834a(i, i2)) {
            super.onMeasure(i, i2);
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f19692c != null) {
            this.f19692c.m27828a(this, mediaPlayer, i, i2);
        }
        return false;
    }
}
