package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

@TargetApi(9)
/* compiled from: CompoundButtonCompatGingerbread */
/* renamed from: ld */
class ld {
    /* renamed from: a */
    private static Field f24392a;
    /* renamed from: b */
    private static boolean f24393b;

    /* renamed from: a */
    static void m32380a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof me) {
            ((me) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    static void m32381a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof me) {
            ((me) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: a */
    static Drawable m32379a(CompoundButton compoundButton) {
        if (!f24393b) {
            try {
                f24392a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f24392a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("CompoundButtonCompatGingerbread", "Failed to retrieve mButtonDrawable field", e);
            }
            f24393b = true;
        }
        if (f24392a != null) {
            try {
                return (Drawable) f24392a.get(compoundButton);
            } catch (Throwable e2) {
                Log.i("CompoundButtonCompatGingerbread", "Failed to get button drawable via reflection", e2);
                f24392a = null;
            }
        }
        return null;
    }
}
