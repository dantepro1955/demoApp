package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ProgressBar;
import com.under9.android.comments.model.constant.CommentConstant;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.model.wrapper.EmbedImage;
import com.under9.android.comments.model.wrapper.EmbedMedia;
import com.under9.android.comments.otto.RequestCommentMediaOverlay;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4059d;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4497b;
import java.lang.ref.WeakReference;
import p000.deo.C4841d;
import p000.deo.C4843b;
import p000.dew.C4861e;
import p000.dew.C4862f;
import p000.dew.C4863g;
import p000.dlm.C4972a;

/* compiled from: CommentItemMediaRendererV4 */
/* renamed from: den */
public class den extends deo {
    /* renamed from: a */
    protected OnClickListener f21414a = new C48404(this);
    /* renamed from: c */
    private C4060c f21415c = new C48382(this);
    /* renamed from: d */
    private WeakReference<C4842a> f21416d;
    /* renamed from: e */
    private C4843b f21417e;

    /* compiled from: CommentItemMediaRendererV4 */
    /* renamed from: den$2 */
    class C48382 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ den f21361a;

        C48382(den den) {
            this.f21361a = den;
        }

        /* renamed from: a */
        public void mo3751a(View view, dlm dlm, UniversalImageView universalImageView) {
            CommentWrapper commentWrapper = (CommentWrapper) universalImageView.getTag(C4862f.comment_wrapper);
            dct.m26398a(commentWrapper.getUrl(), new RequestCommentMediaOverlay(commentWrapper));
        }
    }

    /* compiled from: CommentItemMediaRendererV4 */
    /* renamed from: den$4 */
    class C48404 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ den f21364a;

        C48404(den den) {
            this.f21364a = den;
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C4862f.async_image) {
                if (!((C4842a) view.getTag(C4862f.image_holder)).f21389e && this.f21364a.f21416d != null && ((C4842a) this.f21364a.f21416d.get()) != null) {
                    this.f21364a.f21416d = null;
                }
            } else if (id == C4862f.gifView) {
                C4842a c4842a = (C4842a) view.getTag(C4862f.image_holder);
                this.f21364a.f21416d = null;
            }
        }
    }

    /* compiled from: CommentItemMediaRendererV4 */
    /* renamed from: den$a */
    public static class C4842a extends C4841d {
        /* renamed from: a */
        public UniversalImageView f21385a;
        /* renamed from: b */
        public View f21386b;
        /* renamed from: c */
        public ProgressBar f21387c;
        /* renamed from: d */
        public boolean f21388d;
        /* renamed from: e */
        public boolean f21389e;
    }

    /* compiled from: CommentItemMediaRendererV4 */
    /* renamed from: den$b */
    public static class C4844b extends C4843b {
        /* renamed from: a */
        public boolean f21402a = false;
    }

    /* renamed from: b */
    protected void mo4352b(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        super.mo4352b(deu, view, commentWrapper, context);
    }

    /* renamed from: c */
    protected void m26847c(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        ((C4842a) view.getTag()).f21385a.m24151a(deu.mo4371h());
    }

    /* renamed from: a */
    protected String mo4347a(CommentWrapper commentWrapper) {
        if ((!commentWrapper.isUrl() || commentWrapper.getComment() == null || commentWrapper.getComment().m23450f() == null || (!commentWrapper.getComment().m23450f().contains("memeful.com") && commentWrapper.getComment().m23477s().intValue() != 1)) && commentWrapper.isMediaTextAvailable()) {
            return commentWrapper.getHtmlMediaText().toString();
        }
        return null;
    }

    /* renamed from: a */
    public void mo4344a(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        super.mo4344a(deu, view, commentWrapper, context);
        m26847c(deu, view, commentWrapper, context);
    }

    /* renamed from: a */
    protected void mo4349a(C4841d c4841d, int i, OnClickListener onClickListener, OnLongClickListener onLongClickListener) {
        super.mo4349a(c4841d, i, onClickListener, onLongClickListener);
        C4842a c4842a = (C4842a) c4841d;
        c4842a.f21385a.setTag(C4862f.image_holder, c4842a);
        if (onLongClickListener != null && !mo4354d().f21393e) {
            c4842a.f21385a.setTag(C4862f.image_long_click_listener, onLongClickListener);
        }
    }

    /* renamed from: a */
    protected void mo4350a(C4841d c4841d, int i, CommentWrapper commentWrapper, Context context, der der) {
        super.mo4350a(c4841d, i, commentWrapper, context, der);
        C4842a c4842a = (C4842a) c4841d;
        c4842a.f21388d = false;
        mo4357a(c4842a, i, commentWrapper, context);
    }

    /* renamed from: a */
    protected void m26840a(final C4842a c4842a, int i, EmbedImage embedImage, CommentWrapper commentWrapper, Context context) {
        String str = embedImage.type;
        if (commentWrapper.getStatus() == 3 || CommentConstant.MEDIA_TYPE_PROCESSING.equals(embedImage.type)) {
            c4842a.f21386b.setVisibility(0);
            return;
        }
        CommentWrapper tag = c4842a.f21385a.getTag(C4862f.comment_wrapper);
        c4842a.f21386b.setVisibility(8);
        if (tag == commentWrapper) {
            return;
        }
        if (CommentConstant.MEDIA_TYPE_STATIC.equals(str)) {
            c4842a.f21389e = true;
            m26834a(context, embedImage.image, c4842a);
            c4842a.f21385a.setTag(C4862f.comment_wrapper, commentWrapper);
        } else if (CommentConstant.MEDIA_TYPE_ANIMATED.equals(str)) {
            str = embedImage.video.url;
            c4842a.f21385a.setAdapter(new C4972a().m27866a(embedImage.image.url, embedImage.image.width, embedImage.image.height).m27870b(str).m27873c(ddd.m26577a().m26583b(c4842a.f21385a.getContext(), str)).m27861a(C4497b.ANIMATED).m27856a(C4861e.ic_play_gif).m27867a(m26792a()).m27864a(m26774c()).m27863a(mo4354d().f21393e ? null : new C4059d(this) {
                /* renamed from: b */
                final /* synthetic */ den f21360b;

                /* renamed from: a */
                public void mo3750a(View view, dlm dlm, UniversalImageView universalImageView) {
                    ((OnLongClickListener) c4842a.f21385a.getTag(C4862f.image_long_click_listener)).onLongClick(c4842a.f21385a);
                }
            }).m27874c(VERSION.SDK_INT != 23).m27872b());
            c4842a.f21385a.setTag(C4862f.comment_wrapper, commentWrapper);
        }
    }

    /* renamed from: a */
    protected void mo4357a(C4842a c4842a, int i, CommentWrapper commentWrapper, Context context) {
        m26840a(c4842a, i, commentWrapper.getEmbedMediaMeta().embedImage, commentWrapper, context);
    }

    /* renamed from: a */
    private void m26834a(Context context, EmbedMedia embedMedia, final C4842a c4842a) {
        C4059d c4059d = null;
        int i = embedMedia.height;
        UniversalImageView universalImageView = c4842a.f21385a;
        C4972a a = new C4972a().m27866a(embedMedia.url, embedMedia.width, i).m27864a(m26774c()).m27862a(((C4844b) mo4354d()).f21402a ? this.f21415c : null);
        if (!mo4354d().f21393e) {
            c4059d = new C4059d(this) {
                /* renamed from: b */
                final /* synthetic */ den f21363b;

                /* renamed from: a */
                public void mo3750a(View view, dlm dlm, UniversalImageView universalImageView) {
                    ((OnLongClickListener) c4842a.f21385a.getTag(C4862f.image_long_click_listener)).onLongClick(c4842a.f21385a);
                }
            };
        }
        universalImageView.setAdapter(a.m27863a(c4059d).m27872b());
    }

    /* renamed from: a */
    protected View mo4345a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C4863g.comment_system_list_item_image_v4, null);
    }

    /* renamed from: a */
    protected C4841d mo4346a(View view) {
        return new C4842a();
    }

    /* renamed from: a */
    protected void mo4348a(View view, C4841d c4841d) {
        super.mo4348a(view, c4841d);
        C4842a c4842a = (C4842a) c4841d;
        c4842a.f21385a = (UniversalImageView) view.findViewById(C4862f.media);
        c4842a.f21386b = view.findViewById(C4862f.processing);
        c4842a.f21387c = (ProgressBar) view.findViewById(C4862f.processingThrobber);
    }

    /* renamed from: b */
    protected C4841d mo4351b(View view) {
        while (!(view.getTag() instanceof C4841d)) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                return null;
            }
            view = view2;
        }
        return (C4841d) view.getTag();
    }

    /* renamed from: c */
    public void mo4353c(View view) {
        C4842a c4842a = (C4842a) view.getTag(C4862f.image_holder);
        if (c4842a != null) {
            c4842a.f21388d = true;
            c4842a.f21385a.m24159f();
        }
    }

    /* renamed from: d */
    public C4843b mo4354d() {
        if (this.f21417e == null) {
            this.f21417e = new C4844b();
        }
        return this.f21417e;
    }
}
