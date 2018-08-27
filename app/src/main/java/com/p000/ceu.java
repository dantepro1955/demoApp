package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.design.widget.Snackbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.otto.overlay.FinishOverlayEvent;
import java.util.HashMap;

/* compiled from: OverlayOuterUiControllerV2 */
/* renamed from: ceu */
public class ceu extends ceq {
    /* renamed from: b */
    private caf f8974b = caf.m12046a();
    /* renamed from: c */
    private ImageView f8975c;
    /* renamed from: d */
    private ImageView f8976d;
    /* renamed from: e */
    private ImageView f8977e;
    /* renamed from: f */
    private ImageView f8978f;
    /* renamed from: g */
    private TextView f8979g;
    /* renamed from: h */
    private TextView f8980h;
    /* renamed from: i */
    private TextView f8981i;
    /* renamed from: j */
    private TextView f8982j;
    /* renamed from: k */
    private View f8983k;
    /* renamed from: l */
    private View f8984l;
    /* renamed from: m */
    private View f8985m;
    /* renamed from: n */
    private ImageButton f8986n;
    /* renamed from: o */
    private ImageButton f8987o;
    /* renamed from: p */
    private TextView f8988p;
    /* renamed from: q */
    private ProgressBar f8989q;
    /* renamed from: r */
    private ViewGroup f8990r;
    /* renamed from: s */
    private boolean f8991s = false;
    /* renamed from: t */
    private boolean f8992t = true;
    /* renamed from: u */
    private boolean f8993u = false;
    /* renamed from: v */
    private cct f8994v;
    /* renamed from: w */
    private cco f8995w;
    /* renamed from: x */
    private OnTouchListener f8996x = new C16981(this);
    /* renamed from: y */
    private OnClickListener f8997y = new C16992(this);

    /* compiled from: OverlayOuterUiControllerV2 */
    /* renamed from: ceu$1 */
    class C16981 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ ceu f8972a;

