package com.p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.ninegag.android.app.component.youtube.YouTubeView;
import java.util.Timer;
import java.util.TimerTask;
import p000.bsr.C1442a;
import p000.bsr.C1443b;
import p000.bsr.C1444c;
import p000.bsr.C1445d;
import p000.bsr.C1446e;
import p000.bsr.C1447f;
import p000.bsr.C1448g;

/* compiled from: YouTubePlayerController */
/* renamed from: cha */
public class cha implements C1443b, C1444c, C1445d, C1446e {
    /* renamed from: a */
    String f9175a = null;
    /* renamed from: b */
    bsr f9176b;
    /* renamed from: c */
    YouTubeView f9177c;
    /* renamed from: d */
    private boolean f9178d = false;
    /* renamed from: e */
    private boolean f9179e = false;
    /* renamed from: f */
    private boolean f9180f = false;
    /* renamed from: g */
    private boolean f9181g = false;
    /* renamed from: h */
    private boolean f9182h = false;
    /* renamed from: i */
    private int f9183i = 1;
    /* renamed from: j */
    private boolean f9184j = true;
    /* renamed from: k */
    private boolean f9185k = false;
    /* renamed from: l */
    private boolean f9186l = false;
    /* renamed from: m */
    private boolean f9187m = true;
    /* renamed from: n */
    private boolean f9188n = true;
    /* renamed from: o */
    private int f9189o = 0;
    /* renamed from: p */
    private int f9190p;
    /* renamed from: q */
    private Timer f9191q;

    /* compiled from: YouTubePlayerController */
    /* renamed from: cha$1 */
    class C17231 extends TimerTask {
        /* renamed from: a */
        final /* synthetic */ cha f9174a;

        C17231(cha cha) {
            this.f9174a = cha;
        }

        public void run() {
            try {
                if (this.f9174a.f9177c != null && this.f9174a.f9176b != null && this.f9174a.f9176b.mo1530d()) {
                    this.f9174a.f9190p = this.f9174a.f9176b.mo1531e();
                    this.f9174a.f9177c.b(this.f9174a.f9190p, this.f9174a.f9176b.mo1532f());
                }
            } catch (Throwable e) {
                Log.e("YouTubePlayerController", "run: ", e);
            }
        }
    }

    public cha(YouTubeView youTubeView) {
        this.f9177c = youTubeView;
        this.f9191q = new Timer("youtube-checkprogress");
        this.f9191q.scheduleAtFixedRate(new C17231(this), 0, 500);
    }

    /* renamed from: a */
    public void mo1734a(C1448g c1448g, bsr bsr, boolean z) {
        this.f9176b = bsr;
        this.f9176b.mo1520a((C1446e) this);
        this.f9176b.mo1519a((C1445d) this);
        this.f9176b.mo1518a((C1443b) this);
        this.f9176b.mo1528b(this.f9187m);
        this.f9177c.a(bsr);
        m13182c(true);
        if (z) {
            this.f9176b.mo1527b(this.f9175a, this.f9189o * 1000);
            return;
        }
        if (this.f9175a != null) {
            if (m13196j()) {
                if (this.f9189o != 0) {
                    this.f9176b.mo1527b(this.f9175a, this.f9189o * 1000);
                } else {
                    this.f9176b.mo1526b(this.f9175a);
                }
                if (!m13200l()) {
                    this.f9176b.mo1524a(true);
                }
            } else if (this.f9189o != 0) {
                this.f9176b.mo1523a(this.f9175a, this.f9189o * 1000);
            } else {
                this.f9176b.mo1522a(this.f9175a);
            }
        }
        m13191h();
    }

    /* renamed from: a */
    public void mo1733a(C1448g c1448g, bsq bsq) {
        this.f9177c.a(bsq.toString());
    }

    /* renamed from: a */
    public void mo1730a() {
        this.f9177c.a("playing", this.f9176b);
        if (!m13200l()) {
            this.f9176b.mo1524a(true);
        }
    }

    /* renamed from: b */
    public void mo1737b() {
        this.f9177c.a("paused", this.f9176b);
    }

    /* renamed from: c */
    public void mo1739c() {
        this.f9177c.a("stopped", this.f9176b);
    }

    /* renamed from: b */
    public void mo1738b(boolean z) {
        ProgressBar progressBar;
        if (z) {
            this.f9177c.a("buffering", this.f9176b);
        }
        try {
            progressBar = (ProgressBar) ((ViewGroup) ((ViewGroup) this.f9177c.getChildAt(0)).getChildAt(3)).getChildAt(2);
        } catch (Throwable th) {
            progressBar = m13168a(this.f9177c);
        }
        int i = z ? 0 : 4;
        if (progressBar != null) {
            progressBar.setVisibility(i);
        }
    }

