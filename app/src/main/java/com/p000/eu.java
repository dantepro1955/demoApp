package com.p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
/* renamed from: eu */
public final class eu implements Iterable<Intent> {
    /* renamed from: a */
    private static final eu$b f16856a;
    /* renamed from: b */
    private final ArrayList<Intent> f16857b = new ArrayList();
    /* renamed from: c */
    private final Context f16858c;

    static {
        if (VERSION.SDK_INT >= 11) {
            f16856a = new eu$d();
        } else {
            f16856a = new eu$c();
        }
    }

    private eu(Context context) {
        this.f16858c = context;
    }

    /* renamed from: a */
    public static eu m21130a(Context context) {
        return new eu(context);
    }

    /* renamed from: a */
    public eu m21133a(Intent intent) {
        this.f16857b.add(intent);
        return this;
    }

    /* renamed from: a */
    public eu m21131a(Activity activity) {
        Intent a;
        Intent intent = null;
        if (activity instanceof eu$a) {
            intent = ((eu$a) activity).getSupportParentActivityIntent();
        }
        if (intent == null) {
            a = dy.a(activity);
        } else {
            a = intent;
        }
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.f16858c.getPackageManager());
            }
            m21132a(component);
            m21133a(a);
        }
        return this;
    }

    /* renamed from: a */
    public eu m21132a(ComponentName componentName) {
        int size = this.f16857b.size();
        try {
            Intent a = dy.a(this.f16858c, componentName);
            while (a != null) {
                this.f16857b.add(size, a);
                a = dy.a(this.f16858c, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f16857b.iterator();
    }

    /* renamed from: a */
    public void m21134a() {
        m21135a(null);
    }

    /* renamed from: a */
    public void m21135a(Bundle bundle) {
        if (this.f16857b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f16857b.toArray(new Intent[this.f16857b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!ew.m21137a(this.f16858c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f16858c.startActivity(intent);
        }
    }
}
