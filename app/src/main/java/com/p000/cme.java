package com.p000;

import android.content.Context;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;

/* compiled from: SaveGifActionItem */
/* renamed from: cme */
public class cme extends dic {
    /* renamed from: a */
    private String f9725a;
    /* renamed from: b */
    private cct f9726b;

    public cme(Context context, String str, cct cct) {
        super(context, R.string.ss_action_save, R.drawable.ss_ic_save);
        this.f9725a = str;
        this.f9726b = cct;
    }

    /* renamed from: a */
    public void m14456a(Context context) {
        dhe.c(this.f9725a, new GagPostSaveEvent(this.f9726b));
    }

    /* renamed from: a */
    public String m14455a() {
        return "__save__";
    }
}
