package com.p000;

import android.net.Uri;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: brn */
class brn {
    /* renamed from: a */
    private static brn f7445a;
    /* renamed from: b */
    private volatile C1427a f7446b;
    /* renamed from: c */
    private volatile String f7447c;
    /* renamed from: d */
    private volatile String f7448d;
    /* renamed from: e */
    private volatile String f7449e;

    /* renamed from: brn$a */
    enum C1427a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    brn() {
        m10546e();
    }

    /* renamed from: a */
    static brn m10539a() {
        brn brn;
        synchronized (brn.class) {
            if (f7445a == null) {
                f7445a = new brn();
            }
            brn = f7445a;
        }
        return brn;
    }

    /* renamed from: a */
    private String m10540a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* renamed from: b */
    private String m10541b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    /* renamed from: a */
    synchronized boolean m10542a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), Utf8Charset.NAME);
                String str;
                String valueOf;
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    str = "Container preview url: ";
                    valueOf = String.valueOf(decode);
                    brd.m10498d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.f7446b = C1427a.CONTAINER_DEBUG;
                    } else {
                        this.f7446b = C1427a.CONTAINER;
                    }
                    this.f7449e = m10541b(uri);
                    if (this.f7446b == C1427a.CONTAINER || this.f7446b == C1427a.CONTAINER_DEBUG) {
                        decode = String.valueOf("/r?");
                        valueOf = String.valueOf(this.f7449e);
                        this.f7448d = valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode);
                    }
                    this.f7447c = m10540a(this.f7449e);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    str = "Invalid preview uri: ";
                    String valueOf2 = String.valueOf(decode);
                    brd.m10495b(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
                    z = false;
                } else if (m10540a(uri.getQuery()).equals(this.f7447c)) {
                    decode = "Exit preview mode for container: ";
                    valueOf = String.valueOf(this.f7447c);
                    brd.m10498d(valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode));
                    this.f7446b = C1427a.NONE;
                    this.f7448d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    C1427a m10543b() {
        return this.f7446b;
    }

    /* renamed from: c */
    String m10544c() {
        return this.f7448d;
    }

    /* renamed from: d */
    String m10545d() {
        return this.f7447c;
    }

    /* renamed from: e */
    void m10546e() {
        this.f7446b = C1427a.NONE;
        this.f7448d = null;
        this.f7447c = null;
        this.f7449e = null;
    }
}
