package com.p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.cocosw.bottomsheet.ClosableSlidingLayout;
import com.cocosw.bottomsheet.ClosableSlidingLayout.C1792a;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.zs.C5808a;
import p000.zs.C5809b;
import p000.zs.C5810c;
import p000.zs.C5811d;
import p000.zs.C5812e;
import p000.zt.C5815a;

/* compiled from: BottomSheet */
/* renamed from: zr */
public class zr extends Dialog implements DialogInterface {
    /* renamed from: a */
    private final SparseIntArray f26121a = new SparseIntArray();
    /* renamed from: b */
    private zu f26122b;
    /* renamed from: c */
    private String f26123c;
    /* renamed from: d */
    private Drawable f26124d;
    /* renamed from: e */
    private Drawable f26125e;
    /* renamed from: f */
    private int f26126f;
    /* renamed from: g */
    private int f26127g;
    /* renamed from: h */
    private int f26128h;
    /* renamed from: i */
    private boolean f26129i;
    /* renamed from: j */
    private GridView f26130j;
    /* renamed from: k */
    private zt f26131k;
    /* renamed from: l */
    private C5807a f26132l;
    /* renamed from: m */
    private ImageView f26133m;
    /* renamed from: n */
    private int f26134n = -1;
    /* renamed from: o */
    private boolean f26135o = true;
    /* renamed from: p */
    private boolean f26136p = true;
    /* renamed from: q */
    private zp f26137q;
    /* renamed from: r */
    private zp f26138r;
    /* renamed from: s */
    private zp f26139s;
    /* renamed from: t */
    private OnDismissListener f26140t;
    /* renamed from: u */
    private OnShowListener f26141u;

    /* compiled from: BottomSheet */
    /* renamed from: zr$1 */
    class C57991 implements C1792a {
        /* renamed from: a */
        final /* synthetic */ zr f26100a;

        C57991(zr zrVar) {
            this.f26100a = zrVar;
        }

        /* renamed from: a */
        public void m34971a() {
            this.f26100a.dismiss();
        }

