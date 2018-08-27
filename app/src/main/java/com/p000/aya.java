package com.p000;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.facebook.internal.ServerProtocol;
import com.flurry.android.AdCreative;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: aya */
public class aya implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    protected final Object f4940a = new Object();
    /* renamed from: b */
    protected final axy f4941b;
    /* renamed from: c */
    BroadcastReceiver f4942c;
    /* renamed from: d */
    private final WeakReference<bjt> f4943d;
    /* renamed from: e */
    private WeakReference<ViewTreeObserver> f4944e;
    /* renamed from: f */
    private final ayi f4945f;
    /* renamed from: g */
    private final Context f4946g;
    /* renamed from: h */
    private final WindowManager f4947h;
    /* renamed from: i */
    private final PowerManager f4948i;
    /* renamed from: j */
    private final KeyguardManager f4949j;
    /* renamed from: k */
    private ayb f4950k;
    /* renamed from: l */
    private boolean f4951l;
    /* renamed from: m */
    private boolean f4952m = false;
    /* renamed from: n */
    private boolean f4953n = false;
    /* renamed from: o */
    private boolean f4954o;
    /* renamed from: p */
    private boolean f4955p;
    /* renamed from: q */
    private boolean f4956q;
    /* renamed from: r */
    private final HashSet<Object> f4957r = new HashSet();
    /* renamed from: s */
    private bkr f4958s;
    /* renamed from: t */
    private final HashSet<aye> f4959t = new HashSet();

    /* renamed from: aya$1 */
    class C08831 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ aya f4933a;

        C08831(aya aya) {
            this.f4933a = aya;
        }

        public void onReceive(Context context, Intent intent) {
            this.f4933a.m6492a(3);
        }
    }

    /* renamed from: aya$a */
    public static class C0884a implements ayi {
        /* renamed from: a */
        private WeakReference<bby> f4934a;

        public C0884a(bby bby) {
            this.f4934a = new WeakReference(bby);
        }

        /* renamed from: a */
        public View mo846a() {
            bby bby = (bby) this.f4934a.get();
            return bby != null ? bby.mo971e() : null;
        }

        /* renamed from: b */
        public boolean mo847b() {
            return this.f4934a.get() == null;
        }

        /* renamed from: c */
        public ayi mo848c() {
            return new C0885b((bby) this.f4934a.get());
        }
    }

    /* renamed from: aya$b */
    public static class C0885b implements ayi {
        /* renamed from: a */
        private bby f4935a;

        public C0885b(bby bby) {
            this.f4935a = bby;
        }

        /* renamed from: a */
        public View mo846a() {
            return this.f4935a != null ? this.f4935a.mo971e() : null;
        }

        /* renamed from: b */
        public boolean mo847b() {
            return this.f4935a == null;
        }

        /* renamed from: c */
        public ayi mo848c() {
            return this;
        }
    }

    /* renamed from: aya$c */
    public static class C0886c implements ayi {
        /* renamed from: a */
        private final View f4936a;
        /* renamed from: b */
        private final bjt f4937b;

        public C0886c(View view, bjt bjt) {
            this.f4936a = view;
            this.f4937b = bjt;
        }

        /* renamed from: a */
        public View mo846a() {
            return this.f4936a;
        }

        /* renamed from: b */
        public boolean mo847b() {
            return this.f4937b == null || this.f4936a == null;
        }

        /* renamed from: c */
        public ayi mo848c() {
            return this;
        }
    }

    /* renamed from: aya$d */
    public static class C0887d implements ayi {
        /* renamed from: a */
        private final WeakReference<View> f4938a;
        /* renamed from: b */
        private final WeakReference<bjt> f4939b;

        public C0887d(View view, bjt bjt) {
            this.f4938a = new WeakReference(view);
            this.f4939b = new WeakReference(bjt);
        }

        /* renamed from: a */
        public View mo846a() {
            return (View) this.f4938a.get();
        }

        /* renamed from: b */
        public boolean mo847b() {
            return this.f4938a.get() == null || this.f4939b.get() == null;
        }

        /* renamed from: c */
        public ayi mo848c() {
            return new C0886c((View) this.f4938a.get(), (bjt) this.f4939b.get());
        }
    }

    public aya(Context context, zzeg zzeg, bjt bjt, zzqh zzqh, ayi ayi) {
        this.f4943d = new WeakReference(bjt);
        this.f4945f = ayi;
        this.f4944e = new WeakReference(null);
        this.f4954o = true;
        this.f4956q = false;
        this.f4958s = new bkr(200);
        this.f4941b = new axy(UUID.randomUUID().toString(), zzqh, zzeg.f14931a, bjt.f6555j, bjt.m8899a(), zzeg.f14938h);
        this.f4947h = (WindowManager) context.getSystemService("window");
        this.f4948i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f4949j = (KeyguardManager) context.getSystemService("keyguard");
        this.f4946g = context;
    }

    /* renamed from: a */
    protected int m6488a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    protected JSONObject m6489a(View view) throws JSONException {
        if (view == null) {
            return m6514l();
        }
        boolean a = ako.m2345g().mo1278a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            bky.m9007b("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f4947h.getDefaultDisplay().getWidth();
        rect2.bottom = this.f4947h.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject i = m6511i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put(AdCreative.kAlignmentTop, m6488a(rect2.top, displayMetrics)).put(AdCreative.kAlignmentBottom, m6488a(rect2.bottom, displayMetrics)).put(AdCreative.kAlignmentLeft, m6488a(rect2.left, displayMetrics)).put(AdCreative.kAlignmentRight, m6488a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put(AdCreative.kAlignmentTop, m6488a(rect.top, displayMetrics)).put(AdCreative.kAlignmentBottom, m6488a(rect.bottom, displayMetrics)).put(AdCreative.kAlignmentLeft, m6488a(rect.left, displayMetrics)).put(AdCreative.kAlignmentRight, m6488a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put(AdCreative.kAlignmentTop, m6488a(rect3.top, displayMetrics)).put(AdCreative.kAlignmentBottom, m6488a(rect3.bottom, displayMetrics)).put(AdCreative.kAlignmentLeft, m6488a(rect3.left, displayMetrics)).put(AdCreative.kAlignmentRight, m6488a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put(AdCreative.kAlignmentTop, m6488a(rect4.top, displayMetrics)).put(AdCreative.kAlignmentBottom, m6488a(rect4.bottom, displayMetrics)).put(AdCreative.kAlignmentLeft, m6488a(rect4.left, displayMetrics)).put(AdCreative.kAlignmentRight, m6488a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put(AdCreative.kAlignmentTop, m6488a(rect5.top, displayMetrics)).put(AdCreative.kAlignmentBottom, m6488a(rect5.bottom, displayMetrics)).put(AdCreative.kAlignmentLeft, m6488a(rect5.left, displayMetrics)).put(AdCreative.kAlignmentRight, m6488a(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", ako.m2343e().m9114a(view, this.f4948i, this.f4949j));
        return i;
    }

    /* renamed from: a */
    JSONObject m6490a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    protected void m6491a() {
        synchronized (this.f4940a) {
            if (this.f4942c != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f4942c = new C08831(this);
            this.f4946g.registerReceiver(this.f4942c, intentFilter);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected void m6492a(int r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 1;
        r3 = r7.f4940a;
        monitor-enter(r3);
        r2 = r7.m6513k();	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x000f;
    L_0x000b:
        r2 = r7.f4954o;	 Catch:{ all -> 0x0041 }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
    L_0x0010:
        return;
    L_0x0011:
        r2 = r7.f4945f;	 Catch:{ all -> 0x0041 }
        r4 = r2.mo846a();	 Catch:{ all -> 0x0041 }
        if (r4 == 0) goto L_0x0044;
    L_0x0019:
        r2 = p000.ako.m2343e();	 Catch:{ all -> 0x0041 }
        r5 = r7.f4948i;	 Catch:{ all -> 0x0041 }
        r6 = r7.f4949j;	 Catch:{ all -> 0x0041 }
        r2 = r2.m9114a(r4, r5, r6);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0044;
    L_0x0027:
        r2 = new android.graphics.Rect;	 Catch:{ all -> 0x0041 }
        r2.<init>();	 Catch:{ all -> 0x0041 }
        r5 = 0;
        r2 = r4.getGlobalVisibleRect(r2, r5);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0044;
    L_0x0033:
        r2 = r1;
    L_0x0034:
        r5 = r7.f4945f;	 Catch:{ all -> 0x0041 }
        r5 = r5.mo847b();	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x0046;
    L_0x003c:
        r7.m6506d();	 Catch:{ all -> 0x0041 }
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        throw r0;
    L_0x0044:
        r2 = r0;
        goto L_0x0034;
    L_0x0046:
        if (r8 != r1) goto L_0x0049;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        if (r0 == 0) goto L_0x0059;
    L_0x004b:
        r0 = r7.f4958s;	 Catch:{ all -> 0x0041 }
        r0 = r0.m9265a();	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x0059;
    L_0x0053:
        r0 = r7.f4956q;	 Catch:{ all -> 0x0041 }
        if (r2 != r0) goto L_0x0059;
    L_0x0057:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0059:
        if (r2 != 0) goto L_0x0063;
    L_0x005b:
        r0 = r7.f4956q;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x0063;
    L_0x005f:
        if (r8 != r1) goto L_0x0063;
    L_0x0061:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0063:
        r0 = r7.m6489a(r4);	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
        r1 = 0;
        r7.m6498a(r0, r1);	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
        r7.f4956q = r2;	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
    L_0x006d:
        r7.m6509g();	 Catch:{ all -> 0x0041 }
        r7.m6507e();	 Catch:{ all -> 0x0041 }
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0075:
        r0 = move-exception;
    L_0x0076:
        r1 = "Active view update failed.";
        p000.bky.m9004a(r1, r0);	 Catch:{ all -> 0x0041 }
        goto L_0x006d;
    L_0x007c:
        r0 = move-exception;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: aya.a(int):void");
    }

    /* renamed from: a */
    protected void m6493a(View view, Map<String, String> map) {
        m6492a(3);
    }

    /* renamed from: a */
    public void m6494a(ayb ayb) {
        synchronized (this.f4940a) {
            this.f4950k = ayb;
        }
    }

    /* renamed from: a */
    public void m6495a(aye aye) {
        if (this.f4959t.isEmpty()) {
            m6491a();
            m6492a(3);
        }
        this.f4959t.add(aye);
        try {
            aye.mo849a(m6490a(m6489a(this.f4945f.mo846a())), false);
        } catch (Throwable e) {
            bky.m9007b("Skipping measurement update for new client.", e);
        }
    }

    /* renamed from: a */
    void m6496a(aye aye, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f4941b.m6445d());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        m6502b(aye);
    }

    /* renamed from: a */
    void m6497a(blo blo, Map<String, String> map) {
        m6493a(blo.mo1305b(), (Map) map);
    }

    /* renamed from: a */
    protected void m6498a(JSONObject jSONObject, boolean z) {
        try {
            m6504b(m6490a(jSONObject), z);
        } catch (Throwable th) {
            bky.m9007b("Skipping active view message.", th);
        }
    }

    /* renamed from: a */
    protected void m6499a(boolean z) {
        Iterator it = this.f4957r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    boolean m6500a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.f4941b.m6445d());
        return z;
    }

    /* renamed from: b */
    protected void m6501b() {
        synchronized (this.f4940a) {
            if (this.f4942c != null) {
                try {
                    this.f4946g.unregisterReceiver(this.f4942c);
                } catch (Throwable e) {
                    bky.m9007b("Failed trying to unregister the receiver", e);
                } catch (Throwable e2) {
                    ako.m2347i().m8934a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                }
                this.f4942c = null;
            }
        }
    }

    /* renamed from: b */
    public void m6502b(aye aye) {
        this.f4959t.remove(aye);
        aye.mo851b();
        if (this.f4959t.isEmpty()) {
            m6505c();
        }
    }

    /* renamed from: b */
    void m6503b(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(map.get("isVisible"));
            m6499a(z);
        }
    }

    /* renamed from: b */
    protected void m6504b(JSONObject jSONObject, boolean z) {
        Iterator it = new ArrayList(this.f4959t).iterator();
        while (it.hasNext()) {
            ((aye) it.next()).mo849a(jSONObject, z);
        }
    }

    /* renamed from: c */
    protected void m6505c() {
        synchronized (this.f4940a) {
            m6510h();
            m6501b();
            this.f4954o = false;
            m6507e();
            m6512j();
        }
    }

    /* renamed from: d */
    public void m6506d() {
        synchronized (this.f4940a) {
            if (this.f4954o) {
                this.f4955p = true;
                try {
                    m6498a(m6516n(), true);
                } catch (Throwable e) {
                    bky.m9007b("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    bky.m9007b("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.f4941b.m6445d());
                bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    /* renamed from: e */
    protected void m6507e() {
        if (this.f4950k != null) {
            this.f4950k.mo845a(this);
        }
    }

    /* renamed from: f */
    public boolean m6508f() {
        boolean z;
        synchronized (this.f4940a) {
            z = this.f4954o;
        }
        return z;
    }

    /* renamed from: g */
    protected void m6509g() {
        View a = this.f4945f.mo848c().mo846a();
        if (a != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4944e.get();
            ViewTreeObserver viewTreeObserver2 = a.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                m6510h();
                if (!this.f4951l || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                    this.f4951l = true;
                    viewTreeObserver2.addOnScrollChangedListener(this);
                    viewTreeObserver2.addOnGlobalLayoutListener(this);
                }
                this.f4944e = new WeakReference(viewTreeObserver2);
            }
        }
    }

    /* renamed from: h */
    protected void m6510h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4944e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: i */
    protected JSONObject m6511i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f4941b.m6443b()).put("activeViewJSON", this.f4941b.m6444c()).put("timestamp", ako.m2349k().mo607b()).put("adFormat", this.f4941b.m6442a()).put("hashCode", this.f4941b.m6445d()).put("isMraid", this.f4941b.m6446e()).put("isStopped", this.f4953n).put("isPaused", this.f4952m).put("isScreenOn", m6515m()).put("isNative", this.f4941b.m6447f()).put("appMuted", ako.m2343e().m9141h()).put("appVolume", (double) ako.m2343e().m9138g()).put("deviceVolume", (double) ako.m2343e().m9144j(this.f4946g));
        return jSONObject;
    }

    /* renamed from: j */
    protected void m6512j() {
        Iterator it = new ArrayList(this.f4959t).iterator();
        while (it.hasNext()) {
            m6502b((aye) it.next());
        }
    }

    /* renamed from: k */
    protected boolean m6513k() {
        Iterator it = this.f4959t.iterator();
        while (it.hasNext()) {
            if (((aye) it.next()).mo850a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    protected JSONObject m6514l() throws JSONException {
        return m6511i().put("isAttachedToWindow", false).put("isScreenOn", m6515m()).put("isVisible", false);
    }

    /* renamed from: m */
    boolean m6515m() {
        return this.f4948i.isScreenOn();
    }

    /* renamed from: n */
    protected JSONObject m6516n() throws JSONException {
        JSONObject i = m6511i();
        i.put("doneReasonCode", "u");
        return i;
    }

    /* renamed from: o */
    public void m6517o() {
        synchronized (this.f4940a) {
            this.f4953n = true;
            m6492a(3);
        }
    }

    public void onGlobalLayout() {
        m6492a(2);
    }

    public void onScrollChanged() {
        m6492a(1);
    }

    /* renamed from: p */
    public void m6518p() {
        synchronized (this.f4940a) {
            this.f4952m = true;
            m6492a(3);
        }
    }

    /* renamed from: q */
    public void m6519q() {
        synchronized (this.f4940a) {
            this.f4952m = false;
            m6492a(3);
        }
    }

    /* renamed from: r */
    public axy m6520r() {
        return this.f4941b;
    }
}
