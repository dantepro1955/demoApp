package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.CommentListItem;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.otto.CommentTextTouchEvent;
import com.under9.android.comments.otto.RequestCommentBrowserEvent;
import com.under9.android.comments.otto.SublevelLoadMoreEvent;
import com.under9.android.comments.ui.widget.HighlightableImageButton;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.dew.C4859c;
import p000.dew.C4860d;
import p000.dew.C4862f;
import p000.dew.C4863g;
import p000.dew.C4865i;
import p000.dir.C4845a;

/* compiled from: CommentItemRendererV4 */
/* renamed from: deo */
public class deo extends del {
    /* renamed from: a */
    private static final Pattern f21403a = Pattern.compile("@[a-zA-Z0-9_]+");
    /* renamed from: c */
    private static final Pattern f21404c = Pattern.compile("\\[url\\][^\\[]+\\[\\/url\\]");
    /* renamed from: f */
    private static CommentTextTouchEvent f21405f;
    /* renamed from: b */
    protected C4847a f21406b = new C48482(this);
    /* renamed from: d */
    private dfc f21407d;
    /* renamed from: e */
    private long f21408e;
    /* renamed from: g */
    private C4845a f21409g = new C48461(this);
    /* renamed from: h */
    private C4060c f21410h = new C48493(this);
    /* renamed from: i */
    private OnClickListener f21411i = m26830e();
    /* renamed from: j */
    private OnLongClickListener f21412j = m26831f();
    /* renamed from: k */
    private C4843b f21413k;

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$d */
    public static class C4841d {
        /* renamed from: f */
        public int f21365f;
        /* renamed from: g */
        public Runnable f21366g;
        /* renamed from: h */
        public View f21367h;
        /* renamed from: i */
        public View f21368i;
        /* renamed from: j */
        public SimpleDraweeView f21369j;
        /* renamed from: k */
        public TextView f21370k;
        /* renamed from: l */
        public TextView f21371l;
        /* renamed from: m */
        public TextView f21372m;
        /* renamed from: n */
        public TextView f21373n;
        /* renamed from: o */
        public TextView f21374o;
        /* renamed from: p */
        public TextView f21375p;
        /* renamed from: q */
        public TextView f21376q;
        /* renamed from: r */
        public HighlightableImageButton f21377r;
        /* renamed from: s */
        public HighlightableImageButton f21378s;
        /* renamed from: t */
        public ImageButton f21379t;
        /* renamed from: u */
        public View f21380u;
        /* renamed from: v */
        public View f21381v;
        /* renamed from: w */
        public View f21382w;
        /* renamed from: x */
        public ProgressBar f21383x;
        /* renamed from: y */
        public LinearLayout f21384y;
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$b */
    public static class C4843b {
        /* renamed from: b */
        public boolean f21390b = true;
        /* renamed from: c */
        public boolean f21391c = true;
        /* renamed from: d */
        public boolean f21392d = true;
        /* renamed from: e */
        public boolean f21393e = true;
        /* renamed from: f */
        public boolean f21394f = true;
        /* renamed from: g */
        public int f21395g = 0;
        /* renamed from: h */
        public String f21396h = null;
        /* renamed from: i */
        public String f21397i = null;
        /* renamed from: j */
        public boolean f21398j = true;
        /* renamed from: k */
        public int f21399k = C4860d.avatar_size;
        /* renamed from: l */
        public int f21400l = C4860d.sublevel_avatar_size;
        /* renamed from: m */
        public float f21401m = 0.0f;

