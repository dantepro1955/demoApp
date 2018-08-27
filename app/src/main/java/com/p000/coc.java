package com.p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.lang.ref.WeakReference;

/* compiled from: CommentItemClickListener */
/* renamed from: coc */
public class coc implements OnItemClickListener {
    /* renamed from: a */
    private WeakReference<ListView> f9908a;
    /* renamed from: b */
    private WeakReference<dei> f9909b;

    public coc(ListView listView, dei dei) {
        this.f9909b = new WeakReference(dei);
        this.f9908a = new WeakReference(listView);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f9908a.get() != null && this.f9909b.get() != null) {
            ((ListView) this.f9908a.get()).requestFocus();
            dej dej = (dej) this.f9909b.get();
            dej.D();
            dej.J();
        }
    }
}
