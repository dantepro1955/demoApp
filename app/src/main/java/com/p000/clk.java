package com.p000;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.noti.NotiUserClickEvent;
import com.ninegag.android.app.otto.noti.NotifItemClickEvent;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import java.util.List;
import p000.dgg.C4892a;
import p000.dlm.C4972a;

/* compiled from: GagNotifAdapter */
/* renamed from: clk */
public class clk extends dgg {
    /* renamed from: a */
    private boolean f9668a = false;
    /* renamed from: b */
    private ProgressBar f9669b;
    /* renamed from: c */
    private C4060c f9670c = new C17541(this);
    /* renamed from: d */
    private C4060c f9671d = new C17552(this);

    /* compiled from: GagNotifAdapter */
    /* renamed from: clk$1 */
    class C17541 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ clk f9664a;

        C17541(clk clk) {
            this.f9664a = clk;
        }

        /* renamed from: a */
        public void m14296a(View view, dlm dlm, UniversalImageView universalImageView) {
            dhe.a().c(new NotifItemClickEvent((clp) universalImageView.getTag(R.id.notif_thumbnail_right)));
        }
    }

    /* compiled from: GagNotifAdapter */
    /* renamed from: clk$2 */
    class C17552 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ clk f9665a;

        C17552(clk clk) {
            this.f9665a = clk;
        }

        /* renamed from: a */
        public void m14297a(View view, dlm dlm, UniversalImageView universalImageView) {
            clp clp = (clp) universalImageView.getTag(R.id.notif_thumbnail_left);
            String k = clp.m14338k();
            if (!clp.m14338k().isEmpty()) {
                dhe.a().c(new NotiUserClickEvent(k));
            }
        }
    }

    /* compiled from: GagNotifAdapter */
    /* renamed from: clk$a */
    public static class C1756a extends C4892a {
        /* renamed from: a */
        public UniversalImageView f9666a;
        /* renamed from: b */
        public UniversalImageView f9667b;

        public C1756a(View view) {
            super(view);
            this.f9666a = (UniversalImageView) view.findViewById(R.id.thumbLeftUIV);
            this.f9667b = (UniversalImageView) view.findViewById(R.id.thumbRightUIV);
        }
    }

    public clk(List<dgf> list) {
        super(list);
    }

    /* renamed from: a */
    public void m14302a(boolean z) {
        this.f9668a = z;
    }

    public int getViewTypeCount() {
        return super.getViewTypeCount() + 1;
    }

    public int getItemViewType(int i) {
        if (!this.f9668a || i + 1 < getCount()) {
            return super.getItemViewType(i) + 1;
        }
        return 0;
    }

    public int getCount() {
        return (this.f9668a ? 1 : 0) + super.getCount();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) != 0) {
            int count = getCount();
            if (i >= count) {
                return super.getView(count - 1, view, viewGroup);
            }
            return super.getView(i, view, viewGroup);
        } else if (view != null) {
            return view;
        } else {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.post_item_pending, null);
            this.f9669b = (ProgressBar) view.findViewById(R.id.throbber);
            return view;
        }
    }

    /* renamed from: a */
    protected C4892a m14299a(View view) {
        return new C1756a(view);
    }

    /* renamed from: a */
    protected void m14300a(Context context, C4892a c4892a, dgf dgf) {
        super.a(context, c4892a, dgf);
        C1756a c1756a = (C1756a) c4892a;
        dgf tag = c1756a.f9666a.getTag(R.id.notif_thumbnail_left);
        dgf tag2 = c1756a.f9667b.getTag(R.id.notif_thumbnail_right);
        if (dgf.g()) {
            c1756a.f9667b.setVisibility(0);
            if (tag2 != dgf) {
                c1756a.f9667b.setAdapter(new C4972a().a(dgf.m(), 128, 128).a(3.0f).h(true).a(this.f9670c).b());
                c1756a.f9667b.setTag(R.id.notif_thumbnail_right, dgf);
            }
        } else {
            c1756a.f9667b.setVisibility(8);
        }
        if (dgf.p()) {
            c1756a.f9666a.setVisibility(0);
            if (tag != dgf) {
                c1756a.f9666a.setAdapter(new C4972a().a(dgf.l(), 128, 128).h(true).a(3.0f).a(this.f9671d).b());
            }
            c1756a.f9666a.setTag(R.id.notif_thumbnail_left, dgf);
            return;
        }
        c1756a.f9666a.setVisibility(8);
    }

    /* renamed from: a */
    protected int m14298a() {
        return R.layout.morpheus_notif_item;
    }

    /* renamed from: a */
    protected void m14301a(Context context, dgj dgj, C4892a c4892a, dgf dgf) {
        super.a(context, dgj, c4892a, dgf);
        if (cll.m14303a(dgf.c(context))) {
            c4892a.f21550f.setBackgroundColor(-1);
        } else {
            c4892a.f21550f.setBackgroundColor(-5329234);
        }
        c4892a.f21548d.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
