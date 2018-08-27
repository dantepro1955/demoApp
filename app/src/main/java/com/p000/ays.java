package com.p000;

import java.util.PriorityQueue;

@bhd
/* renamed from: ays */
public class ays {

    /* renamed from: ays$a */
    public static class C0921a {
        /* renamed from: a */
        final long f5096a;
        /* renamed from: b */
        final String f5097b;
        /* renamed from: c */
        final int f5098c;

        C0921a(long j, String str, int i) {
            this.f5096a = j;
            this.f5097b = str;
            this.f5098c = i;
        }

        public boolean equals(Object obj) {
            return (obj == null || !(obj instanceof C0921a)) ? false : ((C0921a) obj).f5096a == this.f5096a && ((C0921a) obj).f5098c == this.f5098c;
        }

        public int hashCode() {
            return (int) this.f5096a;
        }
    }

    /* renamed from: a */
    static long m6649a(int i, int i2, long j, long j2, long j3) {
        return ((((((j + 1073807359) - ((((((long) i) + 2147483647L) % 1073807359) * j2) % 1073807359)) % 1073807359) * j3) % 1073807359) + ((((long) i2) + 2147483647L) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    static long m6650a(long j, int i) {
        return i == 0 ? 1 : i != 1 ? i % 2 == 0 ? ays.m6650a((j * j) % 1073807359, i / 2) % 1073807359 : ((ays.m6650a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    /* renamed from: a */
    static String m6651a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            bky.m9008c("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m6652a(int i, long j, String str, int i2, PriorityQueue<C0921a> priorityQueue) {
        C0921a c0921a = new C0921a(j, str, i2);
        if ((priorityQueue.size() != i || (((C0921a) priorityQueue.peek()).f5098c <= c0921a.f5098c && ((C0921a) priorityQueue.peek()).f5096a <= c0921a.f5096a)) && !priorityQueue.contains(c0921a)) {
            priorityQueue.add(c0921a);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    public static void m6653a(String[] strArr, int i, int i2, PriorityQueue<C0921a> priorityQueue) {
        if (strArr.length < i2) {
            int i3 = i;
            ays.m6652a(i3, ays.m6654b(strArr, 0, strArr.length), ays.m6651a(strArr, 0, strArr.length), strArr.length, (PriorityQueue) priorityQueue);
            return;
        }
        long b = ays.m6654b(strArr, 0, i2);
        ays.m6652a(i, b, ays.m6651a(strArr, 0, i2), i2, (PriorityQueue) priorityQueue);
        long a = ays.m6650a(16785407, i2 - 1);
        int i4 = 1;
        while (i4 < (strArr.length - i2) + 1) {
            long a2 = ays.m6649a(ayq.m6638a(strArr[i4 - 1]), ayq.m6638a(strArr[(i4 + i2) - 1]), b, a, 16785407);
            ays.m6652a(i, a2, ays.m6651a(strArr, i4, i2), strArr.length, (PriorityQueue) priorityQueue);
            i4++;
            b = a2;
        }
    }

    /* renamed from: b */
    private static long m6654b(String[] strArr, int i, int i2) {
        long a = (((long) ayq.m6638a(strArr[i])) + 2147483647L) % 1073807359;
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) ayq.m6638a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
