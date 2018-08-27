package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4499f;
import p000.dew.C4859c;
import p000.dew.C4861e;

/* compiled from: CommentSystemTheme */
/* renamed from: det */
public class det implements deu {
    /* renamed from: a */
    private static C4856a f21432a = new C4856a();

    /* compiled from: CommentSystemTheme */
    /* renamed from: det$a */
    static class C4856a extends C4499f {
        /* renamed from: a */
        private Drawable f21434a;
        /* renamed from: b */
        private Drawable f21435b;
        /* renamed from: c */
        private Drawable f21436c;

        private C4856a() {
        }

        /* renamed from: a */
        public Drawable mo4359a(Context context) {
            if (this.f21434a == null) {
                this.f21434a = ew.a(context, C4861e.progress_horizontal_holo_light);
            }
            return this.f21434a;
        }

        /* renamed from: b */
        public Drawable mo4361b(Context context) {
            if (this.f21435b == null) {
                this.f21435b = ew.a(context, C4859c.cs_default_theme_uiv_image_bg_resource);
            }
            return this.f21435b;
        }

        /* renamed from: a */
        public int mo4358a() {
            return C4859c.cs_default_theme_uiv_item_placeholder;
        }

        /* renamed from: b */
        public int mo4360b() {
            return C4859c.cs_default_theme_uiv_mobile_cover;
        }

        /* renamed from: c */
        public int mo4362c() {
            return C4859c.cs_default_theme_uiv_mobile_cover_border;
        }

        /* renamed from: c */
        public Drawable mo4363c(Context context) {
            if (this.f21436c == null) {
                this.f21436c = ew.a(context, C4861e.mobile_cover_saw_white);
            }
            return this.f21436c;
        }
    }

    /* renamed from: a */
    public int mo4364a() {
        return C4859c.cs_default_theme_color1;
    }

    /* renamed from: c */
    public int mo4366c() {
        return C4859c.cs_default_theme_border1;
    }

    /* renamed from: d */
    public int mo4367d() {
        return C4859c.cs_default_theme_background4;
    }

    /* renamed from: i */
    public int mo4372i() {
        return C4859c.cs_default_theme_highglight_color1;
    }

    /* renamed from: j */
    public int mo4373j() {
        return C4859c.cs_default_theme_highglight_color2;
    }

    /* renamed from: k */
    public int mo4374k() {
        return C4859c.cs_default_theme_highglight_color3;
    }

    /* renamed from: e */
    public int mo4368e() {
        return C4859c.cs_default_theme_highlight_background;
    }

    /* renamed from: f */
    public int mo4369f() {
        return C4859c.cs_default_theme_selected_background;
    }

    /* renamed from: b */
    public int mo4365b() {
        return C4861e.cs_default_item_background;
    }

    /* renamed from: h */
    public C4499f mo4371h() {
        return f21432a;
    }

    /* renamed from: g */
    public int mo4370g() {
        return C4859c.cs_op_label_color;
    }
}
