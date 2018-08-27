package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.lib.network.model.Constants;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/* compiled from: UrlUtil */
/* renamed from: djz */
public class djz {
    /* renamed from: a */
    public static String m27646a(String str) throws MalformedURLException {
        String path = new URL(str).getPath();
        if (path != null) {
            return path.substring(path.lastIndexOf(Constants.SEP) + 1);
        }
        return null;
    }

    /* renamed from: b */
    public static String m27647b(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Utf8Charset.NAME);
    }

    /* renamed from: c */
    public static String m27648c(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Utf8Charset.NAME).replace("+", "%20");
    }
}
