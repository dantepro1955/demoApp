package com.p000;

import android.content.Context;
import com.facebook.common.util.ByteConstants;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

/* compiled from: ClearImageCacheTask */
/* renamed from: cml */
public class cml extends cnf {
    /* renamed from: a */
    private static caf f9772a = caf.m12046a();
    /* renamed from: b */
    private long f9773b;
    /* renamed from: c */
    private boolean f9774c;
    /* renamed from: d */
    private boolean f9775d;
    /* renamed from: e */
    private chq f9776e;

    /* compiled from: ClearImageCacheTask */
    /* renamed from: cml$1 */
    class C17691 implements Comparator<C1770a> {
        /* renamed from: a */
        final /* synthetic */ cml f9768a;

        C17691(cml cml) {
            this.f9768a = cml;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m14547a((C1770a) obj, (C1770a) obj2);
        }

        /* renamed from: a */
        public int m14547a(C1770a c1770a, C1770a c1770a2) {
            long j = c1770a2.f9770b - c1770a.f9770b;
            if (j == 0) {
                return 0;
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* compiled from: ClearImageCacheTask */
    /* renamed from: cml$a */
    static class C1770a {
        /* renamed from: a */
        File f9769a;
        /* renamed from: b */
        long f9770b;
        /* renamed from: c */
        String f9771c;

        public C1770a(File file) {
            this.f9769a = file;
            this.f9770b = file.lastModified();
            this.f9771c = file.getName();
        }

        /* renamed from: a */
        public static C1770a[] m14548a(File[] fileArr) {
            int i = 0;
            int length = fileArr == null ? 0 : fileArr.length;
            C1770a[] c1770aArr = new C1770a[length];
            while (i < length) {
                c1770aArr[i] = new C1770a(fileArr[i]);
                i++;
            }
            return c1770aArr;
        }
    }

    public cml(boolean z, boolean z2) {
        this(z, z2, f9772a.m12068d().m12026e());
    }

    public cml(boolean z, boolean z2, boolean z3) {
        this.f9774c = z;
        this.f9775d = z2;
        this.f9773b = System.currentTimeMillis() - 172800000;
        this.f9776e = new chq(z3);
    }

    /* renamed from: a */
    private Comparator<C1770a> m14552a() {
        return new C17691(this);
    }

    /* renamed from: a */
    private int m14549a(File file) {
        int i = 0;
        int i2 = -1;
        if (!(file == null || file.list() == null)) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            i2 = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2 != null) {
                    if (file2.isFile()) {
                        i2++;
                    } else if (file2.isDirectory()) {
                        i2 += m14549a(file2);
                    }
                }
                i++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private long m14555b(File file) {
        long j = -1;
        if (!(file == null || file.listFiles() == null)) {
            j = 0;
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isFile()) {
                        j += file2.length();
                    } else if (file2.isDirectory()) {
                        j += m14555b(file2);
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    private String m14551a(long j, boolean z) {
        int i = z ? 1000 : ByteConstants.KB;
        if (j < ((long) i)) {
            return j + " B";
        }
        String str = (z ? "kMGTPE" : "KMGTPE").charAt(((int) (Math.log((double) j) / Math.log((double) i))) - 1) + (z ? "" : "i");
        return String.format(Locale.US, "%.1f %sB", new Object[]{Double.valueOf(((double) j) / Math.pow((double) i, (double) ((int) (Math.log((double) j) / Math.log((double) i))))), str});
    }

    /* renamed from: b */
    private String m14556b(Context context) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("tileImageDir", new File(this.f9776e.m13519j(context)));
            hashMap.put("srcImageDir", new File(this.f9776e.m13508c(context)));
            hashMap.put("srcGifDir", new File(this.f9776e.m13516g(context)));
            hashMap.put("srcMp4Dir", new File(this.f9776e.m13517h(context)));
            hashMap.put("srcThumbDir", new File(this.f9776e.m13514f(context)));
            hashMap.put("uploadDir", new File(this.f9776e.m13518i(context)));
            hashMap.put("profileImageDir", new File(this.f9776e.m13504b(context)));
            hashMap.put("coverImageDir", new File(this.f9776e.m13513e(context)));
            String str = "\n";
            int i = 0;
            int i2 = 0;
            String str2 = "";
            for (Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                File file = (File) entry.getValue();
                int a = m14549a(file);
                long b = m14555b(file);
                i2 += a;
                i = (int) (((long) i) + b);
                if (str3.equals("srcImageDir") || str3.equals("tileImageDir")) {
                    str2 = str2 + str + str3 + " path=" + file.getAbsolutePath() + str;
                }
                str2 = str2 + str + str3 + " - " + a + "; " + m14551a(b, false) + "; " + str;
            }
            return str2 + str + " total; " + i2 + "; " + m14551a((long) i, false) + "; " + str;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* renamed from: a */
    public void mo1796a(Context context) {
        String b = m14556b(context);
        try {
            if (!this.f9775d) {
                m14559e(context);
                m14560f(context);
                Context context2 = context;
                dct.a().a(context2, null, new can(), false, cag.m12097a(context).m12104c());
                dct.a().k();
                if (this.f9774c) {
                    m14561g(context);
                    m14562h(context);
                    m14563i(context);
                    m14558d(context);
                    m14557c(context);
                }
            }
        } catch (Exception e) {
        }
        chn.m13327C("Before clearing cache: " + b + ", After clearing cache: " + m14556b(context));
    }

    /* renamed from: a */
    private void m14553a(File file, boolean z, int i, long j) {
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            if (z) {
                m14554a(listFiles);
                return;
            }
            C1770a[] a = C1770a.m14548a(listFiles);
            Arrays.sort(a, m14552a());
            m14550a(a, i, j);
        }
    }

    /* renamed from: c */
    private void m14557c(Context context) {
        m14553a(new File(this.f9776e.m13518i(context)), this.f9774c, GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, this.f9773b);
    }

    /* renamed from: d */
    private void m14558d(Context context) {
        m14553a(new File(this.f9776e.m13514f(context)), this.f9774c, GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, this.f9773b);
    }

    /* renamed from: e */
    private void m14559e(Context context) {
        File file = new File(this.f9776e.m13504b(context));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            if (this.f9774c) {
                m14554a(listFiles);
                return;
            }
            C1770a[] a = C1770a.m14548a(listFiles);
            Arrays.sort(a, m14552a());
            m14550a(a, 100, this.f9773b);
        }
    }

    /* renamed from: f */
    private void m14560f(Context context) {
        File file = new File(this.f9776e.m13513e(context));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            if (this.f9774c) {
                m14554a(listFiles);
                return;
            }
            C1770a[] a = C1770a.m14548a(listFiles);
            Arrays.sort(a, m14552a());
            m14550a(a, GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, this.f9773b);
        }
    }

    /* renamed from: g */
    private void m14561g(Context context) {
        File file = new File(this.f9776e.m13508c(context));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && this.f9774c) {
                m14554a(listFiles);
            }
        }
    }

