package com.p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfo */
/* renamed from: ael */
public final class ael {
    /* renamed from: c */
    private static final Pattern f850c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    /* renamed from: a */
    public final int f851a;
    /* renamed from: b */
    public final int f852b;

    /* renamed from: a */
    public static ael m1078a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return null;
        }
        Matcher matcher = f850c.matcher(str2);
        if (!matcher.find()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt == 0 && parseInt2 == 0) {
                return null;
            }
            return new ael(parseInt, parseInt2);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static ael m1077a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        return (i2 == 0 && i3 == 0) ? null : new ael(i2, i3);
    }

    private ael(int i, int i2) {
        this.f851a = i;
        this.f852b = i2;
    }
}
