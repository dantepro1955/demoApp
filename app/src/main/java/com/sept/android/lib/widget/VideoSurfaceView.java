package com.sept.android.lib.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import java.io.IOException;

public class VideoSurfaceView extends SurfaceView implements Callback {
    /* renamed from: a */
    private MediaPlayer f19590a;
    /* renamed from: b */
    private Uri f19591b;
    /* renamed from: c */
    private boolean f19592c;
    /* renamed from: d */
    private Rect f19593d;

    public VideoSurfaceView(Context context) {
        super(context);
        m23939a();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23939a();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23939a();
    }

    public void setVideo(Uri uri) {
        this.f19591b = uri;
        if (this.f19592c) {
            m23940b();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f19592c = true;
        m23940b();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f19592c = false;
        this.f19590a.stop();
        this.f19590a.release();
    }

    /* renamed from: a */
    private void m23939a() {
        this.f19593d = new Rect();
        getHolder().addCallback(this);
    }

    /* renamed from: b */
    private void m23940b() {
        try {
            this.f19590a = new MediaPlayer();
            this.f19590a.setLooping(true);
            this.f19590a.setDataSource(getContext(), this.f19591b);
            this.f19590a.prepare();
            float videoHeight = ((float) this.f19590a.getVideoHeight()) / ((float) this.f19590a.getVideoWidth());
            ((Activity) getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f19593d);
            float width = (float) this.f19593d.width();
            float height = (float) this.f19593d.height();
            float f = height / width;
            LayoutParams layoutParams = getLayoutParams();
            if (f > videoHeight) {
                layoutParams.width = (int) (height / videoHeight);
                layoutParams.height = (int) height;
            } else {
                layoutParams.width = (int) width;
                layoutParams.height = (int) (width * videoHeight);
            }
            setLayoutParams(layoutParams);
            this.f19590a.setDisplay(getHolder());
            this.f19590a.start();
        } catch (IOException e) {
        }
    }
}
