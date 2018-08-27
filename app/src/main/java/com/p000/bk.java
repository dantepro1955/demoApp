package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.flurry.android.AdCreative;
import p000.cd.C1258c;

@TargetApi(14)
/* compiled from: ChangeBoundsPort */
/* renamed from: bk */
class bk extends cd {
    /* renamed from: w */
    private static final String[] f6647w = new String[]{"android:changeBounds:bounds", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    /* renamed from: x */
    private static bq f6648x = new bq();
    /* renamed from: a */
    int[] f6649a = new int[2];
    /* renamed from: b */
    boolean f6650b = false;
    /* renamed from: c */
    boolean f6651c = false;

    /* compiled from: ChangeBoundsPort */
    /* renamed from: bk$1 */
    class C12591 extends C1258c {
        /* renamed from: a */
        boolean f6638a = false;
        /* renamed from: b */
        final /* synthetic */ bk f6639b;

        C12591(bk bkVar) {
            this.f6639b = bkVar;
        }

        /* renamed from: a */
        public void mo1254a(cd cdVar) {
            if (!this.f6638a) {
            }
        }

        /* renamed from: b */
        public void mo1255b(cd cdVar) {
        }

        /* renamed from: c */
        public void mo1256c(cd cdVar) {
        }
    }

    /* compiled from: ChangeBoundsPort */
    /* renamed from: bk$2 */
    class C12602 extends C1258c {
        /* renamed from: a */
        boolean f6640a = false;
        /* renamed from: b */
        final /* synthetic */ bk f6641b;

        C12602(bk bkVar) {
            this.f6641b = bkVar;
        }

        /* renamed from: a */
        public void mo1254a(cd cdVar) {
            if (!this.f6640a) {
            }
        }

        /* renamed from: b */
        public void mo1255b(cd cdVar) {
        }

        /* renamed from: c */
        public void mo1256c(cd cdVar) {
        }
    }

    /* compiled from: ChangeBoundsPort */
    /* renamed from: bk$3 */
    class C12613 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ bk f6642a;

        C12613(bk bkVar) {
            this.f6642a = bkVar;
        }

        public void onAnimationEnd(Animator animator) {
        }
    }

    bk() {
    }

    /* renamed from: a */
    public String[] mo1259a() {
        return f6647w;
    }

    /* renamed from: c */
    private void m8996c(cj cjVar) {
        View view = cjVar.f9414b;
        cjVar.f9413a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        cjVar.f9413a.put("android:changeBounds:parent", cjVar.f9414b.getParent());
        cjVar.f9414b.getLocationInWindow(this.f6649a);
        cjVar.f9413a.put("android:changeBounds:windowX", Integer.valueOf(this.f6649a[0]));
        cjVar.f9413a.put("android:changeBounds:windowY", Integer.valueOf(this.f6649a[1]));
    }

    /* renamed from: a */
    public void mo1165a(cj cjVar) {
        m8996c(cjVar);
    }

    /* renamed from: b */
    public void mo1168b(cj cjVar) {
        m8996c(cjVar);
    }

