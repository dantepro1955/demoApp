package com.p000;

import android.content.Context;
import android.util.Log;
import com.facebook.common.util.ByteConstants;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.network.PinningInfoProvider;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@DependsOn(a = {acq.class})
/* compiled from: CrashlyticsCore */
/* renamed from: abk */
public class abk extends Kit<Void> {
    /* renamed from: a */
    private final long f255a;
    /* renamed from: b */
    private final ConcurrentHashMap<String, String> f256b;
    /* renamed from: c */
    private abl f257c;
    /* renamed from: d */
    private abl f258d;
    /* renamed from: k */
    private abm f259k;
    /* renamed from: l */
    private abj f260l;
    /* renamed from: m */
    private String f261m;
    /* renamed from: n */
    private String f262n;
    /* renamed from: o */
    private String f263o;
    /* renamed from: p */
    private float f264p;
    /* renamed from: q */
    private boolean f265q;
    /* renamed from: r */
    private final acc f266r;
    /* renamed from: s */
    private HttpRequestFactory f267s;
    /* renamed from: t */
    private abi f268t;
    /* renamed from: u */
    private acq f269u;

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$1 */
    class C00431 extends PriorityCallable<Void> {
        /* renamed from: a */
        final /* synthetic */ abk f246a;

        C00431(abk abk) {
            this.f246a = abk;
        }

        public /* synthetic */ Object call() throws Exception {
            return m311a();
        }

        /* renamed from: a */
        public Void m311a() throws Exception {
            return this.f246a.m332d();
        }

