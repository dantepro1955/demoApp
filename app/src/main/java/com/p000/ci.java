package com.p000;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p000.cd.C1257b;
import p000.cd.C1258c;

@TargetApi(14)
/* compiled from: TransitionSetPort */
/* renamed from: ci */
class ci extends cd {
    /* renamed from: a */
    ArrayList<cd> f6068a = new ArrayList();
    /* renamed from: b */
    int f6069b;
    /* renamed from: c */
    boolean f6070c = false;
    /* renamed from: w */
    private boolean f6071w = true;

    /* compiled from: TransitionSetPort */
    /* renamed from: ci$a */
    static class C1741a extends C1258c {
        /* renamed from: a */
        ci f9318a;

        C1741a(ci ciVar) {
            this.f9318a = ciVar;
        }

        /* renamed from: d */
        public void mo1257d(cd cdVar) {
            if (!this.f9318a.f6070c) {
                this.f9318a.m8251f();
                this.f9318a.f6070c = true;
            }
        }

        /* renamed from: a */
        public void mo1254a(cd cdVar) {
            ci ciVar = this.f9318a;
            ciVar.f6069b--;
            if (this.f9318a.f6069b == 0) {
                this.f9318a.f6070c = false;
                this.f9318a.m8252g();
            }
            cdVar.mo1166b((C1257b) this);
        }
    }

    /* renamed from: a */
    public /* synthetic */ cd mo1159a(long j) {
        return m8266b(j);
    }

    /* renamed from: a */
    public /* synthetic */ cd mo1160a(TimeInterpolator timeInterpolator) {
        return m8267b(timeInterpolator);
    }

    /* renamed from: a */
    public /* synthetic */ cd mo1161a(C1257b c1257b) {
        return m8270c(c1257b);
    }

    /* renamed from: b */
    public /* synthetic */ cd mo1166b(C1257b c1257b) {
        return m8271d(c1257b);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo1172j();
    }

    /* renamed from: h */
    public /* synthetic */ cd mo1171h() {
        return mo1172j();
    }

    /* renamed from: a */
    public ci m8259a(int i) {
        switch (i) {
            case 0:
                this.f6071w = true;
                break;
            case 1:
                this.f6071w = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: a */
    public ci m8260a(cd cdVar) {
        if (cdVar != null) {
            this.f6068a.add(cdVar);
            cdVar.f6058o = this;
            if (this.e >= 0) {
                cdVar.mo1159a(this.e);
            }
        }
        return this;
    }

    /* renamed from: b */
    public ci m8266b(long j) {
        super.mo1159a(j);
        if (this.e >= 0) {
            int size = this.f6068a.size();
            for (int i = 0; i < size; i++) {
                ((cd) this.f6068a.get(i)).mo1159a(j);
            }
        }
        return this;
    }

    /* renamed from: b */
    public ci m8267b(TimeInterpolator timeInterpolator) {
        return (ci) super.mo1160a(timeInterpolator);
    }

    /* renamed from: c */
    public ci m8270c(C1257b c1257b) {
        return (ci) super.mo1161a(c1257b);
    }

    /* renamed from: d */
    public ci m8271d(C1257b c1257b) {
        return (ci) super.mo1166b(c1257b);
    }

    /* renamed from: k */
    private void m8255k() {
        C1257b c1741a = new C1741a(this);
        Iterator it = this.f6068a.iterator();
        while (it.hasNext()) {
            ((cd) it.next()).mo1161a(c1741a);
        }
        this.f6069b = this.f6068a.size();
    }

    /* renamed from: a */
    protected void mo1164a(ViewGroup viewGroup, ck ckVar, ck ckVar2) {
        Iterator it = this.f6068a.iterator();
        while (it.hasNext()) {
            ((cd) it.next()).mo1164a(viewGroup, ckVar, ckVar2);
        }
    }

    /* renamed from: e */
    protected void mo1170e() {
        if (this.f6068a.isEmpty()) {
            m8251f();
            m8252g();
            return;
        }
        m8255k();
        if (this.f6071w) {
            Iterator it = this.f6068a.iterator();
            while (it.hasNext()) {
                ((cd) it.next()).mo1170e();
            }
            return;
        }
        for (int i = 1; i < this.f6068a.size(); i++) {
            final cd cdVar = (cd) this.f6068a.get(i);
            ((cd) this.f6068a.get(i - 1)).mo1161a(new C1258c(this) {
                /* renamed from: b */
                final /* synthetic */ ci f9317b;

                /* renamed from: a */
                public void mo1254a(cd cdVar) {
                    cdVar.mo1170e();
                    cdVar.mo1166b((C1257b) this);
                }
            });
        }
        cd cdVar2 = (cd) this.f6068a.get(0);
        if (cdVar2 != null) {
            cdVar2.mo1170e();
        }
    }

    /* renamed from: a */
    public void mo1165a(cj cjVar) {
        int id = cjVar.f9414b.getId();
        if (m8242a(cjVar.f9414b, (long) id)) {
            Iterator it = this.f6068a.iterator();
            while (it.hasNext()) {
                cd cdVar = (cd) it.next();
                if (cdVar.m8242a(cjVar.f9414b, (long) id)) {
                    cdVar.mo1165a(cjVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1168b(cj cjVar) {
        int id = cjVar.f9414b.getId();
        if (m8242a(cjVar.f9414b, (long) id)) {
            Iterator it = this.f6068a.iterator();
            while (it.hasNext()) {
                cd cdVar = (cd) it.next();
                if (cdVar.m8242a(cjVar.f9414b, (long) id)) {
                    cdVar.mo1168b(cjVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1163a(View view) {
        super.mo1163a(view);
        int size = this.f6068a.size();
        for (int i = 0; i < size; i++) {
            ((cd) this.f6068a.get(i)).mo1163a(view);
        }
    }

    /* renamed from: b */
    public void mo1167b(View view) {
        super.mo1167b(view);
        int size = this.f6068a.size();
        for (int i = 0; i < size; i++) {
            ((cd) this.f6068a.get(i)).mo1167b(view);
        }
    }

    /* renamed from: a */
    String mo1162a(String str) {
        String a = super.mo1162a(str);
        int i = 0;
        while (i < this.f6068a.size()) {
            String str2 = a + "\n" + ((cd) this.f6068a.get(i)).mo1162a(str + "  ");
            i++;
            a = str2;
        }
        return a;
    }

    /* renamed from: j */
    public ci mo1172j() {
        ci ciVar = (ci) super.mo1171h();
        ciVar.f6068a = new ArrayList();
        int size = this.f6068a.size();
        for (int i = 0; i < size; i++) {
            ciVar.m8260a(((cd) this.f6068a.get(i)).mo1171h());
        }
        return ciVar;
    }
}
