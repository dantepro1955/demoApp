package com.p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import com.under9.android.comments.otto.SelectCommentEvent;

/* compiled from: CommentSystemInlineAddModuleV2 */
/* renamed from: dej */
public class dej extends deh {

    /* compiled from: CommentSystemInlineAddModuleV2 */
    /* renamed from: dej$1 */
    class C48361 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dej f21354a;

        C48361(dej dej) {
            this.f21354a = dej;
        }

        public void run() {
            this.f21354a.D();
            if (this.f21354a.t().f21913q) {
                this.f21354a.ac();
            }
            this.f21354a.e(null);
        }
    }

    public dej(Activity activity, Fragment fragment) {
        super(activity, fragment);
    }

    /* renamed from: d */
    protected void m22594d(String str) {
        super.d(str);
        if ((str == null ? 0 : str.length()) > 0) {
            if (N() != null) {
                N().setEnabled(true);
            }
            C();
            return;
        }
        if (N() != null) {
            if (U()) {
                N().setEnabled(true);
            } else {
                N().setEnabled(false);
            }
        }
        this.e = -1;
        aa();
        dct.m26398a(this.d, new SelectCommentEvent(-1, -1));
    }

    /* renamed from: q */
    protected void m22595q() {
        super.q();
        new Handler(Looper.getMainLooper()).post(new C48361(this));
        if (t().f21912p) {
            J();
        }
    }

    /* renamed from: r */
    public void m22596r() {
        if (this.b != null) {
            ddg.m26594a(((FragmentActivity) this.b).getSupportFragmentManager(), this.d);
        }
    }

    /* renamed from: a */
    public void m22593a(long j, String str) {
        long j2 = this.e;
        if ((j != j2 || b(str)) && j != -1) {
            super.a(j, str);
        }
        if (j2 != j) {
            aa();
        }
        if (!E()) {
            EditText M = M();
            if (M != null) {
                M.requestFocus();
            }
        }
    }
}
