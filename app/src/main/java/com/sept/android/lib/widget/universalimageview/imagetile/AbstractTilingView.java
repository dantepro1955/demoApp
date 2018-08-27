package com.sept.android.lib.widget.universalimageview.imagetile;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Array;
import p000.dmc;
import p000.dmc.C4515a;

public abstract class AbstractTilingView extends View implements C4515a {
    /* renamed from: a */
    dmc f19855a;
    /* renamed from: b */
    int f19856b;
    /* renamed from: c */
    int f19857c;
    /* renamed from: d */
    RectF[][] f19858d;

    public AbstractTilingView(Context context) {
        super(context);
        mo4096a();
    }

    public AbstractTilingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4096a();
    }

    public AbstractTilingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4096a();
    }

    /* renamed from: a */
    private void mo4096a() {
    }

    public dmc getTileAdapter() {
        return this.f19855a;
    }

    public void setTileAdapter(dmc dmc) {
        this.f19855a = dmc;
        if (dmc != null) {
            this.f19856b = dmc.mo4446a();
            this.f19857c = dmc.mo4447b();
            this.f19858d = (RectF[][]) Array.newInstance(RectF.class, new int[]{this.f19856b, this.f19857c});
            for (int i = 0; i < this.f19856b; i++) {
                for (int i2 = 0; i2 < this.f19857c; i2++) {
                    this.f19858d[i][i2] = new RectF();
                }
            }
            dmc.m27913a((C4515a) this);
        }
    }

    public void setTile(dmc dmc, int i, int i2) {
        m24200a(i, i2);
    }

    /* renamed from: a */
    public void m24200a(int i, int i2) {
        if (i < this.f19856b && i >= 0 && i2 < this.f19857c && i2 >= 0) {
            invalidate();
        }
    }
}
