package com.p000;

import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper */
/* renamed from: lm */
public class lm extends kz {
    /* renamed from: f */
    private final ListView f24407f;

    public lm(ListView listView) {
        super(listView);
        this.f24407f = listView;
    }

    /* renamed from: a */
    public void mo5153a(int i, int i2) {
        ln.m32443a(this.f24407f, i2);
    }

    /* renamed from: e */
    public boolean mo5154e(int i) {
        return false;
    }

    /* renamed from: f */
    public boolean mo5155f(int i) {
        ListView listView = this.f24407f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