    /* renamed from: a */
    private ProgressBar m13168a(View view) {
        if (view instanceof ProgressBar) {
            return (ProgressBar) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View a = m13168a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1731a(int i) {
        Log.d("YouTubePlayerController", "onSeekTo: " + i + ", lastCheck=" + this.f9190p);
        this.f9177c.a(this.f9190p, i);
    }

    /* renamed from: d */
    public void mo1740d() {
        this.f9177c.a("loading", this.f9176b);
    }

    /* renamed from: a */
    public void mo1735a(String str) {
        this.f9177c.a("loaded", this.f9176b);
    }

    /* renamed from: e */
    public void mo1741e() {
        this.f9177c.a("adStarted", this.f9176b);
    }

    /* renamed from: f */
    public void mo1742f() {
        this.f9177c.a("videoStarted", this.f9176b);
    }

    /* renamed from: g */
    public void mo1743g() {
        this.f9177c.a("ended", this.f9176b);
        if (m13198k()) {
            this.f9176b.mo1526b(this.f9175a);
            this.f9176b.mo1525b();
            return;
        }
        this.f9176b.mo1524a(false);
    }

    /* renamed from: a */
    public void mo1732a(C1442a c1442a) {
        this.f9177c.a(c1442a.toString());
    }

    /* renamed from: a */
    public void mo1736a(boolean z) {
        this.f9177c.a(z ? "fullscreenMode" : "windowMode", this.f9176b);
        if (!m13200l() && !z) {
            this.f9176b.mo1529c();
        }
    }

    /* renamed from: h */
    public void m13191h() {
        switch (this.f9183i) {
            case 0:
                this.f9176b.mo1521a(C1447f.CHROMELESS);
                return;
            case 1:
                this.f9176b.mo1521a(C1447f.DEFAULT);
                return;
            case 2:
                this.f9176b.mo1521a(C1447f.MINIMAL);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public void m13182c(boolean z) {
        this.f9178d = z;
    }

    /* renamed from: i */
    public boolean m13194i() {
        return this.f9178d;
    }

    /* renamed from: b */
    public void m13179b(String str) {
        this.f9175a = str;
        if (!m13194i()) {
            return;
        }
        if (this.f9175a == null) {
            this.f9176b.mo1529c();
        } else if (m13196j()) {
            this.f9176b.mo1526b(this.f9175a);
            this.f9176b.mo1525b();
        } else {
            this.f9176b.mo1522a(this.f9175a);
        }
    }

    /* renamed from: d */
    public void m13184d(boolean z) {
        this.f9179e = z;
        if (!m13194i()) {
            return;
        }
        if (this.f9179e && !this.f9176b.mo1530d()) {
            this.f9176b.mo1525b();
            if (!m13200l()) {
                this.f9176b.mo1524a(true);
            }
        } else if (!this.f9179e && this.f9176b.mo1530d()) {
            this.f9176b.mo1529c();
            this.f9176b.mo1524a(false);
        }
    }

    /* renamed from: e */
    public void m13186e(boolean z) {
        this.f9185k = z;
    }

    /* renamed from: a */
    public void m13174a(Integer num) {
        if (num.intValue() >= 0 && num.intValue() <= 2) {
            this.f9183i = Integer.valueOf(num.intValue()).intValue();
            if (m13194i()) {
                m13191h();
            }
        }
    }

    /* renamed from: f */
    public void m13188f(boolean z) {
        this.f9187m = z;
        if (m13194i()) {
            this.f9176b.mo1528b(z);
        }
    }

    /* renamed from: g */
    public void m13190g(boolean z) {
        this.f9188n = z;
        if (m13194i()) {
            this.f9176b.mo1524a(z);
        }
    }

    /* renamed from: h */
    public void m13192h(boolean z) {
        this.f9180f = z;
    }

    /* renamed from: i */
    public void m13193i(boolean z) {
        this.f9184j = z;
    }

    /* renamed from: j */
    public void m13195j(boolean z) {
        this.f9181g = z;
    }

    /* renamed from: k */
    public void m13197k(boolean z) {
        this.f9182h = z;
    }

    /* renamed from: l */
    public void m13199l(boolean z) {
        this.f9186l = z;
    }

    /* renamed from: b */
    public void m13178b(int i) {
        this.f9189o = i;
    }

    /* renamed from: j */
    public boolean m13196j() {
        return this.f9179e;
    }

    /* renamed from: k */
    public boolean m13198k() {
        return this.f9185k;
    }

    /* renamed from: l */
    public boolean m13200l() {
        return this.f9186l;
    }

    /* renamed from: m */
    public int m13201m() {
        if (this.f9176b == null) {
            return 0;
        }
        return this.f9176b.mo1531e() / 1000;
    }

    /* renamed from: n */
    public void m13202n() {
        this.f9191q.purge();
        this.f9191q.cancel();
        this.f9191q = null;
    }
}
