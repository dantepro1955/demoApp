package com.p000;

import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiCommentList;

/* compiled from: CommentHelper */
/* renamed from: ddh */
public class ddh {
    /* renamed from: a */
    public static void m26606a(ApiComment apiComment, String str) {
        if (apiComment != null && apiComment.userId != null && str != null && apiComment.userId.equals(str)) {
            apiComment.setCommentLabel("OP");
        }
    }

    /* renamed from: a */
    public static void m26607a(ApiComment[] apiCommentArr, ApiCommentList apiCommentList) {
        ddh.m26608a(apiCommentArr, apiCommentList.payload.opUserId);
    }

    /* renamed from: a */
    public static void m26608a(ApiComment[] apiCommentArr, String str) {
        if (apiCommentArr != null) {
            int length = apiCommentArr.length;
            for (int i = 0; i < length; i++) {
                if (apiCommentArr[i] != null) {
                    ddh.m26606a(apiCommentArr[i], str);
                    if (apiCommentArr[i].children != null) {
                        ddh.m26608a(apiCommentArr[i].children, str);
                    }
                }
            }
        }
    }
}
