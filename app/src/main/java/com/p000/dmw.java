package com.p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import com.under9.android.remoteconfig.api.model.ApiBroadcastInfo;
import p000.dmi.C4985a;
import p000.dmi.C4986b;
import p000.dmi.C4987c;

/* compiled from: PosterUI */
/* renamed from: dmw */
public abstract class dmw {
    /* renamed from: a */
    private int f22282a;
    /* renamed from: b */
    private String f22283b;
    /* renamed from: c */
    private String f22284c;
    /* renamed from: d */
    private String f22285d;
    /* renamed from: e */
    private String f22286e;
    /* renamed from: f */
    private Integer f22287f;
    /* renamed from: g */
    private Integer f22288g;
    /* renamed from: h */
    private C4997b f22289h;
    /* renamed from: i */
    private C4517a f22290i;
    /* renamed from: j */
    private boolean f22291j = false;

    /* compiled from: PosterUI */
    /* renamed from: dmw$a */
    public interface C4517a {
        /* renamed from: a */
        void mo4098a();
    }

    /* compiled from: PosterUI */
    /* renamed from: dmw$1 */
    class C49951 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dmw f22278a;

        C49951(dmw dmw) {
            this.f22278a = dmw;
        }

        public void run() {
            this.f22278a.m28127b();
        }
    }

    /* compiled from: PosterUI */
    /* renamed from: dmw$b */
    public interface C4997b {
        /* renamed from: a */
        void m28119a();

        /* renamed from: b */
        void m28120b();
    }

    /* renamed from: a */
    public abstract void m28126a(ImageView imageView, String str);

    public dmw(ApiBroadcast apiBroadcast, C4997b c4997b) {
        if (apiBroadcast != null && apiBroadcast.full_screen != null) {
            ApiBroadcastInfo apiBroadcastInfo = apiBroadcast.full_screen;
            this.f22283b = apiBroadcastInfo.imageUrl;
            this.f22284c = apiBroadcastInfo.actionText1;
            this.f22285d = apiBroadcastInfo.actionText2;
            this.f22286e = apiBroadcastInfo.buttonText;
            this.f22282a = apiBroadcastInfo.dismissAfterTime;
            this.f22289h = c4997b;
            if (TextUtils.isEmpty(apiBroadcastInfo.backgroundColor)) {
                this.f22287f = null;
            } else {
                this.f22287f = Integer.valueOf(Color.parseColor(apiBroadcastInfo.backgroundColor));
            }
            if (TextUtils.isEmpty(apiBroadcastInfo.fontColor)) {
                this.f22288g = null;
            } else {
                this.f22288g = Integer.valueOf(Color.parseColor(apiBroadcastInfo.fontColor));
            }
        }
    }

    /* renamed from: a */
    public View m28125a(Context context, C4517a c4517a) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(m28123a(), null);
        m28121a(inflate, this.f22289h, c4517a);
        if (this.f22282a != 0) {
            inflate.postDelayed(new C49951(this), (long) (this.f22282a * 1000));
        }
        return inflate;
    }

    /* renamed from: a */
    public int m28123a() {
        return C4987c.rc_broadcast_poster;
    }

    /* renamed from: a */
    private void m28121a(View view, C4997b c4997b, C4517a c4517a) {
        this.f22290i = c4517a;
        View a = dka.m27651a(view, C4986b.poster_content);
        ImageView c = dka.m27654c(view, C4986b.poster_image);
        TextView b = dka.m27653b(view, C4986b.poster_text1);
        TextView b2 = dka.m27653b(view, C4986b.poster_text2);
        Button d = dka.m27655d(view, C4986b.poster_button);
        ImageButton f = dka.m27657f(view, C4986b.poster_close);
        m28126a(c, this.f22283b);
        b.setText(this.f22284c);
        b2.setText(this.f22285d);
        if (TextUtils.isEmpty(this.f22286e)) {
            d.setVisibility(8);
        } else {
            d.setVisibility(0);
            d.setText(this.f22286e);
        }
        if (this.f22288g != null) {
            d.setTextColor(this.f22288g.intValue());
        } else {
            d.setTextColor(-1);
        }
        Drawable background = d.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            if (this.f22287f != null) {
                ((GradientDrawable) background).setColor(this.f22287f.intValue());
            } else {
                ((GradientDrawable) background).setColor(view.getResources().getColor(C4985a.rc_button_color));
            }
        }
        OnClickListener a2 = m28124a(c4997b, c4517a);
        d.setOnClickListener(a2);
        a.setOnClickListener(a2);
        f.setOnClickListener(a2);
    }

    /* renamed from: b */
    public void m28127b() {
        if (this.f22290i != null) {
            this.f22290i.mo4098a();
            this.f22290i = null;
        }
    }

    /* renamed from: c */
    public void m28128c() {
        if (!this.f22291j && this.f22289h != null) {
            this.f22291j = true;
            this.f22289h.m28120b();
        }
    }

    /* renamed from: a */
    public OnClickListener m28124a(final C4997b c4997b, final C4517a c4517a) {
        return new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ dmw f22281c;

            public void onClick(View view) {
                int id = view.getId();
                if (id == C4986b.poster_button || id == C4986b.poster_content) {
                    if (c4997b != null) {
                        c4997b.m28119a();
                    }
                    this.f22281c.f22291j = true;
                    if (c4517a != null) {
                        c4517a.mo4098a();
                    }
                } else if (id == C4986b.poster_close && c4517a != null) {
                    c4517a.mo4098a();
                }
            }
        };
    }
}
