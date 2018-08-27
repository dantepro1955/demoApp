package com.p000;

import android.graphics.Bitmap;
import android.view.View;
import java.io.File;
import p000.cxk.C4654a;

/* compiled from: UniversalImageHelper */
/* renamed from: dlu */
public class dlu {

    /* compiled from: UniversalImageHelper */
    /* renamed from: dlu$1 */
    static class C49761 extends cyf {
        C49761() {
        }

        /* renamed from: a */
        public void mo4094a(String str, View view, cxk cxk) {
            super.mo4094a(str, view, cxk);
            C4654a a = cxk.m25537a();
            if (a != C4654a.DECODING_ERROR && a != C4654a.OUT_OF_MEMORY) {
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m27908a(String str) {
        String str2 = "file://" + str;
        if (cyk.m25649a(str2, cxe.m25487a().m25497b()).size() != 0) {
            return cxe.m25487a().m25489a(str2);
        }
        if (!new File(str).exists()) {
            return null;
        }
        String a = dlz.m27955a(str);
        if (a != null && new File(a).exists()) {
            return null;
        }
        cxe.m25487a().m25496a(str2, new C49761());
        return null;
    }
}