    /* renamed from: h */
    private void m14562h(Context context) {
        File file = new File(this.f9776e.m13516g(context));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            if (this.f9774c) {
                m14554a(listFiles);
                return;
            }
            C1770a[] a = C1770a.m14548a(listFiles);
            Arrays.sort(a, m14552a());
            m14550a(a, 30, this.f9773b);
        }
    }

    /* renamed from: i */
    private void m14563i(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(this.f9776e.m13517h(context));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && this.f9774c) {
                C1770a[] a = C1770a.m14548a(listFiles);
                Arrays.sort(a, m14552a());
                m14550a(a, 50, currentTimeMillis - 3600000);
                chq chq = new chq(true);
                if (chq.m13517h(context) != null) {
                    File file2 = new File(chq.m13517h(context));
                    if (file2.exists()) {
                        listFiles = file2.listFiles();
                        if (listFiles != null) {
                            a = C1770a.m14548a(listFiles);
                            Arrays.sort(a, m14552a());
                            m14550a(a, 50, currentTimeMillis - 3600000);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m14554a(File[] fileArr) {
        for (File file : fileArr) {
            if (file.isDirectory()) {
                djl.a(file);
            } else if (!file.getName().endsWith(".nomedia")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private int m14550a(C1770a[] c1770aArr, int i, long j) {
        int i2 = 0;
        int length = c1770aArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (!c1770aArr[i4].f9769a.getName().endsWith(".nomedia")) {
                if (i3 == 0) {
                    if (i4 > i) {
                        i3 = 1;
                    } else if (c1770aArr[i4].f9770b < j) {
                        i3 = 1;
                    }
                }
                if (i3 != 0) {
                    c1770aArr[i4].f9769a.delete();
                    i2++;
                }
            }
        }
        return i2;
    }

    /* renamed from: e */
    int mo1797e() {
        return 3;
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }
}
