package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(14)
/* compiled from: TransitionPort */
/* renamed from: cd */
abstract class cd implements Cloneable {
    /* renamed from: a */
    private static ThreadLocal<hh<Animator, C1683a>> f6044a = new ThreadLocal();
    /* renamed from: b */
    private String f6045b = getClass().getName();
    /* renamed from: c */
    private ck f6046c = new ck();
    /* renamed from: d */
    long f6047d = -1;
    /* renamed from: e */
    long f6048e = -1;
    /* renamed from: f */
    TimeInterpolator f6049f = null;
    /* renamed from: g */
    ArrayList<Integer> f6050g = new ArrayList();
    /* renamed from: h */
    ArrayList<View> f6051h = new ArrayList();
    /* renamed from: i */
    ArrayList<Integer> f6052i = null;
    /* renamed from: j */
    ArrayList<View> f6053j = null;
    /* renamed from: k */
    ArrayList<Class> f6054k = null;
    /* renamed from: l */
    ArrayList<Integer> f6055l = null;
    /* renamed from: m */
    ArrayList<View> f6056m = null;
    /* renamed from: n */
    ArrayList<Class> f6057n = null;
    /* renamed from: o */
    ci f6058o = null;
    /* renamed from: p */
    ViewGroup f6059p = null;
    /* renamed from: q */
    boolean f6060q = false;
    /* renamed from: r */
    int f6061r = 0;
    /* renamed from: s */
    boolean f6062s = false;
    /* renamed from: t */
    ArrayList<C1257b> f6063t = null;
    /* renamed from: u */
    ArrayList<Animator> f6064u = new ArrayList();
    /* renamed from: v */
    ArrayList<Animator> f6065v = new ArrayList();
    /* renamed from: w */
    private ck f6066w = new ck();
    /* renamed from: x */
    private boolean f6067x = false;

    /* compiled from: TransitionPort */
    /* renamed from: cd$b */
    public interface C1257b {
        /* renamed from: a */
        void mo1254a(cd cdVar);

        /* renamed from: b */
        void mo1255b(cd cdVar);

        /* renamed from: c */
        void mo1256c(cd cdVar);

        /* renamed from: d */
        void mo1257d(cd cdVar);
    }

    /* compiled from: TransitionPort */
    /* renamed from: cd$c */
    public static class C1258c implements C1257b {
        /* renamed from: d */
        public void mo1257d(cd cdVar) {
        }

        /* renamed from: a */
        public void mo1254a(cd cdVar) {
        }

        /* renamed from: b */
        public void mo1255b(cd cdVar) {
        }

        /* renamed from: c */
        public void mo1256c(cd cdVar) {
        }
    }

    /* compiled from: TransitionPort */
    /* renamed from: cd$2 */
    class C16822 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ cd f8762a;

