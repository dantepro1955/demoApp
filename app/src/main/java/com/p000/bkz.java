package com.p000;

import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p000.bkx.C1281a;

@bhd
/* renamed from: bkz */
public class bkz implements C1281a {
    /* renamed from: a */
    private final String f6805a;

    public bkz() {
        this(null);
    }

    public bkz(String str) {
        this.f6805a = str;
    }

    /* renamed from: a */
    public void mo1260a(String str) {
        String valueOf;
        HttpURLConnection httpURLConnection;
        try {
            String str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            bky.m9006b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            azp.m6789a().m9293a(true, httpURLConnection, this.f6805a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < HttpStatus.HTTP_OK || responseCode >= GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION) {
                bky.m9011e(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            valueOf = String.valueOf(e.getMessage());
            bky.m9011e(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (IOException e2) {
            valueOf = String.valueOf(e2.getMessage());
            bky.m9011e(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (RuntimeException e3) {
            valueOf = String.valueOf(e3.getMessage());
            bky.m9011e(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
