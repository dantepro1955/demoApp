package com.p000;

import android.content.Context;
import com.under9.android.lib.widget.universalimageview.UniversalImageView;
import p000.dmb.C4978a;

/* compiled from: UniversalTileCreationTask */
/* renamed from: dly */
public class dly implements C4978a, Runnable {
    /* renamed from: a */
    private boolean f22146a;
    /* renamed from: b */
    private Context f22147b;
    /* renamed from: c */
    private int f22148c;
    /* renamed from: d */
    private int f22149d;
    /* renamed from: e */
    private String f22150e;
    /* renamed from: f */
    private boolean f22151f = false;

    public dly(Context context, String str) {
        this.f22147b = context;
        this.f22148c = UniversalImageView.f19846a;
        this.f22149d = UniversalImageView.f19847b;
        this.f22150e = str;
    }

    public void run() {
        m27954a(this.f22147b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m27954a(final Context r8) {
        /*
        r7 = this;
        java.lang.System.currentTimeMillis();
        r0 = new java.io.File;
        r1 = r7.f22150e;
        r0.<init>(r1);
        r1 = new java.io.File;
        r2 = r0.getAbsolutePath();
        r2 = p000.dlz.m27955a(r2);
        r1.<init>(r2);
        r2 = r0.exists();
        if (r2 != 0) goto L_0x001e;
    L_0x001d:
        return;
    L_0x001e:
        r2 = r1.exists();
        if (r2 != 0) goto L_0x0027;
    L_0x0024:
        r1.createNewFile();	 Catch:{ IOException -> 0x00e1 }
    L_0x0027:
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3.<init>();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r4 = 1;
        r3.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r4 = 0;
        android.graphics.BitmapFactory.decodeStream(r2, r4, r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.close();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2 = r3.outHeight;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r4 = -1;
        if (r2 != r4) goto L_0x004f;
    L_0x0040:
        r7.m27952b(r8);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r0.delete();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r0 = new dly$1;
        r0.<init>(r7, r1, r8);
        r0.start();
        goto L_0x001d;
    L_0x004f:
        r2 = new dlx;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r4 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r5 = r7.f22148c;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r6 = r7.f22149d;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.<init>(r4, r5, r6);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.m27940a(r7);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r4 = r3.outHeight;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r5 = r7.m27948a();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        if (r4 <= r5) goto L_0x0096;
    L_0x0067:
        r4 = r7.f22150e;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r5 = r3.outWidth;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3 = r3.outHeight;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.m27941a(r4, r5, r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
    L_0x0070:
        r2 = new java.io.File;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3 = p000.dlz.m27957b(r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r2.createNewFile();	 Catch:{ IOException -> 0x00e4, Exception -> 0x00c6 }
    L_0x0080:
        r2 = r1.exists();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        if (r2 == 0) goto L_0x0089;
    L_0x0086:
        r1.delete();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
    L_0x0089:
        r2 = 1;
        r7.m27949a(r8, r2);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r0 = new dly$1;
        r0.<init>(r7, r1, r8);
        r0.start();
        goto L_0x001d;
    L_0x0096:
        r3 = r7.f22150e;	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r3 = android.graphics.BitmapFactory.decodeFile(r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        if (r3 != 0) goto L_0x00ae;
    L_0x009e:
        r7.m27952b(r8);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r0.delete();	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        r0 = new dly$1;
        r0.<init>(r7, r1, r8);
        r0.start();
        goto L_0x001d;
    L_0x00ae:
        r2.m27938a(r3);	 Catch:{ IOException -> 0x00b2, Exception -> 0x00c6 }
        goto L_0x0070;
    L_0x00b2:
        r2 = move-exception;
        r2 = 1;
        r7.f22146a = r2;	 Catch:{ all -> 0x00d7 }
        r0.delete();	 Catch:{ all -> 0x00d7 }
        r7.m27952b(r8);	 Catch:{ all -> 0x00d7 }
        r0 = new dly$1;
        r0.<init>(r7, r1, r8);
        r0.start();
        goto L_0x001d;
    L_0x00c6:
        r2 = move-exception;
        r0.delete();	 Catch:{ all -> 0x00d7 }
        r7.m27952b(r8);	 Catch:{ all -> 0x00d7 }
        r0 = new dly$1;
        r0.<init>(r7, r1, r8);
        r0.start();
        goto L_0x001d;
    L_0x00d7:
        r0 = move-exception;
        r2 = new dly$1;
        r2.<init>(r7, r1, r8);
        r2.start();
        throw r0;
    L_0x00e1:
        r2 = move-exception;
        goto L_0x0027;
    L_0x00e4:
        r2 = move-exception;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: dly.a(android.content.Context):void");
    }

    /* renamed from: a */
    public void mo4451a(int i, int i2) {
    }

    /* renamed from: a */
    private int m27948a() {
        return (int) (((Runtime.getRuntime().maxMemory() / 4) / 4) / ((long) this.f22148c));
    }

    /* renamed from: a */
    private void m27949a(Context context, boolean z) {
    }

    /* renamed from: b */
    private void m27952b(Context context) {
    }
}
