package com.p000;

import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.DraweeHolder;
import java.util.ArrayList;

/* compiled from: FrescoTilingViewDraweeHolder */
/* renamed from: dll */
public class dll<DH extends DraweeHierarchy> {
    /* renamed from: a */
    boolean f22010a = false;
    /* renamed from: b */
    ArrayList<DraweeHolder<DH>> f22011b = new ArrayList();
    /* renamed from: c */
    ArrayList<Boolean> f22012c = new ArrayList();

    /* renamed from: a */
    public void m27843a() {
        if (!this.f22010a) {
            this.f22010a = true;
            for (int i = 0; i < this.f22011b.size(); i++) {
                if (((Boolean) this.f22012c.get(i)).booleanValue()) {
                    ((DraweeHolder) this.f22011b.get(i)).onAttach();
                }
            }
        }
    }

    /* renamed from: b */
    public void m27848b() {
        if (this.f22010a) {
            this.f22010a = false;
            for (int i = 0; i < this.f22011b.size(); i++) {
                ((DraweeHolder) this.f22011b.get(i)).onDetach();
            }
        }
    }

    /* renamed from: a */
    public boolean m27846a(int i) {
        return !this.f22012c.isEmpty() && ((Boolean) this.f22012c.get(i)).booleanValue();
    }

    /* renamed from: b */
    public void m27849b(int i) {
        if (!((Boolean) this.f22012c.get(i)).booleanValue()) {
            ((DraweeHolder) this.f22011b.get(i)).onAttach();
            this.f22012c.set(i, Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    public void m27851c(int i) {
        if (((Boolean) this.f22012c.get(i)).booleanValue()) {
            ((DraweeHolder) this.f22011b.get(i)).onDetach();
            this.f22012c.set(i, Boolean.valueOf(false));
        }
    }

    /* renamed from: c */
    public void m27850c() {
        if (this.f22010a) {
            for (int i = 0; i < this.f22011b.size(); i++) {
                ((DraweeHolder) this.f22011b.get(i)).onDetach();
            }
        }
        this.f22012c.clear();
        this.f22011b.clear();
    }

    /* renamed from: a */
    public void m27845a(DraweeHolder<DH> draweeHolder) {
        m27844a(this.f22011b.size(), draweeHolder);
    }

    /* renamed from: a */
    public void m27844a(int i, DraweeHolder<DH> draweeHolder) {
        Preconditions.checkNotNull(draweeHolder);
        Preconditions.checkElementIndex(i, this.f22011b.size() + 1);
        this.f22011b.add(i, draweeHolder);
        this.f22012c.add(i, Boolean.valueOf(false));
        if (!this.f22010a) {
        }
    }

    /* renamed from: d */
    public DraweeHolder<DH> m27853d(int i) {
        return (DraweeHolder) this.f22011b.get(i);
    }

    /* renamed from: d */
    public int m27852d() {
        return this.f22011b.size();
    }

    /* renamed from: a */
    public boolean m27847a(Drawable drawable) {
        for (int i = 0; i < this.f22011b.size(); i++) {
            if (drawable == m27853d(i).getTopLevelDrawable()) {
                return true;
            }
        }
        return false;
    }
}
