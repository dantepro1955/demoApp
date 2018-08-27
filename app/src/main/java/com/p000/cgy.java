package com.p000;

import android.net.Uri;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiUser;

/* compiled from: UploadSectionListRenderer */
/* renamed from: cgy */
public class cgy extends cse<cay> {
    /* renamed from: a */
    private static int f9167a = -1;
    /* renamed from: b */
    private static RadioButton f9168b = null;
    /* renamed from: c */
    private static String f9169c = null;
    /* renamed from: d */
    private boolean f9170d = false;
    /* renamed from: e */
    private caf f9171e = caf.m12046a();
    /* renamed from: f */
    private ResizeOptions f9172f;

    /* compiled from: UploadSectionListRenderer */
    /* renamed from: cgy$a */
    public static class C1722a extends C0605t implements OnClickListener {
        /* renamed from: a */
        public SimpleDraweeView f9163a;
        /* renamed from: b */
        public TextView f9164b;
        /* renamed from: c */
        public TextView f9165c;
        /* renamed from: d */
        public RadioButton f9166d;

        public C1722a(View view) {
            super(view);
            this.f9163a = (SimpleDraweeView) view.findViewById(R.id.thumbnail);
            this.f9164b = (TextView) view.findViewById(R.id.sectionName);
            this.f9165c = (TextView) view.findViewById(R.id.sectionDescription);
            this.f9166d = (RadioButton) view.findViewById(R.id.radioBtn);
            this.f9166d.setOnClickListener(this);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (!(adapterPosition == cgy.f9167a || cgy.f9168b == null)) {
                cgy.f9168b.setChecked(false);
            }
            cgy.f9167a = adapterPosition;
            cgy.f9168b = this.f9166d;
            cgy.f9169c = (String) view.getTag();
            this.f9166d.setChecked(true);
            View rootView = view.getRootView();
            if (rootView != null) {
                ((Button) rootView.findViewById(R.id.btn_post)).setEnabled(true);
                chn.m13454t("STEP_1", String.format("sLastSelected=%s, sLastSelectedSection=%s", new Object[]{Integer.valueOf(cgy.f9167a), cgy.f9169c}));
            }
        }
    }

    public cgy() {
        f9167a = -1;
        f9168b = null;
        f9169c = null;
        this.f9172f = new ResizeOptions(256, 256);
    }

    /* renamed from: a */
    public C0605t m13157a(ViewGroup viewGroup, int i) {
        return new C1722a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.upload_section_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m13158a(C0605t c0605t, int i, cay cay) {
        C1722a c1722a = (C1722a) c0605t;
        if (this.f9170d) {
            ApiUser a = this.f9171e.m12075g().m13729g().m14203a();
            c1722a.f9164b.setText(c0605t.itemView.getContext().getString(R.string.upload_no_section));
            c1722a.f9165c.setText(c0605t.itemView.getContext().getString(R.string.uplaod_to_no_section));
            if (a.avatarUrlSmall != null) {
                c1722a.f9163a.setImageURI(Uri.parse(a.avatarUrlSmall));
            } else {
                c1722a.f9163a.setImageURI(Uri.parse("res:///2130838098"));
            }
        } else {
            c1722a.f9164b.setText(cay.m12208a());
            c1722a.f9165c.setText(cay.m12213f());
            c1722a.f9163a.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(c1722a.f9163a.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(cay.m12209b())).setResizeOptions(this.f9172f).build())).build());
            c1722a.itemView.setTag(cay.m12212e());
        }
        c1722a.f9166d.setChecked(i == f9167a);
        if (i == f9167a) {
            f9168b = c1722a.f9166d;
            f9169c = cay != null ? cay.m12212e() : null;
        }
    }

    /* renamed from: a */
    protected void m13160a(boolean z) {
        this.f9170d = z;
    }

    /* renamed from: a */
    public static int m13149a() {
        return f9167a;
    }

    /* renamed from: b */
    public static void m13153b() {
        f9167a = -1;
        f9168b = null;
        f9169c = null;
    }
}
