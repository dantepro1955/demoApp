package com.p000;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.mopub.nativeads.MediaViewBinder;
import com.mopub.nativeads.NativeAd;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.mopub.nativeads.ViewBinder.Builder;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.overlay.AdOverlayFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: AdOverlayAdapter */
/* renamed from: ceo */
public class ceo extends cep {
    /* renamed from: c */
    private cdl f8937c;
    /* renamed from: d */
    private dmm f8938d;
    /* renamed from: e */
    private NativeAd f8939e;
    /* renamed from: f */
    private final HashMap<Integer, WeakReference<NativeAd>> f8940f = new HashMap();

    public ceo(AppCompatActivity appCompatActivity, cge cge, cco cco, String str) {
        super(appCompatActivity, cge, cco, str);
        if (crf.a()) {
            ckk e = caf.m12046a().m12075g().f9369b.m13685e(cco.f8732d);
            String c = e == null ? null : e.m14172c();
            String a = e == null ? ckd.m14162a(cco.f8731c) : e.m14178f();
            String b = dmn.b(c, a);
            dmn e2 = caf.m12046a().m12086p().e();
            cle a2 = caf.m12046a().m12075g().f9370c.m13814a(cco.f8729a);
            this.f8938d = e2.b("9131cc69713445f890178fd2b458cccd", b, "inline_ad");
            if (c == null && a == null) {
                try {
                    c = "";
                } catch (Exception e3) {
                }
            } else if (c == null) {
                c = a;
            } else if (a != null) {
                c = c + "_" + a;
            }
            this.f8938d = crf.b(this.f8938d, a2 == null ? null : new bum().m11091a(a2.m14250h()), c);
            this.f8937c = new cdl(appCompatActivity, this.f8938d.a(), null, new Builder(R.layout.overlay_native_ad).mainImageId(R.id.overlay_native_ad_image).textId(R.id.overlay_native_ad_description).callToActionId(R.id.btnShare).privacyInformationIconImageId(R.id.overlay_native_ad_privacy).build(), new MediaViewBinder.Builder(R.layout.overlay_native_ad).mediaLayoutId(R.id.overlay_native_ad_video).textId(R.id.overlay_native_ad_description).callToActionId(R.id.btnShare).privacyInformationIconImageId(R.id.overlay_native_ad_privacy).build());
            this.f8937c.m12669b();
        }
    }

    /* renamed from: a */
    public boolean m12825a() {
        if (!crf.a()) {
            return false;
        }
        if (this.f8939e == null) {
            this.f8939e = this.f8937c.m12668a();
        }
        if (this.f8939e != null) {
            return true;
        }
        return false;
    }

    public boolean b_(int i) {
        if (crf.a()) {
            return this.f8938d.a(i);
        }
        return false;
    }

    /* renamed from: c */
    public int m12827c(int i) {
        return !crf.a() ? i : i - this.f8938d.b(i);
    }

    /* renamed from: d */
    public int m12829d(int i) {
        if (!crf.a()) {
            return i;
        }
        int i2 = i;
        while (m12827c(i2) < i) {
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    public int mo1691b() {
        return m12829d(this.a.m13100l());
    }

    /* renamed from: e */
    public cct mo1693e(int i) {
        if (b_(i)) {
            String str;
            String str2;
            String str3 = "";
            String str4 = "Open";
            if (this.f8940f.containsKey(Integer.valueOf(i))) {
                NativeAd nativeAd = (NativeAd) ((WeakReference) this.f8940f.get(Integer.valueOf(i))).get();
                if (nativeAd != null) {
                    if (nativeAd.isDestroyed()) {
                        this.f8940f.remove(Integer.valueOf(i));
                    } else {
                        this.f8939e = nativeAd;
                    }
                }
            }
            if (this.f8939e == null) {
                this.f8939e = this.f8937c.m12668a();
            }
            if (this.f8939e == null) {
                this.f8937c.m12669b();
            }
            if (this.f8939e != null) {
                String mainImageUrl;
                if (this.f8939e.getBaseNativeAd() instanceof StaticNativeAd) {
                    StaticNativeAd staticNativeAd = (StaticNativeAd) this.f8939e.getBaseNativeAd();
                    str3 = staticNativeAd.getTitle();
                    str4 = staticNativeAd.getCallToAction();
                    mainImageUrl = staticNativeAd.getMainImageUrl();
                } else if (this.f8939e.getBaseNativeAd() instanceof VideoNativeAd) {
                    VideoNativeAd videoNativeAd = (VideoNativeAd) this.f8939e.getBaseNativeAd();
                    str3 = videoNativeAd.getTitle();
                    str4 = videoNativeAd.getCallToAction();
                    mainImageUrl = videoNativeAd.getMainImageUrl();
                } else {
                    mainImageUrl = null;
                }
                this.f8940f.put(Integer.valueOf(i), new WeakReference(this.f8939e));
                str = mainImageUrl;
                str2 = str4;
            } else {
                str = null;
                str2 = str4;
            }
            return new cdk(new cdj(this.f8939e, str3, str2, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), str, null));
        }
        int c = m12827c(i);
        return (c < 0 || c >= this.a.size()) ? null : (cct) this.a.get(c);
    }

    /* renamed from: c */
    public cct mo1692c() {
        return mo1693e(m12829d(this.a.m13100l()));
    }

    /* renamed from: f */
    public void mo1694f(int i) {
        if (!b_(i)) {
            this.a.remove(m12827c(i));
        }
    }

    /* renamed from: a */
    public Fragment mo1690a(int i) {
        if (b_(i)) {
            return m12832g(i);
        }
        return m12824a(m12827c(i), m12820e());
    }

    /* renamed from: a */
    public Fragment m12824a(int i, String str) {
        return coe.m14956a(i, ((cct) this.a.get(i)).m12282e(), this.b, str);
    }

    /* renamed from: g */
    public Fragment m12832g(int i) {
        Fragment adOverlayFragment = new AdOverlayFragment();
        if (this.f8940f.containsKey(Integer.valueOf(i))) {
            NativeAd nativeAd = (NativeAd) ((WeakReference) this.f8940f.get(Integer.valueOf(i))).get();
            if (nativeAd != null) {
                if (nativeAd.isDestroyed()) {
                    this.f8940f.remove(Integer.valueOf(i));
                } else {
                    this.f8939e = nativeAd;
                }
            }
        }
        if (this.f8939e == null) {
            this.f8939e = this.f8937c.m12668a();
        }
        if (this.f8939e == null) {
            this.f8937c.m12669b();
        } else {
            this.f8940f.put(Integer.valueOf(i), new WeakReference(this.f8939e));
        }
        adOverlayFragment.a(this.f8939e);
        this.f8939e = null;
        this.f8937c.m12669b();
        return adOverlayFragment;
    }

    public int getCount() {
        if (!crf.a()) {
            return super.getCount();
        }
        if (this.a == null) {
            return 0;
        }
        return this.a.size() + this.f8938d.b(this.a.size() - 1);
    }
}
