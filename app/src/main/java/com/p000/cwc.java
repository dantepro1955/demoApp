package com.p000;

import android.content.Context;
import com.ninegag.android.tv.model.Post;
import com.ninegag.android.tv.model.api.ApiPostDetails;
import com.ninegag.android.tv.model.api.ApiPostList.ApiPosts;
import com.ninegag.android.tv.model.api.ApiResponse;
import com.ninegag.android.tv.otto.SingleTvPostResponseEvent;
import java.util.Map;

/* compiled from: GetSinglePostTask */
/* renamed from: cwc */
public class cwc extends cwa {
    /* renamed from: c */
    private String f20356c;

    public cwc(String str) {
        this.f20356c = str;
    }

    /* renamed from: c */
    protected dft mo4177c(Context context) {
        Map d = m25180d();
        d.put("ids", this.f20356c);
        return dft.m27069a(m25182e().m25158c(), d, true);
    }

    /* renamed from: a */
    protected ApiResponse mo4175a(String str) {
        return (ApiResponse) m25178c().a(str, ApiPostDetails.class);
    }

    /* renamed from: a */
    protected void mo4176a(Context context, ApiResponse apiResponse) {
        final ApiPostDetails apiPostDetails = (ApiPostDetails) apiResponse;
        final cvv k = caf.a().k();
        k.m25152a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ cwc f20355c;

            public void run() {
                for (ApiPosts apiPosts : apiPostDetails.data.posts) {
                    Post a = k.f20339a.m25129a(apiPosts);
                    k.f20339a.m25135a(a, apiPosts.video);
                    if (!(apiPostDetails.data == null || apiPostDetails.data.posts == null || apiPostDetails.data.posts.length != 1)) {
                        dhe.m27280a().m27269c(new SingleTvPostResponseEvent(a.m23050b()));
                    }
                }
            }
        });
    }
}
