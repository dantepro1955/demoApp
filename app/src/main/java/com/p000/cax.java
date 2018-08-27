package com.p000;

import android.net.Uri;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiGroup.ApiGroupPreviewGag;
import com.ninegag.android.app.otto.GoGroupEvent;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;

/* compiled from: ExploreRenderer */
/* renamed from: cax */
public class cax extends cse<cay> {
    /* renamed from: a */
    private com f8562a;
    /* renamed from: b */
    private String f8563b;
    /* renamed from: c */
    private C1646a f8564c;
    /* renamed from: d */
    private ResizeOptions f8565d;
    /* renamed from: e */
    private caf f8566e = caf.m12046a();
    /* renamed from: f */
    private C4060c f8567f = new C16451(this);

    /* compiled from: ExploreRenderer */
    /* renamed from: cax$1 */
    class C16451 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ cax f8553a;

        C16451(cax cax) {
            this.f8553a = cax;
        }

        /* renamed from: a */
        public void m12199a(View view, dlm dlm, UniversalImageView universalImageView) {
            this.f8553a.f8564c.onClick(universalImageView);
        }
    }

    /* compiled from: ExploreRenderer */
    /* renamed from: cax$a */
    static class C1646a implements OnClickListener {
        /* renamed from: a */
        cay f8554a;
        /* renamed from: b */
        private String f8555b;

        public C1646a(String str) {
            this.f8555b = str;
        }

        public void onClick(View view) {
            this.f8554a = (cay) view.getTag();
            dhe.c(this.f8555b, new GoGroupEvent(view.getContext(), this.f8554a));
        }
    }

    /* compiled from: ExploreRenderer */
    /* renamed from: cax$b */
    public static class C1647b extends C0605t {
        /* renamed from: a */
        public SimpleDraweeView f8556a;
        /* renamed from: b */
        public SimpleDraweeView f8557b;
        /* renamed from: c */
        public SimpleDraweeView f8558c;
        /* renamed from: d */
        public SimpleDraweeView f8559d;
        /* renamed from: e */
        public TextView f8560e;
        /* renamed from: f */
        public View f8561f;

        public C1647b(View view) {
            super(view);
            m12200a(view);
            m12201b(view);
        }

        /* renamed from: a */
        private void m12200a(View view) {
            this.f8561f = view.findViewById(R.id.divider);
            this.f8556a = (SimpleDraweeView) view.findViewById(R.id.leftIcon);
            this.f8560e = (TextView) view.findViewById(R.id.t1);
        }

        /* renamed from: b */
        private void m12201b(View view) {
            this.f8557b = (SimpleDraweeView) view.findViewById(R.id.p1);
            this.f8558c = (SimpleDraweeView) view.findViewById(R.id.p2);
            this.f8559d = (SimpleDraweeView) view.findViewById(R.id.p3);
        }
    }

    public cax(com com, String str) {
        this.f8562a = com;
        this.f8563b = str;
        this.f8564c = new C1646a(str);
        this.f8565d = new ResizeOptions(HttpStatus.HTTP_OK, HttpStatus.HTTP_OK);
    }

    /* renamed from: a */
    public C0605t m12205a(ViewGroup viewGroup, int i) {
        C0605t c1647b = new C1647b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_item_explore_section_row, viewGroup, false));
        c1647b.itemView.setOnClickListener(this.f8564c);
        return c1647b;
    }

    /* renamed from: a */
    public void m12206a(C0605t c0605t, int i, cay cay) {
        C1647b c1647b = (C1647b) c0605t;
        cay tag = c1647b.itemView.getTag();
        if (tag == null || tag != cay) {
            c1647b.itemView.setTag(cay);
            c1647b.f8557b.setTag(cay);
            c1647b.f8558c.setTag(cay);
            c1647b.f8559d.setTag(cay);
            c1647b.f8560e.setText(cay.m12208a());
            c1647b.f8556a.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(cay.m12209b())).setResizeOptions(this.f8565d).setRequestPriority(Priority.LOW).build())).setOldController(c1647b.f8556a.getController())).build());
            c1647b.itemView.setOnClickListener(this.f8564c);
            if (cay.m12214g() != null) {
                ApiGroupPreviewGag[] g = cay.m12214g();
                if (g.length >= 1) {
                    String str = "";
                    c1647b.f8557b.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(cax.m12203a(g[0]))).setProgressiveRenderingEnabled(true).setResizeOptions(this.f8565d).setRequestPriority(Priority.LOW).build())).setOldController(c1647b.f8557b.getController())).build());
                }
                if (g.length >= 2) {
                    c1647b.f8558c.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(cax.m12203a(g[1]))).setProgressiveRenderingEnabled(true).setResizeOptions(this.f8565d).setRequestPriority(Priority.LOW).build())).setOldController(c1647b.f8558c.getController())).build());
                }
                if (g.length == 3) {
                    c1647b.f8559d.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(cax.m12203a(g[2]))).setProgressiveRenderingEnabled(true).setResizeOptions(this.f8565d).setRequestPriority(Priority.LOW).build())).setOldController(c1647b.f8559d.getController())).build());
                }
            }
            m12204a(c0605t.itemView, c1647b, this.f8562a.f16683a);
        }
    }

    /* renamed from: a */
    private void m12204a(View view, C1647b c1647b, cnt cnt) {
        if (cnt != null) {
            view.setBackgroundResource(cnt.mo1830k());
            c1647b.f8560e.setTextColor(view.getContext().getResources().getColor(cnt.mo1831l()));
            c1647b.f8556a.setBackgroundColor(view.getContext().getResources().getColor(cnt.mo1845z()));
            c1647b.f8561f.setBackgroundResource(cnt.mo1826g());
            c1647b.f8557b.setBackgroundColor(view.getContext().getResources().getColor(cnt.mo1845z()));
            c1647b.f8558c.setBackgroundColor(view.getContext().getResources().getColor(cnt.mo1845z()));
            c1647b.f8559d.setBackgroundColor(view.getContext().getResources().getColor(cnt.mo1845z()));
        }
    }

    /* renamed from: a */
    private static String m12203a(ApiGroupPreviewGag apiGroupPreviewGag) {
        try {
            return apiGroupPreviewGag.images.imageFbThumbnail.url;
        } catch (Exception e) {
            return "";
        }
    }
}
