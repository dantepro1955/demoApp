package com.p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/* renamed from: dqx */
public abstract class dqx {
    /* renamed from: a */
    private byte[] f22646a;
    /* renamed from: b */
    private dqn f22647b;
    /* renamed from: c */
    private String f22648c = "";

    public dqx(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Buffer cannot be null");
        }
        this.f22646a = bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static boolean m28791a(byte[] r3) {
        /*
        r0 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x0016, all -> 0x0022 }
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ Exception -> 0x0016, all -> 0x0022 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0016, all -> 0x0022 }
        r2 = "UTF8";
        r0.<init>(r1, r2);	 Catch:{ Exception -> 0x0016, all -> 0x0022 }
        r0.close();	 Catch:{ IOException -> 0x0011 }
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x000f;
    L_0x0016:
        r0 = move-exception;
        r0 = 0;
        r0.close();	 Catch:{ IOException -> 0x001d }
    L_0x001b:
        r0 = 0;
        goto L_0x0010;
    L_0x001d:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x001b;
    L_0x0022:
        r0 = move-exception;
        r1 = 0;
        r1.close();	 Catch:{ IOException -> 0x0028 }
    L_0x0027:
        throw r0;
    L_0x0028:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: dqx.a(byte[]):boolean");
    }

    /* renamed from: a */
    public final void m28792a() throws IOException {
        try {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            InputSource inputSource = new InputSource(new ByteArrayInputStream(this.f22646a));
            if (!dqx.m28791a(this.f22646a)) {
                inputSource.setEncoding("cp1252");
            }
            XMLReader createXMLReader = XMLReaderFactory.createXMLReader();
            Object e = mo4555e();
            createXMLReader.setContentHandler(e);
            createXMLReader.parse(inputSource);
            this.f22647b = e.mo4556a();
        } catch (SAXException e2) {
            this.f22648c = e2.getMessage();
        }
    }

    /* renamed from: b */
    public final boolean m28793b() {
        return this.f22647b != null;
    }

    /* renamed from: c */
    public final dqn m28794c() {
        return this.f22647b;
    }

    /* renamed from: d */
    public final String m28795d() {
        return this.f22648c;
    }

    /* renamed from: e */
    protected abstract dqw mo4555e();
}
