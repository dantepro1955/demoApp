package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.GraphResponse;
import com.google.android.gms.internal.zzqh;
import com.millennialmedia.NativeAd;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: bcz */
public class bcz implements bcy {
    /* renamed from: a */
    private final Context f5633a;
    /* renamed from: b */
    private final zzqh f5634b;

    @bhd
    /* renamed from: bcz$a */
    static class C1043a {
        /* renamed from: a */
        private final String f5620a;
        /* renamed from: b */
        private final String f5621b;

        public C1043a(String str, String str2) {
            this.f5620a = str;
            this.f5621b = str2;
        }

        /* renamed from: a */
        public String m7533a() {
            return this.f5620a;
        }

        /* renamed from: b */
        public String m7534b() {
            return this.f5621b;
        }
    }

    @bhd
    /* renamed from: bcz$b */
    static class C1044b {
        /* renamed from: a */
        private final String f5622a;
        /* renamed from: b */
        private final URL f5623b;
        /* renamed from: c */
        private final ArrayList<C1043a> f5624c;
        /* renamed from: d */
        private final String f5625d;

        public C1044b(String str, URL url, ArrayList<C1043a> arrayList, String str2) {
            this.f5622a = str;
            this.f5623b = url;
            if (arrayList == null) {
                this.f5624c = new ArrayList();
            } else {
                this.f5624c = arrayList;
            }
            this.f5625d = str2;
        }

        /* renamed from: a */
        public String m7535a() {
            return this.f5622a;
        }

        /* renamed from: b */
        public URL m7536b() {
            return this.f5623b;
        }

        /* renamed from: c */
        public ArrayList<C1043a> m7537c() {
            return this.f5624c;
        }

        /* renamed from: d */
        public String m7538d() {
            return this.f5625d;
        }
    }

    @bhd
    /* renamed from: bcz$c */
    class C1045c {
        /* renamed from: a */
        private final C1046d f5626a;
        /* renamed from: b */
        private final boolean f5627b;
        /* renamed from: c */
        private final String f5628c;

        public C1045c(bcz bcz, boolean z, C1046d c1046d, String str) {
            this.f5627b = z;
            this.f5626a = c1046d;
            this.f5628c = str;
        }

        /* renamed from: a */
        public String m7539a() {
            return this.f5628c;
        }

        /* renamed from: b */
        public C1046d m7540b() {
            return this.f5626a;
        }

        /* renamed from: c */
        public boolean m7541c() {
            return this.f5627b;
        }
    }

    @bhd
    /* renamed from: bcz$d */
    static class C1046d {
        /* renamed from: a */
        private final String f5629a;
        /* renamed from: b */
        private final int f5630b;
        /* renamed from: c */
        private final List<C1043a> f5631c;
        /* renamed from: d */
        private final String f5632d;

        public C1046d(String str, int i, List<C1043a> list, String str2) {
            this.f5629a = str;
            this.f5630b = i;
            if (list == null) {
                this.f5631c = new ArrayList();
            } else {
                this.f5631c = list;
            }
            this.f5632d = str2;
        }

        /* renamed from: a */
        public String m7542a() {
            return this.f5629a;
        }

        /* renamed from: b */
        public int m7543b() {
            return this.f5630b;
        }

        /* renamed from: c */
        public Iterable<C1043a> m7544c() {
            return this.f5631c;
        }

        /* renamed from: d */
        public String m7545d() {
            return this.f5632d;
        }
    }

    public bcz(Context context, zzqh zzqh) {
        this.f5633a = context;
        this.f5634b = zzqh;
    }

    /* renamed from: a */
    protected C1044b m7546a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            bky.m9007b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C1043a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C1044b(optString, url, arrayList, optString3);
    }

    /* renamed from: a */
    protected C1045c m7547a(C1044b c1044b) {
        Exception e;
        HttpURLConnection httpURLConnection;
        C1045c c1045c;
        Throwable th;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) c1044b.m7536b().openConnection();
            try {
                ako.m2343e().m9103a(this.f5633a, this.f5634b.f15121a, false, httpURLConnection3);
                Iterator it = c1044b.m7537c().iterator();
                while (it.hasNext()) {
                    C1043a c1043a = (C1043a) it.next();
                    httpURLConnection3.addRequestProperty(c1043a.m7533a(), c1043a.m7534b());
                }
                if (!TextUtils.isEmpty(c1044b.m7538d())) {
                    httpURLConnection3.setDoOutput(true);
                    byte[] bytes = c1044b.m7538d().getBytes();
                    httpURLConnection3.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection3.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                }
                List arrayList = new ArrayList();
                if (httpURLConnection3.getHeaderFields() != null) {
                    for (Entry entry : httpURLConnection3.getHeaderFields().entrySet()) {
                        for (String c1043a2 : (List) entry.getValue()) {
                            arrayList.add(new C1043a((String) entry.getKey(), c1043a2));
                        }
                    }
                }
                C1045c c1045c2 = new C1045c(this, true, new C1046d(c1044b.m7535a(), httpURLConnection3.getResponseCode(), arrayList, ako.m2343e().m9089a(new InputStreamReader(httpURLConnection3.getInputStream()))), null);
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return c1045c2;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                try {
                    c1045c = new C1045c(this, false, null, e.toString());
                    if (httpURLConnection != null) {
                        return c1045c;
                    }
                    httpURLConnection.disconnect();
                    return c1045c;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                httpURLConnection2 = httpURLConnection3;
                th = th4;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            httpURLConnection = null;
            e = e3;
            c1045c = new C1045c(this, false, null, e.toString());
            if (httpURLConnection != null) {
                return c1045c;
            }
            httpURLConnection.disconnect();
            return c1045c;
        } catch (Throwable th5) {
            th = th5;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    protected JSONObject m7548a(C1046d c1046d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c1046d.m7542a());
            if (c1046d.m7545d() != null) {
                jSONObject.put(NativeAd.COMPONENT_ID_BODY, c1046d.m7545d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C1043a c1043a : c1046d.m7544c()) {
                jSONArray.put(new JSONObject().put("key", c1043a.m7533a()).put("value", c1043a.m7534b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c1046d.m7543b());
        } catch (Throwable e) {
            bky.m9007b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONObject m7549a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                C1045c a = m7547a(m7546a(jSONObject));
                if (a.m7541c()) {
                    jSONObject2.put("response", m7548a(a.m7540b()));
                    jSONObject2.put(GraphResponse.SUCCESS_KEY, true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put(GraphResponse.SUCCESS_KEY, false);
                jSONObject2.put("reason", a.m7539a());
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                    jSONObject2.put(GraphResponse.SUCCESS_KEY, false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            bky.m9008c("The request is not a valid JSON.");
            try {
                return new JSONObject().put(GraphResponse.SUCCESS_KEY, false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    /* renamed from: a */
    public void mo277a(final blo blo, final Map<String, String> map) {
        bkf.m9059a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bcz f5619c;

            public void run() {
                bky.m9006b("Received Http request.");
                final JSONObject a = this.f5619c.m7549a((String) map.get("http_request"));
                if (a == null) {
                    bky.m9008c("Response should not be null.");
                } else {
                    bkg.f6710a.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C10421 f5616b;

                        public void run() {
                            blo.mo1029b("fetchHttpRequestCompleted", a);
                            bky.m9006b("Dispatched http response.");
                        }
                    });
                }
            }
        });
    }
}
