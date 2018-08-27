package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore */
/* renamed from: aby */
class aby {
    /* renamed from: a */
    private static final Charset f300a = Charset.forName(Utf8Charset.NAME);
    /* renamed from: b */
    private final File f301b;

    public aby(File file) {
        this.f301b = file;
    }

    /* renamed from: a */
    public void m401a(String str, acn acn) {
        Throwable e;
        File c = m396c(str);
        Closeable closeable = null;
        Closeable bufferedWriter;
        try {
            String a = aby.m394a(acn);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f300a));
            try {
                bufferedWriter.write(a);
                bufferedWriter.flush();
                CommonUtils.a(bufferedWriter, "Failed to close user metadata file.");
            } catch (Exception e2) {
                e = e2;
                try {
                    Fabric.h().e("CrashlyticsCore", "Error serializing user metadata.", e);
                    CommonUtils.a(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    e = th;
                    closeable = bufferedWriter;
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bufferedWriter = null;
            Fabric.h().e("CrashlyticsCore", "Error serializing user metadata.", e);
            CommonUtils.a(bufferedWriter, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            e = th2;
            CommonUtils.a(closeable, "Failed to close user metadata file.");
            throw e;
        }
    }

    /* renamed from: a */
    public acn m400a(String str) {
        Closeable fileInputStream;
        Throwable e;
        File c = m396c(str);
        if (!c.exists()) {
            return acn.f370a;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                acn e2 = aby.m398e(CommonUtils.a(fileInputStream));
                CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                return e2;
            } catch (Exception e3) {
                e = e3;
                try {
                    Fabric.h().e("CrashlyticsCore", "Error deserializing user metadata.", e);
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    return acn.f370a;
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    throw e;
                }
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
            Fabric.h().e("CrashlyticsCore", "Error deserializing user metadata.", e);
            CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
            return acn.f370a;
        } catch (Throwable th2) {
            e = th2;
            fileInputStream = null;
            CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
            throw e;
        }
    }

    /* renamed from: b */
    public Map<String, String> m402b(String str) {
        Closeable fileInputStream;
        Throwable e;
        File d = m397d(str);
        if (!d.exists()) {
            return Collections.emptyMap();
        }
        try {
            fileInputStream = new FileInputStream(d);
            try {
                Map<String, String> f = aby.m399f(CommonUtils.a(fileInputStream));
                CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                return f;
            } catch (Exception e2) {
                e = e2;
                try {
                    Fabric.h().e("CrashlyticsCore", "Error deserializing user metadata.", e);
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            Fabric.h().e("CrashlyticsCore", "Error deserializing user metadata.", e);
            CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            e = th2;
            fileInputStream = null;
            CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
            throw e;
        }
    }

    /* renamed from: c */
    private File m396c(String str) {
        return new File(this.f301b, str + "user" + ".meta");
    }

    /* renamed from: d */
    private File m397d(String str) {
        return new File(this.f301b, str + "keys" + ".meta");
    }

    /* renamed from: e */
    private static acn m398e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new acn(aby.m395a(jSONObject, "userId"), aby.m395a(jSONObject, "userName"), aby.m395a(jSONObject, "userEmail"));
    }

    /* renamed from: a */
    private static String m394a(final acn acn) throws JSONException {
        return new JSONObject() {
        }.toString();
    }

    /* renamed from: f */
    private static Map<String, String> m399f(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        Map<String, String> hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            hashMap.put(str2, aby.m395a(jSONObject, str2));
        }
        return hashMap;
    }

    /* renamed from: a */
    private static String m395a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }
}
