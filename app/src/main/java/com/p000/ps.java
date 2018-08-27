package com.p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: RecyclerViewAccessibilityDelegate */
/* renamed from: ps */
public class ps extends hu {
    /* renamed from: a */
    final RecyclerView f25121a;
    /* renamed from: c */
    final hu f25122c = new C56811(this);

    /* compiled from: RecyclerViewAccessibilityDelegate */
    /* renamed from: ps$1 */
    class C56811 extends hu {
        /* renamed from: a */
        final /* synthetic */ ps f25120a;

        C56811(ps psVar) {
            this.f25120a = psVar;
        }

        /* renamed from: a */
        public void m33695a(View view, kg kgVar) {
            super.a(view, kgVar);
            if (!this.f25120a.m33700b() && this.f25120a.f25121a.getLayoutManager() != null) {
                this.f25120a.f25121a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, kgVar);
            }
        }

        /* renamed from: a */
        public boolean m33696a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (this.f25120a.m33700b() || this.f25120a.f25121a.getLayoutManager() == null) {
                return false;
            }
            return this.f25120a.f25121a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
    }

    public ps(RecyclerView recyclerView) {
        this.f25121a = recyclerView;
    }

    /* renamed from: b */
    boolean m33700b() {
        return this.f25121a.hasPendingAdapterUpdates();
    }

    /* renamed from: a */
    public boolean m33699a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (m33700b() || this.f25121a.getLayoutManager() == null) {
            return false;
        }
        return this.f25121a.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    /* renamed from: a */
    public void m33698a(View view, kg kgVar) {
        super.a(view, kgVar);
        kgVar.m32150b(RecyclerView.class.getName());
        if (!m33700b() && this.f25121a.getLayoutManager() != null) {
            this.f25121a.getLayoutManager().onInitializeAccessibilityNodeInfo(kgVar);
        }
    }

    /* renamed from: a */
    public void m33697a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !m33700b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    /* renamed from: c */
    public hu m33701c() {
        return this.f25122c;
    }
}
