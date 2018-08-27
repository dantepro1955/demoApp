package com.p000;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.formats.AdChoicesView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000.ayf.C0903b;
import p000.bce.C0970a;

@bhd
/* renamed from: bcb */
public class bcb extends C0970a implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    static final String[] f5557a = new String[]{"2011", "1009"};
    /* renamed from: b */
    FrameLayout f5558b;
    /* renamed from: c */
    Map<String, WeakReference<View>> f5559c = new HashMap();
    /* renamed from: d */
    View f5560d;
    /* renamed from: e */
    bby f5561e;
    /* renamed from: f */
    boolean f5562f = false;
    /* renamed from: g */
    Point f5563g = new Point();
    /* renamed from: h */
    Point f5564h = new Point();
    /* renamed from: i */
    WeakReference<ayf> f5565i = new WeakReference(null);
    /* renamed from: j */
    private final Object f5566j = new Object();
    /* renamed from: k */
    private final FrameLayout f5567k;

    public bcb(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f5567k = frameLayout;
        this.f5558b = frameLayout2;
        ako.m2335C().m9330a(this.f5567k, (OnGlobalLayoutListener) this);
        ako.m2335C().m9331a(this.f5567k, (OnScrollChangedListener) this);
        this.f5567k.setOnTouchListener(this);
        this.f5567k.setOnClickListener(this);
        bbb.m7128a(this.f5567k.getContext());
    }

    /* renamed from: a */
    private void m7404a(bbz bbz) {
        View view;
        ViewGroup viewGroup = null;
        boolean a = bbz.mo968a();
        if (a && this.f5559c != null) {
            WeakReference weakReference = (WeakReference) this.f5559c.get("1098");
            view = weakReference != null ? (View) weakReference.get() : null;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
        }
        boolean z = a && viewGroup != null;
        this.f5560d = m7410a(bbz, z);
        if (this.f5560d != null) {
            if (this.f5559c != null) {
                this.f5559c.put("1007", new WeakReference(this.f5560d));
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(this.f5560d);
                return;
            }
            view = m7412a(bbz.mo972f());
            view.setLayoutParams(new LayoutParams(-1, -1));
            view.addView(this.f5560d);
            if (this.f5558b != null) {
                this.f5558b.addView(view);
            }
        }
    }

    /* renamed from: b */
    private void m7406b(bbz bbz) {
        synchronized (this.f5566j) {
            final View f = m7407f();
            if (f instanceof FrameLayout) {
                bbz.mo964a(f, new bbv(this) {
                    /* renamed from: b */
                    final /* synthetic */ bcb f5556b;

                    /* renamed from: a */
                    public void mo950a() {
                        this.f5556b.onClick(f);
                    }

                    /* renamed from: a */
                    public void mo951a(MotionEvent motionEvent) {
                        this.f5556b.onTouch(null, motionEvent);
                    }
                });
                return;
            }
            bbz.m7340g();
        }
    }

    /* renamed from: f */
    private View m7407f() {
        if (this.f5559c == null) {
            return null;
        }
        for (Object obj : f5557a) {
            WeakReference weakReference = (WeakReference) this.f5559c.get(obj);
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    /* renamed from: a */
    int m7408a(int i) {
        return azp.m6789a().m9295b(this.f5561e.mo972f(), i);
    }

    /* renamed from: a */
    Point m7409a(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        this.f5567k.getLocationOnScreen(iArr);
        return new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
    }

    /* renamed from: a */
    View m7410a(bbz bbz, boolean z) {
        return bbz.mo961a((OnClickListener) this, z);
    }

    /* renamed from: a */
    public aqq mo906a(String str) {
        Object obj = null;
        synchronized (this.f5566j) {
            if (this.f5559c == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f5559c.get(str);
            if (weakReference != null) {
                View view = (View) weakReference.get();
            }
            aqq a = aqr.m4967a(obj);
            return a;
        }
    }

    /* renamed from: a */
    AdChoicesView m7412a(Context context) {
        return new AdChoicesView(context);
    }

    /* renamed from: a */
    public void mo907a() {
        synchronized (this.f5566j) {
            if (this.f5558b != null) {
                this.f5558b.removeAllViews();
            }
            this.f5558b = null;
            this.f5559c = null;
            this.f5560d = null;
            this.f5561e = null;
            this.f5563g = null;
            this.f5564h = null;
            this.f5565i = null;
        }
    }

    /* renamed from: a */
    void m7414a(View view) {
        if (this.f5561e != null) {
            bby c = this.f5561e instanceof bbw ? ((bbw) this.f5561e).m7352c() : this.f5561e;
            if (c != null) {
                c.mo963a(view);
            }
        }
    }

    /* renamed from: a */
    public void mo908a(aqq aqq) {
        synchronized (this.f5566j) {
            m7414a(null);
            Object a = aqr.m4968a(aqq);
            if (a instanceof bbz) {
                if (this.f5558b != null) {
                    this.f5558b.setLayoutParams(new LayoutParams(0, 0));
                    this.f5567k.requestLayout();
                }
                this.f5562f = true;
                final bbz bbz = (bbz) a;
                if (this.f5561e != null && ((Boolean) bbb.cj.m7064c()).booleanValue()) {
                    this.f5561e.mo969b(this.f5567k, this.f5559c);
                }
                m7419c();
                if ((this.f5561e instanceof bbw) && ((bbw) this.f5561e).m7351b()) {
                    ((bbw) this.f5561e).m7348a(bbz);
                } else {
                    this.f5561e = bbz;
                    if (bbz instanceof bbw) {
                        ((bbw) bbz).m7348a(null);
                    }
                }
                if (((Boolean) bbb.cj.m7064c()).booleanValue()) {
                    this.f5558b.setClickable(false);
                }
                this.f5558b.removeAllViews();
                m7404a(bbz);
                bbz.mo973a(this.f5567k, this.f5559c, (OnTouchListener) this, (OnClickListener) this);
                bkg.f6710a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ bcb f5554b;

                    public void run() {
                        blo d = bbz.mo974d();
                        if (!(d == null || this.f5554b.f5558b == null)) {
                            this.f5554b.f5558b.addView(d.mo1305b());
                        }
                        if (!(bbz instanceof bbw)) {
                            this.f5554b.m7406b(bbz);
                        }
                    }
                });
                m7414a(this.f5567k);
                m7418b();
                return;
            }
            bky.m9011e("Not an instance of native engine. This is most likely a transient error");
        }
    }

    /* renamed from: a */
    public void mo909a(aqq aqq, int i) {
        if (ako.m2336D().m8885c()) {
            ayf ayf = (ayf) this.f5565i.get();
            if (ayf != null) {
                ayf.m6563a();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo910a(String r5, p000.aqq r6) {
        /*
        r4 = this;
        r0 = p000.aqr.m4968a(r6);
        r0 = (android.view.View) r0;
        r1 = r4.f5566j;
        monitor-enter(r1);
        r2 = r4.f5559c;	 Catch:{ all -> 0x0018 }
        if (r2 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000e:
        return;
    L_0x000f:
        if (r0 != 0) goto L_0x001b;
    L_0x0011:
        r0 = r4.f5559c;	 Catch:{ all -> 0x0018 }
        r0.remove(r5);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        r2 = r4.f5559c;	 Catch:{ all -> 0x0018 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0018 }
        r3.<init>(r0);	 Catch:{ all -> 0x0018 }
        r2.put(r5, r3);	 Catch:{ all -> 0x0018 }
        r2 = "1098";
        r2 = r2.equals(r5);	 Catch:{ all -> 0x0018 }
        if (r2 == 0) goto L_0x002f;
    L_0x002d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x002f:
        r0.setOnTouchListener(r4);	 Catch:{ all -> 0x0018 }
        r2 = 1;
        r0.setClickable(r2);	 Catch:{ all -> 0x0018 }
        r0.setOnClickListener(r4);	 Catch:{ all -> 0x0018 }
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcb.a(java.lang.String, aqq):void");
    }

    /* renamed from: b */
    void m7418b() {
        if (this.f5561e instanceof bbz) {
            bbz bbz = (bbz) this.f5561e;
            if (ako.m2336D().m8885c() && bbz != null && bbz.mo972f() != null) {
                ayf ayf = (ayf) this.f5565i.get();
                if (ayf == null) {
                    ayf = new ayf(this.f5567k.getContext(), this.f5567k);
                    this.f5565i = new WeakReference(ayf);
                }
                ayf.m6565a(bbz.m7343j());
            }
        }
    }

    /* renamed from: c */
    void m7419c() {
        if (this.f5561e instanceof bbz) {
            bbz bbz = (bbz) this.f5561e;
            if (ako.m2336D().m8885c() && bbz != null && bbz.mo972f() != null) {
                C0903b j = bbz.m7343j();
                if (j != null) {
                    j.m8869a(false);
                }
                ayf ayf = (ayf) this.f5565i.get();
                if (ayf != null && j != null) {
                    ayf.m6566b(j);
                }
            }
        }
    }

    /* renamed from: d */
    int m7420d() {
        return this.f5567k.getMeasuredWidth();
    }

    /* renamed from: e */
    int m7421e() {
        return this.f5567k.getMeasuredHeight();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(View r8) {
        /*
        r7 = this;
        r6 = r7.f5566j;
        monitor-enter(r6);
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new org.json.JSONObject;	 Catch:{ all -> 0x0072 }
        r3.<init>();	 Catch:{ all -> 0x0072 }
        r0 = "x";
        r1 = r7.f5563g;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.x;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.m7408a(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "y";
        r1 = r7.f5563g;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.y;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.m7408a(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "start_x";
        r1 = r7.f5564h;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.x;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.m7408a(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "start_y";
        r1 = r7.f5564h;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.y;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.m7408a(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
    L_0x0042:
        r0 = r7.f5560d;	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0089;
    L_0x0046:
        r0 = r7.f5560d;	 Catch:{ all -> 0x0072 }
        r0 = r0.equals(r8);	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0089;
    L_0x004e:
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        r0 = r0 instanceof p000.bbw;	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x007c;
    L_0x0054:
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        r0 = (p000.bbw) r0;	 Catch:{ all -> 0x0072 }
        r0 = r0.m7352c();	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0070;
    L_0x005e:
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        r0 = (p000.bbw) r0;	 Catch:{ all -> 0x0072 }
        r0 = r0.m7352c();	 Catch:{ all -> 0x0072 }
        r2 = "1007";
        r4 = r7.f5559c;	 Catch:{ all -> 0x0072 }
        r5 = r7.f5567k;	 Catch:{ all -> 0x0072 }
        r1 = r8;
        r0.mo965a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0072 }
    L_0x0070:
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
        goto L_0x0008;
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
        throw r0;
    L_0x0075:
        r0 = move-exception;
        r0 = "Unable to get click location";
        p000.bky.m9011e(r0);	 Catch:{ all -> 0x0072 }
        goto L_0x0042;
    L_0x007c:
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        r2 = "1007";
        r4 = r7.f5559c;	 Catch:{ all -> 0x0072 }
        r5 = r7.f5567k;	 Catch:{ all -> 0x0072 }
        r1 = r8;
        r0.mo965a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0072 }
        goto L_0x0070;
    L_0x0089:
        r0 = r7.f5561e;	 Catch:{ all -> 0x0072 }
        r1 = r7.f5559c;	 Catch:{ all -> 0x0072 }
        r2 = r7.f5567k;	 Catch:{ all -> 0x0072 }
        r0.mo967a(r8, r1, r3, r2);	 Catch:{ all -> 0x0072 }
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcb.onClick(android.view.View):void");
    }

    public void onGlobalLayout() {
        synchronized (this.f5566j) {
            if (this.f5562f) {
                int d = m7420d();
                int e = m7421e();
                if (!(d == 0 || e == 0 || this.f5558b == null)) {
                    this.f5558b.setLayoutParams(new LayoutParams(d, e));
                    this.f5562f = false;
                }
            }
            if (this.f5561e != null) {
                this.f5561e.mo970c(this.f5567k, this.f5559c);
            }
        }
    }

    public void onScrollChanged() {
        synchronized (this.f5566j) {
            if (this.f5561e != null) {
                this.f5561e.mo970c(this.f5567k, this.f5559c);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5566j) {
            if (this.f5561e == null) {
            } else {
                Point a = m7409a(motionEvent);
                this.f5563g = a;
                if (motionEvent.getAction() == 0) {
                    this.f5564h = a;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) a.x, (float) a.y);
                this.f5561e.mo962a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
