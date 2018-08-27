package com.p000;

import android.content.Context;
import android.os.AsyncTask;
import android.text.Html;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiGagMedia;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: GagPostWrapper */
/* renamed from: cct */
public class cct extends crz<cld> {
    /* renamed from: k */
    private static final Map<cld, WeakReference<cct>> f8609k = new WeakHashMap();
    /* renamed from: a */
    private String f8610a = null;
    /* renamed from: c */
    private ApiGagMedia f8611c = null;
    /* renamed from: d */
    private String f8612d;
    /* renamed from: e */
    private String f8613e;
    /* renamed from: f */
    private String f8614f;
    /* renamed from: g */
    private String f8615g;
    /* renamed from: h */
    private long f8616h = 0;
    /* renamed from: i */
    private long f8617i = 0;
    /* renamed from: j */
    private boolean f8618j = false;

    /* compiled from: GagPostWrapper */
    /* renamed from: cct$1 */
    class C16801 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ cct f8750a;

        C16801(cct cct) {
            this.f8750a = cct;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m12569a((Void[]) objArr);
        }

        /* renamed from: a */
        protected Void m12569a(Void... voidArr) {
            if (!(this.f8750a.R() == null || ((cld) this.f8750a.R()).m12619b() == null)) {
                caf.m12046a().m12075g().f9370c.m13820a((cld) this.f8750a.R());
            }
            return null;
        }
    }

    protected cct(cld cld) {
        super(cld);
    }

    /* renamed from: a */
    public static cct m12254a(cld cld) {
        cct cct;
        synchronized (f8609k) {
            WeakReference weakReference = (WeakReference) f8609k.get(cld);
            if (weakReference != null) {
                cct = (cct) weakReference.get();
                if (cct != null) {
                }
            }
            cct = new cct(cld);
            f8609k.put(cld, new WeakReference(cct));
        }
        return cct;
    }

    /* renamed from: d */
    public String m12281d() {
        if (this.f8610a == null) {
            this.f8610a = Html.fromHtml(((cld) R()).m12626d()).toString();
        }
        return this.f8610a;
    }

    /* renamed from: e */
    public String m12282e() {
        return R() == null ? null : ((cld) R()).m12623c();
    }

    /* renamed from: f */
    public int m12283f() {
        return ((cld) R()).m12649m().intValue();
    }

    /* renamed from: g */
    public String m12284g() {
        if (R() == null || ((cld) R()).m12664z() == null) {
            return "";
        }
        return ((cld) R()).m12664z().m14274b();
    }

    /* renamed from: h */
    public String m12285h() {
        return ((cld) R()).m12655q();
    }

    /* renamed from: i */
    public boolean m12286i() {
        return cct.m12256a(m12284g(), caf.m12046a().m12075g().m13729g().f9565b);
    }

    /* renamed from: j */
    public boolean m12287j() {
        return cct.m12256a(((cld) R()).m12632f(), ApiGag.TYPE_ANIMATED);
    }

    /* renamed from: k */
    public boolean m12288k() {
        return cct.m12256a(((cld) R()).m12632f(), ApiGag.TYPE_ALBUM);
    }

    /* renamed from: l */
    public cke m12289l() {
        return ((cld) R()).m12611C();
    }

    /* renamed from: a */
    private static boolean m12256a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence.length();
            if (length == charSequence2.length()) {
                if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m12290m() {
        return cct.m12256a(((cld) R()).m12632f(), ApiGag.TYPE_VIDEO);
    }

    /* renamed from: n */
    public boolean m12291n() {
        return ((cld) R()).m12610B().image460sv.hasAudio.intValue() != 0;
    }

    /* renamed from: o */
    public boolean m12292o() {
        return cct.m12256a(((cld) R()).m12632f(), ApiGag.TYPE_PHOTO);
    }

    /* renamed from: p */
    public boolean m12293p() {
        return cra.a(((cld) R()).m12651n(), Integer.valueOf(1));
    }

    /* renamed from: q */
    public boolean m12294q() {
        return cra.a(((cld) R()).m12653o(), Integer.valueOf(1)) && ((cld) R()).m12612D() != null;
    }

    /* renamed from: r */
    public int m12295r() {
        return cra.a(((cld) R()).m12654p());
    }

    /* renamed from: s */
    public int m12296s() {
        return cra.a(((cld) R()).m12643j());
    }

    /* renamed from: t */
    public int m12297t() {
        return cra.a(((cld) R()).m12645k());
    }

    /* renamed from: a */
    public void m12276a(String str) {
        this.f8615g = str;
    }

    /* renamed from: u */
    public String m12298u() {
        return this.f8615g;
    }

    /* renamed from: a */
    private ApiGagMedia mo1639a() {
        if (this.f8611c == null) {
            if ((caf.m12046a().m12068d().f8408e == 700 ? 1 : null) != null) {
                this.f8611c = ((cld) R()).m12610B().image700;
            } else {
                this.f8611c = ((cld) R()).m12610B().image460;
            }
        }
        return this.f8611c;
    }

    /* renamed from: v */
    public String m12299v() {
        return mo1639a().url;
    }

    /* renamed from: w */
    public int m12300w() {
        return mo1639a().width;
    }

    /* renamed from: x */
    public int m12301x() {
        return mo1639a().height;
    }

    /* renamed from: y */
    public String m12302y() {
        if (((cld) R()).m12610B().image460c == null) {
            return "http://";
        }
        return ((cld) R()).m12610B().image460c.url;
    }

    /* renamed from: z */
    public int m12303z() {
        return ((cld) R()).m12610B().image460c.width;
    }

    /* renamed from: A */
    public int m12257A() {
        return ((cld) R()).m12610B().image460c.height;
    }

    /* renamed from: B */
    public String m12258B() {
        if (((cld) R()).m12610B() == null) {
            return "http://";
        }
        return ((cld) R()).m12610B().image460sv.url;
    }

    /* renamed from: C */
    public String m12259C() {
        if (m12293p()) {
            return m12302y();
        }
        return m12299v();
    }

    /* renamed from: D */
    public ckh m12260D() {
        return ((cld) R()).m12612D();
    }

    /* renamed from: E */
    public int m12261E() {
        return ((cld) R()).m12612D().f9533a.f9527a;
    }

    /* renamed from: F */
    public int m12262F() {
        return ((cld) R()).m12612D().f9533a.f9528b;
    }

    /* renamed from: G */
    public ckg[] m12263G() {
        return ((cld) R()).m12612D().f9533a.f9529c;
    }

    /* renamed from: H */
    public String[] m12264H() {
        return ((cld) R()).m12613E();
    }

    /* renamed from: a */
    public String m12274a(Context context) {
        String c = m12280c(context);
        this.f8612d = c + " · " + m12278b(context);
        return this.f8612d;
    }

    /* renamed from: b */
    public String m12278b(Context context) {
        this.f8613e = String.format(djo.a(context, R.plurals.comments_count, ((cld) R()).m12641i().intValue()), new Object[]{djo.a(r0)});
        return this.f8613e;
    }

    /* renamed from: c */
    public String m12280c(Context context) {
        this.f8614f = String.format(djo.a(context, R.plurals.points_count, ((cld) R()).m12643j().intValue()), new Object[]{djo.a(r0)});
        return this.f8614f;
    }

    /* renamed from: I */
    public boolean m12265I() {
        if (this.b == null) {
            return false;
        }
        return cra.a(((cld) R()).m12647l(), Integer.valueOf(1));
    }

    /* renamed from: J */
    public void m12266J() {
        cld cld = (cld) R();
        int a = cra.a(cld.m12643j());
        int a2 = cra.a(cld.m12645k());
        if (cra.a(cld.m12654p(), Integer.valueOf(1))) {
            cld.m12639h(Integer.valueOf(0));
            cld.m12620b(Integer.valueOf(a - 1));
        } else if (cra.a(cld.m12654p(), Integer.valueOf(-1))) {
            cld.m12639h(Integer.valueOf(0));
            cld.m12620b(Integer.valueOf(a + 1));
            cld.m12624c(Integer.valueOf(a2 - 1));
        }
        m12269M();
    }

    /* renamed from: K */
    public boolean m12267K() {
        cld cld = (cld) R();
        int a = cra.a(cld.m12643j());
        int a2 = cra.a(cld.m12645k());
        if (cra.a(cld.m12654p(), Integer.valueOf(1))) {
            cld.m12639h(Integer.valueOf(0));
            cld.m12620b(Integer.valueOf(a - 1));
            return false;
        }
        if (cra.a(cld.m12654p(), Integer.valueOf(-1))) {
            cld.m12624c(Integer.valueOf(a2 - 1));
            cld.m12620b(Integer.valueOf(a + 1));
        }
        cld.m12639h(Integer.valueOf(1));
        cld.m12620b(Integer.valueOf(cra.a(cld.m12643j()) + 1));
        return true;
    }

    /* renamed from: L */
    public boolean m12268L() {
        cld cld = (cld) R();
        int a = cra.a(cld.m12643j());
        int a2 = cra.a(cld.m12645k());
        if (cra.a(cld.m12654p(), Integer.valueOf(-1))) {
            cld.m12639h(Integer.valueOf(0));
            cld.m12620b(Integer.valueOf(a + 1));
            cld.m12624c(Integer.valueOf(a2 - 1));
            return false;
        }
        if (cra.a(cld.m12654p(), Integer.valueOf(1))) {
            cld.m12620b(Integer.valueOf(a - 1));
        }
        cld.m12639h(Integer.valueOf(-1));
        cld.m12620b(Integer.valueOf(cra.a(cld.m12643j()) - 1));
        cld.m12624c(Integer.valueOf(a2 + 1));
        return true;
    }

    /* renamed from: M */
    public void m12269M() {
        new C16801(this).execute(new Void[0]);
    }

    /* renamed from: N */
    public long m12270N() {
        return this.f8616h;
    }

    /* renamed from: a */
    public void m12275a(long j) {
        this.f8616h = j;
    }

    /* renamed from: O */
    public long m12271O() {
        return this.f8617i;
    }

    /* renamed from: b */
    public void m12279b(long j) {
        this.f8617i = j;
    }

    /* renamed from: P */
    public boolean m12272P() {
        return this.f8618j;
    }

    /* renamed from: a */
    public void m12277a(boolean z) {
        this.f8618j = z;
    }

    /* renamed from: Q */
    public buh m12273Q() {
        if (R() == null) {
            return null;
        }
        return new bum().m11091a(((cld) R()).m12662x());
    }
}
