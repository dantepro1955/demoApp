package com.p000;

import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.CommentListItem;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiTopComments;
import com.under9.android.comments.otto.WrittenTopCommentEvent;

/* compiled from: CommentWriter */
/* renamed from: ddi */
public class ddi {

    /* compiled from: CommentWriter */
    /* renamed from: ddi$a */
    static class C4826a {
        /* renamed from: a */
        Comment f21254a;
        /* renamed from: b */
        CommentListItem f21255b;

        public C4826a(Comment comment, CommentListItem commentListItem) {
            this.f21254a = comment;
            this.f21255b = commentListItem;
        }
    }

    /* renamed from: a */
    public static ApiTopComments m26609a(String str) {
        return (ApiTopComments) dez.m26905a(str, ApiTopComments.class, 2);
    }

    /* renamed from: a */
    public static boolean m26611a(String str, int i, String str2) {
        final dda a = dda.m26492a();
        if (a.m26530c(str, i)) {
            return false;
        }
        final ApiTopComments a2 = ddi.m26609a(str2);
        if (a2 == null) {
            return false;
        }
        final ApiComment[] apiCommentArr = a2.comments;
        if (apiCommentArr.length == 0) {
            return false;
        }
        final String str3 = str;
        final int i2 = i;
        new Thread(new Runnable() {

            /* compiled from: CommentWriter */
            /* renamed from: ddi$1$1 */
            class C48241 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C48251 f21248a;

                C48241(C48251 c48251) {
                    this.f21248a = c48251;
                }

                public void run() {
                    ddi.m26610a(str3, i2, apiCommentArr, null, 1);
                    dda.m26492a().m26512a(str3, a2.webSocketUrl);
                }
            }

            public void run() {
                ddh.m26608a(apiCommentArr, a2.opUserId);
                a.m26509a(new C48241(this));
                dct.m26398a(str3, new WrittenTopCommentEvent(str3, i2));
            }
        }, "write-top-comment").start();
        return true;
    }

    /* renamed from: a */
    public static void m26610a(String str, int i, ApiComment[] apiCommentArr, Comment comment, int i2) {
        if (apiCommentArr != null) {
            int length = apiCommentArr.length;
            dda.m26492a().m26510a(str, i, i2, length * 2);
            C4826a[] c4826aArr = new C4826a[length];
            int i3 = i2;
            for (int i4 = 0; i4 < length; i4++) {
                ApiComment apiComment = apiCommentArr[i4];
                if (apiComment.user != null) {
                    Comment a = dda.m26492a().m26495a(apiComment, comment, str, dda.m26492a().m26502a(apiComment.user));
                    c4826aArr[i4] = new C4826a(a, dda.m26492a().m26497a(a, apiComment.orderKey, str, i, i3, i3 + 1));
                    i3 += 2;
                }
            }
            for (int i5 = 0; i5 < length; i5++) {
                ApiComment apiComment2 = apiCommentArr[i5];
                C4826a c4826a = c4826aArr[i5];
                c4826a.f21255b.m23519k();
                ddi.m26610a(str, i, apiComment2.children, c4826a.f21254a, c4826a.f21255b.m23515g().intValue());
            }
        }
    }
}
