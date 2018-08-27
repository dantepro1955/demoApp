package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.C0605t;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist2.PostListTopCommentsView;
import com.ninegag.android.app.component.postlist2.PostListTopCommentsView.C4063a;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.lib.widget.uiv.FrescoTilingView.C4484d;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4059d;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4497b;
import java.util.ArrayList;
import java.util.Map;
import p000.dlm.C4972a;

/* compiled from: GagPostListRenderer */
/* renamed from: ccp */
public class ccp extends cse<cct> {
    /* renamed from: a */
    public String f8663a;
    /* renamed from: b */
    protected com f8664b;
    /* renamed from: c */
    protected caf f8665c = caf.m12046a();
    /* renamed from: d */
    private cco f8666d;
    /* renamed from: e */
    private boolean f8667e;
    /* renamed from: f */
    private boolean f8668f;
    /* renamed from: g */
    private RequestListener f8669g = new C16741(this);
    /* renamed from: h */
    private C4060c f8670h = new C16763(this);
    /* renamed from: i */
    private C4059d f8671i = new C16774(this);
    /* renamed from: j */
    private C1678a f8672j;

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$b */
    public static class C1665b extends ccd {
        /* renamed from: c */
        public UniversalImageView f8644c;
        /* renamed from: d */
        public TextView f8645d;
        /* renamed from: f */
        public TextView f8646f;
        /* renamed from: g */
        public TextView f8647g;
        /* renamed from: h */
        public TextView f8648h;
        /* renamed from: i */
        public TextView f8649i;
        /* renamed from: j */
        public TextView f8650j;
        /* renamed from: k */
        public CheckBox f8651k;
        /* renamed from: l */
        public CheckBox f8652l;
        /* renamed from: m */
        public ImageView f8653m;
        /* renamed from: n */
        public TextView f8654n;
        /* renamed from: o */
        public View f8655o;
        /* renamed from: p */
        public View f8656p;
        /* renamed from: q */
        public View f8657q;
        /* renamed from: r */
        public ImageButton f8658r;
        /* renamed from: s */
        public PostListTopCommentsView f8659s;
        /* renamed from: t */
        public View f8660t;

        public C1665b(View view, cnt cnt) {
            super(view, cnt);
            this.f8645d = (TextView) view.findViewById(R.id.txtHeader);
            this.f8644c = (UniversalImageView) view.findViewById(R.id.universalImageView);
            this.f8655o = view.findViewById(R.id.placeholderContainer);
            this.f8656p = view.findViewById(R.id.divider);
            this.f8657q = view.findViewById(R.id.dividerTop);
            this.f8646f = (TextView) view.findViewById(R.id.postProfileLabel);
            this.f8647g = (TextView) view.findViewById(R.id.postTitle);
            this.f8651k = (CheckBox) view.findViewById(R.id.upVoteBtn);
            this.f8652l = (CheckBox) view.findViewById(R.id.downVoteBtn);
            this.f8653m = (ImageView) view.findViewById(R.id.commentBtn);
            this.f8649i = (TextView) view.findViewById(R.id.unsafeBadge);
            this.f8648h = (TextView) view.findViewById(R.id.commentCount);
            this.f8654n = (TextView) view.findViewById(R.id.btnMore);
            this.f8658r = (ImageButton) view.findViewById(R.id.btnMoreAction);
            this.f8659s = (PostListTopCommentsView) view.findViewById(R.id.top_comment_view);
            this.f8650j = (TextView) view.findViewById(R.id.postTags);
            this.f8660t = view.findViewById(R.id.native_ad_footer);
        }

