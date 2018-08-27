package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzqh;
import java.util.concurrent.Future;
import p000.beb.C1084a;

@bhd
/* renamed from: bec */
public class bec {

    /* renamed from: bec$a */
    static class C1087a<JavascriptEngine> extends blb<JavascriptEngine> {
        /* renamed from: a */
        JavascriptEngine f5756a;

        private C1087a() {
        }
    }

    /* renamed from: a */
    private beb m7772a(Context context, zzqh zzqh, final C1087a<beb> c1087a, avc avc, ajx ajx) {
        beb bed = new bed(context, zzqh, avc, ajx);
        c1087a.f5756a = bed;
        bed.mo1021a(new C1084a(this) {
            /* renamed from: a */
            public void mo1016a() {
                c1087a.m7770b((Object) (beb) c1087a.f5756a);
            }
        });
        return bed;
    }

    /* renamed from: a */
    public Future<beb> m7774a(Context context, zzqh zzqh, String str, avc avc, ajx ajx) {
        final Future c1087a = new C1087a();
        final Context context2 = context;
        final zzqh zzqh2 = zzqh;
        final avc avc2 = avc;
        final ajx ajx2 = ajx;
        final String str2 = str;
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: g */
            final /* synthetic */ bec f5748g;

            public void run() {
                this.f5748g.m7772a(context2, zzqh2, c1087a, avc2, ajx2).mo1027b(str2);
            }
        });
        return c1087a;
    }
}
