package com.p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.ViewBinder;

/* compiled from: StaticNativeViewHolder */
/* renamed from: bzz */
public class bzz {
    @VisibleForTesting
    /* renamed from: h */
    static final bzz f8370h = new bzz();
    /* renamed from: a */
    public View f8371a;
    /* renamed from: b */
    public TextView f8372b;
    /* renamed from: c */
    public TextView f8373c;
    /* renamed from: d */
    public TextView f8374d;
    /* renamed from: e */
    public ImageView f8375e;
    /* renamed from: f */
    public ImageView f8376f;
    /* renamed from: g */
    public ImageView f8377g;

    private bzz() {
    }

    /* renamed from: a */
    public static bzz m11993a(View view, ViewBinder viewBinder) {
        bzz bzz = new bzz();
        bzz.f8371a = view;
        try {
            bzz.f8372b = (TextView) view.findViewById(viewBinder.f17855b);
            bzz.f8373c = (TextView) view.findViewById(viewBinder.f17856c);
            bzz.f8374d = (TextView) view.findViewById(viewBinder.f17857d);
            bzz.f8375e = (ImageView) view.findViewById(viewBinder.f17858e);
            bzz.f8376f = (ImageView) view.findViewById(viewBinder.f17859f);
            bzz.f8377g = (ImageView) view.findViewById(viewBinder.f17860g);
            return bzz;
        } catch (Throwable e) {
            MoPubLog.w("Could not cast from id in ViewBinder to expected View type", e);
            return f8370h;
        }
    }
}
