package com.p000;

/* renamed from: dpn */
public class dpn extends dph {
    /* renamed from: a */
    private static final rk f22528a = dnn.m28258a(dpn.class);

    public dpn(dpj dpj) {
        super((short) 515);
        if (f22528a.mo4276b()) {
            f22528a.mo4275b((Object) "PDXQueryParameter()");
        }
        m28201a("name", dpj.m28619b(), (short) 193);
        if (dpj.m28620c() == Byte.MAX_VALUE) {
            m28197a("type", 5);
        } else {
            m28197a("type", (int) dpj.m28620c());
        }
        switch (dpj.m28620c()) {
            case (byte) 1:
                m28197a("buffer_id", ((dpe) dpj).m28621a());
                return;
            case (byte) 2:
                m28201a("text", ((dps) dpj).m28644a(), (short) 193);
                return;
            case (byte) 3:
                m28201a("text", null, (short) 193);
                return;
            case (byte) 4:
                m28203a("data", null, (short) 193);
                return;
            case (byte) 5:
                m28203a("dict", ((dpf) dpj).m28624a(), (short) 224);
                return;
            case (byte) 6:
            case (byte) 7:
            case (byte) 8:
                m28203a("dict", ((dpq) dpj).m28640a(), (short) 224);
                return;
            case Byte.MAX_VALUE:
                m28203a("dict", ((dpr) dpj).m28642d(), (short) 224);
                return;
            default:
                f22528a.mo4281e("PDXQueryParameter() Unknown parameter type: " + dpj.m28620c() + ". ");
                return;
        }
    }
}