        /* renamed from: b */
        public Priority m312b() {
            return Priority.f24065d;
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$2 */
    class C00442 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ abk f247a;

        C00442(abk abk) {
            this.f247a = abk;
        }

        public /* synthetic */ Object call() throws Exception {
            return m313a();
        }

        /* renamed from: a */
        public Void m313a() throws Exception {
            this.f247a.f257c.m344a();
            Fabric.h().a("CrashlyticsCore", "Initialization marker file created.");
            return null;
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$3 */
    class C00453 implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ abk f248a;

        C00453(abk abk) {
            this.f248a = abk;
        }

        public /* synthetic */ Object call() throws Exception {
            return m314a();
        }

        /* renamed from: a */
        public Boolean m314a() throws Exception {
            try {
                boolean c = this.f248a.f257c.m346c();
                Fabric.h().a("CrashlyticsCore", "Initialization marker file removed: " + c);
                return Boolean.valueOf(c);
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.valueOf(false);
            }
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$4 */
    class C00464 implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ abk f249a;

        C00464(abk abk) {
            this.f249a = abk;
        }

        public /* synthetic */ Object call() throws Exception {
            return m315a();
        }

        /* renamed from: a */
        public Boolean m315a() throws Exception {
            return Boolean.valueOf(this.f249a.f257c.m345b());
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$a */
    public static class C0047a {
        /* renamed from: a */
        private float f250a = -1.0f;
        /* renamed from: b */
        private abm f251b;
        /* renamed from: c */
        private acc f252c;
        /* renamed from: d */
        private boolean f253d = false;

        /* renamed from: a */
        public C0047a m316a(abm abm) {
            if (abm == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.f251b != null) {
                throw new IllegalStateException("listener already set.");
            } else {
                this.f251b = abm;
                return this;
            }
        }

        /* renamed from: a */
        public abk m317a() {
            if (this.f250a < 0.0f) {
                this.f250a = 1.0f;
            }
            return new abk(this.f250a, this.f251b, this.f252c, this.f253d);
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$b */
    static final class C0048b implements Callable<Boolean> {
        /* renamed from: a */
        private final abl f254a;

        public /* synthetic */ Object call() throws Exception {
            return m318a();
        }

        public C0048b(abl abl) {
            this.f254a = abl;
        }

        /* renamed from: a */
        public Boolean m318a() throws Exception {
            if (!this.f254a.m345b()) {
                return Boolean.FALSE;
            }
            Fabric.h().a("CrashlyticsCore", "Found previous crash marker.");
            this.f254a.m346c();
            return Boolean.TRUE;
        }
    }

    /* compiled from: CrashlyticsCore */
    /* renamed from: abk$c */
    static final class C0049c implements abm {
        private C0049c() {
        }

        /* renamed from: a */
        public void mo15a() {
        }
    }

    /* renamed from: f */
    protected /* synthetic */ Object m333f() {
        return m332d();
    }

    public abk() {
        this(1.0f, null, null, false);
    }

    abk(float f, abm abm, acc acc, boolean z) {
        this(f, abm, acc, z, ExecutorUtils.a("Crashlytics Exception Handler"));
    }

    abk(float f, abm abm, acc acc, boolean z, ExecutorService executorService) {
        this.f261m = null;
        this.f262n = null;
        this.f263o = null;
        this.f264p = f;
        if (abm == null) {
            abm = new C0049c();
        }
        this.f259k = abm;
        this.f266r = acc;
        this.f265q = z;
        this.f268t = new abi(executorService);
        this.f256b = new ConcurrentHashMap();
        this.f255a = System.currentTimeMillis();
    }

    protected boolean f_() {
        return m330a(super.r());
    }

    /* renamed from: a */
    boolean m330a(Context context) {
        if (this.f265q) {
            return false;
        }
        String a = new ApiKey().a(context);
        if (a == null) {
            return false;
        }
        String m = CommonUtils.m(context);
        if (abk.m322a(m, CommonUtils.a(context, "com.crashlytics.RequireBuildId", true))) {
            try {
                Fabric.h().c("CrashlyticsCore", "Initializing Crashlytics " + m328a());
                FileStore fileStoreImpl = new FileStoreImpl(this);
                this.f258d = new abl("crash_marker", fileStoreImpl);
                this.f257c = new abl("initialization_marker", fileStoreImpl);
                acd a2 = acd.m446a(new PreferenceStoreImpl(r(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                PinningInfoProvider abn = this.f266r != null ? new abn(this.f266r) : null;
                this.f267s = new DefaultHttpRequestFactory(Fabric.h());
                this.f267s.a(abn);
                IdManager q = q();
                abc a3 = abc.m152a(context, q, a, m);
                acm abx = new abx(context, a3.f162d);
                Fabric.h().a("CrashlyticsCore", "Installer package name is: " + a3.f161c);
                this.f260l = new abj(this, this.f268t, this.f267s, q, a2, fileStoreImpl, a3, abx);
                boolean m2 = m340m();
                m327x();
                this.f260l.m298a(Thread.getDefaultUncaughtExceptionHandler());
                if (m2 && CommonUtils.n(context)) {
                    Fabric.h().a("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m326w();
                    return false;
                }
                Fabric.h().a("CrashlyticsCore", "Exception handling initialization successful");
                return true;
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", e);
                this.f260l = null;
                return false;
            }
        }
        throw new UnmetDependencyException("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
    }

    /* renamed from: d */
    protected Void m332d() {
        m338k();
        acu n = m341n();
        if (n != null) {
            this.f260l.m296a(n);
        }
        this.f260l.m305d();
        try {
            SettingsData b = Settings.a().b();
            if (b == null) {
                Fabric.h().d("CrashlyticsCore", "Received null settings, skipping report submission!");
            } else if (b.f24247d.f24215c) {
                if (!this.f260l.m301a(b.f24245b)) {
                    Fabric.h().a("CrashlyticsCore", "Could not finalize previous sessions.");
                }
                this.f260l.m294a(this.f264p, b);
                m339l();
            } else {
                Fabric.h().a("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
                m339l();
            }
        } catch (Throwable e) {
            Fabric.h().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", e);
        } finally {
            m339l();
        }
        return null;
    }

    /* renamed from: b */
    public String m331b() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* renamed from: a */
    public String m328a() {
        return "2.3.17.dev";
    }

    /* renamed from: e */
    public static abk m325e() {
        return (abk) Fabric.a(abk.class);
    }

    /* renamed from: a */
    public void m329a(String str) {
        if (!this.f265q && abk.m323b("prior to setting user data.")) {
            this.f263o = abk.m324c(str);
            this.f260l.m297a(this.f261m, this.f263o, this.f262n);
        }
    }

    /* renamed from: g */
    Map<String, String> m334g() {
        return Collections.unmodifiableMap(this.f256b);
    }

    /* renamed from: h */
    String m335h() {
        return q().a() ? this.f261m : null;
    }

    /* renamed from: i */
    String m336i() {
        return q().a() ? this.f262n : null;
    }

    /* renamed from: j */
    String m337j() {
        return q().a() ? this.f263o : null;
    }

    /* renamed from: w */
    private void m326w() {
        Callable c00431 = new C00431(this);
        for (Task a : v()) {
            c00431.a(a);
        }
        Future submit = s().f().submit(c00431);
        Fabric.h().a("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Fabric.h().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", e);
        } catch (Throwable e2) {
            Fabric.h().e("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", e2);
        } catch (Throwable e22) {
            Fabric.h().e("CrashlyticsCore", "Crashlytics timed out during initialization.", e22);
        }
    }

    /* renamed from: k */
    void m338k() {
        this.f268t.m221a(new C00442(this));
    }

    /* renamed from: l */
    void m339l() {
        this.f268t.m223b(new C00453(this));
    }

    /* renamed from: m */
    boolean m340m() {
        return ((Boolean) this.f268t.m221a(new C00464(this))).booleanValue();
    }

    /* renamed from: n */
    acu m341n() {
        if (this.f269u != null) {
            return this.f269u.m507a();
        }
        return null;
    }

    /* renamed from: x */
    private void m327x() {
        if (Boolean.TRUE.equals((Boolean) this.f268t.m221a(new C0048b(this.f258d)))) {
            try {
                this.f259k.mo15a();
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    /* renamed from: o */
    void m342o() {
        this.f258d.m344a();
    }

    /* renamed from: b */
    private static boolean m323b(String str) {
        abk e = abk.m325e();
        if (e != null && e.f260l != null) {
            return true;
        }
        Fabric.h().e("CrashlyticsCore", "Crashlytics must be initialized by calling Fabric.with(Context) " + str, null);
        return false;
    }

    /* renamed from: c */
    private static String m324c(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        if (str.length() > ByteConstants.KB) {
            return str.substring(0, ByteConstants.KB);
        }
        return str;
    }

    /* renamed from: a */
    static boolean m322a(String str, boolean z) {
        if (!z) {
            Fabric.h().a("CrashlyticsCore", "Configured not to require a build ID.");
            return true;
        } else if (!CommonUtils.c(str)) {
            return true;
        } else {
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".     |  | ");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".   \\ |  | /");
            Log.e("CrashlyticsCore", ".    \\    /");
            Log.e("CrashlyticsCore", ".     \\  /");
            Log.e("CrashlyticsCore", ".      \\/");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".      /\\");
            Log.e("CrashlyticsCore", ".     /  \\");
            Log.e("CrashlyticsCore", ".    /    \\");
            Log.e("CrashlyticsCore", ".   / |  | \\");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".");
            return false;
        }
    }
}
