package com.p000;

import android.graphics.Point;
import android.view.animation.AnimationUtils;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: SwipeHintEventHandler */
/* renamed from: cbk */
public class cbk extends cbf implements dkj {
    /* renamed from: d */
    protected /* synthetic */ Collection mo1637d() {
        return m12250g();
    }

    public cbk(dki dki, String str) {
        super(dki, str);
    }

    /* renamed from: a */
    public void m12248a() {
        m12239e();
        cip.m13967a().m14018w();
        chn.m13445q("OnBoarding", "CancelSwipeOverlayTutorial");
    }

    /* renamed from: g */
    protected List<dkh> m12250g() {
        if (!this.f.isEmpty()) {
            return new ArrayList();
        }
        chn.m13445q("OnBoarding", "ShowSwipeOverlayTutorial");
        Point f = m12240f();
        return Arrays.asList(new dkh[]{this.g.a(this.g.a().getString(R.string.hint_swipe), true, this), this.g.a(ew.m21136a(this.g.a(), (int) R.drawable.gesture), new Point((int) (((double) f.x) * 0.75d), f.y / 2), AnimationUtils.loadAnimation(this.g.a(), R.anim.gesture_swipe))});
    }
}
