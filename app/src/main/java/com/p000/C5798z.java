package com.p000;

import android.annotation.TargetApi;
import android.graphics.Outline;

@TargetApi(21)
/* compiled from: CircularBorderDrawableLollipop */
/* renamed from: z */
class C5798z extends C5797y {
    C5798z() {
    }

    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