        /* renamed from: a */
        protected void mo1630a() {
            if (this.f8644c != null) {
                this.f8644c.a(this.e.m14846G());
            }
            this.f8647g.setTextColor(m12158a(this.e.mo1824e()));
            this.f8648h.setTextColor(m12158a(this.e.mo1825f()));
            this.f8656p.setBackgroundResource(this.e.mo1826g());
            this.f8657q.setBackgroundResource(this.e.mo1826g());
            this.f8651k.setButtonDrawable(m12161b(this.e.mo1836q()));
            this.f8652l.setButtonDrawable(m12161b(this.e.mo1837r()));
            djy.a(this.f8654n, m12161b(this.e.mo1839t()));
            this.f8654n.setTextColor(m12158a(this.e.mo1840u()));
            this.f8658r.setImageResource(this.e.mo1828i());
            this.f8653m.setBackgroundResource(this.e.mo1838s());
            this.f8645d.setTextColor(m12158a(this.e.mo1814A()));
            this.f8645d.setBackgroundColor(m12158a(this.e.mo1833n()));
            if (this.f8659s != null) {
                this.f8659s.setTextColor(m12158a(this.e.mo1816C()));
            }
        }
    }

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$1 */
    class C16741 implements RequestListener {
        /* renamed from: a */
        final /* synthetic */ ccp f8736a;

        C16741(ccp ccp) {
            this.f8736a = ccp;
        }

        public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        }

