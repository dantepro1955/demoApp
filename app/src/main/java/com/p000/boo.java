package com.p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: boo */
public class boo {
    /* renamed from: a */
    protected static final Comparator<byte[]> f7264a = new C13761();
    /* renamed from: b */
    private List<byte[]> f7265b = new LinkedList();
    /* renamed from: c */
    private List<byte[]> f7266c = new ArrayList(64);
    /* renamed from: d */
    private int f7267d = 0;
    /* renamed from: e */
    private final int f7268e;

    /* renamed from: boo$1 */
    static class C13761 implements Comparator<byte[]> {
        C13761() {
        }

        /* renamed from: a */
        public int m10171a(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m10171a((byte[]) obj, (byte[]) obj2);
        }
    }

    public boo(int i) {
        this.f7268e = i;
    }

    /* renamed from: a */
    private synchronized void m10172a() {
        while (this.f7267d > this.f7268e) {
            byte[] bArr = (byte[]) this.f7265b.remove(0);
            this.f7266c.remove(bArr);
            this.f7267d -= bArr.length;
        }
    }

    /* renamed from: a */
    public synchronized void m10173a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f7268e) {
                this.f7265b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f7266c, bArr, f7264a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f7266c.add(binarySearch, bArr);
                this.f7267d += bArr.length;
                m10172a();
            }
        }
    }

    /* renamed from: a */
    public synchronized byte[] m10174a(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.f7266c.size(); i2++) {
            bArr = (byte[]) this.f7266c.get(i2);
            if (bArr.length >= i) {
                this.f7267d -= bArr.length;
                this.f7266c.remove(i2);
                this.f7265b.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }
}
