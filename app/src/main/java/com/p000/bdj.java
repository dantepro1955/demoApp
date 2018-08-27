package com.p000;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.Map;
import org.json.JSONObject;

@bhd
/* renamed from: bdj */
public final class bdj implements bcy {
    /* renamed from: a */
    private boolean f5649a;

    /* renamed from: a */
    private static int m7587a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = azp.m6789a().m9283a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                bky.m9011e(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if (str == null) {
            bky.m9011e("Action missing from video GMSG.");
            return;
        }
        if (bky.m9005a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject.toString());
            bky.m9006b(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Video GMSG: ").append(str).append(" ").append(valueOf).toString());
        }
        if ("background".equals(str)) {
            valueOf = (String) map.get("color");
            if (TextUtils.isEmpty(valueOf)) {
                bky.m9011e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                blo.setBackgroundColor(Color.parseColor(valueOf));
                return;
            } catch (IllegalArgumentException e) {
                bky.m9011e("Invalid color parameter in video GMSG.");
                return;
            }
        }
        bln w = blo.mo1343w();
        if (w == null) {
            bky.m9011e("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int a;
        int min;
        if (equals || equals2) {
            Context context = blo.getContext();
            int a2 = bdj.m7587a(context, map, "x", 0);
            a = bdj.m7587a(context, map, "y", 0);
            int a3 = bdj.m7587a(context, map, "w", -1);
            int a4 = bdj.m7587a(context, map, "h", -1);
            if (((Boolean) bbb.cp.m7064c()).booleanValue()) {
                min = Math.min(a3, blo.getMeasuredWidth() - a2);
                a4 = Math.min(a4, blo.getMeasuredHeight() - a);
            } else {
                min = a3;
            }
            try {
                a3 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                a3 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && w.m9341a() == null) {
                w.m9343a(a2, a, min, a4, a3, parseBoolean);
                return;
            } else {
                w.m9342a(a2, a, min, a4);
                return;
            }
        }
        zzl a5 = w.m9341a();
        if (a5 == null) {
            zzl.m19322a(blo);
        } else if ("click".equals(str)) {
            r0 = blo.getContext();
            a = bdj.m7587a(r0, map, "x", 0);
            min = bdj.m7587a(r0, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a, (float) min, 0);
            a5.m19338a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            valueOf = (String) map.get("time");
            if (valueOf == null) {
                bky.m9011e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a5.m19335a((int) (Float.parseFloat(valueOf) * 1000.0f));
            } catch (NumberFormatException e3) {
                str = "Could not parse time parameter from currentTime video GMSG: ";
                valueOf = String.valueOf(valueOf);
                bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("hide".equals(str)) {
            a5.setVisibility(4);
        } else if ("load".equals(str)) {
            a5.m19347h();
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a5.m19350k();
            } else {
                a5.m19351l();
            }
        } else if ("pause".equals(str)) {
            a5.m19348i();
        } else if ("play".equals(str)) {
            a5.m19349j();
        } else if ("show".equals(str)) {
            a5.setVisibility(0);
        } else if (AdTrackerConstants.SOURCE.equals(str)) {
            a5.m19339a((String) map.get(AdTrackerConstants.SOURCE));
        } else if ("touchMove".equals(str)) {
            r0 = blo.getContext();
            a5.m19334a((float) bdj.m7587a(r0, map, "dx", 0), (float) bdj.m7587a(r0, map, "dy", 0));
            if (!this.f5649a) {
                blo.mo1319i().m1776r();
                this.f5649a = true;
            }
        } else if ("volume".equals(str)) {
            valueOf = (String) map.get("volume");
            if (valueOf == null) {
                bky.m9011e("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                a5.m19333a(Float.parseFloat(valueOf));
            } catch (NumberFormatException e4) {
                str = "Could not parse volume parameter from volume video GMSG: ";
                valueOf = String.valueOf(valueOf);
                bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("watermark".equals(str)) {
            a5.m19352m();
        } else {
            String str2 = "Unknown video action: ";
            valueOf = String.valueOf(str);
            bky.m9011e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
