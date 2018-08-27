package com.p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import p000.dff.C4867a;
import p000.dff.C4868b;

/* compiled from: EmailAdapter */
/* renamed from: dfl */
public class dfl extends BaseAdapter {
    /* renamed from: a */
    ArrayList<String> f21496a;

    public /* synthetic */ Object getItem(int i) {
        return m27019a(i);
    }

    public dfl(ArrayList<String> arrayList) {
        this.f21496a = arrayList;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4868b.feedback_spinner_row, null);
        }
        TextView a = djy.m27639a(view, C4867a.beforeText);
        a.setText("From: ");
        a.setVisibility(0);
        djy.m27639a(view, C4867a.primaryText).setText((CharSequence) this.f21496a.get(i));
        return view;
    }

    public int getCount() {
        return this.f21496a.size();
    }

    /* renamed from: a */
    public String m27019a(int i) {
        return (String) this.f21496a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4868b.feedback_spinner_row, null);
        }
        TextView a = djy.m27639a(view, C4867a.beforeText);
        a.setText("From: ");
        a.setVisibility(0);
        djy.m27639a(view, C4867a.primaryText).setText((CharSequence) this.f21496a.get(i));
        return view;
    }
}
