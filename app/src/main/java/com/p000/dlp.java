package com.p000;

import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import java.lang.ref.WeakReference;

/* compiled from: UIVVideoViewSizeListener */
/* renamed from: dlp */
public class dlp implements OnGlobalLayoutListener {
    /* renamed from: a */
    private WeakReference<UniversalImageView> f22103a;

    public dlp(UniversalImageView universalImageView) {
        this.f22103a = new WeakReference(universalImageView);
    }

    public void onGlobalLayout() {
        UniversalImageView universalImageView = (UniversalImageView) this.f22103a.get();
        if (universalImageView != null) {
            LayoutParams layoutParams = universalImageView.f19803a.f19793i.getLayoutParams();
            if (universalImageView.f19803a.f19791g.getWidth() != universalImageView.f19803a.f19793i.getWidth() || universalImageView.f19803a.f19791g.getHeight() != universalImageView.f19803a.f19793i.getHeight()) {
                layoutParams.width = universalImageView.f19803a.f19791g.getWidth();
                layoutParams.height = universalImageView.f19803a.f19791g.getHeight();
                universalImageView.f19803a.f19793i.setLayoutParams(layoutParams);
            }
        }
    }
}
