package com.p000;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

@TargetApi(16)
/* compiled from: MediaCodecUtil */
/* renamed from: adm */
public final class adm {
    /* renamed from: a */
    private static final HashMap<C0099a, Pair<String, CodecCapabilities>> f587a = new HashMap();

    /* compiled from: MediaCodecUtil */
    /* renamed from: adm$a */
    static final class C0099a {
        /* renamed from: a */
        public final String f583a;
        /* renamed from: b */
        public final boolean f584b;

        public C0099a(String str, boolean z) {
            this.f583a = str;
            this.f584b = z;
        }

        public int hashCode() {
            return (this.f584b ? 1231 : 1237) + (((this.f583a == null ? 0 : this.f583a.hashCode()) + 31) * 31);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C0099a.class) {
                return false;
            }
            C0099a c0099a = (C0099a) obj;
            if (TextUtils.equals(this.f583a, c0099a.f583a) && this.f584b == c0099a.f584b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: MediaCodecUtil */
    /* renamed from: adm$b */
    public static class C0100b extends IOException {
        private C0100b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* compiled from: MediaCodecUtil */
    /* renamed from: adm$c */
    interface C0101c {
        /* renamed from: a */
        int mo95a();

        /* renamed from: a */
        MediaCodecInfo mo96a(int i);

        /* renamed from: a */
        boolean mo97a(String str, CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo98b();
    }

    /* compiled from: MediaCodecUtil */
    /* renamed from: adm$d */
    static final class C0102d implements C0101c {
        private C0102d() {
        }

        /* renamed from: a */
        public int mo95a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public MediaCodecInfo mo96a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public boolean mo98b() {
            return false;
        }

        /* renamed from: a */
        public boolean mo97a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* compiled from: MediaCodecUtil */
    /* renamed from: adm$e */
    static final class C0103e implements C0101c {
        /* renamed from: a */
        private final int f585a;
        /* renamed from: b */
        private MediaCodecInfo[] f586b;

        public C0103e(boolean z) {
            this.f585a = z ? 1 : 0;
        }

        /* renamed from: a */
        public int mo95a() {
            m774c();
            return this.f586b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo96a(int i) {
            m774c();
            return this.f586b[i];
        }

        /* renamed from: b */
        public boolean mo98b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo97a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: c */
        private void m774c() {
            if (this.f586b == null) {
                this.f586b = new MediaCodecList(this.f585a).getCodecInfos();
            }
        }
    }

    /* renamed from: a */
    public static adc m779a(String str, boolean z) throws C0100b {
        Pair b = adm.m784b(str, z);
        if (b == null) {
            return null;
        }
        return new adc((String) b.first, adm.m781a((CodecCapabilities) b.second));
    }

    /* renamed from: b */
    public static synchronized Pair<String, CodecCapabilities> m784b(String str, boolean z) throws C0100b {
        Pair<String, CodecCapabilities> pair;
        synchronized (adm.class) {
            C0099a c0099a = new C0099a(str, z);
            if (f587a.containsKey(c0099a)) {
                pair = (Pair) f587a.get(c0099a);
            } else {
                pair = adm.m780a(c0099a, ahr.f1511a >= 21 ? new C0103e(z) : new C0102d());
                if (z && pair == null && 21 <= ahr.f1511a && ahr.f1511a <= 23) {
                    Pair<String, CodecCapabilities> a = adm.m780a(c0099a, new C0102d());
                    if (a != null) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((String) a.first));
                    }
                    pair = a;
                }
            }
        }
        return pair;
    }

    /* renamed from: a */
    private static Pair<String, CodecCapabilities> m780a(C0099a c0099a, C0101c c0101c) throws C0100b {
        try {
            return adm.m783b(c0099a, c0101c);
        } catch (Throwable e) {
            throw new C0100b(e);
        }
    }

    /* renamed from: b */
    private static Pair<String, CodecCapabilities> m783b(C0099a c0099a, C0101c c0101c) {
        String str = c0099a.f583a;
        int a = c0101c.mo95a();
        boolean b = c0101c.mo98b();
        for (int i = 0; i < a; i++) {
            MediaCodecInfo a2 = c0101c.mo96a(i);
            String name = a2.getName();
            if (adm.m782a(a2, name, b)) {
                String[] supportedTypes = a2.getSupportedTypes();
                for (String str2 : supportedTypes) {
                    if (str2.equalsIgnoreCase(str)) {
                        CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str2);
                        boolean a3 = c0101c.mo97a(c0099a.f583a, capabilitiesForType);
                        if (b) {
                            f587a.put(c0099a.f584b == a3 ? c0099a : new C0099a(str, a3), Pair.create(name, capabilitiesForType));
                        } else {
                            Object c0099a2;
                            HashMap hashMap = f587a;
                            if (c0099a.f584b) {
                                c0099a2 = new C0099a(str, false);
                            } else {
                                C0099a c0099a3 = c0099a;
                            }
                            hashMap.put(c0099a2, Pair.create(name, capabilitiesForType));
                            if (a3) {
                                f587a.put(c0099a.f584b ? c0099a : new C0099a(str, true), Pair.create(name + ".secure", capabilitiesForType));
                            }
                        }
                        if (f587a.containsKey(c0099a)) {
                            return (Pair) f587a.get(c0099a);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m782a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        if ((ahr.f1511a < 21 && "CIPAACDecoder".equals(str)) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
            return false;
        }
        if (ahr.f1511a == 16 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (ahr.f1511a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(ahr.f1512b) || "protou".equals(ahr.f1512b) || "C6602".equals(ahr.f1512b) || "C6603".equals(ahr.f1512b) || "C6606".equals(ahr.f1512b) || "C6616".equals(ahr.f1512b) || "L36h".equals(ahr.f1512b) || "SO-02E".equals(ahr.f1512b))) {
            return false;
        }
        if (ahr.f1511a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(ahr.f1512b) || "C1505".equals(ahr.f1512b) || "C1604".equals(ahr.f1512b) || "C1605".equals(ahr.f1512b))) {
            return false;
        }
        if (ahr.f1511a > 19 || ahr.f1512b == null || ((!ahr.f1512b.startsWith("d2") && !ahr.f1512b.startsWith("serrano")) || !"samsung".equals(ahr.f1513c) || !str.equals("OMX.SEC.vp8.dec"))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m781a(CodecCapabilities codecCapabilities) {
        if (ahr.f1511a >= 19) {
            return adm.m785b(codecCapabilities);
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m785b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }
}
