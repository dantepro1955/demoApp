package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import com.ninegag.android.app.R;
import com.ninegag.android.app.upload.tag.PostTagInputView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import p000.caq.C1641a;
import p000.cpi.C4133a;

/* compiled from: AddPostTagPresenter */
/* renamed from: cpg */
public class cpg extends cap<C4132a> {
    /* renamed from: a */
    private Pattern f19929a = Pattern.compile("[,~`!@#$%^&*(){}\\[\\];:\"'<.>?\\|_+=\\\\/]");
    /* renamed from: b */
    private dyt f19930b;
    /* renamed from: c */
    private cip f19931c;
    /* renamed from: d */
    private cjj f19932d;
    /* renamed from: e */
    private String f19933e;
    /* renamed from: f */
    private ArrayList<cpi> f19934f;

    /* compiled from: AddPostTagPresenter */
    /* renamed from: cpg$a */
    public interface C4132a extends C1641a {
        /* renamed from: a */
        dtp<Void> mo3744a();

        /* renamed from: a */
        void mo3827a(int i);

        /* renamed from: a */
        void mo3828a(PostTagInputView postTagInputView);

        /* renamed from: b */
        void mo3829b(int i);

        /* renamed from: b */
        void mo3830b(String str);

        /* renamed from: c */
        void mo3831c(String str);

        /* renamed from: d */
        void mo3832d(int i);
    }

    public cpg(cip cip, cjj cjj) {
        this.f19931c = cip;
        this.f19932d = cjj;
    }

    /* renamed from: a */
    public void m24286a(C4132a c4132a) {
        super.a(c4132a);
        this.f19930b = new dyt();
        this.f19934f = new ArrayList();
        c4132a.mo3832d(R.string.upload_post_tag_title);
        c4132a.mo3829b((int) R.string.ok);
        c4132a.mo3827a(this.f19931c.bn());
        m24281b(c4132a);
        this.f19930b.m29887a(c4132a.mo3744a().m29337b(cph.m24291a(this, c4132a)));
        chn.P("AddTag");
    }

    /* renamed from: a */
    static /* synthetic */ void m24280a(cpg cpg, C4132a c4132a, Void voidR) {
        if (cpg.m24282g()) {
            c4132a.mo3830b(cpg.m24283h());
        }
    }

    /* renamed from: b */
    public void m24288b() {
        super.b();
    }

    /* renamed from: a */
    public void m24284a() {
        super.a();
        for (int i = 0; i < this.f19934f.size(); i++) {
            ((cpi) this.f19934f.get(i)).m24293a();
        }
        this.f19934f.clear();
        this.f19934f = null;
    }

    /* renamed from: a */
    public void m24287a(String str) {
        this.f19933e = str;
    }

    /* renamed from: e */
    public String m24289e() {
        return m24283h();
    }

    /* renamed from: f */
    public void m24290f() {
        ArrayList arrayList = new ArrayList();
        if (this.f19933e == null || this.f19933e.isEmpty()) {
            Object obj = arrayList;
        } else {
            List asList = Arrays.asList(this.f19933e.split(", "));
        }
        int i = 0;
        while (i < this.f19931c.bn()) {
            if (asList.size() > 0 && i < asList.size()) {
                ((cpi) this.f19934f.get(i)).m24298b((String) asList.get(i));
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m24281b(C4132a c4132a) {
        for (int i = 0; i < this.f19931c.bn(); i++) {
            C4133a a = m24279a(c4132a.getContext());
            cpi cpi = new cpi();
            this.f19934f.add(cpi);
            c4132a.mo3828a((PostTagInputView) a);
            cpi.m24296a(a);
            cpi.m24297a(String.format(c4132a.getContext().getString(R.string.upload_post_tag_hint), new Object[]{String.valueOf(i + 1)}));
            cpi.m24294a(this.f19931c.bk());
            if (i == 0) {
                cpi.m24299e();
            }
        }
    }

    /* renamed from: g */
    private boolean m24282g() {
        int bj = this.f19931c.bj();
        this.f19931c.bk();
        int i = 0;
        while (i < this.f19934f.size()) {
            cpi cpi = (cpi) this.f19934f.get(i);
            C4132a c4132a = (C4132a) d();
            if (c4132a == null) {
                return false;
            }
            if (!TextUtils.isEmpty(cpi.m24300f()) && cpi.m24300f().length() <= bj) {
                ((C4132a) d()).mo3831c(String.format(c4132a.getContext().getString(R.string.upload_post_tag_too_short), new Object[]{cpi.m24300f()}));
                cpi.m24299e();
                return false;
            } else if (this.f19929a.matcher(cpi.m24300f()).find()) {
                ((C4132a) d()).mo3831c(c4132a.getContext().getString(R.string.upload_post_tag_invalid));
                cpi.m24299e();
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    /* renamed from: h */
    private String m24283h() {
        Collection arrayList = new ArrayList();
        for (int i = 0; i < this.f19934f.size(); i++) {
            String f = ((cpi) this.f19934f.get(i)).m24300f();
            if (!f.isEmpty()) {
                arrayList.add(f.trim());
            }
        }
        Set<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(arrayList);
        String str = "";
        String str2 = "";
        for (String f2 : linkedHashSet) {
            str2 = str2 + str;
            str = ", ";
            str2 = str2 + f2;
        }
        return str2;
    }

    /* renamed from: a */
    private PostTagInputView m24279a(Context context) {
        PostTagInputView postTagInputView = new PostTagInputView(context);
        postTagInputView.setLayoutParams(new LayoutParams(-1, -2));
        return postTagInputView;
    }
}
