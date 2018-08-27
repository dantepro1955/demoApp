package com.sept.android.lib.widget.universalimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sept.android.lib.widget.CustomRatioAsyncImageView;
import com.sept.android.lib.widget.universalimageview.imagetile.TilingView;
import com.sept.android.lib.widget.universalimageview.imagetile.ZoomTilingView;
import java.io.File;
import java.lang.ref.WeakReference;
import p000.cxe;
import p000.cxk;
import p000.cyd;
import p000.cye;
import p000.dkc.C4941a;
import p000.dkc.C4943c;
import p000.dkc.C4944d;
import p000.dle;
import p000.dle.C4500a;
import p000.dlf;
import p000.dls;
import p000.dlt;
import p000.dlv;
import p000.dlw;
import p000.dma;
import p000.dmc;

public class UniversalImageView extends FrameLayout implements OnClickListener, OnLongClickListener {
    /* renamed from: a */
    public static int f19846a = 700;
    /* renamed from: b */
    public static int f19847b = 800;
    /* renamed from: c */
    private C4512i f19848c;
    /* renamed from: d */
    private dlt f19849d;
    /* renamed from: e */
    private String f19850e;

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$1 */
    class C45031 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UniversalImageView f19820a;

        C45031(UniversalImageView universalImageView) {
            this.f19820a = universalImageView;
        }

        public void run() {
            this.f19820a.f19848c.f19833b.setVisibility(8);
            this.f19820a.f19848c.f19832a.setVisibility(8);
            this.f19820a.f19848c.f19838g.setVisibility(8);
        }
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$a */
    public enum C4504a {
        f19821a,
        ANIMATED
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$b */
    public interface C4505b {
        /* renamed from: a */
        void m24163a(View view, dlt dlt, UniversalImageView universalImageView);
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$c */
    public interface C4506c {
        /* renamed from: a */
        void m24164a(View view, dlt dlt, UniversalImageView universalImageView);
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$d */
    public interface C4507d {
        /* renamed from: a */
        void mo4441a();

        /* renamed from: b */
        void mo4442b();
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$e */
    static class C4508e implements cyd {
        /* renamed from: a */
        protected WeakReference<C4512i> f19824a;
        /* renamed from: b */
        protected WeakReference<View> f19825b;
        /* renamed from: c */
        protected WeakReference<dlt> f19826c;

        private C4508e(C4512i c4512i, View view, dlt dlt) {
            this.f19824a = new WeakReference(c4512i);
            this.f19825b = new WeakReference(view);
            this.f19826c = new WeakReference(dlt);
        }

        /* renamed from: a */
        private ProgressBar m24171a() {
            C4512i c4512i = (C4512i) this.f19824a.get();
            if (c4512i != null) {
                return c4512i.f19842k;
            }
            return null;
        }

        /* renamed from: a */
        private void m24172a(boolean z) {
            dlt dlt = (dlt) this.f19826c.get();
            if (dlt == null || dlt.f22122q) {
                ProgressBar a = m24171a();
                if (a != null) {
                    a.setVisibility(0);
                    if (!z) {
                        a.setMax(100);
                        a.setProgress(0);
                    }
                    a.setIndeterminate(z);
                }
            }
        }

        /* renamed from: b */
        private void m24173b() {
            ProgressBar a = m24171a();
            if (a != null) {
                a.setVisibility(4);
            }
        }

        /* renamed from: c */
        private void m24174c() {
            dlt dlt = (dlt) this.f19826c.get();
            if (dlt != null) {
                dlt.f22127v.mo4442b();
            }
        }

        /* renamed from: d */
        private void m24175d() {
            dlt dlt = (dlt) this.f19826c.get();
            if (dlt != null) {
                dlt.f22127v.mo4441a();
            }
        }

        /* renamed from: a */
        public void mo4092a(String str, View view) {
            m24174c();
            m24172a(false);
        }

        /* renamed from: a */
        public void mo4094a(String str, View view, cxk cxk) {
            m24175d();
            m24173b();
        }

        /* renamed from: a */
        public void mo4093a(String str, View view, Bitmap bitmap) {
            m24175d();
            m24173b();
            View view2 = (View) this.f19825b.get();
            if (view2 != null) {
                view2.postInvalidate();
            }
        }

        /* renamed from: b */
        public void mo4095b(String str, View view) {
            m24175d();
            m24173b();
        }
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$f */
    static class C4509f implements cye {
        /* renamed from: a */
        private WeakReference<C4512i> f19827a;
        /* renamed from: b */
        private WeakReference<dlt> f19828b;

