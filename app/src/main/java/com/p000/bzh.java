package com.p000;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.VastResourceXmlManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: VastResource */
/* renamed from: bzh */
public class bzh implements Serializable {
    /* renamed from: a */
    private static final List<String> f8284a = Arrays.asList(new String[]{"image/jpeg", "image/png", "image/bmp", "image/gif"});
    /* renamed from: b */
    private static final List<String> f8285b = Arrays.asList(new String[]{"application/x-javascript"});
    private static final long serialVersionUID = 0;
    /* renamed from: c */
    private String f8286c;
    /* renamed from: d */
    private C1618b f8287d;
    /* renamed from: e */
    private C1617a f8288e;
    /* renamed from: f */
    private int f8289f;
    /* renamed from: g */
    private int f8290g;

    /* compiled from: VastResource */
    /* renamed from: bzh$a */
    enum C1617a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: VastResource */
    /* renamed from: bzh$b */
    public enum C1618b {
        STATIC_RESOURCE,
        HTML_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: a */
    public static bzh m11889a(VastResourceXmlManager vastResourceXmlManager, C1618b c1618b, int i, int i2) {
        C1617a c1617a;
        Preconditions.checkNotNull(vastResourceXmlManager);
        Preconditions.checkNotNull(c1618b);
        String c = vastResourceXmlManager.c();
        String d = vastResourceXmlManager.d();
        String a = vastResourceXmlManager.a();
        String b = vastResourceXmlManager.b();
        if (c1618b != C1618b.STATIC_RESOURCE || a == null || b == null || !(f8284a.contains(b) || f8285b.contains(b))) {
            if (c1618b == C1618b.HTML_RESOURCE && d != null) {
                c1617a = C1617a.NONE;
                a = d;
            } else if (c1618b != C1618b.IFRAME_RESOURCE || c == null) {
                return null;
            } else {
                c1617a = C1617a.NONE;
                a = c;
            }
        } else if (f8284a.contains(b)) {
            c1617a = C1617a.IMAGE;
        } else {
            c1617a = C1617a.JAVASCRIPT;
        }
        return new bzh(a, c1618b, c1617a, i, i2);
    }

    bzh(String str, C1618b c1618b, C1617a c1617a, int i, int i2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(c1618b);
        Preconditions.checkNotNull(c1617a);
        this.f8286c = str;
        this.f8287d = c1618b;
        this.f8288e = c1617a;
        this.f8289f = i;
        this.f8290g = i2;
    }

    public String getResource() {
        return this.f8286c;
    }

    public C1618b getType() {
        return this.f8287d;
    }

    public C1617a getCreativeType() {
        return this.f8288e;
    }

    public void initializeWebView(bzi bzi) {
        Preconditions.checkNotNull(bzi);
        if (this.f8287d == C1618b.IFRAME_RESOURCE) {
            bzi.m11896a("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f8289f + "\" height=\"" + this.f8290g + "\" src=\"" + this.f8286c + "\"></iframe>");
        } else if (this.f8287d == C1618b.HTML_RESOURCE) {
            bzi.m11896a(this.f8286c);
        } else if (this.f8287d != C1618b.STATIC_RESOURCE) {
        } else {
            if (this.f8288e == C1617a.IMAGE) {
                bzi.m11896a("<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f8286c + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            } else if (this.f8288e == C1617a.JAVASCRIPT) {
                bzi.m11896a("<script src=\"" + this.f8286c + "\"></script>");
            }
        }
    }

    public String getCorrectClickThroughUrl(String str, String str2) {
        switch (this.f8287d) {
            case STATIC_RESOURCE:
                if (C1617a.IMAGE == this.f8288e) {
                    return str;
                }
                if (C1617a.JAVASCRIPT != this.f8288e) {
                    return null;
                }
                return str2;
            case HTML_RESOURCE:
            case IFRAME_RESOURCE:
                return str2;
            default:
                return null;
        }
    }
}
