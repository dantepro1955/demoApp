package com.p000;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.cocosw.bottomsheet.FillerView;
import com.cocosw.bottomsheet.HeaderLayout;
import com.cocosw.bottomsheet.PinnedSectionGridView;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: SimpleSectionedGridAdapter */
/* renamed from: zt */
class zt extends BaseAdapter {
    /* renamed from: a */
    SparseArray<C5815a> f26148a = new SparseArray();
    /* renamed from: b */
    private boolean f26149b = true;
    /* renamed from: c */
    private int f26150c;
    /* renamed from: d */
    private LayoutInflater f26151d;
    /* renamed from: e */
    private ListAdapter f26152e;
    /* renamed from: f */
    private C5815a[] f26153f = new C5815a[0];
    /* renamed from: g */
    private Context f26154g;
    /* renamed from: h */
    private View f26155h;
    /* renamed from: i */
    private int f26156i;
    /* renamed from: j */
    private int f26157j;
    /* renamed from: k */
    private int f26158k;
    /* renamed from: l */
    private int f26159l;
    /* renamed from: m */
    private int f26160m;
    /* renamed from: n */
    private int f26161n;
    /* renamed from: o */
    private int f26162o;
    /* renamed from: p */
    private int f26163p;
    /* renamed from: q */
    private GridView f26164q;
    /* renamed from: r */
    private int f26165r;
    /* renamed from: s */
    private int f26166s;

    /* compiled from: SimpleSectionedGridAdapter */
    /* renamed from: zt$1 */
    class C58131 extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ zt f26142a;

        C58131(zt ztVar) {
            this.f26142a = ztVar;
        }

