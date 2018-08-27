package com.sept.android.lib.widget.mp4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p000.dfz;
import p000.dit;
import p000.diu;
import p000.dlb;
import p000.dlb.C4462c;
import p000.dlc;
import p000.dld;
import p000.dld.C4468a;

@TargetApi(14)
public class TextureVideoView extends TextureView {
    /* renamed from: a */
    SurfaceTextureListener f19666a = new C44729(this);
    /* renamed from: b */
    private int f19667b = 0;
    /* renamed from: c */
    private int f19668c = 0;
    /* renamed from: d */
    private MediaPlayer f19669d;
    /* renamed from: e */
    private int f19670e;
    /* renamed from: f */
    private int f19671f;
    /* renamed from: g */
    private SurfaceTexture f19672g;
    /* renamed from: h */
    private Surface f19673h;
    /* renamed from: i */
    private dlb f19674i;
    /* renamed from: j */
    private String f19675j = "idle";
    /* renamed from: k */
    private OnPreparedListener f19676k;
    /* renamed from: l */
    private Uri f19677l;
    /* renamed from: m */
    private Context f19678m;
    /* renamed from: n */
    private dfz f19679n;
    /* renamed from: o */
    private ArrayList<C4462c> f19680o;
    /* renamed from: p */
    private OnErrorListener f19681p;
    /* renamed from: q */
    private boolean f19682q = false;
    /* renamed from: r */
    private boolean f19683r = true;
    /* renamed from: s */
    private OnInfoListener f19684s = new C44642(this);
    /* renamed from: t */
    private OnBufferingUpdateListener f19685t = new C44653(this);
    /* renamed from: u */
    private OnCompletionListener f19686u = new C44664(this);
    /* renamed from: v */
    private OnPreparedListener f19687v = new C44675(this);
    /* renamed from: w */
    private C4468a f19688w = new C44696(this);
    /* renamed from: x */
    private OnVideoSizeChangedListener f19689x = new C44707(this);
    /* renamed from: y */
    private OnErrorListener f19690y = new C44718(this);

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$1 */
    class C44631 implements C4462c {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19694a;

        C44631(TextureVideoView textureVideoView) {
            this.f19694a = textureVideoView;
        }

        /* renamed from: a */
        public void mo4085a(boolean z, int i) {
            if (i == 5 && this.f19694a.f19674i != null) {
                this.f19694a.f19674i.m27785a(0);
            }
        }

        /* renamed from: a */
        public void mo4084a(Exception exception) {
            diu diu = new diu();
            diu.m27495a(2, "mp4Url", this.f19694a.f19677l.toString());
            dit.m27476a("VideoAction", "StreamVideoFailed", exception.getMessage(), Long.valueOf(0), diu);
        }

