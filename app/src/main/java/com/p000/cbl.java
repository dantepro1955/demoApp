package com.p000;

import android.view.animation.AnimationUtils;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: TapCommentHintEventHandler */
/* renamed from: cbl */
public class cbl extends cbe {
    public cbl(dki dki, String str) {
        super(dki, str);
    }

    /* renamed from: a */
    public void mo1638a() {
        super.mo1638a();
        cip.m13967a().m14020y();
        chn.m13445q("OnBoarding", "CancelTapCommentTutorial");
    }

    /* renamed from: d */
    protected Collection<dkh> mo1637d() {
        if (!this.f.isEmpty() || cip.m13967a().m14015t() || !cip.m13967a().m14019x() || this.c == null) {
            return new ArrayList();
        }
        chn.m13445q("OnBoarding", "ShowTapCommentTutorial");
        return Arrays.asList(new dkh[]{this.g.a(this.g.a().getString(R.string.hint_tap_comment), true, this), this.g.a(ew.m21136a(this.g.a(), (int) R.drawable.gesture_tap), this.c, AnimationUtils.loadAnimation(this.g.a(), R.anim.gesture_tap))});
    }
}
