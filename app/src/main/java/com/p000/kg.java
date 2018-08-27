package com.p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.facebook.common.util.ByteConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
/* renamed from: kg */
public class kg {
    /* renamed from: a */
    static final C5475g f24340a;
    /* renamed from: b */
    public int f24341b = -1;
    /* renamed from: c */
    private final Object f24342c;

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$a */
    public static class C5474a {
        /* renamed from: A */
        public static final C5474a f24307A = new C5474a(kg.f24340a.mo5078d());
        /* renamed from: B */
        public static final C5474a f24308B = new C5474a(kg.f24340a.mo5089f());
        /* renamed from: C */
        public static final C5474a f24309C = new C5474a(kg.f24340a.mo5092g());
        /* renamed from: D */
        public static final C5474a f24310D = new C5474a(kg.f24340a.mo5095h());
        /* renamed from: a */
        public static final C5474a f24311a = new C5474a(1, null);
        /* renamed from: b */
        public static final C5474a f24312b = new C5474a(2, null);
        /* renamed from: c */
        public static final C5474a f24313c = new C5474a(4, null);
        /* renamed from: d */
        public static final C5474a f24314d = new C5474a(8, null);
        /* renamed from: e */
        public static final C5474a f24315e = new C5474a(16, null);
        /* renamed from: f */
        public static final C5474a f24316f = new C5474a(32, null);
        /* renamed from: g */
        public static final C5474a f24317g = new C5474a(64, null);
        /* renamed from: h */
        public static final C5474a f24318h = new C5474a(128, null);
        /* renamed from: i */
        public static final C5474a f24319i = new C5474a(256, null);
        /* renamed from: j */
        public static final C5474a f24320j = new C5474a(512, null);
        /* renamed from: k */
        public static final C5474a f24321k = new C5474a(ByteConstants.KB, null);
        /* renamed from: l */
        public static final C5474a f24322l = new C5474a(2048, null);
        /* renamed from: m */
        public static final C5474a f24323m = new C5474a(4096, null);
        /* renamed from: n */
        public static final C5474a f24324n = new C5474a(Utility.DEFAULT_STREAM_BUFFER_SIZE, null);
        /* renamed from: o */
        public static final C5474a f24325o = new C5474a(16384, null);
        /* renamed from: p */
        public static final C5474a f24326p = new C5474a(32768, null);
        /* renamed from: q */
        public static final C5474a f24327q = new C5474a(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, null);
        /* renamed from: r */
        public static final C5474a f24328r = new C5474a(131072, null);
        /* renamed from: s */
        public static final C5474a f24329s = new C5474a(262144, null);
        /* renamed from: t */
        public static final C5474a f24330t = new C5474a(524288, null);
        /* renamed from: u */
        public static final C5474a f24331u = new C5474a(ByteConstants.MB, null);
        /* renamed from: v */
        public static final C5474a f24332v = new C5474a(2097152, null);
        /* renamed from: w */
        public static final C5474a f24333w = new C5474a(kg.f24340a.mo5064b());
        /* renamed from: x */
        public static final C5474a f24334x = new C5474a(kg.f24340a.mo5052a());
        /* renamed from: y */
        public static final C5474a f24335y = new C5474a(kg.f24340a.mo5072c());
        /* renamed from: z */
        public static final C5474a f24336z = new C5474a(kg.f24340a.mo5085e());
        /* renamed from: E */
        final Object f24337E;

        public C5474a(int i, CharSequence charSequence) {
            this(kg.f24340a.mo5055a(i, charSequence));
        }

        C5474a(Object obj) {
            this.f24337E = obj;
        }

        /* renamed from: a */
        public int m31926a() {
            return kg.f24340a.mo5063b(this.f24337E);
        }

