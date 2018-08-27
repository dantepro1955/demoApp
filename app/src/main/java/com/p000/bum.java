package com.p000;

import java.io.Reader;
import java.io.StringReader;

/* compiled from: JsonParser */
/* renamed from: bum */
public final class bum {
    /* renamed from: a */
    public buh m11091a(String str) throws buq {
        return m11090a(new StringReader(str));
    }

    /* renamed from: a */
    public buh m11090a(Reader reader) throws bui, buq {
        try {
            bwa bwa = new bwa(reader);
            buh a = m11089a(bwa);
            if (a.m11071k() || bwa.mo1554f() == bwb.END_DOCUMENT) {
                return a;
            }
            throw new buq("Did not consume the entire document.");
        } catch (Throwable e) {
            throw new buq(e);
        } catch (Throwable e2) {
            throw new bui(e2);
        } catch (Throwable e22) {
            throw new buq(e22);
        }
    }

    /* renamed from: a */
    public buh m11089a(bwa bwa) throws bui, buq {
        boolean q = bwa.m11249q();
        bwa.m11234a(true);
        try {
            buh a = bvi.m11188a(bwa);
            bwa.m11234a(q);
            return a;
        } catch (Throwable e) {
            throw new bul("Failed parsing JSON source: " + bwa + " to Json", e);
        } catch (Throwable e2) {
            throw new bul("Failed parsing JSON source: " + bwa + " to Json", e2);
        } catch (Throwable th) {
            bwa.m11234a(q);
        }
    }
}
