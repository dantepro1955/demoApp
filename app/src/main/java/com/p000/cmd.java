package com.p000;

import android.content.Context;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;

/* compiled from: CopyLinkActionItem */
/* renamed from: cmd */
public class cmd extends dic {
    /* renamed from: a */
    private String f9723a;
    /* renamed from: b */
    private cct f9724b;

    public cmd(Context context, String str, cct cct) {
        super(context, R.string.ss_action_copy_link, R.drawable.ss_ic_copy_link);
        this.f9723a = str;
        this.f9724b = cct;
    }

    /* renamed from: a */
    public void m14454a(Context context) {
        dhe.c(this.f9723a, new GagPostCopyLinkEvent(this.f9724b));
    }

    /* renamed from: a */
    public String m14453a() {
        return "__copy_link__";
    }
}
