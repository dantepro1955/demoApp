package com.p000;

/* compiled from: RxJavaErrorHandler */
/* renamed from: dyf */
public abstract class dyf {
    @Deprecated
    /* renamed from: a */
    public void m21100a(Throwable th) {
    }

    /* renamed from: a */
    public final String m21099a(Object obj) {
        try {
            return m21101b(obj);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            dud.b(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    /* renamed from: b */
    protected String m21101b(Object obj) throws InterruptedException {
        return null;
    }
}
