package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.plus.PlusOneDummyView;
import p000.bqo.C1410a;

/* renamed from: bqp */
public final class bqp extends aqs<bqo> {
    /* renamed from: a */
    private static final bqp f7393a = new bqp();

    private bqp() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m10427a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) aqr.m4968a(((bqo) f7393a.m4701a(context)).mo1399a(aqr.m4967a((Object) context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* renamed from: a */
    protected bqo m10428a(IBinder iBinder) {
        return C1410a.m10426a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m10428a(iBinder);
    }
}
