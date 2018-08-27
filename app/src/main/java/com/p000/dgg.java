package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4499f;
import java.util.Collections;
import java.util.List;
import p000.dgc.C4890d;
import p000.dgc.C4891e;

/* compiled from: NotifAdapter */
/* renamed from: dgg */
public class dgg extends BaseAdapter {
    /* renamed from: a */
    private dgj f21552a = new dgh();
    /* renamed from: b */
    private List<dgf> f21553b;
    /* renamed from: c */
    private C4499f f21554c;

    /* compiled from: NotifAdapter */
    /* renamed from: dgg$a */
    public static class C4892a {
        /* renamed from: c */
        public View f21547c;
        /* renamed from: d */
        public TextView f21548d;
        /* renamed from: e */
        public TextView f21549e;
        /* renamed from: f */
        public UniversalImageView f21550f;
        /* renamed from: g */
        public UniversalImageView f21551g;

        public C4892a(View view) {
            this.f21547c = view.findViewById(C4890d.container);
            this.f21548d = djy.m27639a(view, C4890d.text);
            this.f21549e = djy.m27639a(view, C4890d.timeText);
            this.f21550f = (UniversalImageView) view.findViewById(C4890d.thumbLeftUIV);
            this.f21551g = (UniversalImageView) view.findViewById(C4890d.thumbRightUIV);
        }
    }

    public dgg(List<dgf> list) {
        this.f21553b = Collections.synchronizedList(list);
    }

    /* renamed from: a */
    public void m27179a(dgj dgj) {
        this.f21552a = dgj;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f21553b.size();
    }

    /* renamed from: a */
    public void m27178a(dgf dgf) {
        this.f21553b.add(dgf);
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C4892a a;
        dgf dgf = (dgf) this.f21553b.get(i);
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(m27173a(), null);
            a = m27174a(view);
            view.setTag(a);
        } else {
            a = (C4892a) view.getTag();
        }
        m27175a(viewGroup.getContext(), a, dgf);
        return view;
    }

    /* renamed from: a */
    protected C4892a m27174a(View view) {
        return new C4892a(view);
    }

    /* renamed from: a */
    protected int m27173a() {
        return C4891e.morpheus_notif_item;
    }

    /* renamed from: a */
    protected void m27175a(Context context, C4892a c4892a, dgf dgf) {
        if (c4892a != null && dgf != null) {
            c4892a.f21548d.setText(dgf.m27162a(context));
            c4892a.f21549e.setText(dgf.m27163b(context));
            if (c4892a.f21551g != null) {
                if (dgf.m27165g()) {
                    c4892a.f21551g.setVisibility(0);
                } else {
                    c4892a.f21551g.setVisibility(8);
                }
            }
            c4892a.f21547c.setOnClickListener(dgf.m27166h());
            m27176a(context, this.f21552a, c4892a, dgf);
        }
    }

    /* renamed from: a */
    protected void m27176a(Context context, dgj dgj, C4892a c4892a, dgf dgf) {
        c4892a.f21549e.setTextColor(m27172b(context, dgj.mo4401b()));
        if (dgf.m27167j()) {
            c4892a.f21548d.setTextColor(m27172b(context, dgj.mo4400a()));
            djy.m27640a(c4892a.f21547c, m27171a(context, dgj.mo4404e()));
        } else {
            c4892a.f21548d.setTextColor(m27172b(context, dgj.mo4406g()));
            djy.m27640a(c4892a.f21547c, m27171a(context, dgj.mo4405f()));
        }
        if (this.f21554c != null) {
            if (c4892a.f21550f != null) {
                c4892a.f21550f.m24151a(this.f21554c);
            }
            if (c4892a.f21551g != null) {
                c4892a.f21551g.m24151a(this.f21554c);
            }
        }
    }

    /* renamed from: a */
    private Drawable m27171a(Context context, int i) {
        return context.getResources().getDrawable(i);
    }

    /* renamed from: b */
    private int m27172b(Context context, int i) {
        return context.getResources().getColor(i);
    }

    /* renamed from: a */
    public void m27177a(C4499f c4499f) {
        this.f21554c = c4499f;
    }
}
