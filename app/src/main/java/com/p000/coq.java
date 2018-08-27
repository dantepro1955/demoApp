package com.p000;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: UploadManager */
/* renamed from: coq */
public class coq {

    /* compiled from: UploadManager */
    /* renamed from: coq$a */
    public static class C4520a {
        /* renamed from: a */
        public String f19893a;
        /* renamed from: b */
        public String f19894b;
        /* renamed from: c */
        public String f19895c;
        /* renamed from: d */
        public int f19896d;
        /* renamed from: e */
        public int f19897e;
        /* renamed from: f */
        public String f19898f;
        /* renamed from: g */
        private ArrayList<C4519a> f19899g = new ArrayList();

        /* compiled from: UploadManager */
        /* renamed from: coq$a$a */
        public interface C4519a {
            /* renamed from: a */
            void m24211a();

            /* renamed from: a */
            void m24212a(int i);

            /* renamed from: a */
            void m24213a(String str);

            /* renamed from: b */
            void m24214b();
        }

        /* renamed from: a */
        public void m24216a(C4519a c4519a) {
            this.f19899g.add(c4519a);
        }

        /* renamed from: b */
        public void m24217b(C4519a c4519a) {
            this.f19899g.remove(c4519a);
        }

        /* renamed from: a */
        public void m24215a(int i, int i2, String str) {
            this.f19896d = i;
            this.f19897e = i2;
            this.f19898f = str;
            Iterator it = this.f19899g.iterator();
            while (it.hasNext()) {
                C4519a c4519a = (C4519a) it.next();
                c4519a.m24212a(i);
                if (i2 == -1) {
                    c4519a.m24213a(this.f19898f);
                } else if (i >= 0 || i < 101) {
                    c4519a.m24211a();
                } else {
                    c4519a.m24214b();
                }
            }
        }
    }
}
