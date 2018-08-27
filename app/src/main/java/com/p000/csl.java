package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import p000.csa.C4551e;
import p000.csa.C4552f;

/* compiled from: SimpleRenderer */
/* renamed from: csl */
public class csl extends cse<csm> {
    /* renamed from: a */
    private OnClickListener f20088a = new C45551(this);

    /* compiled from: SimpleRenderer */
    /* renamed from: csl$1 */
    class C45551 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ csl f20086a;

        C45551(csl csl) {
            this.f20086a = csl;
        }

        public void onClick(View view) {
            view.getTag();
        }
    }

    /* compiled from: SimpleRenderer */
    /* renamed from: csl$a */
    static class C4556a extends C0605t {
        /* renamed from: a */
        TextView f20087a;

        public C4556a(View view) {
            super(view);
            this.f20087a = (TextView) view.findViewById(C4551e.nameLabel);
        }
    }

    /* renamed from: a */
    public C0605t mo4141a(ViewGroup viewGroup, int i) {
        return new C4556a(LayoutInflater.from(viewGroup.getContext()).inflate(C4552f.simple_renderer_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m24779a(C0605t c0605t, int i, csm csm) {
        C4556a c4556a = (C4556a) c0605t;
        c4556a.f20087a.setText(csm.m24780a());
        c4556a.f20087a.setTag(csm);
    }
}
