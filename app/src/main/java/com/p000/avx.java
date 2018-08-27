package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.atr.C0800a;
import p000.atr.C0803d;
import p000.ave.C0845a;

/* renamed from: avx */
public class avx {
    /* renamed from: c */
    protected static final Object f4710c = new Object();
    /* renamed from: e */
    protected static final Object f4711e = new Object();
    /* renamed from: h */
    private static final String f4712h = avx.class.getSimpleName();
    /* renamed from: u */
    private static aqm f4713u = null;
    /* renamed from: a */
    protected Context f4714a;
    /* renamed from: b */
    protected Context f4715b;
    /* renamed from: d */
    protected boolean f4716d = false;
    /* renamed from: f */
    protected boolean f4717f = false;
    /* renamed from: g */
    protected boolean f4718g = false;
    /* renamed from: i */
    private ExecutorService f4719i;
    /* renamed from: j */
    private DexClassLoader f4720j;
    /* renamed from: k */
    private ave f4721k;
    /* renamed from: l */
    private byte[] f4722l;
    /* renamed from: m */
    private volatile AdvertisingIdClient f4723m = null;
    /* renamed from: n */
    private volatile boolean f4724n = false;
    /* renamed from: o */
    private Future f4725o = null;
    /* renamed from: p */
    private volatile C0800a f4726p = null;
    /* renamed from: q */
    private Future f4727q = null;
    /* renamed from: r */
    private volatile boolean f4728r = false;
    /* renamed from: s */
    private atz f4729s;
    /* renamed from: t */
    private GoogleApiClient f4730t = null;
    /* renamed from: v */
    private Map<Pair<String, String>, axk> f4731v;

    /* renamed from: avx$1 */
    class C08551 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ avx f4707a;

        C08551(avx avx) {
            this.f4707a = avx;
        }

