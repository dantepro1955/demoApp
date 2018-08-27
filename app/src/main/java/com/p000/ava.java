package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p000.atp.C0794a;
import p000.atr.C0800a;
import p000.atr.C0800a.C0798a;

/* renamed from: ava */
public abstract class ava extends aul {
    /* renamed from: l */
    protected static final Object f4630l = new Object();
    /* renamed from: m */
    protected static volatile avx f4631m = null;
    /* renamed from: n */
    static boolean f4632n = false;
    /* renamed from: s */
    private static final String f4633s = ava.class.getSimpleName();
    /* renamed from: t */
    private static long f4634t = 0;
    /* renamed from: o */
    protected boolean f4635o = false;
    /* renamed from: p */
    protected String f4636p;
    /* renamed from: q */
    protected boolean f4637q = false;
    /* renamed from: r */
    protected boolean f4638r = false;

    protected ava(Context context, String str) {
        super(context);
        this.f4636p = str;
        this.f4635o = false;
    }

    protected ava(Context context, String str, boolean z) {
        super(context);
        this.f4636p = str;
        this.f4635o = z;
    }

    /* renamed from: a */
    static avy m5902a(avx avx, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws avh {
        Throwable e;
        Method a = avx.m6094a(avf.m5952J(), avf.m5953K());
        if (a == null || motionEvent == null) {
            throw new avh();
        }
        try {
            return new avy((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new avh(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new avh(e);
        }
    }

    /* renamed from: a */
    protected static synchronized void m5903a(Context context, boolean z) {
        synchronized (ava.class) {
            if (!f4632n) {
                f4634t = avz.m6115a().longValue() / 1000;
                f4631m = ava.m5906b(context, z);
                f4632n = true;
            }
        }
    }

    /* renamed from: a */
    private static void m5904a(avx avx) {
        List singletonList = Collections.singletonList(Context.class);
        avx.m6095a(avf.m5973p(), avf.m5974q(), singletonList);
        avx.m6095a(avf.m5983z(), avf.m5943A(), singletonList);
        avx.m6095a(avf.m5981x(), avf.m5982y(), singletonList);
        avx.m6095a(avf.m5967j(), avf.m5968k(), singletonList);
        avx.m6095a(avf.m5977t(), avf.m5978u(), singletonList);
        avx.m6095a(avf.m5961d(), avf.m5962e(), singletonList);
        avx.m6095a(avf.m5954L(), avf.m5955M(), singletonList);
        avx.m6095a(avf.m5963f(), avf.m5964g(), singletonList);
        singletonList = Arrays.asList(new Class[]{MotionEvent.class, DisplayMetrics.class});
        avx.m6095a(avf.m5952J(), avf.m5953K(), singletonList);
        avx.m6095a(avf.m5950H(), avf.m5951I(), singletonList);
        avx.m6095a(avf.m5971n(), avf.m5972o(), Collections.emptyList());
        avx.m6095a(avf.m5948F(), avf.m5949G(), Collections.emptyList());
        avx.m6095a(avf.m5979v(), avf.m5980w(), Collections.emptyList());
        avx.m6095a(avf.m5969l(), avf.m5970m(), Collections.emptyList());
        avx.m6095a(avf.m5975r(), avf.m5976s(), Collections.emptyList());
        avx.m6095a(avf.m5946D(), avf.m5947E(), Collections.emptyList());
        avx.m6095a(avf.m5965h(), avf.m5966i(), Arrays.asList(new Class[]{Context.class, Boolean.TYPE}));
        avx.m6095a(avf.m5944B(), avf.m5945C(), Arrays.asList(new Class[]{StackTraceElement[].class}));
        avx.m6095a(avf.m5956N(), avf.m5957O(), Arrays.asList(new Class[]{View.class}));
    }

    /* renamed from: a */
    private void m5905a(avx avx, C0800a c0800a) {
        C0798a c0798a;
        int i = 1;
        try {
            avy a = ava.m5902a(avx, this.a, this.k);
            c0800a.f4413n = a.f4732a;
            c0800a.f4414o = a.f4733b;
            c0800a.f4415p = a.f4734c;
            if (this.j) {
                c0800a.f4377D = a.f4735d;
                c0800a.f4378E = a.f4736e;
            }
            c0798a = new C0798a();
            avy b = mo783b(this.a);
            c0798a.f4359a = b.f4732a;
            c0798a.f4360b = b.f4733b;
            c0798a.f4366h = b.f4734c;
            if (this.j) {
                c0798a.f4361c = b.f4736e;
                c0798a.f4363e = b.f4735d;
                c0798a.f4365g = Integer.valueOf(b.f4737f.longValue() != 0 ? 1 : 0);
                if (this.d > 0) {
                    c0798a.f4362d = this.k != null ? Long.valueOf(Math.round(((double) this.i) / ((double) this.d))) : null;
                    c0798a.f4364f = Long.valueOf(Math.round(((double) this.h) / ((double) this.d)));
                }
                c0798a.f4368j = b.f4740i;
                c0798a.f4367i = b.f4741j;
                if (b.f4742k.longValue() == 0) {
                    i = 0;
                }
                c0798a.f4369k = Integer.valueOf(i);
                if (this.g > 0) {
                    c0798a.f4370l = Long.valueOf(this.g);
                }
            }
            c0800a.f4396W = c0798a;
        } catch (avh e) {
        }
        if (this.c > 0) {
            c0800a.f4382I = Long.valueOf(this.c);
        }
        if (this.d > 0) {
            c0800a.f4381H = Long.valueOf(this.d);
        }
        if (this.e > 0) {
            c0800a.f4380G = Long.valueOf(this.e);
        }
        if (this.f > 0) {
            c0800a.f4383J = Long.valueOf(this.f);
        }
        try {
            int size = this.b.size() - 1;
            if (size > 0) {
                c0800a.f4397X = new C0798a[size];
                for (i = 0; i < size; i++) {
                    avy a2 = ava.m5902a(avx, (MotionEvent) this.b.get(i), this.k);
                    c0798a = new C0798a();
                    c0798a.f4359a = a2.f4732a;
                    c0798a.f4360b = a2.f4733b;
                    c0800a.f4397X[i] = c0798a;
                }
            }
        } catch (avh e2) {
            c0800a.f4397X = null;
        }
    }

    /* renamed from: b */
    protected static avx m5906b(Context context, boolean z) {
        if (f4631m == null) {
            synchronized (f4630l) {
                if (f4631m == null) {
                    avx a = avx.m6076a(context, avf.m5958a(), avf.m5960c(), z);
                    ava.m5904a(a);
                    f4631m = a;
                }
            }
        }
        return f4631m;
    }

    /* renamed from: a */
    protected long mo780a(StackTraceElement[] stackTraceElementArr) throws avh {
        Throwable e;
        Method a = f4631m.m6094a(avf.m5944B(), avf.m5945C());
        if (a == null || stackTraceElementArr == null) {
            throw new avh();
        }
        try {
            return new avv((String) a.invoke(null, new Object[]{stackTraceElementArr})).f4702a.longValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new avh(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new avh(e);
        }
    }

    /* renamed from: a */
    protected C0800a mo781a(Context context, View view) {
        C0800a c0800a = new C0800a();
        if (!TextUtils.isEmpty(this.f4636p)) {
            c0800a.f4401b = this.f4636p;
        }
        avx b = ava.m5906b(context, this.f4635o);
        b.m6110p();
        m5915b(b, c0800a, view);
        b.m6111q();
        return c0800a;
    }

    /* renamed from: a */
    protected C0800a mo782a(Context context, C0794a c0794a) {
        C0800a c0800a = new C0800a();
        if (!TextUtils.isEmpty(this.f4636p)) {
            c0800a.f4401b = this.f4636p;
        }
        avx b = ava.m5906b(context, this.f4635o);
        b.m6110p();
        mo784a(b, c0800a, c0794a);
        b.m6111q();
        return c0800a;
    }

    /* renamed from: a */
    protected List<Callable<Void>> m5910a(avx avx, C0800a c0800a, View view) {
        ArrayList arrayList = new ArrayList();
        if (avx.m6097c() == null) {
            return arrayList;
        }
        int r = avx.m6112r();
        arrayList.add(new awl(avx, c0800a));
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new awo(avx, avf.m5979v(), avf.m5980w(), c0800a, r, 1));
        arrayList2 = arrayList;
        arrayList2.add(new awj(avx, avf.m5971n(), avf.m5972o(), c0800a, f4634t, r, 25));
        arrayList2 = arrayList;
        arrayList2.add(new awi(avx, avf.m5969l(), avf.m5970m(), c0800a, r, 44));
        arrayList2 = arrayList;
        arrayList2.add(new awb(avx, avf.m5961d(), avf.m5962e(), c0800a, r, 3));
        arrayList2 = arrayList;
        arrayList2.add(new awm(avx, avf.m5975r(), avf.m5976s(), c0800a, r, 22));
        arrayList2 = arrayList;
        arrayList2.add(new awg(avx, avf.m5967j(), avf.m5968k(), c0800a, r, 5));
        arrayList2 = arrayList;
        arrayList2.add(new awu(avx, avf.m5954L(), avf.m5955M(), c0800a, r, 48));
        if (((Boolean) bbb.bL.m7064c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new awc(avx, avf.m5963f(), avf.m5964g(), c0800a, r, 49));
        }
        arrayList2 = arrayList;
        arrayList2.add(new aws(avx, avf.m5946D(), avf.m5947E(), c0800a, r, 51));
        arrayList2 = arrayList;
        arrayList2.add(new awr(avx, avf.m5944B(), avf.m5945C(), c0800a, r, 45, new Throwable().getStackTrace()));
        if (((Boolean) bbb.bM.m7064c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new aww(avx, avf.m5956N(), avf.m5957O(), c0800a, r, 57, view));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void mo784a(avx avx, C0800a c0800a, C0794a c0794a) {
        if (avx.m6097c() != null) {
            m5912a(mo785b(avx, c0800a, c0794a));
        }
    }

    /* renamed from: a */
    protected void m5912a(List<Callable<Void>> list) {
        if (f4631m != null) {
            ExecutorService c = f4631m.m6097c();
            if (c != null && !list.isEmpty()) {
                try {
                    c.invokeAll(list, ((Long) bbb.bI.m7064c()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(f4633s, String.format("class methods got exception: %s", new Object[]{avz.m6117a(e)}));
                }
            }
        }
    }

    /* renamed from: b */
    protected avy mo783b(MotionEvent motionEvent) throws avh {
        Throwable e;
        Method a = f4631m.m6094a(avf.m5950H(), avf.m5951I());
        if (a == null || motionEvent == null) {
            throw new avh();
        }
        try {
            return new avy((String) a.invoke(null, new Object[]{motionEvent, this.k}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new avh(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new avh(e);
        }
    }

    /* renamed from: b */
    protected List<Callable<Void>> mo785b(avx avx, C0800a c0800a, C0794a c0794a) {
        int r = avx.m6112r();
        List arrayList = new ArrayList();
        List list = arrayList;
        list.add(new awf(avx, avf.m5965h(), avf.m5966i(), c0800a, r, 27, c0794a));
        list = arrayList;
        list.add(new awj(avx, avf.m5971n(), avf.m5972o(), c0800a, f4634t, r, 25));
        list = arrayList;
        list.add(new awo(avx, avf.m5979v(), avf.m5980w(), c0800a, r, 1));
        list = arrayList;
        list.add(new awp(avx, avf.m5981x(), avf.m5982y(), c0800a, r, 31));
        list = arrayList;
        list.add(new awt(avx, avf.m5948F(), avf.m5949G(), c0800a, r, 33));
        list = arrayList;
        list.add(new awd(avx, avf.m5983z(), avf.m5943A(), c0800a, r, 29));
        list = arrayList;
        list.add(new awg(avx, avf.m5967j(), avf.m5968k(), c0800a, r, 5));
        list = arrayList;
        list.add(new awn(avx, avf.m5977t(), avf.m5978u(), c0800a, r, 12));
        list = arrayList;
        list.add(new awb(avx, avf.m5961d(), avf.m5962e(), c0800a, r, 3));
        list = arrayList;
        list.add(new awi(avx, avf.m5969l(), avf.m5970m(), c0800a, r, 44));
        list = arrayList;
        list.add(new awm(avx, avf.m5975r(), avf.m5976s(), c0800a, r, 22));
        list = arrayList;
        list.add(new awu(avx, avf.m5954L(), avf.m5955M(), c0800a, r, 48));
        if (((Boolean) bbb.bK.m7064c()).booleanValue()) {
            list = arrayList;
            list.add(new awc(avx, avf.m5963f(), avf.m5964g(), c0800a, r, 49));
        }
        list = arrayList;
        list.add(new aws(avx, avf.m5946D(), avf.m5947E(), c0800a, r, 51));
        return arrayList;
    }

    /* renamed from: b */
    protected void m5915b(avx avx, C0800a c0800a, View view) {
        m5905a(avx, c0800a);
        m5912a(m5910a(avx, c0800a, view));
    }
}
