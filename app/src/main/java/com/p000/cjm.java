package com.p000;

import android.os.AsyncTask;

/* compiled from: DomainMapperController */
/* renamed from: cjm */
public class cjm {
    /* renamed from: a */
    private caf f9427a = caf.m12046a();

    /* compiled from: DomainMapperController */
    /* renamed from: cjm$1 */
    class C17531 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ cjm f9426a;

        C17531(cjm cjm) {
            this.f9426a = cjm;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m14063a((Void[]) objArr);
        }

        /* renamed from: a */
        protected Void m14063a(Void... voidArr) {
            this.f9426a.f9427a.m12090t().b();
            return null;
        }
    }

    /* renamed from: a */
    public void m14065a() {
        new C17531(this).execute(new Void[0]);
    }
}
