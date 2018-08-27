package com.p000;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateTypeAdapter */
/* renamed from: bvm */
public final class bvm extends bus<Date> {
    /* renamed from: a */
    public static final but f7797a = new C15311();
    /* renamed from: b */
    private final DateFormat f7798b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    /* renamed from: c */
    private final DateFormat f7799c = DateFormat.getDateTimeInstance(2, 2);

    /* compiled from: DateTypeAdapter */
    /* renamed from: bvm$1 */
    static class C15311 implements but {
        C15311() {
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            return bvz.m11004a() == Date.class ? new bvm() : null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
        return m11209a(bwa);
    }

    /* renamed from: a */
    public Date m11209a(bwa bwa) throws IOException {
        if (bwa.mo1554f() != bwb.NULL) {
            return m11208a(bwa.mo1556h());
        }
        bwa.mo1558j();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m11208a(String str) {
        Date parse;
        try {
            parse = this.f7799c.parse(str);
        } catch (ParseException e) {
            try {
                parse = this.f7798b.parse(str);
            } catch (ParseException e2) {
                try {
                    parse = bvy.m11493a(str, new ParsePosition(0));
                } catch (Throwable e3) {
                    throw new buq(str, e3);
                }
            }
        }
        return parse;
    }

    /* renamed from: a */
    public synchronized void m11211a(bwc bwc, Date date) throws IOException {
        if (date == null) {
            bwc.mo1578f();
        } else {
            bwc.mo1573b(this.f7798b.format(date));
        }
    }
}
