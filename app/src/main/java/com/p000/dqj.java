package com.p000;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: dqj */
public final class dqj {
    /* renamed from: a */
    private static SSLSocketFactory f22601a;
    /* renamed from: b */
    private static SSLContext f22602b;
    /* renamed from: c */
    private static dqk[] f22603c = new dqk[1];

    /* renamed from: a */
    public static Socket m28734a(String str, int i, dql dql) throws UnknownHostException, IOException, SecurityException {
        try {
            f22603c[0] = new dqk(dql);
            SSLContext instance = SSLContext.getInstance("TLS");
            f22602b = instance;
            instance.init(null, (TrustManager[]) f22603c, null);
            f22601a = f22602b.getSocketFactory();
            return f22601a.createSocket(str, i);
        } catch (NoSuchAlgorithmException e) {
            throw new SecurityException("No such algorithm exception " + e);
        } catch (KeyManagementException e2) {
            throw new SecurityException("Failed to initialize the client-side SSLContext " + e2);
        } catch (GeneralSecurityException e3) {
            throw new SecurityException("General security exception " + e3);
        }
    }
}
