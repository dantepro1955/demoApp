package com.p000;

import android.content.Context;
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

/* compiled from: OverlayOuterUiController */
/* renamed from: cej */
public class cej extends ceg {
    /* renamed from: b */
    private caf f8904b = caf.m12046a();
    /* renamed from: c */
    private ImageView f8905c;
    /* renamed from: d */
    private ImageView f8906d;
    /* renamed from: e */
    private ImageView f8907e;
    /* renamed from: f */
    private ImageView f8908f;
    /* renamed from: g */
    private TextView f8909g;
    /* renamed from: h */
    private TextView f8910h;
    /* renamed from: i */
    private TextView f8911i;
    /* renamed from: j */
    private TextView f8912j;
    /* renamed from: k */
    private View f8913k;
    /* renamed from: l */
    private View f8914l;
    /* renamed from: m */
    private View f8915m;
    /* renamed from: n */
    private ImageButton f8916n;
    /* renamed from: o */
    private ImageButton f8917o;
    /* renamed from: p */
    private TextView f8918p;
    /* renamed from: q */
    private ProgressBar f8919q;
    /* renamed from: r */
    private ViewGroup f8920r;
    /* renamed from: s */
    private boolean f8921s = false;
    /* renamed from: t */
    private boolean f8922t = true;
    /* renamed from: u */
    private boolean f8923u = false;
    /* renamed from: v */
    private cct f8924v;
    /* renamed from: w */
    private cco f8925w;
    /* renamed from: x */
    private OnTouchListener f8926x = new C16931(this);
    /* renamed from: y */
    private OnClickListener f8927y = new C16942(this);

    /* compiled from: OverlayOuterUiController */
    /* renamed from: cej$1 */
    class C16931 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ cej f8902a;

