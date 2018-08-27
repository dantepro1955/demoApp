package com.p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.under9.android.feedback.model.ReportType;
import java.util.ArrayList;
import p000.dff.C4867a;
import p000.dff.C4868b;

/* compiled from: ReportTypesAdapter */
/* renamed from: dfm */
public class dfm extends BaseAdapter {
    /* renamed from: a */
    ArrayList<ReportType> f21497a;

    public /* synthetic */ Object getItem(int i) {
        return m27020a(i);
    }

    public dfm(ArrayList<ReportType> arrayList) {
        this.f21497a = arrayList;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4868b.feedback_spinner_row, null);
        }
        ((TextView) view.findViewById(C4867a.primaryText)).setText(((ReportType) this.f21497a.get(i)).label);
        return view;
    }

    public int getCount() {
        return this.f21497a.size();
    }

    /* renamed from: a */
    public ReportType m27020a(int i) {
        return (ReportType) this.f21497a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4868b.feedback_spinner_row, null);
        }
        ((TextView) view.findViewById(C4867a.primaryText)).setText(((ReportType) this.f21497a.get(i)).label);
        return view;
    }
}
