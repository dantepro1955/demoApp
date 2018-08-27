package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.ListView;

@TargetApi(9)
/* compiled from: ListViewCompatGingerbread */
/* renamed from: lo */
class lo {
    /* renamed from: a */
    static void m32444a(ListView listView, int i) {
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        }
    }
}
