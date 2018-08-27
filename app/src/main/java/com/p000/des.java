package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4499f;
import p000.dew.C4859c;
import p000.dew.C4861e;

/* compiled from: CommentSystemDarkTheme */
/* renamed from: des */
public class des extends det {
    /* renamed from: a */
    private static C4854a f21433a = new C4854a();

    /* compiled from: CommentSystemDarkTheme */
    /* renamed from: des$a */
    static class C4854a extends C4499f {
        /* renamed from: a */
        private Drawable f21429a;
        /* renamed from: b */
        private Drawable f21430b;
        /* renamed from: c */
        private Drawable f21431c;

        private C4854a() {
        }

        /* renamed from: a */
        public Drawable mo4359a(Context context) {
            if (this.f21429a == null) {
                this.f21429a = ew.a(context, C4861e.progress_horizontal_holo_light);
            }
            return this.f21429a;
        }

        /* renamed from: b */
        public Drawable mo4361b(Context context) {
            if (this.f21430b == null) {
                this.f21430b = ew.a(context, C4859c.cs_dark_theme_background2);
            }
            return this.f21430b;
        }

        /* renamed from: a */
        public int mo4358a() {
            return C4859c.cs_dark_theme_background2;
        }

        /* renamed from: b */
        public int mo4360b() {
            return C4859c.cs_dark_theme_color1;
        }

        /* renamed from: c */
        public int mo4362c() {
            return C4859c.cs_dark_theme_color3;
        }

        /* renamed from: c */
        public Drawable mo4363c(Context context) {
            if (this.f21431c == null) {
                this.f21431c = ew.a(context, C4859c.cs_dark_theme_color2);
            }
            return this.f21431c;
        }
    }

    /* renamed from: a */
    public int mo4364a() {
        return C4859c.cs_dark_theme_color1;
    }

    /* renamed from: b */
    public int mo4365b() {
        return C4861e.cs_dark_item_background;
    }

    /* renamed from: c */
    public int mo4366c() {
        return C4859c.cs_dark_theme_border1;
    }

    /* renamed from: d */
    public int mo4367d() {
        return C4859c.cs_dark_theme_background4;
    }

    /* renamed from: e */
    public int mo4368e() {
        return C4859c.cs_dark_theme_highlight_background;
    }

    /* renamed from: f */
    public int mo4369f() {
        return C4859c.cs_default_theme_selected_background;
    }

    /* renamed from: g */
    public int mo4370g() {
        return C4859c.cs_dark_theme_op_label_color;
    }

    /* renamed from: h */
    public C4499f mo4371h() {
        return f21433a;
    }
}
