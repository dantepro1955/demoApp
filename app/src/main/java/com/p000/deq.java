package com.p000;

import android.content.Context;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.model.wrapper.EmbedImage;
import p000.den.C4842a;

/* compiled from: CommentItemUserMediaRendererV4 */
/* renamed from: deq */
public class deq extends den {
    /* renamed from: a */
    protected void mo4357a(C4842a c4842a, int i, CommentWrapper commentWrapper, Context context) {
        EmbedImage firstMediaEmbedImage = commentWrapper.getFirstMediaEmbedImage();
        if (firstMediaEmbedImage != null) {
            m26840a(c4842a, i, firstMediaEmbedImage, commentWrapper, context);
        }
    }
}