    /* renamed from: a */
    public Animator mo1258a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        if (cjVar == null || cjVar2 == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) cjVar.f9413a.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) cjVar2.f9413a.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final View view = cjVar2.f9414b;
        Object obj = (viewGroup2 == viewGroup3 || viewGroup2.getId() == viewGroup3.getId()) ? 1 : null;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        if (this.f6651c && obj == null) {
            intValue = ((Integer) cjVar.f9413a.get("android:changeBounds:windowX")).intValue();
            intValue2 = ((Integer) cjVar.f9413a.get("android:changeBounds:windowY")).intValue();
            intValue3 = ((Integer) cjVar2.f9413a.get("android:changeBounds:windowX")).intValue();
            intValue4 = ((Integer) cjVar2.f9413a.get("android:changeBounds:windowY")).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f6649a);
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
                view.draw(new Canvas(createBitmap));
                final Drawable bitmapDrawable = new BitmapDrawable(createBitmap);
                view.setVisibility(4);
                cm.m14222d(viewGroup).m14223a(bitmapDrawable);
                Rect rect = new Rect(intValue - this.f6649a[0], intValue2 - this.f6649a[1], (intValue - this.f6649a[0]) + view.getWidth(), (intValue2 - this.f6649a[1]) + view.getHeight());
                Rect rect2 = new Rect(intValue3 - this.f6649a[0], intValue4 - this.f6649a[1], (intValue3 - this.f6649a[0]) + view.getWidth(), (intValue4 - this.f6649a[1]) + view.getHeight());
                Animator ofObject = ObjectAnimator.ofObject(bitmapDrawable, "bounds", f6648x, new Object[]{rect, rect2});
                final ViewGroup viewGroup4 = viewGroup;
                ofObject.addListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: d */
                    final /* synthetic */ bk f6646d;

                    public void onAnimationEnd(Animator animator) {
                        cm.m14222d(viewGroup4).m14224b(bitmapDrawable);
                        view.setVisibility(0);
                    }
                });
                return ofObject;
            }
        }
        Rect rect3 = (Rect) cjVar.f9413a.get("android:changeBounds:bounds");
        rect2 = (Rect) cjVar2.f9413a.get("android:changeBounds:bounds");
        intValue2 = rect3.left;
        intValue3 = rect2.left;
        int i = rect3.top;
        int i2 = rect2.top;
        int i3 = rect3.right;
        int i4 = rect2.right;
        int i5 = rect3.bottom;
        int i6 = rect2.bottom;
        int i7 = i3 - intValue2;
        int i8 = i5 - i;
        int i9 = i4 - intValue3;
        int i10 = i6 - i2;
        intValue4 = 0;
        if (!(i7 == 0 || i8 == 0 || i9 == 0 || i10 == 0)) {
            if (intValue2 != intValue3) {
                intValue4 = 1;
            }
            if (i != i2) {
                intValue4++;
            }
            if (i3 != i4) {
                intValue4++;
            }
            if (i5 != i6) {
                intValue4++;
            }
        }
        if (intValue4 > 0) {
            Animator ofPropertyValuesHolder;
            if (this.f6650b) {
                if (i7 != i9) {
                    view.setRight(Math.max(i7, i9) + intValue3);
                }
                if (i8 != i10) {
                    view.setBottom(Math.max(i8, i10) + i2);
                }
                if (intValue2 != intValue3) {
                    view.setTranslationX((float) (intValue2 - intValue3));
                }
                if (i != i2) {
                    view.setTranslationY((float) (i - i2));
                }
                float f = (float) (intValue3 - intValue2);
                float f2 = (float) (i2 - i);
                i = i9 - i7;
                i2 = i10 - i8;
                intValue4 = 0;
                if (f != 0.0f) {
                    intValue4 = 1;
                }
                if (f2 != 0.0f) {
                    intValue4++;
                }
                if (!(i == 0 && i2 == 0)) {
                    intValue4++;
                }
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[intValue4];
                if (f != 0.0f) {
                    intValue4 = 1;
                    propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{view.getTranslationX(), 0.0f});
                } else {
                    intValue4 = 0;
                }
                if (f2 != 0.0f) {
                    intValue = intValue4 + 1;
                    propertyValuesHolderArr[intValue4] = PropertyValuesHolder.ofFloat("translationY", new float[]{view.getTranslationY(), 0.0f});
                }
                if (!(i == 0 && i2 == 0)) {
                    rect3 = new Rect(0, 0, i7, i8);
                    rect3 = new Rect(0, 0, i9, i10);
                }
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                if (view.getParent() instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) view.getParent();
                    mo1161a(new C12602(this));
                }
                ofPropertyValuesHolder.addListener(new C12613(this));
                return ofPropertyValuesHolder;
            }
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[intValue4];
            if (intValue2 != intValue3) {
                view.setLeft(intValue2);
            }
            if (i != i2) {
                view.setTop(i);
            }
            if (i3 != i4) {
                view.setRight(i3);
            }
            if (i5 != i6) {
                view.setBottom(i5);
            }
            if (intValue2 != intValue3) {
                intValue4 = 1;
                propertyValuesHolderArr2[0] = PropertyValuesHolder.ofInt(AdCreative.kAlignmentLeft, new int[]{intValue2, intValue3});
            } else {
                intValue4 = 0;
            }
            if (i != i2) {
                intValue = intValue4 + 1;
                propertyValuesHolderArr2[intValue4] = PropertyValuesHolder.ofInt(AdCreative.kAlignmentTop, new int[]{i, i2});
            } else {
                intValue = intValue4;
            }
            if (i3 != i4) {
                intValue4 = intValue + 1;
                propertyValuesHolderArr2[intValue] = PropertyValuesHolder.ofInt(AdCreative.kAlignmentRight, new int[]{i3, i4});
            } else {
                intValue4 = intValue;
            }
            if (i5 != i6) {
                intValue = intValue4 + 1;
                propertyValuesHolderArr2[intValue4] = PropertyValuesHolder.ofInt(AdCreative.kAlignmentBottom, new int[]{i5, i6});
            }
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
            if (view.getParent() instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) view.getParent();
                mo1161a(new C12591(this));
            }
            return ofPropertyValuesHolder;
        }
        return null;
    }
}