        C16931(cej cej) {
            this.f8902a = cej;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || this.f8902a.f8920r == null) {
                return false;
            }
            int childCount = this.f8902a.f8920r.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f8902a.f8920r.getChildAt(i);
                boolean a = cej.m12786a(motionEvent.getRawX(), motionEvent.getRawY(), childAt);
                boolean z = this.f8902a.m12736b().m12778l().f9932a;
                if (a && z && this.f8902a.f8922t) {
                    Object tag = childAt.getTag();
                    if (tag != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("comment_id", (String) tag);
                        dhe.c(this.f8902a.f8925w.f8730b, new GagPostItemActionEvent(8, this.f8902a.f8924v, hashMap));
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: OverlayOuterUiController */
    /* renamed from: cej$2 */
    class C16942 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cej f8903a;

        C16942(cej cej) {
            this.f8903a = cej;
        }

        public void onClick(View view) {
            if (this.f8903a.f8921s) {
                int id = view.getId();
                if (this.f8903a.f8922t) {
                    Context context = view.getContext();
                    if (id == R.id.upVoteBtn) {
                        this.f8903a.m12782a(context, this.f8903a.f8924v, 1);
                        this.f8903a.m12793h();
                    } else if (id == R.id.downVoteBtn) {
                        this.f8903a.m12782a(context, this.f8903a.f8924v, -1);
                        this.f8903a.m12793h();
                    } else if (id == R.id.moreBtn) {
                        dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(9, this.f8903a.f8924v));
                    } else if (id == R.id.commentBtn) {
                        dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(2, this.f8903a.f8924v));
                    } else if (id == R.id.btnShare) {
                        dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(3, this.f8903a.f8924v));
                    } else if (id == R.id.postTitle) {
                        dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(2, this.f8903a.f8924v));
                    } else if (id == R.id.btnBack) {
                        dhe.c(this.f8903a.f8925w.f8730b, new FinishOverlayEvent());
                    } else if (id == R.id.btnTogglePlay) {
                    } else {
                        if (id == R.id.commentCount) {
                            dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(2, this.f8903a.f8924v));
                        } else if (id == R.id.pointCount) {
                            dhe.c(this.f8903a.f8925w.f8730b, new GagPostItemActionEvent(2, this.f8903a.f8924v));
                        }
                    }
                }
            }
        }
    }

    public cej(cco cco) {
        this.f8925w = cco;
    }

    /* renamed from: a */
    public void m12798a(View view, cct cct) {
        this.f8924v = cct;
        this.f8913k = view.findViewById(R.id.control_layer);
        this.f8914l = this.f8913k.findViewById(R.id.header);
        this.f8915m = this.f8913k.findViewById(R.id.overlayFooter);
        this.f8905c = (ImageView) view.findViewById(R.id.upVoteBtn);
        this.f8906d = (ImageView) view.findViewById(R.id.downVoteBtn);
        this.f8907e = (ImageView) view.findViewById(R.id.moreBtn);
        this.f8908f = (ImageView) view.findViewById(R.id.commentBtn);
        this.f8916n = (ImageButton) view.findViewById(R.id.btnBack);
        this.f8918p = (TextView) view.findViewById(R.id.btnShare);
        this.f8909g = djy.a(view, R.id.commentCount);
        this.f8912j = djy.a(view, R.id.countSep);
        this.f8910h = djy.a(view, R.id.pointCount);
        this.f8911i = djy.a(view, R.id.postTitle);
        this.f8919q = (ProgressBar) view.findViewById(R.id.overlayProgressBar);
        this.f8920r = (ViewGroup) view.findViewById(R.id.popupCommentBlk);
        this.f8921s = true;
        this.f8920r.setOnTouchListener(this.f8926x);
        this.f8911i.setText(cct.m12281d());
        m12783a(this.f8927y);
        m12799e();
        m12793h();
    }

    /* renamed from: a */
    public void mo1689a() {
        m12783a(null);
        this.f8924v = null;
        this.f8913k = null;
        this.f8914l = null;
        this.f8915m = null;
        this.f8916n = null;
        this.f8917o = null;
        this.f8905c = null;
        this.f8906d = null;
        this.f8907e = null;
        this.f8908f = null;
        this.f8918p = null;
        this.f8909g = null;
        this.f8910h = null;
        this.f8911i = null;
        this.f8919q = null;
        this.f8920r = null;
        this.f8921s = false;
    }

    /* renamed from: e */
    void m12799e() {
        if (this.f8921s && !this.f8904b.m12094x().m12104c()) {
            this.f8924v.m12266J();
            m12793h();
        }
    }

    /* renamed from: a */
    private void m12783a(OnClickListener onClickListener) {
        if (this.f8921s) {
            this.f8905c.setOnClickListener(onClickListener);
            this.f8906d.setOnClickListener(onClickListener);
            this.f8908f.setOnClickListener(onClickListener);
            this.f8911i.setOnClickListener(onClickListener);
            this.f8910h.setOnClickListener(onClickListener);
            this.f8909g.setOnClickListener(onClickListener);
            this.f8916n.setOnClickListener(onClickListener);
            if (this.f8907e != null) {
                this.f8907e.setOnClickListener(onClickListener);
            }
            if (this.f8918p != null) {
                this.f8918p.setOnClickListener(onClickListener);
            }
        }
    }

    /* renamed from: h */
    private void m12793h() {
        if (this.f8921s) {
            if (this.f8924v.m12295r() == 1) {
                this.f8905c.setImageResource(R.drawable.ic_overlay_upvote_selected);
            } else {
                this.f8905c.setImageResource(R.drawable.ic_overlay_upvote);
            }
            if (this.f8924v.m12295r() == -1) {
                this.f8906d.setImageResource(R.drawable.ic_overlay_downvote_selected);
            } else {
                this.f8906d.setImageResource(R.drawable.ic_overlay_downvote);
            }
            m12794i();
        }
    }

    /* renamed from: f */
    public boolean m12800f() {
        return this.f8922t;
    }

    /* renamed from: i */
    private void m12794i() {
        if (this.f8921s) {
            Context context = this.f8909g.getContext();
            this.f8909g.setText(this.f8924v.m12278b(context));
            this.f8910h.setText(this.f8924v.m12280c(context));
        }
    }

    /* renamed from: j */
    private void m12795j() {
        if (!this.f8922t && this.f8913k != null) {
            this.f8922t = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8914l.getContext(), R.anim.fade_in_quick);
            loadAnimation.setFillAfter(true);
            this.f8914l.startAnimation(loadAnimation);
            this.f8914l.setVisibility(0);
            loadAnimation = AnimationUtils.loadAnimation(this.f8915m.getContext(), R.anim.fade_in_quick);
            loadAnimation.setFillAfter(true);
            this.f8915m.startAnimation(loadAnimation);
            this.f8915m.setVisibility(0);
            this.f8920r.setVisibility(0);
        }
    }

    /* renamed from: k */
    private void m12796k() {
        if (this.f8922t && this.f8913k != null) {
            this.f8922t = false;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8914l.getContext(), R.anim.fade_out_quick);
            loadAnimation.setFillAfter(true);
            this.f8914l.setVisibility(8);
            this.f8914l.startAnimation(loadAnimation);
            loadAnimation = AnimationUtils.loadAnimation(this.f8915m.getContext(), R.anim.fade_out_quick);
            loadAnimation.setFillAfter(true);
            this.f8915m.setVisibility(8);
            this.f8915m.startAnimation(loadAnimation);
            this.f8920r.setVisibility(4);
        }
    }

    /* renamed from: g */
    public void m12801g() {
        if (this.f8922t) {
            m12796k();
        } else {
            m12795j();
        }
    }

    /* renamed from: a */
    private void m12784a(cct cct) {
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
    private void m12787b(cct cct) {
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
    private void m12782a(Context context, cct cct, int i) {
        if (this.f8904b.m12094x().m12104c()) {
            if (i == 1) {
                m12784a(cct);
            } else if (i == -1) {
                m12787b(cct);
            }
        } else if (m12737c() != null) {
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

    /* renamed from: a */
    public static boolean m12786a(float f, float f2, View view) {
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
