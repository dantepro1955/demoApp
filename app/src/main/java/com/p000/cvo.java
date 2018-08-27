package com.p000;

import android.support.v4.view.ViewPager.C0370e;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;

/* compiled from: HomePostListAdapter */
/* renamed from: cvo */
public class cvo extends cvh {
    /* renamed from: a */
    private cvn f20322a;

    public cvo(crw<cvl> crw, cse<cvl> cse, cvm cvm, C0370e c0370e) {
        super(crw, cse);
        this.f20322a = new cvn(cvm, c0370e);
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case R.id.tv_featured_row:
                return this.f20322a.m25086a(viewGroup, i);
            default:
                return super.onCreateViewHolder(viewGroup, i);
        }
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        switch (getItemViewType(i)) {
            case R.id.tv_featured_row:
                this.f20322a.m25088a(c0605t, i);
                break;
        }
        super.onBindViewHolder(c0605t, i);
    }

    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return R.id.tv_featured_row;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: b */
    public int mo4164b(int i) {
        return i - 1;
    }

    /* renamed from: c */
    public void m25091c() {
        this.f20322a.m25087a();
    }

    /* renamed from: d */
    public void m25092d() {
        this.f20322a.m25089b();
    }
}
