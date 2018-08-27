package com.p000;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ninegag.android.app.GagApplication;
import com.ninegag.android.app.otto.MobileCoverSettingChangedEvent;
import com.ninegag.android.app.otto.NewPostCountUpdatedEvent;
import com.ninegag.android.app.otto.setting.UnlockAutoDarkModeChangedEvent;
import java.security.Key;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: AppOptionController */
/* renamed from: cip */
public class cip extends cir {
    /* renamed from: a */
    private static cip f9395a = new cip();
    /* renamed from: b */
    private static caf f9396b = caf.m12046a();

    /* compiled from: AppOptionController */
    /* renamed from: cip$1 */
    class C17511 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cip f9390a;

        C17511(cip cip) {
            this.f9390a = cip;
        }

        public void run() {
            cip.f9396b.m12054a(new UnlockAutoDarkModeChangedEvent());
        }
    }

    /* renamed from: a */
    public static cip m13967a() {
        return f9395a;
    }

    private cip() {
    }

    /* renamed from: b */
    public String mo1761b() {
        String b = super.mo1761b();
        if (TextUtils.isEmpty(b)) {
            return "[\"com.facebook.katana\", \"com.whatsapp/com.whatsapp.ContactPicker\", \"com.facebook.orca/com.facebook.messenger.activity.ShareLauncherActivity\", \"com.pinterest/com.pinterest.activity.create.PinItActivity\", \"__save__\", \"__copy_link__\", \"com.google.android.gm/com.google.android.gm.ComposeActivityGmail\", \"com.twitter.android/com.twitter.android.composer.TextFirstComposerActivity\", \"com.google.android.talk/com.google.android.apps.babel.phone.ShareIntentActivity\", \"com.google.android.apps.plus/com.google.android.apps.plus.phone.SignOnActivity\", \"com.android.chrome/com.android.chrome.Main\", \"__report__\", \"__delete__\"]";
        }
        return b;
    }

    /* renamed from: c */
    public String mo1763c() {
        String c = super.mo1763c();
        if (TextUtils.isEmpty(c)) {
            return "com.facebook.katana/com.facebook.katana.activity.composer.ImplicitShareIntentHandler";
        }
        return c;
    }

    /* renamed from: d */
    public boolean mo1764d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo1765e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1766f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo1767g() {
        return true;
    }

    /* renamed from: h */
    public boolean mo1768h() {
        return true;
    }

    /* renamed from: i */
    public boolean mo1769i() {
        return 1 - f9396b.m12087q().m14419y() == 0;
    }

    /* renamed from: j */
    public boolean mo1770j() {
        return f9396b.m12087q().m14367C() == 1;
    }

    /* renamed from: k */
    public boolean mo1771k() {
        return f9396b.m12087q().m14368D() == 1;
    }

    /* renamed from: l */
    public boolean mo1772l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo1773m() {
        return f9396b.m12087q().m14418x() == 1;
    }

    /* renamed from: n */
    public String mo1774n() {
        String n = super.mo1774n();
        if (n == null) {
            n = cpq.b();
            m13905j(n);
        }
        if (!cpq.a()) {
            cpq.a(n);
        }
        return n;
    }

    /* renamed from: o */
    public int mo1775o() {
        int o = super.mo1775o();
        if (o >= 1) {
            return o;
        }
        o = new Random().nextInt(100) + 1;
        m13869b(o);
        return o;
    }

    /* renamed from: a */
    public void m13979a(int i, String str, int i2) {
        m13980a(i, str, i2, false);
    }

    /* renamed from: a */
    public void m13980a(int i, String str, int i2, boolean z) {
        m13845c("new_post_count_" + i + "_" + str, i2);
        if (z) {
            f9396b.m12054a(new NewPostCountUpdatedEvent(i, str));
        }
    }

    /* renamed from: a */
    public int m13977a(int i, String str) {
        return m13842b("new_post_count_" + i + "_" + str, 0);
    }

    /* renamed from: p */
    protected ArrayList<String> m14011p() {
        String aW = super.aW();
        ArrayList<String> arrayList = new ArrayList();
        String[] strArr = (String[]) djm.a(aW, String[].class);
        if (strArr != null) {
            for (Object add : strArr) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean m13986a(String str) {
        return m14011p().contains(str);
    }

    /* renamed from: b */
    public void m13989b(String str) {
        if (str != null && !m13986a(str)) {
            ArrayList p = m14011p();
            p.add(str);
            m13938r(djm.a(p.toArray(new String[p.size()])));
        }
    }

    /* renamed from: a */
    public void m13984a(String str, long j, long j2) {
        m13900i(str);
        if (j2 > 0) {
            m13874c((System.currentTimeMillis() / 1000) + j2);
        } else {
            m13874c(j);
        }
        m13870b(j2);
    }

    /* renamed from: c */
    public void m13993c(String str) {
        m13890g(str);
    }

    /* renamed from: q */
    public String m14012q() {
        return m13853N();
    }

    /* renamed from: a */
    public void m13982a(String str, int i) {
        m13941s(str);
        m13924n(i);
    }

    /* renamed from: d */
    private String m13968d(String str, int i) {
        return str + "_" + i;
    }

    /* renamed from: b */
    public String m13988b(int i, String str) {
        return m13847e("last_list_state_post_id_" + m13968d(str, i));
    }

    /* renamed from: c */
    public int m13991c(int i, String str) {
        return m13842b("last_list_state_orientation_" + m13968d(str, i), 0);
    }

    /* renamed from: d */
    public int m13995d(int i, String str) {
        return m13842b("last_list_state_view_top_" + m13968d(str, i), 0);
    }

    /* renamed from: e */
    public int m13998e(int i, String str) {
        return m13842b("last_list_state_scroll_offset_" + m13968d(str, i), 0);
    }

    /* renamed from: a */
    public void m13981a(int i, String str, String str2, int i2, int i3, int i4) {
        String d = m13968d(str, i);
        m13840a("last_list_state_post_id_" + d, str2);
        m13845c("last_list_state_orientation_" + d, i2);
        m13845c("last_list_state_view_top_" + d, i3);
        m13845c("last_list_state_scroll_offset_" + d, i4);
    }

    /* renamed from: f */
    public void m14000f(int i, String str) {
        m13981a(i, str, null, 0, 0, 0);
    }

    /* renamed from: d */
    public long m13996d(String str) {
        return m13843b("last_list_new_count_time_" + str, 0);
    }

    /* renamed from: a */
    public void m13983a(String str, long j) {
        m13846c("last_list_new_count_time_" + str, j);
    }

    /* renamed from: a */
    public void mo1760a(boolean z) {
        super.mo1760a(z);
        f9396b.m12054a(new MobileCoverSettingChangedEvent());
    }

    /* renamed from: b */
    public void mo1762b(boolean z) {
        super.mo1762b(z);
        new Handler(Looper.getMainLooper()).post(new C17511(this));
    }

    /* renamed from: r */
    public long m14013r() {
        long currentTimeMillis = System.currentTimeMillis();
        long ag = ag();
        if (ag == -1) {
            return -1;
        }
        if (ag == 0 || ag < currentTimeMillis) {
            return 0;
        }
        return (ag - currentTimeMillis) / 1000;
    }

    /* renamed from: s */
    public boolean mo1776s() {
        return (VERSION.SDK_INT >= 16 && VERSION.SDK_INT != 23) || super.mo1776s();
    }

    /* renamed from: t */
    public boolean m14015t() {
        return ae() == 1;
    }

    /* renamed from: u */
    public void m14016u() {
        m13888g(0);
    }

    /* renamed from: v */
    public boolean m14017v() {
        return ab() == 1;
    }

    /* renamed from: w */
    public void m14018w() {
        m13875d(0);
    }

    /* renamed from: x */
    public boolean m14019x() {
        return ac() == 1;
    }

    /* renamed from: y */
    public void m14020y() {
        m13879e(0);
    }

    /* renamed from: z */
    public boolean m14021z() {
        return ad() == 1;
    }

    /* renamed from: A */
    public void m13969A() {
        m13883f(0);
    }

    /* renamed from: B */
    public boolean m13970B() {
        return aa() == 1;
    }

    /* renamed from: c */
    public void m13994c(boolean z) {
        m13873c(z ? 1 : 0);
    }

    /* renamed from: C */
    public void m13971C() {
        long currentTimeMillis = System.currentTimeMillis();
        m13899i(currentTimeMillis);
        m13880e(86400000 + currentTimeMillis);
        m13928o(1);
        m13888g(1);
        m13875d(1);
        m13879e(1);
        m13883f(1);
        m13918m(0);
        m13889g(cqw.d(2) + currentTimeMillis);
        m13884f(currentTimeMillis + cae.f8432b);
    }

    /* renamed from: D */
    public void m13972D() {
        m13981a(0, null, null, 0, 0, 0);
        m13904j(0);
    }

    /* renamed from: E */
    public void m13973E() {
        m13874c(0);
        m13981a(0, null, null, 0, 0, 0);
        m13904j(0);
        m13894h(0);
        m13928o(0);
        m13876d(0);
        m13898i(0);
        m13963z(null);
        m13935q(null);
        m13945t(null);
        m13951v(null);
    }

    /* renamed from: F */
    public int m13974F() {
        int aZ = aZ() + 1;
        m13928o(aZ);
        return aZ;
    }

    /* renamed from: a */
    public String m13978a(long j) {
        return ctm.a(j, GagApplication.f16513a, mo1774n());
    }

    /* renamed from: G */
    public String m13975G() {
        String str = "\n";
        return "Safe mode: " + m13965A(cij.m13687a().m13729g().f9581r) + str + "Dark theme: " + m13965A(ah()) + str + "Rotation lock: " + m13965A(at()) + str + "Remember pos: " + m13965A(al()) + str + "Fun reminder: " + m13965A(aw()) + str + "Expand long: " + m13965A(!ak()) + str + "Adv MP4: " + m13965A(ay()) + str + "ExoPlayer: " + m13965A(mo1776s());
    }

    /* renamed from: A */
    private String m13965A(boolean z) {
        return z ? "On" : "Off";
    }

    /* renamed from: H */
    public Key m13976H() {
        return ctm.a(GagApplication.f16513a, mo1774n());
    }
}