        public void run() {
            this.f4707a.m6089s();
        }
    }

    /* renamed from: avx$2 */
    class C08562 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ avx f4708a;

        C08562(avx avx) {
            this.f4708a = avx;
        }

        public void run() {
            this.f4708a.m6091u();
            synchronized (avx.f4710c) {
                this.f4708a.f4728r = false;
            }
        }
    }

    /* renamed from: avx$3 */
    class C08573 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ avx f4709a;

        C08573(avx avx) {
            this.f4709a = avx;
        }

        public void run() {
            bbb.m7128a(this.f4709a.f4714a);
        }
    }

    private avx(Context context) {
        this.f4714a = context;
        this.f4715b = context.getApplicationContext();
        this.f4731v = new HashMap();
    }

    /* renamed from: a */
    public static avx m6076a(Context context, String str, String str2, boolean z) {
        avx avx = new avx(context);
        try {
            avx.m6084a(str, str2, z);
            return avx;
        } catch (avh e) {
            return null;
        }
    }

    /* renamed from: a */
    private File m6077a(String str, File file, String str2) throws C0845a, IOException {
        File file2 = new File(String.format("%s/%s.jar", new Object[]{file, str2}));
        if (!file2.exists()) {
            byte[] a = this.f4721k.m5942a(this.f4722l, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(a, 0, a.length);
            fileOutputStream.close();
        }
        return file2;
    }

    /* renamed from: a */
    private void m6079a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(f4712h, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    /* renamed from: a */
    private void m6080a(File file, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileInputStream fileInputStream2;
                    FileOutputStream fileOutputStream2;
                    try {
                        fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                }
                                m6079a(file3);
                                return;
                            }
                            axf c0803d = new C0803d();
                            c0803d.f4436d = VERSION.SDK.getBytes();
                            c0803d.f4435c = str.getBytes();
                            bArr = this.f4721k.m5940a(this.f4722l, bArr).getBytes();
                            c0803d.f4433a = bArr;
                            c0803d.f4434b = atx.m5704a(bArr);
                            file2.createNewFile();
                            fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                byte[] a = axf.m5615a(c0803d);
                                fileOutputStream2.write(a, 0, a.length);
                                fileOutputStream2.close();
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e3) {
                                }
                                m6079a(file3);
                            } catch (IOException e4) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                m6079a(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                m6079a(file3);
                            } catch (C0845a e8) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                m6079a(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream = fileOutputStream2;
                                th = th3;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                m6079a(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream2 = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            m6079a(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream2 = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            m6079a(file3);
                        } catch (C0845a e13) {
                            fileOutputStream2 = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            m6079a(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m6079a(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream2 = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        m6079a(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream2 = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        m6079a(file3);
                    } catch (C0845a e16) {
                        fileOutputStream2 = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        m6079a(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m6079a(file3);
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m6081a(String str) throws avh {
        this.f4721k = new ave(null);
        try {
            this.f4722l = this.f4721k.m5941a(str);
        } catch (Throwable e) {
            throw new avh(e);
        }
    }

    /* renamed from: a */
    private void m6082a(boolean z) {
        this.f4724n = z;
        if (z) {
            this.f4725o = this.f4719i.submit(new C08551(this));
        }
    }

    /* renamed from: a */
    private boolean m6084a(String str, String str2, boolean z) throws avh {
        this.f4719i = Executors.newCachedThreadPool();
        m6082a(z);
        m6092v();
        m6090t();
        if (avz.m6118b() && ((Boolean) bbb.bN.m7064c()).booleanValue()) {
            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
        }
        m6081a(str);
        m6087b(str2);
        this.f4729s = new atz(this);
        return true;
    }

    /* renamed from: b */
    private boolean m6086b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                m6079a(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    Log.d(f4712h, "Cannot read the cache data.");
                    m6079a(file2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                    return false;
                }
                C0803d a = C0803d.m5668a(bArr);
                if (str.equals(new String(a.f4435c)) && Arrays.equals(a.f4434b, atx.m5704a(a.f4433a)) && Arrays.equals(a.f4436d, VERSION.SDK.getBytes())) {
                    bArr = this.f4721k.m5942a(this.f4722l, new String(a.f4433a));
                    file3.createNewFile();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    try {
                        fileOutputStream3.write(bArr, 0, bArr.length);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        try {
                            fileOutputStream3.close();
                            return true;
                        } catch (IOException e3) {
                            return true;
                        }
                    } catch (IOException e4) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (C0845a e8) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                m6079a(file2);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (C0845a e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (C0845a e17) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private boolean m6087b(String str) throws avh {
        File file;
        String b;
        File a;
        try {
            File cacheDir = this.f4714a.getCacheDir();
            if (cacheDir == null) {
                cacheDir = this.f4714a.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new avh();
                }
            }
            file = cacheDir;
            b = avf.m5959b();
            a = m6077a(str, file, b);
            m6086b(file, b);
            this.f4720j = new DexClassLoader(a.getAbsolutePath(), file.getAbsolutePath(), null, this.f4714a.getClassLoader());
            m6079a(a);
            m6080a(file, b);
            m6088c(String.format("%s/%s.dex", new Object[]{file, b}));
            return true;
        } catch (Throwable e) {
            throw new avh(e);
        } catch (Throwable e2) {
            throw new avh(e2);
        } catch (Throwable e22) {
            throw new avh(e22);
        } catch (Throwable e222) {
            throw new avh(e222);
        } catch (Throwable th) {
            m6079a(a);
            m6080a(file, b);
            m6088c(String.format("%s/%s.dex", new Object[]{file, b}));
        }
    }

    /* renamed from: c */
    private void m6088c(String str) {
        m6079a(new File(str));
    }

    /* renamed from: s */
    private void m6089s() {
        try {
            if (this.f4723m == null && this.f4715b != null) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f4715b);
                advertisingIdClient.start();
                this.f4723m = advertisingIdClient;
            }
        } catch (ank e) {
            this.f4723m = null;
        } catch (IOException e2) {
            this.f4723m = null;
        } catch (anl e3) {
            this.f4723m = null;
        }
    }

    /* renamed from: t */
    private void m6090t() {
        if (((Boolean) bbb.bP.m7064c()).booleanValue()) {
            m6108n();
        }
    }

    /* renamed from: u */
    private void m6091u() {
        if (this.f4717f) {
            try {
                this.f4726p = auc.m5742a(this.f4714a, this.f4714a.getPackageName(), Integer.toString(this.f4714a.getPackageManager().getPackageInfo(this.f4714a.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: v */
    private void m6092v() {
        boolean z = true;
        this.f4719i.execute(new C08573(this));
        try {
            f4713u = aqm.m4517b();
            this.f4716d = f4713u.mo569b(this.f4714a) > 0;
            if (f4713u.mo565a(this.f4714a) != 0) {
                z = false;
            }
            this.f4717f = z;
            if (this.f4714a.getApplicationContext() != null) {
                this.f4730t = new Builder(this.f4714a).addApi(bpf.f7357c).build();
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    public Context m6093a() {
        return this.f4714a;
    }

    /* renamed from: a */
    public Method m6094a(String str, String str2) {
        axk axk = (axk) this.f4731v.get(new Pair(str, str2));
        return axk == null ? null : axk.m6365a();
    }

    /* renamed from: a */
    public boolean m6095a(String str, String str2, List<Class> list) {
        if (this.f4731v.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f4731v.put(new Pair(str, str2), new axk(this, str, str2, list));
        return true;
    }

    /* renamed from: b */
    public Context m6096b() {
        return this.f4715b;
    }

    /* renamed from: c */
    public ExecutorService m6097c() {
        return this.f4719i;
    }

    /* renamed from: d */
    public DexClassLoader m6098d() {
        return this.f4720j;
    }

    /* renamed from: e */
    public ave m6099e() {
        return this.f4721k;
    }

    /* renamed from: f */
    public byte[] m6100f() {
        return this.f4722l;
    }

    /* renamed from: g */
    public GoogleApiClient m6101g() {
        return this.f4730t;
    }

    /* renamed from: h */
    public boolean m6102h() {
        return this.f4716d;
    }

    /* renamed from: i */
    public boolean m6103i() {
        return this.f4718g;
    }

    /* renamed from: j */
    public atz m6104j() {
        return this.f4729s;
    }

    /* renamed from: k */
    public boolean m6105k() {
        return this.f4717f;
    }

    /* renamed from: l */
    public C0800a m6106l() {
        return this.f4726p;
    }

    /* renamed from: m */
    public Future m6107m() {
        return this.f4727q;
    }

    /* renamed from: n */
    public void m6108n() {
        synchronized (f4710c) {
            if (!this.f4728r) {
                this.f4727q = this.f4719i.submit(new C08562(this));
                this.f4728r = true;
            }
        }
    }

    /* renamed from: o */
    public AdvertisingIdClient m6109o() {
        if (!this.f4724n) {
            return null;
        }
        if (this.f4723m != null) {
            return this.f4723m;
        }
        if (this.f4725o != null) {
            try {
                this.f4725o.get(2000, TimeUnit.MILLISECONDS);
                this.f4725o = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.f4725o.cancel(true);
            }
        }
        return this.f4723m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: p */
    public void m6110p() {
        /*
        r2 = this;
        r1 = f4711e;	 Catch:{ Throwable -> 0x001e }
        monitor-enter(r1);	 Catch:{ Throwable -> 0x001e }
        r0 = r2.f4718g;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f4717f;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0020;
    L_0x000d:
        r0 = r2.f4730t;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0020;
    L_0x0011:
        r0 = r2.f4730t;	 Catch:{ all -> 0x001b }
        r0.connect();	 Catch:{ all -> 0x001b }
        r0 = 1;
        r2.f4718g = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ Throwable -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        goto L_0x0008;
    L_0x0020:
        r0 = 0;
        r2.f4718g = r0;	 Catch:{ all -> 0x001b }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: avx.p():void");
    }

    /* renamed from: q */
    public void m6111q() {
        synchronized (f4711e) {
            if (this.f4718g && this.f4730t != null) {
                this.f4730t.disconnect();
                this.f4718g = false;
            }
        }
    }

    /* renamed from: r */
    public int m6112r() {
        atz j = m6104j();
        return j != null ? j.m5728a() : LinearLayoutManager.INVALID_OFFSET;
    }
}