        /* renamed from: b */
        public void m34972b() {
            this.f26100a.m35000d();
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$2 */
    class C58002 implements OnShowListener {
        /* renamed from: a */
        final /* synthetic */ zr f26101a;

        C58002(zr zrVar) {
            this.f26101a = zrVar;
        }

        public void onShow(DialogInterface dialogInterface) {
            if (this.f26101a.f26141u != null) {
                this.f26101a.f26141u.onShow(dialogInterface);
            }
            this.f26101a.f26130j.setAdapter(this.f26101a.f26131k);
            this.f26101a.f26130j.startLayoutAnimation();
            if (this.f26101a.f26132l.f26118h == null) {
                this.f26101a.f26133m.setVisibility(8);
                return;
            }
            this.f26101a.f26133m.setVisibility(0);
            this.f26101a.f26133m.setImageDrawable(this.f26101a.f26132l.f26118h);
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$3 */
    class C58023 extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ zr f26105a;

        /* compiled from: BottomSheet */
        /* renamed from: zr$3$a */
        class C5801a {
            /* renamed from: a */
            final /* synthetic */ C58023 f26102a;
            /* renamed from: b */
            private TextView f26103b;
            /* renamed from: c */
            private ImageView f26104c;

            C5801a(C58023 c58023) {
                this.f26102a = c58023;
            }
        }

        C58023(zr zrVar) {
            this.f26105a = zrVar;
        }

        public /* synthetic */ Object getItem(int i) {
            return m34977a(i);
        }

        public int getCount() {
            return this.f26105a.f26139s.size() - this.f26105a.f26121a.size();
        }

        /* renamed from: a */
        public MenuItem m34977a(int i) {
            return this.f26105a.f26139s.getItem(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean isEnabled(int i) {
            return m34977a(i).isEnabled();
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            C5801a c5801a;
            if (view == null) {
                LayoutInflater layoutInflater = (LayoutInflater) this.f26105a.getContext().getSystemService("layout_inflater");
                if (this.f26105a.f26132l.f26115e) {
                    inflate = layoutInflater.inflate(this.f26105a.f26128h, viewGroup, false);
                } else {
                    inflate = layoutInflater.inflate(this.f26105a.f26127g, viewGroup, false);
                }
                C5801a c5801a2 = new C5801a(this);
                c5801a2.f26103b = (TextView) inflate.findViewById(C5809b.bs_list_title);
                c5801a2.f26104c = (ImageView) inflate.findViewById(C5809b.bs_list_image);
                inflate.setTag(c5801a2);
                c5801a = c5801a2;
            } else {
                c5801a = (C5801a) view.getTag();
                inflate = view;
            }
            for (int i2 = 0; i2 < this.f26105a.f26121a.size(); i2++) {
                if (this.f26105a.f26121a.valueAt(i2) <= i) {
                    i++;
                }
            }
            MenuItem a = m34977a(i);
            c5801a.f26103b.setText(a.getTitle());
            if (a.getIcon() == null) {
                c5801a.f26104c.setVisibility(this.f26105a.f26129i ? 8 : 4);
            } else {
                c5801a.f26104c.setVisibility(0);
                c5801a.f26104c.setImageDrawable(a.getIcon());
            }
            c5801a.f26104c.setEnabled(a.isEnabled());
            c5801a.f26103b.setEnabled(a.isEnabled());
            return inflate;
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$5 */
    class C58045 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ zr f26108a;

        C58045(zr zrVar) {
            this.f26108a = zrVar;
        }

        public void onClick(View view) {
            this.f26108a.m35002e();
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$6 */
    class C58056 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ zr f26109a;

        C58056(zr zrVar) {
            this.f26109a = zrVar;
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                this.f26109a.f26130j.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                this.f26109a.f26130j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            View childAt = this.f26109a.f26130j.getChildAt(this.f26109a.f26130j.getChildCount() - 1);
            if (childAt != null) {
                this.f26109a.f26130j.setLayoutParams(new LayoutParams(-1, (childAt.getPaddingBottom() + childAt.getBottom()) + this.f26109a.f26130j.getPaddingBottom()));
            }
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$7 */
    class C58067 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ zr f26110a;

        C58067(zr zrVar) {
            this.f26110a = zrVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f26110a.f26140t != null) {
                this.f26110a.f26140t.onDismiss(dialogInterface);
            }
            if (this.f26110a.f26134n != MoPubClientPositioning.NO_REPEAT) {
                this.f26110a.m35002e();
            }
        }
    }

    /* compiled from: BottomSheet */
    /* renamed from: zr$a */
    public static class C5807a {
        /* renamed from: a */
        private final Context f26111a;
        /* renamed from: b */
        private final zp f26112b;
        /* renamed from: c */
        private int f26113c;
        /* renamed from: d */
        private CharSequence f26114d;
        /* renamed from: e */
        private boolean f26115e;
        /* renamed from: f */
        private OnClickListener f26116f;
        /* renamed from: g */
        private OnDismissListener f26117g;
        /* renamed from: h */
        private Drawable f26118h;
        /* renamed from: i */
        private int f26119i;
        /* renamed from: j */
        private OnMenuItemClickListener f26120j;

        public C5807a(Activity activity) {
            this(activity, C5811d.BottomSheet_Dialog);
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{C5808a.bs_bottomSheetStyle});
            try {
                this.f26113c = obtainStyledAttributes.getResourceId(0, C5811d.BottomSheet_Dialog);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public C5807a(Context context, int i) {
            this.f26119i = -1;
            this.f26111a = context;
            this.f26113c = i;
            this.f26112b = new zp(context);
        }

        /* renamed from: a */
        public C5807a m34988a(int i, Drawable drawable, CharSequence charSequence) {
            zq zqVar = new zq(this.f26111a, 0, i, 0, 0, charSequence);
            zqVar.setIcon(drawable);
            this.f26112b.m34960a(zqVar);
            return this;
        }

        /* renamed from: a */
        public C5807a m34989a(OnClickListener onClickListener) {
            this.f26116f = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C5807a m34986a() {
            this.f26115e = true;
            return this;
        }

        /* renamed from: a */
        public C5807a m34987a(int i) {
            this.f26119i = this.f26111a.getResources().getInteger(i);
            return this;
        }

        @SuppressLint({"Override"})
        /* renamed from: b */
        public zr m34991b() {
            zr zrVar = new zr(this.f26111a, this.f26113c);
            zrVar.f26132l = this;
            return zrVar;
        }

        /* renamed from: a */
        public C5807a m34990a(CharSequence charSequence) {
            this.f26114d = charSequence;
            return this;
        }
    }

    zr(Context context, int i) {
        super(context, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C5812e.BottomSheet, C5808a.bs_bottomSheetStyle, 0);
        try {
            this.f26125e = obtainStyledAttributes.getDrawable(C5812e.BottomSheet_bs_moreDrawable);
            this.f26124d = obtainStyledAttributes.getDrawable(C5812e.BottomSheet_bs_closeDrawable);
            this.f26123c = obtainStyledAttributes.getString(C5812e.BottomSheet_bs_moreText);
            this.f26129i = obtainStyledAttributes.getBoolean(C5812e.BottomSheet_bs_collapseListIcons, true);
            this.f26126f = obtainStyledAttributes.getResourceId(C5812e.BottomSheet_bs_headerLayout, C5810c.bs_header);
            this.f26127g = obtainStyledAttributes.getResourceId(C5812e.BottomSheet_bs_listItemLayout, C5810c.bs_list_entry);
            this.f26128h = obtainStyledAttributes.getResourceId(C5812e.BottomSheet_bs_gridItemLayout, C5810c.bs_grid_entry);
            if (VERSION.SDK_INT >= 19) {
                this.f26122b = new zu(this, context);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private int m34995b() {
        int i = 1;
        try {
            Field declaredField = GridView.class.getDeclaredField("mRequestedNumColumns");
            declaredField.setAccessible(true);
            i = declaredField.getInt(this.f26130j);
        } catch (Exception e) {
        }
        return i;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f26135o = z;
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        this.f26141u = onShowListener;
    }

    /* renamed from: a */
    private void m34993a(Context context) {
        int a;
        setCanceledOnTouchOutside(this.f26135o);
        final ClosableSlidingLayout closableSlidingLayout = (ClosableSlidingLayout) View.inflate(context, C5810c.bottom_sheet_dialog, null);
        ((LinearLayout) closableSlidingLayout.findViewById(C5809b.bs_main)).addView(View.inflate(context, this.f26126f, null), 0);
        setContentView(closableSlidingLayout);
        if (!this.f26136p) {
            closableSlidingLayout.f10010b = this.f26136p;
        }
        closableSlidingLayout.a(new C57991(this));
        super.setOnShowListener(new C58002(this));
        int[] iArr = new int[2];
        closableSlidingLayout.getLocationOnScreen(iArr);
        if (VERSION.SDK_INT >= 19) {
            closableSlidingLayout.setPadding(0, iArr[0] == 0 ? this.f26122b.f26168b : 0, 0, 0);
            View childAt = closableSlidingLayout.getChildAt(0);
            if (this.f26122b.f26167a) {
                a = this.f26122b.m35030a(getContext()) + closableSlidingLayout.getPaddingBottom();
            } else {
                a = 0;
            }
            childAt.setPadding(0, 0, 0, a);
        }
        TextView textView = (TextView) closableSlidingLayout.findViewById(C5809b.bottom_sheet_title);
        if (this.f26132l.f26114d != null) {
            textView.setVisibility(0);
            textView.setText(this.f26132l.f26114d);
        }
        this.f26133m = (ImageView) closableSlidingLayout.findViewById(C5809b.bottom_sheet_title_image);
        this.f26130j = (GridView) closableSlidingLayout.findViewById(C5809b.bottom_sheet_gridview);
        closableSlidingLayout.f10009a = this.f26130j;
        if (!this.f26132l.f26115e) {
            this.f26130j.setNumColumns(1);
        }
        if (this.f26132l.f26115e) {
            for (a = 0; a < m35014a().size(); a++) {
                if (m35014a().getItem(a).getIcon() == null) {
                    throw new IllegalArgumentException("You must set icon for each items in grid style");
                }
            }
        }
        if (this.f26132l.f26119i > 0) {
            this.f26134n = this.f26132l.f26119i * m34995b();
        } else {
            this.f26134n = MoPubClientPositioning.NO_REPEAT;
        }
        closableSlidingLayout.a(false);
        this.f26139s = this.f26132l.f26112b;
        this.f26138r = this.f26139s;
        if (m35014a().size() > this.f26134n) {
            this.f26137q = this.f26132l.f26112b;
            this.f26138r = this.f26132l.f26112b.m34961a(this.f26134n - 1);
            zq zqVar = new zq(context, 0, C5809b.bs_more, 0, this.f26134n - 1, this.f26123c);
            zqVar.setIcon(this.f26125e);
            this.f26138r.m34960a(zqVar);
            this.f26139s = this.f26138r;
            closableSlidingLayout.a(true);
        }
        this.f26131k = new zt(context, new C58023(this), C5810c.bs_list_divider, C5809b.headerlayout, C5809b.header);
        this.f26130j.setAdapter(this.f26131k);
        this.f26131k.m35022a(this.f26130j);
        this.f26130j.setOnItemClickListener(new OnItemClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ zr f26107b;

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (((MenuItem) this.f26107b.f26131k.getItem(i)).getItemId() == C5809b.bs_more) {
                    this.f26107b.m35000d();
                    closableSlidingLayout.a(false);
                    return;
                }
                if (!((zq) this.f26107b.f26131k.getItem(i)).m34970b()) {
                    if (this.f26107b.f26132l.f26120j != null) {
                        this.f26107b.f26132l.f26120j.onMenuItemClick((MenuItem) this.f26107b.f26131k.getItem(i));
                    } else if (this.f26107b.f26132l.f26116f != null) {
                        this.f26107b.f26132l.f26116f.onClick(this.f26107b, ((MenuItem) this.f26107b.f26131k.getItem(i)).getItemId());
                    }
                }
                this.f26107b.dismiss();
            }
        });
        if (this.f26132l.f26117g != null) {
            setOnDismissListener(this.f26132l.f26117g);
        }
        m35006g();
    }

    /* renamed from: c */
    private void m34998c() {
        int i = 0;
        this.f26139s.m34962b();
        if (!this.f26132l.f26115e && this.f26139s.size() > 0) {
            int groupId = this.f26139s.getItem(0).getGroupId();
            ArrayList arrayList = new ArrayList();
            while (i < this.f26139s.size()) {
                if (this.f26139s.getItem(i).getGroupId() != groupId) {
                    groupId = this.f26139s.getItem(i).getGroupId();
                    arrayList.add(new C5815a(i, null));
                }
                i++;
            }
            if (arrayList.size() > 0) {
                C5815a[] c5815aArr = new C5815a[arrayList.size()];
                arrayList.toArray(c5815aArr);
                this.f26131k.m35023a(c5815aArr);
                return;
            }
            this.f26131k.f26148a.clear();
        }
    }

    /* renamed from: d */
    private void m35000d() {
        if (VERSION.SDK_INT >= 19) {
            Transition changeBounds = new ChangeBounds();
            changeBounds.setDuration(300);
            TransitionManager.beginDelayedTransition(this.f26130j, changeBounds);
        }
        this.f26139s = this.f26137q;
        m34998c();
        this.f26131k.notifyDataSetChanged();
        this.f26130j.setLayoutParams(new LayoutParams(-1, -1));
        this.f26133m.setVisibility(8);
        this.f26133m.setImageDrawable(this.f26124d);
        this.f26133m.setOnClickListener(new C58045(this));
        m35006g();
    }

    /* renamed from: e */
    private void m35002e() {
        this.f26139s = this.f26138r;
        m34998c();
        this.f26131k.notifyDataSetChanged();
        m35006g();
        if (this.f26132l.f26118h == null) {
            this.f26133m.setVisibility(8);
            return;
        }
        this.f26133m.setVisibility(0);
        this.f26133m.setImageDrawable(this.f26132l.f26118h);
    }

    protected void onStart() {
        super.onStart();
        m35002e();
    }

    /* renamed from: f */
    private boolean m35004f() {
        return this.f26131k.f26148a.size() > 0;
    }

    /* renamed from: g */
    private void m35006g() {
        if (m35004f()) {
            this.f26130j.getViewTreeObserver().addOnGlobalLayoutListener(new C58056(this));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m34993a(getContext());
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 80;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16842996});
        try {
            attributes.width = obtainStyledAttributes.getLayoutDimension(0, -1);
            super.setOnDismissListener(new C58067(this));
            getWindow().setAttributes(attributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public Menu m35014a() {
        return this.f26132l.f26112b;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f26140t = onDismissListener;
    }
}
