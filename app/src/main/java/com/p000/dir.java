package com.p000;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: LocalLinkMovementMethod */
/* renamed from: dir */
public class dir extends LinkMovementMethod {
    /* renamed from: a */
    private static dir f21755a;
    /* renamed from: b */
    private String f21756b;
    /* renamed from: c */
    private C4845a f21757c;
    /* renamed from: d */
    private dis f21758d;
    /* renamed from: e */
    private long f21759e = 0;

    /* compiled from: LocalLinkMovementMethod */
    /* renamed from: dir$a */
    public interface C4845a {
        /* renamed from: a */
        void mo4355a(String str, dis dis);
    }

    /* renamed from: a */
    public static dir m27462a() {
        if (f21755a == null) {
            f21755a = new dir();
        }
        return f21755a;
    }

    /* renamed from: a */
    public dir m27465a(String str) {
        this.f21756b = str;
        return this;
    }

    /* renamed from: a */
    public dir m27463a(C4845a c4845a) {
        this.f21757c = c4845a;
        return this;
    }

    /* renamed from: a */
    public dir m27464a(dis dis) {
        this.f21758d = dis;
        return this;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (djw.m27633a(this.f21759e) > 1000) {
            this.f21759e = djw.m27632a();
            this.f21757c.mo4355a(this.f21756b, this.f21758d);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
