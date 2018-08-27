package com.p000;

import com.under9.android.comments.model.api.ApiComment;
import java.util.Collections;
import java.util.List;

/* compiled from: TopCommentsResponse */
/* renamed from: cdh */
public class cdh {
    @buw(a = "comments")
    /* renamed from: a */
    List<ApiComment> f8775a;
    @buw(a = "total")
    /* renamed from: b */
    int f8776b;

    /* renamed from: a */
    public List<ApiComment> m12607a() {
        if (this.f8775a == null) {
            return Collections.emptyList();
        }
        return this.f8775a;
    }

    /* renamed from: b */
    public int m12608b() {
        return this.f8776b;
    }
}
