package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4499f;
import p000.dnb.C5000c;
import p000.dnb.C5001d;

/* compiled from: OverlayUniversalImageViewTheme */
/* renamed from: dks */
public class dks extends C4499f {
    /* renamed from: a */
    private static dks f21923a = new dks();
    /* renamed from: b */
    private Drawable f21924b;
    /* renamed from: c */
    private Drawable f21925c;
    /* renamed from: d */
    private Drawable f21926d;

    /* renamed from: d */
    public static dks m27753d() {
        return f21923a;
    }

    /* renamed from: a */
    public Drawable mo4359a(Context context) {
        if (this.f21924b == null) {
            this.f21924b = ew.a(context, C5001d.darktheme_progress_horizontal_holo_light);
        }
        return this.f21924b;
    }

    /* renamed from: b */
    public Drawable mo4361b(Context context) {
        if (this.f21925c == null) {
            this.f21925c = ew.a(context, C5000c.overlay_post_list_item_placeholder);
        }
        return this.f21925c;
    }

    /* renamed from: a */
    public int mo4358a() {
        return C5000c.overlay_post_list_item_placeholder;
    }

    /* renamed from: b */
    public int mo4360b() {
        return C5000c.darktheme_post_list_item_mobile_cover_text;
    }

    /* renamed from: c */
    public int mo4362c() {
        return C5000c.darktheme_post_list_item_mobile_cover_bg;
    }

    /* renamed from: c */
    public Drawable mo4363c(Context context) {
        if (this.f21926d == null) {
            this.f21926d = ew.a(context, C5001d.mobile_cover_saw_black);
        }
        return this.f21926d;
    }
}
