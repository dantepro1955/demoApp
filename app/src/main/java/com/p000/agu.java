package com.p000;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import java.io.IOException;

/* compiled from: DefaultUriDataSource */
/* renamed from: agu */
public final class agu implements agz {
    /* renamed from: a */
    private final agz f1432a;
    /* renamed from: b */
    private final agz f1433b;
    /* renamed from: c */
    private final agz f1434c;
    /* renamed from: d */
    private final agz f1435d;
    /* renamed from: e */
    private agz f1436e;

    public agu(Context context, agy agy, String str) {
        this(context, agy, str, false);
    }

    public agu(Context context, agy agy, String str, boolean z) {
        this(context, agy, new agt(str, null, agy, 8000, 8000, z));
    }

    public agu(Context context, agy agy, agz agz) {
        this.f1432a = (agz) ahb.m1512a((Object) agz);
        this.f1433b = new agv(agy);
        this.f1434c = new agm(context, agy);
        this.f1435d = new ago(context, agy);
    }

    public long open(agq agq) throws IOException {
        ahb.m1516b(this.f1436e == null);
        String scheme = agq.f1390a.getScheme();
        if (ahr.m1600a(agq.f1390a)) {
            if (agq.f1390a.getPath().startsWith("/android_asset/")) {
                this.f1436e = this.f1434c;
            } else {
                this.f1436e = this.f1433b;
            }
        } else if (UriUtil.LOCAL_ASSET_SCHEME.equals(scheme)) {
            this.f1436e = this.f1434c;
        } else if ("content".equals(scheme)) {
            this.f1436e = this.f1435d;
        } else {
            this.f1436e = this.f1432a;
        }
        return this.f1436e.open(agq);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f1436e.read(bArr, i, i2);
    }

    public void close() throws IOException {
        if (this.f1436e != null) {
            try {
                this.f1436e.close();
            } finally {
                this.f1436e = null;
            }
        }
    }
}
