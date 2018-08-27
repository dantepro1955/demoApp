package com.p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bby */
public interface bby {

    /* renamed from: bby$a */
    public interface C0997a {
        /* renamed from: a */
        void mo925a(bby bby);

        /* renamed from: k */
        String mo935k();

        /* renamed from: l */
        String mo936l();

        /* renamed from: m */
        bbq mo937m();

        /* renamed from: o */
        View mo939o();
    }

    /* renamed from: bby$b */
    public interface C0998b extends C0997a {
        /* renamed from: b */
        List mo926b();
    }

    /* renamed from: a */
    View mo961a(OnClickListener onClickListener, boolean z);

    /* renamed from: a */
    void mo962a(MotionEvent motionEvent);

    /* renamed from: a */
    void mo963a(View view);

    /* renamed from: a */
    void mo964a(View view, bbv bbv);

    /* renamed from: a */
    void mo965a(View view, String str, JSONObject jSONObject, Map<String, WeakReference<View>> map, View view2);

    /* renamed from: a */
    void mo966a(View view, Map<String, WeakReference<View>> map);

    /* renamed from: a */
    void mo967a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, View view2);

    /* renamed from: a */
    boolean mo968a();

    /* renamed from: b */
    void mo969b(View view, Map<String, WeakReference<View>> map);

    /* renamed from: c */
    void mo970c(View view, Map<String, WeakReference<View>> map);

    /* renamed from: e */
    View mo971e();

    /* renamed from: f */
    Context mo972f();
}
