package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p000.cd.C1258c;

@TargetApi(14)
/* compiled from: FadePort */
/* renamed from: bo */
class bo extends cs {
    /* renamed from: a */
    private static boolean f7219a = false;
    /* renamed from: b */
    private int f7220b;

    public bo() {
        this(3);
    }

    public bo(int i) {
        this.f7220b = i;
    }

    /* renamed from: a */
    private Animator m10079a(View view, float f, float f2, AnimatorListenerAdapter animatorListenerAdapter) {
        Animator animator = null;
        if (f != f2) {
            animator = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, f2});
            if (f7219a) {
                Log.d("Fade", "Created animator " + animator);
            }
            if (animatorListenerAdapter != null) {
                animator.addListener(animatorListenerAdapter);
            }
        } else if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
        return animator;
    }

    /* renamed from: d */
    private void m10080d(cj cjVar) {
        int[] iArr = new int[2];
        cjVar.f9414b.getLocationOnScreen(iArr);
        cjVar.f9413a.put("android:fade:screenX", Integer.valueOf(iArr[0]));
        cjVar.f9413a.put("android:fade:screenY", Integer.valueOf(iArr[1]));
    }

    /* renamed from: a */
    public void m10082a(cj cjVar) {
        super.a(cjVar);
        m10080d(cjVar);
    }

    /* renamed from: a */
    public Animator m10081a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        if ((this.f7220b & 1) != 1 || cjVar2 == null) {
            return null;
        }
        final View view = cjVar2.f9414b;
        if (f7219a) {
            Log.d("Fade", "Fade.onAppear: startView, startVis, endView, endVis = " + (cjVar != null ? cjVar.f9414b : null) + ", " + i + ", " + view + ", " + i2);
        }
        view.setAlpha(0.0f);
        a(new C1258c(this) {
            /* renamed from: a */
            boolean f7201a = false;
            /* renamed from: b */
            float f7202b;
            /* renamed from: d */
            final /* synthetic */ bo f7204d;

            /* renamed from: a */
            public void mo1254a(cd cdVar) {
                if (!this.f7201a) {
                    view.setAlpha(1.0f);
                }
            }

            /* renamed from: b */
            public void mo1255b(cd cdVar) {
                this.f7202b = view.getAlpha();
                view.setAlpha(1.0f);
            }

            /* renamed from: c */
            public void mo1256c(cd cdVar) {
                view.setAlpha(this.f7202b);
            }
        });
        return m10079a(view, 0.0f, 1.0f, null);
    }

    /* renamed from: b */
    public Animator m10083b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        if ((this.f7220b & 2) != 2) {
            return null;
        }
        View view;
        View view2;
        View view3;
        int id;
        View view4 = cjVar != null ? cjVar.f9414b : null;
        if (cjVar2 != null) {
            view = cjVar2.f9414b;
        } else {
            view = null;
        }
        if (f7219a) {
            Log.d("Fade", "Fade.onDisappear: startView, startVis, endView, endVis = " + view4 + ", " + i + ", " + view + ", " + i2);
        }
        if (view == null || view.getParent() == null) {
            if (view != null) {
                view2 = null;
                view3 = view;
                view4 = view;
            } else {
                if (view4 != null) {
                    if (view4.getParent() == null) {
                        view2 = null;
                        view3 = view4;
                    } else if ((view4.getParent() instanceof View) && view4.getParent().getParent() == null) {
                        id = ((View) view4.getParent()).getId();
                        if (id == -1 || viewGroup.findViewById(id) == null || !this.q) {
                            Object obj = null;
                            view4 = null;
                        } else {
                            view = view4;
                        }
                        view2 = null;
                        view3 = view;
                    }
                }
                view2 = null;
                view3 = null;
                view4 = null;
            }
        } else if (i2 == 4) {
            view2 = view;
            view3 = null;
            view4 = view;
        } else if (view4 == view) {
            view2 = view;
            view3 = null;
            view4 = view;
        } else {
            view2 = null;
            view3 = view4;
        }
        final int i3;
        final ViewGroup viewGroup2;
        if (view3 != null) {
            int intValue = ((Integer) cjVar.f9413a.get("android:fade:screenX")).intValue();
            id = ((Integer) cjVar.f9413a.get("android:fade:screenY")).intValue();
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            jd.m21240f(view3, (intValue - iArr[0]) - view3.getLeft());
            jd.m21237e(view3, (id - iArr[1]) - view3.getTop());
            cl.m14225a(viewGroup).m14226a(view3);
            i3 = i2;
            viewGroup2 = viewGroup;
            return m10079a(view4, 1.0f, 0.0f, new AnimatorListenerAdapter(this) {
                /* renamed from: f */
                final /* synthetic */ bo f7210f;

                public void onAnimationEnd(Animator animator) {
                    view4.setAlpha(1.0f);
                    if (view2 != null) {
                        view2.setVisibility(i3);
                    }
                    if (view3 != null) {
                        cl.m14225a(viewGroup2).m14227b(view3);
                    }
                }
            });
        } else if (view2 == null) {
            return null;
        } else {
            view2.setVisibility(0);
            i3 = i2;
            viewGroup2 = viewGroup;
            return m10079a(view4, 1.0f, 0.0f, new AnimatorListenerAdapter(this) {
                /* renamed from: a */
                boolean f7211a = false;
                /* renamed from: b */
                float f7212b = -1.0f;
                /* renamed from: h */
                final /* synthetic */ bo f7218h;

                public void onAnimationCancel(Animator animator) {
                    this.f7211a = true;
                    if (this.f7212b >= 0.0f) {
                        view4.setAlpha(this.f7212b);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    if (!this.f7211a) {
                        view4.setAlpha(1.0f);
                    }
                    if (!(view2 == null || this.f7211a)) {
                        view2.setVisibility(i3);
                    }
                    if (view3 != null) {
                        cl.m14225a(viewGroup2).m14226a(view3);
                    }
                }
            });
        }
    }
}
