package com.p000;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.flurry.android.AdCreative;
import com.google.android.gms.internal.zzeg;
import java.util.Map;
import java.util.Set;

@bhd
/* renamed from: bfo */
public class bfo extends bft {
    /* renamed from: a */
    static final Set<String> f5983a = apu.m4883a("top-left", "top-right", "top-center", AdCreative.kAlignmentCenter, "bottom-left", "bottom-right", "bottom-center");
    /* renamed from: b */
    private String f5984b = "top-right";
    /* renamed from: c */
    private boolean f5985c = true;
    /* renamed from: d */
    private int f5986d = 0;
    /* renamed from: e */
    private int f5987e = 0;
    /* renamed from: f */
    private int f5988f = -1;
    /* renamed from: g */
    private int f5989g = 0;
    /* renamed from: h */
    private int f5990h = 0;
    /* renamed from: i */
    private int f5991i = -1;
    /* renamed from: j */
    private final Object f5992j = new Object();
    /* renamed from: k */
    private final blo f5993k;
    /* renamed from: l */
    private final Activity f5994l;
    /* renamed from: m */
    private zzeg f5995m;
    /* renamed from: n */
    private ImageView f5996n;
    /* renamed from: o */
    private LinearLayout f5997o;
    /* renamed from: p */
    private bfu f5998p;
    /* renamed from: q */
    private PopupWindow f5999q;
    /* renamed from: r */
    private RelativeLayout f6000r;
    /* renamed from: s */
    private ViewGroup f6001s;

    /* renamed from: bfo$1 */
    class C11491 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ bfo f5982a;

        C11491(bfo bfo) {
            this.f5982a = bfo;
        }

