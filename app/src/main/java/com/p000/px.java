package com.p000;

import android.support.v7.widget.RecyclerView.C0602q;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;

/* compiled from: ScrollbarHelper */
/* renamed from: px */
public class px {
    /* renamed from: a */
    public static int m33739a(C0602q c0602q, pr prVar, View view, View view2, LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.getChildCount() == 0 || c0602q.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max;
        int min = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int max2 = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z2) {
            max = Math.max(0, (c0602q.e() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(prVar.mo5437b(view2) - prVar.mo5435a(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)))) + ((float) (prVar.mo5438c() - prVar.mo5435a(view))));
    }

    /* renamed from: a */
    public static int m33738a(C0602q c0602q, pr prVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || c0602q.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(prVar.mo5444f(), prVar.mo5437b(view2) - prVar.mo5435a(view));
    }

    /* renamed from: b */
    public static int m33740b(C0602q c0602q, pr prVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || c0602q.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0602q.e();
        }
        return (int) ((((float) (prVar.mo5437b(view2) - prVar.mo5435a(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) * ((float) c0602q.e()));
    }
}
