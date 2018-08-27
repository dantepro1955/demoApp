package com.p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.common.Priority;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.OpenUrlEvent;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import com.under9.android.remoteconfig.api.model.ApiAppLink;
import java.util.List;
import p000.dlm.C4972a;

/* compiled from: PromoBannerPagerAdapter */
/* renamed from: cgp */
public class cgp extends iv {
    /* renamed from: a */
    List<ApiAppLink> f9147a;
    /* renamed from: b */
    private C4060c f9148b = new C17181(this);

    /* compiled from: PromoBannerPagerAdapter */
    /* renamed from: cgp$1 */
    class C17181 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ cgp f9146a;

        C17181(cgp cgp) {
            this.f9146a = cgp;
        }

        /* renamed from: a */
        public void m13119a(View view, dlm dlm, UniversalImageView universalImageView) {
            dhe.c("exploreList", new OpenUrlEvent(((ApiAppLink) universalImageView.getTag()).url, view.getContext()));
        }
    }

    public cgp(List<ApiAppLink> list) {
        this.f9147a = list;
    }

    public int getCount() {
        return this.f9147a.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.explore_promo_item, viewGroup, false);
        String str = ((ApiAppLink) this.f9147a.get(i)).imageUrl;
        UniversalImageView universalImageView = (UniversalImageView) inflate.findViewById(R.id.thumbnail);
        universalImageView.setTag(this.f9147a.get(i));
        universalImageView.setAdapter(new C4972a().a(Priority.LOW).a(this.f9148b).a(str, 5, 1).b());
        viewGroup.addView(inflate);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
