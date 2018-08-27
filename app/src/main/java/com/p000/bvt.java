package com.p000;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter */
/* renamed from: bvt */
public final class bvt extends bus<Date> {
    /* renamed from: a */
    public static final but f7864a = new C15401();
    /* renamed from: b */
    private final DateFormat f7865b = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter */
    /* renamed from: bvt$1 */
    static class C15401 implements but {
        C15401() {
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            return bvz.m11004a() == Date.class ? new bvt() : null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
        return m11339a(bwa);
    }

    /* renamed from: a */
    public synchronized Date m11339a(bwa bwa) throws IOException {
        Date date;
        if (bwa.mo1554f() == bwb.NULL) {
            bwa.mo1558j();
            date = null;
        } else {
            try {
                date = new Date(this.f7865b.parse(bwa.mo1556h()).getTime());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }
        return date;
    }

    /* renamed from: a */
    public synchronized void m11341a(bwc bwc, Date date) throws IOException {
        bwc.mo1573b(date == null ? null : this.f7865b.format(date));
    }
}
