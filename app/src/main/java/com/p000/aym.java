package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@bhd
/* renamed from: aym */
public class aym extends Thread {
    /* renamed from: a */
    private boolean f5067a = false;
    /* renamed from: b */
    private boolean f5068b = false;
    /* renamed from: c */
    private boolean f5069c = false;
    /* renamed from: d */
    private final Object f5070d;
    /* renamed from: e */
    private final ayk f5071e;
    /* renamed from: f */
    private final bhc f5072f;
    /* renamed from: g */
    private final int f5073g;
    /* renamed from: h */
    private final int f5074h;
    /* renamed from: i */
    private final int f5075i;
    /* renamed from: j */
    private final int f5076j;
    /* renamed from: k */
    private final int f5077k;
    /* renamed from: l */
    private final int f5078l;
    /* renamed from: m */
    private final int f5079m;
    /* renamed from: n */
    private final int f5080n;
    /* renamed from: o */
    private final String f5081o;

    @bhd
    /* renamed from: aym$a */
    class C0918a {
        /* renamed from: a */
        final int f5065a;
        /* renamed from: b */
        final int f5066b;

        C0918a(aym aym, int i, int i2) {
            this.f5065a = i;
            this.f5066b = i2;
        }
    }

    public aym(ayk ayk, bhc bhc) {
        this.f5071e = ayk;
        this.f5072f = bhc;
        this.f5070d = new Object();
        this.f5074h = ((Integer) bbb.f5391X.m7064c()).intValue();
        this.f5075i = ((Integer) bbb.f5392Y.m7064c()).intValue();
        this.f5076j = ((Integer) bbb.f5393Z.m7064c()).intValue();
        this.f5077k = ((Integer) bbb.aa.m7064c()).intValue();
        this.f5078l = ((Integer) bbb.ad.m7064c()).intValue();
        this.f5079m = ((Integer) bbb.af.m7064c()).intValue();
        this.f5080n = ((Integer) bbb.ag.m7064c()).intValue();
        this.f5073g = ((Integer) bbb.ab.m7064c()).intValue();
        this.f5081o = (String) bbb.ai.m7064c();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    C0918a m6612a(View view, ayj ayj) {
        int i = 0;
        if (view == null) {
            return new C0918a(this, 0, 0);
        }
        Context b = ako.m2346h().m6610b();
        if (b != null) {
            String str = (String) view.getTag(b.getResources().getIdentifier((String) bbb.ah.m7064c(), "id", b.getPackageName()));
            if (!(TextUtils.isEmpty(this.f5081o) || str == null || !str.equals(this.f5081o))) {
                return new C0918a(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0918a(this, 0, 0);
            }
            ayj.m6583b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C0918a(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof blo)) {
            ayj.m6588g();
            return m6619a((WebView) view, ayj, globalVisibleRect) ? new C0918a(this, 0, 1) : new C0918a(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new C0918a(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C0918a a = m6612a(viewGroup.getChildAt(i3), ayj);
                i2 += a.f5065a;
                i += a.f5066b;
            }
            return new C0918a(this, i2, i);
        }
    }

    /* renamed from: a */
    public void m6613a() {
        synchronized (this.f5070d) {
            if (this.f5067a) {
                bky.m9006b("Content hash thread already started, quiting...");
                return;
            }
            this.f5067a = true;
            start();
        }
    }

    /* renamed from: a */
    void m6614a(Activity activity) {
        if (activity != null) {
            View view = null;
            try {
                if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                    view = activity.getWindow().getDecorView().findViewById(16908290);
                }
            } catch (Throwable th) {
                ako.m2347i().m8934a(th, "ContentFetchTask.extractContent");
                bky.m9006b("Failed getting root view of activity. Content not extracted.");
            }
            if (view != null) {
                m6618a(view);
            }
        }
    }

    /* renamed from: a */
    void m6615a(ayj ayj, WebView webView, String str, boolean z) {
        ayj.m6587f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    ayj.m6580a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String valueOf = String.valueOf(webView.getTitle());
                    ayj.m6580a(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(optString).length()).append(valueOf).append("\n").append(optString).toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (ayj.m6581a()) {
                this.f5071e.m6594b(ayj);
            }
        } catch (JSONException e) {
            bky.m9006b("Json string may be malformed.");
        } catch (Throwable th) {
            bky.m9004a("Failed to get webview content.", th);
            this.f5072f.mo1187a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: a */
    boolean m6616a(RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    /* renamed from: a */
    boolean m6617a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    /* renamed from: a */
    boolean m6618a(final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ aym f5058b;

            public void run() {
                this.f5058b.m6620b(view);
            }
        });
        return true;
    }

    @TargetApi(19)
    /* renamed from: a */
    boolean m6619a(final WebView webView, final ayj ayj, final boolean z) {
        if (!aqd.m4917g()) {
            return false;
        }
        ayj.m6588g();
        webView.post(new Runnable(this) {
            /* renamed from: a */
            ValueCallback<String> f5060a = new C09161(this);
            /* renamed from: e */
            final /* synthetic */ aym f5064e;

            /* renamed from: aym$2$1 */
            class C09161 implements ValueCallback<String> {
                /* renamed from: a */
                final /* synthetic */ C09172 f5059a;

                C09161(C09172 c09172) {
                    this.f5059a = c09172;
                }

                /* renamed from: a */
                public void m6611a(String str) {
                    this.f5059a.f5064e.m6615a(ayj, webView, str, z);
                }

                public /* synthetic */ void onReceiveValue(Object obj) {
                    m6611a((String) obj);
                }
            }

            public void run() {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f5060a);
                    } catch (Throwable th) {
                        this.f5060a.onReceiveValue("");
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: b */
    void m6620b(View view) {
        try {
            ayj ayj = new ayj(this.f5074h, this.f5075i, this.f5076j, this.f5077k, this.f5078l, this.f5079m, this.f5080n);
            C0918a a = m6612a(view, ayj);
            ayj.m6589h();
            if (a.f5065a != 0 || a.f5066b != 0) {
                if (a.f5066b != 0 || ayj.m6591j() != 0) {
                    if (a.f5066b != 0 || !this.f5071e.m6593a(ayj)) {
                        this.f5071e.m6595c(ayj);
                    }
                }
            }
        } catch (Throwable e) {
            bky.m9007b("Exception in fetchContentOnUIThread", e);
            this.f5072f.mo1187a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: b */
    boolean m6621b() {
        try {
            Context b = ako.m2346h().m6610b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (m6616a(runningAppProcessInfo) && !keyguardManager.inKeyguardRestrictedInputMode() && m6617a(b)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            ako.m2347i().m8934a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: c */
    public ayj m6622c() {
        return this.f5071e.m6592a();
    }

    /* renamed from: d */
    public void m6623d() {
        synchronized (this.f5070d) {
            this.f5068b = false;
            this.f5070d.notifyAll();
            bky.m9006b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: e */
    public void m6624e() {
        synchronized (this.f5070d) {
            this.f5068b = true;
            bky.m9006b("ContentFetchThread: paused, mPause = " + this.f5068b);
        }
    }

    /* renamed from: f */
    public boolean m6625f() {
        return this.f5068b;
    }

    public void run() {
        while (true) {
            try {
                if (m6621b()) {
                    Activity a = ako.m2346h().m6607a();
                    if (a == null) {
                        bky.m9006b("ContentFetchThread: no activity. Sleeping.");
                        m6624e();
                    } else {
                        m6614a(a);
                    }
                } else {
                    bky.m9006b("ContentFetchTask: sleeping");
                    m6624e();
                }
                Thread.sleep((long) (this.f5073g * 1000));
            } catch (Throwable e) {
                bky.m9007b("Error in ContentFetchTask", e);
            } catch (Throwable e2) {
                bky.m9007b("Error in ContentFetchTask", e2);
                this.f5072f.mo1187a(e2, "ContentFetchTask.run");
            }
            synchronized (this.f5070d) {
                while (this.f5068b) {
                    try {
                        bky.m9006b("ContentFetchTask: waiting");
                        this.f5070d.wait();
                    } catch (InterruptedException e3) {
                    }
                }
            }
        }
    }
}
