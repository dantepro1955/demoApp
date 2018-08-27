package com.p000;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView.C0605t;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.Ad;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: AdPostRenderer */
/* renamed from: ccf */
public class ccf extends ccp {
    /* renamed from: d */
    private long f8683d = 0;
    /* renamed from: e */
    private boolean f8684e = false;
    /* renamed from: f */
    private boolean f8685f = false;
    /* renamed from: g */
    private NativeAd f8686g;
    /* renamed from: h */
    private NativeAd f8687h;
    /* renamed from: i */
    private AdListener f8688i = new C16671(this);

    /* compiled from: AdPostRenderer */
    /* renamed from: ccf$1 */
    class C16671 implements AdListener {
        /* renamed from: a */
        final /* synthetic */ ccf f8682a;

        C16671(ccf ccf) {
            this.f8682a = ccf;
        }

        public void onError(Ad ad, AdError adError) {
        }

        public void onAdLoaded(Ad ad) {
            if (ad == this.f8682a.f8687h) {
                Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(this.f8682a.f8687h.getAdCoverImage().getUrl()), null);
                this.f8682a.f8684e = true;
                this.f8682a.f8685f = true;
            }
        }

        public void onAdClicked(Ad ad) {
            chn.m13446r();
        }

        public void onLoggingImpression(Ad ad) {
        }
    }

    public ccf(String str, com com, boolean z, cco cco) {
        super(str, com, z, cco);
    }

    /* renamed from: a */
    public C0605t mo1646a(ViewGroup viewGroup, int i) {
        if (viewGroup.getContext() != null) {
            m12463a(viewGroup.getContext());
        }
        return super.mo1646a(viewGroup, i);
    }

    /* renamed from: a */
    public void mo1647a(C0605t c0605t, int i, cct cct) {
        super.mo1647a(c0605t, i, cct);
    }

    /* renamed from: b */
    public void mo1660b(C0605t c0605t, int i, cct cct) {
        cdt cdt = (cdt) c0605t;
        if (this.f8684e) {
            cdt.f8845y.setVisibility(0);
            if (this.f8686g != null) {
                this.f8686g.unregisterView();
            }
            if (this.f8685f) {
                this.f8685f = false;
                if (this.f8686g != null) {
                    this.f8686g.destroy();
                }
                this.f8686g = this.f8687h;
                this.f8687h = null;
            }
            if (!m12466a(c0605t.itemView, this.f8686g)) {
                cdt.m12693a(new AdChoicesView(c0605t.itemView.getContext(), this.f8686g, true), this.f8686g.getAdChoicesLinkUrl());
            }
            cdt.f8839a.setText(this.f8686g.getAdTitle());
            cdt.f8840b.setText(this.f8686g.getAdBody());
            Image adCoverImage = this.f8686g.getAdCoverImage();
            cdt.f8841u.requestLayout();
            cdt.f8841u.setImageURI(Uri.parse(adCoverImage.getUrl()));
            CharSequence adCallToAction = this.f8686g.getAdCallToAction();
            if (TextUtils.isEmpty(adCallToAction)) {
                cdt.f8844x.setVisibility(8);
            } else {
                cdt.f8844x.setText(adCallToAction);
                cdt.f8844x.setVisibility(0);
            }
            List arrayList = new ArrayList();
            arrayList.add(cdt.f8841u);
            arrayList.add(cdt.f8844x);
            this.f8686g.registerViewForInteraction(cdt.itemView, arrayList);
            long a = cqw.a();
            if (a - this.f8683d > 60000) {
                this.f8683d = a;
                m12467b(c0605t.itemView.getContext());
                return;
            }
            return;
        }
        cdt.f8845y.setVisibility(8);
    }

    /* renamed from: a */
    void m12463a(Context context) {
        if (!this.f8684e) {
            m12461c(context);
        }
    }

    /* renamed from: b */
    public void m12467b(Context context) {
        if (this.f8684e) {
            m12461c(context);
        }
    }

    /* renamed from: c */
    private void m12461c(Context context) {
        this.f8685f = false;
        this.f8687h = new NativeAd(context, "111569915535689_1070542929638378");
        this.f8687h.setAdListener(this.f8688i);
        this.f8687h.loadAd();
    }

    /* renamed from: a */
    public boolean m12466a(View view, NativeAd nativeAd) {
        View findViewById = view.findViewById(R.id.adchoices_view);
        if (findViewById == null) {
            return false;
        }
        String str = (String) findViewById.getTag();
        if (str == null || nativeAd.getAdChoicesLinkUrl() == null) {
            return false;
        }
        return str.equals(nativeAd.getAdChoicesLinkUrl());
    }
}
