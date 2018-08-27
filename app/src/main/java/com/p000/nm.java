package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000.ni.C5551a;

@TargetApi(11)
/* compiled from: SupportActionModeWrapper */
/* renamed from: nm */
public class nm extends ActionMode {
    /* renamed from: a */
    final Context f24722a;
    /* renamed from: b */
    final ni f24723b;

    /* compiled from: SupportActionModeWrapper */
    /* renamed from: nm$a */
    public static class C5584a implements C5551a {
        /* renamed from: a */
        final Callback f24718a;
        /* renamed from: b */
        final Context f24719b;
        /* renamed from: c */
        final ArrayList<nm> f24720c = new ArrayList();
        /* renamed from: d */
        final hr<Menu, Menu> f24721d = new hr();

        public C5584a(Context context, Callback callback) {
            this.f24719b = context;
            this.f24718a = callback;
        }

        /* renamed from: a */
        public boolean mo5224a(ni niVar, Menu menu) {
            return this.f24718a.onCreateActionMode(m32985b(niVar), m32981a(menu));
        }

        /* renamed from: b */
        public boolean mo5226b(ni niVar, Menu menu) {
            return this.f24718a.onPrepareActionMode(m32985b(niVar), m32981a(menu));
        }

        /* renamed from: a */
        public boolean mo5225a(ni niVar, MenuItem menuItem) {
            return this.f24718a.onActionItemClicked(m32985b(niVar), og.m33225a(this.f24719b, (gd) menuItem));
        }

        /* renamed from: a */
        public void mo5223a(ni niVar) {
            this.f24718a.onDestroyActionMode(m32985b(niVar));
        }

        /* renamed from: a */
        private Menu m32981a(Menu menu) {
            Menu menu2 = (Menu) this.f24721d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = og.m33224a(this.f24719b, (gc) menu);
            this.f24721d.put(menu, menu2);
            return menu2;
        }

        /* renamed from: b */
        public ActionMode m32985b(ni niVar) {
            int size = this.f24720c.size();
            for (int i = 0; i < size; i++) {
                nm nmVar = (nm) this.f24720c.get(i);
                if (nmVar != null && nmVar.f24723b == niVar) {
                    return nmVar;
                }
            }
            ActionMode nmVar2 = new nm(this.f24719b, niVar);
            this.f24720c.add(nmVar2);
            return nmVar2;
        }
    }

    public nm(Context context, ni niVar) {
        this.f24722a = context;
        this.f24723b = niVar;
    }

    public Object getTag() {
        return this.f24723b.m32872j();
    }

    public void setTag(Object obj) {
        this.f24723b.m32861a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24723b.mo5236b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f24723b.mo5232a(charSequence);
    }

    public void invalidate() {
        this.f24723b.mo5238d();
    }

    public void finish() {
        this.f24723b.mo5237c();
    }

    public Menu getMenu() {
        return og.m33224a(this.f24722a, (gc) this.f24723b.mo5234b());
    }

    public CharSequence getTitle() {
        return this.f24723b.mo5239f();
    }

    public void setTitle(int i) {
        this.f24723b.mo5230a(i);
    }

    public CharSequence getSubtitle() {
        return this.f24723b.mo5240g();
    }

    public void setSubtitle(int i) {
        this.f24723b.mo5235b(i);
    }

    public View getCustomView() {
        return this.f24723b.mo5242i();
    }

    public void setCustomView(View view) {
        this.f24723b.mo5231a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f24723b.mo5229a();
    }

    public boolean getTitleOptionalHint() {
        return this.f24723b.m32873k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.f24723b.mo5233a(z);
    }

    public boolean isTitleOptional() {
        return this.f24723b.mo5241h();
    }
}
