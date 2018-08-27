package com.p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import p000.dhz.C4916a;
import p000.dhz.C4917b;

/* compiled from: ActionAdapter */
/* renamed from: dhw */
public class dhw extends BaseAdapter {
    /* renamed from: a */
    private ArrayList<dhx> f21673a = new ArrayList();
    /* renamed from: b */
    private int f21674b = -1;
    /* renamed from: c */
    private boolean f21675c;

    /* compiled from: ActionAdapter */
    /* renamed from: dhw$a */
    static class C4915a {
        /* renamed from: a */
        TextView f21671a;
        /* renamed from: b */
        ImageView f21672b;

        private C4915a() {
        }
    }

    /* renamed from: a */
    public void m27337a(dhx dhx) {
        this.f21673a.add(dhx);
    }

    /* renamed from: a */
    public void m27334a() {
        this.f21675c = true;
    }

    /* renamed from: b */
    public void m27339b() {
        this.f21675c = false;
    }

    /* renamed from: a */
    public void m27335a(int i) {
        this.f21674b = i;
    }

    /* renamed from: c */
    public boolean m27340c() {
        return this.f21673a.size() > this.f21674b;
    }

    public int getCount() {
        if (!this.f21675c || this.f21674b <= 0 || this.f21674b >= this.f21673a.size()) {
            return this.f21673a.size();
        }
        return this.f21674b;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C4915a c4915a;
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4917b.ss_action_item, null);
            c4915a = new C4915a();
            c4915a.f21671a = (TextView) view.findViewById(C4916a.ss_action_item_text);
            c4915a.f21672b = (ImageView) view.findViewById(C4916a.ss_action_item_icon);
            view.setTag(c4915a);
        } else {
            c4915a = (C4915a) view.getTag();
        }
        dhx dhx = (dhx) this.f21673a.get(i);
        c4915a.f21671a.setText(dhx.m27345b());
        c4915a.f21672b.setImageDrawable(dhx.m27347c());
        return view;
    }

    /* renamed from: a */
    public void m27336a(Context context, int i) {
        ((dhx) this.f21673a.get(i)).mo4415a(context);
    }

    /* renamed from: b */
    public String m27338b(int i) {
        if (i >= this.f21673a.size()) {
            return "";
        }
        return ((dhx) this.f21673a.get(i)).mo4414a();
    }
}
