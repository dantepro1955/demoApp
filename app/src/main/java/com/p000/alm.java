package com.p000;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: alm */
public final class alm implements alr {
    /* renamed from: a */
    private static final Uri f1975a;
    /* renamed from: b */
    private final LogPrinter f1976b = new LogPrinter(4, "GA/LogCatTransport");

    /* renamed from: alm$1 */
    class C02791 implements Comparator<alo> {
        C02791(alm alm) {
        }

        /* renamed from: a */
        public int m2483a(alo alo, alo alo2) {
            return alo.getClass().getCanonicalName().compareTo(alo2.getClass().getCanonicalName());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m2483a((alo) obj, (alo) obj2);
        }
    }

    static {
        Builder builder = new Builder();
        builder.scheme(ShareConstants.MEDIA_URI);
        builder.authority("local");
        f1975a = builder.build();
    }

    /* renamed from: a */
    public Uri mo321a() {
        return f1975a;
    }

    /* renamed from: a */
    public void mo322a(aln aln) {
        List<alo> arrayList = new ArrayList(aln.m2492b());
        Collections.sort(arrayList, new C02791(this));
        StringBuilder stringBuilder = new StringBuilder();
        for (alo obj : arrayList) {
            Object obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.f1976b.println(stringBuilder.toString());
    }
}
