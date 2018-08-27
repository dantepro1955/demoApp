package com.p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.feedback.model.Attachment;
import com.under9.android.lib.pickimage.otto.RequestImagePickEvent;
import com.under9.android.lib.widget.FixedRatioRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p000.dff.C4867a;
import p000.dff.C4868b;
import p000.dff.C4869c;

/* compiled from: FeedbackAttachmentController */
/* renamed from: dfj */
public class dfj extends dfx {
    /* renamed from: a */
    LinearLayout f21489a;
    /* renamed from: b */
    int f21490b;
    /* renamed from: c */
    ArrayList<Attachment> f21491c;
    /* renamed from: d */
    Context f21492d;
    /* renamed from: e */
    LayoutInflater f21493e;

    /* compiled from: FeedbackAttachmentController */
    /* renamed from: dfj$1 */
    class C48711 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ dfj f21486a;

        C48711(dfj dfj) {
            this.f21486a = dfj;
        }

        public void onClick(View view) {
            if (!bww.a()) {
                final dhi a = dhj.m27298a((ViewGroup) ((Activity) this.f21486a.f21489a.getContext()).findViewById(16908290), C4869c.permission_upload_photo_never_asked, "android.permission.WRITE_EXTERNAL_STORAGE");
                bww.a(new bxm(new bxo[]{new bxo(this) {
                    /* renamed from: b */
                    final /* synthetic */ C48711 f21485b;

                    /* renamed from: a */
                    public void m26987a(bxi bxi) {
                        this.f21485b.f21486a.m27007i();
                    }

                    /* renamed from: a */
                    public void m26986a(bxh bxh) {
                        a.m27297a(bxh);
                    }

                    /* renamed from: a */
                    public void m26988a(bxj bxj, bxe bxe) {
                        bxe.a();
                    }
                }}), "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
    }

    public dfj() {
        this(3);
    }

    public dfj(int i) {
        this.f21490b = i;
        this.f21491c = new ArrayList();
    }

    /* renamed from: b */
    public void mo4388b(Bundle bundle) {
        if (bundle != null) {
            this.f21490b = bundle.getInt("feedback_attachment_controlller_max_count");
            String[] stringArray = bundle.getStringArray("feedback_attachment_controlller_list");
            if (stringArray != null) {
                for (String str : stringArray) {
                    this.f21491c.add(new Attachment(str, dja.m27557a(str, (int) HttpStatus.HTTP_OK)));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4387a(Bundle bundle) {
        bundle.putInt("feedback_attachment_controlller_max_count", this.f21490b);
        bundle.putStringArray("feedback_attachment_controlller_list", m27009k());
    }

    public void w_() {
        m27004f();
    }

    /* renamed from: a */
    public void m26997a(LinearLayout linearLayout) {
        this.f21489a = linearLayout;
        this.f21492d = this.f21489a.getContext();
        this.f21493e = (LayoutInflater) this.f21492d.getSystemService("layout_inflater");
    }

    /* renamed from: f */
    public void m27004f() {
        m27005g();
        Iterator it = this.f21491c.iterator();
        while (it.hasNext()) {
            m27001c((Attachment) it.next());
        }
        if (this.f21491c.size() < this.f21490b) {
            m27006h();
        }
    }

    /* renamed from: g */
    public void m27005g() {
        this.f21489a.removeAllViews();
    }

    /* renamed from: a */
    public void m26998a(Attachment attachment) {
        this.f21491c.add(attachment);
        m27004f();
    }

    /* renamed from: b */
    public void m27000b(Attachment attachment) {
        this.f21491c.remove(attachment);
        m27004f();
    }

    /* renamed from: c */
    public void m27001c(Attachment attachment) {
        if (this.f21489a.getChildCount() < this.f21490b) {
            this.f21489a.addView(m27002d(attachment), m26995l());
        }
    }

    /* renamed from: d */
    protected View m27002d(Attachment attachment) {
        FixedRatioRelativeLayout fixedRatioRelativeLayout = (FixedRatioRelativeLayout) this.f21493e.inflate(C4868b.feedback_form_attachment_item, null);
        fixedRatioRelativeLayout.findViewById(C4867a.feedbackAttachmentDismiss).setOnClickListener(m27003e(attachment));
        fixedRatioRelativeLayout.setRatio(1.0f);
        djy.m27642b(fixedRatioRelativeLayout, C4867a.image).setImageBitmap(attachment.thumb);
        return fixedRatioRelativeLayout;
    }

    /* renamed from: h */
    public void m27006h() {
        this.f21489a.addView(m27008j(), m26995l());
    }

    /* renamed from: i */
    public void m27007i() {
        dhe.m27286c(new RequestImagePickEvent());
    }

    /* renamed from: j */
    protected View m27008j() {
        FixedRatioRelativeLayout fixedRatioRelativeLayout = (FixedRatioRelativeLayout) this.f21493e.inflate(C4868b.feedback_form_attachment_add, null);
        fixedRatioRelativeLayout.findViewById(C4867a.btnAdd).setOnClickListener(new C48711(this));
        fixedRatioRelativeLayout.setRatio(1.0f);
        return fixedRatioRelativeLayout;
    }

    /* renamed from: k */
    public String[] m27009k() {
        int size = this.f21491c.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Attachment) this.f21491c.get(i)).path;
        }
        return strArr;
    }

    /* renamed from: l */
    private LayoutParams m26995l() {
        LayoutParams layoutParams = new LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    /* renamed from: e */
    protected OnClickListener m27003e(final Attachment attachment) {
        return new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ dfj f21488b;

            public void onClick(View view) {
                this.f21488b.m27000b(attachment);
            }
        };
    }
}
