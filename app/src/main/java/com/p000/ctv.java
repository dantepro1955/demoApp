package com.p000;

import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.ctu.C4581b;
import p000.ctu.C4582c;

/* compiled from: UploadDialogImageAdapter */
/* renamed from: ctv */
public class ctv extends C0581a {
    /* renamed from: a */
    private ctx f20200a;
    /* renamed from: b */
    private List<MediaMeta> f20201b;
    /* renamed from: c */
    private int f20202c;
    /* renamed from: d */
    private int f20203d;

    /* compiled from: UploadDialogImageAdapter */
    /* renamed from: ctv$a */
    static class C4585a extends C0605t implements OnClickListener, OnTouchListener {
        /* renamed from: a */
        WeakReference<ctx> f20197a;
        /* renamed from: b */
        SimpleDraweeView f20198b;
        /* renamed from: c */
        TextView f20199c;

        private C4585a(View view, ctx ctx) {
            super(view);
            this.f20198b = (SimpleDraweeView) view.findViewById(C4581b.uploadlib_media_thumbnail);
            this.f20199c = (TextView) view.findViewById(C4581b.uploadlib_media_video_duration);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
            this.f20197a = new WeakReference(ctx);
        }

        public void onClick(View view) {
            if ((view.getTag() instanceof String) && this.f20197a.get() != null) {
                ctw.m24923a(((ctx) this.f20197a.get()).m24963g(), new cuz((String) view.getTag(), ((ctx) this.f20197a.get()).m24963g()));
                ((ctx) this.f20197a.get()).m24964h();
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (VERSION.SDK_INT > 14) {
                switch (action) {
                    case 0:
                        view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).start();
                        break;
                    case 1:
                    case 3:
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start();
                        break;
                }
            }
            return false;
        }
    }

    public ctv(List<MediaMeta> list, ctx ctx) {
        this.f20201b = list;
        this.f20200a = ctx;
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4582c.uploadlib_media_thumbnail, viewGroup, false);
        this.f20202c = (int) TypedValue.applyDimension(1, 96.0f, viewGroup.getResources().getDisplayMetrics());
        this.f20203d = (int) TypedValue.applyDimension(1, 96.0f, viewGroup.getResources().getDisplayMetrics());
        return new C4585a(inflate, this.f20200a);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        C4585a c4585a = (C4585a) c0605t;
        SimpleDraweeView simpleDraweeView = c4585a.f20198b;
        if (this.f20201b != null) {
            MediaMeta mediaMeta = (MediaMeta) this.f20201b.get(i);
            String str = "file://" + mediaMeta.f18781d;
            long j = mediaMeta.f18783f;
            DraweeController build = ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setAutoRotateEnabled(true).setResizeOptions(new ResizeOptions(this.f20202c, this.f20203d)).build())).setOldController(simpleDraweeView.getController())).build();
            simpleDraweeView.setBackgroundColor(-1118482);
            simpleDraweeView.setController(build);
            if (j > 0) {
                c4585a.f20199c.setVisibility(0);
                c4585a.f20199c.setText(djf.m27570a(mediaMeta.f18783f));
            } else {
                c4585a.f20199c.setVisibility(8);
            }
            c0605t.itemView.setTag(((MediaMeta) this.f20201b.get(i)).f18781d);
        }
    }

    public int getItemCount() {
        if (this.f20201b != null) {
            return this.f20201b.size();
        }
        return 0;
    }

    /* renamed from: a */
    void m24921a(MediaMeta mediaMeta) {
        this.f20201b.add(mediaMeta);
        notifyItemInserted(this.f20201b.size());
    }

    /* renamed from: a */
    void m24920a(int i, MediaMeta mediaMeta) {
        this.f20201b.add(i, mediaMeta);
        notifyItemRangeInserted(i, 1);
    }
}
