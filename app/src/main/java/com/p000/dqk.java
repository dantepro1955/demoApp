package com.p000;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: dqk */
public final class dqk implements X509TrustManager {
    /* renamed from: b */
    private static X509TrustManager f22604b;
    /* renamed from: a */
    private dql f22605a;

    public dqk(dql dql) throws GeneralSecurityException {
        this.f22605a = dql;
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(null);
        f22604b = (X509TrustManager) instance.getTrustManagers()[0];
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Object obj = null;
        try {
            f22604b.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            if (!this.f22605a.f22606a) {
                throw e;
            }
        }
        if (this.f22605a.f22607b != null) {
            Object obj2;
            for (X509Certificate subjectDN : x509CertificateArr) {
                String name = subjectDN.getSubjectDN().getName();
                int indexOf = name.indexOf("CN=");
                if (indexOf != -1) {
                    indexOf += 3;
                    int indexOf2 = name.indexOf(44, indexOf);
                    if (this.f22605a.f22607b.equals(indexOf2 == -1 ? name.substring(indexOf) : name.substring(indexOf, indexOf2))) {
                        obj2 = 1;
                        break;
                    }
                }
            }
            obj2 = null;
            if (obj2 == null) {
                throw new CertificateException("certificate summary is not identical");
            }
        }
        if (this.f22605a.f22608c != null) {
            for (X509Certificate subjectDN2 : x509CertificateArr) {
                if (this.f22605a.f22608c.equals(se.m34086a(subjectDN2.getEncoded()))) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                throw new CertificateException("certificate data is not identical");
            }
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return f22604b.getAcceptedIssuers();
    }
}
