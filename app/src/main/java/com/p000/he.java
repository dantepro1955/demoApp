package com.p000;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat */
/* renamed from: he */
public final class he {
    /* renamed from: a */
    public static final hd f23762a = new C5358e(null, false);
    /* renamed from: b */
    public static final hd f23763b = new C5358e(null, true);
    /* renamed from: c */
    public static final hd f23764c = new C5358e(C5356b.f23758a, false);
    /* renamed from: d */
    public static final hd f23765d = new C5358e(C5356b.f23758a, true);
    /* renamed from: e */
    public static final hd f23766e = new C5358e(C5355a.f23755a, false);
    /* renamed from: f */
    public static final hd f23767f = C5359f.f23761a;

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$c */
    interface C5354c {
        /* renamed from: a */
        int mo4806a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$a */
    static class C5355a implements C5354c {
        /* renamed from: a */
        public static final C5355a f23755a = new C5355a(true);
        /* renamed from: b */
        public static final C5355a f23756b = new C5355a(false);
        /* renamed from: c */
        private final boolean f23757c;

        /* renamed from: a */
        public int mo4806a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 0;
            while (i < i3) {
                switch (he.m30513a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (!this.f23757c) {
                            i4 = 1;
                            break;
                        }
                        return 0;
                    case 1:
                        if (this.f23757c) {
                            i4 = 1;
                            break;
                        }
                        return 1;
                    default:
                        break;
                }
                i++;
            }
            if (i4 == 0) {
                return 2;
            }
            if (this.f23757c) {
                return 1;
            }
            return 0;
        }

        private C5355a(boolean z) {
            this.f23757c = z;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$b */
    static class C5356b implements C5354c {
        /* renamed from: a */
        public static final C5356b f23758a = new C5356b();

        /* renamed from: a */
        public int mo4806a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = he.m30514b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private C5356b() {
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$d */
    static abstract class C5357d implements hd {
        /* renamed from: a */
        private final C5354c f23759a;

        /* renamed from: a */
        protected abstract boolean mo4808a();

        public C5357d(C5354c c5354c) {
            this.f23759a = c5354c;
        }

        /* renamed from: a */
        public boolean mo4807a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f23759a == null) {
                return mo4808a();
            } else {
                return m30508b(charSequence, i, i2);
            }
        }

        /* renamed from: b */
        private boolean m30508b(CharSequence charSequence, int i, int i2) {
            switch (this.f23759a.mo4806a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return mo4808a();
            }
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$e */
    static class C5358e extends C5357d {
        /* renamed from: a */
        private final boolean f23760a;

        C5358e(C5354c c5354c, boolean z) {
            super(c5354c);
            this.f23760a = z;
        }

        /* renamed from: a */
        protected boolean mo4808a() {
            return this.f23760a;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    /* renamed from: he$f */
    static class C5359f extends C5357d {
        /* renamed from: a */
        public static final C5359f f23761a = new C5359f();

        public C5359f() {
            super(null);
        }

        /* renamed from: a */
        protected boolean mo4808a() {
            if (hf.m30518a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    static int m30513a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* renamed from: b */
    static int m30514b(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}
