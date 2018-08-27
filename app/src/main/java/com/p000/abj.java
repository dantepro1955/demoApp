package com.p000;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.common.util.ByteConstants;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash.FatalException;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.abh.C0014a;
import p000.abo.C0018a;
import p000.abw.C0031a;
import p000.aby;
import p000.ach.C0035d;
import p000.ach.C0037c;
import p000.ach.C0039b;
import p000.ach.C0069a;
import p000.acn;

/* compiled from: CrashlyticsController */
/* renamed from: abj */
class abj {
    /* renamed from: a */
    static final FilenameFilter f223a = new C00191();
    /* renamed from: b */
    static final Comparator<File> f224b = new C00257();
    /* renamed from: c */
    static final Comparator<File> f225c = new C00268();
    /* renamed from: d */
    static final FilenameFilter f226d = new C00279();
    /* renamed from: e */
    private static final Pattern f227e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    /* renamed from: f */
    private static final Map<String, String> f228f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    /* renamed from: g */
    private static final String[] f229g = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    /* renamed from: h */
    private final AtomicInteger f230h = new AtomicInteger(0);
    /* renamed from: i */
    private final abk f231i;
    /* renamed from: j */
    private final abi f232j;
    /* renamed from: k */
    private final HttpRequestFactory f233k;
    /* renamed from: l */
    private final IdManager f234l;
    /* renamed from: m */
    private final acd f235m;
    /* renamed from: n */
    private final FileStore f236n;
    /* renamed from: o */
    private final abc f237o;
    /* renamed from: p */
    private final C0032d f238p;
    /* renamed from: q */
    private final abw f239q;
    /* renamed from: r */
    private final C0037c f240r;
    /* renamed from: s */
    private final C0039b f241s;
    /* renamed from: t */
    private final abs f242t;
    /* renamed from: u */
    private final ack f243u;
    /* renamed from: v */
    private final String f244v;
    /* renamed from: w */
    private abo f245w;

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$1 */
    static class C00191 implements FilenameFilter {
        C00191() {
        }

