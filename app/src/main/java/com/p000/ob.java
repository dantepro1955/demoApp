package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;
import p000.hx.C5376b;
import p000.oa.C5595a;

@TargetApi(16)
/* compiled from: MenuItemWrapperJB */
/* renamed from: ob */
class ob extends oa {

    /* compiled from: MenuItemWrapperJB */
    /* renamed from: ob$a */
    class C5599a extends C5595a implements VisibilityListener {
        /* renamed from: c */
        C5376b f24886c;
        /* renamed from: d */
        final /* synthetic */ ob f24887d;

        public C5599a(ob obVar, Context context, ActionProvider actionProvider) {
            this.f24887d = obVar;
            super(obVar, context, actionProvider);
        }

        /* renamed from: a */
        public View mo5289a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo5291b() {
            return this.a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo5292c() {
            return this.a.isVisible();
        }

        /* renamed from: a */
        public void mo5290a(C5376b c5376b) {
            VisibilityListener visibilityListener;
            this.f24886c = c5376b;
            ActionProvider actionProvider = this.a;
            if (c5376b == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f24886c != null) {
                this.f24886c.mo5280a(z);
            }
        }
    }

    ob(Context context, gd gdVar) {
        super(context, gdVar);
    }

    /* renamed from: a */
    C5595a mo5293a(ActionProvider actionProvider) {
        return new C5599a(this, this.a, actionProvider);
    }
}
