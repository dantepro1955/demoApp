package com.p000;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.support.v7.widget.ActionBarContainer;

@TargetApi(21)
/* compiled from: ActionBarBackgroundDrawableV21 */
/* renamed from: oo */
public class oo extends on {
    public oo(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        if (this.a.f3143d) {
            if (this.a.f3142c != null) {
                this.a.f3142c.getOutline(outline);
            }
        } else if (this.a.f3140a != null) {
            this.a.f3140a.getOutline(outline);
        }
    }
}
