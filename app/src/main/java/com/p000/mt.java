package com.p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.C0507a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.C0638b;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;
import p000.mx.C5568a;
import p000.mx.C5574g;
import p000.mx.C5576i;
import p000.nx.C5537a;
import p000.oe.C5548a;

/* compiled from: ToolbarActionBar */
/* renamed from: mt */
class mt extends ActionBar {
    /* renamed from: a */
    pg f24618a;
    /* renamed from: b */
    boolean f24619b;
    /* renamed from: c */
    Callback f24620c;
    /* renamed from: d */
    private boolean f24621d;
    /* renamed from: e */
    private boolean f24622e;
    /* renamed from: f */
    private ArrayList<C0507a> f24623f = new ArrayList();
    /* renamed from: g */
    private nv f24624g;
    /* renamed from: h */
    private final Runnable f24625h = new C55571(this);
    /* renamed from: i */
    private final C0638b f24626i = new C55582(this);

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$1 */
    class C55571 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ mt f24611a;

        C55571(mt mtVar) {
            this.f24611a = mtVar;
        }

        public void run() {
            this.f24611a.m32845j();
        }
    }

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$2 */
    class C55582 implements C0638b {
        /* renamed from: a */
        final /* synthetic */ mt f24612a;

        C55582(mt mtVar) {
            this.f24612a = mtVar;
        }

        /* renamed from: a */
        public boolean m32816a(MenuItem menuItem) {
            return this.f24612a.f24620c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$a */
    final class C5559a implements C5548a {
        /* renamed from: a */
        final /* synthetic */ mt f24613a;
        /* renamed from: b */
        private boolean f24614b;

        C5559a(mt mtVar) {
            this.f24613a = mtVar;
        }

        /* renamed from: a */
        public boolean mo5222a(nx nxVar) {
            if (this.f24613a.f24620c == null) {
                return false;
            }
            this.f24613a.f24620c.onMenuOpened(108, nxVar);
            return true;
        }

        /* renamed from: a */
        public void mo5221a(nx nxVar, boolean z) {
            if (!this.f24614b) {
                this.f24614b = true;
                this.f24613a.f24618a.mo5480n();
                if (this.f24613a.f24620c != null) {
                    this.f24613a.f24620c.onPanelClosed(108, nxVar);
                }
                this.f24614b = false;
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$b */
    final class C5560b implements C5537a {
        /* renamed from: a */
        final /* synthetic */ mt f24615a;

        C5560b(mt mtVar) {
            this.f24615a = mtVar;
        }

        /* renamed from: a */
        public boolean mo5203a(nx nxVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: a */
        public void mo5200a(nx nxVar) {
            if (this.f24615a.f24620c == null) {
                return;
            }
            if (this.f24615a.f24618a.mo5475i()) {
                this.f24615a.f24620c.onPanelClosed(108, nxVar);
            } else if (this.f24615a.f24620c.onPreparePanel(0, null, nxVar)) {
                this.f24615a.f24620c.onMenuOpened(108, nxVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$c */
    final class C5561c implements C5548a {
        /* renamed from: a */
        final /* synthetic */ mt f24616a;

        C5561c(mt mtVar) {
            this.f24616a = mtVar;
        }

        /* renamed from: a */
        public void mo5221a(nx nxVar, boolean z) {
            if (this.f24616a.f24620c != null) {
                this.f24616a.f24620c.onPanelClosed(0, nxVar);
            }
        }

        /* renamed from: a */
        public boolean mo5222a(nx nxVar) {
            if (nxVar == null && this.f24616a.f24620c != null) {
                this.f24616a.f24620c.onMenuOpened(0, nxVar);
            }
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    /* renamed from: mt$d */
    class C5562d extends np {
        /* renamed from: a */
        final /* synthetic */ mt f24617a;

        public C5562d(mt mtVar, Callback callback) {
            this.f24617a = mtVar;
            super(callback);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !this.f24617a.f24619b) {
                this.f24617a.f24618a.mo5479m();
                this.f24617a.f24619b = true;
            }
            return onPreparePanel;
        }

        public View onCreatePanelView(int i) {
            switch (i) {
                case 0:
                    Menu r = this.f24617a.f24618a.mo5484r();
                    if (onPreparePanel(i, null, r) && onMenuOpened(i, r)) {
                        return this.f24617a.m32826a(r);
                    }
            }
            return super.onCreatePanelView(i);
        }
    }

    /* renamed from: j */
    void m32845j() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0030 in list [B:12:0x002d]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.m32824k();
        r2 = r1 instanceof p000.nx;
        if (r2 == 0) goto L_0x0031;
    L_0x0009:
        r0 = r1;
        r0 = (p000.nx) r0;
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x0012;
    L_0x000f:
        r2.m33173g();
    L_0x0012:
        r1.clear();	 Catch:{ all -> 0x0033 }
        r0 = r5.f24620c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onCreatePanelMenu(r3, r1);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x0033 }
    L_0x001e:
        r0 = r5.f24620c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r4 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0033 }
        if (r0 != 0) goto L_0x002b;	 Catch:{ all -> 0x0033 }
    L_0x0028:
        r1.clear();	 Catch:{ all -> 0x0033 }
    L_0x002b:
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r2.m33174h();
    L_0x0030:
        return;
    L_0x0031:
        r2 = r0;
        goto L_0x000d;
    L_0x0033:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.m33174h();
    L_0x0039:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.j():void");
    }

    public mt(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f24618a = new qg(toolbar, false);
        this.f24620c = new C5562d(this, callback);
        this.f24618a.mo5458a(this.f24620c);
        toolbar.setOnMenuItemClickListener(this.f24626i);
        this.f24618a.mo5459a(charSequence);
    }

    /* renamed from: i */
    public Callback m32844i() {
        return this.f24620c;
    }

    /* renamed from: a */
    public void m32831a(boolean z) {
    }

    /* renamed from: a */
    public void m32827a(float f) {
        jd.h(this.f24618a.mo5452a(), f);
    }

    /* renamed from: c */
    public Context m32836c() {
        return this.f24618a.mo5462b();
    }

    /* renamed from: c */
    public void m32837c(boolean z) {
    }

    /* renamed from: b */
    public void m32833b(int i) {
        this.f24618a.mo5469d(i);
    }

    /* renamed from: d */
    public void m32838d(boolean z) {
    }

    /* renamed from: a */
    public void m32829a(Configuration configuration) {
        super.a(configuration);
    }

    /* renamed from: a */
    public void m32830a(CharSequence charSequence) {
        this.f24618a.mo5464b(charSequence);
    }

    /* renamed from: a */
    public void m32828a(int i) {
        this.f24618a.mo5464b(i != 0 ? this.f24618a.mo5462b().getText(i) : null);
    }

    /* renamed from: b */
    public void m32834b(CharSequence charSequence) {
        this.f24618a.mo5459a(charSequence);
    }

    /* renamed from: g */
    public boolean m32842g() {
        ViewGroup a = this.f24618a.mo5452a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    /* renamed from: a */
    public int m32825a() {
        return this.f24618a.mo5481o();
    }

    /* renamed from: b */
    public boolean m32835b() {
        return this.f24618a.mo5483q() == 0;
    }

    /* renamed from: e */
    public boolean m32840e() {
        this.f24618a.mo5452a().removeCallbacks(this.f24625h);
        jd.a(this.f24618a.mo5452a(), this.f24625h);
        return true;
    }

    /* renamed from: f */
    public boolean m32841f() {
        if (!this.f24618a.mo5467c()) {
            return false;
        }
        this.f24618a.mo5468d();
        return true;
    }

    /* renamed from: a */
    public boolean m32832a(int i, KeyEvent keyEvent) {
        Menu k = m32824k();
        if (k != null) {
            boolean z;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                z = true;
            } else {
                z = false;
            }
            k.setQwertyMode(z);
            k.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    /* renamed from: h */
    void m32843h() {
        this.f24618a.mo5452a().removeCallbacks(this.f24625h);
    }

    /* renamed from: e */
    public void m32839e(boolean z) {
        if (z != this.f24622e) {
            this.f24622e = z;
            int size = this.f24623f.size();
            for (int i = 0; i < size; i++) {
                ((C0507a) this.f24623f.get(i)).a(z);
            }
        }
    }

    /* renamed from: a */
    View m32826a(Menu menu) {
        m32823b(menu);
        if (menu == null || this.f24624g == null || this.f24624g.m33120d().getCount() <= 0) {
            return null;
        }
        return (View) this.f24624g.m33106a(this.f24618a.mo5452a());
    }

    /* renamed from: b */
    private void m32823b(Menu menu) {
        if (this.f24624g == null && (menu instanceof nx)) {
            nx nxVar = (nx) menu;
            Context b = this.f24618a.mo5462b();
            TypedValue typedValue = new TypedValue();
            Theme newTheme = b.getResources().newTheme();
            newTheme.setTo(b.getTheme());
            newTheme.resolveAttribute(C5568a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C5568a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C5576i.Theme_AppCompat_CompactMenu, true);
            }
            Context contextThemeWrapper = new ContextThemeWrapper(b, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.f24624g = new nv(contextThemeWrapper, C5574g.abc_list_menu_item_layout);
            this.f24624g.mo5256a(new C5561c(this));
            nxVar.m33149a(this.f24624g);
        }
    }

    /* renamed from: k */
    private Menu m32824k() {
        if (!this.f24621d) {
            this.f24618a.mo5460a(new C5559a(this), new C5560b(this));
            this.f24621d = true;
        }
        return this.f24618a.mo5484r();
    }
}
