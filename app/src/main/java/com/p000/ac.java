package com.p000;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils */
/* renamed from: ac */
public class ac {
    /* renamed from: a */
    private static Method f305a;
    /* renamed from: b */
    private static boolean f306b;

    /* renamed from: a */
    public static boolean m405a(DrawableContainer drawableContainer, ConstantState constantState) {
        return ac.m406b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m406b(DrawableContainer drawableContainer, ConstantState constantState) {
        if (!f306b) {
            try {
                f305a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f305a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            f306b = true;
        }
        if (f305a != null) {
            try {
                f305a.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception e2) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
