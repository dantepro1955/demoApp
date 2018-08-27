package com.p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.C0357a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/* compiled from: CustomSnackbarOnDeniedPermissionListener */
/* renamed from: dhi */
public class dhi extends bxn {
    /* renamed from: a */
    private final ViewGroup f21636a;
    /* renamed from: b */
    private final String f21637b;
    /* renamed from: c */
    private final String f21638c;
    /* renamed from: d */
    private final OnClickListener f21639d;
    /* renamed from: e */
    private final C0357a f21640e;

    /* compiled from: CustomSnackbarOnDeniedPermissionListener */
    /* renamed from: dhi$a */
    public static class C4909a {
        /* renamed from: a */
        private final ViewGroup f21631a;
        /* renamed from: b */
        private final String f21632b;
        /* renamed from: c */
        private String f21633c;
        /* renamed from: d */
        private OnClickListener f21634d;
        /* renamed from: e */
        private C0357a f21635e;

        /* compiled from: CustomSnackbarOnDeniedPermissionListener */
        /* renamed from: dhi$a$1 */
        class C49081 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4909a f21630a;

            C49081(C4909a c4909a) {
                this.f21630a = c4909a;
            }

            public void onClick(View view) {
                Context context = this.f21630a.f21631a.getContext();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        }

        private C4909a(ViewGroup viewGroup, String str) {
            this.f21631a = viewGroup;
            this.f21632b = str;
        }

        /* renamed from: a */
        public static C4909a m27293a(ViewGroup viewGroup, String str) {
            return new C4909a(viewGroup, str);
        }

        /* renamed from: a */
        public static C4909a m27292a(ViewGroup viewGroup, int i) {
            return C4909a.m27293a(viewGroup, viewGroup.getContext().getString(i));
        }

        /* renamed from: a */
        public C4909a m27295a(String str) {
            this.f21633c = str;
            this.f21634d = new C49081(this);
            return this;
        }

        /* renamed from: a */
        public C4909a m27294a(int i) {
            return m27295a(this.f21631a.getContext().getString(i));
        }

        /* renamed from: a */
        public dhi m27296a() {
            return new dhi(this.f21631a, this.f21632b, this.f21633c, this.f21634d, this.f21635e);
        }
    }

    private dhi(ViewGroup viewGroup, String str, String str2, OnClickListener onClickListener, C0357a c0357a) {
        this.f21636a = viewGroup;
        this.f21637b = str;
        this.f21638c = str2;
        this.f21639d = onClickListener;
        this.f21640e = c0357a;
    }

    /* renamed from: a */
    public void m27297a(bxh bxh) {
        Snackbar a = Snackbar.a(this.f21636a, this.f21637b, 0);
        if (!(this.f21638c == null || this.f21639d == null)) {
            a.a(this.f21638c, this.f21639d);
            a.e(-1);
        }
        if (this.f21640e != null) {
            a.a(this.f21640e);
        }
        a.a();
    }
}
