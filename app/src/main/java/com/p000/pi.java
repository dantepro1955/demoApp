package com.p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import com.flurry.android.AdCreative;
import java.lang.reflect.Field;

/* compiled from: DrawableUtils */
/* renamed from: pi */
public class pi {
    /* renamed from: a */
    public static final Rect f25071a = new Rect();
    /* renamed from: b */
    private static Class<?> f25072b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f25072b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public static Rect m33600a(Drawable drawable) {
        if (f25072b != null) {
            try {
                Drawable h = fp.h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f25072b.getFields()) {
                        String name = field.getName();
                        Object obj = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals(AdCreative.kAlignmentBottom)) {
                                    obj = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals(AdCreative.kAlignmentTop)) {
                                    obj = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(AdCreative.kAlignmentLeft)) {
                                    obj = null;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals(AdCreative.kAlignmentRight)) {
                                    obj = 2;
                                    break;
                                }
                                break;
                        }
                        switch (obj) {
                            case null:
                                rect.left = field.getInt(invoke);
                                break;
                            case 1:
                                rect.top = field.getInt(invoke);
                                break;
                            case 2:
                                rect.right = field.getInt(invoke);
                                break;
                            case 3:
                                rect.bottom = field.getInt(invoke);
                                break;
                            default:
                                break;
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f25071a;
    }

    /* renamed from: b */
    static void m33601b(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            pi.m33603d(drawable);
        }
    }

    /* renamed from: c */
    public static boolean m33602c(Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable c : ((DrawableContainerState) constantState).getChildren()) {
                    if (!pi.m33602c(c)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof fw) {
            return pi.m33602c(((fw) drawable).mo4736a());
        } else {
            if (drawable instanceof nc) {
                return pi.m33602c(((nc) drawable).m32947b());
            }
            if (drawable instanceof ScaleDrawable) {
                return pi.m33602c(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: d */
    private static void m33603d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(qa.f25186e);
        } else {
            drawable.setState(qa.f25189h);
        }
        drawable.setState(state);
    }

    /* renamed from: a */
    public static Mode m33599a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                if (VERSION.SDK_INT >= 11) {
                    return Mode.valueOf("ADD");
                }
                return mode;
            default:
                return mode;
        }
    }
}
