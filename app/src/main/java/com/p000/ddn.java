package com.p000;

import android.content.Context;
import android.content.Intent;
import com.under9.android.comments.model.api.ApiResponse;

/* compiled from: ApiTask */
/* renamed from: ddn */
public abstract class ddn extends deb {
    /* renamed from: a */
    private dft f21277a;
    /* renamed from: b */
    private String f21278b;

    /* renamed from: a */
    public abstract ApiResponse mo4337a(String str);

    /* renamed from: a */
    public abstract void mo4338a(ApiResponse apiResponse);

    /* renamed from: c */
    protected abstract String mo4341c(Context context);

    /* renamed from: b */
    protected boolean m26645b() {
        return dct.m26395a().m26411g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public final void mo4336f(Context r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = r7.mo4339a(r8);	 Catch:{ b -> 0x0078, Exception -> 0x007d }
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        r2 = r1;
    L_0x0009:
        r0 = 0;
        if (r2 != 0) goto L_0x008a;
    L_0x000c:
        r0 = r7.m26653h(r8);	 Catch:{ b -> 0x0078, Exception -> 0x007d }
        r3 = r0;
    L_0x0011:
        if (r2 != 0) goto L_0x0088;
    L_0x0013:
        r0 = p000.dfb.m26952a(r8);	 Catch:{ b -> 0x0078, Exception -> 0x007d }
        if (r0 != 0) goto L_0x0088;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        if (r0 != 0) goto L_0x006f;
    L_0x001c:
        r2 = r7.m26645b();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        if (r2 == 0) goto L_0x003e;
    L_0x0022:
        r2 = "ApiTask";
        r4 = new java.lang.StringBuilder;	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4.<init>();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r5 = "url: ";
        r4 = r4.append(r5);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r5 = r3.m27125o();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4 = r4.append(r5);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4 = r4.toString();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        android.util.Log.d(r2, r4);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
    L_0x003e:
        r2 = r3.m27114e();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r3 = r7.m26645b();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        if (r3 == 0) goto L_0x0060;
    L_0x0048:
        r3 = "ApiTask";
        r4 = new java.lang.StringBuilder;	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4.<init>();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r5 = "body: ";
        r4 = r4.append(r5);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4 = r4.append(r2);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r4 = r4.toString();	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        android.util.Log.d(r3, r4);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
    L_0x0060:
        r2 = r7.mo4337a(r2);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        if (r2 == 0) goto L_0x0076;
    L_0x0066:
        r7.m26652g(r8);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r7.mo4338a(r2);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
        r7.mo4343e(r8);	 Catch:{ b -> 0x0078, Exception -> 0x0083 }
    L_0x006f:
        r1 = r0;
    L_0x0070:
        if (r1 == 0) goto L_0x0075;
    L_0x0072:
        r7.mo4342d(r8);
    L_0x0075:
        return;
    L_0x0076:
        r0 = r1;
        goto L_0x006f;
    L_0x0078:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0070;
    L_0x007d:
        r0 = move-exception;
        r1 = r2;
    L_0x007f:
        r0.printStackTrace();
        goto L_0x0070;
    L_0x0083:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x007f;
    L_0x0088:
        r0 = r2;
        goto L_0x001a;
    L_0x008a:
        r3 = r0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: ddn.f(android.content.Context):void");
    }

    /* renamed from: a */
    public boolean mo4339a(Context context) {
        return true;
    }

    /* renamed from: g */
    public void m26652g(Context context) {
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
    }

    /* renamed from: c */
    protected String m26646c() {
        return dct.m26395a().m26408d().m26385a();
    }

    /* renamed from: h */
    public dft m26653h(Context context) {
        if (this.f21277a == null) {
            this.f21277a = mo4340b(context);
        }
        return this.f21277a;
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft b = dft.m27073b(m26654i(context));
        m26642a(b, context);
        return b;
    }

    /* renamed from: a */
    protected void m26642a(dft dft, Context context) {
        dex.m26897a(dft, context);
        dft.m27108d(dct.m26395a().m26408d().m26387c());
        dft.m27101b(5000);
        dft.m27082a(30000);
    }

    /* renamed from: d */
    public Intent mo4335d() {
        Intent d = super.mo4335d();
        d.setAction(dct.m26395a().f21149b);
        return d;
    }

    /* renamed from: i */
    protected String m26654i(Context context) {
        String c = mo4341c(context);
        this.f21278b = c;
        return c;
    }

    /* renamed from: a */
    protected void m26640a(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
        }
    }
}
