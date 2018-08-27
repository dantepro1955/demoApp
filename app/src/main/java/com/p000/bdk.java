package com.p000;

import android.text.TextUtils;
import com.mopub.mobileads.VastIconXmlManager;
import java.util.Map;

@bhd
/* renamed from: bdk */
class bdk implements bcy {
    bdk() {
    }

    /* renamed from: a */
    private int m7589a(Map<String, String> map) throws NullPointerException, NumberFormatException {
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        return (parseInt < 0 || 3 < parseInt) ? 0 : parseInt;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        Throwable e;
        if (((Boolean) bbb.by.m7064c()).booleanValue()) {
            blu blu;
            blu z = blo.mo1346z();
            if (z == null) {
                try {
                    z = new blu(blo, Float.parseFloat((String) map.get(VastIconXmlManager.DURATION)));
                    blo.mo1300a(z);
                    blu = z;
                } catch (NullPointerException e2) {
                    e = e2;
                    bky.m9007b("Unable to parse videoMeta message.", e);
                    ako.m2347i().m8934a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e3) {
                    e = e3;
                    bky.m9007b("Unable to parse videoMeta message.", e);
                    ako.m2347i().m8934a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            blu = z;
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int a = m7589a(map);
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (bky.m9005a(3)) {
                bky.m9006b(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(a).append(" , aspectRatio : ").append(str).toString());
            }
            blu.m9590a(parseFloat, a, equals, parseFloat2);
        }
    }
}
