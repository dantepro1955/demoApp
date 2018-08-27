package com.p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

@TargetApi(14)
/* compiled from: TextScale */
/* renamed from: u */
public class C5773u extends bs {
    /* renamed from: a */
    public void m34241a(cj cjVar) {
        m34239c(cjVar);
    }

    /* renamed from: b */
    public void m34242b(cj cjVar) {
        m34239c(cjVar);
    }

    /* renamed from: c */
    private void m34239c(cj cjVar) {
        if (cjVar.f9414b instanceof TextView) {
            cjVar.f9413a.put("android:textscale:scale", Float.valueOf(((TextView) cjVar.f9414b).getScaleX()));
        }
    }

    /* renamed from: a */
    public Animator m34240a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        float f = 1.0f;
        if (cjVar == null || cjVar2 == null || !(cjVar.f9414b instanceof TextView) || !(cjVar2.f9414b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) cjVar2.f9414b;
        Map map = cjVar.f9413a;
        Map map2 = cjVar2.f9413a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: b */
            final /* synthetic */ C5773u f25602b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
