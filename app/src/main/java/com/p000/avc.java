package com.p000;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: avc */
public class avc {
    /* renamed from: e */
    private static final String[] f4648e = new String[]{"/aclk", "/pcs/click"};
    /* renamed from: a */
    private String f4649a = "googleads.g.doubleclick.net";
    /* renamed from: b */
    private String f4650b = "/pagead/ads";
    /* renamed from: c */
    private String f4651c = "ad.doubleclick.net";
    /* renamed from: d */
    private String[] f4652d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    /* renamed from: f */
    private auh f4653f;

    public avc(auh auh) {
        this.f4653f = auh;
    }

    /* renamed from: a */
    private Uri m5924a(Uri uri, Context context, String str, boolean z, View view) throws avd {
        try {
            boolean b = m5935b(uri);
            if (b) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new avd("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new avd("Query parameter already exists: ms");
            }
            String a = z ? this.f4653f.mo291a(context, str, view) : this.f4653f.mo290a(context);
            return b ? m5926b(uri, "dc_ms", a) : m5925a(uri, "ms", a);
        } catch (UnsupportedOperationException e) {
            throw new avd("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private Uri m5925a(Uri uri, String str, String str2) throws UnsupportedOperationException {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* renamed from: b */
    private Uri m5926b(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append(";").append(uri2.substring(indexOf + 1)).toString());
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str).append("=").append(str2).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
    }

    /* renamed from: a */
    public Uri m5927a(Uri uri, Context context) throws avd {
        return m5924a(uri, context, null, false, null);
    }

    /* renamed from: a */
    public Uri m5928a(Uri uri, Context context, View view) throws avd {
        try {
            return m5924a(uri, context, uri.getQueryParameter("ai"), true, view);
        } catch (UnsupportedOperationException e) {
            throw new avd("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public auh m5929a() {
        return this.f4653f;
    }

    /* renamed from: a */
    public void m5930a(MotionEvent motionEvent) {
        this.f4653f.mo293a(motionEvent);
    }

    /* renamed from: a */
    public void m5931a(String str) {
        this.f4652d = str.split(",");
    }

    /* renamed from: a */
    public void m5932a(String str, String str2) {
        this.f4649a = str;
        this.f4650b = str2;
    }

    /* renamed from: a */
    public boolean m5933a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f4649a) && uri.getPath().equals(this.f4650b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: b */
    public Uri m5934b(Uri uri, Context context) throws avd {
        return m5928a(uri, context, null);
    }

    /* renamed from: b */
    public boolean m5935b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f4651c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m5936c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f4652d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m5937d(Uri uri) {
        if (!m5936c(uri)) {
            return false;
        }
        for (String endsWith : f4648e) {
            if (uri.getPath().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
