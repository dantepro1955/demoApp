package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import p000.cwk.C4624a;

/* compiled from: ValueAnimator */
/* renamed from: cwu */
public class cwu extends cwk {
    /* renamed from: h */
    private static ThreadLocal<C4642a> f20385h = new ThreadLocal();
    /* renamed from: i */
    private static final ThreadLocal<ArrayList<cwu>> f20386i = new C46371();
    /* renamed from: j */
    private static final ThreadLocal<ArrayList<cwu>> f20387j = new C46382();
    /* renamed from: k */
    private static final ThreadLocal<ArrayList<cwu>> f20388k = new C46393();
    /* renamed from: l */
    private static final ThreadLocal<ArrayList<cwu>> f20389l = new C46404();
    /* renamed from: m */
    private static final ThreadLocal<ArrayList<cwu>> f20390m = new C46415();
    /* renamed from: n */
    private static final Interpolator f20391n = new AccelerateDecelerateInterpolator();
    /* renamed from: o */
    private static final cwt f20392o = new cwn();
    /* renamed from: p */
    private static final cwt f20393p = new cwl();
    /* renamed from: z */
    private static long f20394z = 10;
    /* renamed from: A */
    private int f20395A = 0;
    /* renamed from: B */
    private int f20396B = 1;
    /* renamed from: C */
    private Interpolator f20397C = f20391n;
    /* renamed from: D */
    private ArrayList<C4643b> f20398D = null;
    /* renamed from: b */
    long f20399b;
    /* renamed from: c */
    long f20400c = -1;
    /* renamed from: d */
    int f20401d = 0;
    /* renamed from: e */
    boolean f20402e = false;
    /* renamed from: f */
    cws[] f20403f;
    /* renamed from: g */
    HashMap<String, cws> f20404g;
    /* renamed from: q */
    private boolean f20405q = false;
    /* renamed from: r */
    private int f20406r = 0;
    /* renamed from: s */
    private float f20407s = 0.0f;
    /* renamed from: t */
    private boolean f20408t = false;
    /* renamed from: u */
    private long f20409u;
    /* renamed from: v */
    private boolean f20410v = false;
    /* renamed from: w */
    private boolean f20411w = false;
    /* renamed from: x */
    private long f20412x = 300;
    /* renamed from: y */
    private long f20413y = 0;

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$1 */
    static class C46371 extends ThreadLocal<ArrayList<cwu>> {
        C46371() {
        }

        protected /* synthetic */ Object initialValue() {
            return m25368a();
        }

