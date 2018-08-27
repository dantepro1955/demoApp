package com.p000;

import android.content.res.Resources;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiPostsResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: ProfilingHelper */
/* renamed from: cql */
public class cql {
    /* renamed from: a */
    public static void m20830a() {
    }

    /* renamed from: a */
    public static dtp<List<cct>> m20829a(String str) {
        return dtp.a(str).a(cqm.a()).c(cqn.a());
    }

    /* renamed from: c */
    static /* synthetic */ void m20832c(String str) {
        caf.m12046a().m12075g().f9370c.m13831h(str);
        try {
            Resources resources = caf.m12046a().f8449a.getResources();
            for (Integer intValue : Arrays.asList(new Integer[]{Integer.valueOf(R.raw.gag_hot_0), Integer.valueOf(R.raw.gag_hot_1), Integer.valueOf(R.raw.gag_hot_2), Integer.valueOf(R.raw.gag_hot_3), Integer.valueOf(R.raw.gag_hot_4), Integer.valueOf(R.raw.gag_hot_5), Integer.valueOf(R.raw.gag_hot_6), Integer.valueOf(R.raw.gag_hot_7), Integer.valueOf(R.raw.gag_hot_8), Integer.valueOf(R.raw.gag_hot_9), Integer.valueOf(R.raw.gag_hot_10), Integer.valueOf(R.raw.gag_hot_11), Integer.valueOf(R.raw.gag_hot_12), Integer.valueOf(R.raw.gag_hot_13), Integer.valueOf(R.raw.gag_hot_14), Integer.valueOf(R.raw.gag_hot_15), Integer.valueOf(R.raw.gag_hot_16), Integer.valueOf(R.raw.gag_hot_17), Integer.valueOf(R.raw.gag_hot_18), Integer.valueOf(R.raw.gag_hot_19), Integer.valueOf(R.raw.gag_hot_20)})) {
                InputStream openRawResource = resources.openRawResource(intValue.intValue());
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                ApiPostsResponse apiPostsResponse = (ApiPostsResponse) cpy.a(new String(bArr), ApiPostsResponse.class, 2);
                if (apiPostsResponse != null) {
                    caf.m12046a().m12075g().f9370c.m13823a(str, apiPostsResponse.data.posts);
                }
                openRawResource.close();
            }
        } catch (Throwable e) {
            dtp.a(e);
        }
    }

    /* renamed from: b */
    static /* synthetic */ dtp m20831b(String str) {
        List<clf> a = caf.m12046a().m12075g().f9370c.m13817a(str, 0, false);
        List arrayList = new ArrayList();
        for (clf i : a) {
            arrayList.add(cct.m12254a(i.m14269i()));
        }
        return dtp.a(arrayList);
    }
}
