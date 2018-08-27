package com.p000;

/* renamed from: bsr */
public interface bsr {

    /* renamed from: bsr$a */
    public enum C1442a {
        EMBEDDING_DISABLED,
        BLOCKED_FOR_APP,
        NOT_PLAYABLE,
        NETWORK_ERROR,
        UNAUTHORIZED_OVERLAY,
        PLAYER_VIEW_TOO_SMALL,
        PLAYER_VIEW_NOT_VISIBLE,
        EMPTY_PLAYLIST,
        AUTOPLAY_DISABLED,
        USER_DECLINED_RESTRICTED_CONTENT,
        USER_DECLINED_HIGH_BANDWIDTH,
        UNEXPECTED_SERVICE_DISCONNECTION,
        INTERNAL_ERROR,
        UNKNOWN
    }

    /* renamed from: bsr$b */
    public interface C1443b {
        /* renamed from: a */
        void mo1736a(boolean z);
    }

    /* renamed from: bsr$c */
    public interface C1444c {
        /* renamed from: a */
        void mo1733a(C1448g c1448g, bsq bsq);

        /* renamed from: a */
        void mo1734a(C1448g c1448g, bsr bsr, boolean z);
    }

    /* renamed from: bsr$d */
    public interface C1445d {
        /* renamed from: a */
        void mo1730a();

        /* renamed from: a */
        void mo1731a(int i);

        /* renamed from: b */
        void mo1737b();

        /* renamed from: b */
        void mo1738b(boolean z);

        /* renamed from: c */
        void mo1739c();
    }

    /* renamed from: bsr$e */
    public interface C1446e {
        /* renamed from: a */
        void mo1732a(C1442a c1442a);

        /* renamed from: a */
        void mo1735a(String str);

        /* renamed from: d */
        void mo1740d();

        /* renamed from: e */
        void mo1741e();

        /* renamed from: f */
        void mo1742f();

        /* renamed from: g */
        void mo1743g();
    }

    /* renamed from: bsr$f */
    public enum C1447f {
        DEFAULT,
        MINIMAL,
        CHROMELESS
    }

    /* renamed from: bsr$g */
    public interface C1448g {
    }

    /* renamed from: a */
    void mo1516a();

    /* renamed from: a */
    void mo1517a(int i);

    /* renamed from: a */
    void mo1518a(C1443b c1443b);

    /* renamed from: a */
    void mo1519a(C1445d c1445d);

    /* renamed from: a */
    void mo1520a(C1446e c1446e);

    /* renamed from: a */
    void mo1521a(C1447f c1447f);

    /* renamed from: a */
    void mo1522a(String str);

    /* renamed from: a */
    void mo1523a(String str, int i);

    /* renamed from: a */
    void mo1524a(boolean z);

    /* renamed from: b */
    void mo1525b();

    /* renamed from: b */
    void mo1526b(String str);

    /* renamed from: b */
    void mo1527b(String str, int i);

    /* renamed from: b */
    void mo1528b(boolean z);

    /* renamed from: c */
    void mo1529c();

    /* renamed from: d */
    boolean mo1530d();

    /* renamed from: e */
    int mo1531e();

    /* renamed from: f */
    int mo1532f();
}
