package com.p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader */
/* renamed from: ff */
public class ff<D> {
    /* renamed from: f */
    int f23669f;
    /* renamed from: g */
    C5226b<D> f23670g;
    /* renamed from: h */
    C5225a<D> f23671h;
    /* renamed from: i */
    Context f23672i;
    /* renamed from: j */
    boolean f23673j = false;
    /* renamed from: k */
    boolean f23674k = false;
    /* renamed from: l */
    boolean f23675l = true;
    /* renamed from: m */
    boolean f23676m = false;
    /* renamed from: n */
    boolean f23677n = false;

    /* compiled from: Loader */
    /* renamed from: ff$a */
    public interface C5225a<D> {
        /* renamed from: a */
        void mo4665a(ff<D> ffVar);
    }

    /* compiled from: Loader */
    /* renamed from: ff$b */
    public interface C5226b<D> {
        /* renamed from: a */
        void mo4666a(ff<D> ffVar, D d);
    }

    public ff(Context context) {
        this.f23672i = context.getApplicationContext();
    }

    /* renamed from: b */
    public void m30111b(D d) {
        if (this.f23670g != null) {
            this.f23670g.mo4666a(this, d);
        }
    }

    /* renamed from: g */
    public void m30114g() {
        if (this.f23671h != null) {
            this.f23671h.mo4665a(this);
        }
    }

    /* renamed from: a */
    public void m30106a(int i, C5226b<D> c5226b) {
        if (this.f23670g != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f23670g = c5226b;
        this.f23669f = i;
    }

    /* renamed from: a */
    public void m30108a(C5226b<D> c5226b) {
        if (this.f23670g == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f23670g != c5226b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f23670g = null;
        }
    }

    /* renamed from: a */
    public void m30107a(C5225a<D> c5225a) {
        if (this.f23671h != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f23671h = c5225a;
    }

    /* renamed from: b */
    public void m30110b(C5225a<D> c5225a) {
        if (this.f23671h == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f23671h != c5225a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f23671h = null;
        }
    }

    /* renamed from: h */
    public boolean m30115h() {
        return this.f23674k;
    }

    /* renamed from: i */
    public final void m30116i() {
        this.f23673j = true;
        this.f23675l = false;
        this.f23674k = false;
        m30117j();
    }

    /* renamed from: j */
    protected void m30117j() {
    }

    /* renamed from: k */
    public boolean m30118k() {
        return mo4709b();
    }

    /* renamed from: b */
    protected boolean mo4709b() {
        return false;
    }

    /* renamed from: l */
    public void m30119l() {
        mo4707a();
    }

    /* renamed from: a */
    protected void mo4707a() {
    }

    /* renamed from: m */
    public void m30120m() {
        this.f23673j = false;
        m30121n();
    }

    /* renamed from: n */
    protected void m30121n() {
    }

    /* renamed from: o */
    public void m30122o() {
        m30123p();
        this.f23675l = true;
        this.f23673j = false;
        this.f23674k = false;
        this.f23676m = false;
        this.f23677n = false;
    }

    /* renamed from: p */
    protected void m30123p() {
    }

    /* renamed from: q */
    public void m30124q() {
        this.f23677n = false;
    }

    /* renamed from: r */
    public void m30125r() {
        if (this.f23677n) {
            m30126s();
        }
    }

    /* renamed from: s */
    public void m30126s() {
        if (this.f23673j) {
            m30119l();
        } else {
            this.f23676m = true;
        }
    }

    /* renamed from: c */
    public String m30113c(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        hk.m30585a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        hk.m30585a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f23669f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo4708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f23669f);
        printWriter.print(" mListener=");
        printWriter.println(this.f23670g);
        if (this.f23673j || this.f23676m || this.f23677n) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f23673j);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f23676m);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f23677n);
        }
        if (this.f23674k || this.f23675l) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f23674k);
            printWriter.print(" mReset=");
            printWriter.println(this.f23675l);
        }
    }
}
