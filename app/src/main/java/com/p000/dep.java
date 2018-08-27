package com.p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import p000.deo.C4841d;
import p000.dew.C4862f;
import p000.dew.C4865i;

/* compiled from: CommentItemRendererV4ClickListener */
/* renamed from: dep */
public class dep implements OnClickListener {
    /* renamed from: a */
    protected deo f21426a;

    public dep(deo deo) {
        this.f21426a = deo;
    }

    public void onClick(View view) {
        int id = view.getId();
        CommentWrapper a;
        C4841d b;
        if (id == C4862f.likeBtn) {
            a = this.f21426a.m26780a(((Integer) view.getTag()).intValue());
            b = this.f21426a.mo4351b(view);
            if (a.getLikeStatus() == 1) {
                this.f21426a.m26797c(b.f21365f, a.getCommentId(), a);
            } else {
                this.f21426a.m26783a(b.f21365f, a.getCommentId(), a);
            }
            this.f21426a.m26811a(view.getContext(), this.f21426a.mo4351b(view), a, true);
        } else if (id == C4862f.dislikeBtn) {
            a = this.f21426a.m26780a(((Integer) view.getTag()).intValue());
            b = this.f21426a.mo4351b(view);
            if (a.getLikeStatus() == -1) {
                this.f21426a.m26797c(b.f21365f, a.getCommentId(), a);
            } else {
                this.f21426a.m26795b(b.f21365f, a.getCommentId(), a);
            }
            this.f21426a.m26811a(view.getContext(), this.f21426a.mo4351b(view), a, true);
        } else if (id == C4862f.replyBtnV4) {
            String str;
            ddc.m26576e("reply");
            CommentWrapper a2 = this.f21426a.m26780a(((Integer) view.getTag()).intValue());
            Comment comment = a2.getComment();
            C4841d b2 = this.f21426a.mo4351b(view);
            r0 = "";
            if (a2.isAnonymous()) {
                str = "@" + view.getContext().getString(C4865i.anonymous_mention) + " ";
            } else {
                str = comment.m23420E() != null ? "@" + comment.m23420E().m23634d() + " " : "";
            }
            this.f21426a.m26781a(b2.f21365f, comment.m23426a().longValue(), comment.m23434b());
            Bundle bundle = new Bundle();
            bundle.putString("ui_tap_comment_id", comment.m23439c());
            if (a2.getLevel() == dda.m26492a().m26561q()) {
                Comment F = comment.m23421F();
                if (F != null) {
                    this.f21426a.m26782a(b2.f21365f, F.m23426a().longValue(), str, bundle);
                    return;
                }
            }
            this.f21426a.m26782a(b2.f21365f, comment.m23426a().longValue(), str, bundle);
        } else if (id == C4862f.loadMoreContainer) {
            this.f21426a.m26813a(view, this.f21426a.m26780a(((Integer) view.getTag()).intValue()));
        } else if (id == C4862f.dataView) {
        } else {
            if (id == C4862f.moreBtn) {
                ddc.m26576e("options");
                a = this.f21426a.m26780a(((Integer) view.getTag()).intValue());
                this.f21426a.m26784a(this.f21426a.mo4351b(view).f21365f, a.getCommentId(), a.getUserName(view.getContext()));
            } else if (id == C4862f.userName || id == C4862f.avatar) {
                r0 = (String) view.getTag(C4862f.username);
                if (r0 != null) {
                    this.f21426a.m26788a(r0);
                }
            } else if (id == C4862f.avatar) {
                r0 = (String) view.getTag(C4862f.username);
                if (r0 != null) {
                    this.f21426a.m26796b(r0);
                }
            }
        }
    }
}
