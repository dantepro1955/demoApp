package com.p000;

import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* compiled from: ViewScaleType */
/* renamed from: cxp */
public enum cxp {
    FIT_INSIDE,
    CROP;

    /* compiled from: ViewScaleType */
    /* renamed from: cxp$1 */
    static /* synthetic */ class C46551 {
        /* renamed from: a */
        static final /* synthetic */ int[] f20618a = null;

        static {
            f20618a = new int[ScaleType.values().length];
            try {
                f20618a[ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f20618a[ScaleType.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f20618a[ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f20618a[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f20618a[ScaleType.CENTER_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f20618a[ScaleType.MATRIX.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f20618a[ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f20618a[ScaleType.CENTER_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* renamed from: a */
    public static cxp m25540a(ImageView imageView) {
        switch (C46551.f20618a[imageView.getScaleType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return FIT_INSIDE;
            default:
                return CROP;
        }
    }
}
