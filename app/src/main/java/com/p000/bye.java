package com.p000;

import android.util.Log;
import com.facebook.common.util.ByteConstants;
import com.facebook.stetho.common.Utf8Charset;
import com.inmobi.monetization.internal.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: MoatNetImpl */
/* renamed from: bye */
enum bye implements byd {
    instance;

    /* renamed from: a */
    private String m11733a(InputStream inputStream) throws IOException {
        char[] cArr = new char[256];
        StringBuilder stringBuilder = new StringBuilder();
        Reader inputStreamReader = new InputStreamReader(inputStream, Utf8Charset.NAME);
        int i = 0;
        do {
            int read = inputStreamReader.read(cArr, 0, cArr.length);
            if (read <= 0) {
                break;
            }
            i += read;
            stringBuilder.append(cArr, 0, read);
        } while (i < ByteConstants.KB);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public byv<String> mo1603a(String str) {
        byv<String> a;
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(Constants.HTTP_TIMEOUT);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                a = byv.m11830a();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                }
            } else {
                inputStream = httpURLConnection.getInputStream();
                a = byv.m11831a(m11733a(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                    }
                }
            }
        } catch (Throwable e3) {
            if (bxu.f8112a.booleanValue()) {
                Log.e("MoatNetImpl", "On/off status check error: " + Log.getStackTraceString(e3));
            }
            a = byv.m11830a();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                }
            }
        }
        return a;
    }
}
