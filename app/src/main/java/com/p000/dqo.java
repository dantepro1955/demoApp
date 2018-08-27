package com.p000;

/* renamed from: dqo */
public class dqo {
    /* renamed from: a */
    private static final rk f22616a = dnn.m28258a(dqo.class);

    private dqo() {
    }

    /* renamed from: a */
    public static dqn m28752a(byte[] bArr) throws IllegalArgumentException {
        if (f22616a.mo4276b()) {
            f22616a.mo4275b("DictationResultImpl(buffer [size: " + bArr.length + "] )");
            if (f22616a.mo4274a()) {
                f22616a.m25946a(bArr);
            }
        }
        String str;
        if (bArr == null || bArr.length < 4) {
            str = "Cannot parse dictation results: The buffer length is too small to be containing any results.";
            if (f22616a.mo4282e()) {
                f22616a.mo4281e(str);
            }
            throw new IllegalArgumentException(str);
        }
        try {
            dqu dqy;
            if (bArr.length > 20) {
                str = drd.m28806a(bArr, 0, 20, "ISO-8859-1");
                if (str.startsWith("<?xml") || (str.indexOf("<?") >= 0 && str.indexOf("xml") >= 0)) {
                    if (f22616a.mo4276b()) {
                        f22616a.mo4275b((Object) "Detected xml results. Using xml parser.");
                    }
                    dqy = new dqy(bArr);
                    return dqy.mo4554a();
                }
            }
            if (f22616a.mo4276b()) {
                f22616a.mo4275b((Object) "Detected binary results. Using binary parser.");
            }
            dqy = new dqv(bArr);
            return dqy.mo4554a();
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot parse dictation results: illegal format buffer.");
        }
    }
}
