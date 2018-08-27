package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;
import p000.cz.C4663a;

@TargetApi(23)
/* compiled from: ActivityCompatApi23 */
/* renamed from: da */
public class da {

    /* compiled from: ActivityCompatApi23 */
    /* renamed from: da$c */
    public static abstract class C4667c extends C4663a {
        /* renamed from: a */
        public abstract void mo4222a(List<String> list, List<View> list2, C4721a c4721a);
    }

    /* compiled from: ActivityCompatApi23 */
    /* renamed from: da$a */
    public interface C4721a {
        /* renamed from: a */
        void mo4271a();
    }

    /* compiled from: ActivityCompatApi23 */
    /* renamed from: da$b */
    public interface C4722b {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* compiled from: ActivityCompatApi23 */
    /* renamed from: da$d */
    static class C4724d extends SharedElementCallback {
        /* renamed from: a */
        private C4667c f20878a;

        public C4724d(C4667c c4667c) {
            this.f20878a = c4667c;
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f20878a.mo4218a((List) list, (List) list2, (List) list3);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f20878a.mo4220b(list, list2, list3);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f20878a.mo4217a(list);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f20878a.mo4219a((List) list, (Map) map);
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f20878a.mo4215a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f20878a.mo4216a(context, parcelable);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, final OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f20878a.mo4222a(list, list2, new C4721a(this) {
                /* renamed from: b */
                final /* synthetic */ C4724d f20877b;

                /* renamed from: a */
                public void mo4271a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m25938a(Activity activity, String[] strArr, int i) {
        if (activity instanceof C4722b) {
            ((C4722b) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: a */
    public static boolean m25939a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: a */
    public static void m25937a(Activity activity, C4667c c4667c) {
        activity.setEnterSharedElementCallback(da.m25936a(c4667c));
    }

    /* renamed from: b */
    public static void m25940b(Activity activity, C4667c c4667c) {
        activity.setExitSharedElementCallback(da.m25936a(c4667c));
    }

    /* renamed from: a */
    private static SharedElementCallback m25936a(C4667c c4667c) {
        if (c4667c != null) {
            return new C4724d(c4667c);
        }
        return null;
    }
}
