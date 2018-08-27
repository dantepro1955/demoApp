package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.under9.android.comments.otto.AskForLoginEvent;
import com.under9.android.comments.otto.RefreshTokenEvent;

/* compiled from: CommentSystem */
/* renamed from: dct */
public class dct {
    /* renamed from: d */
    private static final dct f21147d = new dct();
    /* renamed from: a */
    public String f21148a = "com.under9.android.comments";
    /* renamed from: b */
    public String f21149b = (this.f21148a + ".API_CALLBACK");
    /* renamed from: c */
    public String f21150c = (this.f21148a + ".IMAGE_DOWNLOAD_CALLBACK");
    /* renamed from: e */
    private String f21151e;
    /* renamed from: f */
    private dcs f21152f;
    /* renamed from: g */
    private Context f21153g;
    /* renamed from: h */
    private boolean f21154h = false;
    /* renamed from: i */
    private boolean f21155i = false;

    /* compiled from: CommentSystem */
    /* renamed from: dct$a */
    public interface C4092a {
        /* renamed from: a */
        void mo3767a();

        /* renamed from: a */
        void mo3768a(Bundle bundle);
    }

    /* renamed from: a */
    public static dct m26395a() {
        return f21147d;
    }

    private dct() {
    }

    /* renamed from: a */
    public void m26404a(Context context, String str, dcs dcs, boolean z, boolean z2) {
        this.f21152f = dcs;
        this.f21153g = context;
        this.f21154h = z2;
        m26396a(context);
        m26405a(str);
        if (z) {
            dda.m26492a().m26506a(context);
        }
    }

    /* renamed from: b */
    public void m26406b() {
        dda.m26492a().m26522b();
    }

    /* renamed from: a */
    private void m26396a(Context context) {
        this.f21148a = context.getPackageName();
        this.f21149b = this.f21148a + ".comments.API_CALLBACK";
        this.f21150c = this.f21148a + ".comments.IMAGE_DOWNLOAD_CALLBACK";
    }

    /* renamed from: c */
    public Context m26407c() {
        return this.f21153g;
    }

    /* renamed from: d */
    public dcs m26408d() {
        return this.f21152f;
    }

    /* renamed from: e */
    public dfz m26409e() {
        if (this.f21152f != null) {
            return this.f21152f.m26388d();
        }
        return null;
    }

    /* renamed from: a */
    public void m26405a(String str) {
        if (this.f21151e != null) {
            if (this.f21151e.equals(str)) {
                return;
            }
        } else if (str == null) {
            return;
        }
        this.f21151e = str;
        dct.m26403n();
    }

    /* renamed from: f */
    public boolean m26410f() {
        return this.f21154h;
    }

    /* renamed from: g */
    public boolean m26411g() {
        return this.f21155i;
    }

    /* renamed from: h */
    public String m26412h() {
        return this.f21151e;
    }

    /* renamed from: i */
    public void m26413i() {
        dda.m26492a().m26511a("last_info_update_time", 0);
        dda.m26492a().m26525b("logged_in_user", "");
        dda.m26492a().m26505a(1, 0);
    }

    /* renamed from: j */
    public void m26414j() {
        dda.m26492a().m26551i();
    }

    /* renamed from: k */
    public void m26415k() {
        new ddo().mo4336f(this.f21153g);
    }

    /* renamed from: l */
    public void m26416l() {
        if (this.f21153g != null) {
            dda.m26492a().m26506a(this.f21153g);
            dda.m26492a().m26548h();
        }
    }

    /* renamed from: m */
    public static dgz m26402m() {
        return dhe.m27281a("cs");
    }

    /* renamed from: a */
    public static void m26397a(Bundle bundle) {
        Object obj = null;
        if (bundle != null) {
            obj = bundle.getString("scope");
        }
        if (TextUtils.isEmpty(obj)) {
            dct.m26402m().m27269c(new AskForLoginEvent(bundle));
        } else {
            dhe.m27287c(obj, new AskForLoginEvent(bundle));
        }
    }

    /* renamed from: n */
    public static void m26403n() {
        dct.m26402m().m27269c(new RefreshTokenEvent());
    }

    /* renamed from: a */
    public static boolean m26399a(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    /* renamed from: a */
    public static void m26398a(String str, Object obj) {
        if (dct.m26395a().m26408d().m26394j()) {
            dhe.m27287c(str, obj);
        } else {
            dhe.m27280a().m27269c(obj);
        }
    }

    /* renamed from: b */
    public static void m26400b(String str, Object obj) {
        if (!dct.m26395a().m26408d().m26394j()) {
            dhe.m27280a().m27263a(obj);
        } else if (str == null) {
            throw new IllegalArgumentException("You have turned on event scope when firing event, it can't be null");
        } else {
            dhe.m27283a(str, obj);
        }
    }

    /* renamed from: c */
    public static void m26401c(String str, Object obj) {
        if (!dct.m26395a().m26408d().m26394j()) {
            dhe.m27280a().m27266b(obj);
        } else if (str == null) {
            throw new IllegalArgumentException("You have turned on event scope when firing event, it can't be null");
        } else {
            try {
                dhe.m27285b(str, obj);
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
