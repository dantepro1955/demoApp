package com.p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import p000.atp.C0794a;
import p000.atr.C0800a;

/* renamed from: aul */
public abstract class aul implements auh {
    /* renamed from: a */
    protected MotionEvent f4602a;
    /* renamed from: b */
    protected LinkedList<MotionEvent> f4603b = new LinkedList();
    /* renamed from: c */
    protected long f4604c = 0;
    /* renamed from: d */
    protected long f4605d = 0;
    /* renamed from: e */
    protected long f4606e = 0;
    /* renamed from: f */
    protected long f4607f = 0;
    /* renamed from: g */
    protected long f4608g = 0;
    /* renamed from: h */
    protected long f4609h = 0;
    /* renamed from: i */
    protected long f4610i = 0;
    /* renamed from: j */
    protected boolean f4611j = false;
    /* renamed from: k */
    protected DisplayMetrics f4612k;
    /* renamed from: l */
    private boolean f4613l = false;

    protected aul(Context context) {
        try {
            atx.m5702a();
            this.f4612k = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    private String m5773a(Context context, String str, boolean z, View view, byte[] bArr) {
        boolean z2 = true;
        C0794a c0794a = null;
        if (bArr != null && bArr.length > 0) {
            try {
                c0794a = C0794a.m5629a(bArr);
            } catch (axe e) {
            }
        }
        if (z) {
            try {
                C0800a a = mo781a(context, view);
                this.f4613l = true;
            } catch (NoSuchAlgorithmException e2) {
                return Integer.toString(7);
            } catch (UnsupportedEncodingException e3) {
                return Integer.toString(7);
            } catch (Throwable th) {
                return Integer.toString(3);
            }
        }
        a = mo782a(context, c0794a);
        if (a == null || a.m5622g() == 0) {
            return Integer.toString(5);
        }
        if (aul.m5775a(z)) {
            z2 = false;
        }
        return atx.m5696a(a, str, z2);
    }

    /* renamed from: a */
    private static boolean m5774a(avy avy) {
        return (avy == null || avy.f4735d == null || avy.f4738g == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m5775a(boolean z) {
        return !((Boolean) bbb.bJ.m7064c()).booleanValue() ? true : ((Boolean) bbb.bP.m7064c()).booleanValue() && z;
    }

    /* renamed from: b */
    private boolean m5776b(avy avy) {
        return (this.f4612k == null || avy == null || avy.f4736e == null || avy.f4739h == null) ? false : true;
    }

    /* renamed from: a */
    protected abstract long mo780a(StackTraceElement[] stackTraceElementArr) throws avh;

    /* renamed from: a */
    protected abstract C0800a mo781a(Context context, View view);

    /* renamed from: a */
    protected abstract C0800a mo782a(Context context, C0794a c0794a);

    /* renamed from: a */
    public String mo290a(Context context) {
        if (!avz.m6118b() || !((Boolean) bbb.bO.m7064c()).booleanValue()) {
            return m5773a(context, null, false, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: a */
    public String m5781a(Context context, String str) {
        return mo291a(context, str, null);
    }

    /* renamed from: a */
    public String mo291a(Context context, String str, View view) {
        return m5773a(context, str, true, view, null);
    }

    /* renamed from: a */
    public String m5783a(Context context, byte[] bArr) {
        if (!avz.m6118b() || !((Boolean) bbb.bO.m7064c()).booleanValue()) {
            return m5773a(context, null, false, null, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: a */
    public void mo292a(int i, int i2, int i3) {
        if (this.f4602a != null) {
            this.f4602a.recycle();
        }
        if (this.f4612k != null) {
            this.f4602a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f4612k.density, ((float) i2) * this.f4612k.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f4602a = null;
        }
        this.f4611j = false;
    }

    /* renamed from: a */
    public void mo293a(MotionEvent motionEvent) {
        if (this.f4613l) {
            this.f4607f = 0;
            this.f4606e = 0;
            this.f4605d = 0;
            this.f4604c = 0;
            this.f4608g = 0;
            this.f4610i = 0;
            this.f4609h = 0;
            Iterator it = this.f4603b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f4603b.clear();
            this.f4602a = null;
            this.f4613l = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f4604c++;
                break;
            case 1:
                this.f4602a = MotionEvent.obtain(motionEvent);
                this.f4603b.add(this.f4602a);
                if (this.f4603b.size() > 6) {
                    ((MotionEvent) this.f4603b.remove()).recycle();
                }
                this.f4606e++;
                try {
                    this.f4608g = mo780a(new Throwable().getStackTrace());
                    break;
                } catch (avh e) {
                    break;
                }
            case 2:
                this.f4605d += (long) (motionEvent.getHistorySize() + 1);
                try {
                    avy b = mo783b(motionEvent);
                    if (aul.m5774a(b)) {
                        this.f4609h += b.f4735d.longValue() + b.f4738g.longValue();
                    }
                    if (m5776b(b)) {
                        this.f4610i = (b.f4739h.longValue() + b.f4736e.longValue()) + this.f4610i;
                        break;
                    }
                } catch (avh e2) {
                    break;
                }
                break;
            case 3:
                this.f4607f++;
                break;
        }
        this.f4611j = true;
    }

    /* renamed from: b */
    protected abstract avy mo783b(MotionEvent motionEvent) throws avh;
}
