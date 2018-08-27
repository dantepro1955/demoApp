package com.p000;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* compiled from: CursorFilter */
/* renamed from: lg */
class lg extends Filter {
    /* renamed from: a */
    C5508a f24405a;

    /* compiled from: CursorFilter */
    /* renamed from: lg$a */
    interface C5508a {
        /* renamed from: a */
        Cursor mo5140a();

        /* renamed from: a */
        Cursor mo5141a(CharSequence charSequence);

        /* renamed from: a */
        void mo5142a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo5143c(Cursor cursor);
    }

    lg(C5508a c5508a) {
        this.f24405a = c5508a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f24405a.mo5143c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f24405a.mo5141a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f24405a.mo5140a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f24405a.mo5142a((Cursor) filterResults.values);
        }
    }
}
