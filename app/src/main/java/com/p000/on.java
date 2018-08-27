package com.p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

@TargetApi(9)
/* compiled from: ActionBarBackgroundDrawable */
/* renamed from: on */
public class on extends Drawable {
    /* renamed from: a */
    final ActionBarContainer f24934a;

    public on(ActionBarContainer actionBarContainer) {
        this.f24934a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f24934a.f3143d) {
            if (this.f24934a.f3140a != null) {
                this.f24934a.f3140a.draw(canvas);
            }
            if (this.f24934a.f3141b != null && this.f24934a.f3144e) {
                this.f24934a.f3141b.draw(canvas);
            }
        } else if (this.f24934a.f3142c != null) {
            this.f24934a.f3142c.draw(canvas);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }
}
