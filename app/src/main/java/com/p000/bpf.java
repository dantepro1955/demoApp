package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzzm;
import com.google.android.gms.internal.zzzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import p000.ann.C0286b;
import p000.ann.C0290a.C0644b;
import p000.ann.C0297f;
import p000.ann.C0646g;
import p000.axj.C0868d;

/* renamed from: bpf */
public final class bpf {
    /* renamed from: a */
    public static final C0646g<bpj> f7355a = new C0646g();
    /* renamed from: b */
    public static final C0286b<bpj, C0644b> f7356b = new C13901();
    @Deprecated
    /* renamed from: c */
    public static final ann<C0644b> f7357c = new ann("ClearcutLogger.API", f7356b, f7355a);
    /* renamed from: d */
    private final String f7358d;
    /* renamed from: e */
    private final int f7359e;
    /* renamed from: f */
    private String f7360f;
    /* renamed from: g */
    private int f7361g;
    /* renamed from: h */
    private String f7362h;
    /* renamed from: i */
    private String f7363i;
    /* renamed from: j */
    private final boolean f7364j;
    /* renamed from: k */
    private int f7365k;
    /* renamed from: l */
    private final bpg f7366l;
    /* renamed from: m */
    private final apt f7367m;
    /* renamed from: n */
    private C1394d f7368n;
    /* renamed from: o */
    private final C1392b f7369o;

    /* renamed from: bpf$1 */
    class C13901 extends C0286b<bpj, C0644b> {
        C13901() {
        }

        /* renamed from: a */
        public /* synthetic */ C0297f mo323a(Context context, Looper looper, aou aou, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return m10260a(context, looper, aou, (C0644b) obj, connectionCallbacks, onConnectionFailedListener);
        }

        /* renamed from: a */
        public bpj m10260a(Context context, Looper looper, aou aou, C0644b c0644b, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new bpj(context, looper, aou, connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: bpf$a */
    public class C1391a {
        /* renamed from: a */
        final /* synthetic */ bpf f7341a;
        /* renamed from: b */
        private int f7342b;
        /* renamed from: c */
        private String f7343c;
        /* renamed from: d */
        private String f7344d;
        /* renamed from: e */
        private String f7345e;
        /* renamed from: f */
        private int f7346f;
        /* renamed from: g */
        private final C1393c f7347g;
        /* renamed from: h */
        private ArrayList<Integer> f7348h;
        /* renamed from: i */
        private ArrayList<String> f7349i;
        /* renamed from: j */
        private ArrayList<Integer> f7350j;
        /* renamed from: k */
        private ArrayList<byte[]> f7351k;
        /* renamed from: l */
        private boolean f7352l;
        /* renamed from: m */
        private final C0868d f7353m;
        /* renamed from: n */
        private boolean f7354n;

        private C1391a(bpf bpf, byte[] bArr) {
            this(bpf, bArr, null);
        }

        private C1391a(bpf bpf, byte[] bArr, C1393c c1393c) {
            this.f7341a = bpf;
            this.f7342b = this.f7341a.f7361g;
            this.f7343c = this.f7341a.f7360f;
            this.f7344d = this.f7341a.f7362h;
            this.f7345e = this.f7341a.f7363i;
            this.f7346f = 0;
            this.f7348h = null;
            this.f7349i = null;
            this.f7350j = null;
            this.f7351k = null;
            this.f7352l = true;
            this.f7353m = new C0868d();
            this.f7354n = false;
            this.f7344d = bpf.f7362h;
            this.f7345e = bpf.f7363i;
            this.f7353m.f4860a = bpf.f7367m.mo606a();
            this.f7353m.f4861b = bpf.f7367m.mo607b();
            this.f7353m.f4875p = bpf.f7368n.m10268a(this.f7353m.f4860a);
            if (bArr != null) {
                this.f7353m.f4870k = bArr;
            }
            this.f7347g = c1393c;
        }

        @Deprecated
        /* renamed from: a */
        public anq<Status> m10261a(GoogleApiClient googleApiClient) {
            return m10264b();
        }

        /* renamed from: a */
        public C1391a m10262a(int i) {
            this.f7353m.f4864e = i;
            return this;
        }

        /* renamed from: a */
        public zzzm m10263a() {
            return new zzzm(new zzzu(this.f7341a.f7358d, this.f7341a.f7359e, this.f7342b, this.f7343c, this.f7344d, this.f7345e, this.f7341a.f7364j, this.f7346f), this.f7353m, this.f7347g, null, bpf.m10277d(null), bpf.m10279e(null), bpf.m10277d(null), bpf.m10281f(null), this.f7352l);
        }

        @Deprecated
        /* renamed from: b */
        public anq<Status> m10264b() {
            if (this.f7354n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f7354n = true;
            zzzm a = m10263a();
            zzzu zzzu = a.f15135a;
            return this.f7341a.f7369o.mo1394a(zzzu.f15151g, zzzu.f15147c) ? this.f7341a.f7366l.mo1388a(a) : anr.m4567a(Status.f14761a);
        }

        /* renamed from: b */
        public C1391a m10265b(int i) {
            this.f7353m.f4865f = i;
            return this;
        }
    }

    /* renamed from: bpf$b */
    public interface C1392b {
        /* renamed from: a */
        boolean mo1394a(String str, int i);
    }

    /* renamed from: bpf$c */
    public interface C1393c {
        /* renamed from: a */
        byte[] m10267a();
    }

    /* renamed from: bpf$d */
    public static class C1394d {
        /* renamed from: a */
        public long m10268a(long j) {
            return (long) (TimeZone.getDefault().getOffset(j) / 1000);
        }
    }

    public bpf(Context context, int i, String str, String str2, String str3, boolean z, bpg bpg, apt apt, C1394d c1394d, C1392b c1392b) {
        boolean z2 = false;
        this.f7361g = -1;
        this.f7365k = 0;
        this.f7358d = context.getPackageName();
        this.f7359e = m10269a(context);
        this.f7361g = i;
        this.f7360f = str;
        this.f7362h = str2;
        this.f7363i = str3;
        this.f7364j = z;
        this.f7366l = bpg;
        this.f7367m = apt;
        if (c1394d == null) {
            c1394d = new C1394d();
        }
        this.f7368n = c1394d;
        this.f7365k = 0;
        this.f7369o = c1392b;
        if (this.f7364j) {
            if (this.f7362h == null) {
                z2 = true;
            }
            aoi.m4689b(z2, "can't be anonymous with an upload account");
        }
    }

    public bpf(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, bpi.m10310a(context), apv.m4885d(), null, new bpn(context));
    }

    /* renamed from: a */
    private int m10269a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    /* renamed from: d */
    private static int[] m10277d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: e */
    private static String[] m10279e(ArrayList<String> arrayList) {
        return arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    private static byte[][] m10281f(ArrayList<byte[]> arrayList) {
        return arrayList == null ? null : (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: a */
    public C1391a m10288a(byte[] bArr) {
        return new C1391a(bArr);
    }
}
