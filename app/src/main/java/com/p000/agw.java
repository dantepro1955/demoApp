package com.p000;

import android.text.TextUtils;
import com.mopub.common.AdType;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: HttpDataSource */
/* renamed from: agw */
public interface agw extends agz {
    /* renamed from: a */
    public static final ahm<String> f1414a = new C01681();

    /* compiled from: HttpDataSource */
    /* renamed from: agw$1 */
    static class C01681 implements ahm<String> {
        C01681() {
        }

        /* renamed from: a */
        public boolean m1490a(String str) {
            String b = ahr.m1605b(str);
            return (TextUtils.isEmpty(b) || ((b.contains("text") && !b.contains("text/vtt")) || b.contains(AdType.HTML) || b.contains("xml"))) ? false : true;
        }
    }

    /* compiled from: HttpDataSource */
    /* renamed from: agw$a */
    public static class C0169a extends IOException {
        /* renamed from: a */
        public final agq f1442a;

        public C0169a(String str, agq agq) {
            super(str);
            this.f1442a = agq;
        }

        public C0169a(IOException iOException, agq agq) {
            super(iOException);
            this.f1442a = agq;
        }

        public C0169a(String str, IOException iOException, agq agq) {
            super(str, iOException);
            this.f1442a = agq;
        }
    }

    /* compiled from: HttpDataSource */
    /* renamed from: agw$b */
    public static final class C0170b extends C0169a {
        /* renamed from: b */
        public final String f1443b;

        public C0170b(String str, agq agq) {
            super("Invalid content type: " + str, agq);
            this.f1443b = str;
        }
    }

    /* compiled from: HttpDataSource */
    /* renamed from: agw$c */
    public static final class C0171c extends C0169a {
        /* renamed from: b */
        public final int f1444b;
        /* renamed from: c */
        public final Map<String, List<String>> f1445c;

        public C0171c(int i, Map<String, List<String>> map, agq agq) {
            super("Response code: " + i, agq);
            this.f1444b = i;
            this.f1445c = map;
        }
    }

    void close() throws C0169a;

    long open(agq agq) throws C0169a;

    int read(byte[] bArr, int i, int i2) throws C0169a;
}
