package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;

/* compiled from: UploadSectionListAdapter */
/* renamed from: cgw */
public class cgw extends csb<cay> {
    public cgw(crw<cay> crw, cse<cay> cse) {
        super(crw, cse);
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.id.upload_no_section) {
            return b().a(viewGroup, i);
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        cgy cgy = (cgy) b();
        if (getItemViewType(i) == R.id.upload_no_section) {
            cgy.m13160a(true);
            b().a(c0605t, i, null);
            return;
        }
        cgy.m13160a(false);
        super.onBindViewHolder(c0605t, i);
    }

    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    /* renamed from: a */
    public int m13133a(int i) {
        return super.a(i);
    }

    /* renamed from: b */
    public int m13134b(int i) {
        return super.b(i);
    }

    public int getItemViewType(int i) {
        if (this.e) {
            int itemCount = getItemCount();
            if (i + 1 == itemCount) {
                return d;
            }
            if (i + 2 == itemCount) {
                return R.id.upload_no_section;
            }
        } else if (i + 1 == getItemCount()) {
            return R.id.upload_no_section;
        }
        return c;
    }
}
