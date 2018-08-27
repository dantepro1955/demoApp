package com.p000;

import android.content.Context;
import com.ninegag.android.app.R;
import p000.csx.C4564a;

/* compiled from: GagPostListPlaceholderAdapterCreator */
/* renamed from: cfu */
public class cfu {
    /* renamed from: a */
    private Context f9094a;

    public cfu(Context context) {
        this.f9094a = context;
    }

    /* renamed from: a */
    public csy m13010a() {
        return C4564a.a().a(this.f9094a.getString(R.string.post_list_empty_list_text)).a(R.layout.placeholder_list_v2).b(R.layout.gag_post_list_placeholder_item).b();
    }
}
