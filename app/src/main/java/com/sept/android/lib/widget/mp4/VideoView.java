package com.sept.android.lib.widget.mp4;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import java.io.IOException;
import java.util.Map;

public class VideoView extends SurfaceView implements MediaPlayerControl {
    /* renamed from: A */
    private boolean f19632A;
    /* renamed from: B */
    private OnCompletionListener f19633B;
    /* renamed from: C */
    private OnErrorListener f19634C;
    /* renamed from: D */
    private OnBufferingUpdateListener f19635D;
    /* renamed from: a */
    OnInfoListener f19636a;
    /* renamed from: b */
    OnVideoSizeChangedListener f19637b;
    /* renamed from: c */
    OnPreparedListener f19638c;
    /* renamed from: d */
    Callback f19639d;
    /* renamed from: e */
    private String f19640e;
    /* renamed from: f */
    private Uri f19641f;
    /* renamed from: g */
    private Map<String, String> f19642g;
    /* renamed from: h */
    private int f19643h;
    /* renamed from: i */
    private int f19644i;
    /* renamed from: j */
    private int f19645j;
    /* renamed from: k */
    private Context f19646k;
    /* renamed from: l */
    private SurfaceHolder f19647l;
    /* renamed from: m */
    private MediaPlayer f19648m;
    /* renamed from: n */
    private int f19649n;
    /* renamed from: o */
    private int f19650o;
    /* renamed from: p */
    private int f19651p;
    /* renamed from: q */
    private int f19652q;
    /* renamed from: r */
    private MediaController f19653r;
    /* renamed from: s */
    private OnCompletionListener f19654s;
    /* renamed from: t */
    private OnPreparedListener f19655t;
    /* renamed from: u */
    private int f19656u;
    /* renamed from: v */
    private OnErrorListener f19657v;
    /* renamed from: w */
    private int f19658w;
    /* renamed from: x */
    private boolean f19659x;
    /* renamed from: y */
    private boolean f19660y;
    /* renamed from: z */
    private boolean f19661z;

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$1 */
    class C44731 implements OnInfoListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19703a;