        /* renamed from: a */
        public void mo4083a(int i, int i2, int i3, float f) {
            this.f19694a.f19671f = i2;
            this.f19694a.f19670e = i;
            this.f19694a.requestLayout();
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$2 */
    class C44642 implements OnInfoListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19695a;

        C44642(TextureVideoView textureVideoView) {
            this.f19695a = textureVideoView;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            switch (i) {
                case 701:
                    this.f19695a.f19683r = true;
                    break;
                case 702:
                    this.f19695a.f19683r = false;
                    break;
                default:
                    this.f19695a.f19683r = false;
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$3 */
    class C44653 implements OnBufferingUpdateListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19696a;

        C44653(TextureVideoView textureVideoView) {
            this.f19696a = textureVideoView;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$4 */
    class C44664 implements OnCompletionListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19697a;

        C44664(TextureVideoView textureVideoView) {
            this.f19697a = textureVideoView;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f19697a.f19667b = 5;
            this.f19697a.f19668c = 5;
            this.f19697a.f19675j = "playback completed";
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$5 */
    class C44675 implements OnPreparedListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19698a;

        C44675(TextureVideoView textureVideoView) {
            this.f19698a = textureVideoView;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f19698a.f19667b = 2;
            this.f19698a.f19675j = "prepared";
            this.f19698a.m24035a("onPrepared");
            this.f19698a.f19670e = mediaPlayer.getVideoWidth();
            this.f19698a.f19671f = mediaPlayer.getVideoHeight();
            this.f19698a.requestLayout();
            this.f19698a.invalidate();
            if (this.f19698a.f19670e == 0 || this.f19698a.f19671f == 0) {
                if (this.f19698a.f19668c == 3) {
                    this.f19698a.mo4078a();
                }
            } else if (this.f19698a.f19668c == 3) {
                this.f19698a.mo4078a();
            }
            if (this.f19698a.f19676k != null) {
                this.f19698a.f19676k.onPrepared(mediaPlayer);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$6 */
    class C44696 implements C4468a {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19699a;

        C44696(TextureVideoView textureVideoView) {
            this.f19699a = textureVideoView;
        }

        /* renamed from: a */
        public void mo4086a(String str) {
            if (this.f19699a.f19679n != null) {
                this.f19699a.f19679n.log("MP4_CRASH", "MP4_CRASH", str);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$7 */
    class C44707 implements OnVideoSizeChangedListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19700a;

        C44707(TextureVideoView textureVideoView) {
            this.f19700a = textureVideoView;
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$8 */
    class C44718 implements OnErrorListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19701a;

        C44718(TextureVideoView textureVideoView) {
            this.f19701a = textureVideoView;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            this.f19701a.f19667b = -1;
            this.f19701a.f19668c = -1;
            if (this.f19701a.f19681p != null) {
                this.f19701a.f19681p.onError(mediaPlayer, i, i2);
            }
            if (this.f19701a.f19679n != null) {
                this.f19701a.f19679n.log("MP4_NOT_START_PLAYING", "MP4_CRASH", i + ":" + i2 + "; layerType:" + this.f19701a.getLayerType());
            }
            return true;
        }
    }

    /* renamed from: com.sept.android.lib.widget.mp4.TextureVideoView$9 */
    class C44729 implements SurfaceTextureListener {
        /* renamed from: a */
        final /* synthetic */ TextureVideoView f19702a;

        C44729(TextureVideoView textureVideoView) {
            this.f19702a = textureVideoView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f19702a.m24035a("onSurfaceTextureAvailable");
            this.f19702a.f19672g = surfaceTexture;
            this.f19702a.f19673h = new Surface(this.f19702a.f19672g);
            if (!this.f19702a.f19682q) {
                this.f19702a.m24043h();
            }
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Object obj = 1;
            this.f19702a.m24035a("onSurfaceTextureSizeChanged");
            Object obj2 = this.f19702a.f19668c == 3 ? 1 : null;
            if (!(this.f19702a.f19670e == i && this.f19702a.f19671f == i2)) {
                obj = null;
            }
            if (this.f19702a.f19669d != null && obj2 != null && r1 != null) {
                this.f19702a.mo4078a();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f19702a.m24035a("onSurfaceTextureDestroyed");
            this.f19702a.f19673h = null;
            this.f19702a.f19672g = null;
            if (this.f19702a.f19682q) {
                this.f19702a.m24013a(true);
            } else {
                this.f19702a.m24018b(true);
            }
            return true;
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureVideoView(Context context) {
        super(context);
        this.f19678m = context;
        m24041f();
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19678m = context;
        m24041f();
    }

    public TextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19678m = context;
        m24041f();
    }

    public void setLogger(dfz dfz) {
        this.f19679n = dfz;
    }

    public void setUseExoPlayer(boolean z) {
        this.f19682q = z;
    }

    /* renamed from: d */
    public boolean m24039d() {
        return this.f19682q;
    }

    public void setAudioEnabled(boolean z) {
        float f = 1.0f;
        if (this.f19674i != null) {
            this.f19674i.m27798b(z);
        }
        if (this.f19669d != null) {
            float f2;
            MediaPlayer mediaPlayer = this.f19669d;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (!z) {
                f = 0.0f;
            }
            mediaPlayer.setVolume(f2, f);
        }
    }

    /* renamed from: e */
    public boolean m24040e() {
        if (this.f19674i != null) {
            return this.f19674i.m27805i();
        }
        if (this.f19669d == null) {
            return false;
        }
        if ((!this.f19683r || this.f19667b == 3) && this.f19669d.getCurrentPosition() >= 100) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m24035a(String str) {
        if (this.f19679n != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("msg", str);
            hashMap.put(ShareConstants.MEDIA_URI, "" + (this.f19677l == null ? "null" : this.f19677l.getLastPathSegment()));
            hashMap.put("surfaceTexture", "" + getSurfaceTexture());
            hashMap.put("this", "" + hashCode());
            if (this.f19669d == null) {
                hashMap.put("mp", "null");
            } else {
                hashMap.put("mp", this.f19675j);
            }
            this.f19679n.logBreadcrumb("mp4player", hashMap);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void m24041f() {
        this.f19671f = 0;
        this.f19670e = 0;
        setFocusable(false);
        setSurfaceTextureListener(this.f19666a);
        if (VERSION.SDK_INT >= 16) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            SurfaceTexture dld = new dld(i);
            dld.m27810a(this.f19688w);
            dld.detachFromGLContext();
            setSurfaceTexture(dld);
            this.f19666a.onSurfaceTextureAvailable(dld, 0, 0);
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        m24035a("setVideoURI: " + uri);
        if (getSurfaceTexture() == null) {
            m24041f();
        }
        if (this.f19677l == null || !this.f19677l.equals(uri)) {
            this.f19677l = uri;
            if (this.f19682q) {
                m24042g();
            } else {
                m24043h();
            }
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: g */
    public void m24042g() {
        if (this.f19677l != null && this.f19672g != null) {
            m24035a("opening video - layerType:" + getLayerType());
            m24013a(false);
            this.f19674i = new dlb(new dlc(this.f19678m, "Dummy", this.f19677l));
            this.f19674i.m27797b(this.f19673h);
            this.f19674i.m27781a();
            this.f19674i.m27793a(true);
            this.f19674i.m27791a(new C44631(this));
            if (this.f19680o != null) {
                for (int i = 0; i < this.f19680o.size(); i++) {
                    this.f19674i.m27791a((C4462c) this.f19680o.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public void m24043h() {
        if (this.f19677l != null && this.f19672g != null) {
            m24035a("opening video - layerType:" + getLayerType());
            m24018b(false);
            try {
                this.f19669d = new MediaPlayer();
                this.f19669d.setSurface(this.f19673h);
                this.f19669d.setDataSource(this.f19678m, this.f19677l);
                this.f19675j = "inited";
                this.f19669d.setOnInfoListener(this.f19684s);
                this.f19669d.setOnBufferingUpdateListener(this.f19685t);
                this.f19669d.setOnCompletionListener(this.f19686u);
                this.f19669d.setOnPreparedListener(this.f19687v);
                this.f19669d.setOnErrorListener(this.f19690y);
                this.f19669d.setOnVideoSizeChangedListener(this.f19689x);
                this.f19669d.setAudioStreamType(3);
                this.f19669d.setLooping(true);
                m24035a("preparing player");
                this.f19669d.prepareAsync();
                this.f19675j = "preparing";
                this.f19667b = 1;
            } catch (IllegalStateException e) {
                this.f19667b = -1;
                this.f19668c = -1;
                this.f19690y.onError(this.f19669d, 1, 0);
            } catch (IOException e2) {
                this.f19667b = -1;
                this.f19668c = -1;
                this.f19690y.onError(this.f19669d, 1, 0);
            } catch (Exception e3) {
                this.f19667b = -1;
                this.f19668c = -1;
                this.f19690y.onError(this.f19669d, 1, 0);
            }
        }
    }

    /* renamed from: b */
    public void mo4079b() {
        m24035a("stopPlayback: " + (this.f19669d == null));
        if (this.f19669d != null) {
            this.f19675j = "stopped";
            this.f19669d.stop();
            this.f19669d.reset();
            this.f19669d.release();
            this.f19669d = null;
            this.f19667b = 0;
            this.f19668c = 0;
        }
        this.f19677l = null;
    }

    /* renamed from: c */
    public void mo4080c() {
        if (this.f19669d != null) {
            this.f19675j = "idle";
            this.f19669d.pause();
            this.f19667b = 0;
            this.f19668c = 0;
        }
    }

    /* renamed from: i */
    public void m24044i() {
        if (this.f19674i != null) {
            this.f19675j = "stopped";
            this.f19674i.m27802f();
            this.f19674i.m27800d();
            this.f19674i = null;
            this.f19667b = 0;
            this.f19668c = 0;
        }
        this.f19677l = null;
    }

    /* renamed from: j */
    public void m24045j() {
        if (this.f19674i != null) {
            this.f19675j = "idle";
            this.f19674i.m27803g();
            this.f19667b = 0;
            this.f19668c = 0;
        }
    }

    /* renamed from: a */
    private void m24013a(boolean z) {
        m24035a("release: " + z + "; " + (this.f19669d == null));
        if (this.f19674i != null) {
            if (this.f19674i.m27804h()) {
                this.f19675j = "stopped";
                this.f19674i.m27802f();
            }
            this.f19674i.m27800d();
            this.f19667b = 0;
            if (z) {
                this.f19668c = 0;
            }
        }
    }

    /* renamed from: b */
    private void m24018b(boolean z) {
        m24035a("release: " + z + "; " + (this.f19669d == null));
        if (this.f19669d != null) {
            if (this.f19669d.isPlaying()) {
                this.f19675j = "stopped";
            }
            this.f19669d.stop();
            this.f19669d.reset();
            this.f19669d.release();
            this.f19669d = null;
            this.f19667b = 0;
            if (z) {
                this.f19668c = 0;
            }
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f19676k = onPreparedListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f19681p = onErrorListener;
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f19670e, i);
        int defaultSize2 = getDefaultSize(this.f19671f, i2);
        if (this.f19670e > 0 && this.f19671f > 0) {
            if (this.f19670e * defaultSize2 > this.f19671f * defaultSize) {
                defaultSize2 = (this.f19671f * defaultSize) / this.f19670e;
            } else if (this.f19670e * defaultSize2 < this.f19671f * defaultSize) {
                defaultSize = (this.f19670e * defaultSize2) / this.f19671f;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    /* renamed from: k */
    public boolean m24046k() {
        return m24031o() && this.f19669d.isPlaying();
    }

    /* renamed from: l */
    public boolean m24047l() {
        return m24032p() && this.f19674i.m27804h();
    }

    public Uri getUri() {
        return this.f19677l;
    }

    /* renamed from: m */
    public void m24048m() {
        this.f19675j = "started";
        m24035a("start");
        if (m24032p()) {
            this.f19674i.m27795b();
            this.f19667b = 3;
        }
        this.f19668c = 3;
    }

    /* renamed from: n */
    public void m24049n() {
        this.f19675j = "started";
        m24035a("start");
        if (m24032p()) {
            this.f19674i.m27799c();
            this.f19667b = 3;
        }
        this.f19668c = 3;
    }

    /* renamed from: a */
    public void mo4078a() {
        this.f19675j = "started";
        m24035a("start");
        if (m24031o()) {
            this.f19669d.start();
            this.f19667b = 3;
        }
        this.f19668c = 3;
    }

    public int getCurrentPosition() {
        if (m24031o()) {
            return this.f19669d.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (m24031o()) {
            return this.f19669d.getDuration();
        }
        return -1;
    }

    /* renamed from: a */
    public void m24034a(C4462c c4462c) {
        if (this.f19680o == null) {
            this.f19680o = new ArrayList();
        }
        this.f19680o.add(c4462c);
    }

    /* renamed from: b */
    public void m24037b(C4462c c4462c) {
        if (this.f19680o != null) {
            this.f19680o.remove(c4462c);
        }
    }

    /* renamed from: o */
    private boolean m24031o() {
        return (this.f19669d == null || this.f19667b == -1 || this.f19667b == 1) ? false : true;
    }

    /* renamed from: p */
    private boolean m24032p() {
        return this.f19674i != null && this.f19674i.m27806j();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getSurfaceTexture() == null) {
            m24041f();
        }
        setVisibility(0);
    }

    protected void onDetachedFromWindow() {
        m24035a("onDetachedFromWindow");
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            m24035a("onDetachedFromWindow e: " + e.getMessage());
            if (this.f19672g != null) {
                this.f19672g.release();
            }
        }
    }
}
