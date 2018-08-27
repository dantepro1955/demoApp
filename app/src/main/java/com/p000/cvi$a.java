package com.p000;

import android.text.TextUtils;
import com.ninegag.android.app.otto.actionbar.AbReloadClickedEvent;
import com.ninegag.android.tv.otto.TVGoEmbedUrlEvent;
import java.lang.ref.WeakReference;

/* compiled from: PostListFragmentModule */
/* renamed from: cvi$a */
class cvi$a {
    /* renamed from: a */
    private WeakReference<cvi> f16699a;

    private cvi$a(cvi cvi) {
        this.f16699a = new WeakReference(cvi);
    }

    @dhg
    public void onTVGoEmbedUrl(TVGoEmbedUrlEvent tVGoEmbedUrlEvent) {
        switch (tVGoEmbedUrlEvent.f18877i) {
            case 1:
                if (!TextUtils.isEmpty(tVGoEmbedUrlEvent.f18874f)) {
                    new cqd(tVGoEmbedUrlEvent.f18869a).a(tVGoEmbedUrlEvent.f18870b, tVGoEmbedUrlEvent.f18871c, tVGoEmbedUrlEvent.f18872d, tVGoEmbedUrlEvent.f18874f, tVGoEmbedUrlEvent.f18875g, tVGoEmbedUrlEvent.f18876h, tVGoEmbedUrlEvent.f18873e, false);
                    return;
                }
                return;
            default:
                new cqd(tVGoEmbedUrlEvent.f18869a).a(tVGoEmbedUrlEvent.f18870b, tVGoEmbedUrlEvent.f18871c, tVGoEmbedUrlEvent.f18872d, "VideoBrowser", false);
                return;
        }
    }

    @dhg
    public void onAbReloadClickedEvent(AbReloadClickedEvent abReloadClickedEvent) {
        if (this.f16699a.get() != null) {
            ((cvi) this.f16699a.get()).l();
        }
    }
}
