package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import p000.csa.C4547a;
import p000.csa.C4551e;
import p000.csy.C4559a;

/* compiled from: BlitzPlaceholderAdapter */
/* renamed from: csx */
public class csx extends css {
    /* renamed from: b */
    private boolean f20156b;
    /* renamed from: c */
    private C4565b f20157c;
    /* renamed from: d */
    private OnClickListener f20158d;

    /* compiled from: BlitzPlaceholderAdapter */
    /* renamed from: csx$a */
    public static class C4564a {
        /* renamed from: a */
        private String f20140a;
        /* renamed from: b */
        private String f20141b;
        /* renamed from: c */
        private int f20142c = -1;
        /* renamed from: d */
        private int f20143d = -1;
        /* renamed from: e */
        private csw f20144e;

        private C4564a() {
        }

        /* renamed from: a */
        public static C4564a m24828a() {
            return new C4564a();
        }

        /* renamed from: a */
        public C4564a m24829a(int i) {
            this.f20142c = i;
            return this;
        }

        /* renamed from: b */
        public C4564a m24831b(int i) {
            this.f20143d = i;
            return this;
        }

        /* renamed from: a */
        public C4564a m24830a(String str) {
            this.f20141b = str;
            return this;
        }

        /* renamed from: b */
        public csx m24832b() {
            csx csx = new csx();
            csx.f20157c = new C4565b();
            csx.f20157c.f20146b = this.f20140a;
            csx.f20157c.f20148d = this.f20142c;
            csx.f20157c.f20149e = this.f20143d;
            csx.f20157c.f20145a = this.f20144e;
            csx.f20157c.f20147c = this.f20141b;
            return csx;
        }
    }

    /* compiled from: BlitzPlaceholderAdapter */
    /* renamed from: csx$b */
    static class C4565b {
        /* renamed from: a */
        private csw f20145a;
        /* renamed from: b */
        private String f20146b;
        /* renamed from: c */
        private String f20147c;
        /* renamed from: d */
        private int f20148d;
        /* renamed from: e */
        private int f20149e;

        private C4565b() {
            this.f20148d = -1;
            this.f20149e = -1;
        }
    }

    /* compiled from: BlitzPlaceholderAdapter */
    /* renamed from: csx$c */
    static class C4566c implements OnClickListener {
        /* renamed from: a */
        private csw f20150a;

        C4566c(csw csw) {
            this.f20150a = csw;
        }

        public void onClick(View view) {
            int id = view.getId();
            if (this.f20150a != null) {
                if (id == C4551e.blitz_placeholder_action_button) {
                    this.f20150a.m24827a();
                } else if (id != C4551e.blitz_placeholder_text_label) {
                }
            }
        }
    }

    /* compiled from: BlitzPlaceholderAdapter */
    /* renamed from: csx$d */
    static class C4567d extends C4559a {
        /* renamed from: a */
        TextView f20151a;
        /* renamed from: b */
        TextView f20152b;
        /* renamed from: c */
        View f20153c;
        /* renamed from: d */
        ViewGroup f20154d;
        /* renamed from: e */
        Animation f20155e;

        public C4567d(View view) {
            super(view);
            this.f20155e = AnimationUtils.loadAnimation(view.getContext(), C4547a.blitz_infinite_fade_in_fade_out);
            this.f20153c = view.findViewById(C4551e.blitz_placeholder_empty_container);
            this.f20154d = (ViewGroup) view.findViewById(C4551e.blitz_placeholder_loading_container);
            this.f20151a = (TextView) view.findViewById(C4551e.blitz_placeholder_text_label);
            this.f20152b = (TextView) view.findViewById(C4551e.blitz_placeholder_action_button);
        }

        /* renamed from: a */
        public void m24843a(OnClickListener onClickListener, C4565b c4565b, boolean z) {
            if (this.f20151a != null) {
                this.f20151a.setText(c4565b.f20147c);
            }
            if (TextUtils.isEmpty(c4565b.f20146b)) {
                this.f20152b.setVisibility(8);
            } else {
                this.f20152b.setVisibility(0);
                this.f20152b.setText(c4565b.f20146b);
            }
            this.f20152b.setOnClickListener(onClickListener);
            if (z) {
                if (this.f20153c != null) {
                    this.f20153c.setVisibility(8);
                }
                if (this.f20154d != null) {
                    this.f20154d.setVisibility(0);
                    this.f20154d.startAnimation(this.f20155e);
                    return;
                }
                return;
            }
            if (this.f20153c != null) {
                this.f20153c.setVisibility(0);
            }
            if (this.f20154d != null) {
                this.f20154d.setVisibility(8);
                this.f20154d.clearAnimation();
            }
        }
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f20157c.f20148d == -1) {
            throw new IllegalArgumentException("Layout Id cannot be -1");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f20157c.f20148d, viewGroup, false);
        if (this.f20157c.f20149e != -1) {
            m24844a(inflate, this.f20157c);
        }
        this.f20158d = new C4566c(this.f20157c.f20145a);
        return new C4567d(inflate);
    }

    /* renamed from: a */
    public void mo4143a(C4559a c4559a, int i) {
        super.mo4143a(c4559a, i);
        ((C4567d) c4559a).m24843a(this.f20158d, this.f20157c, this.f20156b);
    }

    /* renamed from: a */
    private View m24844a(View view, C4565b c4565b) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C4551e.blitz_placeholder_loading_container);
        for (int i = 0; i < 5; i++) {
            viewGroup.addView(LayoutInflater.from(view.getContext()).inflate(c4565b.f20149e, viewGroup, false));
        }
        return viewGroup;
    }

    /* renamed from: a */
    public void m24848a(boolean z, boolean z2) {
        if (this.a != z || this.f20156b != z2) {
            this.a = z;
            this.f20156b = z2;
            notifyDataSetChanged();
        }
    }

    public int getItemViewType(int i) {
        return C4551e.blitz_view_type_placeholder_adapter;
    }
}
