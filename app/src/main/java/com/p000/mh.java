package com.p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertController.C0519a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p000.mx.C5568a;

/* compiled from: AlertDialog */
/* renamed from: mh */
public class mh extends mq implements DialogInterface {
    /* renamed from: a */
    final AlertController f24497a = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    /* renamed from: mh$a */
    public static class C5530a {
        /* renamed from: a */
        private final C0519a f24494a;
        /* renamed from: b */
        private final int f24495b;

        public C5530a(Context context) {
            this(context, mh.m32640a(context, 0));
        }

        public C5530a(Context context, int i) {
            this.f24494a = new C0519a(new ContextThemeWrapper(context, mh.m32640a(context, i)));
            this.f24495b = i;
        }

        /* renamed from: a */
        public Context m32622a() {
            return this.f24494a.f3040a;
        }

        /* renamed from: a */
        public C5530a m32623a(int i) {
            this.f24494a.f3045f = this.f24494a.f3040a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C5530a m32630a(CharSequence charSequence) {
            this.f24494a.f3045f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C5530a m32628a(View view) {
            this.f24494a.f3046g = view;
            return this;
        }

        /* renamed from: b */
        public C5530a m32633b(int i) {
            this.f24494a.f3047h = this.f24494a.f3040a.getText(i);
            return this;
        }

        /* renamed from: b */
        public C5530a m32635b(CharSequence charSequence) {
            this.f24494a.f3047h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C5530a m32627a(Drawable drawable) {
            this.f24494a.f3043d = drawable;
            return this;
        }

        /* renamed from: a */
        public C5530a m32624a(int i, OnClickListener onClickListener) {
            this.f24494a.f3048i = this.f24494a.f3040a.getText(i);
            this.f24494a.f3049j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C5530a m32631a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f24494a.f3048i = charSequence;
            this.f24494a.f3049j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C5530a m32634b(int i, OnClickListener onClickListener) {
            this.f24494a.f3050k = this.f24494a.f3040a.getText(i);
            this.f24494a.f3051l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C5530a m32625a(OnCancelListener onCancelListener) {
            this.f24494a.f3055p = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C5530a m32626a(OnKeyListener onKeyListener) {
            this.f24494a.f3057r = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C5530a m32629a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f24494a.f3059t = listAdapter;
            this.f24494a.f3060u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C5530a m32632a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            this.f24494a.f3058s = charSequenceArr;
            this.f24494a.f3060u = onClickListener;
            this.f24494a.f3032F = i;
            this.f24494a.f3031E = true;
            return this;
        }

        /* renamed from: b */
        public mh m32636b() {
            mh mhVar = new mh(this.f24494a.f3040a, this.f24495b);
            this.f24494a.a(mhVar.f24497a);
            mhVar.setCancelable(this.f24494a.f3054o);
            if (this.f24494a.f3054o) {
                mhVar.setCanceledOnTouchOutside(true);
            }
            mhVar.setOnCancelListener(this.f24494a.f3055p);
            mhVar.setOnDismissListener(this.f24494a.f3056q);
            if (this.f24494a.f3057r != null) {
                mhVar.setOnKeyListener(this.f24494a.f3057r);
            }
            return mhVar;
        }
    }

    protected mh(Context context, int i) {
        super(context, mh.m32640a(context, i));
    }

    /* renamed from: a */
    static int m32640a(Context context, int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5568a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f24497a.a(charSequence);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24497a.a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f24497a.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f24497a.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
