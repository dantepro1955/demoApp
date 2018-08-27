package com.p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.imagepipeline.common.RotationOptions;
import com.ninegag.android.app.R;
import com.ninegag.android.tv.otto.TVGoEmbedUrlEvent;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import p000.dlm.C4972a;

/* compiled from: HomeFeaturedPagerAdapter */
/* renamed from: cvm */
public class cvm extends iv {
    /* renamed from: a */
    private cvj f20306a;
    /* renamed from: b */
    private String f20307b;
    /* renamed from: c */
    private C4606a f20308c = new C4606a(this.f20307b);
    /* renamed from: d */
    private C4607b f20309d = new C4607b(this.f20307b);
    /* renamed from: e */
    private com f20310e;

    /* compiled from: HomeFeaturedPagerAdapter */
    /* renamed from: cvm$a */
    static class C4606a implements OnClickListener {
        /* renamed from: a */
        private String f20304a;

        public C4606a(String str) {
            this.f20304a = str;
        }

        public void onClick(View view) {
            dhe.m27287c(this.f20304a, new TVGoEmbedUrlEvent(view.getContext(), (cvl) view.getTag()));
        }
    }

    /* compiled from: HomeFeaturedPagerAdapter */
    /* renamed from: cvm$b */
    static class C4607b implements C4060c {
        /* renamed from: a */
        private String f20305a;

        public C4607b(String str) {
            this.f20305a = str;
        }

        /* renamed from: a */
        public void mo3751a(View view, dlm dlm, UniversalImageView universalImageView) {
            dhe.m27287c(this.f20305a, new TVGoEmbedUrlEvent(universalImageView.getContext(), (cvl) universalImageView.getTag()));
        }
    }

    public cvm(String str, cvj cvj, com com) {
        this.f20306a = cvj;
        this.f20307b = str;
        this.f20310e = com;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_featured_post_item, viewGroup, false);
        cvl cvl = (cvl) this.f20306a.get(i);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.setText(cvl.m25066a());
        UniversalImageView universalImageView = (UniversalImageView) inflate.findViewById(R.id.thumbnail);
        universalImageView.setAdapter(new C4972a().m27866a(cvl.m25068b(), 480, RotationOptions.ROTATE_270).m27862a(this.f20309d).m27872b());
        textView.setTag(cvl);
        universalImageView.setTag(cvl);
        textView.setOnClickListener(this.f20308c);
        if (this.f20310e.f16683a != null) {
            inflate.findViewById(R.id.container).setBackgroundColor(viewGroup.getContext().getResources().getColor(this.f20310e.f16683a.z()));
            universalImageView.m24151a(this.f20310e.f16683a.G());
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f20306a.size();
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getItemPosition(Object obj) {
        return -2;
    }
}
