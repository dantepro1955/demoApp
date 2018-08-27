package com.p000;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AbstractTaskController */
/* renamed from: chh */
public abstract class chh {
    /* renamed from: a */
    public static final TimeUnit f9193a = TimeUnit.SECONDS;
    /* renamed from: b */
    private Context f9194b;

    /* renamed from: a */
    public Context m13252a() {
        return this.f9194b;
    }

    /* renamed from: a */
    public void m13254a(Context context) {
        this.f9194b = context;
    }

    /* renamed from: a */
    protected static boolean m13251a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, cnf cnf) {
        String m = cnf.mo1806m();
        if (m == null) {
            return true;
        }
        Runnable[] runnableArr = (Runnable[]) linkedBlockingQueue.toArray(new Runnable[0]);
        int length = runnableArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (m.equals(((cnh) runnableArr[i]).m13473a())) {
                    return false;
                }
                i++;
            } catch (ClassCastException e) {
            }
        }
        return true;
    }

    /* renamed from: a */
    protected cnh m13253a(cnf cnf) {
        return new cnh(this.f9194b, cnf);
    }
}
