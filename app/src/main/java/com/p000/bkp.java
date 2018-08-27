package com.p000;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@bhd
/* renamed from: bkp */
public class bkp {
    /* renamed from: a */
    Map<Integer, Bitmap> f6778a = new ConcurrentHashMap();
    /* renamed from: b */
    private AtomicInteger f6779b = new AtomicInteger(0);

    /* renamed from: a */
    public int m9260a(Bitmap bitmap) {
        if (bitmap == null) {
            bky.m9006b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        this.f6778a.put(Integer.valueOf(this.f6779b.get()), bitmap);
        return this.f6779b.getAndIncrement();
    }

    /* renamed from: a */
    public Bitmap m9261a(Integer num) {
        return (Bitmap) this.f6778a.get(num);
    }

    /* renamed from: b */
    public void m9262b(Integer num) {
        this.f6778a.remove(num);
    }
}
