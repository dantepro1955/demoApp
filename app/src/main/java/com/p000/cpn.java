package com.p000;

/* compiled from: AppSettingFormatter */
/* renamed from: cpn */
public class cpn {
    /* renamed from: a */
    caf f19942a = caf.a();

    /* renamed from: a */
    public StringBuilder m24309a() {
        cip h = this.f19942a.h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dark theme: ").append(h.ah()).append("\n");
        stringBuilder.append("Long posts: ").append(!h.ak()).append("\n");
        stringBuilder.append("Remember position: ").append(h.al()).append("\n");
        stringBuilder.append("Rotation lock: ").append(h.at()).append("\n");
        stringBuilder.append("Scroll with volume keys: ").append(h.au()).append("\n");
        stringBuilder.append("Mp4 player: ").append(h.ay()).append("\n");
        stringBuilder.append("Exo player: ").append(h.s()).append("\n");
        return stringBuilder;
    }

    public String toString() {
        return m24309a().toString();
    }
}
