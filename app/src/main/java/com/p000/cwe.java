package com.p000;

import android.content.Context;
import com.ninegag.android.tv.model.api.ApiPostList;
import com.ninegag.android.tv.model.api.ApiPostList.ApiData;
import com.ninegag.android.tv.model.api.ApiResponse;
import com.ninegag.android.tv.otto.PostListResponseEvent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PostsListTask */
/* renamed from: cwe */
public class cwe extends cwa {
    /* renamed from: c */
    private HashMap<String, C4622b> f20367c;

    /* compiled from: PostsListTask */
    /* renamed from: cwe$a */
    public static class C4621a {
        /* renamed from: a */
        private HashMap<String, C4622b> f20361a = new HashMap();

        /* renamed from: a */
        public C4621a m25196a(String str, String str2, int i) {
            this.f20361a.put(str, new C4622b(str, str2, 20, i));
            return this;
        }

        /* renamed from: a */
        public HashMap<String, C4622b> m25197a() {
            return this.f20361a;
        }

        /* renamed from: b */
        public static HashMap<String, C4622b> m25195b(String str, String str2, int i) {
            return new C4621a().m25196a(str, str2, i).m25197a();
        }
    }

    /* compiled from: PostsListTask */
    /* renamed from: cwe$b */
    public static class C4622b implements Serializable {
        /* renamed from: a */
        public String f20362a;
        /* renamed from: b */
        public String f20363b;
        /* renamed from: c */
        public int f20364c;
        /* renamed from: d */
        public int f20365d;
        /* renamed from: e */
        public boolean f20366e;

        private C4622b(String str, String str2, int i, int i2) {
            this.f20362a = str;
            this.f20363b = str2;
            this.f20364c = i;
            this.f20365d = i2;
        }
    }

    public cwe(HashMap<String, C4622b> hashMap) {
        this.f20367c = hashMap;
    }

    /* renamed from: c */
    protected dft mo4177c(Context context) {
        Map d = m25180d();
        cvv k = caf.a().k();
        String str = "";
        for (String str2 : this.f20367c.keySet()) {
            String str22;
            C4622b c4622b = (C4622b) this.f20367c.get(str22);
            String str3 = c4622b.f20362a;
            String str4 = null;
            if (c4622b.f20365d != 1) {
                str4 = c4622b.f20362a + ":" + c4622b.f20364c;
            } else if (k.f20339a.m25141d(str3)) {
                str4 = c4622b.f20362a + ":" + c4622b.f20364c + ":" + k.f20339a.m25140c(str3);
            }
            if (str4 != null) {
                if (str.length() > 0) {
                    str22 = str + ",";
                } else {
                    str22 = str;
                }
                str = str22 + str4;
            }
        }
        d.put("ref_keys", str);
        return dft.m27069a(m25182e().m25157b(), d, true);
    }

    /* renamed from: a */
    protected ApiResponse mo4175a(String str) {
        return (ApiResponse) m25178c().a(str, ApiPostList.class);
    }

    /* renamed from: a */
    protected void mo4176a(Context context, ApiResponse apiResponse) {
        ApiPostList apiPostList = (ApiPostList) apiResponse;
        final cvv k = caf.a().k();
        for (final ApiData apiData : apiPostList.data) {
            if (this.f20367c.containsKey(apiData.list_key)) {
                final C4622b c4622b = (C4622b) this.f20367c.get(apiData.list_key);
                k.m25152a(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ cwe f20360d;

                    public void run() {
                        if (c4622b.f20365d == 0) {
                            k.f20339a.m25142e(c4622b.f20362a);
                        }
                        k.f20339a.m25136a(apiData.list_key, apiData.next_reference_key, !apiData.end_of_list);
                        k.f20339a.m25137a(c4622b.f20362a, apiData.posts);
                    }
                });
                c4622b.f20366e = true;
                dhe.m27287c(c4622b.f20363b, new PostListResponseEvent(c4622b.f20362a, c4622b.f20365d));
            }
        }
        for (C4622b c4622b2 : this.f20367c.values()) {
            if (!c4622b2.f20366e) {
                dhe.m27287c(c4622b2.f20363b, new PostListResponseEvent(c4622b2.f20362a, c4622b2.f20365d));
                c4622b2.f20366e = true;
            }
        }
    }
}
