package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.upload.SectionSelectedEvent;
import java.lang.ref.WeakReference;

/* compiled from: UploadSectionListFragmentModule */
/* renamed from: cgx */
public class cgx extends cry {
    /* renamed from: a */
    private cgy f9158a;
    /* renamed from: b */
    private cgz f9159b;
    /* renamed from: c */
    private Button f9160c;
    /* renamed from: d */
    private String f9161d;
    /* renamed from: e */
    private C1721a f9162e;

    /* compiled from: UploadSectionListFragmentModule */
    /* renamed from: cgx$1 */
    class C17201 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cgx f9154a;

        C17201(cgx cgx) {
            this.f9154a = cgx;
        }

        public void onClick(View view) {
            int a = cgy.m13149a();
            if (a == -1) {
                view.setEnabled(false);
                return;
            }
            String str = null;
            if (a < this.f9154a.C().size()) {
                str = ((cay) ((caw) this.f9154a.C()).get(this.f9154a.D().b(a))).m12212e();
            }
            dhe.a().c(new SectionSelectedEvent(str));
            chn.m13454t("STEP_2", "Otto section=" + str);
        }
    }

    /* compiled from: UploadSectionListFragmentModule */
    /* renamed from: cgx$a */
    public static class C1721a implements OnGlobalLayoutListener {
        /* renamed from: a */
        private String f9155a;
        /* renamed from: b */
        private WeakReference<cgz> f9156b;
        /* renamed from: c */
        private WeakReference<RecyclerView> f9157c;

        public C1721a(String str, cgz cgz, RecyclerView recyclerView) {
            this.f9155a = str;
            this.f9156b = new WeakReference(cgz);
            this.f9157c = new WeakReference(recyclerView);
        }

        public void onGlobalLayout() {
            if (this.f9155a != null && this.f9156b.get() != null && this.f9157c.get() != null) {
                int size = ((cgz) this.f9156b.get()).size();
                for (int i = 0; i < size; i++) {
                    if (this.f9155a.equals(((cay) ((cgz) this.f9156b.get()).get(i)).m12210c())) {
                        C0605t findViewHolderForAdapterPosition = ((RecyclerView) this.f9157c.get()).findViewHolderForAdapterPosition(((csb) ((RecyclerView) this.f9157c.get()).getAdapter()).a(i));
                        if (findViewHolderForAdapterPosition != null) {
                            findViewHolderForAdapterPosition.itemView.performClick();
                        }
                    }
                }
            }
        }
    }

    public cgx(String str) {
        this.f9161d = str;
    }

    /* renamed from: a */
    protected void m13144a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    protected LinearLayoutManager m13139a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: a */
    protected crw m13142a() {
        this.f9159b = new cgz();
        return this.f9159b;
    }

    /* renamed from: b */
    protected cse m13146b() {
        this.f9158a = new cgy();
        return this.f9158a;
    }

    /* renamed from: a */
    protected csb m13143a(crw crw, cse cse) {
        return new cgw(crw, cse);
    }

    /* renamed from: c */
    public void m13147c() {
        super.c();
        dhe.a("exploreList", C());
        y();
        this.f9162e = new C1721a(this.f9161d, (cgz) C(), G());
        G().getViewTreeObserver().addOnGlobalLayoutListener(this.f9162e);
    }

    /* renamed from: e */
    public void m13148e() {
        dhe.b("exploreList", C());
        super.e();
    }

    /* renamed from: a */
    public View m13141a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        m13136a(a);
        return a;
    }

    /* renamed from: a */
    protected View m13140a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_select_section_list, null);
    }

    /* renamed from: a */
    private void m13136a(View view) {
        this.f9160c = (Button) view.findViewById(R.id.btn_post);
        this.f9160c.setOnClickListener(new C17201(this));
    }

    /* renamed from: a */
    public void m13145a(boolean z, boolean z2) {
        super.a(z, z2);
        cgy.m13153b();
        this.f9160c.setEnabled(cgy.m13149a() != -1);
    }
}
