package com.p000;

import java.util.List;

/* renamed from: czg */
final class czg implements cyq {
    /* renamed from: a */
    private String[] f20753a = null;
    /* renamed from: b */
    private int[] f20754b = null;
    /* renamed from: c */
    private String f20755c = null;
    /* renamed from: d */
    private List<czk> f20756d;

    /* renamed from: czg$1 */
    class C46891 implements rd<cyq> {
        /* renamed from: a */
        private /* synthetic */ czg f20752a;

        C46891(czg czg) {
            this.f20752a = czg;
        }

        /* renamed from: a */
        private boolean m25771a(dni dni) {
            String[] strArr;
            int[] iArr;
            String e;
            try {
                this.f20752a.f20756d = czl.m25827a(dni.mo4461d("transcription"));
                strArr = new String[this.f20752a.f20756d.size()];
                iArr = new int[this.f20752a.f20756d.size()];
                e = dni.mo4462e("prompt");
            } catch (Throwable th) {
                czl.m25829a(this, "Unable to extract transcriptions from result", th);
                this.f20752a.f20753a = new String[0];
                this.f20752a.f20754b = new int[0];
                this.f20752a.f20755c = null;
                return false;
            }
            for (int i = 0; i < this.f20752a.f20756d.size(); i++) {
                strArr[i] = ((czk) this.f20752a.f20756d.get(i)).toString();
                iArr[i] = (int) ((czk) this.f20752a.f20756d.get(i)).mo4257a();
            }
            this.f20752a.f20753a = strArr;
            this.f20752a.f20754b = iArr;
            this.f20752a.f20755c = e;
            return true;
        }

        /* renamed from: a */
        public final boolean mo4243a() {
            return false;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo4245b() {
            return this.f20752a;
        }
    }

    /* renamed from: a */
    public final List<czk> mo4248a() {
        return this.f20756d;
    }

    /* renamed from: b */
    final rd<cyq> m25781b() {
        return new C46891(this);
    }
}
