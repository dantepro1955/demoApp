package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

@TargetApi(21)
/* compiled from: ActivityCompatApi21 */
/* renamed from: cz */
class cz {

    /* compiled from: ActivityCompatApi21 */
    /* renamed from: cz$a */
    public static abstract class C4663a {
        /* renamed from: a */
        public abstract Parcelable mo4215a(View view, Matrix matrix, RectF rectF);

        /* renamed from: a */
        public abstract View mo4216a(Context context, Parcelable parcelable);

        /* renamed from: a */
        public abstract void mo4217a(List<View> list);

        /* renamed from: a */
        public abstract void mo4218a(List<String> list, List<View> list2, List<View> list3);

        /* renamed from: a */
        public abstract void mo4219a(List<String> list, Map<String, View> map);

        /* renamed from: b */
        public abstract void mo4220b(List<String> list, List<View> list2, List<View> list3);
    }

    /* compiled from: ActivityCompatApi21 */
    /* renamed from: cz$b */
    static class C4680b extends SharedElementCallback {
        /* renamed from: a */
        private C4663a f20726a;

        public C4680b(C4663a c4663a) {
            this.f20726a = c4663a;
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f20726a.mo4218a((List) list, (List) list2, (List) list3);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f20726a.mo4220b(list, list2, list3);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f20726a.mo4217a(list);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f20726a.mo4219a((List) list, (Map) map);
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f20726a.mo4215a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f20726a.mo4216a(context, parcelable);
        }
    }

    /* renamed from: a */
    public static void m25729a(Activity activity) {
        activity.finishAfterTransition();
    }

    /* renamed from: a */
    public static void m25730a(Activity activity, C4663a c4663a) {
        activity.setEnterSharedElementCallback(cz.m25728a(c4663a));
    }

    /* renamed from: b */
    public static void m25732b(Activity activity, C4663a c4663a) {
        activity.setExitSharedElementCallback(cz.m25728a(c4663a));
    }

    /* renamed from: b */
    public static void m25731b(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* renamed from: c */
    public static void m25733c(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    /* renamed from: a */
    private static SharedElementCallback m25728a(C4663a c4663a) {
        if (c4663a != null) {
            return new C4680b(c4663a);
        }
        return null;
    }
}
