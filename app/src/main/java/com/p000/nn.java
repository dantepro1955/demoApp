package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p000.mx.C5577j;

/* compiled from: SupportMenuInflater */
/* renamed from: nn */
public class nn extends MenuInflater {
    /* renamed from: a */
    static final Class<?>[] f24753a = new Class[]{Context.class};
    /* renamed from: b */
    static final Class<?>[] f24754b = f24753a;
    /* renamed from: c */
    final Object[] f24755c;
    /* renamed from: d */
    final Object[] f24756d = this.f24755c;
    /* renamed from: e */
    Context f24757e;
    /* renamed from: f */
    private Object f24758f;

    /* compiled from: SupportMenuInflater */
    /* renamed from: nn$a */
    static class C5585a implements OnMenuItemClickListener {
        /* renamed from: a */
        private static final Class<?>[] f24724a = new Class[]{MenuItem.class};
        /* renamed from: b */
        private Object f24725b;
        /* renamed from: c */
        private Method f24726c;

        public C5585a(Object obj, String str) {
            this.f24725b = obj;
            Class cls = obj.getClass();
            try {
                this.f24726c = cls.getMethod(str, f24724a);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f24726c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f24726c.invoke(this.f24725b, new Object[]{menuItem})).booleanValue();
                }
                this.f24726c.invoke(this.f24725b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    /* renamed from: nn$b */
    class C5586b {
        /* renamed from: a */
        hx f24727a;
        /* renamed from: b */
        final /* synthetic */ nn f24728b;
        /* renamed from: c */
        private Menu f24729c;
        /* renamed from: d */
        private int f24730d;
        /* renamed from: e */
        private int f24731e;
        /* renamed from: f */
        private int f24732f;
        /* renamed from: g */
        private int f24733g;
        /* renamed from: h */
        private boolean f24734h;
        /* renamed from: i */
        private boolean f24735i;
        /* renamed from: j */
        private boolean f24736j;
        /* renamed from: k */
        private int f24737k;
        /* renamed from: l */
        private int f24738l;
        /* renamed from: m */
        private CharSequence f24739m;
        /* renamed from: n */
        private CharSequence f24740n;
        /* renamed from: o */
        private int f24741o;
        /* renamed from: p */
        private char f24742p;
        /* renamed from: q */
        private char f24743q;
        /* renamed from: r */
        private int f24744r;
        /* renamed from: s */
        private boolean f24745s;
        /* renamed from: t */
        private boolean f24746t;
        /* renamed from: u */
        private boolean f24747u;
        /* renamed from: v */
        private int f24748v;
        /* renamed from: w */
        private int f24749w;
        /* renamed from: x */
        private String f24750x;
        /* renamed from: y */
        private String f24751y;
        /* renamed from: z */
        private String f24752z;

        public C5586b(nn nnVar, Menu menu) {
            this.f24728b = nnVar;
            this.f24729c = menu;
            m32990a();
        }

        /* renamed from: a */
        public void m32990a() {
            this.f24730d = 0;
            this.f24731e = 0;
            this.f24732f = 0;
            this.f24733g = 0;
            this.f24734h = true;
            this.f24735i = true;
        }

        /* renamed from: a */
        public void m32991a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f24728b.f24757e.obtainStyledAttributes(attributeSet, C5577j.MenuGroup);
            this.f24730d = obtainStyledAttributes.getResourceId(C5577j.MenuGroup_android_id, 0);
            this.f24731e = obtainStyledAttributes.getInt(C5577j.MenuGroup_android_menuCategory, 0);
            this.f24732f = obtainStyledAttributes.getInt(C5577j.MenuGroup_android_orderInCategory, 0);
            this.f24733g = obtainStyledAttributes.getInt(C5577j.MenuGroup_android_checkableBehavior, 0);
            this.f24734h = obtainStyledAttributes.getBoolean(C5577j.MenuGroup_android_visible, true);
            this.f24735i = obtainStyledAttributes.getBoolean(C5577j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void m32993b(AttributeSet attributeSet) {
            boolean z = true;
            TypedArray obtainStyledAttributes = this.f24728b.f24757e.obtainStyledAttributes(attributeSet, C5577j.MenuItem);
            this.f24737k = obtainStyledAttributes.getResourceId(C5577j.MenuItem_android_id, 0);
            this.f24738l = (obtainStyledAttributes.getInt(C5577j.MenuItem_android_menuCategory, this.f24731e) & -65536) | (obtainStyledAttributes.getInt(C5577j.MenuItem_android_orderInCategory, this.f24732f) & 65535);
            this.f24739m = obtainStyledAttributes.getText(C5577j.MenuItem_android_title);
            this.f24740n = obtainStyledAttributes.getText(C5577j.MenuItem_android_titleCondensed);
            this.f24741o = obtainStyledAttributes.getResourceId(C5577j.MenuItem_android_icon, 0);
            this.f24742p = m32987a(obtainStyledAttributes.getString(C5577j.MenuItem_android_alphabeticShortcut));
            this.f24743q = m32987a(obtainStyledAttributes.getString(C5577j.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C5577j.MenuItem_android_checkable)) {
                this.f24744r = obtainStyledAttributes.getBoolean(C5577j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f24744r = this.f24733g;
            }
            this.f24745s = obtainStyledAttributes.getBoolean(C5577j.MenuItem_android_checked, false);
            this.f24746t = obtainStyledAttributes.getBoolean(C5577j.MenuItem_android_visible, this.f24734h);
            this.f24747u = obtainStyledAttributes.getBoolean(C5577j.MenuItem_android_enabled, this.f24735i);
            this.f24748v = obtainStyledAttributes.getInt(C5577j.MenuItem_showAsAction, -1);
            this.f24752z = obtainStyledAttributes.getString(C5577j.MenuItem_android_onClick);
            this.f24749w = obtainStyledAttributes.getResourceId(C5577j.MenuItem_actionLayout, 0);
            this.f24750x = obtainStyledAttributes.getString(C5577j.MenuItem_actionViewClass);
            this.f24751y = obtainStyledAttributes.getString(C5577j.MenuItem_actionProviderClass);
            if (this.f24751y == null) {
                z = false;
            }
            if (z && this.f24749w == 0 && this.f24750x == null) {
                this.f24727a = (hx) m32988a(this.f24751y, nn.f24754b, this.f24728b.f24756d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f24727a = null;
            }
            obtainStyledAttributes.recycle();
            this.f24736j = false;
        }

        /* renamed from: a */
        private char m32987a(String str) {
            if (str == null) {
                return '\u0000';
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m32989a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f24745s).setVisible(this.f24746t).setEnabled(this.f24747u).setCheckable(this.f24744r >= 1).setTitleCondensed(this.f24740n).setIcon(this.f24741o).setAlphabeticShortcut(this.f24742p).setNumericShortcut(this.f24743q);
            if (this.f24748v >= 0) {
                il.m30808a(menuItem, this.f24748v);
            }
            if (this.f24752z != null) {
                if (this.f24728b.f24757e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C5585a(this.f24728b.m32998a(), this.f24752z));
            }
            if (menuItem instanceof nz) {
                nz nzVar = (nz) menuItem;
            }
            if (this.f24744r >= 2) {
                if (menuItem instanceof nz) {
                    ((nz) menuItem).a(true);
                } else if (menuItem instanceof oa) {
                    ((oa) menuItem).m33201a(true);
                }
            }
            if (this.f24750x != null) {
                il.m30805a(menuItem, (View) m32988a(this.f24750x, nn.f24753a, this.f24728b.f24755c));
            } else {
                z = false;
            }
            if (this.f24749w > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    il.m30809b(menuItem, this.f24749w);
                }
            }
            if (this.f24727a != null) {
                il.m30806a(menuItem, this.f24727a);
            }
        }

        /* renamed from: b */
        public void m32992b() {
            this.f24736j = true;
            m32989a(this.f24729c.add(this.f24730d, this.f24737k, this.f24738l, this.f24739m));
        }

        /* renamed from: c */
        public SubMenu m32994c() {
            this.f24736j = true;
            SubMenu addSubMenu = this.f24729c.addSubMenu(this.f24730d, this.f24737k, this.f24738l, this.f24739m);
            m32989a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m32995d() {
            return this.f24736j;
        }

        /* renamed from: a */
        private <T> T m32988a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = this.f24728b.f24757e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }

    public nn(Context context) {
        super(context);
        this.f24757e = context;
        this.f24755c = new Object[]{context};
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof gc) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f24757e.getResources().getLayout(i);
                m32997a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m32997a(org.xmlpull.v1.XmlPullParser r11, AttributeSet r12, Menu r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        r10 = this;
        r4 = 0;
        r1 = 1;
        r6 = 0;
        r7 = new nn$b;
        r7.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x000c:
        r2 = 2;
        if (r0 != r2) goto L_0x004a;
    L_0x000f:
        r0 = r11.getName();
        r2 = "menu";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x001b:
        r0 = r11.next();
    L_0x001f:
        r2 = r4;
        r5 = r6;
        r3 = r0;
        r0 = r6;
    L_0x0023:
        if (r0 != 0) goto L_0x00dd;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x00d5;
            case 2: goto L_0x0051;
            case 3: goto L_0x0087;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5;
    L_0x0029:
        r5 = r11.next();
        r9 = r3;
        r3 = r5;
        r5 = r9;
        goto L_0x0023;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Expecting menu, got ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        r0 = r11.next();
        if (r0 != r1) goto L_0x000c;
    L_0x0050:
        goto L_0x001f;
    L_0x0051:
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r3 = r5;
        goto L_0x0029;
    L_0x0055:
        r3 = r11.getName();
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0066;
    L_0x0061:
        r7.m32991a(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0066:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0073;
    L_0x006e:
        r7.m32993b(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0073:
        r8 = "menu";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0084;
    L_0x007b:
        r3 = r7.m32994c();
        r10.m32997a(r11, r12, r3);
        r3 = r5;
        goto L_0x0029;
    L_0x0084:
        r2 = r3;
        r3 = r1;
        goto L_0x0029;
    L_0x0087:
        r3 = r11.getName();
        if (r5 == 0) goto L_0x0096;
    L_0x008d:
        r8 = r3.equals(r2);
        if (r8 == 0) goto L_0x0096;
    L_0x0093:
        r2 = r4;
        r3 = r6;
        goto L_0x0029;
    L_0x0096:
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00a3;
    L_0x009e:
        r7.m32990a();
        r3 = r5;
        goto L_0x0029;
    L_0x00a3:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00c9;
    L_0x00ab:
        r3 = r7.m32995d();
        if (r3 != 0) goto L_0x0028;
    L_0x00b1:
        r3 = r7.f24727a;
        if (r3 == 0) goto L_0x00c3;
    L_0x00b5:
        r3 = r7.f24727a;
        r3 = r3.mo5284e();
        if (r3 == 0) goto L_0x00c3;
    L_0x00bd:
        r7.m32994c();
        r3 = r5;
        goto L_0x0029;
    L_0x00c3:
        r7.m32992b();
        r3 = r5;
        goto L_0x0029;
    L_0x00c9:
        r8 = "menu";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x0028;
    L_0x00d1:
        r0 = r1;
        r3 = r5;
        goto L_0x0029;
    L_0x00d5:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x00dd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a */
    Object m32998a() {
        if (this.f24758f == null) {
            this.f24758f = m32996a(this.f24757e);
        }
        return this.f24758f;
    }

    /* renamed from: a */
    private Object m32996a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return m32996a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }
}