        C16981(ceu ceu) {
            this.f8972a = ceu;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || this.f8972a.f8990r == null) {
                return false;
            }
            int childCount = this.f8972a.f8990r.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f8972a.f8990r.getChildAt(i);
                boolean a = ceu.m12893a(motionEvent.getRawX(), motionEvent.getRawY(), childAt);
                boolean z = this.f8972a.m12835b().m12882l().f9932a;
                if (a && z && this.f8972a.f8992t) {
                    Object tag = childAt.getTag();
                    if (tag != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("comment_id", (String) tag);
                        dhe.c(this.f8972a.f8995w.f8730b, new GagPostItemActionEvent(8, this.f8972a.f8994v, hashMap));
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: OverlayOuterUiControllerV2 */
    /* renamed from: ceu$2 */
    class C16992 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ceu f8973a;

        C16992(ceu ceu) {
            this.f8973a = ceu;
        }

        public void onClick(View view) {
            if (this.f8973a.f8991s) {
                int id = view.getId();
                if (this.f8973a.f8992t) {
                    Context context = view.getContext();
                    switch (id) {
                        case R.id.moreBtn:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(9, this.f8973a.f8994v));
                            return;
                        case R.id.btnShare:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(3, this.f8973a.f8994v));
                            return;
                        case R.id.postTitle:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(2, this.f8973a.f8994v));
                            return;
                        case R.id.pointCount:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(2, this.f8973a.f8994v));
                            return;
                        case R.id.commentCount:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(2, this.f8973a.f8994v));
                            return;
                        case R.id.btnBack:
                            dhe.c(this.f8973a.f8995w.f8730b, new FinishOverlayEvent());
                            return;
                        case R.id.btnTogglePlay:
                            this.f8973a.m12905l();
                            return;
                        case R.id.upVoteBtn:
                            this.f8973a.m12888a(context, this.f8973a.f8994v, 1);
                            this.f8973a.m12901h();
                            return;
                        case R.id.downVoteBtn:
                            this.f8973a.m12888a(context, this.f8973a.f8994v, -1);
                            this.f8973a.m12901h();
                            return;
                        case R.id.commentBtn:
                            dhe.c(this.f8973a.f8995w.f8730b, new GagPostItemActionEvent(2, this.f8973a.f8994v));
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public ceu(cco cco) {
        this.f8995w = cco;
    }

    /* renamed from: a */
    public void m12909a(View view, cct cct) {
        this.f8994v = cct;
        this.f8983k = view.findViewById(R.id.control_layer);
        this.f8984l = this.f8983k.findViewById(R.id.header);
        this.f8985m = this.f8983k.findViewById(R.id.overlayFooter);
        this.f8975c = (ImageView) view.findViewById(R.id.upVoteBtn);
        this.f8976d = (ImageView) view.findViewById(R.id.downVoteBtn);
        this.f8977e = (ImageView) view.findViewById(R.id.moreBtn);
        this.f8978f = (ImageView) view.findViewById(R.id.commentBtn);
        this.f8986n = (ImageButton) view.findViewById(R.id.btnBack);
        this.f8988p = (TextView) view.findViewById(R.id.btnShare);
        this.f8979g = djy.a(view, R.id.commentCount);
        this.f8982j = djy.a(view, R.id.countSep);
        this.f8980h = djy.a(view, R.id.pointCount);
        this.f8981i = djy.a(view, R.id.postTitle);
        this.f8989q = (ProgressBar) view.findViewById(R.id.overlayProgressBar);
        this.f8990r = (ViewGroup) view.findViewById(R.id.popupCommentBlk);
        this.f8991s = true;
        this.f8990r.setOnTouchListener(this.f8996x);
        this.f8981i.setText(cct.m12281d());
        m12901h();
        if (cct instanceof cdk) {
            dhe.c(this.f8995w.f8730b, new cdm(false));
            this.f8975c.setVisibility(8);
            this.f8976d.setVisibility(8);
            this.f8978f.setVisibility(8);
            this.f8977e.setVisibility(8);
            this.f8980h.setVisibility(8);
            this.f8990r.setVisibility(8);
            this.f8979g.setText(R.string.sponsored);
            this.f8982j.setText("");
            this.f8988p.setText(((cld) cct.R()).m12629e());
            m12889a(cev.m12913a(this));
            return;
        }
        dhe.c(this.f8995w.f8730b, new cdm(true));
        this.f8975c.setVisibility(0);
        this.f8976d.setVisibility(0);
        this.f8978f.setVisibility(0);
        this.f8977e.setVisibility(0);
        this.f8980h.setVisibility(0);
        this.f8990r.setVisibility(0);
        this.f8988p.setText(R.string.action_share);
        m12889a(this.f8997y);
        m12910e();
    }

    /* renamed from: a */
    static /* synthetic */ void m12892a(ceu ceu, View view) {
        switch (view.getId()) {
            case R.id.btnBack:
                dhe.c(ceu.f8995w.f8730b, new FinishOverlayEvent());
                return;
            default:
                if (view.getContext() instanceof Activity) {
                    ((Activity) view.getContext()).findViewById(R.id.image).performClick();
                    return;
                } else if (view.getContext() instanceof ContextWrapper) {
                    ((Activity) ((ContextWrapper) view.getContext()).getBaseContext()).findViewById(R.id.overlay_native_ad_image).performClick();
                    return;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    public void mo1696a() {
        m12889a(null);
        this.f8994v = null;
        this.f8983k = null;
        this.f8984l = null;
        this.f8985m = null;
        this.f8986n = null;
        this.f8987o = null;
        this.f8975c = null;
        this.f8976d = null;
        this.f8977e = null;
        this.f8978f = null;
        this.f8988p = null;
        this.f8979g = null;
        this.f8980h = null;
        this.f8981i = null;
        this.f8989q = null;
        this.f8990r = null;
        this.f8991s = false;
    }

    /* renamed from: e */
    void m12910e() {
        if (this.f8991s && !this.f8974b.m12094x().m12104c()) {
            this.f8994v.m12266J();
            m12901h();
        }
    }

    /* renamed from: a */
    private void m12889a(OnClickListener onClickListener) {
        if (this.f8991s) {
            this.f8975c.setOnClickListener(onClickListener);
            this.f8976d.setOnClickListener(onClickListener);
            this.f8978f.setOnClickListener(onClickListener);
            this.f8981i.setOnClickListener(onClickListener);
            this.f8979g.setOnClickListener(onClickListener);
            this.f8980h.setOnClickListener(onClickListener);
            this.f8986n.setOnClickListener(onClickListener);
            if (this.f8977e != null) {
                this.f8977e.setOnClickListener(onClickListener);
            }
            if (this.f8988p != null) {
                this.f8988p.setOnClickListener(onClickListener);
            }
        }
    }

    /* renamed from: h */
    private void m12901h() {
        if (this.f8991s) {
            if (this.f8994v.m12295r() == 1) {
                this.f8975c.setImageResource(R.drawable.ic_overlay_upvote_selected);
            } else {
                this.f8975c.setImageResource(R.drawable.ic_overlay_upvote);
            }
            if (this.f8994v.m12295r() == -1) {
                this.f8976d.setImageResource(R.drawable.ic_overlay_downvote_selected);
            } else {
                this.f8976d.setImageResource(R.drawable.ic_overlay_downvote);
            }
            m12902i();
        }
    }

    /* renamed from: f */
    public boolean m12911f() {
        return this.f8992t;
    }

    /* renamed from: i */
    private void m12902i() {
        if (this.f8991s) {
            Context context = this.f8979g.getContext();
            this.f8979g.setText(this.f8994v.m12278b(context));
            this.f8982j.setText(" · ");
            this.f8980h.setText(this.f8994v.m12280c(context));
        }
    }

    /* renamed from: j */
    private void m12903j() {
        if (!this.f8992t && this.f8983k != null) {
            this.f8992t = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8984l.getContext(), R.anim.fade_in_quick);
            loadAnimation.setFillAfter(true);
            this.f8984l.startAnimation(loadAnimation);
            this.f8984l.setVisibility(0);
            loadAnimation = AnimationUtils.loadAnimation(this.f8985m.getContext(), R.anim.fade_in_quick);
            loadAnimation.setFillAfter(true);
            this.f8985m.startAnimation(loadAnimation);
            this.f8985m.setVisibility(0);
            this.f8990r.setVisibility(0);
        }
    }

    /* renamed from: k */
    private void m12904k() {
        if (this.f8992t && this.f8983k != null) {
            this.f8992t = false;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8984l.getContext(), R.anim.fade_out_quick);
            loadAnimation.setFillAfter(true);
            this.f8984l.setVisibility(8);
            this.f8984l.startAnimation(loadAnimation);
            loadAnimation = AnimationUtils.loadAnimation(this.f8985m.getContext(), R.anim.fade_out_quick);
            loadAnimation.setFillAfter(true);
            this.f8985m.setVisibility(8);
            this.f8985m.startAnimation(loadAnimation);
            this.f8990r.setVisibility(4);
        }
    }

    /* renamed from: g */
    public void m12912g() {
        if (this.f8992t) {
            m12904k();
        } else {
            m12903j();
        }
    }

    /* renamed from: a */
    private void m12890a(cct cct) {
        boolean K = cct.m12267K();
        String e = cct.m12282e();
        cct.m12269M();
        if (K) {
            chn.m13373a(e, 1);
            chr.m13522a().m13542a(e, 1, "", true, -1);
            diu diu = new diu();
            diu.a(2, "TriggeredFrom", "Overlay");
            diu.a(3, "PostKey", cct.m12282e());
            chn.m13381a("PostAction", "UpvotePost", cct.m12282e(), null, diu);
            return;
        }
        chn.m13373a(e, 0);
        chr.m13522a().m13542a(e, 0, "", true, -1);
        diu = new diu();
        diu.a(2, "TriggeredFrom", "Overlay");
        diu.a(3, "PostKey", cct.m12282e());
        chn.m13381a("PostAction", "UnUpvotePost", cct.m12282e(), null, diu);
    }

    /* renamed from: b */
    private void m12894b(cct cct) {
        boolean L = cct.m12268L();
        String e = cct.m12282e();
        cct.m12269M();
        if (L) {
            chn.m13373a(e, -1);
            chr.m13522a().m13542a(e, -1, "", true, -1);
            diu diu = new diu();
            diu.a(2, "TriggeredFrom", "Overlay");
            diu.a(3, "PostKey", cct.m12282e());
            chn.m13381a("PostAction", "DownvotePost", cct.m12282e(), null, diu);
            return;
        }
        chn.m13373a(e, 0);
        chr.m13522a().m13542a(e, 0, "", true, -1);
        diu = new diu();
        diu.a(2, "TriggeredFrom", "Overlay");
        diu.a(3, "PostKey", cct.m12282e());
        chn.m13381a("PostAction", "UnDownvotePost", cct.m12282e(), null, diu);
    }

    /* renamed from: a */
    private void m12888a(Context context, cct cct, int i) {
        if (this.f8974b.m12094x().m12104c()) {
            if (i == 1) {
                m12890a(cct);
            } else if (i == -1) {
                m12894b(cct);
            }
        } else if (m12836c() != null) {
            if (i == 1) {
                cct.m12267K();
                cre.a(context, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            } else {
                cct.m12268L();
                cre.b(context, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            }
            cct.m12269M();
        }
    }

    /* renamed from: l */
    private void m12905l() {
        if (this.f8991s) {
            m12835b().m12882l().f9932a = !m12835b().m12882l().f9932a;
            boolean z = m12835b().m12882l().f9932a;
            m12835b().m12882l().m14971a();
            if (z) {
                m12907n();
                if (!(this.f8994v == null || this.f8994v.R() == null)) {
                    chn.m13394b("Overlay", "TurnOnBulletComment", this.f8994v.m12282e());
                }
                m12887a((int) R.string.snackbar_text_bullet_comment_enabled);
                return;
            }
            m12906m();
            if (!(this.f8994v == null || this.f8994v.R() == null)) {
                chn.m13394b("Overlay", "TurnOffBulletComment", this.f8994v.m12282e());
            }
            m12887a((int) R.string.snackbar_text_bullet_comment_disabled);
        }
    }

    /* renamed from: m */
    private void m12906m() {
        cwq.a(this.f8990r, "alpha", new float[]{1.0f, 0.0f}).a(200).a();
    }

    /* renamed from: n */
    private void m12907n() {
        cwq.a(this.f8990r, "alpha", new float[]{0.0f, 1.0f}).a(200).a();
    }

    /* renamed from: a */
    private void m12887a(int i) {
        Activity c = m12836c();
        if (c != null) {
            Snackbar.m3202a(c.findViewById(16908290), c.getString(i), -1).a();
        }
    }

    /* renamed from: a */
    public static boolean m12893a(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= ((float) i) || f >= ((float) (i + view.getWidth())) || f2 <= ((float) i2) || f2 >= ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }
}
