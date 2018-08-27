package com.p000;

import android.content.Context;
import com.ninegag.android.tv.model.api.ApiAvailableList;
import com.ninegag.android.tv.model.api.ApiResponse;
import com.ninegag.android.tv.otto.AvailablePostListResponseEvent;
import java.util.Map;

/* compiled from: AvailableListTask */
/* renamed from: cwb */
public class cwb extends cwa {
    /* renamed from: c */
    protected dft mo4177c(Context context) {
        Map d = m25180d();
        d.put("locale", djo.m27601a().toString());
        return dft.m27069a(m25182e().m25156a(), d, true);
    }

    /* renamed from: a */
    protected ApiResponse mo4175a(String str) {
        return (ApiResponse) m25178c().a(str, ApiAvailableList.class);
    }

    /* renamed from: a */
    protected void mo4176a(Context context, ApiResponse apiResponse) {
        caf.a().k().f20339a.m25138a(((ApiAvailableList) apiResponse).data.lists);
        dhe.m27286c(new AvailablePostListResponseEvent());
    }
}
