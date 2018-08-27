package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.design.widget.VisibilityAwareImageButton;
import p000.af.C0141a;
import p000.an.C0316d;

@TargetApi(14)
/* compiled from: FloatingActionButtonIcs */
/* renamed from: ae */
public class ae extends ad {
    /* renamed from: q */
    private float f735q = this.n.getRotation();

    public ae(VisibilityAwareImageButton visibilityAwareImageButton, aj ajVar, C0316d c0316d) {
        super(visibilityAwareImageButton, ajVar, c0316d);
    }

    /* renamed from: d */
    boolean mo108d() {
        return true;
    }

    /* renamed from: e */
    void mo109e() {
        float rotation = this.n.getRotation();
        if (this.f735q != rotation) {
            this.f735q = rotation;
            m921p();
        }
    }

    /* renamed from: a */
    void mo40a(final C0141a c0141a, final boolean z) {
        if (!m554n()) {
            this.n.animate().cancel();
            if (m920o()) {
                this.c = 1;
                this.n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C5775v.f25658c).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ ae f730c;
                    /* renamed from: d */
                    private boolean f731d;

                    public void onAnimationStart(Animator animator) {
                        this.f730c.n.m3176a(0, z);
                        this.f731d = false;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.f731d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f730c.c = 0;
                        if (!this.f731d) {
                            this.f730c.n.m3176a(z ? 8 : 4, z);
                            if (c0141a != null) {
                                c0141a.mo413b();
                            }
                        }
                    }
                });
                return;
            }
            this.n.m3176a(z ? 8 : 4, z);
            if (c0141a != null) {
                c0141a.mo413b();
            }
        }
    }

    /* renamed from: b */
    void mo47b(final C0141a c0141a, final boolean z) {
        if (!m553m()) {
            this.n.animate().cancel();
            if (m920o()) {
                this.c = 2;
                if (this.n.getVisibility() != 0) {
                    this.n.setAlpha(0.0f);
                    this.n.setScaleY(0.0f);
                    this.n.setScaleX(0.0f);
                }
                this.n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C5775v.f25659d).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ ae f734c;

                    public void onAnimationStart(Animator animator) {
                        this.f734c.n.m3176a(0, z);
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f734c.c = 0;
                        if (c0141a != null) {
                            c0141a.mo412a();
                        }
                    }
                });
                return;
            }
            this.n.m3176a(0, z);
            this.n.setAlpha(1.0f);
            this.n.setScaleY(1.0f);
            this.n.setScaleX(1.0f);
            if (c0141a != null) {
                c0141a.mo412a();
            }
        }
    }

    /* renamed from: o */
    private boolean m920o() {
        return jd.m21196H(this.n) && !this.n.isInEditMode();
    }

    /* renamed from: p */
    private void m921p() {
        if (VERSION.SDK_INT == 19) {
            if (this.f735q % 90.0f != 0.0f) {
                if (this.n.getLayerType() != 1) {
                    this.n.setLayerType(1, null);
                }
            } else if (this.n.getLayerType() != 0) {
                this.n.setLayerType(0, null);
            }
        }
        if (this.a != null) {
            this.a.m1651a(-this.f735q);
        }
        if (this.f != null) {
            this.f.b(-this.f735q);
        }
    }
}
