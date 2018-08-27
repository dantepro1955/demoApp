package com.sept.android.lib.widget.aiv;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.Utility.AsyncImageAdapter;


public class AsyncImageView extends AppCompatImageView {
    /* renamed from: e */
    AsyncImageAdapter asyncImageAdapter;
    /* renamed from: f */
    Bitmap bitmap;

    public AsyncImageView(Context context) {
        super(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void invalidate() {
        if (this.asyncImageAdapter == null || this.bitmap == this.asyncImageAdapter.getBitmap()) {
            super.invalidate();
            return;
        }
        this.bitmap = this.asyncImageAdapter.getBitmap();

        setImageBitmap(this.bitmap);
    }

    public void setAdapter(AsyncImageAdapter asyncImageAdapter) {
        this.asyncImageAdapter = asyncImageAdapter;
    }
}
