package com.p000;

import android.media.MediaPlayer;
import android.view.View;
import com.mopub.mobileads.VastIconXmlManager;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p000.byl.C1593c;

/* compiled from: NativeVideoTrackerImpl */
/* renamed from: byh */
class byh extends bxv<MediaPlayer> implements byg {

    /* compiled from: NativeVideoTrackerImpl */
    /* renamed from: byh$a */
    static class C1594a implements C1593c<byg> {
        /* renamed from: a */
        private static final byv<Method> f8188a;
        /* renamed from: b */
        private static final byv<Method> f8189b;
        /* renamed from: c */
        private static final byv<Method> f8190c;
        /* renamed from: d */
        private static final byv<Method> f8191d;
        /* renamed from: e */
        private static final byv<Method> f8192e;

        C1594a() {
        }

        static {
            byv a;
            Exception e;
            byv a2 = byv.m11830a();
            byv a3 = byv.m11830a();
            byv a4 = byv.m11830a();
            byv a5 = byv.m11830a();
            byv a6 = byv.m11830a();
            try {
                Class cls = byg.class;
                Method method = cls.getMethod("setDebug", new Class[]{Boolean.TYPE});
                Method method2 = cls.getMethod("trackVideoAd", new Class[]{Map.class, MediaPlayer.class, View.class});
                Method method3 = cls.getMethod("changeTargetView", new Class[]{View.class});
                Method method4 = cls.getMethod("dispatchEvent", new Class[]{Map.class});
                Method method5 = cls.getMethod("dispatchEvent", new Class[]{Map.class});
                a2 = byv.m11831a(method);
                a3 = byv.m11831a(method2);
                a4 = byv.m11831a(method3);
                a = byv.m11831a(method4);
                try {
                    a5 = byv.m11831a(method5);
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    byt.m11829a(e);
                    f8188a = a2;
                    f8189b = a3;
                    f8190c = a4;
                    f8191d = a;
                    f8192e = a5;
                }
            } catch (Exception e3) {
                Exception exception = e3;
                a = a6;
                e = exception;
                byt.m11829a(e);
                f8188a = a2;
                f8189b = a3;
                f8190c = a4;
                f8191d = a;
                f8192e = a5;
            }
            f8188a = a2;
            f8189b = a3;
            f8190c = a4;
            f8191d = a;
            f8192e = a5;
        }

        /* renamed from: a */
        public boolean mo1605a(Method method) {
            byv a = byv.m11831a(method);
            return f8188a.equals(a) || f8189b.equals(a) || f8190c.equals(a) || f8191d.equals(a) || f8192e.equals(a);
        }

        /* renamed from: a */
        public Class<byg> mo1604a() {
            return byg.class;
        }
    }

    public byh(String str, bxr bxr, byj byj) {
        super(str, bxr, byj);
    }

    /* renamed from: f */
    protected Integer mo1609f() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getCurrentPosition());
    }

    /* renamed from: g */
    protected boolean mo1610g() {
        return ((MediaPlayer) this.f.get()).isPlaying();
    }

    /* renamed from: h */
    protected Integer mo1611h() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getDuration());
    }

    /* renamed from: a */
    public boolean mo1607a(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        if (mediaPlayer == null) {
            m11677a("Null player instance. Not tracking.");
        }
        try {
            mediaPlayer.getCurrentPosition();
            return super.mo1608a(map, mediaPlayer, view);
        } catch (IllegalStateException e) {
            m11677a("Playback has already completed. Not tracking.");
            return false;
        }
    }

    /* renamed from: a */
    protected Map<String, Object> mo1606a() throws byu {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f.get();
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put(VastIconXmlManager.DURATION, Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }
}
