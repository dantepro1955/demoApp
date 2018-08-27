package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p000.bth.C1469a;
import p000.btl.C1474d;
import p000.btn.C1479a;
import p000.btn.C1480b;

/* renamed from: btj */
public final class btj extends btl<bth> implements bsx {
    /* renamed from: b */
    private final String f7606b;
    /* renamed from: c */
    private final String f7607c;
    /* renamed from: d */
    private final String f7608d;
    /* renamed from: e */
    private boolean f7609e;

    public btj(Context context, String str, String str2, String str3, C1479a c1479a, C1480b c1480b) {
        super(context, c1479a, c1480b);
        this.f7606b = (String) bsv.m10706a((Object) str);
        this.f7607c = bsv.m10708a(str2, (Object) "callingPackage cannot be null or empty");
        this.f7608d = bsv.m10708a(str3, (Object) "callingAppVersion cannot be null or empty");
    }

    /* renamed from: k */
    private final void m10884k() {
        m10882i();
        if (this.f7609e) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* renamed from: a */
    public final IBinder mo1509a() {
        m10884k();
        try {
            return ((bth) m10883j()).mo1504a();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo1510a(IBinder iBinder) {
        return C1469a.m10861a(iBinder);
    }

    /* renamed from: a */
    protected final void mo1511a(bte bte, C1474d c1474d) throws RemoteException {
        bte.mo1495a(c1474d, 1202, this.f7607c, this.f7608d, this.f7606b, null);
    }

    /* renamed from: a */
    public final void mo1512a(boolean z) {
        if (m10879f()) {
            try {
                ((bth) m10883j()).mo1506a(z);
            } catch (RemoteException e) {
            }
            this.f7609e = true;
        }
    }

    /* renamed from: b */
    protected final String mo1513b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* renamed from: c */
    protected final String mo1514c() {
        return "com.google.android.youtube.api.service.START";
    }

    /* renamed from: d */
    public final void mo1507d() {
        if (!this.f7609e) {
            mo1512a(true);
        }
        super.mo1507d();
    }
}
