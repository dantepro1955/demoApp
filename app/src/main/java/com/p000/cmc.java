package com.p000;

import android.os.AsyncTask;
import com.ninegag.android.app.otto.RemoteConfigAppLinksImmediateEffectiveChangedEvent;
import com.ninegag.android.app.otto.RemoteConfigImmediateEffectiveChangedEvent;
import com.ninegag.android.app.otto.updatebanner.DisplayBroadcastEvent;

/* compiled from: RemoteConfigController */
/* renamed from: cmc */
public class cmc {
    /* renamed from: a */
    private caf f9722a = caf.m12046a();

    /* renamed from: a */
    public void m14449a(final boolean z) {
        new AsyncTask<Object, Object, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ cmc f9715b;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m14441a(objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m14442a((Boolean) obj);
            }

            /* renamed from: a */
            protected Boolean m14441a(Object... objArr) {
                return Boolean.valueOf(this.f9715b.f9722a.m12086p().a(z));
            }

            /* renamed from: a */
            protected void m14442a(Boolean bool) {
                if (bool.booleanValue()) {
                    this.f9715b.f9722a.m12054a(new RemoteConfigImmediateEffectiveChangedEvent());
                }
            }
        }.execute(new Object[0]);
    }

    /* renamed from: b */
    public void m14450b(final boolean z) {
        new AsyncTask<Object, Object, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ cmc f9717b;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m14443a(objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m14444a((Boolean) obj);
            }

            /* renamed from: a */
            protected Boolean m14443a(Object... objArr) {
                this.f9717b.f9722a.m12088r().d(z);
                return Boolean.valueOf(this.f9717b.f9722a.m12086p().d(z));
            }

            /* renamed from: a */
            protected void m14444a(Boolean bool) {
                if (bool.booleanValue()) {
                    this.f9717b.f9722a.m12054a(new RemoteConfigAppLinksImmediateEffectiveChangedEvent());
                }
            }
        }.execute(new Object[0]);
    }

    /* renamed from: c */
    public void m14451c(final boolean z) {
        new AsyncTask<Object, Object, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ cmc f9719b;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m14445a(objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m14446a((Boolean) obj);
            }

            /* renamed from: a */
            protected Boolean m14445a(Object... objArr) {
                return Boolean.valueOf(this.f9719b.f9722a.m12086p().c(z));
            }

            /* renamed from: a */
            protected void m14446a(Boolean bool) {
                dhe.c(new DisplayBroadcastEvent());
            }
        }.execute(new Object[0]);
    }

    /* renamed from: d */
    public void m14452d(final boolean z) {
        new AsyncTask<Object, Object, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ cmc f9721b;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m14447a(objArr);
            }

            /* renamed from: a */
            protected Boolean m14447a(Object... objArr) {
                return Boolean.valueOf(this.f9721b.f9722a.m12086p().b(z));
            }
        }.execute(new Object[0]);
    }
}
