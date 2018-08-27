package com.p000;

import android.graphics.Bitmap;
import com.under9.android.lib.widget.universalimageview.UniversalImageView;
import java.io.File;

/* compiled from: UniversalTileAdapter */
/* renamed from: dlw */
public class dlw extends dmc {
    /* renamed from: a */
    private String f22137a;
    /* renamed from: b */
    private String f22138b;
    /* renamed from: c */
    private String f22139c;

    public dlw(String str, int i, int i2) {
        super(i, i2, UniversalImageView.f19846a, UniversalImageView.f19847b);
        this.f22139c = str;
        m27924j();
    }

    public dlw(String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f22139c = str;
        m27924j();
    }

    /* renamed from: j */
    private void m27924j() {
        if (this.f22137a == null) {
            File a = cxe.m25487a().m25498c().m25405a(this.f22139c);
            if (a != null && a.exists()) {
                this.f22137a = a.getAbsolutePath();
                this.f22138b = dlz.m27955a(this.f22137a);
            }
        }
    }

    /* renamed from: c */
    protected String m27928c() {
        return this.f22139c;
    }

    /* renamed from: a */
    public Bitmap mo4444a(int i, int i2, int i3) {
        if (this.f22137a == null) {
            m27924j();
            if (this.f22137a == null) {
                return null;
            }
        }
        File file = new File(this.f22138b);
        if (!file.exists()) {
            String a = dlz.m27956a(this.f22137a, i, i2);
            if (new File(a).exists()) {
                return dlu.m27908a(a);
            }
            new File(dlz.m27957b(this.f22137a)).delete();
            return null;
        } else if (djw.m27633a(file.lastModified()) <= 5000) {
            return null;
        } else {
            file.delete();
            return null;
        }
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
