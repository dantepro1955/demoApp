package com.p000;

import android.content.Context;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiCommentData;
import com.under9.android.comments.model.api.ApiCommentData.ApiCommentStatus;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.otto.CommentDataUpdatedEvent;
import java.util.ArrayList;

/* compiled from: GetCommentsDataTask */
/* renamed from: ddu */
public class ddu extends ddn {
    /* renamed from: a */
    private String f21323a;
    /* renamed from: b */
    private String f21324b = "";
    /* renamed from: c */
    private String f21325c;
    /* renamed from: d */
    private int f21326d;
    /* renamed from: e */
    private ArrayList<String> f21327e;

    public ddu(String str, String str2, String str3, int i) {
        this.f21323a = str2;
        this.f21324b = str;
        this.f21325c = str3;
        this.f21326d = i;
        this.f21327e = new ArrayList();
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) dez.m26905a(str, ApiCommentData.class, 3);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        final ApiCommentStatus[] apiCommentStatusArr = ((ApiCommentData) apiResponse).payload.comments;
        final dda a = dda.m26492a();
        final ArrayList arrayList = new ArrayList();
        a.m26509a(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ ddu f21322d;

            public void run() {
                if (apiCommentStatusArr != null) {
                    for (ApiCommentStatus apiCommentStatus : apiCommentStatusArr) {
                        if (a.m26513a(apiCommentStatus)) {
                            this.f21322d.f21327e.add(apiCommentStatus.commentId);
                        } else {
                            ApiComment toApiComment = apiCommentStatus.toApiComment();
                            String e = dda.m26492a().m26537e();
                            if (e == null || !e.equals(toApiComment.userId)) {
                                arrayList.add(toApiComment);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        ddi.m26610a(this.f21322d.f21325c, this.f21322d.f21326d, (ApiComment[]) arrayList.toArray(new ApiComment[arrayList.size()]), null, 1);
                    }
                }
            }
        });
        dct.m26398a(this.f21325c, new CommentDataUpdatedEvent(this.f21327e, arrayList.size()));
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/commentsData.json?appId=" + dda.m26492a().m26526c() + "&commentIds=" + this.f21323a + "&auth=" + this.f21324b;
    }
}
