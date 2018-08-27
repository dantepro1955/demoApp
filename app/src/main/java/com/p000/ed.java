package com.p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.ee.C5278a;
import p000.ef.C5279a;
import p000.eg.C5280a;
import p000.eh.C5259a;
import p000.eh.C5259a.C5257a;
import p000.ej.C5281a;
import p000.ek.C5282a;
import p000.el.C5283a;
import p000.eq.C5301a;

/* compiled from: NotificationCompat */
/* renamed from: ed */
public class ed {
    /* renamed from: a */
    static final C5269h f23588a;

    /* compiled from: NotificationCompat */
    /* renamed from: ed$a */
    public static class C5260a extends C5259a {
        /* renamed from: e */
        public static final C5257a f23531e = new C52581();
        /* renamed from: a */
        final Bundle f23532a;
        /* renamed from: b */
        public int f23533b;
        /* renamed from: c */
        public CharSequence f23534c;
        /* renamed from: d */
        public PendingIntent f23535d;
        /* renamed from: f */
        private final eo[] f23536f;
        /* renamed from: g */
        private boolean f23537g;

        /* compiled from: NotificationCompat */
        /* renamed from: ed$a$1 */
        static class C52581 implements C5257a {
            C52581() {
            }
        }

        /* renamed from: g */
        public /* synthetic */ C5301a[] mo4688g() {
            return m29942f();
        }

