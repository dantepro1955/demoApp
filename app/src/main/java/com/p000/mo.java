package com.p000;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;
import p000.mn.C5534a;

@TargetApi(23)
/* compiled from: AppCompatDelegateImplV23 */
/* renamed from: mo */
class mo extends mn {
    /* renamed from: t */
    private final UiModeManager f24555t;

    /* compiled from: AppCompatDelegateImplV23 */
    /* renamed from: mo$a */
    class C5535a extends C5534a {
        /* renamed from: d */
        final /* synthetic */ mo f24523d;

        C5535a(mo moVar, Callback callback) {
            this.f24523d = moVar;
            super(moVar, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.f24523d.mo5219p()) {
                switch (i) {
                    case 0:
                        return m32694a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    mo(Context context, Window window, mi miVar) {
        super(context, window, miVar);
        this.f24555t = (UiModeManager) context.getSystemService("uimode");
    }

    /* renamed from: a */
    Callback mo5217a(Callback callback) {
        return new C5535a(this, callback);
    }

    /* renamed from: d */
    int mo5218d(int i) {
        if (i == 0 && this.f24555t.getNightMode() == 0) {
            return -1;
        }
        return super.mo5218d(i);
    }
}
