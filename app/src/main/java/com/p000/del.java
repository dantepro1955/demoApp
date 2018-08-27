package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.under9.android.comments.model.CommentListItem;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.otto.SelectCommentEvent;
import java.util.List;
import p000.dew.C4859c;
import p000.dew.C4864h;

/* compiled from: BaseCommentAdapterRenderer */
/* renamed from: del */
public abstract class del extends dek {
    /* renamed from: a */
    private List<CommentWrapper> f21356a;
    /* renamed from: b */
    private C4411a f21357b;
    /* renamed from: c */
    private boolean f21358c;

    /* compiled from: BaseCommentAdapterRenderer */
    /* renamed from: del$a */
    public interface C4411a {
        /* renamed from: a */
        void mo4051a(int i, long j, String str, Bundle bundle);

        /* renamed from: a */
        void mo4052a(int i, String str, String str2);

        /* renamed from: a */
        void mo4053a(long j);

        /* renamed from: a */
        void mo4054a(String str);

        /* renamed from: a */
        void mo4055a(String str, String str2);

        /* renamed from: a */
        boolean mo4056a();

        /* renamed from: a */
        boolean mo4057a(int i, String str);

        /* renamed from: b */
        long mo4058b();

        /* renamed from: b */
        void mo4059b(String str);

        /* renamed from: b */
        boolean mo4060b(int i, String str);

        /* renamed from: c */
        boolean mo4061c(int i, String str);
    }

    /* renamed from: a */
    public void m26787a(C4411a c4411a) {
        this.f21357b = c4411a;
    }

    /* renamed from: a */
    public void m26790a(List<CommentWrapper> list) {
        this.f21356a = list;
    }

    /* renamed from: a */
    public CommentWrapper m26780a(int i) {
        if (i < 0 || i >= this.f21356a.size()) {
            return null;
        }
        return (CommentWrapper) this.f21356a.get(i);
    }

    /* renamed from: b */
    public CommentListItem m26794b(int i) {
        CommentWrapper commentWrapper = (CommentWrapper) this.f21356a.get(i);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            CommentWrapper commentWrapper2 = (CommentWrapper) this.f21356a.get(i2);
            if (commentWrapper2.getLevel() == commentWrapper.getLevel() - 1) {
                return commentWrapper2.getCommentListItem();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m26786a(Context context, TextView textView, String str, boolean z) {
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void m26785a(Context context, TextView textView, CommentWrapper commentWrapper) {
        int likeCount = commentWrapper.getLikeCount();
        int likeStatus = commentWrapper.getLikeStatus();
        if (!commentWrapper.shouldHighlight()) {
            textView.setTextColor(context.getResources().getColor(del.m26778c(likeStatus)));
        }
        textView.setText(String.format(djo.m27600a(context, C4864h.points_count, likeCount), new Object[]{djo.m27598a(likeCount)}));
        if (likeStatus > 0) {
            textView.setTypeface(null, 1);
        } else {
            textView.setTypeface(null, 0);
        }
    }

    /* renamed from: a */
    public void m26791a(boolean z) {
        this.f21358c = z;
    }

    /* renamed from: a */
    public boolean m26792a() {
        return this.f21358c;
    }

    /* renamed from: a */
    protected void m26783a(int i, String str, CommentWrapper commentWrapper) {
        if (!m26776a(i, str)) {
            dda.m26492a().m26507a(commentWrapper.getComment());
        }
    }

    /* renamed from: b */
    protected void m26795b(int i, String str, CommentWrapper commentWrapper) {
        if (!m26779c(i, str)) {
            dda.m26492a().m26523b(commentWrapper.getComment());
        }
    }

    /* renamed from: c */
    protected void m26797c(int i, String str, CommentWrapper commentWrapper) {
        if (!m26777b(i, str)) {
            dda.m26492a().m26528c(commentWrapper.getComment());
        }
    }

    /* renamed from: a */
    protected void m26788a(String str) {
        if (this.f21357b != null) {
            this.f21357b.mo4054a(str);
        }
    }

    /* renamed from: b */
    protected void m26796b(String str) {
        if (this.f21357b != null) {
            this.f21357b.mo4059b(str);
        }
    }

    /* renamed from: a */
    protected void m26789a(String str, String str2) {
        if (this.f21357b != null) {
            this.f21357b.mo4055a(str, str2);
        }
    }

    /* renamed from: a */
    protected void m26782a(int i, long j, String str, Bundle bundle) {
        if (this.f21357b != null) {
            this.f21357b.mo4051a(i, j, str, bundle);
        }
    }

    /* renamed from: a */
    protected void m26781a(int i, long j, String str) {
        dct.m26398a(str, new SelectCommentEvent(i, j));
    }

    /* renamed from: a */
    protected void m26784a(int i, String str, String str2) {
        if (this.f21357b != null) {
            this.f21357b.mo4052a(i, str, str2);
        }
    }

    /* renamed from: a */
    private boolean m26776a(int i, String str) {
        if (this.f21357b != null) {
            return this.f21357b.mo4057a(i, str);
        }
        return false;
    }

    /* renamed from: b */
    private boolean m26777b(int i, String str) {
        if (this.f21357b != null) {
            return this.f21357b.mo4061c(i, str);
        }
        return false;
    }

    /* renamed from: c */
    private boolean m26779c(int i, String str) {
        if (this.f21357b != null) {
            return this.f21357b.mo4060b(i, str);
        }
        return false;
    }

    /* renamed from: c */
    private static int m26778c(int i) {
        if (i > 0) {
            return C4859c.like_positive_text_color;
        }
        if (i == 0) {
            return C4859c.like_zero_text_color;
        }
        return C4859c.like_negative_text_color;
    }

    /* renamed from: a */
    protected boolean m26793a(long j) {
        return this.f21357b != null && this.f21357b.mo4056a() && this.f21357b.mo4058b() == j;
    }
}
