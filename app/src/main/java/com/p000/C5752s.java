package com.p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuItemView;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ParcelableSparseArray;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import p000.oe.C5548a;

/* compiled from: NavigationMenuPresenter */
/* renamed from: s */
public class C5752s implements oe {
    /* renamed from: a */
    LinearLayout f25435a;
    /* renamed from: b */
    nx f25436b;
    /* renamed from: c */
    C5744b f25437c;
    /* renamed from: d */
    LayoutInflater f25438d;
    /* renamed from: e */
    int f25439e;
    /* renamed from: f */
    boolean f25440f;
    /* renamed from: g */
    ColorStateList f25441g;
    /* renamed from: h */
    ColorStateList f25442h;
    /* renamed from: i */
    Drawable f25443i;
    /* renamed from: j */
    int f25444j;
    /* renamed from: k */
    final OnClickListener f25445k = new C57411(this);
    /* renamed from: l */
    private NavigationMenuView f25446l;
    /* renamed from: m */
    private C5548a f25447m;
    /* renamed from: n */
    private int f25448n;
    /* renamed from: o */
    private int f25449o;

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$1 */
    class C57411 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C5752s f25426a;

        C57411(C5752s c5752s) {
            this.f25426a = c5752s;
        }

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.f25426a.m34071b(true);
            nz itemData = navigationMenuItemView.getItemData();
            boolean a = this.f25426a.f25436b.m33153a((MenuItem) itemData, this.f25426a, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                this.f25426a.f25437c.m34045a(itemData);
            }
            this.f25426a.m34071b(false);
            this.f25426a.mo5257a(false);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$j */
    static abstract class C5742j extends C0605t {
        public C5742j(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$a */
    static class C5743a extends C5742j {
        public C5743a(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$b */
    class C5744b extends C0581a<C5742j> {
        /* renamed from: a */
        final /* synthetic */ C5752s f25427a;
        /* renamed from: b */
        private final ArrayList<C5745d> f25428b = new ArrayList();
        /* renamed from: c */
        private nz f25429c;
        /* renamed from: d */
        private boolean f25430d;

        public /* synthetic */ void onBindViewHolder(C0605t c0605t, int i) {
            m34047a((C5742j) c0605t, i);
        }

        public /* synthetic */ C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m34042a(viewGroup, i);
        }

        public /* synthetic */ void onViewRecycled(C0605t c0605t) {
            m34046a((C5742j) c0605t);
        }

        C5744b(C5752s c5752s) {
            this.f25427a = c5752s;
            m34041c();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemCount() {
            return this.f25428b.size();
        }

        public int getItemViewType(int i) {
            C5745d c5745d = (C5745d) this.f25428b.get(i);
            if (c5745d instanceof C5747e) {
                return 2;
            }
            if (c5745d instanceof C5746c) {
                return 3;
            }
            if (!(c5745d instanceof C5748f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C5748f) c5745d).m34052a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: a */
        public C5742j m34042a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C5749g(this.f25427a.f25438d, viewGroup, this.f25427a.f25445k);
                case 1:
                    return new C5751i(this.f25427a.f25438d, viewGroup);
                case 2:
                    return new C5750h(this.f25427a.f25438d, viewGroup);
                case 3:
                    return new C5743a(this.f25427a.f25435a);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public void m34047a(C5742j c5742j, int i) {
            switch (getItemViewType(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) c5742j.itemView;
                    navigationMenuItemView.setIconTintList(this.f25427a.f25442h);
                    if (this.f25427a.f25440f) {
                        navigationMenuItemView.setTextAppearance(this.f25427a.f25439e);
                    }
                    if (this.f25427a.f25441g != null) {
                        navigationMenuItemView.setTextColor(this.f25427a.f25441g);
                    }
                    jd.a(navigationMenuItemView, this.f25427a.f25443i != null ? this.f25427a.f25443i.getConstantState().newDrawable() : null);
                    C5748f c5748f = (C5748f) this.f25428b.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(c5748f.f25433a);
                    navigationMenuItemView.a(c5748f.m34052a(), 0);
                    return;
                case 1:
                    ((TextView) c5742j.itemView).setText(((C5748f) this.f25428b.get(i)).m34052a().getTitle());
                    return;
                case 2:
                    C5747e c5747e = (C5747e) this.f25428b.get(i);
                    c5742j.itemView.setPadding(0, c5747e.m34050a(), 0, c5747e.m34051b());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m34046a(C5742j c5742j) {
            if (c5742j instanceof C5749g) {
                ((NavigationMenuItemView) c5742j.itemView).b();
            }
        }

        /* renamed from: a */
        public void m34043a() {
            m34041c();
            notifyDataSetChanged();
        }

        /* renamed from: c */
        private void m34041c() {
            if (!this.f25430d) {
                this.f25430d = true;
                this.f25428b.clear();
                this.f25428b.add(new C5746c());
                int i = -1;
                int i2 = 0;
                boolean z = false;
                int size = this.f25427a.f25436b.m33175i().size();
                int i3 = 0;
                while (i3 < size) {
                    int i4;
                    nz nzVar = (nz) this.f25427a.f25436b.m33175i().get(i3);
                    if (nzVar.isChecked()) {
                        m34045a(nzVar);
                    }
                    if (nzVar.isCheckable()) {
                        nzVar.a(false);
                    }
                    int i5;
                    if (nzVar.hasSubMenu()) {
                        SubMenu subMenu = nzVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f25428b.add(new C5747e(this.f25427a.f25444j, 0));
                            }
                            this.f25428b.add(new C5748f(nzVar));
                            Object obj = null;
                            int size2 = this.f25428b.size();
                            int size3 = subMenu.size();
                            for (i5 = 0; i5 < size3; i5++) {
                                nz nzVar2 = (nz) subMenu.getItem(i5);
                                if (nzVar2.isVisible()) {
                                    if (obj == null && nzVar2.getIcon() != null) {
                                        obj = 1;
                                    }
                                    if (nzVar2.isCheckable()) {
                                        nzVar2.a(false);
                                    }
                                    if (nzVar.isChecked()) {
                                        m34045a(nzVar);
                                    }
                                    this.f25428b.add(new C5748f(nzVar2));
                                }
                            }
                            if (obj != null) {
                                m34040a(size2, this.f25428b.size());
                            }
                        }
                        i4 = i;
                    } else {
                        int size4;
                        boolean z2;
                        i5 = nzVar.getGroupId();
                        if (i5 != i) {
                            size4 = this.f25428b.size();
                            z2 = nzVar.getIcon() != null;
                            if (i3 != 0) {
                                size4++;
                                this.f25428b.add(new C5747e(this.f25427a.f25444j, this.f25427a.f25444j));
                            }
                        } else if (z || nzVar.getIcon() == null) {
                            z2 = z;
                            size4 = i2;
                        } else {
                            z2 = true;
                            m34040a(i2, this.f25428b.size());
                            size4 = i2;
                        }
                        C5748f c5748f = new C5748f(nzVar);
                        c5748f.f25433a = z2;
                        this.f25428b.add(c5748f);
                        z = z2;
                        i2 = size4;
                        i4 = i5;
                    }
                    i3++;
                    i = i4;
                }
                this.f25430d = false;
            }
        }

        /* renamed from: a */
        private void m34040a(int i, int i2) {
            while (i < i2) {
                ((C5748f) this.f25428b.get(i)).f25433a = true;
                i++;
            }
        }

        /* renamed from: a */
        public void m34045a(nz nzVar) {
            if (this.f25429c != nzVar && nzVar.isCheckable()) {
                if (this.f25429c != null) {
                    this.f25429c.setChecked(false);
                }
                this.f25429c = nzVar;
                nzVar.setChecked(true);
            }
        }

        /* renamed from: b */
        public Bundle m34049b() {
            Bundle bundle = new Bundle();
            if (this.f25429c != null) {
                bundle.putInt("android:menu:checked", this.f25429c.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f25428b.size();
            for (int i = 0; i < size; i++) {
                C5745d c5745d = (C5745d) this.f25428b.get(i);
                if (c5745d instanceof C5748f) {
                    nz a = ((C5748f) c5745d).m34052a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        SparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: a */
        public void m34044a(Bundle bundle) {
            C5745d c5745d;
            nz a;
            int i = 0;
            int i2 = bundle.getInt("android:menu:checked", 0);
            if (i2 != 0) {
                this.f25430d = true;
                int size = this.f25428b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c5745d = (C5745d) this.f25428b.get(i3);
                    if (c5745d instanceof C5748f) {
                        a = ((C5748f) c5745d).m34052a();
                        if (a != null && a.getItemId() == i2) {
                            m34045a(a);
                            break;
                        }
                    }
                }
                this.f25430d = false;
                m34041c();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                i2 = this.f25428b.size();
                while (i < i2) {
                    c5745d = (C5745d) this.f25428b.get(i);
                    if (c5745d instanceof C5748f) {
                        a = ((C5748f) c5745d).m34052a();
                        if (a != null) {
                            View actionView = a.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }

        /* renamed from: a */
        public void m34048a(boolean z) {
            this.f25430d = z;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$d */
    interface C5745d {
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$c */
    static class C5746c implements C5745d {
        C5746c() {
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$e */
    static class C5747e implements C5745d {
        /* renamed from: a */
        private final int f25431a;
        /* renamed from: b */
        private final int f25432b;

        public C5747e(int i, int i2) {
            this.f25431a = i;
            this.f25432b = i2;
        }

        /* renamed from: a */
        public int m34050a() {
            return this.f25431a;
        }

        /* renamed from: b */
        public int m34051b() {
            return this.f25432b;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$f */
    static class C5748f implements C5745d {
        /* renamed from: a */
        boolean f25433a;
        /* renamed from: b */
        private final nz f25434b;

        C5748f(nz nzVar) {
            this.f25434b = nzVar;
        }

        /* renamed from: a */
        public nz m34052a() {
            return this.f25434b;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$g */
    static class C5749g extends C5742j {
        public C5749g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(n$h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$h */
    static class C5750h extends C5742j {
        public C5750h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(n$h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    /* renamed from: s$i */
    static class C5751i extends C5742j {
        public C5751i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(n$h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: a */
    public void mo5254a(Context context, nx nxVar) {
        this.f25438d = LayoutInflater.from(context);
        this.f25436b = nxVar;
        this.f25444j = context.getResources().getDimensionPixelOffset(n$d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public of m34053a(ViewGroup viewGroup) {
        if (this.f25446l == null) {
            this.f25446l = (NavigationMenuView) this.f25438d.inflate(n$h.design_navigation_menu, viewGroup, false);
            if (this.f25437c == null) {
                this.f25437c = new C5744b(this);
            }
            this.f25435a = (LinearLayout) this.f25438d.inflate(n$h.design_navigation_item_header, this.f25446l, false);
            this.f25446l.setAdapter(this.f25437c);
        }
        return this.f25446l;
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        if (this.f25437c != null) {
            this.f25437c.m34043a();
        }
    }

    /* renamed from: a */
    public void mo5256a(C5548a c5548a) {
        this.f25447m = c5548a;
    }

    /* renamed from: a */
    public boolean mo5260a(ok okVar) {
        return false;
    }

    /* renamed from: a */
    public void mo5255a(nx nxVar, boolean z) {
        if (this.f25447m != null) {
            this.f25447m.mo5221a(nxVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo5258a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo5259a(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo5262b(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public int mo5261b() {
        return this.f25448n;
    }

    /* renamed from: a */
    public void m34054a(int i) {
        this.f25448n = i;
    }

    /* renamed from: c */
    public Parcelable mo5272c() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.f25446l != null) {
            SparseArray sparseArray = new SparseArray();
            this.f25446l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f25437c != null) {
            bundle.putBundle("android:menu:adapter", this.f25437c.m34049b());
        }
        if (this.f25435a == null) {
            return bundle;
        }
        sparseArray = new SparseArray();
        this.f25435a.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        return bundle;
    }

    /* renamed from: a */
    public void mo5266a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f25446l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f25437c.m34044a(bundle2);
            }
            sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray != null) {
                this.f25435a.restoreHierarchyState(sparseParcelableArray);
            }
        }
    }

    /* renamed from: a */
    public void m34062a(nz nzVar) {
        this.f25437c.m34045a(nzVar);
    }

    /* renamed from: b */
    public View m34069b(int i) {
        View inflate = this.f25438d.inflate(i, this.f25435a, false);
        m34059a(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void m34059a(View view) {
        this.f25435a.addView(view);
        this.f25446l.setPadding(0, 0, 0, this.f25446l.getPaddingBottom());
    }

    /* renamed from: d */
    public int m34075d() {
        return this.f25435a.getChildCount();
    }

    /* renamed from: e */
    public ColorStateList m34076e() {
        return this.f25442h;
    }

    /* renamed from: a */
    public void m34056a(ColorStateList colorStateList) {
        this.f25442h = colorStateList;
        mo5257a(false);
    }

    /* renamed from: f */
    public ColorStateList m34077f() {
        return this.f25441g;
    }

    /* renamed from: b */
    public void m34070b(ColorStateList colorStateList) {
        this.f25441g = colorStateList;
        mo5257a(false);
    }

    /* renamed from: c */
    public void m34074c(int i) {
        this.f25439e = i;
        this.f25440f = true;
        mo5257a(false);
    }

    /* renamed from: g */
    public Drawable m34078g() {
        return this.f25443i;
    }

    /* renamed from: a */
    public void m34057a(Drawable drawable) {
        this.f25443i = drawable;
        mo5257a(false);
    }

    /* renamed from: b */
    public void m34071b(boolean z) {
        if (this.f25437c != null) {
            this.f25437c.m34048a(z);
        }
    }

    /* renamed from: a */
    public void m34060a(kb kbVar) {
        int b = kbVar.b();
        if (this.f25449o != b) {
            this.f25449o = b;
            if (this.f25435a.getChildCount() == 0) {
                this.f25446l.setPadding(0, this.f25449o, 0, this.f25446l.getPaddingBottom());
            }
        }
        jd.b(this.f25435a, kbVar);
    }
}