        private C4509f(C4512i c4512i, dlt dlt) {
            this.f19827a = new WeakReference(c4512i);
            this.f19828b = new WeakReference(dlt);
        }
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$g */
    static class C4510g extends C4508e {
        /* renamed from: d */
        private String f19829d;
        /* renamed from: e */
        private WeakReference<UniversalImageView> f19830e;

        private C4510g(C4512i c4512i, String str, UniversalImageView universalImageView, dlt dlt) {
            super(c4512i, null, dlt);
            this.f19829d = str;
            this.f19830e = new WeakReference(universalImageView);
            c4512i.f19837f.setTag(C4943c.universal_image_view_mp4_uri, str);
        }

        /* renamed from: a */
        public void mo4093a(String str, View view, Bitmap bitmap) {
            super.mo4093a(str, view, bitmap);
            C4512i c4512i = (C4512i) this.a.get();
            if (c4512i != null) {
                View view2 = c4512i.f19837f;
                if (view2 != null) {
                    UniversalImageView universalImageView = (UniversalImageView) this.f19830e.get();
                    if (universalImageView != null) {
                        Object tag = view2.getTag(C4943c.universal_image_view_mp4_uri);
                        if (tag != null && (tag instanceof String) && tag.equals(this.f19829d)) {
                            universalImageView.m24190a(false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$h */
    static class C4511h implements C4500a {
        /* renamed from: a */
        private WeakReference<UniversalImageView> f19831a;

        private C4511h(UniversalImageView universalImageView) {
            this.f19831a = new WeakReference(universalImageView);
        }

        /* renamed from: a */
        public void mo4087a() {
            UniversalImageView universalImageView = (UniversalImageView) this.f19831a.get();
            if (universalImageView != null) {
                universalImageView.m24195d();
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalImageView$i */
    class C4512i {
        /* renamed from: a */
        CustomRatioAsyncImageView f19832a;
        /* renamed from: b */
        ImageView f19833b;
        /* renamed from: c */
        TilingView f19834c;
        /* renamed from: d */
        ZoomTilingView f19835d;
        /* renamed from: e */
        TextView f19836e;
        /* renamed from: f */
        View f19837f;
        /* renamed from: g */
        View f19838g;
        /* renamed from: h */
        LinearLayout f19839h;
        /* renamed from: i */
        View f19840i;
        /* renamed from: j */
        TextView f19841j;
        /* renamed from: k */
        ProgressBar f19842k;
        /* renamed from: l */
        View f19843l;
        /* renamed from: m */
        View f19844m;
        /* renamed from: n */
        final /* synthetic */ UniversalImageView f19845n;

        private C4512i(UniversalImageView universalImageView) {
            this.f19845n = universalImageView;
        }

        /* renamed from: a */
        public void m24184a(View view) {
            this.f19832a = (CustomRatioAsyncImageView) view.findViewById(C4943c.async_image);
            this.f19833b = (ImageView) view.findViewById(C4943c.badge);
            this.f19834c = (TilingView) view.findViewById(C4943c.tiling);
            this.f19835d = (ZoomTilingView) view.findViewById(C4943c.zoomTiling);
            this.f19836e = (TextView) view.findViewById(C4943c.failMessage);
            this.f19839h = (LinearLayout) view.findViewById(C4943c.mobileCover);
            this.f19840i = view.findViewById(C4943c.mobileCoverSaw);
            this.f19841j = (TextView) view.findViewById(C4943c.mobileCoverMessage);
            this.f19842k = (ProgressBar) view.findViewById(C4943c.uivProgressBar);
            this.f19837f = view.findViewById(C4943c.gifView);
            this.f19838g = view.findViewById(C4943c.playerCover);
            this.f19844m = view.findViewById(C4943c.imageContainer);
            this.f19843l = view;
        }

        /* renamed from: a */
        public void m24182a(OnClickListener onClickListener) {
            this.f19832a.setOnClickListener(onClickListener);
            this.f19834c.setOnClickListener(onClickListener);
            this.f19835d.setOnClickListener(onClickListener);
            this.f19837f.setOnClickListener(onClickListener);
        }

        /* renamed from: a */
        public void m24183a(OnLongClickListener onLongClickListener) {
            this.f19832a.setOnLongClickListener(onLongClickListener);
            this.f19834c.setOnLongClickListener(onLongClickListener);
            this.f19835d.setOnLongClickListener(onLongClickListener);
            this.f19837f.setOnLongClickListener(onLongClickListener);
        }
    }

    public UniversalImageView(Context context) {
        super(context);
        m24186a();
    }

    public UniversalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24186a();
    }

    public UniversalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24186a();
    }

    /* renamed from: a */
    private void m24186a() {
        View inflate = View.inflate(getContext(), C4944d.universal_image_view, null);
        this.f19848c = new C4512i();
        this.f19848c.m24184a(inflate);
        this.f19848c.m24182a((OnClickListener) this);
        this.f19848c.m24183a((OnLongClickListener) this);
        this.f19848c.f19837f.setTag(C4943c.mp4_view_on_stop_listener, new C4511h());
        addView(inflate);
    }

    public void setAdapter(dlt dlt) {
        View view;
        if (dlt.f22107b) {
            this.f19848c.f19839h.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C4941a.cover_padding);
            this.f19848c.f19843l.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            if (dlt.f22116k != null) {
                this.f19848c.f19841j.setText(dlt.f22116k);
            }
        } else {
            this.f19848c.f19839h.setVisibility(8);
            this.f19848c.f19843l.setPadding(0, 0, 0, 0);
        }
        LayoutParams layoutParams;
        if (dlt.f22121p) {
            layoutParams = this.f19848c.f19844m.getLayoutParams();
            layoutParams.height = -1;
            this.f19848c.f19844m.setLayoutParams(layoutParams);
        } else {
            layoutParams = this.f19848c.f19844m.getLayoutParams();
            layoutParams.height = -2;
            this.f19848c.f19844m.setLayoutParams(layoutParams);
        }
        if (dlt.f22109d != -1) {
            this.f19848c.f19833b.setImageResource(dlt.f22109d);
        } else {
            this.f19848c.f19833b.setImageBitmap(null);
        }
        this.f19848c.f19832a.setBoundedHeight(dlt.f22120o);
        dlf.m27823b(this.f19848c.f19837f, dlt.f22120o);
        if (dlt.f22108c == C4504a.ANIMATED) {
            m24187a(dlt.f22110e, dlt.f22111f);
            if (this.f19849d == null || !dlt.f22115j.equals(this.f19849d.f22115j)) {
                m24196e();
                this.f19848c.f19833b.setVisibility(0);
            }
        } else {
            m24187a(dlt.f22110e, dlt.f22111f);
            dle.m27812a(this.f19848c.f19837f);
            this.f19848c.f19838g.setVisibility(8);
            this.f19848c.f19832a.setVisibility(0);
            if (dlt.f22109d != -1) {
                this.f19848c.f19833b.setVisibility(0);
            } else {
                this.f19848c.f19833b.setVisibility(8);
            }
        }
        this.f19848c.f19837f.requestLayout();
        if (!(this.f19850e == null || this.f19850e.equals(dlt.f22114i))) {
            this.f19848c.f19832a.setImageBitmap(null);
        }
        this.f19850e = dlt.f22114i;
        this.f19849d = dlt;
        dmc dmc;
        if (dlt.f22118m) {
            if (dlt.f22123r != null) {
                dmc = dlt.f22123r;
            } else if (m24193b()) {
                dmc = new dlw(dlt.f22114i, dlt.f22110e, dlt.f22111f);
            } else {
                dmc = new dlv(dlt.f22114i, dlt.f22110e, dlt.f22111f);
            }
            dmc.m27912a(dlt.f22112g);
            dmc.m27916b(dlt.f22113h);
            this.f19848c.f19835d.setVisibility(0);
            this.f19848c.f19835d.setTileAdapter(dmc);
            this.f19848c.f19835d.setZoomControllerListener(dlt.f22124s);
            this.f19848c.f19834c.setVisibility(8);
            this.f19848c.f19834c.setTileAdapter(null);
            this.f19848c.f19832a.setVisibility(8);
            this.f19848c.f19838g.setVisibility(8);
            view = this.f19848c.f19835d;
        } else {
            View view2;
            if (m24193b()) {
                dmc = new dlw(dlt.f22114i, dlt.f22110e, dlt.f22111f);
                this.f19848c.f19834c.setVisibility(0);
                this.f19848c.f19834c.setTileAdapter(dmc);
                this.f19848c.f19832a.setVisibility(8);
                this.f19848c.f19838g.setVisibility(8);
                view2 = this.f19848c.f19834c;
            } else {
                this.f19848c.f19834c.setVisibility(8);
                this.f19848c.f19834c.setTileAdapter(null);
                this.f19848c.f19838g.setVisibility(0);
                this.f19848c.f19832a.setVisibility(0);
                this.f19848c.f19832a.setDimension(dlt.f22110e, dlt.f22111f);
                view2 = this.f19848c.f19832a;
            }
            this.f19848c.f19835d.setVisibility(8);
            this.f19848c.f19835d.setTileAdapter(null);
            this.f19848c.f19835d.setZoomControllerListener(null);
            view = view2;
        }
        if (this.f19849d.f22122q) {
            this.f19848c.f19842k.setVisibility(0);
        } else {
            this.f19848c.f19842k.setVisibility(8);
        }
        cye a = dls.m27903a(dlt.f22114i);
        a.m27904a(new C4509f(this.f19848c, this.f19849d));
        cxe.m25487a().m25491a(dlt.f22114i, this.f19848c.f19832a, null, new C4508e(this.f19848c, view, this.f19849d), a);
    }

    /* renamed from: b */
    private boolean m24193b() {
        if (this.f19849d == null) {
            return false;
        }
        return dma.f22154c.equals(dma.m27961b(this.f19849d.f22114i));
    }

    public void invalidate() {
        super.invalidate();
        if (this.f19849d != null) {
            if (this.f19849d.f22118m) {
                this.f19848c.f19835d.invalidate();
            } else if (m24193b()) {
                this.f19848c.f19834c.invalidate();
            } else {
                this.f19848c.f19832a.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m24187a(int i, int i2) {
        dlf.m27817a(this.f19848c.f19837f, i, i2, false);
    }

    public boolean onLongClick(View view) {
        if (this.f19849d.f22126u != null) {
            this.f19849d.f22126u.m24164a(view, this.f19849d, this);
        }
        return false;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4943c.async_image) {
            m24191b(view);
        } else if (id == C4943c.gifView) {
            m24188a(view);
        } else if (id == C4943c.tiling) {
            m24191b(view);
        } else if (id == C4943c.zoomTiling) {
            m24191b(view);
        }
    }

    /* renamed from: a */
    private void m24188a(View view) {
        if (this.f19849d.f22108c == C4504a.ANIMATED && this.f19849d.f22117l) {
            m24194c();
        }
        if (this.f19849d.f22125t != null) {
            this.f19849d.f22125t.m24163a(view, this.f19849d, this);
        }
    }

    /* renamed from: b */
    private void m24191b(View view) {
        if (this.f19849d.f22108c == C4504a.ANIMATED && this.f19849d.f22117l) {
            m24194c();
        }
        if (this.f19849d.f22125t != null) {
            this.f19849d.f22125t.m24163a(view, this.f19849d, this);
        }
    }

    /* renamed from: c */
    private void m24194c() {
        if (dlf.m27821a(this.f19848c.f19837f)) {
            m24196e();
        } else {
            m24197f();
        }
    }

    /* renamed from: d */
    private void m24195d() {
        if (this.f19849d != null && this.f19848c != null && this.f19849d.f22108c == C4504a.ANIMATED) {
            this.f19848c.f19833b.setVisibility(0);
            this.f19848c.f19832a.setVisibility(0);
            this.f19848c.f19838g.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m24196e() {
        m24195d();
        dle.m27812a(this.f19848c.f19837f);
    }

    /* renamed from: f */
    private void m24197f() {
        m24190a(true);
    }

    /* renamed from: a */
    private void m24190a(boolean z) {
        this.f19848c.f19833b.setVisibility(8);
        File a = cxe.m25487a().m25498c().m25405a(this.f19849d.f22115j);
        if (a != null && a.exists()) {
            dlf.m27817a(this.f19848c.f19837f, this.f19849d.f22110e, this.f19849d.f22111f, false);
            dlf.m27819a(this.f19848c.f19837f, a.getAbsolutePath());
            dle.m27813a(this.f19848c.f19837f, new C45031(this));
        } else if (z) {
            C4510g c4510g = new C4510g(this.f19848c, this.f19849d.f22115j, this, this.f19849d);
            cye a2 = dls.m27903a(this.f19849d.f22115j);
            a2.m27904a(new C4509f(this.f19848c, this.f19849d));
            cxe.m25487a().m25493a(this.f19849d.f22115j, null, null, (cyd) c4510g, a2);
        }
    }
}
