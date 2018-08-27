package com.p000;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import com.under9.android.remoteconfig.api.model.ApiBroadcastInfo;
import p000.dmi.C4985a;
import p000.dmi.C4986b;
import p000.dmi.C4987c;

/* compiled from: BannerUI */
/* renamed from: dmu */
public abstract class dmu {
    /* renamed from: a */
    ApiBroadcast f22267a;
    /* renamed from: b */
    Integer f22268b;
    /* renamed from: c */
    Integer f22269c;
    /* renamed from: d */
    String f22270d;
    /* renamed from: e */
    String f22271e;
    /* renamed from: f */
    C4993a f22272f;
    /* renamed from: g */
    int f22273g;
    /* renamed from: h */
    OnClickListener f22274h = new C49922(this);

    /* compiled from: BannerUI */
    /* renamed from: dmu$1 */
    class C49911 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dmu f22265a;

        C49911(dmu dmu) {
            this.f22265a = dmu;
        }

        public void run() {
            this.f22265a.m28113b();
        }
    }

    /* compiled from: BannerUI */
    /* renamed from: dmu$2 */
    class C49922 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ dmu f22266a;

        C49922(dmu dmu) {
            this.f22266a = dmu;
        }

        public void onClick(View view) {
            if (view.getId() == C4986b.banner_close) {
                if (this.f22266a.f22272f != null) {
                    this.f22266a.f22272f.m28107a();
                }
            } else if (this.f22266a.f22272f != null) {
                this.f22266a.f22272f.m28108b();
            }
        }
    }

    /* compiled from: BannerUI */
    /* renamed from: dmu$a */
    public interface C4993a {
        /* renamed from: a */
        void m28107a();

        /* renamed from: b */
        void m28108b();
    }

    /* renamed from: a */
    public abstract void m28112a(ImageView imageView, String str);

    public dmu(ApiBroadcast apiBroadcast, C4993a c4993a) {
        this.f22267a = apiBroadcast;
        this.f22272f = c4993a;
        this.f22268b = Integer.valueOf(-1);
        this.f22269c = Integer.valueOf(-1);
        if (apiBroadcast != null && apiBroadcast.banner != null) {
            ApiBroadcastInfo apiBroadcastInfo = apiBroadcast.banner;
            this.f22273g = apiBroadcastInfo.dismissAfterTime;
            if (TextUtils.isEmpty(apiBroadcastInfo.backgroundColor)) {
                this.f22268b = null;
            } else {
                this.f22268b = Integer.valueOf(Color.parseColor(apiBroadcastInfo.backgroundColor));
            }
            if (TextUtils.isEmpty(apiBroadcastInfo.fontColor)) {
                this.f22269c = null;
            } else {
                this.f22269c = Integer.valueOf(Color.parseColor(apiBroadcastInfo.fontColor));
            }
            this.f22270d = apiBroadcast.banner.actionText1;
            this.f22271e = apiBroadcast.banner.imageUrl;
        }
    }

    /* renamed from: a */
    public View m28111a(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(m28110a(), null);
        m28109a(inflate);
        if (this.f22273g != 0) {
            inflate.postDelayed(new C49911(this), (long) (this.f22273g * 1000));
        }
        return inflate;
    }

    /* renamed from: a */
    public int m28110a() {
        return C4987c.rc_broadcast_banner;
    }

    /* renamed from: a */
    private void m28109a(View view) {
        ImageView c = dka.m27654c(view, C4986b.banner_icon);
        TextView b = dka.m27653b(view, C4986b.banner_text);
        ImageButton f = dka.m27657f(view, C4986b.banner_close);
        m28112a(c, this.f22271e);
        b.setText(this.f22270d);
        view.setOnClickListener(this.f22274h);
        f.setOnClickListener(this.f22274h);
        if (this.f22268b != null) {
            view.setBackgroundColor(this.f22268b.intValue());
        } else {
            view.setBackgroundColor(view.getResources().getColor(C4985a.rc_banner_background_color));
        }
        if (this.f22269c != null) {
            b.setTextColor(this.f22269c.intValue());
        } else {
            b.setTextColor(-1);
        }
    }

    /* renamed from: b */
    public void m28113b() {
        if (this.f22272f != null) {
            this.f22272f.m28107a();
        }
    }
}