        public void onChanged() {
            this.f26142a.f26149b = !this.f26142a.f26152e.isEmpty();
            this.f26142a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f26142a.f26149b = false;
            this.f26142a.notifyDataSetInvalidated();
        }
    }

    /* compiled from: SimpleSectionedGridAdapter */
    /* renamed from: zt$2 */
    class C58142 implements Comparator<C5815a> {
        /* renamed from: a */
        final /* synthetic */ zt f26143a;

        C58142(zt ztVar) {
            this.f26143a = ztVar;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m35015a((C5815a) obj, (C5815a) obj2);
        }

        /* renamed from: a */
        public int m35015a(C5815a c5815a, C5815a c5815a2) {
            if (c5815a.f26144a == c5815a2.f26144a) {
                return 0;
            }
            return c5815a.f26144a < c5815a2.f26144a ? -1 : 1;
        }
    }

    /* compiled from: SimpleSectionedGridAdapter */
    /* renamed from: zt$a */
    public static class C5815a {
        /* renamed from: a */
        int f26144a;
        /* renamed from: b */
        int f26145b;
        /* renamed from: c */
        CharSequence f26146c;
        /* renamed from: d */
        int f26147d = 0;

        public C5815a(int i, CharSequence charSequence) {
            this.f26144a = i;
            this.f26146c = charSequence;
        }
    }

    public zt(Context context, BaseAdapter baseAdapter, int i, int i2, int i3) {
        this.f26151d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f26150c = i;
        this.f26165r = i2;
        this.f26166s = i3;
        this.f26152e = baseAdapter;
        this.f26154g = context;
        this.f26152e.registerDataSetObserver(new C58131(this));
    }

    /* renamed from: a */
    public void m35022a(GridView gridView) {
        if (gridView instanceof PinnedSectionGridView) {
            this.f26164q = gridView;
            this.f26161n = gridView.getStretchMode();
            this.f26158k = gridView.getWidth() - (this.f26164q.getPaddingLeft() + this.f26164q.getPaddingRight());
            this.f26157j = ((PinnedSectionGridView) gridView).getNumColumns();
            this.f26162o = ((PinnedSectionGridView) gridView).getColumnWidth();
            this.f26163p = ((PinnedSectionGridView) gridView).getHorizontalSpacing();
            return;
        }
        throw new IllegalArgumentException("Does your grid view extends PinnedSectionGridView?");
    }

    /* renamed from: b */
    private int m35019b() {
        if (this.f26156i > 0) {
            return this.f26156i;
        }
        if (this.f26158k != this.f26164q.getWidth()) {
            this.f26161n = this.f26164q.getStretchMode();
            this.f26158k = ((PinnedSectionGridView) this.f26164q).a() - (this.f26164q.getPaddingLeft() + this.f26164q.getPaddingRight());
            this.f26157j = ((PinnedSectionGridView) this.f26164q).getNumColumns();
            this.f26162o = ((PinnedSectionGridView) this.f26164q).getColumnWidth();
            this.f26163p = ((PinnedSectionGridView) this.f26164q).getHorizontalSpacing();
        }
        int i = (this.f26158k - (this.f26157j * this.f26162o)) - ((this.f26157j - 1) * this.f26163p);
        switch (this.f26161n) {
            case 0:
                this.f26158k -= i;
                this.f26159l = this.f26162o;
                this.f26160m = this.f26163p;
                break;
            case 1:
                this.f26159l = this.f26162o;
                if (this.f26157j <= 1) {
                    this.f26160m = i + this.f26163p;
                    break;
                }
                this.f26160m = (i / (this.f26157j - 1)) + this.f26163p;
                break;
            case 2:
                this.f26159l = (i / this.f26157j) + this.f26162o;
                this.f26160m = this.f26163p;
                break;
            case 3:
                this.f26159l = this.f26162o;
                this.f26160m = this.f26163p;
                this.f26158k = (this.f26158k - i) + (this.f26160m * 2);
                break;
        }
        this.f26156i = this.f26158k + ((this.f26157j - 1) * (this.f26159l + this.f26160m));
        return this.f26156i;
    }

    /* renamed from: a */
    public void m35023a(C5815a... c5815aArr) {
        this.f26153f = c5815aArr;
        m35021a();
    }

    /* renamed from: a */
    public void m35021a() {
        this.f26148a.clear();
        m35019b();
        Arrays.sort(this.f26153f, new C58142(this));
        int i = 0;
        for (int i2 = 0; i2 < this.f26153f.length; i2++) {
            C5815a c5815a = this.f26153f[i2];
            int i3 = i;
            for (i = 0; i < this.f26157j - 1; i++) {
                C5815a c5815a2 = new C5815a(c5815a.f26144a, c5815a.f26146c);
                c5815a2.f26147d = 2;
                c5815a2.f26145b = c5815a2.f26144a + i3;
                this.f26148a.append(c5815a2.f26145b, c5815a2);
                i3++;
            }
            C5815a c5815a3 = new C5815a(c5815a.f26144a, c5815a.f26146c);
            c5815a3.f26147d = 1;
            c5815a3.f26145b = c5815a3.f26144a + i3;
            this.f26148a.append(c5815a3.f26145b, c5815a3);
            i = i3 + 1;
            if (i2 < this.f26153f.length - 1) {
                int i4 = this.f26153f[i2 + 1].f26144a;
                int i5 = this.f26157j - ((i4 - c5815a.f26144a) % this.f26157j);
                if (this.f26157j != i5) {
                    i3 = 0;
                    while (i3 < i5) {
                        c5815a2 = new C5815a(c5815a.f26144a, c5815a.f26146c);
                        c5815a2.f26147d = 0;
                        c5815a2.f26145b = i4 + i;
                        this.f26148a.append(c5815a2.f26145b, c5815a2);
                        i3++;
                        i++;
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public int m35020a(int i) {
        if (m35024b(i)) {
            return -1;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f26148a.size() && ((C5815a) this.f26148a.valueAt(i2)).f26145b <= i) {
            i3--;
            i2++;
        }
        return i + i3;
    }

    /* renamed from: b */
    public boolean m35024b(int i) {
        return this.f26148a.get(i) != null;
    }

    public int getCount() {
        return this.f26149b ? this.f26152e.getCount() + this.f26148a.size() : 0;
    }

    public Object getItem(int i) {
        if (m35024b(i)) {
            return this.f26148a.get(i);
        }
        return this.f26152e.getItem(m35020a(i));
    }

    public long getItemId(int i) {
        if (m35024b(i)) {
            return (long) (MoPubClientPositioning.NO_REPEAT - this.f26148a.indexOfKey(i));
        }
        return this.f26152e.getItemId(m35020a(i));
    }

    public int getItemViewType(int i) {
        if (m35024b(i)) {
            return getViewTypeCount() - 1;
        }
        return this.f26152e.getItemViewType(m35020a(i));
    }

    public boolean isEnabled(int i) {
        if (m35024b(i)) {
            return false;
        }
        return this.f26152e.isEnabled(m35020a(i));
    }

    public int getViewTypeCount() {
        return this.f26152e.getViewTypeCount() + 1;
    }

    public boolean areAllItemsEnabled() {
        return this.f26152e.areAllItemsEnabled();
    }

    public boolean hasStableIds() {
        return this.f26152e.hasStableIds();
    }

    public boolean isEmpty() {
        return this.f26152e.isEmpty();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (m35024b(i)) {
            if (view == null) {
                view = this.f26151d.inflate(this.f26150c, viewGroup, false);
            } else if (view.findViewById(this.f26165r) == null) {
                view = this.f26151d.inflate(this.f26150c, viewGroup, false);
            }
            HeaderLayout headerLayout;
            switch (((C5815a) this.f26148a.get(i)).f26147d) {
                case 1:
                    headerLayout = (HeaderLayout) view.findViewById(this.f26165r);
                    if (!TextUtils.isEmpty(((C5815a) this.f26148a.get(i)).f26146c)) {
                        ((TextView) view.findViewById(this.f26166s)).setText(((C5815a) this.f26148a.get(i)).f26146c);
                    }
                    headerLayout.a(m35019b());
                    return view;
                case 2:
                    headerLayout = (HeaderLayout) view.findViewById(this.f26165r);
                    if (!TextUtils.isEmpty(((C5815a) this.f26148a.get(i)).f26146c)) {
                        ((TextView) view.findViewById(this.f26166s)).setText(((C5815a) this.f26148a.get(i)).f26146c);
                    }
                    headerLayout.a(0);
                    return view;
                default:
                    return m35017a(this.f26155h);
            }
        }
        view = this.f26152e.getView(m35020a(i), view, viewGroup);
        this.f26155h = view;
        return view;
    }

    /* renamed from: a */
    private FillerView m35017a(View view) {
        FillerView fillerView = new FillerView(this.f26154g);
        fillerView.a(view);
        return fillerView;
    }
}
