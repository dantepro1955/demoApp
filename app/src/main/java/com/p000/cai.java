package com.p000;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.browser.GagInAppBrowserFragment;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;

/* compiled from: GagIABController */
/* renamed from: cai */
public class cai {
    /* renamed from: a */
    private static caf f8486a = caf.m12046a();
    /* renamed from: b */
    private ImageView f8487b;
    /* renamed from: c */
    private ImageView f8488c;
    /* renamed from: d */
    private ImageView f8489d;
    /* renamed from: e */
    private ImageView f8490e;
    /* renamed from: f */
    private TextView f8491f;
    /* renamed from: g */
    private TextView f8492g;
    /* renamed from: h */
    private TextView f8493h;
    /* renamed from: i */
    private Toolbar f8494i;
    /* renamed from: j */
    private cct f8495j;
    /* renamed from: k */
    private OnClickListener f8496k = new C16371(this);

    /* compiled from: GagIABController */
    /* renamed from: cai$1 */
    class C16371 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cai f8485a;

        C16371(cai cai) {
            this.f8485a = cai;
        }

        public void onClick(View view) {
            int id = view.getId();
            Context context = view.getContext();
            if (id == R.id.upVoteBtn) {
                this.f8485a.m12111a(context, this.f8485a.f8495j, 1);
                this.f8485a.m12115b();
            } else if (id == R.id.downVoteBtn) {
                this.f8485a.m12111a(context, this.f8485a.f8495j, -1);
                this.f8485a.m12115b();
            } else if (id == R.id.commentBtn) {
                dhe.c(GagInAppBrowserFragment.f18070c, new GagPostItemActionEvent(2, this.f8485a.f8495j));
            } else if (id == R.id.btnShare) {
                dhe.c(GagInAppBrowserFragment.f18070c, new GagPostItemActionEvent(3, this.f8485a.f8495j));
            } else if (id == R.id.moreBtn) {
                dhe.c(GagInAppBrowserFragment.f18070c, new GagPostItemActionEvent(9, this.f8485a.f8495j));
            }
        }
    }

    /* renamed from: a */
    public void m12120a(View view, cct cct) {
        this.f8495j = cct;
        this.f8487b = (ImageView) view.findViewById(R.id.upVoteBtn);
        this.f8488c = (ImageView) view.findViewById(R.id.downVoteBtn);
        this.f8489d = (ImageView) view.findViewById(R.id.moreBtn);
        this.f8490e = (ImageView) view.findViewById(R.id.commentBtn);
        this.f8491f = (TextView) view.findViewById(R.id.btnShare);
        this.f8494i = (Toolbar) view.findViewById(R.id.toolbar);
        m12112a(this.f8496k);
        m12110a(view.getContext());
        m12115b();
    }

    /* renamed from: a */
    public void m12119a() {
        this.f8495j = null;
        m12112a(null);
        this.f8487b = null;
        this.f8488c = null;
        this.f8489d = null;
        this.f8490e = null;
        this.f8491f = null;
        this.f8492g = null;
        this.f8493h = null;
        this.f8494i = null;
    }

    /* renamed from: a */
    private void m12110a(Context context) {
        if (this.f8495j != null && this.f8495j.R() != null && !f8486a.m12094x().m12104c()) {
            this.f8495j.m12266J();
        }
    }

    /* renamed from: b */
    private void m12115b() {
        if (this.f8495j != null && this.f8495j.R() != null) {
            this.f8487b.getContext().getResources();
            if (this.f8495j.m12295r() == 1) {
                this.f8487b.setImageResource(R.drawable.ic_overlay_upvote_selected);
            } else {
                this.f8487b.setImageResource(R.drawable.ic_overlay_upvote);
            }
            if (this.f8495j.m12295r() == -1) {
                this.f8488c.setImageResource(R.drawable.ic_overlay_downvote_selected);
            } else {
                this.f8488c.setImageResource(R.drawable.ic_overlay_downvote);
            }
            m12118c();
        }
    }

    /* renamed from: c */
    private void m12118c() {
        this.f8494i.setSubtitle(this.f8495j.m12274a(f8486a.f8449a));
    }

    /* renamed from: a */
    private void m12112a(OnClickListener onClickListener) {
        this.f8487b.setOnClickListener(onClickListener);
        this.f8488c.setOnClickListener(onClickListener);
        this.f8490e.setOnClickListener(onClickListener);
        if (this.f8489d != null) {
            this.f8489d.setOnClickListener(onClickListener);
        }
        if (this.f8491f != null) {
            this.f8491f.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    private void m12111a(Context context, cct cct, int i) {
        if (!f8486a.m12094x().m12104c()) {
            if (i == 1) {
                cct.m12267K();
                cre.a(context, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            } else {
                cct.m12268L();
                cre.b(context, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            }
            cct.m12269M();
        } else if (i == 1) {
            m12114a(cct);
        } else if (i == -1) {
            m12117b(cct);
        }
    }

    /* renamed from: a */
    private void m12114a(cct cct) {
        boolean K = cct.m12267K();
        String e = cct.m12282e();
        cct.m12269M();
        if (K) {
            chn.m13373a(e, 1);
            chr.m13522a().m13542a(e, 1, "", true, -1);
            return;
        }
        chn.m13373a(e, 0);
        chr.m13522a().m13542a(e, 0, "", true, -1);
    }

    /* renamed from: b */
    private void m12117b(cct cct) {
        boolean L = cct.m12268L();
        String e = cct.m12282e();
        cct.m12269M();
        if (L) {
            chn.m13373a(e, -1);
            chr.m13522a().m13542a(e, -1, "", true, -1);
            return;
        }
        chn.m13373a(e, 0);
        chr.m13522a().m13542a(e, 0, "", true, -1);
    }
}
