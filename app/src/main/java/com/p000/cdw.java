package com.p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0590g;
import android.support.v7.widget.RecyclerView.C0602q;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.imagepipeline.common.Priority;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.featured.FeaturedPostClickEvent;
import com.ninegag.android.tv.ui.CustomRatioLinearLayout;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import p000.dlm.C4972a;

/* compiled from: FeaturedListVerticalRenderer */
/* renamed from: cdw */
public class cdw extends cse<cru> {
    /* renamed from: a */
    private caf f8852a = caf.m12046a();
    /* renamed from: b */
    private com f8853b;
    /* renamed from: c */
    private C4060c f8854c = new C16851(this);
    /* renamed from: d */
    private OnClickListener f8855d = new C16862(this);

    /* compiled from: FeaturedListVerticalRenderer */
    /* renamed from: cdw$1 */
    class C16851 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ cdw f8848a;

        C16851(cdw cdw) {
            this.f8848a = cdw;
        }

        /* renamed from: a */
        public void m12695a(View view, dlm dlm, UniversalImageView universalImageView) {
            if (this.f8848a.f8855d != null) {
                this.f8848a.f8855d.onClick(universalImageView);
            }
        }
    }

    /* compiled from: FeaturedListVerticalRenderer */
    /* renamed from: cdw$2 */
    class C16862 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cdw f8849a;

        C16862(cdw cdw) {
            this.f8849a = cdw;
        }

        public void onClick(View view) {
            this.f8849a.f8852a.m12054a(new FeaturedPostClickEvent(((cru) view.getTag()).a()));
        }
    }

    /* compiled from: FeaturedListVerticalRenderer */
    /* renamed from: cdw$a */
    public static class C1687a extends C0590g {
        /* renamed from: a */
        private int f8850a;
        /* renamed from: b */
        private int f8851b;

        public C1687a(int i) {
            this.f8850a = i;
            this.f8851b = i;
        }

        /* renamed from: a */
        public void mo1677a(Rect rect, View view, RecyclerView recyclerView, C0602q c0602q) {
            rect.left = this.f8850a;
            rect.top = this.f8851b;
            rect.right = this.f8850a;
            if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1) {
                rect.bottom = this.f8851b;
            }
        }
    }

    public cdw(com com) {
        this.f8853b = com;
    }

    /* renamed from: a */
    public C0605t m12699a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.featured_item, viewGroup, false);
        ((CustomRatioLinearLayout) inflate).setDimension(16, 9);
        C0605t cbb = new cbb(inflate, this.f8853b.f16683a);
        inflate.setTag(cbb);
        return cbb;
    }

    /* renamed from: a */
    public void m12700a(C0605t c0605t, int i, cru cru) {
        cbb cbb = (cbb) c0605t;
        cbb.f8577d.setTag(cru);
        cbb.f8574a.setText(cru.b());
        CharSequence a = cru.a(cbb.itemView.getContext());
        if (a != null) {
            cbb.f8575b.setVisibility(0);
            cbb.f8575b.setText(a);
        } else {
            cbb.f8575b.setVisibility(8);
            cbb.f8575b.setText(null);
        }
        dlm b = new C4972a().a(3.0f).a(Priority.LOW).a(cru.c(), 640, 360).a(this.f8854c).a(this.f8852a.m12090t()).b();
        cbb.f8576c.setTag(cru);
        cbb.f8576c.setAdapter(b);
    }
}
