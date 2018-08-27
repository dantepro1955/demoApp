package com.p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: asi */
public final class asi extends Fragment implements ash {
    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<asi>> f4244a = new WeakHashMap();
    /* renamed from: b */
    private Map<String, asg> f4245b = new hh();
    /* renamed from: c */
    private int f4246c = 0;
    /* renamed from: d */
    private Bundle f4247d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000.asi m5472a(Activity r3) {
        /*
        r0 = f4244a;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.get();
        r0 = (p000.asi) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.getFragmentManager();	 Catch:{ ClassCastException -> 0x0048 }
        r1 = "LifecycleFragmentImpl";
        r0 = r0.findFragmentByTag(r1);	 Catch:{ ClassCastException -> 0x0048 }
        r0 = (p000.asi) r0;	 Catch:{ ClassCastException -> 0x0048 }
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r0.isRemoving();
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r0 = new asi;
        r0.<init>();
        r1 = r3.getFragmentManager();
        r1 = r1.beginTransaction();
        r2 = "LifecycleFragmentImpl";
        r1 = r1.add(r0, r2);
        r1.commitAllowingStateLoss();
    L_0x003d:
        r1 = f4244a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
        goto L_0x0012;
    L_0x0048:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: asi.a(android.app.Activity):asi");
    }

    /* renamed from: b */
    private void m5474b(final String str, final asg asg) {
        if (this.f4246c > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ asi f4243c;

                public void run() {
                    if (this.f4243c.f4246c >= 1) {
                        asg.mo623a(this.f4243c.f4247d != null ? this.f4243c.f4247d.getBundle(str) : null);
                    }
                    if (this.f4243c.f4246c >= 2) {
                        asg.mo621a();
                    }
                    if (this.f4243c.f4246c >= 3) {
                        asg.mo624b();
                    }
                    if (this.f4243c.f4246c >= 4) {
                        asg.m5083g();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public Activity mo705a() {
        return getActivity();
    }

    /* renamed from: a */
    public <T extends asg> T mo706a(String str, Class<T> cls) {
        return (asg) cls.cast(this.f4245b.get(str));
    }

    /* renamed from: a */
    public void mo707a(String str, asg asg) {
        if (this.f4245b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f4245b.put(str, asg);
        m5474b(str, asg);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (asg a : this.f4245b.values()) {
            a.mo627a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (asg a : this.f4245b.values()) {
            a.mo622a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4246c = 1;
        this.f4247d = bundle;
        for (Entry entry : this.f4245b.entrySet()) {
            ((asg) entry.getValue()).mo623a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4246c = 4;
        for (asg g : this.f4245b.values()) {
            g.m5083g();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f4245b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((asg) entry.getValue()).mo625b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.f4246c = 2;
        for (asg a : this.f4245b.values()) {
            a.mo621a();
        }
    }

    public void onStop() {
        super.onStop();
        this.f4246c = 3;
        for (asg b : this.f4245b.values()) {
            b.mo624b();
        }
    }
}
