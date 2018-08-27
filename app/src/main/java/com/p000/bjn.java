package com.p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import java.util.concurrent.atomic.AtomicBoolean;

@bhd
/* renamed from: bjn */
public class bjn {
    /* renamed from: a */
    final AtomicBoolean f6524a = new AtomicBoolean(false);
    /* renamed from: b */
    private final Object f6525b = new Object();
    /* renamed from: c */
    private String f6526c = null;

    /* renamed from: a */
    private Object m8870a(Class cls, Context context) {
        Object obj = null;
        try {
            obj = cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context});
        } catch (Exception e) {
            m8873a(e, "getInstance");
        }
        return obj;
    }

    /* renamed from: a */
    private Object m8871a(String str, Context context) {
        Object obj = null;
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
            obj = loadClass.getDeclaredMethod(str, new Class[0]).invoke(m8870a(loadClass, context), new Object[0]);
        } catch (Exception e) {
            m8873a(e, str);
        }
        return obj;
    }

    /* renamed from: a */
    private void m8872a(Context context, String str, Bundle bundle) {
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
            Object a = m8870a(loadClass, context);
            loadClass.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class}).invoke(a, new Object[]{AnalyticsSQLiteHelper.EVENT_LIST_AM, str, bundle});
        } catch (Exception e) {
            m8873a(e, "logEventInternal");
        }
    }

    /* renamed from: a */
    private void m8873a(Exception exception, String str) {
        if (!this.f6524a.get()) {
            bky.m9007b(new StringBuilder(String.valueOf(str).length() + FacebookRequestErrorClassification.EC_INVALID_TOKEN).append("Invoke Scion method ").append(str).append(" error, the Google Mobile Ads SDK will not integrate with Scion. Admob/Scion integration requires the latest Scion SDK jar, but Scion SDK is either missing or out of date").toString(), exception);
            ako.m2347i().m8934a((Throwable) exception, "ScionApiAdapter.logInvokeScionApiError");
            this.f6524a.set(true);
        }
    }

    /* renamed from: b */
    private void m8874b(Context context, String str, String str2) {
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
            Object a = m8870a(loadClass, context);
            loadClass.getDeclaredMethod(str2, new Class[]{String.class}).invoke(a, new Object[]{str});
        } catch (Exception e) {
            m8873a(e, str2);
        }
    }

    /* renamed from: g */
    private Bundle m8875g(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("_aeid", str);
        return bundle;
    }

    /* renamed from: a */
    public String m8876a(Context context) {
        if (!m8879a()) {
            return null;
        }
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
            return (String) loadClass.getDeclaredMethod("getCurrentScreenName", new Class[0]).invoke(m8870a(loadClass, context), new Object[0]);
        } catch (Exception e) {
            m8873a(e, "getCurrentScreenName");
            return null;
        }
    }

    /* renamed from: a */
    public void m8877a(Context context, String str) {
        if (m8879a()) {
            m8874b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: a */
    public void m8878a(Context context, String str, String str2) {
        if (m8879a() && (context instanceof Activity)) {
            if (!TextUtils.isEmpty(str2)) {
                str = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("_").append(str2).toString();
            }
            try {
                Class loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context});
                Activity activity = (Activity) context;
                loadClass.getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, String.class, String.class}).invoke(invoke, new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m8873a(e, "setCurrentScreen");
            }
        }
    }

    /* renamed from: a */
    public boolean m8879a() {
        return ((Boolean) bbb.au.m7064c()).booleanValue() && !this.f6524a.get();
    }

    /* renamed from: b */
    public String m8880b(Context context) {
        if (!m8879a()) {
            return null;
        }
        synchronized (this.f6525b) {
            if (this.f6526c != null) {
                String str = this.f6526c;
                return str;
            }
            this.f6526c = (String) m8871a("getGmpAppId", context);
            str = this.f6526c;
            return str;
        }
    }

    /* renamed from: b */
    public void m8881b(Context context, String str) {
        if (m8879a()) {
            m8874b(context, str, "endAdUnitExposure");
        }
    }

    /* renamed from: b */
    public boolean m8882b() {
        return ((Boolean) bbb.av.m7064c()).booleanValue() && m8879a();
    }

    /* renamed from: c */
    public String m8883c(Context context) {
        return !m8879a() ? null : (String) m8871a("getAppInstanceId", context);
    }

    /* renamed from: c */
    public void m8884c(Context context, String str) {
        if (m8879a()) {
            Bundle g = m8875g(context, str);
            g.putString("_r", "1");
            m8872a(context, "_ac", g);
        }
    }

    /* renamed from: c */
    public boolean m8885c() {
        return ((Boolean) bbb.aw.m7064c()).booleanValue() && m8879a();
    }

    /* renamed from: d */
    public String m8886d(Context context) {
        if (!m8879a()) {
            return null;
        }
        Object a = m8871a("generateEventId", context);
        return a != null ? a.toString() : null;
    }

    /* renamed from: d */
    public void m8887d(Context context, String str) {
        if (m8879a()) {
            m8872a(context, "_ai", m8875g(context, str));
        }
    }

    /* renamed from: d */
    public boolean m8888d() {
        return ((Boolean) bbb.ax.m7064c()).booleanValue() && m8879a();
    }

    /* renamed from: e */
    public void m8889e(Context context, String str) {
        if (m8879a()) {
            m8872a(context, "_aq", m8875g(context, str));
        }
    }

    /* renamed from: e */
    public boolean m8890e() {
        return ((Boolean) bbb.aA.m7064c()).booleanValue() && m8879a();
    }

    /* renamed from: f */
    public void m8891f(Context context, String str) {
        if (m8879a()) {
            m8872a(context, "_aa", m8875g(context, str));
        }
    }
}
