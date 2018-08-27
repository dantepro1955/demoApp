package com.p000;

import com.facebook.share.internal.ShareConstants;
import com.mopub.mobileads.BaseVideoPlayerActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: xq */
class xq extends wo {
    /* renamed from: e */
    private final yv f25995e;
    /* renamed from: f */
    private final JSONObject f25996f;

    xq(JSONObject jSONObject, vm vmVar, yv yvVar) {
        super("TaskRenderNativeAd", vmVar);
        this.f25995e = yvVar;
        this.f25996f = jSONObject;
    }

    /* renamed from: a */
    private String m34818a(Map map, String str) {
        String str2 = (String) map.get("simp_url");
        if (zn.m34841d(str2)) {
            return str2.replace("{CLCODE}", str);
        }
        throw new IllegalArgumentException("No impression URL available");
    }

    /* renamed from: a */
    private String m34819a(Map map, String str, String str2) {
        String str3 = (String) map.get("click_url");
        if (zn.m34841d(str3)) {
            CharSequence charSequence;
            if (str2 == null) {
                charSequence = "";
            }
            return str3.replace("{CLCODE}", str).replace("{EVENT_ID}", charSequence);
        }
        throw new IllegalArgumentException("No impression URL available");
    }

    /* renamed from: a */
    private void m34820a(JSONObject jSONObject) {
        List<Map> a = vs.m34471a(jSONObject.getJSONArray("native_ads"));
        Map a2 = vs.m34472a(jSONObject.getJSONObject("native_settings"));
        List arrayList = new ArrayList(a.size());
        for (Map map : a) {
            String str = (String) map.get("clcode");
            vo a3 = new vw().m34516e((String) map.get("title")).m34517f((String) map.get("description")).m34518g((String) map.get(ShareConstants.FEED_CAPTION_PARAM)).m34527p((String) map.get("cta")).m34511a((String) map.get("icon_url")).m34513b((String) map.get("image_url")).m34515d((String) map.get(BaseVideoPlayerActivity.VIDEO_URL)).m34514c((String) map.get("star_rating_url")).m34519h((String) map.get("icon_url")).m34520i((String) map.get("image_url")).m34521j((String) map.get(BaseVideoPlayerActivity.VIDEO_URL)).m34509a(Float.parseFloat((String) map.get("star_rating"))).m34526o(str).m34522k(m34818a(a2, str)).m34523l(m34819a(a2, str, (String) map.get("event_id"))).m34524m(m34821b(a2, str)).m34525n(m34822c(a2, str)).m34510a(Long.parseLong((String) map.get("ad_id"))).m34512a(this.b).m34508a();
            arrayList.add(a3);
            this.b.mo5561g().mo5606a("TaskRenderNativeAd", "Prepared slot: " + a3.m34446m());
        }
        if (this.f25995e != null) {
            this.f25995e.onNativeAdsLoaded(arrayList);
        }
    }

    /* renamed from: b */
    private String m34821b(Map map, String str) {
        String str2 = (String) map.get("video_start_url");
        return str2 != null ? str2.replace("{CLCODE}", str) : null;
    }

    /* renamed from: c */
    private String m34822c(Map map, String str) {
        String str2 = (String) map.get("video_end_url");
        return str2 != null ? str2.replace("{CLCODE}", str) : null;
    }

    /* renamed from: a */
    void m34823a(int i) {
        try {
            if (this.f25995e != null) {
                this.f25995e.onNativeAdsFailedToLoad(i);
            }
        } catch (Throwable e) {
            this.b.mo5561g().mo5609b("TaskRenderNativeAd", "Unable to notify listener about failure.", e);
        }
    }

    public void run() {
        try {
            if (this.f25996f == null || this.f25996f.length() == 0) {
                m34823a(-700);
            } else {
                m34820a(this.f25996f);
            }
        } catch (Throwable e) {
            this.b.mo5561g().mo5609b("TaskRenderNativeAd", "Unable to render widget.", e);
            m34823a(-200);
        }
    }
}
