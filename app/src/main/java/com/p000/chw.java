package com.p000;

import android.view.View;
import com.ninegag.android.app.R;

/* compiled from: SpinnerViewController */
/* renamed from: chw */
public class chw extends chu {
    public void w_() {
        super.w_();
        m13620f();
    }

    /* renamed from: f */
    public void m13620f() {
        if (!m13610c().m13615h()) {
            m13622h();
        } else if (m13610c().m13616i()) {
            m13622h();
        } else {
            m13621g();
        }
    }

    /* renamed from: g */
    public void m13621g() {
        try {
            View findViewById = m13610c().m13617j().getView().findViewById(R.id.spinnerLayer);
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(m13619a(m13610c().m13618k().getUiState().f16683a.mo1820a()));
        } catch (Exception e) {
        }
    }

    /* renamed from: h */
    public void m13622h() {
        try {
            m13610c().m13617j().getView().findViewById(R.id.spinnerLayer).setVisibility(8);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private int m13619a(int i) {
        return m13610c().m13618k().getResources().getColor(i);
    }
}