        /* renamed from: a */
        protected ArrayList<cwu> m25368a() {
            return new ArrayList();
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$2 */
    static class C46382 extends ThreadLocal<ArrayList<cwu>> {
        C46382() {
        }

        protected /* synthetic */ Object initialValue() {
            return m25369a();
        }

        /* renamed from: a */
        protected ArrayList<cwu> m25369a() {
            return new ArrayList();
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$3 */
    static class C46393 extends ThreadLocal<ArrayList<cwu>> {
        C46393() {
        }

        protected /* synthetic */ Object initialValue() {
            return m25370a();
        }

        /* renamed from: a */
        protected ArrayList<cwu> m25370a() {
            return new ArrayList();
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$4 */
    static class C46404 extends ThreadLocal<ArrayList<cwu>> {
        C46404() {
        }

        protected /* synthetic */ Object initialValue() {
            return m25371a();
        }

        /* renamed from: a */
        protected ArrayList<cwu> m25371a() {
            return new ArrayList();
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$5 */
    static class C46415 extends ThreadLocal<ArrayList<cwu>> {
        C46415() {
        }

        protected /* synthetic */ Object initialValue() {
            return m25372a();
        }

        /* renamed from: a */
        protected ArrayList<cwu> m25372a() {
            return new ArrayList();
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$a */
    static class C4642a extends Handler {
        private C4642a() {
        }

        public void handleMessage(Message message) {
            ArrayList arrayList;
            Object obj;
            ArrayList arrayList2;
            int size;
            int i;
            cwu cwu;
            ArrayList arrayList3 = (ArrayList) cwu.f20386i.get();
            ArrayList arrayList4 = (ArrayList) cwu.f20388k.get();
            switch (message.what) {
                case 0:
                    arrayList = (ArrayList) cwu.f20387j.get();
                    if (arrayList3.size() > 0 || arrayList4.size() > 0) {
                        obj = null;
                    } else {
                        int i2 = 1;
                    }
                    while (arrayList.size() > 0) {
                        arrayList2 = (ArrayList) arrayList.clone();
                        arrayList.clear();
                        size = arrayList2.size();
                        for (i = 0; i < size; i++) {
                            cwu = (cwu) arrayList2.get(i);
                            if (cwu.f20413y == 0) {
                                cwu.m25260m();
                            } else {
                                arrayList4.add(cwu);
                            }
                        }
                    }
                    break;
                case 1:
                    obj = 1;
                    break;
                default:
                    return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            arrayList = (ArrayList) cwu.f20390m.get();
            arrayList2 = (ArrayList) cwu.f20389l.get();
            size = arrayList4.size();
            for (i = 0; i < size; i++) {
                cwu = (cwu) arrayList4.get(i);
                if (cwu.mo4192a(currentAnimationTimeMillis)) {
                    arrayList.add(cwu);
                }
            }
            size = arrayList.size();
            if (size > 0) {
                for (i = 0; i < size; i++) {
                    cwu = (cwu) arrayList.get(i);
                    cwu.m25260m();
                    cwu.f20410v = true;
                    arrayList4.remove(cwu);
                }
                arrayList.clear();
            }
            i = arrayList3.size();
            int i3 = 0;
            while (i3 < i) {
                int i4;
                cwu cwu2 = (cwu) arrayList3.get(i3);
                if (cwu2.m25269d(currentAnimationTimeMillis)) {
                    arrayList2.add(cwu2);
                }
                if (arrayList3.size() == i) {
                    i4 = i3 + 1;
                    i3 = i;
                } else {
                    i--;
                    arrayList2.remove(cwu2);
                    i4 = i3;
                    i3 = i;
                }
                i = i3;
                i3 = i4;
            }
            if (arrayList2.size() > 0) {
                for (i3 = 0; i3 < arrayList2.size(); i3++) {
                    ((cwu) arrayList2.get(i3)).mo4197d();
                }
                arrayList2.clear();
            }
            if (obj == null) {
                return;
            }
            if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0, cwu.f20394z - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    /* compiled from: ValueAnimator */
    /* renamed from: cwu$b */
    public interface C4643b {
        /* renamed from: a */
        void m25373a(cwu cwu);
    }

    /* renamed from: b */
    public /* synthetic */ cwk mo4190b() {
        return mo4198e();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4198e();
    }

    /* renamed from: a */
    public void mo4194a(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            if (this.f20403f == null || this.f20403f.length == 0) {
                m25264a(cws.m25345a("", fArr));
            } else {
                this.f20403f[0].mo4206a(fArr);
            }
            this.f20402e = false;
        }
    }

    /* renamed from: a */
    public void m25264a(cws... cwsArr) {
        this.f20403f = cwsArr;
        this.f20404g = new HashMap(r2);
        for (cws cws : cwsArr) {
            this.f20404g.put(cws.m25359c(), cws);
        }
        this.f20402e = false;
    }

    /* renamed from: c */
    void mo4196c() {
        if (!this.f20402e) {
            for (cws b : this.f20403f) {
                b.m25357b();
            }
            this.f20402e = true;
        }
    }

    /* renamed from: b */
    public cwu mo4195b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f20412x = j;
        return this;
    }

    /* renamed from: c */
    public void m25268c(long j) {
        mo4196c();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f20401d != 1) {
            this.f20400c = j;
            this.f20401d = 2;
        }
        this.f20399b = currentAnimationTimeMillis - j;
        m25269d(currentAnimationTimeMillis);
    }

    /* renamed from: f */
    public long m25271f() {
        if (!this.f20402e || this.f20401d == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f20399b;
    }

    /* renamed from: a */
    private void m25247a(boolean z) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f20405q = z;
        this.f20406r = 0;
        this.f20401d = 0;
        this.f20411w = true;
        this.f20408t = false;
        ((ArrayList) f20387j.get()).add(this);
        if (this.f20413y == 0) {
            m25268c(m25271f());
            this.f20401d = 0;
            this.f20410v = true;
            if (this.a != null) {
                ArrayList arrayList = (ArrayList) this.a.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C4624a) arrayList.get(i)).m25214a(this);
                }
            }
        }
        C4642a c4642a = (C4642a) f20385h.get();
        if (c4642a == null) {
            c4642a = new C4642a();
            f20385h.set(c4642a);
        }
        c4642a.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public void mo4189a() {
        m25247a(false);
    }

    /* renamed from: d */
    private void mo4197d() {
        ((ArrayList) f20386i.get()).remove(this);
        ((ArrayList) f20387j.get()).remove(this);
        ((ArrayList) f20388k.get()).remove(this);
        this.f20401d = 0;
        if (this.f20410v && this.a != null) {
            ArrayList arrayList = (ArrayList) this.a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4624a) arrayList.get(i)).m25215b(this);
            }
        }
        this.f20410v = false;
        this.f20411w = false;
    }

    /* renamed from: m */
    private void m25260m() {
        mo4196c();
        ((ArrayList) f20386i.get()).add(this);
        if (this.f20413y > 0 && this.a != null) {
            ArrayList arrayList = (ArrayList) this.a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4624a) arrayList.get(i)).m25214a(this);
            }
        }
    }

    /* renamed from: a */
    private boolean mo4192a(long j) {
        if (this.f20408t) {
            long j2 = j - this.f20409u;
            if (j2 > this.f20413y) {
                this.f20399b = j - (j2 - this.f20413y);
                this.f20401d = 1;
                return true;
            }
        }
        this.f20408t = true;
        this.f20409u = j;
        return false;
    }

    /* renamed from: d */
    boolean m25269d(long j) {
        boolean z = false;
        if (this.f20401d == 0) {
            this.f20401d = 1;
            if (this.f20400c < 0) {
                this.f20399b = j;
            } else {
                this.f20399b = j - this.f20400c;
                this.f20400c = -1;
            }
        }
        switch (this.f20401d) {
            case 1:
            case 2:
                float f;
                float f2 = this.f20412x > 0 ? ((float) (j - this.f20399b)) / ((float) this.f20412x) : 1.0f;
                if (f2 < 1.0f) {
                    f = f2;
                } else if (this.f20406r < this.f20395A || this.f20395A == -1) {
                    if (this.a != null) {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            ((C4624a) this.a.get(i)).m25216c(this);
                        }
                    }
                    if (this.f20396B == 2) {
                        this.f20405q = !this.f20405q;
                    }
                    this.f20406r += (int) f2;
                    f = f2 % 1.0f;
                    this.f20399b += this.f20412x;
                } else {
                    f = Math.min(f2, 1.0f);
                    z = true;
                }
                if (this.f20405q) {
                    f = 1.0f - f;
                }
                mo4193a(f);
                break;
        }
        return z;
    }

