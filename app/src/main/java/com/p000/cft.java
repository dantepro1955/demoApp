package com.p000;

import com.ninegag.android.app.component.postlist2.GagPostListFragmentV2;

/* renamed from: cft */
public final /* synthetic */ class cft implements Runnable {
    /* renamed from: a */
    private final GagPostListFragmentV2 f9093a;

    private cft(GagPostListFragmentV2 gagPostListFragmentV2) {
        this.f9093a = gagPostListFragmentV2;
    }

    /* renamed from: a */
    public static Runnable m13009a(GagPostListFragmentV2 gagPostListFragmentV2) {
        return new cft(gagPostListFragmentV2);
    }

    public void run() {
        GagPostListFragmentV2.f(this.f9093a);
    }
}
