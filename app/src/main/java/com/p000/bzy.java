package com.p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.imagepipeline.common.RotationOptions;
import com.mopub.common.Preconditions;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Views;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;

/* compiled from: SpinningProgressView */
/* renamed from: bzy */
public class bzy extends ViewGroup {
    /* renamed from: a */
    private final ProgressBar f8368a;
    /* renamed from: b */
    private int f8369b;

    public bzy(Context context) {
        super(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        setVisibility(8);
        setBackgroundColor(CtaButton.BACKGROUND_COLOR);
        getBackground().setAlpha(RotationOptions.ROTATE_180);
        this.f8368a = new ProgressBar(context);
        this.f8369b = Dips.asIntPixels(25.0f, getContext());
        this.f8368a.setIndeterminate(true);
        addView(this.f8368a);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int i5 = (i + i3) / 2;
            int i6 = (i2 + i4) / 2;
            this.f8368a.layout(i5 - this.f8369b, i6 - this.f8369b, i5 + this.f8369b, i6 + this.f8369b);
        }
    }

    /* renamed from: a */
    public boolean m11992a(View view) {
        Preconditions.checkNotNull(view);
        View rootView = view.getRootView();
        if (rootView == null || !(rootView instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        setVisibility(0);
        setMeasuredDimension(rootView.getWidth(), rootView.getHeight());
        viewGroup.addView(this);
        forceLayout();
        return true;
    }

    /* renamed from: a */
    public boolean m11991a() {
        Views.removeFromParent(this);
        setVisibility(8);
        return true;
    }
}