    /* renamed from: a */
    void mo4193a(float f) {
        int i;
        float interpolation = this.f20397C.getInterpolation(f);
        this.f20407s = interpolation;
        for (cws a : this.f20403f) {
            a.mo4204a(interpolation);
        }
        if (this.f20398D != null) {
            int size = this.f20398D.size();
            for (i = 0; i < size; i++) {
                ((C4643b) this.f20398D.get(i)).m25373a(this);
            }
        }
    }

    /* renamed from: e */
    public cwu mo4198e() {
        int i = 0;
        cwu cwu = (cwu) super.mo4190b();
        if (this.f20398D != null) {
            ArrayList arrayList = this.f20398D;
            cwu.f20398D = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cwu.f20398D.add(arrayList.get(i2));
            }
        }
        cwu.f20400c = -1;
        cwu.f20405q = false;
        cwu.f20406r = 0;
        cwu.f20402e = false;
        cwu.f20401d = 0;
        cwu.f20408t = false;
        cws[] cwsArr = this.f20403f;
        if (cwsArr != null) {
            int length = cwsArr.length;
            cwu.f20403f = new cws[length];
            cwu.f20404g = new HashMap(length);
            while (i < length) {
                cws a = cwsArr[i].mo4203a();
                cwu.f20403f[i] = a;
                cwu.f20404g.put(a.m25359c(), a);
                i++;
            }
        }
        return cwu;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f20403f != null) {
            for (cws cws : this.f20403f) {
                str = str + "\n    " + cws.toString();
            }
        }
        return str;
    }
}