        public boolean accept(File file, String str) {
            return str.length() == ".cls".length() + 35 && str.endsWith(".cls");
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$2 */
    class C00202 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ abj f201a;

        C00202(abj abj) {
            this.f201a = abj;
        }

        public /* synthetic */ Object call() throws Exception {
            return m228a();
        }

        /* renamed from: a */
        public Void m228a() throws Exception {
            this.f201a.m290m();
            return null;
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$4 */
    class C00224 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ abj f204a;

        C00224(abj abj) {
            this.f204a = abj;
        }

        public void run() {
            this.f204a.m300a(this.f204a.m270a(new C0030c()));
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$7 */
    static class C00257 implements Comparator<File> {
        C00257() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m231a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m231a(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$8 */
    static class C00268 implements Comparator<File> {
        C00268() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m232a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m232a(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$9 */
    static class C00279 implements FilenameFilter {
        C00279() {
        }

        public boolean accept(File file, String str) {
            return abj.f227e.matcher(str).matches();
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$a */
    static class C0028a implements FilenameFilter {
        private C0028a() {
        }

        public boolean accept(File file, String str) {
            return !abj.f223a.accept(file, str) && abj.f227e.matcher(str).matches();
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$b */
    static class C0029b implements FilenameFilter {
        /* renamed from: a */
        private final String f209a;

        public C0029b(String str) {
            this.f209a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f209a) && !str.endsWith(".cls_temp");
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$c */
    static class C0030c implements FilenameFilter {
        C0030c() {
        }

        public boolean accept(File file, String str) {
            return abf.f170a.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$d */
    static final class C0032d implements C0031a {
        /* renamed from: a */
        private final FileStore f210a;

        public C0032d(FileStore fileStore) {
            this.f210a = fileStore;
        }

        /* renamed from: a */
        public File mo9a() {
            File file = new File(this.f210a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$e */
    static final class C0036e implements C0035d {
        /* renamed from: a */
        private final Kit f214a;
        /* renamed from: b */
        private final acd f215b;
        /* renamed from: c */
        private final PromptSettingsData f216c;

        /* compiled from: CrashlyticsController */
        /* renamed from: abj$e$1 */
        class C00331 implements C0014a {
            /* renamed from: a */
            final /* synthetic */ C0036e f211a;

            C00331(C0036e c0036e) {
                this.f211a = c0036e;
            }

            /* renamed from: a */
            public void mo10a(boolean z) {
                this.f211a.f215b.m447a(z);
            }
        }

        public C0036e(Kit kit, acd acd, PromptSettingsData promptSettingsData) {
            this.f214a = kit;
            this.f215b = acd;
            this.f216c = promptSettingsData;
        }

        /* renamed from: a */
        public boolean mo11a() {
            Activity b = this.f214a.s().b();
            if (b == null || b.isFinishing()) {
                return true;
            }
            final abh a = abh.m216a(b, this.f216c, new C00331(this));
            b.runOnUiThread(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0036e f213b;

                public void run() {
                    a.m218a();
                }
            });
            Fabric.h().a("CrashlyticsCore", "Waiting for user opt-in.");
            a.m219b();
            return a.m220c();
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$f */
    final class C0038f implements C0037c {
        /* renamed from: a */
        final /* synthetic */ abj f217a;

        private C0038f(abj abj) {
            this.f217a = abj;
        }

        /* renamed from: a */
        public File[] mo12a() {
            return this.f217a.m303b();
        }

        /* renamed from: b */
        public File[] mo13b() {
            return this.f217a.m310i().listFiles();
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$g */
    final class C0040g implements C0039b {
        /* renamed from: a */
        final /* synthetic */ abj f218a;

        private C0040g(abj abj) {
            this.f218a = abj;
        }

        /* renamed from: a */
        public boolean mo14a() {
            return this.f218a.m306e();
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$h */
    static final class C0041h implements Runnable {
        /* renamed from: a */
        private final Context f219a;
        /* renamed from: b */
        private final acg f220b;
        /* renamed from: c */
        private final ach f221c;

        public C0041h(Context context, acg acg, ach ach) {
            this.f219a = context;
            this.f220b = acg;
            this.f221c = ach;
        }

        public void run() {
            if (CommonUtils.n(this.f219a)) {
                Fabric.h().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.f221c.m465a(this.f220b);
            }
        }
    }

    /* compiled from: CrashlyticsController */
    /* renamed from: abj$i */
    static class C0042i implements FilenameFilter {
        /* renamed from: a */
        private final String f222a;

        public C0042i(String str) {
            this.f222a = str;
        }

        public boolean accept(File file, String str) {
            if (str.equals(this.f222a + ".cls") || !str.contains(this.f222a) || str.endsWith(".cls_temp")) {
                return false;
            }
            return true;
        }
    }

    abj(abk abk, abi abi, HttpRequestFactory httpRequestFactory, IdManager idManager, acd acd, FileStore fileStore, abc abc, acm acm) {
        this.f231i = abk;
        this.f232j = abi;
        this.f233k = httpRequestFactory;
        this.f234l = idManager;
        this.f235m = acd;
        this.f236n = fileStore;
        this.f237o = abc;
        this.f244v = acm.mo26a();
        Context r = abk.r();
        this.f238p = new C0032d(fileStore);
        this.f239q = new abw(r, this.f238p);
        this.f240r = new C0038f();
        this.f241s = new C0040g();
        this.f242t = new abs(r);
        this.f243u = new abz(ByteConstants.KB, new acf(10));
    }

    /* renamed from: a */
    void m298a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        m293a();
        this.f245w = new abo(new C0018a(this) {
            /* renamed from: a */
            final /* synthetic */ p000.abj f192a;

            {
                this.f192a = r1;
            }

            /* renamed from: a */
            public void mo8a(Thread thread, Throwable th) {
                this.f192a.m299a(thread, th);
            }
        }, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.f245w);
    }

    /* renamed from: a */
    synchronized void m299a(final Thread thread, final Throwable th) {
        Fabric.h().a("CrashlyticsCore", "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.f242t.m358b();
        final Date date = new Date();
        this.f232j.m221a(new Callable<Void>(this) {
            /* renamed from: d */
            final /* synthetic */ p000.abj f196d;

            public /* synthetic */ Object call() throws Exception {
                return m226a();
            }

            /* renamed from: a */
            public Void m226a() throws Exception {
                this.f196d.f231i.m342o();
                this.f196d.m263a(date, thread, th);
                SettingsData b = Settings.a().b();
                SessionSettingsData sessionSettingsData = b != null ? b.f24245b : null;
                this.f196d.m302b(sessionSettingsData);
                this.f196d.m290m();
                if (sessionSettingsData != null) {
                    this.f196d.m295a(sessionSettingsData.f24234g);
                }
                if (!this.f196d.m267a(b)) {
                    this.f196d.m276b(b);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    void m294a(float f, SettingsData settingsData) {
        if (settingsData == null) {
            Fabric.h().d("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        new ach(this.f237o.f159a, m286h(settingsData.f24244a.f24200d), this.f240r, this.f241s).m464a(f, m267a(settingsData) ? new C0036e(this.f231i, this.f235m, settingsData.f24246c) : new C0069a());
    }

    /* renamed from: a */
    void m297a(final String str, final String str2, final String str3) {
        this.f232j.m223b(new Callable<Void>(this) {
            /* renamed from: d */
            final /* synthetic */ p000.abj f200d;

            public /* synthetic */ Object call() throws Exception {
                return m227a();
            }

            /* renamed from: a */
            public Void m227a() throws Exception {
                new aby(this.f200d.m307f()).m401a(this.f200d.m288k(), new acn(str, str2, str3));
                return null;
            }
        });
    }

    /* renamed from: a */
    void m293a() {
        this.f232j.m223b(new C00202(this));
    }

    /* renamed from: k */
    private String m288k() {
        File[] n = m291n();
        return n.length > 0 ? abj.m246a(n[0]) : null;
    }

    /* renamed from: l */
    private String m289l() {
        File[] n = m291n();
        return n.length > 1 ? abj.m246a(n[1]) : null;
    }

    /* renamed from: a */
    static String m246a(File file) {
        return file.getName().substring(0, 35);
    }

    /* renamed from: a */
    boolean m301a(final SessionSettingsData sessionSettingsData) {
        return ((Boolean) this.f232j.m221a(new Callable<Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ abj f203b;

            public /* synthetic */ Object call() throws Exception {
                return m229a();
            }

            /* renamed from: a */
            public Boolean m229a() throws Exception {
                if (this.f203b.m306e()) {
                    Fabric.h().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                Fabric.h().a("CrashlyticsCore", "Finalizing previously open sessions.");
                this.f203b.m255a(sessionSettingsData, true);
                Fabric.h().a("CrashlyticsCore", "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* renamed from: m */
    private void m290m() throws Exception {
        Date date = new Date();
        String abe = new abe(this.f234l).toString();
        Fabric.h().a("CrashlyticsCore", "Opening a new session with ID " + abe);
        m262a(abe, date);
        m281c(abe);
        m282d(abe);
        m283e(abe);
        this.f239q.m389a(abe);
    }

    /* renamed from: b */
    void m302b(SessionSettingsData sessionSettingsData) throws Exception {
        m255a(sessionSettingsData, false);
    }

    /* renamed from: a */
    private void m255a(SessionSettingsData sessionSettingsData, boolean z) throws Exception {
        int i = z ? 1 : 0;
        m272b(i + 8);
        File[] n = m291n();
        if (n.length <= i) {
            Fabric.h().a("CrashlyticsCore", "No open sessions to be closed.");
            return;
        }
        m284f(abj.m246a(n[i]));
        if (sessionSettingsData == null) {
            Fabric.h().a("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
        } else {
            m264a(n, i, sessionSettingsData.f24230c);
        }
    }

    /* renamed from: a */
    private void m264a(File[] fileArr, int i, int i2) {
        Fabric.h().a("CrashlyticsCore", "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = abj.m246a(file);
            Fabric.h().a("CrashlyticsCore", "Closing session: " + a);
            m256a(file, a, i2);
            i++;
        }
    }

    /* renamed from: a */
    private void m247a(abf abf) {
        if (abf != null) {
            try {
                abf.m163a();
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* renamed from: a */
    private void m259a(String str) {
        for (File delete : m278b(str)) {
            delete.delete();
        }
    }

    /* renamed from: b */
    private File[] m278b(String str) {
        return m270a(new C0042i(str));
    }

    /* renamed from: b */
    File[] m303b() {
        List linkedList = new LinkedList();
        Collections.addAll(linkedList, m269a(m308g(), f223a));
        Collections.addAll(linkedList, m269a(m309h(), f223a));
        Collections.addAll(linkedList, m269a(m307f(), f223a));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* renamed from: c */
    File[] m304c() {
        return m270a(new C0029b("BeginSession"));
    }

    /* renamed from: n */
    private File[] m291n() {
        File[] c = m304c();
        Arrays.sort(c, f224b);
        return c;
    }

    /* renamed from: a */
    private File[] m270a(FilenameFilter filenameFilter) {
        return m269a(m307f(), filenameFilter);
    }

    /* renamed from: a */
    private File[] m269a(File file, FilenameFilter filenameFilter) {
        return m279b(file.listFiles(filenameFilter));
    }

    /* renamed from: b */
    private File[] m277b(File file) {
        return m279b(file.listFiles());
    }

    /* renamed from: b */
    private File[] m279b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: a */
    private void m260a(String str, int i) {
        aco.m505a(m307f(), new C0029b(str + "SessionEvent"), i, f225c);
    }

    /* renamed from: a */
    void m295a(int i) {
        int a = i - aco.m504a(m308g(), i, f225c);
        aco.m505a(m307f(), f223a, a - aco.m504a(m309h(), a, f225c), f225c);
    }

    /* renamed from: b */
    private void m272b(int i) {
        Set hashSet = new HashSet();
        File[] n = m291n();
        int min = Math.min(i, n.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(abj.m246a(n[i2]));
        }
        this.f239q.m390a(hashSet);
        m265a(m270a(new C0028a()), hashSet);
    }

    /* renamed from: a */
    private void m265a(File[] fileArr, Set<String> set) {
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            File file = fileArr[i];
            String name = file.getName();
            Matcher matcher = f227e.matcher(name);
            if (matcher.matches()) {
                if (!set.contains(matcher.group(1))) {
                    Fabric.h().a("CrashlyticsCore", "Trimming session file: " + name);
                    file.delete();
                }
                i++;
            } else {
                Fabric.h().a("CrashlyticsCore", "Deleting unknown file: " + name);
                file.delete();
                return;
            }
        }
    }

    /* renamed from: a */
    private File[] m271a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        Fabric.h().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m260a(str, i);
        return m270a(new C0029b(str + "SessionEvent"));
    }

    /* renamed from: d */
    void m305d() {
        this.f232j.m222a(new C00224(this));
    }

    /* renamed from: a */
    void m300a(File[] fileArr) {
        int length;
        File file;
        int i = 0;
        final Set hashSet = new HashSet();
        for (File file2 : fileArr) {
            Fabric.h().a("CrashlyticsCore", "Found invalid session part file: " + file2);
            hashSet.add(abj.m246a(file2));
        }
        if (!hashSet.isEmpty()) {
            File i2 = m310i();
            if (!i2.exists()) {
                i2.mkdir();
            }
            File[] a = m270a(new FilenameFilter(this) {
                /* renamed from: b */
                final /* synthetic */ abj f206b;

                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            });
            length = a.length;
            while (i < length) {
                file2 = a[i];
                Fabric.h().a("CrashlyticsCore", "Moving session file: " + file2);
                if (!file2.renameTo(new File(i2, file2.getName()))) {
                    Fabric.h().a("CrashlyticsCore", "Could not move session file. Deleting " + file2);
                    file2.delete();
                }
                i++;
            }
            m292o();
        }
    }

    /* renamed from: o */
    private void m292o() {
        File i = m310i();
        if (i.exists()) {
            File[] a = m269a(i, new C0030c());
            Arrays.sort(a, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i2 = 0; i2 < a.length && hashSet.size() < 4; i2++) {
                hashSet.add(abj.m246a(a[i2]));
            }
            m265a(m277b(i), hashSet);
        }
    }

    /* renamed from: a */
    private void m263a(Date date, Thread thread, Throwable th) {
        Throwable e;
        Object obj;
        Closeable closeable;
        Flushable flushable = null;
        try {
            String k = m288k();
            if (k == null) {
                Fabric.h().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
                CommonUtils.a(null, "Failed to flush to session begin file.");
                CommonUtils.a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            abj.m261a(k, th.getClass().getName());
            OutputStream abf = new abf(m307f(), k + "SessionCrash");
            try {
                flushable = abg.m164a(abf);
                m250a(flushable, date, thread, th, "crash", true);
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
            } catch (Exception e2) {
                e = e2;
                obj = abf;
                try {
                    Fabric.h().e("CrashlyticsCore", "An error occurred in the fatal exception logger", e);
                    CommonUtils.a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.a(closeable, "Failed to close fatal exception file output stream.");
                } catch (Throwable th2) {
                    e = th2;
                    CommonUtils.a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.a(closeable, "Failed to close fatal exception file output stream.");
                    throw e;
                }
            } catch (Throwable th3) {
                e = th3;
                obj = abf;
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(closeable, "Failed to close fatal exception file output stream.");
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
            Fabric.h().e("CrashlyticsCore", "An error occurred in the fatal exception logger", e);
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(closeable, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            e = th4;
            closeable = null;
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(closeable, "Failed to close fatal exception file output stream.");
            throw e;
        }
    }

    /* renamed from: a */
    void m296a(final acu acu) {
        this.f232j.m223b(new Callable<Void>(this) {
            /* renamed from: b */
            final /* synthetic */ abj f208b;

            public /* synthetic */ Object call() throws Exception {
                return m230a();
            }

            /* renamed from: a */
            public Void m230a() throws Exception {
                if (!this.f208b.m306e()) {
                    this.f208b.m275b(acu);
                }
                return null;
            }
        });
    }

    /* renamed from: b */
    private void m275b(acu acu) throws IOException {
        Throwable e;
        Object obj = 1;
        Flushable flushable = null;
        Closeable abf;
        try {
            String l = m289l();
            if (l == null) {
                Fabric.h().e("CrashlyticsCore", "Tried to write a native crash while no session was open.", null);
                CommonUtils.a(null, "Failed to flush to session begin file.");
                CommonUtils.a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            abj.m261a(l, String.format(Locale.US, "<native-crash [%s (%s)]>", new Object[]{acu.f394b.f400b, acu.f394b.f399a}));
            if (acu.f396d == null || acu.f396d.length <= 0) {
                obj = null;
            }
            abf = new abf(m307f(), l + (obj != null ? "SessionCrash" : "SessionMissingBinaryImages"));
            try {
                flushable = abg.m164a((OutputStream) abf);
                acb.m440a(acu, new abw(this.f231i.r(), this.f238p, l), new aby(m307f()).m402b(l), flushable);
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
            } catch (Exception e2) {
                e = e2;
                try {
                    Fabric.h().e("CrashlyticsCore", "An error occurred in the native crash logger", e);
                    CommonUtils.a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            abf = null;
            Fabric.h().e("CrashlyticsCore", "An error occurred in the native crash logger", e);
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
        } catch (Throwable th2) {
            e = th2;
            abf = null;
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(abf, "Failed to close fatal exception file output stream.");
            throw e;
        }
    }

    /* renamed from: a */
    private void m262a(String str, Date date) throws Exception {
        Closeable abf;
        Throwable th;
        Flushable flushable = null;
        try {
            abf = new abf(m307f(), str + "BeginSession");
            try {
                flushable = abg.m164a((OutputStream) abf);
                aci.m490a((abg) flushable, str, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.f231i.m328a()}), date.getTime() / 1000);
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(abf, "Failed to close begin session file.");
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(abf, "Failed to close begin session file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            abf = null;
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(abf, "Failed to close begin session file.");
            throw th;
        }
    }

    /* renamed from: c */
    private void m281c(String str) throws Exception {
        Object obj;
        Throwable th;
        Closeable closeable;
        Flushable flushable = null;
        try {
            OutputStream abf = new abf(m307f(), str + "SessionApp");
            try {
                abg a = abg.m164a(abf);
                try {
                    aci.m492a(a, this.f234l.c(), this.f237o.f159a, this.f237o.f163e, this.f237o.f164f, this.f234l.b(), DeliveryMechanism.a(this.f237o.f161c).a(), this.f244v);
                    CommonUtils.a(a, "Failed to flush to session app file.");
                    CommonUtils.a(abf, "Failed to close session app file.");
                } catch (Throwable th2) {
                    obj = abf;
                    abg abg = a;
                    th = th2;
                    Object obj2 = abg;
                    CommonUtils.a(flushable, "Failed to flush to session app file.");
                    CommonUtils.a(closeable, "Failed to close session app file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = abf;
                CommonUtils.a(flushable, "Failed to flush to session app file.");
                CommonUtils.a(closeable, "Failed to close session app file.");
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            CommonUtils.a(flushable, "Failed to flush to session app file.");
            CommonUtils.a(closeable, "Failed to close session app file.");
            throw th;
        }
    }

    /* renamed from: d */
    private void m282d(String str) throws Exception {
        Throwable th;
        Flushable flushable = null;
        Closeable abf;
        try {
            abf = new abf(m307f(), str + "SessionOS");
            try {
                flushable = abg.m164a((OutputStream) abf);
                aci.m495a((abg) flushable, CommonUtils.g(this.f231i.r()));
                CommonUtils.a(flushable, "Failed to flush to session OS file.");
                CommonUtils.a(abf, "Failed to close session OS file.");
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a(flushable, "Failed to flush to session OS file.");
                CommonUtils.a(abf, "Failed to close session OS file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            abf = null;
            CommonUtils.a(flushable, "Failed to flush to session OS file.");
            CommonUtils.a(abf, "Failed to close session OS file.");
            throw th;
        }
    }

    /* renamed from: e */
    private void m283e(String str) throws Exception {
        Throwable th;
        Closeable closeable = null;
        Flushable flushable = null;
        try {
            OutputStream abf = new abf(m307f(), str + "SessionDevice");
            try {
                flushable = abg.m164a(abf);
                Context r = this.f231i.r();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                aci.m489a((abg) flushable, this.f234l.h(), CommonUtils.a(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.b(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.f(r), this.f234l.i(), CommonUtils.h(r), Build.MANUFACTURER, Build.PRODUCT);
                CommonUtils.a(flushable, "Failed to flush session device info.");
                CommonUtils.a(abf, "Failed to close session device file.");
            } catch (Throwable th2) {
                th = th2;
                Object obj = abf;
                CommonUtils.a(flushable, "Failed to flush session device info.");
                CommonUtils.a(closeable, "Failed to close session device file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.a(flushable, "Failed to flush session device info.");
            CommonUtils.a(closeable, "Failed to close session device file.");
            throw th;
        }
    }

    /* renamed from: f */
    private void m284f(String str) throws Exception {
        Throwable th;
        Flushable flushable = null;
        Closeable abf;
        try {
            abf = new abf(m307f(), str + "SessionUser");
            try {
                flushable = abg.m164a((OutputStream) abf);
                acn g = m285g(str);
                if (g.m503a()) {
                    CommonUtils.a(flushable, "Failed to flush session user file.");
                    CommonUtils.a(abf, "Failed to close session user file.");
                    return;
                }
                aci.m491a((abg) flushable, g.f371b, g.f372c, g.f373d);
                CommonUtils.a(flushable, "Failed to flush session user file.");
                CommonUtils.a(abf, "Failed to close session user file.");
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a(flushable, "Failed to flush session user file.");
                CommonUtils.a(abf, "Failed to close session user file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            abf = null;
            CommonUtils.a(flushable, "Failed to flush session user file.");
            CommonUtils.a(abf, "Failed to close session user file.");
            throw th;
        }
    }

    /* renamed from: a */
    private void m250a(abg abg, Date date, Thread thread, Throwable th, String str, boolean z) throws Exception {
        Thread[] threadArr;
        Map treeMap;
        acl acl = new acl(th, this.f243u);
        Context r = this.f231i.r();
        long time = date.getTime() / 1000;
        Float c = CommonUtils.c(r);
        int a = CommonUtils.a(r, this.f242t.m357a());
        boolean d = CommonUtils.d(r);
        int i = r.getResources().getConfiguration().orientation;
        long b = CommonUtils.b() - CommonUtils.b(r);
        long b2 = CommonUtils.b(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a2 = CommonUtils.a(r.getPackageName(), r);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = acl.f368c;
        String str2 = this.f237o.f160b;
        String c2 = this.f234l.c();
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            threadArr = new Thread[allStackTraces.size()];
            int i2 = 0;
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr[i2] = (Thread) entry.getKey();
                linkedList.add(this.f243u.mo27a((StackTraceElement[]) entry.getValue()));
                i2++;
            }
        } else {
            threadArr = new Thread[0];
        }
        if (CommonUtils.a(r, "com.crashlytics.CollectCustomKeys", true)) {
            Map g = this.f231i.m334g();
            treeMap = (g == null || g.size() <= 1) ? g : new TreeMap(g);
        } else {
            treeMap = new TreeMap();
        }
        aci.m483a(abg, time, str, acl, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.f239q, a2, i, c2, str2, c, a, d, b, b2);
    }

    /* renamed from: a */
    private void m256a(File file, String str, int i) {
        boolean z;
        Fabric.h().a("CrashlyticsCore", "Collecting session parts for ID " + str);
        File[] a = m270a(new C0029b(str + "SessionCrash"));
        boolean z2 = a != null && a.length > 0;
        Fabric.h().a("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        File[] a2 = m270a(new C0029b(str + "SessionEvent"));
        if (a2 == null || a2.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        Fabric.h().a("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z)}));
        if (z2 || z) {
            m257a(file, str, m271a(str, a2, i), z2 ? a[0] : null);
        } else {
            Fabric.h().a("CrashlyticsCore", "No events present for session ID " + str);
        }
        Fabric.h().a("CrashlyticsCore", "Removing session part files for ID " + str);
        m259a(str);
    }

    /* renamed from: a */
    private void m257a(File file, String str, File[] fileArr, File file2) {
        Throwable e;
        boolean z = file2 != null;
        File g = z ? m308g() : m309h();
        if (!g.exists()) {
            g.mkdirs();
        }
        Closeable abf;
        try {
            abf = new abf(g, str);
            try {
                abg a = abg.m164a((OutputStream) abf);
                Fabric.h().a("CrashlyticsCore", "Collecting SessionStart data for session ID " + str);
                abj.m248a(a, file);
                a.m191a(4, new Date().getTime() / 1000);
                a.m193a(5, z);
                a.m190a(11, 1);
                a.m201b(12, 3);
                m249a(a, str);
                abj.m251a(a, fileArr, str);
                if (z) {
                    abj.m248a(a, file2);
                }
                CommonUtils.a(a, "Error flushing session file stream");
                CommonUtils.a(abf, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                try {
                    Fabric.h().e("CrashlyticsCore", "Failed to write session file for session ID: " + str, e);
                    CommonUtils.a(null, "Error flushing session file stream");
                    m247a((abf) abf);
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(null, "Error flushing session file stream");
                    CommonUtils.a(abf, "Failed to close CLS file");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            abf = null;
            Fabric.h().e("CrashlyticsCore", "Failed to write session file for session ID: " + str, e);
            CommonUtils.a(null, "Error flushing session file stream");
            m247a((abf) abf);
        } catch (Throwable th2) {
            e = th2;
            abf = null;
            CommonUtils.a(null, "Error flushing session file stream");
            CommonUtils.a(abf, "Failed to close CLS file");
            throw e;
        }
    }

    /* renamed from: a */
    private static void m251a(abg abg, File[] fileArr, String str) {
        Arrays.sort(fileArr, CommonUtils.f23975a);
        for (File name : fileArr) {
            try {
                Fabric.h().a("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                abj.m248a(abg, name);
            } catch (Throwable e) {
                Fabric.h().e("CrashlyticsCore", "Error writting non-fatal to session.", e);
            }
        }
    }

    /* renamed from: a */
    private void m249a(abg abg, String str) throws IOException {
        for (String str2 : f229g) {
            File[] a = m270a(new C0029b(str + str2));
            if (a.length == 0) {
                Fabric.h().e("CrashlyticsCore", "Can't find " + str2 + " data for session ID " + str, null);
            } else {
                Fabric.h().a("CrashlyticsCore", "Collecting " + str2 + " data for session ID " + str);
                abj.m248a(abg, a[0]);
            }
        }
    }

    /* renamed from: a */
    private static void m248a(abg abg, File file) throws IOException {
        Closeable fileInputStream;
        Throwable th;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    abj.m258a((InputStream) fileInputStream, abg, (int) file.length());
                    CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        }
        Fabric.h().e("CrashlyticsCore", "Tried to include a file that doesn't exist: " + file.getName(), null);
    }

    /* renamed from: a */
    private static void m258a(InputStream inputStream, abg abg, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        abg.m198a(bArr);
    }

    /* renamed from: g */
    private acn m285g(String str) {
        if (m306e()) {
            return new acn(this.f231i.m335h(), this.f231i.m337j(), this.f231i.m336i());
        }
        return new aby(m307f()).m400a(str);
    }

    /* renamed from: e */
    boolean m306e() {
        return this.f245w != null && this.f245w.m351a();
    }

    /* renamed from: f */
    File m307f() {
        return this.f236n.a();
    }

    /* renamed from: g */
    File m308g() {
        return new File(m307f(), "fatal-sessions");
    }

    /* renamed from: h */
    File m309h() {
        return new File(m307f(), "nonfatal-sessions");
    }

    /* renamed from: i */
    File m310i() {
        return new File(m307f(), "invalidClsFiles");
    }

    /* renamed from: a */
    private boolean m267a(SettingsData settingsData) {
        if (settingsData == null || !settingsData.f24247d.f24213a || this.f235m.m448a()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private abq m286h(String str) {
        return new abr(this.f231i, CommonUtils.b(this.f231i.r(), "com.crashlytics.ApiEndpoint"), str, this.f233k);
    }

    /* renamed from: b */
    private void m276b(SettingsData settingsData) {
        if (settingsData == null) {
            Fabric.h().d("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context r = this.f231i.r();
        ach ach = new ach(this.f237o.f159a, m286h(settingsData.f24244a.f24200d), this.f240r, this.f241s);
        for (File acj : m303b()) {
            this.f232j.m222a(new C0041h(r, new acj(acj, f228f), ach));
        }
    }

    /* renamed from: a */
    private static void m261a(String str, String str2) {
        zw zwVar = (zw) Fabric.a(zw.class);
        if (zwVar == null) {
            Fabric.h().a("CrashlyticsCore", "Answers is not available");
        } else {
            zwVar.a(new FatalException(str, str2));
        }
    }
}
