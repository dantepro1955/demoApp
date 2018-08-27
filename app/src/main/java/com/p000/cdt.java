package com.p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import com.mopub.nativeads.NativeAd;
import com.ninegag.android.app.R;
import p000.ccp.C1665b;

/* compiled from: NativeAdViewWithGagViewHolder */
/* renamed from: cdt */
public class cdt extends C1665b {
    /* renamed from: A */
    public View f8831A;
    /* renamed from: B */
    public NativeAppInstallAdView f8832B;
    /* renamed from: C */
    public NativeContentAdView f8833C;
    /* renamed from: D */
    public ViewGroup f8834D;
    /* renamed from: E */
    public ViewGroup f8835E;
    /* renamed from: F */
    private int f8836F = 0;
    /* renamed from: G */
    private int f8837G;
    /* renamed from: H */
    private int f8838H;
    /* renamed from: a */
    public TextView f8839a;
    /* renamed from: b */
    public TextView f8840b;
    /* renamed from: u */
    public ImageView f8841u;
    /* renamed from: v */
    public View f8842v;
    /* renamed from: w */
    public View f8843w;
    /* renamed from: x */
    public TextView f8844x;
    /* renamed from: y */
    public View f8845y;
    /* renamed from: z */
    public LinearLayout f8846z;

    public cdt(View view, cnt cnt) {
        super(view, cnt);
        this.f8842v = view.findViewById(R.id.adDivider);
        this.f8843w = view.findViewById(R.id.adDividerTop);
        this.f8845y = view.findViewById(R.id.mainContent);
        this.f8846z = (LinearLayout) view.findViewById(R.id.infoWrapper);
        this.f8836F = (int) djy.a(5.0f, view.getContext());
        this.f8834D = (ViewGroup) view.findViewById(R.id.adMobContainer);
        this.f8835E = (ViewGroup) view.findViewById(R.id.normalAdContainer);
        this.f8837G = djh.a(view.getContext()).x;
        this.f8838H = (int) (((double) this.f8837G) / 1.91d);
    }

    /* renamed from: a */
    public void m12692a(int i, NativeAd nativeAd) {
        View view;
        this.f8834D.removeAllViews();
        cro cro = (cro) crj.b(cro.class);
        View view2;
        LayoutInflater from;
        int i2;
        switch (i) {
            case 0:
                view2 = this.f8835E;
                this.f8835E.setVisibility(0);
                this.f8834D.setVisibility(8);
                nativeAd.prepare(this.f8835E);
                view = view2;
                break;
            case 1:
                from = LayoutInflater.from(this.f8845y.getContext());
                i2 = (cro == null || cro.c().intValue() == cro.a().intValue()) ? R.layout.view_admob_install_app_ad : R.layout.view_admob_install_app_ad_native;
                this.f8832B = (NativeAppInstallAdView) from.inflate(i2, this.f8834D, false);
                view2 = this.f8832B;
                this.f8834D.addView(view2);
                this.f8835E.setVisibility(8);
                this.f8834D.setVisibility(0);
                nativeAd.prepare(this.f8834D);
                view = view2;
                break;
            case 2:
                from = LayoutInflater.from(this.f8845y.getContext());
                i2 = (cro == null || cro.c().intValue() == cro.a().intValue()) ? R.layout.view_admob_content_ad : R.layout.view_admob_content_ad_native;
                this.f8833C = (NativeContentAdView) from.inflate(i2, this.f8834D, false);
                view2 = this.f8833C;
                this.f8834D.addView(view2);
                this.f8835E.setVisibility(8);
                this.f8834D.setVisibility(0);
                nativeAd.prepare(this.f8834D);
                view = view2;
                break;
            default:
                return;
        }
        this.f8839a = (TextView) view.findViewById(R.id.adPostTitle);
        this.f8841u = (ImageView) view.findViewById(R.id.async_image);
        this.f8840b = (TextView) view.findViewById(R.id.adBody);
        this.f8844x = (TextView) view.findViewById(R.id.btnCTA);
        this.f8841u.setLayoutParams(new LayoutParams(this.f8837G, this.f8838H));
        mo1630a();
    }

    /* renamed from: a */
    public void m12693a(View view, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.adPlaceholderContainer);
        View findViewById = relativeLayout.findViewById(R.id.adchoices_view);
        if (findViewById != null) {
            relativeLayout.removeView(findViewById);
        }
        view.setBackgroundColor(1342177280);
        view.setId(R.id.adchoices_view);
        view.setTag(str);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.rightMargin = this.f8836F;
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        view.setLayoutParams(layoutParams);
        relativeLayout.addView(view);
        this.f8831A = view;
    }

    /* renamed from: a */
    public void mo1630a() {
        super.mo1630a();
        this.f8842v.setBackgroundResource(this.e.mo1826g());
        this.f8843w.setBackgroundResource(this.e.mo1826g());
        if (this.f8839a != null) {
            this.f8839a.setTextColor(m12158a(this.e.mo1824e()));
        }
        if (this.f8840b != null) {
            this.f8840b.setTextColor(m12158a(this.e.mo1824e()));
        }
        if (this.f8844x != null) {
            this.f8844x.setTextColor(-1);
            this.f8844x.setBackgroundResource(this.e.mo1829j());
        }
    }
}
