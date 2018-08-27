package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;
import p000.mo.C5535a;
import p000.mp.C5554d;

@TargetApi(24)
/* compiled from: AppCompatDelegateImplN */
/* renamed from: ml */
class ml extends mo {

    /* compiled from: AppCompatDelegateImplN */
    /* renamed from: ml$a */
    class C5536a extends C5535a {
        /* renamed from: b */
        final /* synthetic */ ml f24524b;

        C5536a(ml mlVar, Callback callback) {
            this.f24524b = mlVar;
            super(mlVar, callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C5554d a = this.f24524b.m32715a(0, true);
            if (a == null || a.f24583j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f24583j, i);
            }
        }
    }

    ml(Context context, Window window, mi miVar) {
        super(context, window, miVar);
    }

    /* renamed from: a */
    Callback mo5217a(Callback callback) {
        return new C5536a(this, callback);
    }
}
