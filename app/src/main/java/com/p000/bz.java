package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.cd.C1258c;

@TargetApi(14)
/* compiled from: TransitionManagerPort */
/* renamed from: bz */
class bz {
    /* renamed from: a */
    static ArrayList<ViewGroup> f8259a = new ArrayList();
    /* renamed from: b */
    private static final String[] f8260b = new String[0];
    /* renamed from: c */
    private static String f8261c = "TransitionManager";
    /* renamed from: d */
    private static cd f8262d = new bg();
    /* renamed from: e */
    private static ThreadLocal<WeakReference<hh<ViewGroup, ArrayList<cd>>>> f8263e = new ThreadLocal();

    /* compiled from: TransitionManagerPort */
    /* renamed from: bz$a */
    static class C1614a implements OnAttachStateChangeListener, OnPreDrawListener {
        /* renamed from: a */
        cd f8257a;
        /* renamed from: b */
        ViewGroup f8258b;

        C1614a(cd cdVar, ViewGroup viewGroup) {
            this.f8257a = cdVar;
            this.f8258b = viewGroup;
        }

        /* renamed from: a */
        private void m11844a() {
            this.f8258b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8258b.removeOnAttachStateChangeListener(this);
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m11844a();
            bz.f8259a.remove(this.f8258b);
            ArrayList arrayList = (ArrayList) bz.m11845a().get(this.f8258b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((cd) it.next()).mo1167b(this.f8258b);
                }
            }
            this.f8257a.m8241a(true);
        }

        public boolean onPreDraw() {
            ArrayList arrayList;
            m11844a();
            bz.f8259a.remove(this.f8258b);
            final hh a = bz.m11845a();
            ArrayList arrayList2 = (ArrayList) a.get(this.f8258b);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                a.put(this.f8258b, arrayList2);
                arrayList = arrayList2;
                arrayList2 = null;
            } else if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList = arrayList2;
                arrayList2 = arrayList3;
            } else {
                arrayList = arrayList2;
                arrayList2 = null;
            }
            arrayList.add(this.f8257a);
            this.f8257a.mo1161a(new C1258c(this) {
                /* renamed from: b */
                final /* synthetic */ C1614a f8256b;

                /* renamed from: a */
                public void mo1254a(cd cdVar) {
                    ((ArrayList) a.get(this.f8256b.f8258b)).remove(cdVar);
                }
            });
            this.f8257a.m8239a(this.f8258b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((cd) it.next()).mo1167b(this.f8258b);
                }
            }
            this.f8257a.m8237a(this.f8258b);
            return true;
        }
    }

    /* renamed from: a */
    static hh<ViewGroup, ArrayList<cd>> m11845a() {
        WeakReference weakReference = (WeakReference) f8263e.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference(new hh());
            f8263e.set(weakReference);
        }
        return (hh) weakReference.get();
    }

    /* renamed from: b */
    private static void m11847b(ViewGroup viewGroup, cd cdVar) {
        if (cdVar != null && viewGroup != null) {
            Object c1614a = new C1614a(cdVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(c1614a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(c1614a);
        }
    }

    /* renamed from: c */
    private static void m11848c(ViewGroup viewGroup, cd cdVar) {
        ArrayList arrayList = (ArrayList) bz.m11845a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cd) it.next()).mo1163a((View) viewGroup);
            }
        }
        if (cdVar != null) {
            cdVar.m8239a(viewGroup, true);
        }
        br a = br.m10485a(viewGroup);
        if (a != null) {
            a.m10487a();
        }
    }

    /* renamed from: a */
    public static void m11846a(ViewGroup viewGroup, cd cdVar) {
        if (!f8259a.contains(viewGroup) && jd.m21196H(viewGroup)) {
            f8259a.add(viewGroup);
            if (cdVar == null) {
                cdVar = f8262d;
            }
            cd h = cdVar.mo1171h();
            bz.m11848c(viewGroup, h);
            br.m10486a(viewGroup, null);
            bz.m11847b(viewGroup, h);
        }
    }
}
