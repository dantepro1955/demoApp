package com.p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.MediaLayout;
import com.mopub.nativeads.MediaViewBinder;

/* compiled from: MediaViewHolder */
/* renamed from: bzr */
public class bzr {
    @VisibleForTesting
    /* renamed from: h */
    static final bzr f8315h = new bzr();
    /* renamed from: a */
    public View f8316a;
    /* renamed from: b */
    public MediaLayout f8317b;
    /* renamed from: c */
    public TextView f8318c;
    /* renamed from: d */
    public TextView f8319d;
    /* renamed from: e */
    public ImageView f8320e;
    /* renamed from: f */
    public TextView f8321f;
    /* renamed from: g */
    public ImageView f8322g;

    private bzr() {
    }

    /* renamed from: a */
    public static bzr m11919a(View view, MediaViewBinder mediaViewBinder) {
        bzr bzr = new bzr();
        bzr.f8316a = view;
        try {
            bzr.f8318c = (TextView) view.findViewById(mediaViewBinder.f17618c);
            bzr.f8319d = (TextView) view.findViewById(mediaViewBinder.f17619d);
            bzr.f8321f = (TextView) view.findViewById(mediaViewBinder.f17620e);
            bzr.f8317b = (MediaLayout) view.findViewById(mediaViewBinder.f17617b);
            bzr.f8320e = (ImageView) view.findViewById(mediaViewBinder.f17621f);
            bzr.f8322g = (ImageView) view.findViewById(mediaViewBinder.f17622g);
            return bzr;
        } catch (Throwable e) {
            MoPubLog.w("Could not cast from id in MediaViewBinder to expected View type", e);
            return f8315h;
        }
    }
}
