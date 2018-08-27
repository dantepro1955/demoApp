package com.p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import p000.ann.C0296c;
import p000.ari.C0301a;

/* renamed from: ase */
public interface ase {

    /* renamed from: ase$a */
    public interface C0731a {
        /* renamed from: a */
        void mo632a(int i, boolean z);

        /* renamed from: a */
        void mo633a(Bundle bundle);

        /* renamed from: a */
        void mo634a(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo635a(T t);

    /* renamed from: a */
    ConnectionResult mo636a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    ConnectionResult mo637a(ann<?> ann);

    /* renamed from: a */
    void mo638a();

    /* renamed from: a */
    void mo639a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    boolean mo640a(asr asr);

    /* renamed from: b */
    <A extends C0296c, T extends C0301a<? extends ant, A>> T mo641b(T t);

    /* renamed from: b */
    ConnectionResult mo642b();

    /* renamed from: c */
    void mo643c();

    /* renamed from: d */
    boolean mo644d();

    /* renamed from: e */
    boolean mo645e();

    /* renamed from: f */
    void mo646f();

    /* renamed from: g */
    void mo647g();
}
