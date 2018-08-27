package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import p000.ccp.C1665b;

/* compiled from: MoPubNsfwPostRenderer */
/* renamed from: cds */
public class cds extends cdn {
    /* renamed from: d */
    boolean f8829d = true;
    /* renamed from: e */
    OnClickListener f8830e = new C16841(this);

    /* compiled from: MoPubNsfwPostRenderer */
    /* renamed from: cds$1 */
    class C16841 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cds f8828a;

        C16841(cds cds) {
            this.f8828a = cds;
        }

        public void onClick(View view) {
            if (view.getId() == R.id.unsafeMask) {
                dhe.c(this.f8828a.a, new GagPostItemActionEvent(10, (cct) view.getTag()));
            }
        }
    }

    public cds(String str, com com, boolean z, boolean z2, cco cco) {
        super(str, com, z, cco);
        this.f8829d = z2;
    }

    /* renamed from: a */
    public C0605t mo1646a(ViewGroup viewGroup, int i) {
        if (!this.f8829d) {
            return super.mo1646a(viewGroup, i);
        }
        cro cro = (cro) crj.b(cro.class);
        boolean z = (cro == null || cro.c().intValue() == cro.a().intValue()) ? false : true;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(z ? R.layout.post_item_v3_nsfw_native : R.layout.post_item_v3_nsfw, viewGroup, false);
        C0605t cdu = new cdu(inflate, m12419b().f16683a);
        cdu.mo1630a();
        inflate.setTag(cdu);
        mo1676a(cdu);
        m12417a(z, inflate);
        return cdu;
    }

    /* renamed from: a */
    public void mo1647a(C0605t c0605t, int i, cct cct) {
        if (this.f8829d && (c0605t instanceof cdu)) {
            cdu cdu = (cdu) c0605t;
            cdu.f8847F.setTag(cct);
            m12422b(cdu, cct);
            m12415a((C1665b) cdu, i, cct);
            if (m12418a()) {
                mo1703a((C1665b) cdu, cct);
                return;
            } else {
                cdu.d.setVisibility(8);
                return;
            }
        }
        super.mo1647a(c0605t, i, cct);
    }

    /* renamed from: a */
    protected void mo1676a(C1665b c1665b) {
        super.mo1676a(c1665b);
        if (this.f8829d) {
            ((cdu) c1665b).f8847F.setOnClickListener(this.f8830e);
        }
    }
}
