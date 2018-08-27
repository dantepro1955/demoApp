package com.p000;

import com.facebook.internal.Utility;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;

/* compiled from: AdtsExtractor */
/* renamed from: afm */
public final class afm implements aeg {
    /* renamed from: a */
    private static final int f1092a = ahr.m1606c("ID3");
    /* renamed from: b */
    private final long f1093b;
    /* renamed from: c */
    private final ahk f1094c;
    /* renamed from: d */
    private afn f1095d;
    /* renamed from: e */
    private boolean f1096e;

    public afm() {
        this(0);
    }

    public afm(long j) {
        this.f1093b = j;
        this.f1094c = new ahk((int) HttpStatus.HTTP_OK);
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        int i;
        ahk ahk = new ahk(10);
        ahj ahj = new ahj(ahk.f1493a);
        int i2 = 0;
        while (true) {
            aeh.mo122c(ahk.f1493a, 0, 10);
            ahk.m1564b(0);
            if (ahk.m1573i() != f1092a) {
                break;
            }
            i = ((((ahk.f1493a[6] & 127) << 21) | ((ahk.f1493a[7] & 127) << 14)) | ((ahk.f1493a[8] & 127) << 7)) | (ahk.f1493a[9] & 127);
            i2 += i + 10;
            aeh.mo121c(i);
        }
        aeh.mo114a();
        aeh.mo121c(i2);
        i = 0;
        int i3 = 0;
        int i4 = i2;
        while (true) {
            aeh.mo122c(ahk.f1493a, 0, 2);
            ahk.m1564b(0);
            if ((ahk.m1571g() & 65526) != 65520) {
                aeh.mo114a();
                i4++;
                if (i4 - i2 >= Utility.DEFAULT_STREAM_BUFFER_SIZE) {
                    return false;
                }
                aeh.mo121c(i4);
                i = 0;
                i3 = 0;
            } else {
                i++;
                if (i >= 4 && i3 > 188) {
                    return true;
                }
                aeh.mo122c(ahk.f1493a, 0, 4);
                ahj.m1548a(14);
                int c = ahj.m1554c(13);
                aeh.mo121c(c - 6);
                i3 += c;
            }
        }
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1095d = new afn(aei.mo148d(0), aei.mo148d(1));
        aei.mo150f();
        aei.mo136a(aeo.f740f);
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1096e = false;
        this.f1095d.mo160a();
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        int a = aeh.mo113a(this.f1094c.f1493a, 0, HttpStatus.HTTP_OK);
        if (a == -1) {
            return -1;
        }
        this.f1094c.m1564b(0);
        this.f1094c.m1559a(a);
        if (!this.f1096e) {
            this.f1095d.mo161a(this.f1093b, true);
            this.f1096e = true;
        }
        this.f1095d.mo162a(this.f1094c);
        return 0;
    }
}
