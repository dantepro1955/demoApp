package com.p000;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: TimeTypeAdapter */
/* renamed from: bvu */
public final class bvu extends bus<Time> {
    /* renamed from: a */
    public static final but f7866a = new C15411();
    /* renamed from: b */
    private final DateFormat f7867b = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter */
    /* renamed from: bvu$1 */
    static class C15411 implements but {
        C15411() {
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            return bvz.m11004a() == Time.class ? new bvu() : null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
        return m11344a(bwa);
    }

    /* renamed from: a */
    public synchronized Time m11344a(bwa bwa) throws IOException {
        Time time;
        if (bwa.mo1554f() == bwb.NULL) {
            bwa.mo1558j();
            time = null;
        } else {
            try {
                time = new Time(this.f7867b.parse(bwa.mo1556h()).getTime());
            } catch (Throwable e) {
                throw new buq(e);
            }
        }
        return time;
    }

    /* renamed from: a */
    public synchronized void m11346a(bwc bwc, Time time) throws IOException {
        bwc.mo1573b(time == null ? null : this.f7867b.format(time));
    }
}
