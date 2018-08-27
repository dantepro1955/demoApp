package com.p000;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;

@bhd
/* renamed from: bft */
public class bft {
    /* renamed from: a */
    private final blo f5973a;
    /* renamed from: b */
    private final String f5974b;

    public bft(blo blo) {
        this(blo, "");
    }

    public bft(blo blo, String str) {
        this.f5973a = blo;
        this.f5974b = str;
    }

    /* renamed from: a */
    public void m8155a(int i, int i2, int i3, int i4) {
        try {
            this.f5973a.mo1029b("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            bky.m9007b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public void m8156a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f5973a.mo1029b("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (Throwable e) {
            bky.m9007b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: b */
    public void m8157b(int i, int i2, int i3, int i4) {
        try {
            this.f5973a.mo1029b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            bky.m9007b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public void m8158b(String str) {
        try {
            this.f5973a.mo1029b("onError", new JSONObject().put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str).put(NativeProtocol.WEB_DIALOG_ACTION, this.f5974b));
        } catch (Throwable e) {
            bky.m9007b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: c */
    public void m8159c(String str) {
        try {
            this.f5973a.mo1029b("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (Throwable e) {
            bky.m9007b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: d */
    public void m8160d(String str) {
        try {
            this.f5973a.mo1029b("onStateChanged", new JSONObject().put(ServerProtocol.DIALOG_PARAM_STATE, str));
        } catch (Throwable e) {
            bky.m9007b("Error occured while dispatching state change.", e);
        }
    }
}
