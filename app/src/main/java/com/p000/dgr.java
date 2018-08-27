package com.p000;

import android.content.Context;
import android.util.Log;
import com.under9.android.lib.network.model.ApiDomainObject;
import java.util.ArrayList;

/* compiled from: DomainDiagnosisModule */
/* renamed from: dgr */
public class dgr {
    /* renamed from: a */
    private static final dgr f21579a = new dgr();
    /* renamed from: b */
    private Context f21580b;
    /* renamed from: c */
    private dgp f21581c;
    /* renamed from: d */
    private hh<String, ApiDomainObject> f21582d;
    /* renamed from: e */
    private boolean f21583e;

    /* renamed from: a */
    public void m27229a(Context context, dgp dgp) {
        this.f21580b = context;
        this.f21581c = dgp;
        this.f21583e = dgp.m27219a();
    }

    /* renamed from: a */
    public static dgr m27228a() {
        return f21579a;
    }

    /* renamed from: b */
    public void m27230b() {
        try {
            this.f21582d = dgv.m27247b(dgv.m27246a(this.f21581c.m27220b()));
            if (this.f21583e) {
                Log.d("DomainDiagnosisModule", "fetchConfigFromServer: " + this.f21582d);
            }
        } catch (Throwable e) {
            if (this.f21583e) {
                Log.e("DomainDiagnosisModule", "fetchConfigFromServer: ", e);
            }
        }
    }

    /* renamed from: c */
    public ArrayList<String> m27231c() {
        if (this.f21582d == null) {
            m27230b();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21582d.keySet()) {
            if (((ApiDomainObject) this.f21582d.get(str)).traceroute) {
                arrayList.add(str);
            }
        }
        return new dgt(arrayList, this.f21580b).m27234a();
    }
}
