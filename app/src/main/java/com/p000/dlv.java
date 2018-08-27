package com.p000;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: UniversalSingleTileAdapter */
/* renamed from: dlv */
public class dlv extends dlw {
    public dlv(String str, int i, int i2) {
        super(str, i, i2, i, i2);
    }

    /* renamed from: a */
    public int mo4446a() {
        return 1;
    }

    /* renamed from: b */
    public int mo4447b() {
        return 1;
    }

    /* renamed from: a */
    public Bitmap mo4444a(int i, int i2, int i3) {
        File a = cxe.m25487a().m25498c().m25405a(m27928c());
        if (a == null || !a.exists()) {
            return null;
        }
        return dlu.m27908a(a.getAbsolutePath());
    }

    /* renamed from: a */
    public Bitmap mo4443a(int i, int i2) {
        return mo4444a(i, i2, 1);
    }

    /* renamed from: b */
    public Bitmap mo4445b(int i, int i2) {
        return null;
    }
}
