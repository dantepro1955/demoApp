package com.p000;

import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.tv.model.PostDao;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yj */
class yj {
    /* renamed from: a */
    private final vm f26042a;
    /* renamed from: b */
    private final zi f26043b;

    yj(vm vmVar) {
        this.f26042a = vmVar;
        this.f26043b = vmVar.mo5561g();
    }

    /* renamed from: a */
    private int m34898a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return -102;
        }
        if (!(th instanceof IOException)) {
            return th instanceof JSONException ? -104 : -1;
        } else {
            String message = th.getMessage();
            return (message == null || !message.toLowerCase(Locale.ENGLISH).contains("authentication challenge")) ? -100 : 401;
        }
    }

    /* renamed from: a */
    private HttpURLConnection m34899a(String str, String str2, int i) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(i < 0 ? ((Integer) this.f26042a.m34391a(wp.f25911o)).intValue() : i);
        if (i < 0) {
            i = ((Integer) this.f26042a.m34391a(wp.f25913q)).intValue();
        }
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static void m34900a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    private void m34901a(String str, int i, String str2, yk ykVar) {
        this.f26043b.mo5606a("ConnectionManager", i + " received from from \"" + str2 + "\": " + str);
        if (i < HttpStatus.HTTP_OK || i >= GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION) {
            this.f26043b.mo5612d("ConnectionManager", i + " error received from \"" + str2 + "\"");
            ykVar.mo5589a(i);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!(i == 204 || str == null || str.length() <= 2)) {
            jSONObject = new JSONObject(str);
        }
        ykVar.mo5590a(jSONObject, i);
    }

    /* renamed from: a */
    private void m34902a(String str, String str2, int i, long j) {
        this.f26043b.mo5608b("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s" + " over " + yl.m34913a(this.f26042a) + " to \"" + str2 + "\"");
    }

    /* renamed from: a */
    private void m34903a(String str, String str2, int i, long j, Throwable th) {
        this.f26043b.mo5609b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s" + " over " + yl.m34913a(this.f26042a) + " to \"" + str2 + "\"", th);
    }

    /* renamed from: a */
    private static void m34904a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    void m34905a(String str, int i, JSONObject jSONObject, boolean z, yk ykVar) {
        m34908a(str, PostDao.TABLENAME, i, jSONObject, z, ykVar);
    }

    /* renamed from: a */
    void m34906a(String str, int i, yk ykVar) {
        m34908a(str, "GET", i, null, true, ykVar);
    }

    /* renamed from: a */
    void m34907a(String str, int i, boolean z, yk ykVar) {
        m34908a(str, "GET", i, null, z, ykVar);
    }

    /* renamed from: a */
    void m34908a(String str, String str2, int i, JSONObject jSONObject, boolean z, yk ykVar) {
        HttpURLConnection a;
        Throwable th;
        Throwable th2;
        if (str == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No method specified");
        } else if (ykVar == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (str.toLowerCase().startsWith("http")) {
            String str3;
            if (!((Boolean) this.f26042a.m34391a(wp.aX)).booleanValue() || str.contains("https://")) {
                str3 = str;
            } else {
                this.f26042a.mo5561g().mo5610c("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                str3 = str.replace("http://", "https://");
            }
            long currentTimeMillis = System.currentTimeMillis();
            InputStream inputStream = null;
            int i2 = -1;
            try {
                InputStream inputStream2;
                this.f26043b.mo5608b("ConnectionManager", "Sending " + str2 + " request to \"" + str3 + "\"...");
                a = m34899a(str3, str2, i);
                if (jSONObject != null) {
                    try {
                        String jSONObject2 = jSONObject.toString();
                        this.f26043b.mo5606a("ConnectionManager", "Request to \"" + str3 + "\" is " + jSONObject2);
                        a.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
                        a.setDoOutput(true);
                        a.setFixedLengthStreamingMode(jSONObject2.getBytes(Charset.forName(Utf8Charset.NAME)).length);
                        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(a.getOutputStream(), "UTF8"));
                        printWriter.print(jSONObject2);
                        printWriter.close();
                    } catch (Throwable th3) {
                        th = th3;
                        if (i2 == 0) {
                            try {
                                i2 = m34898a(th);
                            } catch (Throwable th4) {
                                th2 = th4;
                                yj.m34900a(inputStream);
                                yj.m34904a(a);
                                throw th2;
                            }
                        }
                        m34903a(str2, str3, i2, currentTimeMillis, th);
                        ykVar.mo5589a(i2);
                        yj.m34900a(inputStream);
                        yj.m34904a(a);
                    }
                }
                try {
                    i2 = a.getResponseCode();
                    if (i2 > 0) {
                        m34902a(str2, str3, i2, currentTimeMillis);
                        if (z) {
                            inputStream2 = a.getInputStream();
                            try {
                                m34901a(yl.m34911a(inputStream2), a.getResponseCode(), str3, ykVar);
                            } catch (MalformedURLException e) {
                                if (z) {
                                    ykVar.mo5590a(new JSONObject(), -901);
                                    yj.m34900a(inputStream2);
                                    yj.m34904a(a);
                                }
                                try {
                                    ykVar.mo5589a(-901);
                                    yj.m34900a(inputStream2);
                                    yj.m34904a(a);
                                } catch (Throwable th5) {
                                    inputStream = inputStream2;
                                    th2 = th5;
                                    yj.m34900a(inputStream);
                                    yj.m34904a(a);
                                    throw th2;
                                }
                            }
                        }
                        ykVar.mo5590a(new JSONObject(), i2);
                        inputStream2 = null;
                    } else {
                        m34903a(str2, str3, i2, currentTimeMillis, null);
                        ykVar.mo5589a(i2);
                        inputStream2 = null;
                    }
                } catch (MalformedURLException e2) {
                    inputStream2 = null;
                    if (z) {
                        ykVar.mo5590a(new JSONObject(), -901);
                        yj.m34900a(inputStream2);
                        yj.m34904a(a);
                    }
                    ykVar.mo5589a(-901);
                    yj.m34900a(inputStream2);
                    yj.m34904a(a);
                }
                yj.m34900a(inputStream2);
                yj.m34904a(a);
            } catch (Throwable th52) {
                a = null;
                th2 = th52;
                yj.m34900a(inputStream);
                yj.m34904a(a);
                throw th2;
            }
        } else {
            this.f26043b.mo5613e("ConnectionManager", "Requested postback submission to non HTTP endpoint " + str + "; skipping...");
            ykVar.mo5589a(-900);
        }
    }

    /* renamed from: a */
    void m34909a(String str, JSONObject jSONObject, yk ykVar) {
        m34908a(str, PostDao.TABLENAME, -1, jSONObject, true, ykVar);
    }
}
