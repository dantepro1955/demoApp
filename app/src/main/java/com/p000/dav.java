package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.tv.model.PostDao;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

/* compiled from: OneSignalRestClient */
/* renamed from: dav */
class dav {

    /* compiled from: OneSignalRestClient */
    /* renamed from: dav$a */
    static class C4750a {
        C4750a() {
        }

        /* renamed from: a */
        void mo4303a(String str) {
        }

        /* renamed from: a */
        void mo4302a(int i, String str, Throwable th) {
        }
    }

    /* renamed from: a */
    static void m26113a(final String str, final JSONObject jSONObject, final C4750a c4750a) {
        new Thread(new Runnable() {
            public void run() {
                dav.m26114b(str, "PUT", jSONObject, c4750a);
            }
        }).start();
    }

    /* renamed from: b */
    static void m26115b(final String str, final JSONObject jSONObject, final C4750a c4750a) {
        new Thread(new Runnable() {
            public void run() {
                dav.m26114b(str, PostDao.TABLENAME, jSONObject, c4750a);
            }
        }).start();
    }

    /* renamed from: c */
    static void m26116c(String str, JSONObject jSONObject, C4750a c4750a) {
        dav.m26114b(str, "PUT", jSONObject, c4750a);
    }

    /* renamed from: d */
    static void m26117d(String str, JSONObject jSONObject, C4750a c4750a) {
        dav.m26114b(str, PostDao.TABLENAME, jSONObject, c4750a);
    }

    /* renamed from: b */
    private static void m26114b(String str, String str2, JSONObject jSONObject, C4750a c4750a) {
        int i;
        HttpURLConnection httpURLConnection;
        Throwable th;
        String str3 = null;
        int i2 = -1;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://onesignal.com/api/v1/" + str).openConnection();
            try {
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setConnectTimeout(120000);
                httpURLConnection2.setReadTimeout(120000);
                if (jSONObject != null) {
                    httpURLConnection2.setDoInput(true);
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
                httpURLConnection2.setRequestMethod(str2);
                if (jSONObject != null) {
                    String jSONObject2 = jSONObject.toString();
                    dat.a(dat$c.DEBUG, str2 + " SEND JSON: " + jSONObject2);
                    byte[] bytes = jSONObject2.getBytes(Utf8Charset.NAME);
                    httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                    httpURLConnection2.getOutputStream().write(bytes);
                }
                i2 = httpURLConnection2.getResponseCode();
                if (i2 == HttpStatus.HTTP_OK) {
                    Scanner scanner = new Scanner(httpURLConnection2.getInputStream(), Utf8Charset.NAME);
                    str3 = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                    scanner.close();
                    dat.a(dat$c.DEBUG, str2 + " RECEIVED JSON: " + str3);
                    if (c4750a != null) {
                        c4750a.mo4303a(str3);
                    }
                } else {
                    InputStream errorStream = httpURLConnection2.getErrorStream();
                    if (errorStream == null) {
                        errorStream = httpURLConnection2.getInputStream();
                    }
                    if (errorStream != null) {
                        Scanner scanner2 = new Scanner(errorStream, Utf8Charset.NAME);
                        str3 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                        scanner2.close();
                        dat.a(dat$c.WARN, str2 + " RECEIVED JSON: " + str3);
                    } else {
                        dat.a(dat$c.WARN, str2 + " HTTP Code: " + i2 + " No response body!");
                    }
                    if (c4750a != null) {
                        c4750a.mo4302a(i2, str3, null);
                    }
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Throwable th2) {
                httpURLConnection = httpURLConnection2;
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
