package com.p000;

import android.graphics.Point;
import android.view.animation.AnimationUtils;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: ScrollHintEventHandler */
/* renamed from: cbj */
public class cbj extends cbf implements dkj {
    /* renamed from: a */
    private int f8607a;

    public cbj(dki dki, String str) {
        super(dki, str);
    }

    @dhg
    public void onLocationEvent(cbi cbi) {
        this.e.onNext(new Point(this.f8607a, cbi.m12245a().y));
    }

    /* renamed from: a */
    public void m12246a() {
        m12239e();
        cip.m13967a().m14016u();
        chn.m13445q("OnBoarding", "CancelScrollPostlistTutorial");
    }

    /* renamed from: d */
    protected Collection<dkh> mo1637d() {
        if (!this.f.isEmpty()) {
            return new ArrayList();
        }
        chn.m13445q("OnBoarding", "ShowScrollPostlistTutorial");
        Point f = m12240f();
        int dimensionPixelOffset = this.g.a().getResources().getDimensionPixelOffset(R.dimen.gesture_size) * 3;
        r2 = new dkh[2];
        this.f8607a = (f.x - this.g.a().getResources().getDimensionPixelSize(R.dimen.gesture_size)) / 2;
        r2[0] = this.g.a(this.g.a().getString(R.string.hint_scroll), true, this);
        r2[1] = this.g.a(ew.m21136a(this.g.a(), (int) R.drawable.gesture), new Point(this.f8607a, f.y - dimensionPixelOffset), AnimationUtils.loadAnimation(this.g.a(), R.anim.gesture_scroll));
        return Arrays.asList(r2);
    }
}