        public C5260a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, true);
        }

        C5260a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, eo[] eoVarArr, boolean z) {
            this.f23533b = i;
            this.f23534c = C5264d.m29951d(charSequence);
            this.f23535d = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f23532a = bundle;
            this.f23536f = eoVarArr;
            this.f23537g = z;
        }

        /* renamed from: a */
        public int mo4683a() {
            return this.f23533b;
        }

        /* renamed from: b */
        public CharSequence mo4684b() {
            return this.f23534c;
        }

        /* renamed from: c */
        public PendingIntent mo4685c() {
            return this.f23535d;
        }

        /* renamed from: d */
        public Bundle mo4686d() {
            return this.f23532a;
        }

        /* renamed from: e */
        public boolean mo4687e() {
            return this.f23537g;
        }

        /* renamed from: f */
        public eo[] m29942f() {
            return this.f23536f;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$q */
    public static abstract class C5261q {
        /* renamed from: d */
        C5264d f23538d;
        /* renamed from: e */
        CharSequence f23539e;
        /* renamed from: f */
        CharSequence f23540f;
        /* renamed from: g */
        boolean f23541g = false;

        /* renamed from: a */
        public void m29945a(C5264d c5264d) {
            if (this.f23538d != c5264d) {
                this.f23538d = c5264d;
                if (this.f23538d != null) {
                    this.f23538d.m29961a(this);
                }
            }
        }

        /* renamed from: a */
        public void mo4689a(Bundle bundle) {
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$b */
    public static class C5262b extends C5261q {
        /* renamed from: a */
        Bitmap f23542a;
        /* renamed from: b */
        Bitmap f23543b;
        /* renamed from: c */
        boolean f23544c;

        /* renamed from: a */
        public C5262b m29947a(CharSequence charSequence) {
            this.f = C5264d.m29951d(charSequence);
            this.g = true;
            return this;
        }

        /* renamed from: a */
        public C5262b m29946a(Bitmap bitmap) {
            this.f23542a = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$c */
    public static class C5263c extends C5261q {
        /* renamed from: a */
        CharSequence f23545a;

        /* renamed from: a */
        public C5263c m29948a(CharSequence charSequence) {
            this.e = C5264d.m29951d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C5263c m29949b(CharSequence charSequence) {
            this.f23545a = C5264d.m29951d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$d */
    public static class C5264d {
        /* renamed from: A */
        int f23546A = 0;
        /* renamed from: B */
        Notification f23547B;
        /* renamed from: C */
        RemoteViews f23548C;
        /* renamed from: D */
        RemoteViews f23549D;
        /* renamed from: E */
        RemoteViews f23550E;
        /* renamed from: F */
        public Notification f23551F = new Notification();
        /* renamed from: G */
        public ArrayList<String> f23552G;
        /* renamed from: a */
        public Context f23553a;
        /* renamed from: b */
        public CharSequence f23554b;
        /* renamed from: c */
        public CharSequence f23555c;
        /* renamed from: d */
        PendingIntent f23556d;
        /* renamed from: e */
        PendingIntent f23557e;
        /* renamed from: f */
        RemoteViews f23558f;
        /* renamed from: g */
        public Bitmap f23559g;
        /* renamed from: h */
        public CharSequence f23560h;
        /* renamed from: i */
        public int f23561i;
        /* renamed from: j */
        int f23562j;
        /* renamed from: k */
        boolean f23563k = true;
        /* renamed from: l */
        public boolean f23564l;
        /* renamed from: m */
        public C5261q f23565m;
        /* renamed from: n */
        public CharSequence f23566n;
        /* renamed from: o */
        public CharSequence[] f23567o;
        /* renamed from: p */
        int f23568p;
        /* renamed from: q */
        int f23569q;
        /* renamed from: r */
        boolean f23570r;
        /* renamed from: s */
        String f23571s;
        /* renamed from: t */
        boolean f23572t;
        /* renamed from: u */
        String f23573u;
        /* renamed from: v */
        public ArrayList<C5260a> f23574v = new ArrayList();
        /* renamed from: w */
        boolean f23575w = false;
        /* renamed from: x */
        String f23576x;
        /* renamed from: y */
        Bundle f23577y;
        /* renamed from: z */
        int f23578z = 0;

        public C5264d(Context context) {
            this.f23553a = context;
            this.f23551F.when = System.currentTimeMillis();
            this.f23551F.audioStreamType = -1;
            this.f23562j = 0;
            this.f23552G = new ArrayList();
        }

        /* renamed from: a */
        public C5264d m29957a(long j) {
            this.f23551F.when = j;
            return this;
        }

        /* renamed from: a */
        public C5264d m29953a(int i) {
            this.f23551F.icon = i;
            return this;
        }

        /* renamed from: a */
        public C5264d m29962a(CharSequence charSequence) {
            this.f23554b = C5264d.m29951d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C5264d m29967b(CharSequence charSequence) {
            this.f23555c = C5264d.m29951d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C5264d m29965b(int i) {
            this.f23561i = i;
            return this;
        }

        /* renamed from: a */
        public C5264d m29955a(int i, int i2, boolean z) {
            this.f23568p = i;
            this.f23569q = i2;
            this.f23570r = z;
            return this;
        }

        /* renamed from: a */
        public C5264d m29958a(PendingIntent pendingIntent) {
            this.f23556d = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C5264d m29966b(PendingIntent pendingIntent) {
            this.f23551F.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C5264d m29971c(CharSequence charSequence) {
            this.f23551F.tickerText = C5264d.m29951d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C5264d m29959a(Bitmap bitmap) {
            this.f23559g = bitmap;
            return this;
        }

        /* renamed from: a */
        public C5264d m29960a(Uri uri) {
            this.f23551F.sound = uri;
            this.f23551F.audioStreamType = -1;
            return this;
        }

        /* renamed from: a */
        public C5264d m29954a(int i, int i2, int i3) {
            int i4;
            int i5 = 1;
            this.f23551F.ledARGB = i;
            this.f23551F.ledOnMS = i2;
            this.f23551F.ledOffMS = i3;
            if (this.f23551F.ledOnMS == 0 || this.f23551F.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            Notification notification = this.f23551F;
            int i6 = this.f23551F.flags & -2;
            if (i4 == 0) {
                i5 = 0;
            }
            notification.flags = i6 | i5;
            return this;
        }

        /* renamed from: a */
        public C5264d m29964a(boolean z) {
            m29950a(8, z);
            return this;
        }

        /* renamed from: b */
        public C5264d m29968b(boolean z) {
            m29950a(16, z);
            return this;
        }

        /* renamed from: c */
        public C5264d m29972c(boolean z) {
            this.f23575w = z;
            return this;
        }

        /* renamed from: c */
        public C5264d m29970c(int i) {
            this.f23551F.defaults = i;
            if ((i & 4) != 0) {
                Notification notification = this.f23551F;
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        private void m29950a(int i, boolean z) {
            if (z) {
                Notification notification = this.f23551F;
                notification.flags |= i;
                return;
            }
            notification = this.f23551F;
            notification.flags &= i ^ -1;
        }

        /* renamed from: d */
        public C5264d m29974d(int i) {
            this.f23562j = i;
            return this;
        }

        /* renamed from: a */
        public C5264d m29963a(String str) {
            this.f23571s = str;
            return this;
        }

        /* renamed from: d */
        public C5264d m29975d(boolean z) {
            this.f23572t = z;
            return this;
        }

        /* renamed from: a */
        public C5264d m29956a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f23574v.add(new C5260a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C5264d m29961a(C5261q c5261q) {
            if (this.f23565m != c5261q) {
                this.f23565m = c5261q;
                if (this.f23565m != null) {
                    this.f23565m.m29945a(this);
                }
            }
            return this;
        }

        /* renamed from: e */
        public C5264d m29977e(int i) {
            this.f23578z = i;
            return this;
        }

        /* renamed from: f */
        public C5264d m29978f(int i) {
            this.f23546A = i;
            return this;
        }

        /* renamed from: a */
        public Notification m29952a() {
            return ed.f23588a.mo4690a(this, m29969b());
        }

        /* renamed from: b */
        protected C5265e m29969b() {
            return new C5265e();
        }

        /* renamed from: d */
        protected static CharSequence m29951d(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: c */
        protected CharSequence m29973c() {
            return this.f23555c;
        }

        /* renamed from: d */
        protected CharSequence m29976d() {
            return this.f23554b;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$e */
    public static class C5265e {
        protected C5265e() {
        }

        /* renamed from: a */
        public Notification m29979a(C5264d c5264d, ec ecVar) {
            Notification b = ecVar.mo4694b();
            if (c5264d.f23548C != null) {
                b.contentView = c5264d.f23548C;
            }
            return b;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$f */
    public static class C5266f extends C5261q {
        /* renamed from: a */
        ArrayList<CharSequence> f23579a = new ArrayList();

        /* renamed from: a */
        public C5266f m29980a(CharSequence charSequence) {
            this.e = C5264d.m29951d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C5266f m29981b(CharSequence charSequence) {
            this.f23579a.add(C5264d.m29951d(charSequence));
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$g */
    public static class C5268g extends C5261q {
        /* renamed from: a */
        CharSequence f23585a;
        /* renamed from: b */
        CharSequence f23586b;
        /* renamed from: c */
        List<C5267a> f23587c = new ArrayList();

        /* compiled from: NotificationCompat */
        /* renamed from: ed$g$a */
        public static final class C5267a {
            /* renamed from: a */
            private final CharSequence f23580a;
            /* renamed from: b */
            private final long f23581b;
            /* renamed from: c */
            private final CharSequence f23582c;
            /* renamed from: d */
            private String f23583d;
            /* renamed from: e */
            private Uri f23584e;

            /* renamed from: a */
            public CharSequence m29984a() {
                return this.f23580a;
            }

            /* renamed from: b */
            public long m29985b() {
                return this.f23581b;
            }

            /* renamed from: c */
            public CharSequence m29986c() {
                return this.f23582c;
            }

            /* renamed from: d */
            public String m29987d() {
                return this.f23583d;
            }

            /* renamed from: e */
            public Uri m29988e() {
                return this.f23584e;
            }

            /* renamed from: f */
            private Bundle m29983f() {
                Bundle bundle = new Bundle();
                if (this.f23580a != null) {
                    bundle.putCharSequence("text", this.f23580a);
                }
                bundle.putLong("time", this.f23581b);
                if (this.f23582c != null) {
                    bundle.putCharSequence("sender", this.f23582c);
                }
                if (this.f23583d != null) {
                    bundle.putString("type", this.f23583d);
                }
                if (this.f23584e != null) {
                    bundle.putParcelable(ShareConstants.MEDIA_URI, this.f23584e);
                }
                return bundle;
            }

            /* renamed from: a */
            static Bundle[] m29982a(List<C5267a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((C5267a) list.get(i)).m29983f();
                }
                return bundleArr;
            }
        }

        C5268g() {
        }

        /* renamed from: a */
        public void mo4689a(Bundle bundle) {
            super.mo4689a(bundle);
            if (this.f23585a != null) {
                bundle.putCharSequence("android.selfDisplayName", this.f23585a);
            }
            if (this.f23586b != null) {
                bundle.putCharSequence("android.conversationTitle", this.f23586b);
            }
            if (!this.f23587c.isEmpty()) {
                bundle.putParcelableArray("android.messages", C5267a.m29982a(this.f23587c));
            }
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$h */
    interface C5269h {
        /* renamed from: a */
        Notification mo4690a(C5264d c5264d, C5265e c5265e);

        /* renamed from: a */
        Bundle mo4691a(Notification notification);
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$l */
    static class C5270l implements C5269h {
        C5270l() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            Notification a = eh.m30018a(c5264d.f23551F, c5264d.f23553a, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23556d, c5264d.f23557e);
            if (c5264d.f23562j > 0) {
                a.flags |= 128;
            }
            if (c5264d.f23548C != null) {
                a.contentView = c5264d.f23548C;
            }
            return a;
        }

        /* renamed from: a */
        public Bundle mo4691a(Notification notification) {
            return null;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$o */
    static class C5271o extends C5270l {
        C5271o() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            ec c5282a = new C5282a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r, c5264d.f23564l, c5264d.f23562j, c5264d.f23566n, c5264d.f23575w, c5264d.f23577y, c5264d.f23571s, c5264d.f23572t, c5264d.f23573u, c5264d.f23548C, c5264d.f23549D);
            ed.m30004a((eb) c5282a, c5264d.f23574v);
            ed.m30005a(c5282a, c5264d.f23565m);
            Notification a = c5265e.m29979a(c5264d, c5282a);
            if (c5264d.f23565m != null) {
                Bundle a2 = mo4691a(a);
                if (a2 != null) {
                    c5264d.f23565m.mo4689a(a2);
                }
            }
            return a;
        }

        /* renamed from: a */
        public Bundle mo4691a(Notification notification) {
            return ek.m30026a(notification);
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$p */
    static class C5272p extends C5271o {
        C5272p() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            ec c5283a = new C5283a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r, c5264d.f23563k, c5264d.f23564l, c5264d.f23562j, c5264d.f23566n, c5264d.f23575w, c5264d.f23552G, c5264d.f23577y, c5264d.f23571s, c5264d.f23572t, c5264d.f23573u, c5264d.f23548C, c5264d.f23549D);
            ed.m30004a((eb) c5283a, c5264d.f23574v);
            ed.m30005a(c5283a, c5264d.f23565m);
            return c5265e.m29979a(c5264d, c5283a);
        }

        /* renamed from: a */
        public Bundle mo4691a(Notification notification) {
            return el.m30034a(notification);
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$i */
    static class C5273i extends C5272p {
        C5273i() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            ec c5278a = new C5278a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r, c5264d.f23563k, c5264d.f23564l, c5264d.f23562j, c5264d.f23566n, c5264d.f23575w, c5264d.f23552G, c5264d.f23577y, c5264d.f23571s, c5264d.f23572t, c5264d.f23573u, c5264d.f23548C, c5264d.f23549D);
            ed.m30004a((eb) c5278a, c5264d.f23574v);
            ed.m30005a(c5278a, c5264d.f23565m);
            Notification a = c5265e.m29979a(c5264d, c5278a);
            if (c5264d.f23565m != null) {
                c5264d.f23565m.mo4689a(mo4691a(a));
            }
            return a;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$j */
    static class C5274j extends C5273i {
        C5274j() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            ec c5279a = new C5279a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r, c5264d.f23563k, c5264d.f23564l, c5264d.f23562j, c5264d.f23566n, c5264d.f23575w, c5264d.f23576x, c5264d.f23552G, c5264d.f23577y, c5264d.f23578z, c5264d.f23546A, c5264d.f23547B, c5264d.f23571s, c5264d.f23572t, c5264d.f23573u, c5264d.f23548C, c5264d.f23549D, c5264d.f23550E);
            ed.m30004a((eb) c5279a, c5264d.f23574v);
            ed.m30005a(c5279a, c5264d.f23565m);
            Notification a = c5265e.m29979a(c5264d, c5279a);
            if (c5264d.f23565m != null) {
                c5264d.f23565m.mo4689a(mo4691a(a));
            }
            return a;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$k */
    static class C5275k extends C5274j {
        C5275k() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            eb c5280a = new C5280a(c5264d.f23553a, c5264d.f23551F, c5264d.f23554b, c5264d.f23555c, c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r, c5264d.f23563k, c5264d.f23564l, c5264d.f23562j, c5264d.f23566n, c5264d.f23575w, c5264d.f23576x, c5264d.f23552G, c5264d.f23577y, c5264d.f23578z, c5264d.f23546A, c5264d.f23547B, c5264d.f23571s, c5264d.f23572t, c5264d.f23573u, c5264d.f23567o, c5264d.f23548C, c5264d.f23549D, c5264d.f23550E);
            ed.m30004a(c5280a, c5264d.f23574v);
            ed.m30006b(c5280a, c5264d.f23565m);
            Notification a = c5265e.m29979a(c5264d, c5280a);
            if (c5264d.f23565m != null) {
                c5264d.f23565m.mo4689a(mo4691a(a));
            }
            return a;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$m */
    static class C5276m extends C5270l {
        C5276m() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            Notification a = ei.m30019a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g);
            if (c5264d.f23548C != null) {
                a.contentView = c5264d.f23548C;
            }
            return a;
        }
    }

    /* compiled from: NotificationCompat */
    /* renamed from: ed$n */
    static class C5277n extends C5270l {
        C5277n() {
        }

        /* renamed from: a */
        public Notification mo4690a(C5264d c5264d, C5265e c5265e) {
            return c5265e.m29979a(c5264d, new C5281a(c5264d.f23553a, c5264d.f23551F, c5264d.m29976d(), c5264d.m29973c(), c5264d.f23560h, c5264d.f23558f, c5264d.f23561i, c5264d.f23556d, c5264d.f23557e, c5264d.f23559g, c5264d.f23568p, c5264d.f23569q, c5264d.f23570r));
        }
    }

    /* renamed from: a */
    static void m30004a(eb ebVar, ArrayList<C5260a> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ebVar.mo4693a((C5260a) it.next());
        }
    }

    /* renamed from: a */
    static void m30005a(ec ecVar, C5261q c5261q) {
        if (c5261q == null) {
            return;
        }
        if (c5261q instanceof C5263c) {
            C5263c c5263c = (C5263c) c5261q;
            ek.m30029a(ecVar, c5263c.e, c5263c.g, c5263c.f, c5263c.f23545a);
        } else if (c5261q instanceof C5266f) {
            C5266f c5266f = (C5266f) c5261q;
            ek.m30030a(ecVar, c5266f.e, c5266f.g, c5266f.f, c5266f.f23579a);
        } else if (c5261q instanceof C5262b) {
            C5262b c5262b = (C5262b) c5261q;
            ek.m30028a(ecVar, c5262b.e, c5262b.g, c5262b.f, c5262b.f23542a, c5262b.f23543b, c5262b.f23544c);
        }
    }

    /* renamed from: b */
    static void m30006b(ec ecVar, C5261q c5261q) {
        if (c5261q == null) {
            return;
        }
        if (c5261q instanceof C5268g) {
            C5268g c5268g = (C5268g) c5261q;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List arrayList4 = new ArrayList();
            List arrayList5 = new ArrayList();
            for (C5267a c5267a : c5268g.f23587c) {
                arrayList.add(c5267a.m29984a());
                arrayList2.add(Long.valueOf(c5267a.m29985b()));
                arrayList3.add(c5267a.m29986c());
                arrayList4.add(c5267a.m29987d());
                arrayList5.add(c5267a.m29988e());
            }
            eg.m30017a(ecVar, c5268g.f23585a, c5268g.f23586b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        ed.m30005a(ecVar, c5261q);
    }

    static {
        if (gr.m30483a()) {
            f23588a = new C5275k();
        } else if (VERSION.SDK_INT >= 21) {
            f23588a = new C5274j();
        } else if (VERSION.SDK_INT >= 20) {
            f23588a = new C5273i();
        } else if (VERSION.SDK_INT >= 19) {
            f23588a = new C5272p();
        } else if (VERSION.SDK_INT >= 16) {
            f23588a = new C5271o();
        } else if (VERSION.SDK_INT >= 14) {
            f23588a = new C5277n();
        } else if (VERSION.SDK_INT >= 11) {
            f23588a = new C5276m();
        } else {
            f23588a = new C5270l();
        }
    }

    /* renamed from: a */
    public static Bundle m30003a(Notification notification) {
        return f23588a.mo4691a(notification);
    }
}
