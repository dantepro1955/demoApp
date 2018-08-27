package com.p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import p000.eq.C5301a;
import p000.eq.C5301a.C5295a;

/* compiled from: RemoteInput */
/* renamed from: eo */
public final class eo extends C5301a {
    /* renamed from: a */
    public static final C5295a f23647a = new C52961();
    /* renamed from: g */
    private static final C5297a f23648g;
    /* renamed from: b */
    private final String f23649b;
    /* renamed from: c */
    private final CharSequence f23650c;
    /* renamed from: d */
    private final CharSequence[] f23651d;
    /* renamed from: e */
    private final boolean f23652e;
    /* renamed from: f */
    private final Bundle f23653f;

    /* compiled from: RemoteInput */
    /* renamed from: eo$1 */
    static class C52961 implements C5295a {
        C52961() {
        }
    }

    /* compiled from: RemoteInput */
    /* renamed from: eo$a */
    interface C5297a {
    }

    /* compiled from: RemoteInput */
    /* renamed from: eo$b */
    static class C5298b implements C5297a {
        C5298b() {
        }
    }

    /* compiled from: RemoteInput */
    /* renamed from: eo$c */
    static class C5299c implements C5297a {
        C5299c() {
        }
    }

    /* compiled from: RemoteInput */
    /* renamed from: eo$d */
    static class C5300d implements C5297a {
        C5300d() {
        }
    }

    /* renamed from: a */
    public String mo4699a() {
        return this.f23649b;
    }

    /* renamed from: b */
    public CharSequence mo4700b() {
        return this.f23650c;
    }

    /* renamed from: c */
    public CharSequence[] mo4701c() {
        return this.f23651d;
    }

    /* renamed from: d */
    public boolean mo4702d() {
        return this.f23652e;
    }

    /* renamed from: e */
    public Bundle mo4703e() {
        return this.f23653f;
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            f23648g = new C5298b();
        } else if (VERSION.SDK_INT >= 16) {
            f23648g = new C5300d();
        } else {
            f23648g = new C5299c();
        }
    }
}
