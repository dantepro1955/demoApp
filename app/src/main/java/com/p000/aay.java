package com.p000;

import java.io.IOException;
import org.json.JSONObject;

/* compiled from: CheckForUpdatesResponseTransform */
/* renamed from: aay */
class aay {
    aay() {
    }

    /* renamed from: a */
    public aax m136a(JSONObject jSONObject) throws IOException {
        if (jSONObject == null) {
            return null;
        }
        return new aax(jSONObject.optString("url", null), jSONObject.optString("version_string", null), jSONObject.optString("display_version", null), jSONObject.optString("build_version", null), jSONObject.optString("identifier", null), jSONObject.optString("instance_identifier", null));
    }
}