        C16822(cd cdVar) {
            this.f8762a = cdVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f8762a.m8252g();
            animator.removeListener(this);
        }
    }

    /* compiled from: TransitionPort */
    /* renamed from: cd$a */
    static class C1683a {
        /* renamed from: a */
        View f8763a;
        /* renamed from: b */
        String f8764b;
        /* renamed from: c */
        cj f8765c;
        /* renamed from: d */
        ct f8766d;

        C1683a(View view, String str, ct ctVar, cj cjVar) {
            this.f8763a = view;
            this.f8764b = str;
            this.f8765c = cjVar;
            this.f8766d = ctVar;
        }
    }

    /* renamed from: a */
    public abstract void mo1165a(cj cjVar);

    /* renamed from: b */
    public abstract void mo1168b(cj cjVar);

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo1171h();
    }

    /* renamed from: j */
    private static hh<Animator, C1683a> mo1172j() {
        hh<Animator, C1683a> hhVar = (hh) f6044a.get();
        if (hhVar != null) {
            return hhVar;
        }
        hhVar = new hh();
        f6044a.set(hhVar);
        return hhVar;
    }

    /* renamed from: b */
    public long m8244b() {
        return this.f6048e;
    }

    /* renamed from: a */
    public cd mo1159a(long j) {
        this.f6048e = j;
        return this;
    }

    /* renamed from: c */
    public long m8248c() {
        return this.f6047d;
    }

    /* renamed from: d */
    public TimeInterpolator m8249d() {
        return this.f6049f;
    }

    /* renamed from: a */
    public cd mo1160a(TimeInterpolator timeInterpolator) {
        this.f6049f = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public String[] mo1259a() {
        return null;
    }

    /* renamed from: a */
    public Animator mo1258a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        return null;
    }

    /* renamed from: a */
    protected void mo1164a(ViewGroup viewGroup, ck ckVar, ck ckVar2) {
        int i;
        int i2;
        hh hhVar = new hh(ckVar2.f9466a);
        SparseArray sparseArray = new SparseArray(ckVar2.f9467b.size());
        for (i = 0; i < ckVar2.f9467b.size(); i++) {
            sparseArray.put(ckVar2.f9467b.keyAt(i), ckVar2.f9467b.valueAt(i));
        }
        hm hmVar = new hm(ckVar2.f9468c.b());
        for (i = 0; i < ckVar2.f9468c.b(); i++) {
            hmVar.b(ckVar2.f9468c.b(i), ckVar2.f9468c.c(i));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (View view : ckVar.f9466a.keySet()) {
            Object obj = null;
            if (view.getParent() instanceof ListView) {
                obj = 1;
            }
            if (obj == null) {
                Object obj2;
                int id = view.getId();
                if (ckVar.f9466a.get(view) != null) {
                    obj2 = (cj) ckVar.f9466a.get(view);
                } else {
                    cj cjVar = (cj) ckVar.f9467b.get(id);
                }
                if (ckVar2.f9466a.get(view) != null) {
                    obj = (cj) ckVar2.f9466a.get(view);
                    hhVar.remove(view);
                } else if (id != -1) {
                    cj cjVar2 = (cj) ckVar2.f9467b.get(id);
                    View view2 = null;
                    for (View view3 : hhVar.keySet()) {
                        View view32;
                        if (view32.getId() != id) {
                            view32 = view2;
                        }
                        view2 = view32;
                    }
                    if (view2 != null) {
                        hhVar.remove(view2);
                    }
                } else {
                    obj = null;
                }
                sparseArray.remove(id);
                if (m8242a(view, (long) id)) {
                    arrayList.add(obj2);
                    arrayList2.add(obj);
                }
            } else {
                ListView listView = (ListView) view.getParent();
                if (listView.getAdapter().hasStableIds()) {
                    long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                    cj cjVar3 = (cj) ckVar.f9468c.a(itemIdAtPosition);
                    hmVar.c(itemIdAtPosition);
                    arrayList.add(cjVar3);
                    arrayList2.add(null);
                }
            }
        }
        int b = ckVar.f9468c.b();
        for (i2 = 0; i2 < b; i2++) {
            long b2 = ckVar.f9468c.b(i2);
            if (m8242a(null, b2)) {
                cjVar3 = (cj) ckVar.f9468c.a(b2);
                cjVar2 = (cj) ckVar2.f9468c.a(b2);
                hmVar.c(b2);
                arrayList.add(cjVar3);
                arrayList2.add(cjVar2);
            }
        }
        for (View view4 : hhVar.keySet()) {
            b = view4.getId();
            if (m8242a(view4, (long) b)) {
                if (ckVar.f9466a.get(view4) != null) {
                    obj = (cj) ckVar.f9466a.get(view4);
                } else {
                    cjVar2 = (cj) ckVar.f9467b.get(b);
                }
                cjVar3 = (cj) hhVar.get(view4);
                sparseArray.remove(b);
                arrayList.add(obj);
                arrayList2.add(cjVar3);
            }
        }
        b = sparseArray.size();
        for (i2 = 0; i2 < b; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            if (m8242a(null, (long) keyAt)) {
                cjVar3 = (cj) ckVar.f9467b.get(keyAt);
                cjVar2 = (cj) sparseArray.get(keyAt);
                arrayList.add(cjVar3);
                arrayList2.add(cjVar2);
            }
        }
        b = hmVar.b();
        for (i2 = 0; i2 < b; i2++) {
            long b3 = hmVar.b(i2);
            cjVar2 = (cj) hmVar.a(b3);
            arrayList.add((cj) ckVar.f9468c.a(b3));
            arrayList2.add(cjVar2);
        }
        hh j = cd.mo1172j();
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            cjVar3 = (cj) arrayList.get(i2);
            cjVar2 = (cj) arrayList2.get(i2);
            if (!(cjVar3 == null && cjVar2 == null) && (cjVar3 == null || !cjVar3.equals(cjVar2))) {
                Object a = mo1258a(viewGroup, cjVar3, cjVar2);
                if (a != null) {
                    View view5;
                    if (cjVar2 != null) {
                        View view6 = cjVar2.f9414b;
                        String[] a2 = mo1259a();
                        if (view6 == null || a2 == null || a2.length <= 0) {
                            cjVar3 = null;
                            obj = a;
                        } else {
                            cjVar = new cj();
                            cjVar.f9414b = view6;
                            cjVar3 = (cj) ckVar2.f9466a.get(view6);
                            if (cjVar3 != null) {
                                for (keyAt = 0; keyAt < a2.length; keyAt++) {
                                    cjVar.f9413a.put(a2[keyAt], cjVar3.f9413a.get(a2[keyAt]));
                                }
                            }
                            int size = j.size();
                            for (keyAt = 0; keyAt < size; keyAt++) {
                                C1683a c1683a = (C1683a) j.get((Animator) j.b(keyAt));
                                if (c1683a.f8765c != null && c1683a.f8763a == view6 && (((c1683a.f8764b == null && m8254i() == null) || c1683a.f8764b.equals(m8254i())) && c1683a.f8765c.equals(cjVar))) {
                                    obj = null;
                                    cjVar3 = cjVar;
                                    break;
                                }
                            }
                            cjVar3 = cjVar;
                            obj = a;
                        }
                        a = obj;
                        view5 = view6;
                    } else {
                        view5 = cjVar3.f9414b;
                        cjVar3 = null;
                    }
                    if (a != null) {
                        j.put(a, new C1683a(view5, m8254i(), ct.a(viewGroup), cjVar3));
                        this.f6064u.add(a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    boolean m8242a(View view, long j) {
        if (this.f6052i != null && this.f6052i.contains(Integer.valueOf((int) j))) {
            return false;
        }
        if (this.f6053j != null && this.f6053j.contains(view)) {
            return false;
        }
        int i;
        if (!(this.f6054k == null || view == null)) {
            int size = this.f6054k.size();
            for (i = 0; i < size; i++) {
                if (((Class) this.f6054k.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6050g.size() == 0 && this.f6051h.size() == 0) {
            return true;
        }
        if (this.f6050g.size() > 0) {
            for (i = 0; i < this.f6050g.size(); i++) {
                if (((long) ((Integer) this.f6050g.get(i)).intValue()) == j) {
                    return true;
                }
            }
        }
        if (view == null || this.f6051h.size() <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f6051h.size(); i2++) {
            if (this.f6051h.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    protected void mo1170e() {
        m8251f();
        hh j = cd.mo1172j();
        Iterator it = this.f6064u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (j.containsKey(animator)) {
                m8251f();
                m8227a(animator, j);
            }
        }
        this.f6064u.clear();
        m8252g();
    }

    /* renamed from: a */
    private void m8227a(Animator animator, final hh<Animator, C1683a> hhVar) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: b */
                final /* synthetic */ cd f8761b;

                public void onAnimationStart(Animator animator) {
                    this.f8761b.f6065v.add(animator);
                }

                public void onAnimationEnd(Animator animator) {
                    hhVar.remove(animator);
                    this.f8761b.f6065v.remove(animator);
                }
            });
            m8235a(animator);
        }
    }

    /* renamed from: a */
    void m8239a(ViewGroup viewGroup, boolean z) {
        int i = 0;
        m8241a(z);
        if (this.f6050g.size() > 0 || this.f6051h.size() > 0) {
            if (this.f6050g.size() > 0) {
                for (int i2 = 0; i2 < this.f6050g.size(); i2++) {
                    int intValue = ((Integer) this.f6050g.get(i2)).intValue();
                    View findViewById = viewGroup.findViewById(intValue);
                    if (findViewById != null) {
                        cj cjVar = new cj();
                        cjVar.f9414b = findViewById;
                        if (z) {
                            mo1165a(cjVar);
                        } else {
                            mo1168b(cjVar);
                        }
                        if (z) {
                            this.f6046c.f9466a.put(findViewById, cjVar);
                            if (intValue >= 0) {
                                this.f6046c.f9467b.put(intValue, cjVar);
                            }
                        } else {
                            this.f6066w.f9466a.put(findViewById, cjVar);
                            if (intValue >= 0) {
                                this.f6066w.f9467b.put(intValue, cjVar);
                            }
                        }
                    }
                }
            }
            if (this.f6051h.size() > 0) {
                while (i < this.f6051h.size()) {
                    View view = (View) this.f6051h.get(i);
                    if (view != null) {
                        cj cjVar2 = new cj();
                        cjVar2.f9414b = view;
                        if (z) {
                            mo1165a(cjVar2);
                        } else {
                            mo1168b(cjVar2);
                        }
                        if (z) {
                            this.f6046c.f9466a.put(view, cjVar2);
                        } else {
                            this.f6066w.f9466a.put(view, cjVar2);
                        }
                    }
                    i++;
                }
                return;
            }
            return;
        }
        m8228a((View) viewGroup, z);
    }

    /* renamed from: a */
    void m8241a(boolean z) {
        if (z) {
            this.f6046c.f9466a.clear();
            this.f6046c.f9467b.clear();
            this.f6046c.f9468c.c();
            return;
        }
        this.f6066w.f9466a.clear();
        this.f6066w.f9467b.clear();
        this.f6066w.f9468c.c();
    }

    /* renamed from: a */
    private void m8228a(View view, boolean z) {
        if (view != null) {
            Object obj;
            if (view.getParent() instanceof ListView) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null || ((ListView) view.getParent()).getAdapter().hasStableIds()) {
                int id;
                long j;
                if (obj == null) {
                    id = view.getId();
                    j = -1;
                } else {
                    ListView listView = (ListView) view.getParent();
                    id = -1;
                    j = listView.getItemIdAtPosition(listView.getPositionForView(view));
                }
                if (this.f6052i != null && this.f6052i.contains(Integer.valueOf(id))) {
                    return;
                }
                if (this.f6053j == null || !this.f6053j.contains(view)) {
                    if (!(this.f6054k == null || view == null)) {
                        int size = this.f6054k.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f6054k.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    cj cjVar = new cj();
                    cjVar.f9414b = view;
                    if (z) {
                        mo1165a(cjVar);
                    } else {
                        mo1168b(cjVar);
                    }
                    if (z) {
                        if (obj == null) {
                            this.f6046c.f9466a.put(view, cjVar);
                            if (id >= 0) {
                                this.f6046c.f9467b.put(id, cjVar);
                            }
                        } else {
                            this.f6046c.f9468c.b(j, cjVar);
                        }
                    } else if (obj == null) {
                        this.f6066w.f9466a.put(view, cjVar);
                        if (id >= 0) {
                            this.f6066w.f9467b.put(id, cjVar);
                        }
                    } else {
                        this.f6066w.f9468c.b(j, cjVar);
                    }
                    if (!(view instanceof ViewGroup)) {
                        return;
                    }
                    if (this.f6055l != null && this.f6055l.contains(Integer.valueOf(id))) {
                        return;
                    }
                    if (this.f6056m == null || !this.f6056m.contains(view)) {
                        if (!(this.f6057n == null || view == null)) {
                            int size2 = this.f6057n.size();
                            id = 0;
                            while (id < size2) {
                                if (!((Class) this.f6057n.get(id)).isInstance(view)) {
                                    id++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            m8228a(viewGroup.getChildAt(i2), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1163a(View view) {
        if (!this.f6067x) {
            hh j = cd.mo1172j();
            int size = j.size();
            ct a = ct.a(view);
            for (int i = size - 1; i >= 0; i--) {
                C1683a c1683a = (C1683a) j.c(i);
                if (c1683a.f8763a != null && a.equals(c1683a.f8766d)) {
                    ((Animator) j.b(i)).cancel();
                }
            }
            if (this.f6063t != null && this.f6063t.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f6063t.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1257b) arrayList.get(i2)).mo1255b(this);
                }
            }
            this.f6062s = true;
        }
    }

    /* renamed from: b */
    public void mo1167b(View view) {
        if (this.f6062s) {
            if (!this.f6067x) {
                hh j = cd.mo1172j();
                int size = j.size();
                ct a = ct.a(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1683a c1683a = (C1683a) j.c(i);
                    if (c1683a.f8763a != null && a.equals(c1683a.f8766d)) {
                        ((Animator) j.b(i)).end();
                    }
                }
                if (this.f6063t != null && this.f6063t.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f6063t.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1257b) arrayList.get(i2)).mo1256c(this);
                    }
                }
            }
            this.f6062s = false;
        }
    }

    /* renamed from: a */
    void m8237a(ViewGroup viewGroup) {
        hh j = cd.mo1172j();
        for (int size = j.size() - 1; size >= 0; size--) {
            Animator animator = (Animator) j.b(size);
            if (animator != null) {
                C1683a c1683a = (C1683a) j.get(animator);
                if (!(c1683a == null || c1683a.f8763a == null || c1683a.f8763a.getContext() != viewGroup.getContext())) {
                    cj cjVar;
                    Object obj;
                    cj cjVar2 = c1683a.f8765c;
                    View view = c1683a.f8763a;
                    cj cjVar3 = this.f6066w.f9466a != null ? (cj) this.f6066w.f9466a.get(view) : null;
                    if (cjVar3 == null) {
                        cjVar = (cj) this.f6066w.f9467b.get(view.getId());
                    } else {
                        cjVar = cjVar3;
                    }
                    if (!(cjVar2 == null || cjVar == null)) {
                        for (String str : cjVar2.f9413a.keySet()) {
                            Object obj2 = cjVar2.f9413a.get(str);
                            obj = cjVar.f9413a.get(str);
                            if (obj2 != null && obj != null && !obj2.equals(obj)) {
                                obj = 1;
                                break;
                            }
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            j.remove(animator);
                        }
                    }
                }
            }
        }
        mo1164a(viewGroup, this.f6046c, this.f6066w);
        mo1170e();
    }

    /* renamed from: a */
    protected void m8235a(Animator animator) {
        if (animator == null) {
            m8252g();
            return;
        }
        if (m8244b() >= 0) {
            animator.setDuration(m8244b());
        }
        if (m8248c() >= 0) {
            animator.setStartDelay(m8248c());
        }
        if (m8249d() != null) {
            animator.setInterpolator(m8249d());
        }
        animator.addListener(new C16822(this));
        animator.start();
    }

    /* renamed from: f */
    protected void m8251f() {
        if (this.f6061r == 0) {
            if (this.f6063t != null && this.f6063t.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f6063t.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C1257b) arrayList.get(i)).mo1257d(this);
                }
            }
            this.f6067x = false;
        }
        this.f6061r++;
    }

    /* renamed from: g */
    protected void m8252g() {
        int i = 0;
        this.f6061r--;
        if (this.f6061r == 0) {
            View view;
            if (this.f6063t != null && this.f6063t.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f6063t.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1257b) arrayList.get(i2)).mo1254a(this);
                }
            }
            for (int i3 = 0; i3 < this.f6046c.f9468c.b(); i3++) {
                view = ((cj) this.f6046c.f9468c.c(i3)).f9414b;
            }
            while (i < this.f6066w.f9468c.b()) {
                view = ((cj) this.f6066w.f9468c.c(i)).f9414b;
                i++;
            }
            this.f6067x = true;
        }
    }

    /* renamed from: a */
    public cd mo1161a(C1257b c1257b) {
        if (this.f6063t == null) {
            this.f6063t = new ArrayList();
        }
        this.f6063t.add(c1257b);
        return this;
    }

    /* renamed from: b */
    public cd mo1166b(C1257b c1257b) {
        if (this.f6063t != null) {
            this.f6063t.remove(c1257b);
            if (this.f6063t.size() == 0) {
                this.f6063t = null;
            }
        }
        return this;
    }

    public String toString() {
        return mo1162a("");
    }

    /* renamed from: h */
    public cd mo1171h() {
        try {
            cd cdVar = (cd) super.clone();
            try {
                cdVar.f6064u = new ArrayList();
                cdVar.f6046c = new ck();
                cdVar.f6066w = new ck();
                return cdVar;
            } catch (CloneNotSupportedException e) {
                return cdVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: i */
    public String m8254i() {
        return this.f6045b;
    }

    /* renamed from: a */
    String mo1162a(String str) {
        int i = 0;
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6048e != -1) {
            str2 = str2 + "dur(" + this.f6048e + ") ";
        }
        if (this.f6047d != -1) {
            str2 = str2 + "dly(" + this.f6047d + ") ";
        }
        if (this.f6049f != null) {
            str2 = str2 + "interp(" + this.f6049f + ") ";
        }
        if (this.f6050g.size() <= 0 && this.f6051h.size() <= 0) {
            return str2;
        }
        String str3;
        str2 = str2 + "tgts(";
        if (this.f6050g.size() > 0) {
            str3 = str2;
            for (int i2 = 0; i2 < this.f6050g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6050g.get(i2);
            }
        } else {
            str3 = str2;
        }
        if (this.f6051h.size() > 0) {
            while (i < this.f6051h.size()) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6051h.get(i);
                i++;
            }
        }
        return str3 + ")";
    }
}
