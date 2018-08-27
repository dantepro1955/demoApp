package com.p000;

import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;
import com.ninegag.android.app.otto.post.PostDeleteBeginEvent;
import com.ninegag.android.app.otto.post.PostDeleteEvent;

/* compiled from: SinglePostController */
/* renamed from: cca */
public class cca {
    /* renamed from: a */
    private chv f8675a;
    /* renamed from: b */
    private String f8676b;

    public cca(String str) {
        this.f8676b = str;
    }

    @dhg
    public void onDeletePost(PostDeleteEvent postDeleteEvent) {
        String str = postDeleteEvent.f18329a;
        chn.m13400c("SinglePost", "Delete", str);
        cqg.a(m12439a().m13618k(), str, m12439a().m13618k().getPRM(), null);
        m12439a().m13618k().finish();
    }

    @dhg
    public void onPostSave(GagPostSaveEvent gagPostSaveEvent) {
        chn.m13394b("SinglePost", "Save", gagPostSaveEvent.f18313a.m12282e());
        if (gagPostSaveEvent.f18313a.m12287j()) {
            cqg.c(m12439a().m13618k(), gagPostSaveEvent.f18313a);
        } else {
            cqg.b(m12439a().m13618k(), gagPostSaveEvent.f18313a);
        }
    }

    @dhg
    public void onPostCopyLink(GagPostCopyLinkEvent gagPostCopyLinkEvent) {
        cqg.a(m12439a().m13618k(), gagPostCopyLinkEvent.f18309a);
        chn.m13394b("SinglePost", "CopyLink", gagPostCopyLinkEvent.f18309a.m12282e());
    }

    @dhg
    public void onPostDeleteBeginEvent(PostDeleteBeginEvent postDeleteBeginEvent) {
        m12439a().m13618k().getDialogHelper().m14934b(this.f8676b, postDeleteBeginEvent.f18328a);
    }

    /* renamed from: a */
    public void m12440a(chv chv) {
        this.f8675a = chv;
    }

    /* renamed from: a */
    public chv m12439a() {
        return this.f8675a;
    }
}