        /* renamed from: a */
        public boolean m26801a() {
            return this.f21391c || this.f21392d;
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$1 */
    class C48461 implements C4845a {
        /* renamed from: a */
        final /* synthetic */ deo f21418a;

        C48461(deo deo) {
            this.f21418a = deo;
        }

        /* renamed from: a */
        public void mo4355a(String str, dis dis) {
            dct.m26398a(str, dis);
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$2 */
    class C48482 implements C4847a {
        /* renamed from: a */
        final /* synthetic */ deo f21419a;

        C48482(deo deo) {
            this.f21419a = deo;
        }

        /* renamed from: a */
        public void mo4356a(String str, String str2) {
            this.f21419a.f21408e = djw.m27632a();
            this.f21419a.m26789a(str, str2);
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$3 */
    class C48493 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ deo f21420a;

        C48493(deo deo) {
            this.f21420a = deo;
        }

        /* renamed from: a */
        public void mo3751a(View view, dlm dlm, UniversalImageView universalImageView) {
            String str = (String) universalImageView.getTag(C4862f.username);
            if (str != null) {
                this.f21420a.m26796b(str);
            }
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$4 */
    class C48504 implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ deo f21421a;

        C48504(deo deo) {
            this.f21421a = deo;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            if (id == C4862f.dataView || id == C4862f.content || id == C4862f.media) {
                CommentWrapper commentWrapper;
                if (id == C4862f.media) {
                    commentWrapper = (CommentWrapper) view.getTag(C4862f.comment_wrapper);
                } else {
                    commentWrapper = this.f21421a.m26780a(((Integer) view.getTag()).intValue());
                }
                this.f21421a.m26784a(this.f21421a.mo4351b(view).f21365f, commentWrapper.getCommentId(), commentWrapper.getUserName(view.getContext()));
            }
            return false;
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$a */
    public static class C4851a extends ClickableSpan {
        /* renamed from: a */
        private C4847a f21422a;
        /* renamed from: b */
        private String f21423b;
        /* renamed from: c */
        private String f21424c;

        /* compiled from: CommentItemRendererV4 */
        /* renamed from: deo$a$a */
        public interface C4847a {
            /* renamed from: a */
            void mo4356a(String str, String str2);
        }

        public C4851a(String str, String str2, C4847a c4847a) {
            this.f21422a = c4847a;
            this.f21423b = str;
            this.f21424c = str2;
        }

        public void onClick(View view) {
            if (this.f21422a != null) {
                this.f21422a.mo4356a(this.f21423b, this.f21424c);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* compiled from: CommentItemRendererV4 */
    /* renamed from: deo$c */
    public static class C4852c extends ClickableSpan {
        /* renamed from: a */
        private String f21425a;

        public C4852c(String str) {
            this.f21425a = str;
        }

        public void updateDrawState(TextPaint textPaint) {
        }

        public void onClick(View view) {
            dct.m26398a(this.f21425a, new RequestCommentBrowserEvent(this.f21425a));
        }
    }

    /* renamed from: a */
    public View m26804a(int i, View view, ViewGroup viewGroup, Object obj, der der) {
        View view2;
        C4841d a;
        View view3;
        CommentWrapper commentWrapper = (CommentWrapper) obj;
        Context context = viewGroup.getContext();
        if (this.f21407d == null) {
            this.f21407d = new dfc(context);
        }
        if (view == null || (view.getTag() != null && (view.getTag() instanceof C4841d))) {
            view2 = view;
        } else {
            view2 = null;
        }
        if (view2 == null) {
            View a2 = mo4345a((LayoutInflater) context.getSystemService("layout_inflater"));
            a = mo4346a(a2);
            mo4348a(a2, a);
            a2.setTag(a);
            view3 = a2;
        } else {
            view3 = view2;
            a = (C4841d) view2.getTag();
        }
        mo4349a(a, i, this.f21411i, this.f21412j);
        mo4350a(a, i, commentWrapper, context, der);
        mo4344a(m26773b(), view3, commentWrapper, context);
        return view3;
    }

    /* renamed from: a */
    protected View mo4345a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C4863g.comment_system_list_item_v4, null);
    }

    /* renamed from: a */
    protected void m26821a(String str, C4841d c4841d, int i, CommentWrapper commentWrapper, Context context) {
        CommentWrapper tag = c4841d.f21369j.getTag(C4862f.comment_wrapper);
        if (str == null) {
            c4841d.f21369j.setImageURI((Uri) null);
        } else if (tag != commentWrapper) {
            c4841d.f21369j.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    protected void m26820a(deu deu, C4841d c4841d, CommentWrapper commentWrapper) {
        if (m26793a(commentWrapper.getComment().m23426a().longValue())) {
            c4841d.f21367h.setBackgroundResource(deu.mo4369f());
        } else if (commentWrapper.shouldHighlight()) {
            c4841d.f21367h.setBackgroundResource(deu.mo4368e());
        } else {
            c4841d.f21367h.setBackgroundResource(deu.mo4365b());
        }
    }

    /* renamed from: d */
    protected void m26829d(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        C4841d c4841d = (C4841d) view.getTag();
        m26820a(deu, c4841d, commentWrapper);
        if (commentWrapper.shouldHighlight()) {
            context.getResources().getColor(deu.mo4372i());
            int color = context.getResources().getColor(deu.mo4373j());
            int color2 = context.getResources().getColor(deu.mo4374k());
            c4841d.f21370k.setTextColor(color);
            c4841d.f21373n.setTextColor(color2);
            c4841d.f21372m.setTextColor(color2);
            return;
        }
        c4841d.f21370k.setTextColor(context.getResources().getColor(deu.mo4364a()));
        c4841d.f21373n.setTextColor(context.getResources().getColor(C4859c.cs_meta_text_color));
        m26785a(context, c4841d.f21372m, commentWrapper);
    }

    /* renamed from: a */
    public void mo4344a(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        if (deu == null) {
            deu = new det();
        }
        C4841d c4841d = (C4841d) view.getTag();
        m26829d(deu, view, commentWrapper, context);
        mo4352b(deu, view, commentWrapper, context);
        Resources resources = context.getResources();
        c4841d.f21380u.setBackgroundColor(resources.getColor(deu.mo4366c()));
        c4841d.f21381v.setBackgroundResource(deu.mo4365b());
        if (deu.mo4367d() != 0) {
            c4841d.f21369j.setBackgroundColor(resources.getColor(deu.mo4367d()));
        }
        c4841d.f21371l.setTextColor(resources.getColor(deu.mo4370g()));
    }

    /* renamed from: b */
    protected void mo4352b(deu deu, View view, CommentWrapper commentWrapper, Context context) {
        C4841d c4841d = (C4841d) view.getTag();
        if (commentWrapper.shouldHighlight()) {
            c4841d.f21374o.setTextColor(context.getResources().getColor(deu.mo4372i()));
            return;
        }
        c4841d.f21374o.setTextColor(context.getResources().getColor(deu.mo4364a()));
    }

    /* renamed from: a */
    protected void mo4349a(C4841d c4841d, int i, OnClickListener onClickListener, OnLongClickListener onLongClickListener) {
        c4841d.f21365f = i;
        c4841d.f21367h.setTag(Integer.valueOf(i));
        c4841d.f21374o.setTag(Integer.valueOf(i));
        c4841d.f21377r.setTag(Integer.valueOf(i));
        c4841d.f21378s.setTag(Integer.valueOf(i));
        c4841d.f21379t.setTag(Integer.valueOf(i));
        c4841d.f21376q.setTag(Integer.valueOf(i));
        c4841d.f21381v.setTag(Integer.valueOf(i));
        c4841d.f21377r.setOnClickListener(onClickListener);
        c4841d.f21378s.setOnClickListener(onClickListener);
        c4841d.f21367h.setOnClickListener(onClickListener);
        c4841d.f21379t.setOnClickListener(onClickListener);
        c4841d.f21376q.setOnClickListener(onClickListener);
        c4841d.f21381v.setOnClickListener(onClickListener);
        if (!mo4354d().f21393e) {
            c4841d.f21367h.setOnLongClickListener(onLongClickListener);
            c4841d.f21374o.setOnLongClickListener(onLongClickListener);
        }
    }

    /* renamed from: a */
    protected void mo4350a(C4841d c4841d, int i, CommentWrapper commentWrapper, Context context, der der) {
        boolean z;
        String m;
        boolean z2 = true;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C4860d.comment_indentation_v4);
        c4841d.f21368i.getLayoutParams().width = dimensionPixelSize * (commentWrapper.getLevel() - 1);
        if (commentWrapper.isTopLevel()) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(mo4354d().f21399k);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(mo4354d().f21400l);
        }
        LayoutParams layoutParams = c4841d.f21369j.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        if (commentWrapper.isCollapsed()) {
            c4841d.f21367h.setVisibility(8);
        } else {
            c4841d.f21367h.setVisibility(0);
        }
        c4841d.f21381v.setVisibility(8);
        CommentListItem b = m26794b(i);
        if (b != null) {
            Comment i2 = b.m23517i();
            List G = i2.m23422G();
            Boolean o = i2.m23473o();
            if (G != null && G.size() > 0 && commentWrapper.isLastItem() && o != null && o.booleanValue()) {
                c4841d.f21381v.setVisibility(0);
                c4841d.f21382w.setVisibility(0);
                c4841d.f21383x.setVisibility(8);
                commentWrapper.setParentId(b.m23499a().longValue());
            }
            z = false;
        } else {
            z = true;
        }
        c4841d.f21380u.setVisibility(djy.m27638a(z));
        if (commentWrapper.isPendingActionExpandChange()) {
            commentWrapper.resetPendingActionExpandChange();
        }
        if (commentWrapper.isLoadingSublevel()) {
            c4841d.f21382w.setVisibility(8);
            c4841d.f21383x.setVisibility(0);
        } else {
            c4841d.f21382w.setVisibility(0);
            c4841d.f21383x.setVisibility(8);
        }
        if (commentWrapper.isAnonymous()) {
            if (CommentWrapper.isCommentCreator(commentWrapper.getComment(), dda.m26492a().m26537e())) {
                c4841d.f21370k.setText(C4865i.my_anonymous_comment_display_name);
            } else {
                c4841d.f21370k.setText(C4865i.anonymous_comment_display_name);
            }
            m = dda.m26492a().m26557m();
            c4841d.f21370k.setOnClickListener(null);
            c4841d.f21369j.setOnClickListener(null);
        } else {
            CharSequence userName = commentWrapper.getUserName(context);
            c4841d.f21370k.setText(userName);
            c4841d.f21370k.setTag(C4862f.username, userName);
            m = commentWrapper.getAvatarUrl();
            c4841d.f21370k.setOnClickListener(this.f21411i);
            c4841d.f21369j.setTag(C4862f.username, userName);
            c4841d.f21369j.setOnClickListener(this.f21411i);
        }
        if (commentWrapper.getCommentLabel() == null || !commentWrapper.getCommentLabel().equals("OP")) {
            z = false;
        } else {
            z = true;
        }
        if (!(z && dda.m26492a().m26558n())) {
            z2 = false;
        }
        m26808a(context, commentWrapper, c4841d, z2);
        m26816a(c4841d, i, commentWrapper, context);
        m26821a(m, c4841d, i, commentWrapper, context);
        m26811a(context, c4841d, commentWrapper, false);
        m26823b(context, c4841d, commentWrapper);
        m26818a(c4841d, commentWrapper);
    }

    /* renamed from: a */
    protected void m26818a(C4841d c4841d, CommentWrapper commentWrapper) {
        View view = c4841d.f21367h;
        if (commentWrapper.shouldHighlight()) {
            commentWrapper.startHighlight();
            if (c4841d.f21366g != null) {
                view.removeCallbacks(c4841d.f21366g);
                c4841d.f21366g = null;
            }
        }
        c4841d.f21369j.setTag(C4862f.comment_wrapper, commentWrapper);
    }

    /* renamed from: a */
    protected void m26808a(Context context, CommentWrapper commentWrapper, C4841d c4841d, boolean z) {
        m26786a(context, c4841d.f21371l, "OP", z);
    }

    /* renamed from: a */
    protected String mo4347a(CommentWrapper commentWrapper) {
        if (commentWrapper.isRichtextAvailable()) {
            return commentWrapper.getHtmlRichtext().toString();
        }
        return commentWrapper.getHtmlContent().toString();
    }

    /* renamed from: a */
    protected void m26816a(C4841d c4841d, int i, CommentWrapper commentWrapper, Context context) {
        CharSequence a = mo4347a(commentWrapper);
        if (a != null) {
            if (c4841d.f21374o != null) {
                c4841d.f21374o.setVisibility(0);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            if (dda.m26492a().m26556l()) {
                Matcher matcher = f21403a.matcher(a);
                while (matcher.find()) {
                    m26824b(spannableStringBuilder, matcher.start(), matcher.end(), matcher.group(), commentWrapper);
                }
            }
            if (commentWrapper.isUrl()) {
                Matcher matcher2 = f21404c.matcher(a);
                while (matcher2.find()) {
                    m26812a(spannableStringBuilder, matcher2.start(), matcher2.end(), matcher2.group(), commentWrapper);
                }
            }
            if (c4841d.f21374o != null) {
                c4841d.f21374o.setText(spannableStringBuilder);
                c4841d.f21374o.setMovementMethod(m26826c(commentWrapper.getUrl()));
            }
        } else if (c4841d.f21374o != null) {
            c4841d.f21374o.setVisibility(8);
        }
    }

    /* renamed from: c */
    protected MovementMethod m26826c(String str) {
        return dir.m27462a().m27465a(str).m27463a(this.f21409g).m27464a(deo.m26803g());
    }

    /* renamed from: g */
    private static CommentTextTouchEvent m26803g() {
        if (f21405f == null) {
            f21405f = new CommentTextTouchEvent();
        }
        return f21405f;
    }

    /* renamed from: a */
    protected void m26812a(SpannableStringBuilder spannableStringBuilder, int i, int i2, String str, CommentWrapper commentWrapper) {
        CharSequence substring = str.substring(5, str.length() - 6);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16737793), i, i2, 33);
        spannableStringBuilder.setSpan(new C4852c(substring), i, i2, 33);
        spannableStringBuilder.replace(i, i2, substring);
    }

    /* renamed from: b */
    protected void m26824b(SpannableStringBuilder spannableStringBuilder, int i, int i2, String str, CommentWrapper commentWrapper) {
        Object mentionedAccountId = commentWrapper.getMentionedAccountId(str);
        if (!TextUtils.isEmpty(mentionedAccountId)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-16737793), i, i2, 33);
            spannableStringBuilder.setSpan(new C4851a(str, mentionedAccountId, this.f21406b), i, i2, 33);
        }
    }

    /* renamed from: c */
    public void mo4353c(View view) {
    }

    /* renamed from: a */
    protected C4841d mo4346a(View view) {
        return new C4841d();
    }

    /* renamed from: a */
    protected void mo4348a(View view, C4841d c4841d) {
        int i;
        int i2 = 0;
        c4841d.f21367h = view.findViewById(C4862f.dataView);
        c4841d.f21368i = view.findViewById(C4862f.indentation);
        c4841d.f21369j = (SimpleDraweeView) view.findViewById(C4862f.avatar);
        c4841d.f21370k = (TextView) view.findViewById(C4862f.userName);
        c4841d.f21371l = (TextView) view.findViewById(C4862f.commentLabel);
        c4841d.f21372m = (TextView) view.findViewById(C4862f.likeCount);
        c4841d.f21375p = (TextView) view.findViewById(C4862f.customMeta);
        c4841d.f21373n = (TextView) view.findViewById(C4862f.meta);
        c4841d.f21374o = (TextView) view.findViewById(C4862f.content);
        c4841d.f21377r = (HighlightableImageButton) view.findViewById(C4862f.likeBtn);
        c4841d.f21378s = (HighlightableImageButton) view.findViewById(C4862f.dislikeBtn);
        c4841d.f21379t = (ImageButton) view.findViewById(C4862f.moreBtn);
        c4841d.f21376q = (TextView) view.findViewById(C4862f.replyBtnV4);
        c4841d.f21381v = view.findViewById(C4862f.loadMoreContainer);
        c4841d.f21382w = view.findViewById(C4862f.loadMoreTxt);
        c4841d.f21383x = (ProgressBar) c4841d.f21381v.findViewById(C4862f.throbber);
        c4841d.f21380u = view.findViewById(C4862f.commentBorder);
        c4841d.f21384y = (LinearLayout) view.findViewById(C4862f.rightContainer);
        HighlightableImageButton highlightableImageButton = c4841d.f21377r;
        if (mo4354d().f21391c) {
            i = 0;
        } else {
            i = 8;
        }
        highlightableImageButton.setVisibility(i);
        highlightableImageButton = c4841d.f21378s;
        if (mo4354d().f21392d) {
            i = 0;
        } else {
            i = 8;
        }
        highlightableImageButton.setVisibility(i);
        ImageButton imageButton = c4841d.f21379t;
        if (mo4354d().f21393e) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        TextView textView = c4841d.f21376q;
        if (!mo4354d().f21394f) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    /* renamed from: e */
    protected OnClickListener m26830e() {
        return new dep(this);
    }

    /* renamed from: f */
    protected OnLongClickListener m26831f() {
        return new C48504(this);
    }

    /* renamed from: a */
    public void m26813a(View view, CommentWrapper commentWrapper) {
        commentWrapper.setLoadingSublevel(true);
        C4841d b = mo4351b(view);
        b.f21382w.setVisibility(8);
        b.f21383x.setVisibility(0);
        if (commentWrapper.getParentCommentId() != null) {
            dct.m26398a(commentWrapper.getUrl(), new SublevelLoadMoreEvent(commentWrapper.getCommentId(), commentWrapper.getParentCommentId(), commentWrapper.getCommentId()));
        }
    }

    /* renamed from: a */
    protected void m26810a(Context context, C4841d c4841d, CommentWrapper commentWrapper) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (commentWrapper.getLikeStatus() != 0 || commentWrapper.getLikeCount() > 0) {
            spannableStringBuilder.append("\t");
        }
        if (mo4354d().f21390b) {
            spannableStringBuilder.append(commentWrapper.getTimeText(this.f21407d));
        }
        c4841d.f21373n.setText(spannableStringBuilder);
    }

    /* renamed from: b */
    protected void m26823b(Context context, C4841d c4841d, CommentWrapper commentWrapper) {
        if (!TextUtils.isEmpty(mo4354d().f21396h)) {
            Object obj = "";
            if (TextUtils.equals(mo4354d().f21397i, "double") || TextUtils.equals(mo4354d().f21397i, "int")) {
                Double suppDataDouble = commentWrapper.getSuppDataDouble(mo4354d().f21396h);
                if (suppDataDouble == null) {
                    if (mo4354d().f21398j) {
                        obj = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                } else if (TextUtils.equals(mo4354d().f21397i, "double")) {
                    obj = obj + suppDataDouble;
                } else if (TextUtils.equals(mo4354d().f21397i, "int")) {
                    obj = obj + suppDataDouble.intValue();
                }
            }
            if (!TextUtils.isEmpty(obj) || mo4354d().f21398j) {
                c4841d.f21375p.setText("" + obj);
                c4841d.f21375p.setVisibility(0);
                if (mo4354d().f21395g > 0) {
                    c4841d.f21375p.setCompoundDrawablesWithIntrinsicBounds(mo4354d().f21395g, 0, 0, 0);
                    return;
                }
                return;
            }
            c4841d.f21375p.setText("");
            c4841d.f21375p.setVisibility(8);
        }
    }

    /* renamed from: a */
    protected void m26811a(Context context, C4841d c4841d, CommentWrapper commentWrapper, boolean z) {
        m26809a(context, c4841d, commentWrapper.getLikeStatus(), z);
        if ((commentWrapper.getLikeStatus() != 0 || commentWrapper.getLikeCount() > 0) && mo4354d().m26801a()) {
            c4841d.f21372m.setVisibility(0);
            m26785a(context, c4841d.f21372m, commentWrapper);
        } else {
            c4841d.f21372m.setVisibility(8);
        }
        m26810a(context, c4841d, commentWrapper);
    }

    /* renamed from: a */
    protected void m26809a(Context context, C4841d c4841d, int i, boolean z) {
        boolean z2 = false;
        boolean z3 = true;
        if (i != -1) {
            if (i == 1) {
                z2 = true;
                z3 = false;
            } else {
                z3 = false;
            }
        }
        c4841d.f21377r.setHighlighted(z2);
        c4841d.f21378s.setHighlighted(z3);
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

    /* renamed from: d */
    public C4843b mo4354d() {
        if (this.f21413k == null) {
            this.f21413k = new C4843b();
        }
        return this.f21413k;
    }
}