        public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        }

        public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
            if (th != null && imageRequest != null) {
                chn.m13388b(101, "throwable=" + th.getMessage() + " sourceUri=" + imageRequest.getSourceUri() + " sourceFile=" + imageRequest.getSourceFile());
            } else if (th != null) {
                chn.m13388b(101, "throwable=" + th.getMessage());
            } else if (imageRequest != null) {
                chn.m13388b(101, "sourceUri=" + imageRequest.getSourceUri() + " sourceFile=" + imageRequest.getSourceFile());
            }
        }

        public void onRequestCancellation(String str) {
        }

        public void onProducerStart(String str, String str2) {
        }

        public void onProducerEvent(String str, String str2, String str3) {
        }

        public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        }

        public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
            if (th != null && map != null) {
                chn.m13388b((int) InterstitialErrorStatus.EXPIRED, "throwable=" + th.getMessage() + " map=" + map.toString());
            } else if (map != null) {
                chn.m13388b((int) InterstitialErrorStatus.EXPIRED, "map=" + map.toString());
            } else if (th != null) {
                chn.m13388b((int) InterstitialErrorStatus.EXPIRED, "throwable=" + th.getMessage());
            }
        }

        public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        }

        public boolean requiresExtraMap(String str) {
            return false;
        }

        public void onUltimateProducerReached(String str, String str2, boolean z) {
        }
    }

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$3 */
    class C16763 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ ccp f8741a;

        C16763(ccp ccp) {
            this.f8741a = ccp;
        }

        /* renamed from: a */
        public void m12565a(View view, dlm dlm, UniversalImageView universalImageView) {
            if (dlm.b() == C4497b.f19781a) {
                dhe.c(this.f8741a.f8663a, new GagPostItemActionEvent(1, (cct) universalImageView.getTag()));
            } else if (dlm.b() == C4497b.f19782b) {
                diu diu = new diu();
                cct cct;
                if (dlm.f22059I) {
                    diu.a(2, "TriggeredFrom", "PostList");
                    cct = (cct) universalImageView.getTag();
                    if (cct != null) {
                        diu.a(3, "PostKey", cct.m12282e());
                    } else {
                        diu.a(3, "PostKey", "");
                    }
                    chn.m13381a("VideoAction", "PlayVideo", cct.m12282e(), null, diu);
                    return;
                }
                diu.a(2, "TriggeredFrom", "PostList");
                cct = (cct) universalImageView.getTag();
                if (cct != null) {
                    diu.a(3, "PostKey", cct.m12282e());
                } else {
                    diu.a(3, "PostKey", "");
                }
                chn.m13381a("PostAction", "PlayGif", cct.m12282e(), null, diu);
            }
        }
    }

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$4 */
    class C16774 implements C4059d {
        /* renamed from: a */
        final /* synthetic */ ccp f8742a;

        C16774(ccp ccp) {
            this.f8742a = ccp;
        }

        /* renamed from: a */
        public void m12566a(View view, dlm dlm, UniversalImageView universalImageView) {
            dhe.c(this.f8742a.f8663a, new GagPostItemActionEvent(3, (cct) universalImageView.getTag()));
        }
    }

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$a */
    public static class C1678a implements OnClickListener {
        /* renamed from: a */
        String f8743a;

        public C1678a(String str) {
            this.f8743a = str;
        }

        public void onClick(View view) {
            int i;
            boolean z = true;
            int id = view.getId();
            cct cct = (cct) view.getTag();
            switch (id) {
                case R.id.postTitle:
                    i = 11;
                    break;
                case R.id.commentCount:
                case R.id.commentBtn:
                    i = 2;
                    if (cip.m13967a().m14019x()) {
                        dhe.c("hint-tap-comment", new cbm(false));
                        cip.m13967a().m14020y();
                        chn.m13445q("OnBoarding", "CompleteTapCommentTutorial");
                    }
                    crj.a("TopComments", "TapTopComment", 0);
                    break;
                case R.id.upVoteBtn:
                    i = 4;
                    if (cip.m13967a().m14021z()) {
                        dhe.c("hint-tap-upvote", new cbm(false));
                        cip.m13967a().m13969A();
                        chn.m13445q("OnBoarding", "CompleteTapVoteTutorial");
                        break;
                    }
                    break;
                case R.id.downVoteBtn:
                    i = 5;
                    break;
                case R.id.postProfileLabel:
                    i = 8;
                    break;
                case R.id.btnMoreAction:
                    i = 9;
                    break;
                case R.id.btnMore:
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
            dhe.c(this.f8743a, new GagPostItemActionEvent(i, cct));
            if (id == R.id.upVoteBtn || id == R.id.downVoteBtn) {
                ViewGroup viewGroup = (ViewGroup) view.getParent().getParent();
                TextView textView = (TextView) viewGroup.findViewById(R.id.commentCount);
                CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.upVoteBtn);
                CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.downVoteBtn);
                if (cct != null) {
                    if (checkBox != null) {
                        checkBox.setChecked(cct.m12295r() == 1);
                    }
                    if (checkBox2 != null) {
                        if (cct.m12295r() != -1) {
                            z = false;
                        }
                        checkBox2.setChecked(z);
                    }
                    if (textView != null) {
                        textView.setText(cct.m12274a(view.getContext()));
                    }
                }
            }
        }
    }

    /* compiled from: GagPostListRenderer */
    /* renamed from: ccp$c */
    public static class C1679c {
        /* renamed from: a */
        public String f8744a;
        /* renamed from: b */
        public int f8745b;

        public C1679c(String str, int i) {
            this.f8744a = str;
            this.f8745b = i;
        }
    }

    public ccp(String str, com com, boolean z, cco cco) {
        this.f8663a = str;
        this.f8667e = z;
        this.f8664b = com;
        this.f8672j = new C1678a(str);
        this.f8666d = cco;
    }

    /* renamed from: a */
    public C0605t mo1646a(ViewGroup viewGroup, int i) {
        cro cro = (cro) crj.b(cro.class);
        boolean z = (cro == null || cro.c().intValue() == cro.a().intValue()) ? false : true;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(z ? R.layout.post_item_v3_universal_image_view_native : R.layout.post_item_v3_universal_image_view, viewGroup, false);
        C1665b cdt = new cdt(inflate, this.f8664b.f16683a);
        cdt.mo1630a();
        mo1676a(cdt);
        inflate.setTag(cdt);
        m12417a(z, inflate);
        return cdt;
    }

    /* renamed from: a */
    protected void m12417a(boolean z, View view) {
        if (z) {
            OnClickListener a = ccq.m12567a();
            View findViewById = view.findViewById(R.id.upVoteBtn_native);
            View findViewById2 = view.findViewById(R.id.downVoteBtn_native);
            View findViewById3 = view.findViewById(R.id.commentBtn_native);
            View findViewById4 = view.findViewById(R.id.btnMoreAction_native);
            if (findViewById != null) {
                findViewById.setOnClickListener(a);
            }
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(a);
            }
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(a);
            }
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(a);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m12408d(View view) {
        if (view != null) {
            new cqd(view.getContext()).b("a4Z3L4p", true);
        }
    }

    /* renamed from: a */
    public void mo1647a(C0605t c0605t, int i, cct cct) {
        if (cct == null || cct.R() == null) {
            c0605t.itemView.setVisibility(8);
            return;
        }
        c0605t.itemView.setVisibility(0);
        C1665b c1665b = (C1665b) c0605t;
        if (cct == c1665b.f8644c.getTag()) {
            m12422b(c1665b, cct);
            m12415a(c1665b, i, cct);
            View b = dle.b();
            if (b != null && b == c1665b.f8644c.getPlayerView()) {
                c1665b.f8644c.b();
                return;
            }
            return;
        }
        crj.a("TopComments", "ShowTopComment", 0);
        crs crs = (crs) crj.b(crs.class);
        Object obj = (crs == null || crs.c().intValue() != 1) ? null : 1;
        if (!this.f8663a.startsWith("single-post") && obj != null && c1665b.f8659s != null) {
            c1665b.f8659s.setVisibility(0);
            cdh a = cge.m13081a(cct.m12282e(), ccr.m12568a(this, cct, i));
            if (a != null) {
                c1665b.f8659s.setTotalCommentCount(a.m12608b());
                c1665b.f8659s.setCommentUrl(cct.m12282e());
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (ApiComment apiComment : a.m12607a()) {
                    if ("text".equals(apiComment.type) && apiComment.isAnonymous != 1) {
                        i2++;
                        arrayList.add(new C4063a(apiComment.user.displayName, Html.fromHtml(apiComment.text).toString(), apiComment.likeCount, apiComment.commentId));
                    }
                    i2 = i2;
                }
                if (i2 > 3) {
                    i2 = 3;
                }
                c1665b.f8659s.setNumberOfCommentsToShow(i2);
                c1665b.f8659s.setUserAndCommentList(arrayList);
            } else {
                c1665b.f8659s.setVisibility(8);
            }
        } else if (c1665b.f8659s != null) {
            c1665b.f8659s.setVisibility(8);
        }
        Context context = c1665b.itemView.getContext();
        if (m12418a()) {
            mo1703a(c1665b, cct);
        } else {
            c1665b.f8645d.setVisibility(8);
        }
        C4972a a2;
        if (cct.m12287j()) {
            a2 = new C4972a().a(cct.m12299v(), cct.m12300w(), cct.m12301x()).h(true).b(cct.m12258B()).c(this.f8665c.m12073f().m13505b(context, cct.m12282e(), cct.m12283f(), this.f8665c.m12068d().f8408e)).g(cct.m12300w() < cct.m12301x()).a(C4497b.f19782b).a(cct.m12291n() ? R.drawable.ic_play_video : R.drawable.ic_play_gif).a(this.f8670h).a(this.f8671i).a(this.f8665c.m12077h().mo1776s()).a(this.f8665c.m12090t()).b(1.3f).a(this.f8669g).a(cct.m12291n() ? djf.a(((cld) cct.R()).m12610B().image460sv.duration.longValue()) : null);
            boolean z = cct.m12291n() && ((cld) cct.R()).m12610B().image460sv.hasAudio.intValue() == 1;
            c1665b.f8644c.setAdapter(a2.b(z).c(VERSION.SDK_INT != 23).b());
        } else if (this.f8667e && cct.m12293p()) {
            c1665b.f8644c.setAdapter(new C4972a().a(cct.m12302y(), cct.m12303z(), cct.m12257A()).d(true).h(true).a(this.f8669g).d(context.getString(R.string.expand_post)).a(this.f8670h).a(this.f8671i).a(this.f8665c.m12090t()).b(1.3f).b());
        } else if (cct.m12288k()) {
            c1665b.f8644c.setAdapter(new C4972a().a(cct.m12299v(), cct.m12300w(), cct.m12301x()).d(true).a(this.f8669g).h(true).d(context.getString(R.string.cover_message)).a(this.f8670h).a(this.f8671i).a(this.f8665c.m12090t()).b(1.3f).b());
        } else {
            a2 = new C4972a().h(true).a(this.f8669g).a(this.f8670h).a(this.f8665c.m12090t()).b(1.3f).a(this.f8671i);
            if (!cct.m12294q()) {
                a2.a(cct.m12299v(), cct.m12300w(), cct.m12301x());
            } else if (((cld) cct.R()).m12612D().f9533a != null) {
                a2.a(cct.m12261E(), cct.m12262F());
                for (ckg ckg : cct.m12263G()) {
                    a2.a(new C4484d(ckg.f9530a, ckg.f9531b, ckg.f9532c));
                }
            } else {
                a2.a(cct.m12299v(), cct.m12300w(), cct.m12301x());
            }
            if (cct.m12290m()) {
                a2.a(R.drawable.ic_play_video);
            }
            c1665b.f8644c.setAdapter(a2.b());
        }
        c1665b.f8644c.setTag(cct);
        if (!this.f8665c.m12087q().m14434n()) {
            c1665b.f8650j.setVisibility(8);
        } else if (cct.m12264H() == null || cct.m12264H().length <= 0) {
            c1665b.f8650j.setVisibility(8);
        } else {
            c1665b.f8650j.setText(m12404a(c0605t.itemView.getContext(), cct.m12264H(), cct));
            c1665b.f8650j.setMovementMethod(LinkMovementMethod.getInstance());
            c1665b.f8650j.setVisibility(0);
        }
        m12422b(c1665b, cct);
        m12415a(c1665b, i, cct);
    }

    /* renamed from: a */
    static /* synthetic */ void m12406a(ccp ccp, cct cct, int i) {
        cdh cdh = (cdh) djm.a(cij.m13687a().m13722d(cct.m12282e()).f9538c, cdh.class);
        if (cdh != null) {
            cge.m13086a(cct.m12282e(), cdh);
        }
        dhe.c(ccp.f8663a, new C1679c(cct.m12282e(), i));
    }

    /* renamed from: a */
    private SpannableStringBuilder m12404a(final Context context, String[] strArr, final cct cct) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = "\t";
        for (int i = 0; i < strArr.length; i++) {
            final String str = strArr[i];
            int length = spannableStringBuilder.length();
            int length2 = spannableStringBuilder.length() + strArr[i].length();
            spannableStringBuilder.append(strArr[i]);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 17);
            spannableStringBuilder.setSpan(new ClickableSpan(this) {
                /* renamed from: d */
                final /* synthetic */ ccp f8740d;

                public void onClick(View view) {
                    new cqd(view.getContext()).a(str, 16);
                    diu diu = new diu();
                    diu.a("PostKey", cct.m12282e());
                    if (this.f8740d.f8666d.f8731c == 13) {
                        diu.a("TriggeredFrom", "SinglePostWithCommentView");
                    } else {
                        diu.a("TriggeredFrom", "PostList");
                    }
                    chn.m13381a("TagAction", "TapTag", null, null, diu);
                }

                public void updateDrawState(TextPaint textPaint) {
                    textPaint.linkColor = context.getResources().getColor(R.color.post_list_item_tag_color);
                    textPaint.setColor(textPaint.linkColor);
                    textPaint.setUnderlineText(false);
                }
            }, length, length2, 17);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public void mo1660b(C0605t c0605t, int i, cct cct) {
    }

    /* renamed from: b */
    public void m12423b(boolean z) {
        this.f8668f = z;
    }

    /* renamed from: a */
    public boolean m12418a() {
        return this.f8668f;
    }

    /* renamed from: a */
    public void mo1703a(C1665b c1665b, cct cct) {
    }

    /* renamed from: b */
    protected void m12422b(C1665b c1665b, cct cct) {
        c1665b.f8651k.setTag(cct);
        c1665b.f8652l.setTag(cct);
        c1665b.f8653m.setTag(cct);
        c1665b.f8648h.setTag(cct);
        c1665b.f8647g.setTag(cct);
        c1665b.f8654n.setTag(cct);
        c1665b.f8646f.setTag(cct);
        c1665b.f8658r.setTag(cct);
    }

    /* renamed from: a */
    protected void m12415a(C1665b c1665b, int i, cct cct) {
        c1665b.f8648h.setText(cct.m12274a(c1665b.itemView.getContext()));
        c1665b.f8647g.setText(cct.m12281d());
        if (cct.m12298u() != null) {
            c1665b.f8646f.setVisibility(0);
            c1665b.f8646f.setText(mo1710a(cct.m12298u()));
        } else {
            c1665b.f8646f.setVisibility(8);
        }
        c1665b.f8649i.setVisibility(djy.a(cct.m12265I()));
        m12407c(c1665b, cct);
    }

    /* renamed from: a */
    protected String mo1710a(String str) {
        return "";
    }

    /* renamed from: a */
    protected void mo1676a(C1665b c1665b) {
        c1665b.f8653m.setOnClickListener(this.f8672j);
        c1665b.f8648h.setOnClickListener(this.f8672j);
        c1665b.f8651k.setOnClickListener(this.f8672j);
        c1665b.f8652l.setOnClickListener(this.f8672j);
        c1665b.f8647g.setOnClickListener(this.f8672j);
        c1665b.f8654n.setOnClickListener(this.f8672j);
        c1665b.f8646f.setOnClickListener(this.f8672j);
        c1665b.f8658r.setOnClickListener(this.f8672j);
    }

    /* renamed from: c */
    private void m12407c(C1665b c1665b, cct cct) {
        boolean z;
        boolean z2 = true;
        CheckBox checkBox = c1665b.f8651k;
        if (cct.m12295r() == 1) {
            z = true;
        } else {
            z = false;
        }
        checkBox.setChecked(z);
        CheckBox checkBox2 = c1665b.f8652l;
        if (cct.m12295r() != -1) {
            z2 = false;
        }
        checkBox2.setChecked(z2);
        c1665b.f8648h.setText(cct.m12274a(c1665b.itemView.getContext()));
    }

    /* renamed from: c */
    public void m12425c(boolean z) {
        this.f8667e = z;
    }

    /* renamed from: b */
    public com m12419b() {
        return this.f8664b;
    }

    /* renamed from: a */
    public void m12413a(View view) {
        Object tag = view.getTag();
        if (tag != null && (tag instanceof C1665b)) {
            C1665b c1665b = (C1665b) tag;
            if (c1665b.f8644c != null) {
                c1665b.f8644c.b();
            }
        }
    }

    /* renamed from: b */
    public void m12421b(View view) {
        Object tag = view.getTag();
        if (tag != null && (tag instanceof C1665b)) {
            C1665b c1665b = (C1665b) tag;
            if (c1665b.f8644c != null) {
                c1665b.f8644c.c();
            }
        }
    }

    /* renamed from: c */
    public void m12424c(View view) {
        Object tag = view.getTag();
        if (tag != null && (tag instanceof C1665b)) {
            C1665b c1665b = (C1665b) tag;
            if (c1665b.f8644c != null) {
                c1665b.f8644c.e();
            }
        }
    }
}
