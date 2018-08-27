package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiFeaturedItem;
import com.ninegag.android.app.model.api.ApiFeaturedListResponse;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.otto.response.FeaturedListResponseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: GetFeaturedListTask */
/* renamed from: cmp */
public class cmp extends cmg {
    /* renamed from: b */
    private int f9785b = 30;
    /* renamed from: c */
    private caf f9786c = caf.m12046a();

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        int i = 0;
        ApiFeaturedListResponse apiFeaturedListResponse = (ApiFeaturedListResponse) apiBaseResponse;
        if (apiFeaturedListResponse != null && apiFeaturedListResponse.data != null && apiFeaturedListResponse.meta != null) {
            ApiGag[] apiGagArr = apiFeaturedListResponse.data.posts;
            int length = apiGagArr.length;
            final ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < length; i2++) {
                if (apiGagArr[i2] != null) {
                    arrayList.add(apiGagArr[i2]);
                }
            }
            ApiFeaturedItem[] apiFeaturedItemArr = apiFeaturedListResponse.data.featuredItems;
            final ArrayList arrayList2 = new ArrayList();
            length = apiFeaturedItemArr.length;
            while (i < length) {
                if (apiFeaturedItemArr[i] != null) {
                    arrayList2.add(apiFeaturedItemArr[i]);
                }
                i++;
            }
            this.f9786c.m12075g().m13707a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ cmp f9784c;

                public void run() {
                    int i;
                    cka cka;
                    int intValue;
                    int size;
                    int size2 = arrayList.size();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f9784c.f9786c.m12075g().f9370c.m13813a((ApiGag) it.next());
                    }
                    int size3 = arrayList2.size();
                    for (i = 0; i < size3; i++) {
                        this.f9784c.f9786c.m12075g().m13695a((ApiFeaturedItem) arrayList2.get(i));
                    }
                    List<cka> c = this.f9784c.f9786c.m12075g().m13718c(true);
                    HashMap hashMap = new HashMap();
                    for (cka cka2 : c) {
                        hashMap.put(cka2.m14143d() + "-" + cka2.m14144e(), cka2.m14138b());
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size4 = arrayList.size() + arrayList2.size();
                    for (int i2 = 0; i2 < size4; i2++) {
                        cka cka3;
                        String str;
                        if (i2 < size2) {
                            ApiGag apiGag = (ApiGag) arrayList.get(i2);
                            str = "1-" + apiGag.id;
                            cka3 = new cka(null, Integer.valueOf(-1), Long.valueOf(apiGag.orderId), Integer.valueOf(1), apiGag.id, apiGag.featuredImageUrl);
                            Object obj = str;
                        } else {
                            ApiFeaturedItem apiFeaturedItem = (ApiFeaturedItem) arrayList2.get(i2 - size2);
                            str = "2-" + apiFeaturedItem.id;
                            cka3 = new cka(null, Integer.valueOf(-1), Long.valueOf(apiFeaturedItem.orderId), Integer.valueOf(2), apiFeaturedItem.id, apiFeaturedItem.featuredImageUrl);
                            String str2 = str;
                        }
                        if (hashMap.containsKey(obj)) {
                            intValue = ((Integer) hashMap.get(obj)).intValue();
                            cka3.m14135a(Integer.valueOf(intValue));
                            if (arrayList2.size() == 0 || intValue >= ((cka) arrayList2.get(arrayList2.size() - 1)).m14138b().intValue()) {
                                arrayList2.add(cka3);
                            } else {
                                size = arrayList2.size();
                                for (size3 = 0; size3 < size; size3++) {
                                    if (((cka) arrayList2.get(size3)).m14138b().intValue() > intValue) {
                                        arrayList2.add(size3, cka3);
                                        break;
                                    }
                                }
                            }
                        } else if (arrayList.size() == 0 || cka3.m14142c().longValue() <= ((cka) arrayList.get(arrayList.size() - 1)).m14142c().longValue()) {
                            arrayList.add(cka3);
                        } else {
                            intValue = arrayList.size();
                            for (size3 = 0; size3 < intValue; size3++) {
                                if (cka3.m14142c().longValue() > ((cka) arrayList.get(size3)).m14142c().longValue()) {
                                    arrayList.add(size3, cka3);
                                    break;
                                }
                            }
                        }
                    }
                    List arrayList3 = new ArrayList();
                    intValue = arrayList.size();
                    for (i = 0; i < intValue; i++) {
                        cka2 = (cka) arrayList.get(i);
                        cka2.m14135a(Integer.valueOf(i + 1));
                        arrayList3.add(cka2);
                    }
                    intValue = arrayList.size();
                    size = arrayList2.size();
                    for (i = 0; i < size; i++) {
                        cka2 = (cka) arrayList2.get(i);
                        cka2.m14135a(Integer.valueOf((intValue + i) + 1));
                        arrayList3.add(cka2);
                    }
                    this.f9784c.f9786c.m12075g().m13709a(arrayList3);
                }
            });
        }
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) cpy.a(str, ApiFeaturedListResponse.class, 2);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/featured-list/itemCount/%d/entryTypes/%s/includeNonEntry/1", new Object[]{cae.m12035a(), Integer.valueOf(this.f9785b), cps.a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "featured-list";
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 116);
        return g;
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        m14474a(context, g);
        dhe.c("featuredList", new FeaturedListResponseEvent("featuredList"));
    }
}
