package com.p000;

/* renamed from: dqy */
public class dqy implements dqu {
    /* renamed from: a */
    private static final rk f22649a = dnn.m28258a(dqy.class);
    /* renamed from: b */
    private byte[] f22650b;

    public dqy(byte[] bArr) {
        this.f22650b = bArr;
    }

    /* renamed from: a */
    public final dqn mo4554a() {
        f22649a.mo4275b((Object) "Unpacking XML dictation results.");
        try {
            dqx drb = new drb(this.f22650b);
            drb.m28792a();
            if (drb.m28793b()) {
                return drb.m28794c();
            }
            if (f22649a.mo4276b()) {
                f22649a.mo4275b("Could not parse XML dictation results: " + drb.m28795d() + ". Trying to parse NLSML results.");
            }
            dqx dqz = new dqz(this.f22650b);
            dqz.m28792a();
            if (dqz.m28793b()) {
                return dqz.m28794c();
            }
            String str = "Could not parse XML neither NLSML dictation results. Error from XML Parser: " + drb.m28795d() + ". Error from NLSML Parser: " + dqz.m28795d();
            if (f22649a.mo4282e()) {
                f22649a.mo4281e(str);
            }
            throw new IllegalArgumentException(str);
        } catch (Throwable e) {
            String str2 = "Received IOException while parsing XML/NLSML.";
            if (f22649a.mo4282e()) {
                f22649a.mo4273a(str2, e);
            }
            throw new IllegalArgumentException(str2, e);
        }
    }
}
