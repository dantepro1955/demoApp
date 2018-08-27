package com.sept.android.lib.widget.uiv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Throwables;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.datasource.SimpleDataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.sept.android.lib.widget.uiv.UniversalImageView.C4497b;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import p000.dfz;
import p000.dgn;
import p000.dll;
import p000.dlm;
import p000.dlr;
import p000.dmg;

public class FrescoTilingView extends View {
    /* renamed from: A */
    private static dfz f19736A;
    /* renamed from: a */
    private static Object f19737a = new Object();
    /* renamed from: c */
    private static Rect f19738c;
    /* renamed from: y */
    private static Timer f19739y;
    /* renamed from: z */
    private static WeakHashMap<FrescoTilingView, Boolean> f19740z = new WeakHashMap();
    /* renamed from: b */
    private C4483c f19741b;
    /* renamed from: d */
    private int f19742d = 0;
    /* renamed from: e */
    private int f19743e = 0;
    /* renamed from: f */
    private dll<GenericDraweeHierarchy> f19744f;
    /* renamed from: g */
    private Rect f19745g = new Rect();
    /* renamed from: h */
    private Matrix f19746h = new Matrix();
    /* renamed from: i */
    private RectF f19747i;
    /* renamed from: j */
    private Rect f19748j;
    /* renamed from: k */
    private Rect f19749k;
    /* renamed from: l */
    private boolean f19750l;
    /* renamed from: m */
    private Point f19751m = new Point();
    /* renamed from: n */
    private Rect f19752n = new Rect();
    /* renamed from: o */
    private Rect f19753o = new Rect();
    /* renamed from: p */
    private Rect f19754p = new Rect();
    /* renamed from: q */
    private RectF f19755q = new RectF();
    /* renamed from: r */
    private dmg f19756r;
    /* renamed from: s */
    private boolean f19757s = false;
    /* renamed from: t */
    private int f19758t = 0;
    /* renamed from: u */
    private int f19759u = 0;
    /* renamed from: v */
    private Object f19760v = new Object();
    /* renamed from: w */
    private ArrayList<C4482b> f19761w;
    /* renamed from: x */
    private dlr f19762x;

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$1 */
    class C44801 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FrescoTilingView f19712a;

        C44801(FrescoTilingView frescoTilingView) {
            this.f19712a = frescoTilingView;
        }

