package com.p000;

import android.util.SparseArray;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiComment.ApiCommentDeserializer;
import com.under9.android.comments.model.api.ApiCommentData.ApiEmbedMediaMeta;
import com.under9.android.comments.model.api.ApiCommentData.ApiEmbedMediaMetaDeserializer;
import com.under9.android.comments.model.api.ApiCommentData.ApiMedia;
import com.under9.android.comments.model.api.ApiCommentData.ApiMediaDeserializer;
import com.under9.android.comments.model.api.ApiCommentData.ApiMentionMapDeserializer;
import com.under9.android.comments.model.api.ApiCommentList.ApiCommentListPayloadDeserializer;
import com.under9.android.comments.model.api.ApiCommentList.Payload;
import com.under9.android.comments.model.api.ApiUser;
import com.under9.android.comments.model.api.ApiUser.ApiUserDeserializer;

/* compiled from: GsonFactory */
/* renamed from: dez */
public class dez {
    /* renamed from: a */
    private static SparseArray<bub> f21439a = new SparseArray();

    /* renamed from: a */
    public static bub m26904a(int i) {
        bub bub = (bub) f21439a.get(i);
        if (bub != null) {
            return bub;
        }
        bub = dez.m26907b(i);
        f21439a.put(i, bub);
        return bub;
    }

    /* renamed from: a */
    public static <T> T m26905a(String str, Class<T> cls, int i) {
        try {
            bub a = dez.m26904a(i);
            if (a != null) {
                return a.a(str, cls);
            }
        } catch (buq e) {
        }
        return null;
    }

    /* renamed from: b */
    private static bub m26907b(int i) {
        switch (i) {
            case 2:
                return dez.m26906b();
            case 3:
                return dez.m26908c();
            default:
                return dez.m26903a();
        }
    }

    /* renamed from: a */
    private static bub m26903a() {
        return new buc().a();
    }

    /* renamed from: b */
    private static bub m26906b() {
        buc buc = new buc();
        buc.a(Payload.class, new ApiCommentListPayloadDeserializer());
        buc.a(ApiComment.class, new ApiCommentDeserializer());
        buc.a(ApiUser.class, new ApiUserDeserializer());
        return buc.a();
    }

    /* renamed from: c */
    private static bub m26908c() {
        buc buc = new buc();
        buc.a(ApiEmbedMediaMeta.class, new ApiEmbedMediaMetaDeserializer());
        buc.a(ApiMedia.class, new ApiMediaDeserializer());
        buc.a(ApiMentionMapDeserializer.class, new ApiMentionMapDeserializer());
        return buc.a();
    }
}