        public void onClick(View view) {
            this.f5982a.m8172a(true);
        }
    }

    public bfo(blo blo, bfu bfu) {
        super(blo, "resize");
        this.f5993k = blo;
        this.f5994l = blo.mo1316f();
        this.f5998p = bfu;
    }

    /* renamed from: b */
    private void m8167b(Map<String, String> map) {
        if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
            this.f5991i = ako.m2343e().m9118b((String) map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
            this.f5988f = ako.m2343e().m9118b((String) map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
            this.f5989g = ako.m2343e().m9118b((String) map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
            this.f5990h = ako.m2343e().m9118b((String) map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
            this.f5985c = Boolean.parseBoolean((String) map.get("allowOffscreen"));
        }
        String str = (String) map.get("customClosePosition");
        if (!TextUtils.isEmpty(str)) {
            this.f5984b = str;
        }
    }

    /* renamed from: d */
    private int[] m8168d() {
        if (!m8177c()) {
            return null;
        }
        if (this.f5985c) {
            return new int[]{this.f5986d + this.f5989g, this.f5987e + this.f5990h};
        }
        int[] b = ako.m2343e().m9125b(this.f5994l);
        int[] d = ako.m2343e().m9133d(this.f5994l);
        int i = b[0];
        int i2 = this.f5986d + this.f5989g;
        int i3 = this.f5987e + this.f5990h;
        if (i2 < 0) {
            i2 = 0;
        } else if (this.f5991i + i2 > i) {
            i2 = i - this.f5991i;
        }
        if (i3 < d[0]) {
            i3 = d[0];
        } else if (this.f5988f + i3 > d[1]) {
            i3 = d[1] - this.f5988f;
        }
        return new int[]{i2, i3};
    }

    /* renamed from: a */
    void m8169a(int i, int i2) {
        if (this.f5998p != null) {
            this.f5998p.mo281a(i, i2, this.f5991i, this.f5988f);
        }
    }

    /* renamed from: a */
    public void m8170a(int i, int i2, boolean z) {
        synchronized (this.f5992j) {
            this.f5986d = i;
            this.f5987e = i2;
            if (this.f5999q != null && z) {
                int[] d = m8168d();
                if (d != null) {
                    this.f5999q.update(azp.m6789a().m9283a(this.f5994l, d[0]), azp.m6789a().m9283a(this.f5994l, d[1]), this.f5999q.getWidth(), this.f5999q.getHeight());
                    m8174b(d[0], d[1]);
                } else {
                    m8172a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m8171a(Map<String, String> r13) {
        /*
        r12 = this;
        r4 = -1;
        r5 = 1;
        r3 = 0;
        r6 = r12.f5992j;
        monitor-enter(r6);
        r1 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0011;
    L_0x000a:
        r1 = "Not an activity context. Cannot resize.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
    L_0x0010:
        return;
    L_0x0011:
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo1321k();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0023;
    L_0x0019:
        r1 = "Webview is not yet available, size is not set.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0020:
        r1 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        throw r1;
    L_0x0023:
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo1321k();	 Catch:{ all -> 0x0020 }
        r1 = r1.f14934d;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0034;
    L_0x002d:
        r1 = "Is interstitial. Cannot resize an interstitial.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0034:
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo1331p();	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = "Cannot resize an expanded banner.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0043:
        r12.m8167b(r13);	 Catch:{ all -> 0x0020 }
        r1 = r12.m8173a();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0053;
    L_0x004c:
        r1 = "Invalid width and height options. Cannot resize.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0053:
        r1 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r7 = r1.getWindow();	 Catch:{ all -> 0x0020 }
        if (r7 == 0) goto L_0x0061;
    L_0x005b:
        r1 = r7.getDecorView();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0068;
    L_0x0061:
        r1 = "Activity context is not ready, cannot get window or decor view.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0068:
        r8 = r12.m8168d();	 Catch:{ all -> 0x0020 }
        if (r8 != 0) goto L_0x0075;
    L_0x006e:
        r1 = "Resize location out of screen or close button is not visible.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0075:
        r1 = p000.azp.m6789a();	 Catch:{ all -> 0x0020 }
        r2 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r9 = r12.f5991i;	 Catch:{ all -> 0x0020 }
        r9 = r1.m9283a(r2, r9);	 Catch:{ all -> 0x0020 }
        r1 = p000.azp.m6789a();	 Catch:{ all -> 0x0020 }
        r2 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r10 = r12.f5988f;	 Catch:{ all -> 0x0020 }
        r10 = r1.m9283a(r2, r10);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo1305b();	 Catch:{ all -> 0x0020 }
        r2 = r1.getParent();	 Catch:{ all -> 0x0020 }
        if (r2 == 0) goto L_0x01d5;
    L_0x0099:
        r1 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01d5;
    L_0x009d:
        r0 = r2;
        r0 = (android.view.ViewGroup) r0;	 Catch:{ all -> 0x0020 }
        r1 = r0;
        r11 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r11 = r11.mo1305b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r11);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5999q;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01ce;
    L_0x00ae:
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x0020 }
        r12.f6001s = r2;	 Catch:{ all -> 0x0020 }
        r1 = p000.ako.m2343e();	 Catch:{ all -> 0x0020 }
        r2 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = r2.mo1305b();	 Catch:{ all -> 0x0020 }
        r1 = r1.m9078a(r2);	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.ImageView;	 Catch:{ all -> 0x0020 }
        r11 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r2.<init>(r11);	 Catch:{ all -> 0x0020 }
        r12.f5996n = r2;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5996n;	 Catch:{ all -> 0x0020 }
        r2.setImageBitmap(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo1321k();	 Catch:{ all -> 0x0020 }
        r12.f5995m = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f6001s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5996n;	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
    L_0x00dd:
        r1 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f6000r = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r2 = 0;
        r1.setBackgroundColor(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r2 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x0020 }
        r2.<init>(r9, r10);	 Catch:{ all -> 0x0020 }
        r1.setLayoutParams(r2);	 Catch:{ all -> 0x0020 }
        r1 = p000.ako.m2343e();	 Catch:{ all -> 0x0020 }
        r2 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r11 = 0;
        r1 = r1.m9083a(r2, r9, r10, r11);	 Catch:{ all -> 0x0020 }
        r12.f5999q = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f5999q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setOutsideTouchable(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5999q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setTouchable(r2);	 Catch:{ all -> 0x0020 }
        r2 = r12.f5999q;	 Catch:{ all -> 0x0020 }
        r1 = r12.f5985c;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01dd;
    L_0x0115:
        r1 = r5;
    L_0x0116:
        r2.setClippingEnabled(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = r2.mo1305b();	 Catch:{ all -> 0x0020 }
        r9 = -1;
        r10 = -1;
        r1.addView(r2, r9, r10);	 Catch:{ all -> 0x0020 }
        r1 = new android.widget.LinearLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f5997o = r1;	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x0020 }
        r1 = p000.azp.m6789a();	 Catch:{ all -> 0x0020 }
        r9 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r10 = 50;
        r1 = r1.m9283a(r9, r10);	 Catch:{ all -> 0x0020 }
        r9 = p000.azp.m6789a();	 Catch:{ all -> 0x0020 }
        r10 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r11 = 50;
        r9 = r9.m9283a(r10, r11);	 Catch:{ all -> 0x0020 }
        r2.<init>(r1, r9);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5984b;	 Catch:{ all -> 0x0020 }
        r9 = r1.hashCode();	 Catch:{ all -> 0x0020 }
        switch(r9) {
            case -1364013995: goto L_0x01f6;
            case -1012429441: goto L_0x01e0;
            case -655373719: goto L_0x0201;
            case 1163912186: goto L_0x0217;
            case 1288627767: goto L_0x020c;
            case 1755462605: goto L_0x01eb;
            default: goto L_0x0155;
        };	 Catch:{ all -> 0x0020 }
    L_0x0155:
        r1 = r4;
    L_0x0156:
        switch(r1) {
            case 0: goto L_0x0222;
            case 1: goto L_0x022e;
            case 2: goto L_0x023a;
            case 3: goto L_0x0241;
            case 4: goto L_0x024d;
            case 5: goto L_0x0259;
            default: goto L_0x0159;
        };	 Catch:{ all -> 0x0020 }
    L_0x0159:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
    L_0x0163:
        r1 = r12.f5997o;	 Catch:{ all -> 0x0020 }
        r3 = new bfo$1;	 Catch:{ all -> 0x0020 }
        r3.<init>(r12);	 Catch:{ all -> 0x0020 }
        r1.setOnClickListener(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5997o;	 Catch:{ all -> 0x0020 }
        r3 = "Close button";
        r1.setContentDescription(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r3 = r12.f5997o;	 Catch:{ all -> 0x0020 }
        r1.addView(r3, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5999q;	 Catch:{ RuntimeException -> 0x0265 }
        r2 = r7.getDecorView();	 Catch:{ RuntimeException -> 0x0265 }
        r3 = 0;
        r4 = p000.azp.m6789a();	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r12.f5994l;	 Catch:{ RuntimeException -> 0x0265 }
        r7 = 0;
        r7 = r8[r7];	 Catch:{ RuntimeException -> 0x0265 }
        r4 = r4.m9283a(r5, r7);	 Catch:{ RuntimeException -> 0x0265 }
        r5 = p000.azp.m6789a();	 Catch:{ RuntimeException -> 0x0265 }
        r7 = r12.f5994l;	 Catch:{ RuntimeException -> 0x0265 }
        r9 = 1;
        r9 = r8[r9];	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r5.m9283a(r7, r9);	 Catch:{ RuntimeException -> 0x0265 }
        r1.showAtLocation(r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0265 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.m8169a(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = new com.google.android.gms.internal.zzeg;	 Catch:{ all -> 0x0020 }
        r3 = r12.f5994l;	 Catch:{ all -> 0x0020 }
        r4 = new ahw;	 Catch:{ all -> 0x0020 }
        r5 = r12.f5991i;	 Catch:{ all -> 0x0020 }
        r7 = r12.f5988f;	 Catch:{ all -> 0x0020 }
        r4.<init>(r5, r7);	 Catch:{ all -> 0x0020 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0020 }
        r1.mo1301a(r2);	 Catch:{ all -> 0x0020 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.m8174b(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = "resized";
        r12.m8160d(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01ce:
        r1 = r12.f5999q;	 Catch:{ all -> 0x0020 }
        r1.dismiss();	 Catch:{ all -> 0x0020 }
        goto L_0x00dd;
    L_0x01d5:
        r1 = "Webview is detached, probably in the middle of a resize or expand.";
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01dd:
        r1 = r3;
        goto L_0x0116;
    L_0x01e0:
        r5 = "top-left";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01e8:
        r1 = r3;
        goto L_0x0156;
    L_0x01eb:
        r3 = "top-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01f3:
        r1 = r5;
        goto L_0x0156;
    L_0x01f6:
        r3 = "center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01fe:
        r1 = 2;
        goto L_0x0156;
    L_0x0201:
        r3 = "bottom-left";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0209:
        r1 = 3;
        goto L_0x0156;
    L_0x020c:
        r3 = "bottom-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0214:
        r1 = 4;
        goto L_0x0156;
    L_0x0217:
        r3 = "bottom-right";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x021f:
        r1 = 5;
        goto L_0x0156;
    L_0x0222:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x022e:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x023a:
        r1 = 13;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0241:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x024d:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0259:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0265:
        r1 = move-exception;
        r2 = "Cannot show popup window: ";
        r1 = r1.getMessage();	 Catch:{ all -> 0x0020 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0020 }
        r3 = r1.length();	 Catch:{ all -> 0x0020 }
        if (r3 == 0) goto L_0x02a8;
    L_0x0276:
        r1 = r2.concat(r1);	 Catch:{ all -> 0x0020 }
    L_0x027a:
        r12.m8158b(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6000r;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = r2.mo1305b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6001s;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x02a5;
    L_0x028c:
        r1 = r12.f6001s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5996n;	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f6001s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = r2.mo1305b();	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f5993k;	 Catch:{ all -> 0x0020 }
        r2 = r12.f5995m;	 Catch:{ all -> 0x0020 }
        r1.mo1301a(r2);	 Catch:{ all -> 0x0020 }
    L_0x02a5:
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x02a8:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        goto L_0x027a;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfo.a(java.util.Map):void");
    }

    /* renamed from: a */
    public void m8172a(boolean z) {
        synchronized (this.f5992j) {
            if (this.f5999q != null) {
                this.f5999q.dismiss();
                this.f6000r.removeView(this.f5993k.mo1305b());
                if (this.f6001s != null) {
                    this.f6001s.removeView(this.f5996n);
                    this.f6001s.addView(this.f5993k.mo1305b());
                    this.f5993k.mo1301a(this.f5995m);
                }
                if (z) {
                    m8160d("default");
                    if (this.f5998p != null) {
                        this.f5998p.mo280L();
                    }
                }
                this.f5999q = null;
                this.f6000r = null;
                this.f6001s = null;
                this.f5997o = null;
            }
        }
    }

    /* renamed from: a */
    boolean m8173a() {
        return this.f5991i > -1 && this.f5988f > -1;
    }

    /* renamed from: b */
    void m8174b(int i, int i2) {
        m8155a(i, i2 - ako.m2343e().m9133d(this.f5994l)[0], this.f5991i, this.f5988f);
    }

    /* renamed from: b */
    public boolean m8175b() {
        boolean z;
        synchronized (this.f5992j) {
            z = this.f5999q != null;
        }
        return z;
    }

    /* renamed from: c */
    public void m8176c(int i, int i2) {
        this.f5986d = i;
        this.f5987e = i2;
    }

    /* renamed from: c */
    boolean m8177c() {
        int[] b = ako.m2343e().m9125b(this.f5994l);
        int[] d = ako.m2343e().m9133d(this.f5994l);
        int i = b[0];
        int i2 = b[1];
        if (this.f5991i < 50 || this.f5991i > i) {
            bky.m9011e("Width is too small or too large.");
            return false;
        } else if (this.f5988f < 50 || this.f5988f > i2) {
            bky.m9011e("Height is too small or too large.");
            return false;
        } else if (this.f5988f == i2 && this.f5991i == i) {
            bky.m9011e("Cannot resize to a full-screen ad.");
            return false;
        } else {
            if (this.f5985c) {
                int i3;
                String str = this.f5984b;
                boolean z = true;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals(AdCreative.kAlignmentCenter)) {
                            z = true;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            z = false;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                        i3 = this.f5989g + this.f5986d;
                        i2 = this.f5987e + this.f5990h;
                        break;
                    case true:
                        i3 = ((this.f5986d + this.f5989g) + (this.f5991i / 2)) - 25;
                        i2 = this.f5987e + this.f5990h;
                        break;
                    case true:
                        i3 = ((this.f5986d + this.f5989g) + (this.f5991i / 2)) - 25;
                        i2 = ((this.f5987e + this.f5990h) + (this.f5988f / 2)) - 25;
                        break;
                    case true:
                        i3 = this.f5989g + this.f5986d;
                        i2 = ((this.f5987e + this.f5990h) + this.f5988f) - 50;
                        break;
                    case true:
                        i3 = ((this.f5986d + this.f5989g) + (this.f5991i / 2)) - 25;
                        i2 = ((this.f5987e + this.f5990h) + this.f5988f) - 50;
                        break;
                    case true:
                        i3 = ((this.f5986d + this.f5989g) + this.f5991i) - 50;
                        i2 = ((this.f5987e + this.f5990h) + this.f5988f) - 50;
                        break;
                    default:
                        i3 = ((this.f5986d + this.f5989g) + this.f5991i) - 50;
                        i2 = this.f5987e + this.f5990h;
                        break;
                }
                if (i3 < 0 || i3 + 50 > i || r2 < d[0] || r2 + 50 > d[1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
