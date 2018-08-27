package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.polling.PollingLanguageOptionMaximumReachEvent;
import com.ninegag.android.app.otto.polling.PollingLanguagesChoseEvent;
import com.ninegag.android.app.otto.polling.PollingLeaveEvent;
import com.ninegag.android.app.ui.PollingActivity;
import java.util.ArrayList;

/* compiled from: PollingLanguageListFragmentModule */
/* renamed from: cbq */
public class cbq extends cry {
    /* renamed from: a */
    private ArrayList<String> f8624a = new ArrayList();
    /* renamed from: b */
    private Button f8625b;
    /* renamed from: c */
    private OnClickListener f8626c = new C16571(this);

    /* compiled from: PollingLanguageListFragmentModule */
    /* renamed from: cbq$1 */
    class C16571 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cbq f8622a;

        C16571(cbq cbq) {
            this.f8622a = cbq;
        }

        public void onClick(View view) {
            dhe.c(PollingActivity.SCOPE, new PollingLeaveEvent());
        }
    }

    /* compiled from: PollingLanguageListFragmentModule */
    /* renamed from: cbq$2 */
    class C16582 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cbq f8623a;

        C16582(cbq cbq) {
            this.f8623a = cbq;
        }

        public void onClick(View view) {
            if (this.f8623a.m12312l()) {
                this.f8623a.m12329i();
            }
        }
    }

    /* renamed from: a */
    public void m12321a(Bundle bundle) {
        this.g = m12319a();
        this.h = m12324b();
        this.i = m12320a(this.g, this.h);
    }

    /* renamed from: a */
    protected void m12322a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    public View m12318a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        if (a == null) {
            return null;
        }
        this.f8625b = (Button) a.findViewById(R.id.btn_confirm);
        m12310a(a);
        m12315o();
        return a;
    }

    /* renamed from: a */
    protected LinearLayoutManager m12316a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: c */
    public void m12326c() {
        super.c();
        y();
    }

    /* renamed from: a */
    protected crw m12319a() {
        return new cbr(cco.m12554a(PollingActivity.SCOPE));
    }

    /* renamed from: a */
    protected csb m12320a(crw crw, cse cse) {
        return new cbo(crw, cse);
    }

    /* renamed from: b */
    protected cse m12324b() {
        return new cbs(this);
    }

    /* renamed from: a */
    protected View m12317a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_polling_languages_list, null);
    }

    /* renamed from: a */
    private void m12310a(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.pollingLanguageTitleBar);
        toolbar.setTitle(String.format(djo.a(caf.m12046a().f8449a, R.plurals.title_polling_submission, 3), new Object[]{Integer.valueOf(3)}));
        toolbar.setNavigationIcon((int) R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(this.f8626c);
    }

    /* renamed from: g */
    public boolean m12328g() {
        return this.f8624a.size() >= 3;
    }

    /* renamed from: a */
    public void m12323a(String str) {
        this.f8624a.add(str);
        p_();
    }

    /* renamed from: b */
    public void m12325b(String str) {
        int indexOf = this.f8624a.indexOf(str);
        if (m12327c(str)) {
            this.f8624a.remove(indexOf);
            p_();
        }
    }

    /* renamed from: c */
    public boolean m12327c(String str) {
        return this.f8624a.indexOf(str) > -1;
    }

    /* renamed from: l */
    private boolean m12312l() {
        int size = this.f8624a.size();
        if (size < 1 || size > 3) {
            return false;
        }
        return true;
    }

    public void o_() {
        dhe.c(PollingActivity.SCOPE, new PollingLanguageOptionMaximumReachEvent());
    }

    /* renamed from: i */
    public void m12329i() {
        dhe.c(PollingActivity.SCOPE, new PollingLanguagesChoseEvent(this.f8624a));
    }

    public void p_() {
        CharSequence format;
        int size = this.f8624a.size();
        if (m12312l()) {
            m12313m();
            format = String.format(djo.a(caf.m12046a().f8449a, R.plurals.action_polling_submission, size), new Object[]{Integer.valueOf(size)});
        } else {
            format = djo.a(caf.m12046a().f8449a, R.string.action_polling_pick_languages);
            m12314n();
        }
        this.f8625b.setText(format);
    }

    /* renamed from: m */
    private void m12313m() {
        this.f8625b.setEnabled(true);
    }

    /* renamed from: n */
    private void m12314n() {
        this.f8625b.setEnabled(false);
    }

    /* renamed from: o */
    private void m12315o() {
        this.f8625b.setOnClickListener(new C16582(this));
    }
}