        /* renamed from: b */
        public CharSequence m31927b() {
            return kg.f24340a.mo5071c(this.f24337E);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$g */
    interface C5475g {
        /* renamed from: a */
        Object mo5052a();

        /* renamed from: a */
        Object mo5053a(int i, int i2, int i3, int i4, boolean z, boolean z2);

        /* renamed from: a */
        Object mo5054a(int i, int i2, boolean z, int i3);

        /* renamed from: a */
        Object mo5055a(int i, CharSequence charSequence);

        /* renamed from: a */
        List<Object> mo5056a(Object obj);

        /* renamed from: a */
        void mo5057a(Object obj, int i);

        /* renamed from: a */
        void mo5058a(Object obj, Rect rect);

        /* renamed from: a */
        void mo5059a(Object obj, View view);

        /* renamed from: a */
        void mo5060a(Object obj, CharSequence charSequence);

        /* renamed from: a */
        void mo5061a(Object obj, boolean z);

        /* renamed from: a */
        boolean mo5062a(Object obj, Object obj2);

        /* renamed from: b */
        int mo5063b(Object obj);

        /* renamed from: b */
        Object mo5064b();

        /* renamed from: b */
        void mo5065b(Object obj, int i);

        /* renamed from: b */
        void mo5066b(Object obj, Rect rect);

        /* renamed from: b */
        void mo5067b(Object obj, View view);

        /* renamed from: b */
        void mo5068b(Object obj, CharSequence charSequence);

        /* renamed from: b */
        void mo5069b(Object obj, Object obj2);

        /* renamed from: b */
        void mo5070b(Object obj, boolean z);

        /* renamed from: c */
        CharSequence mo5071c(Object obj);

        /* renamed from: c */
        Object mo5072c();

        /* renamed from: c */
        void mo5073c(Object obj, Rect rect);

        /* renamed from: c */
        void mo5074c(Object obj, View view);

        /* renamed from: c */
        void mo5075c(Object obj, CharSequence charSequence);

        /* renamed from: c */
        void mo5076c(Object obj, Object obj2);

        /* renamed from: c */
        void mo5077c(Object obj, boolean z);

        /* renamed from: d */
        Object mo5078d();

        /* renamed from: d */
        Object mo5079d(Object obj);

        /* renamed from: d */
        void mo5080d(Object obj, Rect rect);

        /* renamed from: d */
        void mo5081d(Object obj, View view);

        /* renamed from: d */
        void mo5082d(Object obj, CharSequence charSequence);

        /* renamed from: d */
        void mo5083d(Object obj, boolean z);

        /* renamed from: e */
        int mo5084e(Object obj);

        /* renamed from: e */
        Object mo5085e();

        /* renamed from: e */
        void mo5086e(Object obj, CharSequence charSequence);

        /* renamed from: e */
        void mo5087e(Object obj, boolean z);

        /* renamed from: f */
        int mo5088f(Object obj);

        /* renamed from: f */
        Object mo5089f();

        /* renamed from: f */
        void mo5090f(Object obj, boolean z);

        /* renamed from: g */
        CharSequence mo5091g(Object obj);

        /* renamed from: g */
        Object mo5092g();

        /* renamed from: g */
        void mo5093g(Object obj, boolean z);

        /* renamed from: h */
        CharSequence mo5094h(Object obj);

        /* renamed from: h */
        Object mo5095h();

        /* renamed from: h */
        void mo5096h(Object obj, boolean z);

        /* renamed from: i */
        CharSequence mo5097i(Object obj);

        /* renamed from: i */
        Object mo5098i();

        /* renamed from: i */
        void mo5099i(Object obj, boolean z);

        /* renamed from: j */
        CharSequence mo5100j(Object obj);

        /* renamed from: j */
        void mo5101j(Object obj, boolean z);

        /* renamed from: k */
        void mo5102k(Object obj, boolean z);

        /* renamed from: k */
        boolean mo5103k(Object obj);

        /* renamed from: l */
        void mo5104l(Object obj, boolean z);

        /* renamed from: l */
        boolean mo5105l(Object obj);

        /* renamed from: m */
        void mo5106m(Object obj, boolean z);

        /* renamed from: m */
        boolean mo5107m(Object obj);

        /* renamed from: n */
        boolean mo5108n(Object obj);

        /* renamed from: o */
        boolean mo5109o(Object obj);

        /* renamed from: p */
        boolean mo5110p(Object obj);

        /* renamed from: q */
        boolean mo5111q(Object obj);

        /* renamed from: r */
        boolean mo5112r(Object obj);

        /* renamed from: s */
        boolean mo5113s(Object obj);

        /* renamed from: t */
        boolean mo5114t(Object obj);

        /* renamed from: u */
        void mo5115u(Object obj);

        /* renamed from: v */
        int mo5116v(Object obj);

        /* renamed from: w */
        boolean mo5117w(Object obj);

        /* renamed from: x */
        boolean mo5118x(Object obj);

        /* renamed from: y */
        String mo5119y(Object obj);
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$l */
    static class C5476l implements C5475g {
        C5476l() {
        }

        /* renamed from: a */
        public Object mo5055a(int i, CharSequence charSequence) {
            return null;
        }

        /* renamed from: i */
        public Object mo5098i() {
            return null;
        }

        /* renamed from: d */
        public Object mo5079d(Object obj) {
            return null;
        }

        /* renamed from: a */
        public void mo5057a(Object obj, int i) {
        }

        /* renamed from: a */
        public boolean mo5062a(Object obj, Object obj2) {
            return false;
        }

        /* renamed from: b */
        public int mo5063b(Object obj) {
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo5071c(Object obj) {
            return null;
        }

        /* renamed from: a */
        public void mo5059a(Object obj, View view) {
        }

        /* renamed from: e */
        public int mo5084e(Object obj) {
            return 0;
        }

        /* renamed from: a */
        public void mo5058a(Object obj, Rect rect) {
        }

        /* renamed from: b */
        public void mo5066b(Object obj, Rect rect) {
        }

        /* renamed from: f */
        public int mo5088f(Object obj) {
            return 0;
        }

        /* renamed from: g */
        public CharSequence mo5091g(Object obj) {
            return null;
        }

        /* renamed from: h */
        public CharSequence mo5094h(Object obj) {
            return null;
        }

        /* renamed from: i */
        public CharSequence mo5097i(Object obj) {
            return null;
        }

        /* renamed from: j */
        public CharSequence mo5100j(Object obj) {
            return null;
        }

        /* renamed from: k */
        public boolean mo5103k(Object obj) {
            return false;
        }

        /* renamed from: l */
        public boolean mo5105l(Object obj) {
            return false;
        }

        /* renamed from: m */
        public boolean mo5107m(Object obj) {
            return false;
        }

        /* renamed from: n */
        public boolean mo5108n(Object obj) {
            return false;
        }

        /* renamed from: o */
        public boolean mo5109o(Object obj) {
            return false;
        }

        /* renamed from: p */
        public boolean mo5110p(Object obj) {
            return false;
        }

        /* renamed from: w */
        public boolean mo5117w(Object obj) {
            return false;
        }

        /* renamed from: x */
        public boolean mo5118x(Object obj) {
            return false;
        }

        /* renamed from: q */
        public boolean mo5111q(Object obj) {
            return false;
        }

        /* renamed from: r */
        public boolean mo5112r(Object obj) {
            return false;
        }

        /* renamed from: s */
        public boolean mo5113s(Object obj) {
            return false;
        }

        /* renamed from: t */
        public boolean mo5114t(Object obj) {
            return false;
        }

        /* renamed from: b */
        public void mo5065b(Object obj, int i) {
        }

        /* renamed from: v */
        public int mo5116v(Object obj) {
            return 0;
        }

        /* renamed from: c */
        public void mo5073c(Object obj, Rect rect) {
        }

        /* renamed from: d */
        public void mo5080d(Object obj, Rect rect) {
        }

        /* renamed from: a */
        public void mo5061a(Object obj, boolean z) {
        }

        /* renamed from: b */
        public void mo5070b(Object obj, boolean z) {
        }

        /* renamed from: b */
        public void mo5068b(Object obj, CharSequence charSequence) {
        }

        /* renamed from: c */
        public void mo5077c(Object obj, boolean z) {
        }

        /* renamed from: c */
        public void mo5075c(Object obj, CharSequence charSequence) {
        }

        /* renamed from: d */
        public void mo5083d(Object obj, boolean z) {
        }

        /* renamed from: e */
        public void mo5087e(Object obj, boolean z) {
        }

        /* renamed from: f */
        public void mo5090f(Object obj, boolean z) {
        }

        /* renamed from: j */
        public void mo5101j(Object obj, boolean z) {
        }

        /* renamed from: k */
        public void mo5102k(Object obj, boolean z) {
        }

        /* renamed from: g */
        public void mo5093g(Object obj, boolean z) {
        }

        /* renamed from: d */
        public void mo5082d(Object obj, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo5067b(Object obj, View view) {
        }

        /* renamed from: h */
        public void mo5096h(Object obj, boolean z) {
        }

        /* renamed from: i */
        public void mo5099i(Object obj, boolean z) {
        }

        /* renamed from: c */
        public void mo5074c(Object obj, View view) {
        }

        /* renamed from: e */
        public void mo5086e(Object obj, CharSequence charSequence) {
        }

        /* renamed from: u */
        public void mo5115u(Object obj) {
        }

        /* renamed from: y */
        public String mo5119y(Object obj) {
            return null;
        }

        /* renamed from: b */
        public void mo5069b(Object obj, Object obj2) {
        }

        /* renamed from: c */
        public void mo5076c(Object obj, Object obj2) {
        }

        /* renamed from: a */
        public List<Object> mo5056a(Object obj) {
            return null;
        }

        /* renamed from: a */
        public Object mo5054a(int i, int i2, boolean z, int i3) {
            return null;
        }

        /* renamed from: a */
        public Object mo5053a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }

        /* renamed from: l */
        public void mo5104l(Object obj, boolean z) {
        }

        /* renamed from: a */
        public void mo5060a(Object obj, CharSequence charSequence) {
        }

        /* renamed from: d */
        public void mo5081d(Object obj, View view) {
        }

        /* renamed from: m */
        public void mo5106m(Object obj, boolean z) {
        }

        /* renamed from: a */
        public Object mo5052a() {
            return null;
        }

        /* renamed from: h */
        public Object mo5095h() {
            return null;
        }

        /* renamed from: b */
        public Object mo5064b() {
            return null;
        }

        /* renamed from: c */
        public Object mo5072c() {
            return null;
        }

        /* renamed from: d */
        public Object mo5078d() {
            return null;
        }

        /* renamed from: e */
        public Object mo5085e() {
            return null;
        }

        /* renamed from: f */
        public Object mo5089f() {
            return null;
        }

        /* renamed from: g */
        public Object mo5092g() {
            return null;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$f */
    static class C5477f extends C5476l {
        C5477f() {
        }

        /* renamed from: i */
        public Object mo5098i() {
            return kk.m32210a();
        }

        /* renamed from: d */
        public Object mo5079d(Object obj) {
            return kk.m32211a(obj);
        }

        /* renamed from: a */
        public void mo5057a(Object obj, int i) {
            kk.m32212a(obj, i);
        }

        /* renamed from: a */
        public void mo5059a(Object obj, View view) {
            kk.m32214a(obj, view);
        }

        /* renamed from: e */
        public int mo5084e(Object obj) {
            return kk.m32217b(obj);
        }

        /* renamed from: a */
        public void mo5058a(Object obj, Rect rect) {
            kk.m32213a(obj, rect);
        }

        /* renamed from: b */
        public void mo5066b(Object obj, Rect rect) {
            kk.m32218b(obj, rect);
        }

        /* renamed from: f */
        public int mo5088f(Object obj) {
            return kk.m32222c(obj);
        }

        /* renamed from: g */
        public CharSequence mo5091g(Object obj) {
            return kk.m32227d(obj);
        }

        /* renamed from: h */
        public CharSequence mo5094h(Object obj) {
            return kk.m32231e(obj);
        }

        /* renamed from: i */
        public CharSequence mo5097i(Object obj) {
            return kk.m32233f(obj);
        }

        /* renamed from: j */
        public CharSequence mo5100j(Object obj) {
            return kk.m32235g(obj);
        }

        /* renamed from: k */
        public boolean mo5103k(Object obj) {
            return kk.m32238h(obj);
        }

        /* renamed from: l */
        public boolean mo5105l(Object obj) {
            return kk.m32240i(obj);
        }

        /* renamed from: m */
        public boolean mo5107m(Object obj) {
            return kk.m32241j(obj);
        }

        /* renamed from: n */
        public boolean mo5108n(Object obj) {
            return kk.m32242k(obj);
        }

        /* renamed from: o */
        public boolean mo5109o(Object obj) {
            return kk.m32243l(obj);
        }

        /* renamed from: p */
        public boolean mo5110p(Object obj) {
            return kk.m32244m(obj);
        }

        /* renamed from: q */
        public boolean mo5111q(Object obj) {
            return kk.m32245n(obj);
        }

        /* renamed from: r */
        public boolean mo5112r(Object obj) {
            return kk.m32246o(obj);
        }

        /* renamed from: s */
        public boolean mo5113s(Object obj) {
            return kk.m32247p(obj);
        }

        /* renamed from: t */
        public boolean mo5114t(Object obj) {
            return kk.m32248q(obj);
        }

        /* renamed from: c */
        public void mo5073c(Object obj, Rect rect) {
            kk.m32223c(obj, rect);
        }

        /* renamed from: d */
        public void mo5080d(Object obj, Rect rect) {
            kk.m32228d(obj, rect);
        }

        /* renamed from: a */
        public void mo5061a(Object obj, boolean z) {
            kk.m32216a(obj, z);
        }

        /* renamed from: b */
        public void mo5070b(Object obj, boolean z) {
            kk.m32221b(obj, z);
        }

        /* renamed from: b */
        public void mo5068b(Object obj, CharSequence charSequence) {
            kk.m32215a(obj, charSequence);
        }

        /* renamed from: c */
        public void mo5077c(Object obj, boolean z) {
            kk.m32226c(obj, z);
        }

        /* renamed from: c */
        public void mo5075c(Object obj, CharSequence charSequence) {
            kk.m32220b(obj, charSequence);
        }

        /* renamed from: d */
        public void mo5083d(Object obj, boolean z) {
            kk.m32230d(obj, z);
        }

        /* renamed from: e */
        public void mo5087e(Object obj, boolean z) {
            kk.m32232e(obj, z);
        }

        /* renamed from: f */
        public void mo5090f(Object obj, boolean z) {
            kk.m32234f(obj, z);
        }

        /* renamed from: g */
        public void mo5093g(Object obj, boolean z) {
            kk.m32236g(obj, z);
        }

        /* renamed from: d */
        public void mo5082d(Object obj, CharSequence charSequence) {
            kk.m32225c(obj, charSequence);
        }

        /* renamed from: b */
        public void mo5067b(Object obj, View view) {
            kk.m32219b(obj, view);
        }

        /* renamed from: h */
        public void mo5096h(Object obj, boolean z) {
            kk.m32237h(obj, z);
        }

        /* renamed from: i */
        public void mo5099i(Object obj, boolean z) {
            kk.m32239i(obj, z);
        }

        /* renamed from: c */
        public void mo5074c(Object obj, View view) {
            kk.m32224c(obj, view);
        }

        /* renamed from: e */
        public void mo5086e(Object obj, CharSequence charSequence) {
            kk.m32229d(obj, charSequence);
        }

        /* renamed from: u */
        public void mo5115u(Object obj) {
            kk.m32249r(obj);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$h */
    static class C5478h extends C5477f {
        C5478h() {
        }

        /* renamed from: w */
        public boolean mo5117w(Object obj) {
            return kl.m32252a(obj);
        }

        /* renamed from: j */
        public void mo5101j(Object obj, boolean z) {
            kl.m32251a(obj, z);
        }

        /* renamed from: x */
        public boolean mo5118x(Object obj) {
            return kl.m32255c(obj);
        }

        /* renamed from: k */
        public void mo5102k(Object obj, boolean z) {
            kl.m32254b(obj, z);
        }

        /* renamed from: b */
        public void mo5065b(Object obj, int i) {
            kl.m32250a(obj, i);
        }

        /* renamed from: v */
        public int mo5116v(Object obj) {
            return kl.m32253b(obj);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$i */
    static class C5479i extends C5478h {
        C5479i() {
        }

        /* renamed from: d */
        public void mo5081d(Object obj, View view) {
            km.m32256a(obj, view);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$j */
    static class C5480j extends C5479i {
        C5480j() {
        }

        /* renamed from: y */
        public String mo5119y(Object obj) {
            return kn.m32257a(obj);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$k */
    static class C5481k extends C5480j {
        C5481k() {
        }

        /* renamed from: b */
        public void mo5069b(Object obj, Object obj2) {
            ko.m32260a(obj, obj2);
        }

        /* renamed from: a */
        public Object mo5054a(int i, int i2, boolean z, int i3) {
            return ko.m32259a(i, i2, z, i3);
        }

        /* renamed from: a */
        public Object mo5053a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return ko.m32258a(i, i2, i3, i4, z);
        }

        /* renamed from: c */
        public void mo5076c(Object obj, Object obj2) {
            ko.m32262b(obj, obj2);
        }

        /* renamed from: l */
        public void mo5104l(Object obj, boolean z) {
            ko.m32261a(obj, z);
        }

        /* renamed from: m */
        public void mo5106m(Object obj, boolean z) {
            ko.m32263b(obj, z);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$b */
    static class C5482b extends C5481k {
        C5482b() {
        }

        /* renamed from: a */
        public Object mo5055a(int i, CharSequence charSequence) {
            return kh.m32196a(i, charSequence);
        }

        /* renamed from: a */
        public List<Object> mo5056a(Object obj) {
            return kh.m32197a(obj);
        }

        /* renamed from: a */
        public Object mo5054a(int i, int i2, boolean z, int i3) {
            return kh.m32195a(i, i2, z, i3);
        }

        /* renamed from: a */
        public boolean mo5062a(Object obj, Object obj2) {
            return kh.m32199a(obj, obj2);
        }

        /* renamed from: b */
        public int mo5063b(Object obj) {
            return kh.m32200b(obj);
        }

        /* renamed from: c */
        public CharSequence mo5071c(Object obj) {
            return kh.m32201c(obj);
        }

        /* renamed from: a */
        public Object mo5053a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return kh.m32194a(i, i2, i3, i4, z, z2);
        }

        /* renamed from: a */
        public void mo5060a(Object obj, CharSequence charSequence) {
            kh.m32198a(obj, charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$c */
    static class C5483c extends C5482b {
        C5483c() {
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$d */
    static class C5484d extends C5483c {
        C5484d() {
        }

        /* renamed from: a */
        public Object mo5052a() {
            return ki.m32202a();
        }

        /* renamed from: b */
        public Object mo5064b() {
            return ki.m32203b();
        }

        /* renamed from: c */
        public Object mo5072c() {
            return ki.m32204c();
        }

        /* renamed from: d */
        public Object mo5078d() {
            return ki.m32205d();
        }

        /* renamed from: e */
        public Object mo5085e() {
            return ki.m32206e();
        }

        /* renamed from: f */
        public Object mo5089f() {
            return ki.m32207f();
        }

        /* renamed from: g */
        public Object mo5092g() {
            return ki.m32208g();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$e */
    static class C5485e extends C5484d {
        C5485e() {
        }

        /* renamed from: h */
        public Object mo5095h() {
            return kj.m32209a();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$m */
    public static class C5486m {
        /* renamed from: a */
        final Object f24338a;

        /* renamed from: a */
        public static C5486m m32134a(int i, int i2, boolean z, int i3) {
            return new C5486m(kg.f24340a.mo5054a(i, i2, z, i3));
        }

        C5486m(Object obj) {
            this.f24338a = obj;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    /* renamed from: kg$n */
    public static class C5487n {
        /* renamed from: a */
        final Object f24339a;

        /* renamed from: a */
        public static C5487n m32135a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C5487n(kg.f24340a.mo5053a(i, i2, i3, i4, z, z2));
        }

        C5487n(Object obj) {
            this.f24339a = obj;
        }
    }

    static {
        if (VERSION.SDK_INT >= 24) {
            f24340a = new C5485e();
        } else if (VERSION.SDK_INT >= 23) {
            f24340a = new C5484d();
        } else if (VERSION.SDK_INT >= 22) {
            f24340a = new C5483c();
        } else if (VERSION.SDK_INT >= 21) {
            f24340a = new C5482b();
        } else if (VERSION.SDK_INT >= 19) {
            f24340a = new C5481k();
        } else if (VERSION.SDK_INT >= 18) {
            f24340a = new C5480j();
        } else if (VERSION.SDK_INT >= 17) {
            f24340a = new C5479i();
        } else if (VERSION.SDK_INT >= 16) {
            f24340a = new C5478h();
        } else if (VERSION.SDK_INT >= 14) {
            f24340a = new C5477f();
        } else {
            f24340a = new C5476l();
        }
    }

    /* renamed from: a */
    static kg m32136a(Object obj) {
        if (obj != null) {
            return new kg(obj);
        }
        return null;
    }

    public kg(Object obj) {
        this.f24342c = obj;
    }

    /* renamed from: a */
    public Object m32140a() {
        return this.f24342c;
    }

    /* renamed from: b */
    public static kg m32138b() {
        return kg.m32136a(f24340a.mo5098i());
    }

    /* renamed from: a */
    public static kg m32137a(kg kgVar) {
        return kg.m32136a(f24340a.mo5079d(kgVar.f24342c));
    }

    /* renamed from: a */
    public void m32143a(View view) {
        f24340a.mo5074c(this.f24342c, view);
    }

    /* renamed from: c */
    public int m32153c() {
        return f24340a.mo5088f(this.f24342c);
    }

    /* renamed from: b */
    public void m32149b(View view) {
        f24340a.mo5059a(this.f24342c, view);
    }

    /* renamed from: d */
    public int m32159d() {
        return f24340a.mo5084e(this.f24342c);
    }

    /* renamed from: a */
    public void m32141a(int i) {
        f24340a.mo5057a(this.f24342c, i);
    }

    /* renamed from: a */
    public boolean m32146a(C5474a c5474a) {
        return f24340a.mo5062a(this.f24342c, c5474a.f24337E);
    }

    /* renamed from: b */
    public void m32147b(int i) {
        f24340a.mo5065b(this.f24342c, i);
    }

    /* renamed from: e */
    public int m32164e() {
        return f24340a.mo5116v(this.f24342c);
    }

    /* renamed from: c */
    public void m32155c(View view) {
        f24340a.mo5067b(this.f24342c, view);
    }

    /* renamed from: a */
    public void m32142a(Rect rect) {
        f24340a.mo5058a(this.f24342c, rect);
    }

    /* renamed from: b */
    public void m32148b(Rect rect) {
        f24340a.mo5073c(this.f24342c, rect);
    }

    /* renamed from: c */
    public void m32154c(Rect rect) {
        f24340a.mo5066b(this.f24342c, rect);
    }

    /* renamed from: d */
    public void m32160d(Rect rect) {
        f24340a.mo5080d(this.f24342c, rect);
    }

    /* renamed from: f */
    public boolean m32168f() {
        return f24340a.mo5103k(this.f24342c);
    }

    /* renamed from: a */
    public void m32145a(boolean z) {
        f24340a.mo5061a(this.f24342c, z);
    }

    /* renamed from: g */
    public boolean m32170g() {
        return f24340a.mo5105l(this.f24342c);
    }

    /* renamed from: b */
    public void m32152b(boolean z) {
        f24340a.mo5070b(this.f24342c, z);
    }

    /* renamed from: h */
    public boolean m32172h() {
        return f24340a.mo5109o(this.f24342c);
    }

    /* renamed from: c */
    public void m32158c(boolean z) {
        f24340a.mo5087e(this.f24342c, z);
    }

    /* renamed from: i */
    public boolean m32174i() {
        return f24340a.mo5110p(this.f24342c);
    }

    /* renamed from: d */
    public void m32163d(boolean z) {
        f24340a.mo5090f(this.f24342c, z);
    }

    /* renamed from: j */
    public boolean m32176j() {
        return f24340a.mo5117w(this.f24342c);
    }

    /* renamed from: e */
    public void m32166e(boolean z) {
        f24340a.mo5101j(this.f24342c, z);
    }

    /* renamed from: k */
    public boolean m32178k() {
        return f24340a.mo5118x(this.f24342c);
    }

    /* renamed from: f */
    public void m32167f(boolean z) {
        f24340a.mo5102k(this.f24342c, z);
    }

    /* renamed from: l */
    public boolean m32180l() {
        return f24340a.mo5114t(this.f24342c);
    }

    /* renamed from: g */
    public void m32169g(boolean z) {
        f24340a.mo5099i(this.f24342c, z);
    }

    /* renamed from: m */
    public boolean m32182m() {
        return f24340a.mo5107m(this.f24342c);
    }

    /* renamed from: h */
    public void m32171h(boolean z) {
        f24340a.mo5077c(this.f24342c, z);
    }

    /* renamed from: n */
    public boolean m32183n() {
        return f24340a.mo5111q(this.f24342c);
    }

    /* renamed from: i */
    public void m32173i(boolean z) {
        f24340a.mo5093g(this.f24342c, z);
    }

    /* renamed from: o */
    public boolean m32184o() {
        return f24340a.mo5108n(this.f24342c);
    }

    /* renamed from: j */
    public void m32175j(boolean z) {
        f24340a.mo5083d(this.f24342c, z);
    }

    /* renamed from: p */
    public boolean m32185p() {
        return f24340a.mo5112r(this.f24342c);
    }

    /* renamed from: q */
    public boolean m32186q() {
        return f24340a.mo5113s(this.f24342c);
    }

    /* renamed from: k */
    public void m32177k(boolean z) {
        f24340a.mo5096h(this.f24342c, z);
    }

    /* renamed from: r */
    public CharSequence m32187r() {
        return f24340a.mo5097i(this.f24342c);
    }

    /* renamed from: a */
    public void m32144a(CharSequence charSequence) {
        f24340a.mo5082d(this.f24342c, charSequence);
    }

    /* renamed from: s */
    public CharSequence m32188s() {
        return f24340a.mo5091g(this.f24342c);
    }

    /* renamed from: b */
    public void m32150b(CharSequence charSequence) {
        f24340a.mo5068b(this.f24342c, charSequence);
    }

    /* renamed from: t */
    public CharSequence m32189t() {
        return f24340a.mo5100j(this.f24342c);
    }

    /* renamed from: c */
    public void m32156c(CharSequence charSequence) {
        f24340a.mo5086e(this.f24342c, charSequence);
    }

    /* renamed from: u */
    public CharSequence m32190u() {
        return f24340a.mo5094h(this.f24342c);
    }

    /* renamed from: d */
    public void m32162d(CharSequence charSequence) {
        f24340a.mo5075c(this.f24342c, charSequence);
    }

    /* renamed from: v */
    public void m32191v() {
        f24340a.mo5115u(this.f24342c);
    }

    /* renamed from: w */
    public String m32192w() {
        return f24340a.mo5119y(this.f24342c);
    }

    /* renamed from: b */
    public void m32151b(Object obj) {
        f24340a.mo5069b(this.f24342c, ((C5486m) obj).f24338a);
    }

    /* renamed from: c */
    public void m32157c(Object obj) {
        f24340a.mo5076c(this.f24342c, ((C5487n) obj).f24339a);
    }

    /* renamed from: x */
    public List<C5474a> m32193x() {
        List a = f24340a.mo5056a(this.f24342c);
        if (a == null) {
            return Collections.emptyList();
        }
        List<C5474a> arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5474a(a.get(i)));
        }
        return arrayList;
    }

    /* renamed from: l */
    public void m32179l(boolean z) {
        f24340a.mo5104l(this.f24342c, z);
    }

    /* renamed from: e */
    public void m32165e(CharSequence charSequence) {
        f24340a.mo5060a(this.f24342c, charSequence);
    }

    /* renamed from: d */
    public void m32161d(View view) {
        f24340a.mo5081d(this.f24342c, view);
    }

    /* renamed from: m */
    public void m32181m(boolean z) {
        f24340a.mo5106m(this.f24342c, z);
    }

    public int hashCode() {
        return this.f24342c == null ? 0 : this.f24342c.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        if (this.f24342c == null) {
            if (kgVar.f24342c != null) {
                return false;
            }
            return true;
        } else if (this.f24342c.equals(kgVar.f24342c)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m32142a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m32154c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m32187r());
        stringBuilder.append("; className: ").append(m32188s());
        stringBuilder.append("; text: ").append(m32189t());
        stringBuilder.append("; contentDescription: ").append(m32190u());
        stringBuilder.append("; viewId: ").append(m32192w());
        stringBuilder.append("; checkable: ").append(m32168f());
        stringBuilder.append("; checked: ").append(m32170g());
        stringBuilder.append("; focusable: ").append(m32172h());
        stringBuilder.append("; focused: ").append(m32174i());
        stringBuilder.append("; selected: ").append(m32180l());
        stringBuilder.append("; clickable: ").append(m32182m());
        stringBuilder.append("; longClickable: ").append(m32183n());
        stringBuilder.append("; enabled: ").append(m32184o());
        stringBuilder.append("; password: ").append(m32185p());
        stringBuilder.append("; scrollable: " + m32186q());
        stringBuilder.append("; [");
        int d = m32159d();
        while (d != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(d);
            d &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(kg.m32139c(numberOfTrailingZeros));
            if (d != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private static String m32139c(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case ByteConstants.KB /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case Utility.DEFAULT_STREAM_BUFFER_SIZE /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
