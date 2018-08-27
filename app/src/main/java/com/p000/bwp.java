package com.p000;

import android.widget.TextView;

/* compiled from: TextViewTextChangeEvent */
/* renamed from: bwp */
public final class bwp extends bwn<TextView> {
    /* renamed from: a */
    private final CharSequence f8013a;
    /* renamed from: b */
    private final int f8014b;
    /* renamed from: c */
    private final int f8015c;
    /* renamed from: d */
    private final int f8016d;

    /* renamed from: a */
    public static bwp m11549a(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        return new bwp(textView, charSequence, i, i2, i3);
    }

    private bwp(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        super(textView);
        this.f8013a = charSequence;
        this.f8014b = i;
        this.f8015c = i2;
        this.f8016d = i3;
    }

    /* renamed from: b */
    public CharSequence m11550b() {
        return this.f8013a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwp)) {
            return false;
        }
        bwp bwp = (bwp) obj;
        if (bwp.m11547a() == m11547a() && this.f8013a.equals(bwp.f8013a) && this.f8014b == bwp.f8014b && this.f8015c == bwp.f8015c && this.f8016d == bwp.f8016d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((TextView) m11547a()).hashCode() + 629) * 37) + this.f8013a.hashCode()) * 37) + this.f8014b) * 37) + this.f8015c) * 37) + this.f8016d;
    }

    public String toString() {
        return "TextViewTextChangeEvent{text=" + this.f8013a + ", start=" + this.f8014b + ", before=" + this.f8015c + ", count=" + this.f8016d + ", view=" + m11547a() + '}';
    }
}