        C44731(VideoView videoView) {
            this.f19703a = videoView;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            switch (i) {
                case 701:
                    this.f19703a.f19632A = true;
                    break;
                case 702:
                    this.f19703a.f19632A = false;
                    break;
                default:
                    this.f19703a.f19632A = false;
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$2 */
    class C44742 implements OnVideoSizeChangedListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19704a;

        C44742(VideoView videoView) {
            this.f19704a = videoView;
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f19704a.f19649n = mediaPlayer.getVideoWidth();
            this.f19704a.f19650o = mediaPlayer.getVideoHeight();
            if (this.f19704a.f19649n != 0 && this.f19704a.f19650o != 0) {
                this.f19704a.getHolder().setFixedSize(this.f19704a.f19649n, this.f19704a.f19650o);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$3 */
    class C44753 implements OnPreparedListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19705a;

        C44753(VideoView videoView) {
            this.f19705a = videoView;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f19705a.f19644i = 2;
            this.f19705a.f19659x = this.f19705a.f19660y = this.f19705a.f19661z = true;
            if (this.f19705a.f19655t != null) {
                this.f19705a.f19655t.onPrepared(this.f19705a.f19648m);
            }
            if (this.f19705a.f19653r != null) {
                this.f19705a.f19653r.setEnabled(true);
            }
            this.f19705a.setBackgroundColor(0);
            this.f19705a.f19649n = mediaPlayer.getVideoWidth();
            this.f19705a.f19650o = mediaPlayer.getVideoHeight();
            int f = this.f19705a.f19658w;
            if (f != 0) {
                this.f19705a.seekTo(f);
            }
            if (this.f19705a.f19649n != 0 && this.f19705a.f19650o != 0) {
                this.f19705a.getHolder().setFixedSize(this.f19705a.f19649n, this.f19705a.f19650o);
                if (this.f19705a.f19651p != this.f19705a.f19649n || this.f19705a.f19652q != this.f19705a.f19650o) {
                    return;
                }
                if (this.f19705a.f19645j == 3) {
                    this.f19705a.start();
                    if (this.f19705a.f19653r != null) {
                        this.f19705a.f19653r.show();
                    }
                } else if (!this.f19705a.isPlaying()) {
                    if ((f != 0 || this.f19705a.getCurrentPosition() > 0) && this.f19705a.f19653r != null) {
                        this.f19705a.f19653r.show(0);
                    }
                }
            } else if (this.f19705a.f19645j == 3) {
                this.f19705a.start();
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$4 */
    class C44764 implements OnCompletionListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19706a;

        C44764(VideoView videoView) {
            this.f19706a = videoView;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f19706a.f19644i = 5;
            this.f19706a.f19645j = 5;
            if (this.f19706a.f19653r != null) {
                this.f19706a.f19653r.hide();
            }
            if (this.f19706a.f19654s != null) {
                this.f19706a.f19654s.onCompletion(this.f19706a.f19648m);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$5 */
    class C44775 implements OnErrorListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19707a;

        C44775(VideoView videoView) {
            this.f19707a = videoView;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            this.f19707a.f19644i = -1;
            this.f19707a.f19645j = -1;
            if (this.f19707a.f19653r != null) {
                this.f19707a.f19653r.hide();
            }
            return (this.f19707a.f19657v == null || this.f19707a.f19657v.onError(this.f19707a.f19648m, i, i2)) ? true : true;
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$6 */
    class C44786 implements OnBufferingUpdateListener {
        /* renamed from: a */
        final /* synthetic */ VideoView f19708a;

        C44786(VideoView videoView) {
            this.f19708a = videoView;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            this.f19708a.f19656u = i;
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.VideoView$7 */
    class C44797 implements Callback {
        /* renamed from: a */
        final /* synthetic */ VideoView f19709a;

        C44797(VideoView videoView) {
            this.f19709a = videoView;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Object obj = 1;
            this.f19709a.f19651p = i2;
            this.f19709a.f19652q = i3;
            Object obj2 = this.f19709a.f19645j == 3 ? 1 : null;
            if (!(this.f19709a.f19649n == i2 && this.f19709a.f19650o == i3)) {
                obj = null;
            }
            if (this.f19709a.f19648m != null && obj2 != null && r1 != null) {
                if (this.f19709a.f19658w != 0) {
                    this.f19709a.seekTo(this.f19709a.f19658w);
                }
                this.f19709a.start();
                if (this.f19709a.f19653r != null) {
                    if (this.f19709a.f19653r.isShowing()) {
                        this.f19709a.f19653r.hide();
                    }
                    this.f19709a.f19653r.show();
                }
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f19709a.f19647l = surfaceHolder;
            if (this.f19709a.f19648m != null && this.f19709a.f19644i == 6 && this.f19709a.f19645j == 7) {
                this.f19709a.f19648m.setDisplay(this.f19709a.f19647l);
            } else {
                this.f19709a.m23980e();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f19709a.f19647l = null;
            if (this.f19709a.f19653r != null) {
                this.f19709a.f19653r.hide();
            }
            if (this.f19709a.f19644i != 6) {
                this.f19709a.m23966a(true);
            }
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f19640e = "VideoView";
        this.f19644i = 0;
        this.f19645j = 0;
        this.f19647l = null;
        this.f19648m = null;
        this.f19632A = true;
        this.f19636a = new C44731(this);
        this.f19637b = new C44742(this);
        this.f19638c = new C44753(this);
        this.f19633B = new C44764(this);
        this.f19634C = new C44775(this);
        this.f19635D = new C44786(this);
        this.f19639d = new C44797(this);
        this.f19646k = context;
        m23976d();
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f19646k = context;
        m23976d();
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19640e = "VideoView";
        this.f19644i = 0;
        this.f19645j = 0;
        this.f19647l = null;
        this.f19648m = null;
        this.f19632A = true;
        this.f19636a = new C44731(this);
        this.f19637b = new C44742(this);
        this.f19638c = new C44753(this);
        this.f19633B = new C44764(this);
        this.f19634C = new C44775(this);
        this.f19635D = new C44786(this);
        this.f19639d = new C44797(this);
        this.f19646k = context;
        m23976d();
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f19649n, i);
        int defaultSize2 = getDefaultSize(this.f19650o, i2);
        if (this.f19649n > 0 && this.f19650o > 0) {
            if (this.f19649n * defaultSize2 > this.f19650o * defaultSize) {
                defaultSize2 = (this.f19650o * defaultSize) / this.f19649n;
            } else if (this.f19649n * defaultSize2 < this.f19650o * defaultSize) {
                defaultSize = (this.f19649n * defaultSize2) / this.f19650o;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    /* renamed from: d */
    private void m23976d() {
        this.f19649n = 0;
        this.f19650o = 0;
        getHolder().addCallback(this.f19639d);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f19644i = 0;
        this.f19645j = 0;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map<String, String> map) {
        if (this.f19641f == null || !this.f19641f.equals(uri)) {
            this.f19641f = uri;
            this.f19642g = map;
            this.f19658w = 0;
            m23980e();
            requestLayout();
            invalidate();
        }
    }

    public Uri getUri() {
        return this.f19641f;
    }

    /* renamed from: a */
    public void mo4074a() {
        if (this.f19648m != null) {
            this.f19648m.stop();
            this.f19648m.release();
            this.f19648m = null;
            this.f19644i = 0;
            this.f19645j = 0;
        }
    }

    /* renamed from: b */
    public void mo4075b() {
        if (this.f19648m != null) {
            this.f19648m.pause();
            this.f19644i = 4;
            this.f19645j = 4;
        }
    }

    /* renamed from: e */
    private void m23980e() {
        if (this.f19641f != null && this.f19647l != null) {
            m23966a(false);
            try {
                this.f19648m = new MediaPlayer();
                this.f19648m.setOnPreparedListener(this.f19638c);
                this.f19648m.setOnVideoSizeChangedListener(this.f19637b);
                this.f19643h = -1;
                this.f19648m.setOnCompletionListener(this.f19633B);
                this.f19648m.setOnErrorListener(this.f19634C);
                this.f19648m.setOnInfoListener(this.f19636a);
                this.f19648m.setOnBufferingUpdateListener(this.f19635D);
                this.f19656u = 0;
                this.f19648m.setDataSource(this.f19646k, this.f19641f, this.f19642g);
                this.f19648m.setDisplay(this.f19647l);
                this.f19648m.setAudioStreamType(3);
                this.f19648m.setScreenOnWhilePlaying(true);
                this.f19648m.prepareAsync();
                this.f19644i = 1;
                m23984f();
            } catch (IOException e) {
                this.f19644i = -1;
                this.f19645j = -1;
                this.f19634C.onError(this.f19648m, 1, 0);
            } catch (IllegalArgumentException e2) {
                this.f19644i = -1;
                this.f19645j = -1;
                this.f19634C.onError(this.f19648m, 1, 0);
            }
        }
    }

    /* renamed from: c */
    public boolean m23998c() {
        return this.f19632A;
    }

    public void setAudioEnabled(boolean z) {
        if (this.f19648m == null) {
            return;
        }
        if (z) {
            this.f19648m.setVolume(1.0f, 1.0f);
        } else {
            this.f19648m.setVolume(0.0f, 0.0f);
        }
    }

    public void setMediaController(MediaController mediaController) {
        if (this.f19653r != null) {
            this.f19653r.hide();
        }
        this.f19653r = mediaController;
        m23984f();
    }

    /* renamed from: f */
    private void m23984f() {
        if (this.f19648m != null && this.f19653r != null) {
            View view;
            this.f19653r.setMediaPlayer(this);
            if (getParent() instanceof View) {
                view = (View) getParent();
            } else {
                view = this;
            }
            this.f19653r.setAnchorView(view);
            this.f19653r.setEnabled(m23989h());
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f19655t = onPreparedListener;
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f19654s = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f19657v = onErrorListener;
    }

    /* renamed from: a */
    private void m23966a(boolean z) {
        if (this.f19648m != null) {
            this.f19648m.reset();
            this.f19648m.release();
            this.f19648m = null;
            this.f19644i = 0;
            if (z) {
                this.f19645j = 0;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m23989h() && this.f19653r != null) {
            m23987g();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m23989h() && this.f19653r != null) {
            m23987g();
        }
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) ? false : true;
        if (m23989h() && z && this.f19653r != null) {
            if (i == 79 || i == 85) {
                if (this.f19648m.isPlaying()) {
                    pause();
                    this.f19653r.show();
                    return true;
                }
                start();
                this.f19653r.hide();
                return true;
            } else if (i == 86 && this.f19648m.isPlaying()) {
                pause();
                this.f19653r.show();
            } else {
                m23987g();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: g */
    private void m23987g() {
        if (this.f19653r.isShowing()) {
            this.f19653r.hide();
        } else {
            this.f19653r.show();
        }
    }

    public void start() {
        if (m23989h()) {
            this.f19648m.start();
            this.f19644i = 3;
        }
        this.f19645j = 3;
    }

    public void pause() {
        if (this.f19648m != null && this.f19648m.isPlaying()) {
            this.f19648m.pause();
            this.f19644i = 4;
        }
        this.f19645j = 4;
    }

    public int getDuration() {
        if (!m23989h()) {
            this.f19643h = -1;
            return this.f19643h;
        } else if (this.f19643h > 0) {
            return this.f19643h;
        } else {
            this.f19643h = this.f19648m.getDuration();
            return this.f19643h;
        }
    }

    public int getCurrentPosition() {
        if (m23989h()) {
            return this.f19648m.getCurrentPosition();
        }
        return 0;
    }

    public void seekTo(int i) {
        if (m23989h()) {
            this.f19648m.seekTo(i);
            this.f19658w = 0;
            return;
        }
        this.f19658w = i;
    }

    public boolean isPlaying() {
        if (this.f19648m == null) {
            return false;
        }
        return this.f19648m.isPlaying();
    }

    public int getBufferPercentage() {
        if (this.f19648m != null) {
            return this.f19656u;
        }
        return 0;
    }

    /* renamed from: h */
    private boolean m23989h() {
        return (this.f19648m == null || this.f19644i == -1 || this.f19644i == 1) ? false : true;
    }

    public boolean canPause() {
        return this.f19659x;
    }

    public boolean canSeekBackward() {
        return this.f19660y;
    }

    public boolean canSeekForward() {
        return this.f19661z;
    }

    public int getAudioSessionId() {
        return 0;
    }
}
