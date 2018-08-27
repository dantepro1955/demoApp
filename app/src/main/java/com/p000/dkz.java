package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import java.io.IOException;

/* compiled from: CacheableUriDataSource */
/* renamed from: dkz */
public final class dkz implements agz {
    /* renamed from: a */
    private final agz f21942a;
    /* renamed from: b */
    private final agz f21943b;
    /* renamed from: c */
    private final agz f21944c;
    /* renamed from: d */
    private final agz f21945d;
    /* renamed from: e */
    private final agz f21946e;
    /* renamed from: f */
    private agz f21947f;
    /* renamed from: g */
    private boolean f21948g;
    /* renamed from: h */
    private dfs f21949h;
    /* renamed from: i */
    private Context f21950i;
    /* renamed from: j */
    private String f21951j;

    public dkz(Context context, agy agy, String str, dfs dfs) {
        this(context, agy, str, false, dfs);
    }

    public dkz(Context context, agy agy, String str, boolean z, dfs dfs) {
        this(context, agy, new dky(context, str, null, agy, 8000, 8000, z, dfs));
    }

    public dkz(Context context, agy agy, agz agz) {
        this.f21942a = (agz) ahb.a(agz);
        this.f21943b = new agv(agy);
        this.f21944c = new agm(context, agy);
        this.f21945d = new ago(context, agy);
        this.f21949h = new dfs(true);
        this.f21950i = context;
        this.f21946e = new dla(context, agy, this.f21949h);
    }

    public long open(agq agq) throws IOException {
        ahb.b(this.f21947f == null);
        CharSequence scheme = agq.f1390a.getScheme();
        if (UriUtil.LOCAL_FILE_SCHEME.equals(scheme) || TextUtils.isEmpty(scheme)) {
            if (agq.f1390a.getPath().startsWith("/android_asset/")) {
                this.f21947f = this.f21944c;
            } else {
                this.f21947f = this.f21943b;
            }
        } else if (UriUtil.LOCAL_ASSET_SCHEME.equals(scheme)) {
            this.f21947f = this.f21944c;
        } else if ("content".equals(scheme)) {
            this.f21947f = this.f21945d;
        } else {
            if (this.f21951j == null) {
                this.f21951j = this.f21949h.m27060e(this.f21950i, agq.f1390a.toString());
            }
            boolean d = this.f21949h.m27059d(this.f21950i, agq.f1390a.toString());
            this.f21948g = d;
            if (d) {
                this.f21947f = this.f21946e;
            } else {
                this.f21947f = this.f21942a;
            }
        }
        return this.f21947f.open(agq);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f21947f.read(bArr, i, i2);
    }

    public void close() throws IOException {
        if (this.f21947f != null) {
            try {
                this.f21947f.close();
            } finally {
                this.f21947f = null;
            }
        }
    }
}
