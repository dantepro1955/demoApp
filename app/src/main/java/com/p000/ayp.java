package com.p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import p000.ays.C0921a;

@bhd
/* renamed from: ayp */
public class ayp {
    /* renamed from: a */
    private final int f5091a;
    /* renamed from: b */
    private final int f5092b;
    /* renamed from: c */
    private final int f5093c;
    /* renamed from: d */
    private final ayo f5094d = new ayr();

    /* renamed from: ayp$1 */
    class C09191 implements Comparator<C0921a> {
        C09191(ayp ayp) {
        }

        /* renamed from: a */
        public int m6633a(C0921a c0921a, C0921a c0921a2) {
            int i = c0921a.f5098c - c0921a2.f5098c;
            return i != 0 ? i : (int) (c0921a.f5096a - c0921a2.f5096a);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m6633a((C0921a) obj, (C0921a) obj2);
        }
    }

    /* renamed from: ayp$a */
    static class C0920a {
        /* renamed from: a */
        ByteArrayOutputStream f5089a = new ByteArrayOutputStream(4096);
        /* renamed from: b */
        Base64OutputStream f5090b = new Base64OutputStream(this.f5089a, 10);

        /* renamed from: a */
        public void m6634a(byte[] bArr) throws IOException {
            this.f5090b.write(bArr);
        }

        public String toString() {
            String byteArrayOutputStream;
            try {
                this.f5090b.close();
            } catch (Throwable e) {
                bky.m9007b("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.f5089a.close();
                byteArrayOutputStream = this.f5089a.toString();
            } catch (Throwable e2) {
                bky.m9007b("HashManager: Unable to convert to Base64.", e2);
                byteArrayOutputStream = "";
            } finally {
                this.f5089a = null;
                this.f5090b = null;
            }
            return byteArrayOutputStream;
        }
    }

    public ayp(int i) {
        this.f5092b = i;
        this.f5091a = 6;
        this.f5093c = 0;
    }

    /* renamed from: a */
    C0920a m6635a() {
        return new C0920a();
    }

    /* renamed from: a */
    String m6636a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        C0920a a = m6635a();
        PriorityQueue priorityQueue = new PriorityQueue(this.f5092b, new C09191(this));
        for (String b : split) {
            String[] b2 = ayq.m6643b(b);
            if (b2.length != 0) {
                ays.m6653a(b2, this.f5092b, this.f5091a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                a.m6634a(this.f5094d.mo854a(((C0921a) it.next()).f5097b));
            } catch (Throwable e) {
                bky.m9007b("Error while writing hash to byteStream", e);
            }
        }
        return a.toString();
    }

    /* renamed from: a */
    public String m6637a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return m6636a(stringBuffer.toString());
    }
}
