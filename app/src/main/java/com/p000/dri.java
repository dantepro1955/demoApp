package com.p000;

import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.io.InputStream;
import java.util.Vector;

/* compiled from: GifDecoder */
/* renamed from: dri */
public class dri {
    /* renamed from: a */
    protected InputStream f22684a;
    /* renamed from: b */
    protected int f22685b;
    /* renamed from: c */
    protected int f22686c;
    /* renamed from: d */
    protected int f22687d;
    /* renamed from: e */
    protected boolean f22688e;
    /* renamed from: f */
    protected int f22689f;
    /* renamed from: g */
    protected int f22690g = 1;
    /* renamed from: h */
    protected int[] f22691h;
    /* renamed from: i */
    protected int[] f22692i;
    /* renamed from: j */
    protected int f22693j;
    /* renamed from: k */
    protected int f22694k;
    /* renamed from: l */
    protected int f22695l;
    /* renamed from: m */
    protected byte[] f22696m = new byte[256];
    /* renamed from: n */
    protected int f22697n = 0;
    /* renamed from: o */
    protected int f22698o = 0;
    /* renamed from: p */
    protected int f22699p = 0;
    /* renamed from: q */
    protected boolean f22700q = false;
    /* renamed from: r */
    protected int f22701r = 0;
    /* renamed from: s */
    protected Vector<Object> f22702s;
    /* renamed from: t */
    protected int f22703t;

    /* renamed from: a */
    public int m28835a() {
        return this.f22686c;
    }

    /* renamed from: b */
    public int m28838b() {
        return this.f22687d;
    }

    /* renamed from: a */
    public int m28836a(InputStream inputStream) {
        m28840d();
        if (inputStream != null) {
            this.f22684a = inputStream;
            m28842f();
        } else {
            this.f22685b = 2;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
        }
        return this.f22685b;
    }

    /* renamed from: c */
    protected boolean m28839c() {
        return this.f22685b != 0;
    }

    /* renamed from: d */
    protected void m28840d() {
        this.f22685b = 0;
        this.f22703t = 0;
        this.f22702s = new Vector();
        this.f22691h = null;
        this.f22692i = null;
    }

    /* renamed from: e */
    protected int m28841e() {
        int i = 0;
        try {
            i = this.f22684a.read();
        } catch (Exception e) {
            this.f22685b = 1;
        }
        return i;
    }

    /* renamed from: a */
    protected int[] m28837a(int i) {
        int read;
        int i2 = 0;
        int i3 = i * 3;
        int[] iArr = null;
        byte[] bArr = new byte[i3];
        try {
            read = this.f22684a.read(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            read = 0;
        }
        if (read < i3) {
            this.f22685b = 1;
        } else {
            iArr = new int[256];
            read = 0;
            while (i2 < i) {
                i3 = read + 1;
                int i4 = bArr[read] & 255;
                int i5 = i3 + 1;
                int i6 = bArr[i3] & 255;
                read = i5 + 1;
                i3 = i2 + 1;
                iArr[i2] = (((i4 << 16) | CtaButton.BACKGROUND_COLOR) | (i6 << 8)) | (bArr[i5] & 255);
                i2 = i3;
            }
        }
        return iArr;
    }

    /* renamed from: f */
    protected void m28842f() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m28841e());
        }
        if (str.startsWith("GIF")) {
            m28843g();
            if (this.f22688e && !m28839c()) {
                this.f22691h = m28837a(this.f22689f);
                this.f22694k = this.f22691h[this.f22693j];
                return;
            }
            return;
        }
        this.f22685b = 1;
    }

    /* renamed from: g */
    protected void m28843g() {
        this.f22686c = m28844h();
        this.f22687d = m28844h();
        int e = m28841e();
        this.f22688e = (e & 128) != 0;
        this.f22689f = 2 << (e & 7);
        this.f22693j = m28841e();
        this.f22695l = m28841e();
    }

    /* renamed from: h */
    protected int m28844h() {
        return m28841e() | (m28841e() << 8);
    }
}
