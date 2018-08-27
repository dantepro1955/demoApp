package com.p000;

import android.content.Context;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;

/* compiled from: SaveImageActionItem */
/* renamed from: cmf */
public class cmf extends dic {
    /* renamed from: a */
    private String f9727a;
    /* renamed from: b */
    private cct f9728b;

    public cmf(Context context, String str, cct cct) {
        super(context, R.string.ss_action_save, R.drawable.ss_ic_save);
        this.f9727a = str;
        this.f9728b = cct;
    }

    /* renamed from: a */
    public void m14458a(Context context) {
        dhe.c(this.f9727a, new GagPostSaveEvent(this.f9728b));
    }

    /* renamed from: a */
    public String m14457a() {
        return "__save__";
    }
}