        public void run() {
            this.f19712a.f19762x.mo4091i();
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$a */
    static class C4481a implements Runnable {
        /* renamed from: a */
        private static ArrayList<C4481a> f19713a = new ArrayList();
        /* renamed from: b */
        private WeakReference<FrescoTilingView> f19714b;

        private C4481a() {
        }

        /* renamed from: a */
        public static C4481a m24066a(FrescoTilingView frescoTilingView) {
            C4481a c4481a;
            synchronized (f19713a) {
                if (f19713a.size() == 0) {
                    c4481a = new C4481a();
                } else {
                    c4481a = (C4481a) f19713a.remove(0);
                }
            }
            c4481a.m24068b(frescoTilingView);
            return c4481a;
        }

        /* renamed from: b */
        private void m24068b(FrescoTilingView frescoTilingView) {
            this.f19714b = new WeakReference(frescoTilingView);
        }

        public void run() {
            FrescoTilingView frescoTilingView = (FrescoTilingView) this.f19714b.get();
            if (frescoTilingView != null) {
                int d = frescoTilingView.f19744f.m27852d();
                for (int i = 0; i < d; i++) {
                    frescoTilingView.f19744f.m27851c(i);
                }
                m24067a();
            }
        }

        /* renamed from: a */
        private void m24067a() {
            this.f19714b.clear();
            synchronized (f19713a) {
                f19713a.add(this);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$b */
    public static class C4482b implements DataSubscriber {
        /* renamed from: a */
        private WeakReference<FrescoTilingView> f19715a;
        /* renamed from: b */
        private int f19716b;

        public C4482b(FrescoTilingView frescoTilingView) {
            this.f19715a = new WeakReference(frescoTilingView);
        }

        /* renamed from: a */
        public void m24070a() {
            this.f19715a.clear();
        }

        /* renamed from: b */
        public int m24071b() {
            return this.f19716b;
        }

        public void onNewResult(DataSource dataSource) {
            this.f19716b = 10000;
            m24069a(dataSource);
        }

        public void onFailure(DataSource dataSource) {
            this.f19716b = 10000;
            m24069a(dataSource);
            if (this.f19715a.get() != null && ((FrescoTilingView) this.f19715a.get()).f19741b != null && FrescoTilingView.f19736A != null) {
                String str = "DOWNLOAD_FAIL";
                if (dataSource.getFailureCause() != null) {
                    String stackTraceAsString = Throwables.getStackTraceAsString(dataSource.getFailureCause());
                    if (dataSource.getFailureCause() instanceof UnknownHostException) {
                        str = "UNKNOWN_HOST";
                    } else if (dataSource.getFailureCause() instanceof FileNotFoundException) {
                        str = "FILE_NOT_FOUND";
                    }
                    FrescoTilingView.f19736A.log(str, "USER_EXPERIENCE", stackTraceAsString);
                } else {
                    FrescoTilingView.f19736A.log(str, "USER_EXPERIENCE", "Unknown Failure cause");
                }
                ((FrescoTilingView) this.f19715a.get()).m24099e();
            }
        }

        public void onCancellation(DataSource dataSource) {
            this.f19716b = 10000;
            m24069a(dataSource);
        }

        public void onProgressUpdate(DataSource dataSource) {
            m24069a(dataSource);
        }

        /* renamed from: a */
        private void m24069a(DataSource dataSource) {
            this.f19716b = (int) (dataSource.getProgress() * 10000.0f);
            FrescoTilingView frescoTilingView = (FrescoTilingView) this.f19715a.get();
            if (frescoTilingView != null) {
                frescoTilingView.m24097d();
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$c */
    public static class C4483c {
        /* renamed from: a */
        public ArrayList<C4484d> f19717a;
        /* renamed from: b */
        public float[] f19718b;
        /* renamed from: c */
        public boolean f19719c = false;
        /* renamed from: d */
        public C4497b f19720d;
        /* renamed from: e */
        public Priority f19721e = Priority.HIGH;
        /* renamed from: f */
        public float f19722f;
        /* renamed from: g */
        public RequestListener f19723g = null;
        /* renamed from: h */
        private ArrayList<RectF> f19724h;
        /* renamed from: i */
        private int f19725i;
        /* renamed from: j */
        private int f19726j;
        /* renamed from: k */
        private dgn f19727k;

        public C4483c(ArrayList<C4484d> arrayList, int i, int i2, float f) {
            this.f19717a = arrayList;
            this.f19724h = new ArrayList();
            this.f19725i = i;
            this.f19726j = i2;
            this.f19718b = new float[]{f, f, f, f};
            m24076c();
        }

        /* renamed from: a */
        public void m24081a(RequestListener requestListener) {
            this.f19723g = requestListener;
        }

        /* renamed from: b */
        private String m24073b() {
            Iterator it = this.f19717a.iterator();
            String str = "";
            while (it.hasNext()) {
                C4484d c4484d = (C4484d) it.next();
                str = str + c4484d.f19728a + c4484d.f19729b + c4484d.f19730c;
            }
            return str + "" + this.f19725i + this.f19726j;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C4483c)) {
                return false;
            }
            return TextUtils.equals(((C4483c) obj).m24073b(), m24073b());
        }

        /* renamed from: c */
        private void m24076c() {
            this.f19724h.clear();
            Iterator it = this.f19717a.iterator();
            while (it.hasNext()) {
                C4484d c4484d = (C4484d) it.next();
                this.f19724h.add(new RectF(0.0f, 0.0f, (float) c4484d.f19729b, (float) c4484d.f19730c));
            }
        }

        /* renamed from: a */
        public void m24078a() {
            this.f19719c = true;
        }

        /* renamed from: a */
        public void m24082a(C4497b c4497b) {
            this.f19720d = c4497b;
        }

        /* renamed from: a */
        public void m24080a(Priority priority) {
            this.f19721e = priority;
        }

        /* renamed from: a */
        public void m24083a(dgn dgn) {
            this.f19727k = dgn;
        }

        /* renamed from: a */
        public void m24079a(float f) {
            this.f19722f = f;
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$d */
    public static class C4484d {
        /* renamed from: a */
        public String f19728a;
        /* renamed from: b */
        public int f19729b;
        /* renamed from: c */
        public int f19730c;

        public C4484d(String str, int i, int i2) {
            this.f19728a = str;
            this.f19729b = i;
            this.f19730c = i2;
        }

        public String toString() {
            return "path=" + this.f19728a + ", w=" + this.f19729b + ", " + "h=" + this.f19730c;
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$e */
    static class C4485e implements Runnable {
        /* renamed from: a */
        private static ArrayList<C4485e> f19731a = new ArrayList();
        /* renamed from: b */
        private WeakReference<FrescoTilingView> f19732b;

        private C4485e() {
        }

        /* renamed from: a */
        public static C4485e m24084a(FrescoTilingView frescoTilingView) {
            C4485e c4485e;
            synchronized (f19731a) {
                if (f19731a.size() == 0) {
                    c4485e = new C4485e();
                } else {
                    c4485e = (C4485e) f19731a.remove(0);
                }
            }
            c4485e.m24086b(frescoTilingView);
            return c4485e;
        }

        /* renamed from: b */
        private void m24086b(FrescoTilingView frescoTilingView) {
            this.f19732b = new WeakReference(frescoTilingView);
        }

        public void run() {
            FrescoTilingView frescoTilingView = (FrescoTilingView) this.f19732b.get();
            if (frescoTilingView != null && frescoTilingView.f19762x != null) {
                if (frescoTilingView.f19741b == null || frescoTilingView.f19741b.f19720d == C4497b.f19781a) {
                    frescoTilingView.f19762x.mo4088a((long) frescoTilingView.f19759u, (long) frescoTilingView.f19758t);
                    if (frescoTilingView.f19759u >= frescoTilingView.f19758t - 100) {
                        frescoTilingView.f19762x.mo4089g();
                    }
                    m24085a();
                }
            }
        }

        /* renamed from: a */
        private void m24085a() {
            this.f19732b.clear();
            synchronized (f19731a) {
                f19731a.add(this);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$f */
    static class C4486f implements Runnable {
        /* renamed from: a */
        private static ArrayList<C4486f> f19733a = new ArrayList();
        /* renamed from: b */
        private WeakReference<FrescoTilingView> f19734b;
        /* renamed from: c */
        private HashSet<Integer> f19735c;

        private C4486f() {
        }

        /* renamed from: a */
        public static C4486f m24087a(FrescoTilingView frescoTilingView, HashSet<Integer> hashSet) {
            C4486f c4486f;
            synchronized (f19733a) {
                if (f19733a.size() == 0) {
                    c4486f = new C4486f();
                } else {
                    c4486f = (C4486f) f19733a.remove(0);
                }
            }
            c4486f.m24089b(frescoTilingView, hashSet);
            return c4486f;
        }

        /* renamed from: b */
        private void m24089b(FrescoTilingView frescoTilingView, HashSet<Integer> hashSet) {
            this.f19734b = new WeakReference(frescoTilingView);
            this.f19735c = hashSet;
        }

        public void run() {
            FrescoTilingView frescoTilingView = (FrescoTilingView) this.f19734b.get();
            if (frescoTilingView != null) {
                int d = frescoTilingView.f19744f.m27852d();
                for (int i = 0; i < d; i++) {
                    if (this.f19735c.contains(Integer.valueOf(i))) {
                        frescoTilingView.f19744f.m27849b(i);
                    } else {
                        frescoTilingView.f19744f.m27851c(i);
                    }
                }
                m24088a();
            }
        }

        /* renamed from: a */
        private void m24088a() {
            this.f19734b.clear();
            this.f19735c.clear();
            synchronized (f19733a) {
                f19733a.add(this);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.uiv.FrescoTilingView$g */
    static class C4487g extends TimerTask {
        private C4487g() {
        }

        public void run() {
            synchronized (FrescoTilingView.f19740z) {
                for (FrescoTilingView f : FrescoTilingView.f19740z.keySet()) {
                    f.m24100f();
                }
            }
        }
    }

    public FrescoTilingView(Context context) {
        super(context);
        m24095c();
    }

    public FrescoTilingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24095c();
    }

    public FrescoTilingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24095c();
    }

    /* renamed from: c */
    private void m24095c() {
        this.f19744f = new dll();
        this.f19761w = new ArrayList();
        this.f19747i = new RectF();
        this.f19748j = new Rect();
        this.f19749k = new Rect();
        if (f19738c == null) {
            int i;
            int i2;
            Point point = new Point();
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            if (VERSION.SDK_INT >= 11) {
                windowManager.getDefaultDisplay().getSize(point);
                i = point.x;
                i2 = point.y;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                i = defaultDisplay.getWidth();
                i2 = defaultDisplay.getHeight();
            }
            f19738c = new Rect(-800, -800, i + 800, i2 + 800);
        }
        this.f19756r = new dmg(this);
        f19736A = dlm.m27883a();
    }

    public void setDimension(int i, int i2) {
        this.f19742d = i;
        this.f19743e = i2;
    }

    public void setBoundedHeight(boolean z) {
        this.f19750l = z;
    }

    public void setEnabledGesture(boolean z) {
        this.f19756r.m27994a(z);
    }

    public void setFillParentHeight(boolean z) {
        this.f19757s = z;
    }

    /* renamed from: d */
    private void m24097d() {
        Iterator it = this.f19761w.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((C4482b) it.next()).m24071b() + i;
        }
        this.f19759u = i;
        post(C4485e.m24084a(this));
    }

    /* renamed from: e */
    private void m24099e() {
        post(new C44801(this));
    }

    public void setAdapter(C4483c c4483c) {
        boolean z;
        int i;
        synchronized (this.f19760v) {
            if (this.f19741b == null || !this.f19741b.equals(c4483c)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.f19741b = c4483c;
                this.f19745g.setEmpty();
                this.f19746h.reset();
            }
        }
        if (!z) {
            if (this.f19744f != null) {
                int d = this.f19744f.m27852d();
                for (i = 0; i < d; i++) {
                    this.f19744f.m27853d(i).getTopLevelDrawable().setCallback(null);
                }
                this.f19744f.m27850c();
            }
            Iterator it = this.f19761w.iterator();
            while (it.hasNext()) {
                ((C4482b) it.next()).m24070a();
            }
            this.f19761w.clear();
            if (c4483c == null) {
                m24106i();
                requestLayout();
                return;
            }
        }
        this.f19758t = c4483c.f19717a.size() * 10000;
        this.f19759u = 0;
        if (c4483c.f19720d != C4497b.ANIMATED) {
            this.f19762x.mo4090h();
        }
        Resources resources = getResources();
        Iterator it2 = c4483c.f19717a.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C4484d c4484d = (C4484d) it2.next();
            DataSubscriber c4482b = new C4482b(this);
            this.f19761w.add(c4482b);
            String str = c4484d.f19728a;
            if (c4483c.f19727k != null) {
                str = c4483c.f19727k.mo4407a(c4484d.f19728a);
            }
            if (!TextUtils.isEmpty(str)) {
                ImageRequestBuilder requestListener = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setRequestPriority(c4483c.f19721e).setProgressiveRenderingEnabled(true).setRequestListener(c4483c.f19723g);
                if (c4483c.f19722f > 1.0f) {
                    int i3 = (int) (((float) c4484d.f19729b) / c4483c.f19722f);
                    int i4 = (int) (((float) c4484d.f19730c) / c4483c.f19722f);
                    if (i3 > 0 && i4 > 0) {
                        requestListener.setResizeOptions(new ResizeOptions(i3, i4));
                    }
                }
                ImageRequest build = requestListener.build();
                if (str.startsWith("file://")) {
                    SimpleDataSource create = SimpleDataSource.create();
                    create.subscribe(c4482b, CallerThreadExecutor.getInstance());
                    create.setProgress(100.0f);
                } else {
                    Fresco.getImagePipeline().prefetchToDiskCache(build, null).subscribe(c4482b, CallerThreadExecutor.getInstance());
                }
                if (z) {
                    i = i2;
                } else {
                    GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(resources);
                    if (c4483c.f19719c) {
                        RoundingParams roundingParams = new RoundingParams();
                        roundingParams.setRoundAsCircle(true);
                        genericDraweeHierarchyBuilder.setRoundingParams(roundingParams);
                    }
                    DraweeHolder draweeHolder = new DraweeHolder(genericDraweeHierarchyBuilder.build());
                    draweeHolder.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(build)).setOldController(draweeHolder.getController())).build());
                    draweeHolder.getTopLevelDrawable().setCallback(this);
                    draweeHolder.getTopLevelDrawable().setBounds(0, 0, c4484d.f19729b, c4484d.f19730c);
                    this.f19744f.m27845a(draweeHolder);
                    i = c4484d.f19730c + i2;
                }
                i2 = i;
            }
        }
        m24106i();
        if (!c4483c.f19719c) {
            m24107j();
        }
        m24100f();
        requestLayout();
    }

    /* renamed from: f */
    private void m24100f() {
        synchronized (this.f19760v) {
            try {
                getGlobalVisibleRect(this.f19754p, this.f19751m);
                this.f19754p.offset(-this.f19751m.x, -this.f19751m.y);
                this.f19752n.set(this.f19751m.x, this.f19751m.y, this.f19751m.x + getMeasuredWidth(), this.f19751m.y + getMeasuredHeight());
                this.f19756r.m27996b();
                if (this.f19745g.equals(this.f19754p) && this.f19746h.equals(this.f19756r.m27999c())) {
                    return;
                }
                this.f19746h.set(this.f19756r.m27999c());
                this.f19745g.set(this.f19754p);
                if (!Rect.intersects(f19738c, this.f19752n) || this.f19741b == null) {
                    post(C4481a.m24066a(this));
                    return;
                }
                int size = this.f19741b.f19717a.size();
                HashSet hashSet = new HashSet();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3;
                    this.f19756r.m27999c().mapRect(this.f19755q, (RectF) this.f19741b.f19724h.get(i2));
                    if (i2 == 0) {
                        i3 = (int) this.f19755q.top;
                    } else {
                        i3 = i;
                    }
                    this.f19753o.top = i3;
                    this.f19753o.bottom = i3 + ((int) this.f19755q.height());
                    i = this.f19753o.bottom;
                    i3 = (int) this.f19755q.left;
                    this.f19753o.left = i3;
                    this.f19753o.right = (int) this.f19755q.right;
                    i3 += this.f19753o.right;
                    if (this.f19753o.left <= this.f19754p.right + 800 && this.f19753o.right >= this.f19754p.left - 800 && this.f19753o.top <= this.f19754p.bottom + 800 && this.f19753o.bottom >= this.f19754p.top - 800) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                }
                post(C4486f.m24087a(this, hashSet));
            } catch (NullPointerException e) {
            }
        }
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate();
    }

    public void setAllowZooming(boolean z) {
        this.f19756r.m27998b(z);
    }

    public void setScrollingTopOffset(int i) {
        this.f19756r.m27997b(i);
    }

    public void setScrollingBottomOffset(int i) {
        this.f19756r.m28000c(i);
    }

    /* renamed from: g */
    private void m24102g() {
        synchronized (f19740z) {
            f19740z.put(this, Boolean.valueOf(true));
        }
        synchronized (f19737a) {
            if (f19739y != null) {
                return;
            }
            f19739y = new Timer("fresco-update-attachment");
            f19739y.scheduleAtFixedRate(new C4487g(), 0, 40);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    private void m24104h() {
        /*
        r3 = this;
        r1 = f19740z;
        monitor-enter(r1);
        r0 = f19740z;	 Catch:{ all -> 0x001c }
        r0.remove(r3);	 Catch:{ all -> 0x001c }
        r0 = f19740z;	 Catch:{ all -> 0x001c }
        r0 = r0.keySet();	 Catch:{ all -> 0x001c }
        r0 = r0.size();	 Catch:{ all -> 0x001c }
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        r1 = f19737a;
        monitor-enter(r1);
        r2 = f19739y;	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x001f;
    L_0x001a:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
    L_0x001b:
        return;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
    L_0x001f:
        if (r0 != 0) goto L_0x0029;
    L_0x0021:
        r0 = f19739y;	 Catch:{ all -> 0x002b }
        r0.cancel();	 Catch:{ all -> 0x002b }
        r0 = 0;
        f19739y = r0;	 Catch:{ all -> 0x002b }
    L_0x0029:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        goto L_0x001b;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sept.android.lib.widget.uiv.FrescoTilingView.h():void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19744f.m27848b();
        m24104h();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f19744f.m27848b();
        m24104h();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19744f.m27843a();
        m24102g();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f19744f.m27843a();
        m24102g();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return this.f19744f.m27847a(drawable);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f19742d == 0 || this.f19743e == 0 || !(!this.f19757s || this.f19741b == null || this.f19741b.f19720d == C4497b.ANIMATED)) {
            super.onMeasure(i, i2);
            m24106i();
            return;
        }
        float f = (((float) this.f19743e) * 1.0f) / ((float) this.f19742d);
        int size = MeasureSpec.getSize(i);
        int i3 = (int) (((float) size) * f);
        if (!this.f19750l || i3 <= size) {
            int i4 = i3;
            i3 = size;
            size = i4;
        } else {
            i3 = (int) (((float) size) / f);
        }
        setMeasuredDimension(i3, size);
        m24106i();
    }

    /* renamed from: i */
    private void m24106i() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f19741b != null) {
            this.f19756r.m28001d().right = (float) this.f19741b.f19725i;
            this.f19756r.m28001d().bottom = (float) this.f19741b.f19726j;
            this.f19756r.m27992a(measuredWidth, measuredHeight, this.f19741b.f19725i, this.f19741b.f19726j, 0);
            this.f19746h.set(this.f19756r.m27999c());
        }
    }

    /* renamed from: j */
    private void m24107j() {
        float[] fArr = this.f19741b.f19718b;
        Resources resources = getResources();
        int i = 1;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float applyDimension = TypedValue.applyDimension(1, fArr[i2], resources.getDisplayMetrics());
            if (applyDimension != 0.0f) {
                i = 0;
            }
            fArr[i2] = applyDimension;
        }
        if (i != 0 || this.f19744f == null || this.f19744f.m27852d() <= 0 || fArr.length != 4) {
            return;
        }
        if (this.f19744f.m27852d() == 1) {
            RoundingParams fromCornersRadii = RoundingParams.fromCornersRadii(fArr[0], fArr[1], fArr[2], fArr[3]);
            RoundingParams roundingParams = ((GenericDraweeHierarchy) this.f19744f.m27853d(0).getHierarchy()).getRoundingParams();
            if (roundingParams == null || roundingParams.getCornersRadii() == null) {
                i = 0;
            } else {
                float[] cornersRadii = roundingParams.getCornersRadii();
                i = 0;
                for (float applyDimension2 : cornersRadii) {
                    if (applyDimension2 != 0.0f) {
                        i = 1;
                    }
                }
            }
            if (i == 0) {
                ((GenericDraweeHierarchy) this.f19744f.m27853d(0).getHierarchy()).setRoundingParams(fromCornersRadii);
                return;
            }
            return;
        }
        RoundingParams fromCornersRadii2 = RoundingParams.fromCornersRadii(fArr[0], fArr[1], 0.0f, 0.0f);
        RoundingParams fromCornersRadii3 = RoundingParams.fromCornersRadii(0.0f, 0.0f, fArr[2], fArr[3]);
        DraweeHolder d = this.f19744f.m27853d(0);
        DraweeHolder d2 = this.f19744f.m27853d(this.f19744f.m27852d() - 1);
        ((GenericDraweeHierarchy) d.getHierarchy()).setRoundingParams(fromCornersRadii2);
        ((GenericDraweeHierarchy) d2.getHierarchy()).setRoundingParams(fromCornersRadii3);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19741b != null) {
            this.f19756r.m27996b();
            int i = 0;
            int i2 = 0;
            while (i < this.f19741b.f19717a.size()) {
                int i3 = i2;
                int i4 = 0;
                for (int i5 = 0; i5 < 1; i5++) {
                    this.f19756r.m27999c().mapRect(this.f19747i, (RectF) this.f19741b.f19724h.get(i));
                    if (i5 == 0) {
                        if (i == 0) {
                            i3 = (int) this.f19747i.top;
                        }
                        this.f19748j.top = i3;
                        this.f19748j.bottom = (int) this.f19747i.height();
                        i3 += this.f19748j.bottom;
                        i2 = (int) this.f19747i.left;
                    } else {
                        i2 = i4;
                    }
                    this.f19748j.left = i2;
                    this.f19748j.right = (int) this.f19747i.right;
                    i4 = this.f19748j.right + i2;
                    if (this.f19744f.m27846a(i)) {
                        Drawable topLevelDrawable = this.f19744f.m27853d(i).getTopLevelDrawable();
                        if (topLevelDrawable != null) {
                            int save = canvas.save();
                            canvas.translate((float) this.f19748j.left, (float) this.f19748j.top);
                            canvas.scale(this.f19747i.width() / ((RectF) this.f19741b.f19724h.get(i)).width(), this.f19747i.height() / ((RectF) this.f19741b.f19724h.get(i)).height());
                            topLevelDrawable.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
                i++;
                i2 = i3;
            }
        }
    }

    public void setAggregateUniversalImageViewProgressListener(dlr dlr) {
        this.f19762x = dlr;
    }
}
