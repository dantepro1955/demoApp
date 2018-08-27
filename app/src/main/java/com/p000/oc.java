package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: MenuPopup */
/* renamed from: oc */
abstract class oc implements OnItemClickListener, oe, oi {
    /* renamed from: a */
    private Rect f24805a;

    /* renamed from: a */
    public abstract void mo5265a(int i);

    /* renamed from: a */
    public abstract void mo5267a(View view);

    /* renamed from: a */
    public abstract void mo5268a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo5269a(nx nxVar);

    /* renamed from: b */
    public abstract void mo5270b(int i);

    /* renamed from: b */
    public abstract void mo5271b(boolean z);

    /* renamed from: c */
    public abstract void mo5273c(int i);

    /* renamed from: c */
    public abstract void mo5274c(boolean z);

    oc() {
    }

    /* renamed from: a */
    public void m33064a(Rect rect) {
        this.f24805a = rect;
    }

    /* renamed from: i */
    public Rect m33076i() {
        return this.f24805a;
    }

    /* renamed from: a */
    public void mo5254a(Context context, nx nxVar) {
    }

    /* renamed from: a */
    public boolean mo5259a(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo5262b(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public int mo5261b() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        oc.m33060a(listAdapter).f24844b.m33153a((MenuItem) listAdapter.getItem(i), (oe) this, mo5279h() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m33059a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    /* renamed from: a */
    protected static nw m33060a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (nw) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (nw) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m33061b(nx nxVar) {
        int size = nxVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = nxVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    protected boolean mo5279h() {
        return true;
    }
}
