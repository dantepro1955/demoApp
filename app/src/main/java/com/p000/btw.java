package com.p000;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter */
/* renamed from: btw */
final class btw implements bug<Date>, bup<Date> {
    /* renamed from: a */
    private final DateFormat f7654a;
    /* renamed from: b */
    private final DateFormat f7655b;

    /* renamed from: b */
    public /* synthetic */ Object mo1534b(buh buh, Type type, buf buf) throws bul {
        return m10985a(buh, type, buf);
    }

    btw() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    btw(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    public btw(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    btw(DateFormat dateFormat, DateFormat dateFormat2) {
        this.f7654a = dateFormat;
        this.f7655b = dateFormat2;
    }

    /* renamed from: a */
    public buh m10984a(Date date, Type type, buo buo) {
        buh bun;
        synchronized (this.f7655b) {
            bun = new bun(this.f7654a.format(date));
        }
        return bun;
    }

    /* renamed from: a */
    public Date m10985a(buh buh, Type type, buf buf) throws bul {
        if (buh instanceof bun) {
            Date a = m10982a(buh);
            if (type == Date.class) {
                return a;
            }
            if (type == Timestamp.class) {
                return new Timestamp(a.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(a.getTime());
            }
            throw new IllegalArgumentException(getClass() + " cannot deserialize to " + type);
        }
        throw new bul("The date should be a string value");
    }

    /* renamed from: a */
    private Date m10982a(buh buh) {
        Date parse;
        synchronized (this.f7655b) {
            try {
                parse = this.f7655b.parse(buh.mo1539c());
            } catch (ParseException e) {
                try {
                    parse = this.f7654a.parse(buh.mo1539c());
                } catch (ParseException e2) {
                    try {
                        parse = bvy.m11493a(buh.mo1539c(), new ParsePosition(0));
                    } catch (Throwable e3) {
                        throw new buq(buh.mo1539c(), e3);
                    }
                }
            }
        }
        return parse;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(btw.class.getSimpleName());
        stringBuilder.append('(').append(this.f7655b.getClass().getSimpleName()).append(')');
        return stringBuilder.toString();
    }
}
