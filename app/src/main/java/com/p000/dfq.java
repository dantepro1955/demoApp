package com.p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.util.ByteConstants;

/* compiled from: ImageCache */
/* renamed from: dfq */
public class dfq extends hn<String, Bitmap> {
    public dfq(int i) {
        super(i);
    }

    /* renamed from: a */
    protected int m27048a(String str, Bitmap bitmap) {
        return ((bitmap.getWidth() * bitmap.getHeight()) * m27046a(bitmap)) / ByteConstants.KB;
    }

    /* renamed from: a */
    private int m27046a(Bitmap bitmap) {
        Config config = bitmap.getConfig();
        if (config == Config.ALPHA_8) {
            return 1;
        }
        if (config == Config.ARGB_4444) {
            return 2;
        }
        if (config == Config.ARGB_8888) {
            return 4;
        }
        if (config != Config.RGB_565) {
            return 0;
        }
        return 2;
    }
}
