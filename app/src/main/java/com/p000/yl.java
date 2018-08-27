package com.p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.lib.network.model.Constants;
import java.io.InputStream;
import java.util.Scanner;
import org.json.JSONObject;

/* renamed from: yl */
class yl {
    /* renamed from: a */
    private static final int[] f26044a = new int[]{7, 4, 2, 1, 11};
    /* renamed from: b */
    private static final int[] f26045b = new int[]{5, 6, 10, 3, 9, 8, 14};
    /* renamed from: c */
    private static final int[] f26046c = new int[]{15, 12, 13};
    /* renamed from: d */
    private static final String f26047d = yl.class.getSimpleName();

    yl() {
    }

    /* renamed from: a */
    private static NetworkInfo m34910a(Context context) {
        if (ym.m34920a("android.permission.ACCESS_NETWORK_STATE", context)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
        }
        return null;
    }

    /* renamed from: a */
    static String m34911a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        Scanner scanner = new Scanner(inputStream, Utf8Charset.NAME);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m34912a(String str, vm vmVar) {
        if (str == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else {
            String str2 = (String) vmVar.m34391a(wp.f25901e);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String) vmVar.m34391a(wp.f25906j));
            stringBuilder.append(str);
            if (str2 == null || str2.length() <= 0) {
                stringBuilder.append("?api_key=");
                stringBuilder.append(vmVar.mo5557a());
            } else {
                stringBuilder.append("?device_token=");
                stringBuilder.append(str2);
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    static String m34913a(vm vmVar) {
        NetworkInfo a = yl.m34910a(vmVar.m34404i());
        if (a == null) {
            return "unknown";
        }
        int type = a.getType();
        int subtype = a.getSubtype();
        String str = type == 1 ? "wifi" : type == 0 ? yl.m34917a(subtype, f26044a) ? "2g" : yl.m34917a(subtype, f26045b) ? "3g" : yl.m34917a(subtype, f26046c) ? "4g" : "mobile" : "unknown";
        vmVar.mo5561g().mo5606a(f26047d, "Network " + type + Constants.SEP + subtype + " resolved to " + str);
        return str;
    }

    /* renamed from: a */
    static JSONObject m34914a(JSONObject jSONObject) {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    static void m34915a(int i, vm vmVar) {
        ws h = vmVar.m34403h();
        if (i == 401) {
            h.m34657a(wp.f25899c, "");
            h.m34657a(wp.f25901e, "");
            h.m34659b();
        } else if (i == 418) {
            h.m34657a(wp.f25897a, Boolean.valueOf(true));
            h.m34659b();
        } else if (i >= 400 && i < HttpStatus.HTTP_INTERNAL_SERVER_ERROR) {
            vmVar.m34420y();
        } else if (i == -1) {
            vmVar.m34420y();
        }
    }

    /* renamed from: a */
    static void m34916a(JSONObject jSONObject, vm vmVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else {
            try {
                if (jSONObject.has("settings")) {
                    ws h = vmVar.m34403h();
                    if (!jSONObject.isNull("settings")) {
                        h.m34656a(jSONObject.getJSONObject("settings"));
                        h.m34659b();
                        vmVar.mo5561g().mo5606a(f26047d, "New settings processed");
                    }
                }
            } catch (Throwable e) {
                vmVar.mo5561g().mo5609b(f26047d, "Unable to parse settings out of API response", e);
            }
        }
    }

    /* renamed from: a */
    private static boolean m34917a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static String m34918b(String str, vm vmVar) {
        if (str == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (vmVar != null) {
            return ((String) vmVar.m34391a(wp.f25907k)) + str;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: b */
    static void m34919b(int i, vm vmVar) {
        if (i == 418) {
            ws h = vmVar.m34403h();
            h.m34657a(wp.f25897a, Boolean.valueOf(true));
            h.m34659b();
        }
    }
}
