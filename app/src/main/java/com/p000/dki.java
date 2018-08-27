package com.p000;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import p000.dnb.C4998a;
import p000.dnb.C5002e;
import p000.dnb.C5003f;

/* compiled from: HintManager */
/* renamed from: dki */
public class dki {
    /* renamed from: a */
    private Activity f21864a;
    /* renamed from: b */
    private int f21865b;
    /* renamed from: c */
    private int f21866c;
    /* renamed from: d */
    private float f21867d;
    /* renamed from: e */
    private long f21868e;

    /* compiled from: HintManager */
    /* renamed from: dki$a */
    public static class C4954a {
        /* renamed from: a */
        int f21860a = Color.argb(230, 60, InterstitialErrorStatus.EXPIRED, 85);
        /* renamed from: b */
        int f21861b = Color.argb(230, 255, 255, 255);
        /* renamed from: c */
        float f21862c = 16.0f;
        /* renamed from: d */
        long f21863d;

        /* renamed from: a */
        public C4954a m27697a(long j) {
            this.f21863d = j;
            return this;
        }

        /* renamed from: a */
        public dki m27698a(Activity activity) {
            return new dki(activity, this);
        }
    }

    private dki(Activity activity, C4954a c4954a) {
        this.f21864a = activity;
        this.f21865b = c4954a.f21860a;
        this.f21866c = c4954a.f21861b;
        this.f21867d = c4954a.f21862c;
        this.f21868e = c4954a.f21863d;
    }

    /* renamed from: a */
    public Activity m27699a() {
        return this.f21864a;
    }

    /* renamed from: a */
    public dkh m27701a(CharSequence charSequence, boolean z, dkj dkj) {
        return m27702a(charSequence, z, dkj, AnimationUtils.loadAnimation(this.f21864a, C4998a.slide_in_up_fade_in), AnimationUtils.loadAnimation(this.f21864a, C4998a.slide_out_down));
    }

    /* renamed from: a */
    public dkh m27702a(CharSequence charSequence, boolean z, final dkj dkj, Animation animation, Animation animation2) {
        final ViewGroup viewGroup = (ViewGroup) this.f21864a.findViewById(16908290);
        final View inflate = LayoutInflater.from(this.f21864a).inflate(C5003f.message_hint, viewGroup, false);
        View findViewById = inflate.findViewById(C5002e.container);
        TextView textView = (TextView) inflate.findViewById(C5002e.message);
        TextView textView2 = (TextView) inflate.findViewById(C5002e.close);
        findViewById.setBackgroundColor(this.f21865b);
        textView.setText(charSequence);
        textView.setTextSize(2, this.f21867d);
        textView.setTextColor(this.f21866c);
        textView2.setTextColor(this.f21866c);
        textView2.setTextSize(2, this.f21867d + 2.0f);
        textView2.setVisibility(z ? 0 : 8);
        final dkh dkh = new dkh(this.f21864a, inflate, animation2, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ dki f21851c;

            public void run() {
                viewGroup.addView(inflate);
            }
        }, this.f21868e);
        textView2.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ dki f21854c;

            public void onClick(View view) {
                dkh.m27695a();
                if (dkj != null) {
                    dkj.m27703a();
                }
            }
        });
        if (animation != null) {
            findViewById.startAnimation(animation);
        }
        return dkh;
    }

    /* renamed from: a */
    public dkg m27700a(Drawable drawable, Point point, Animation animation) {
        final ViewGroup viewGroup = (ViewGroup) this.f21864a.findViewById(16908290);
        final View inflate = LayoutInflater.from(this.f21864a).inflate(C5003f.drawable_hint, viewGroup, false);
        final ImageView imageView = (ImageView) inflate.findViewById(C5002e.image);
        LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
        layoutParams.leftMargin = point.x;
        layoutParams.topMargin = point.y;
        imageView.setImageDrawable(drawable);
        Runnable c49523 = new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ dki f21857c;

            public void run() {
                viewGroup.addView(inflate);
            }
        };
        if (animation != null) {
            animation.setAnimationListener(new AnimationListener(this) {
                /* renamed from: b */
                final /* synthetic */ dki f21859b;

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    imageView.startAnimation(animation);
                }

                public void onAnimationRepeat(Animation animation) {
                }
            });
            imageView.startAnimation(animation);
        }
        return new dkg(this.f21864a, inflate, c49523, this.f21868e);
    }
}
