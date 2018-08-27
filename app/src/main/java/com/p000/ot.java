package com.p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p000.mx.C5568a;
import p000.mx.C5570c;
import p000.mx.C5572e;

/* compiled from: AppCompatDrawableManager */
/* renamed from: ot */
public final class ot {
    /* renamed from: a */
    private static final Mode f24982a = Mode.SRC_IN;
    /* renamed from: b */
    private static ot f24983b;
    /* renamed from: c */
    private static final C5653b f24984c = new C5653b(6);
    /* renamed from: d */
    private static final int[] f24985d = new int[]{C5572e.abc_textfield_search_default_mtrl_alpha, C5572e.abc_textfield_default_mtrl_alpha, C5572e.abc_ab_share_pack_mtrl_alpha};
    /* renamed from: e */
    private static final int[] f24986e = new int[]{C5572e.abc_ic_commit_search_api_mtrl_alpha, C5572e.abc_seekbar_tick_mark_material, C5572e.abc_ic_menu_share_mtrl_alpha, C5572e.abc_ic_menu_copy_mtrl_am_alpha, C5572e.abc_ic_menu_cut_mtrl_alpha, C5572e.abc_ic_menu_selectall_mtrl_alpha, C5572e.abc_ic_menu_paste_mtrl_am_alpha};
    /* renamed from: f */
    private static final int[] f24987f = new int[]{C5572e.abc_textfield_activated_mtrl_alpha, C5572e.abc_textfield_search_activated_mtrl_alpha, C5572e.abc_cab_background_top_mtrl_alpha, C5572e.abc_text_cursor_material, C5572e.abc_text_select_handle_left_mtrl_dark, C5572e.abc_text_select_handle_middle_mtrl_dark, C5572e.abc_text_select_handle_right_mtrl_dark, C5572e.abc_text_select_handle_left_mtrl_light, C5572e.abc_text_select_handle_middle_mtrl_light, C5572e.abc_text_select_handle_right_mtrl_light};
    /* renamed from: g */
    private static final int[] f24988g = new int[]{C5572e.abc_popup_background_mtrl_mult, C5572e.abc_cab_background_internal_bg, C5572e.abc_menu_hardkey_panel_mtrl_mult};
    /* renamed from: h */
    private static final int[] f24989h = new int[]{C5572e.abc_tab_indicator_material, C5572e.abc_textfield_search_material};
    /* renamed from: i */
    private static final int[] f24990i = new int[]{C5572e.abc_btn_check_material, C5572e.abc_btn_radio_material};
    /* renamed from: j */
    private WeakHashMap<Context, hs<ColorStateList>> f24991j;
    /* renamed from: k */
    private hh<String, C5651c> f24992k;
    /* renamed from: l */
    private hs<String> f24993l;
    /* renamed from: m */
    private final Object f24994m = new Object();
    /* renamed from: n */
    private final WeakHashMap<Context, hm<WeakReference<ConstantState>>> f24995n = new WeakHashMap(0);
    /* renamed from: o */
    private TypedValue f24996o;
    /* renamed from: p */
    private boolean f24997p;

    /* compiled from: AppCompatDrawableManager */
    /* renamed from: ot$c */
    interface C5651c {
        /* renamed from: a */
        Drawable mo5408a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    @TargetApi(11)
    /* compiled from: AppCompatDrawableManager */
    /* renamed from: ot$a */
    static class C5652a implements C5651c {
        C5652a() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo5408a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return ax.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* compiled from: AppCompatDrawableManager */
    /* renamed from: ot$b */
    static class C5653b extends hn<Integer, PorterDuffColorFilter> {
        public C5653b(int i) {
            super(i);
        }

        /* renamed from: a */
        PorterDuffColorFilter m33346a(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(C5653b.m33345b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m33347a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(C5653b.m33345b(i, mode)), porterDuffColorFilter);
        }

        /* renamed from: b */
        private static int m33345b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* compiled from: AppCompatDrawableManager */
    /* renamed from: ot$d */
    static class C5654d implements C5651c {
        C5654d() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo5408a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return bb.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static ot m33355a() {
        if (f24983b == null) {
            f24983b = new ot();
            ot.m33360a(f24983b);
        }
        return f24983b;
    }

    /* renamed from: a */
    private static void m33360a(ot otVar) {
        if (VERSION.SDK_INT < 24) {
            otVar.m33359a("vector", new C5654d());
            if (VERSION.SDK_INT >= 11) {
                otVar.m33359a("animated-vector", new C5652a());
            }
        }
    }

    /* renamed from: a */
    public Drawable m33373a(Context context, int i) {
        return m33374a(context, i, false);
    }

    /* renamed from: a */
    Drawable m33374a(Context context, int i, boolean z) {
        m33371e(context);
        Drawable d = m33369d(context, i);
        if (d == null) {
            d = m33367c(context, i);
        }
        if (d == null) {
            d = ew.a(context, i);
        }
        if (d != null) {
            d = m33353a(context, i, z, d);
        }
        if (d != null) {
            pi.m33601b(d);
        }
        return d;
    }

    /* renamed from: a */
    public void m33376a(Context context) {
        synchronized (this.f24994m) {
            hm hmVar = (hm) this.f24995n.get(context);
            if (hmVar != null) {
                hmVar.m30597c();
            }
        }
    }

    /* renamed from: a */
    private static long m33349a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: c */
    private Drawable m33367c(Context context, int i) {
        if (this.f24996o == null) {
            this.f24996o = new TypedValue();
        }
        TypedValue typedValue = this.f24996o;
        context.getResources().getValue(i, typedValue, true);
        long a = ot.m33349a(typedValue);
        Drawable a2 = m33354a(context, a);
        if (a2 == null) {
            if (i == C5572e.abc_cab_background_top_material) {
                a2 = new LayerDrawable(new Drawable[]{m33373a(context, C5572e.abc_cab_background_internal_bg), m33373a(context, C5572e.abc_cab_background_top_mtrl_alpha)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                m33362a(context, a, a2);
            }
        }
        return a2;
    }

    /* renamed from: a */
    private Drawable m33353a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = m33377b(context, i);
        if (b != null) {
            if (pi.m33602c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = fp.g(drawable);
            fp.a(drawable, b);
            Mode a = ot.m33350a(i);
            if (a == null) {
                return drawable;
            }
            fp.a(drawable, a);
            return drawable;
        } else if (i == C5572e.abc_seekbar_track_material) {
            r0 = (LayerDrawable) drawable;
            ot.m33357a(r0.findDrawableByLayerId(16908288), qa.m33765a(context, C5568a.colorControlNormal), f24982a);
            ot.m33357a(r0.findDrawableByLayerId(16908303), qa.m33765a(context, C5568a.colorControlNormal), f24982a);
            ot.m33357a(r0.findDrawableByLayerId(16908301), qa.m33765a(context, C5568a.colorControlActivated), f24982a);
            return drawable;
        } else if (i == C5572e.abc_ratingbar_material || i == C5572e.abc_ratingbar_indicator_material || i == C5572e.abc_ratingbar_small_material) {
            r0 = (LayerDrawable) drawable;
            ot.m33357a(r0.findDrawableByLayerId(16908288), qa.m33769c(context, C5568a.colorControlNormal), f24982a);
            ot.m33357a(r0.findDrawableByLayerId(16908303), qa.m33765a(context, C5568a.colorControlActivated), f24982a);
            ot.m33357a(r0.findDrawableByLayerId(16908301), qa.m33765a(context, C5568a.colorControlActivated), f24982a);
            return drawable;
        } else if (ot.m33361a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private Drawable m33369d(Context r10, int r11) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 2;
        r7 = 1;
        r0 = r9.f24992k;
        if (r0 == 0) goto L_0x00bf;
    L_0x0007:
        r0 = r9.f24992k;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00bf;
    L_0x000f:
        r0 = r9.f24993l;
        if (r0 == 0) goto L_0x002f;
    L_0x0013:
        r0 = r9.f24993l;
        r0 = r0.m30604a(r11);
        r0 = (java.lang.String) r0;
        r2 = "appcompat_skip_skip";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x002d;
    L_0x0023:
        if (r0 == 0) goto L_0x0036;
    L_0x0025:
        r2 = r9.f24992k;
        r0 = r2.get(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        return r0;
    L_0x002f:
        r0 = new hs;
        r0.<init>();
        r9.f24993l = r0;
    L_0x0036:
        r0 = r9.f24996o;
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r9.f24996o = r0;
    L_0x0041:
        r2 = r9.f24996o;
        r0 = r10.getResources();
        r0.getValue(r11, r2, r7);
        r4 = p000.ot.m33349a(r2);
        r1 = r9.m33354a(r10, r4);
        if (r1 == 0) goto L_0x0056;
    L_0x0054:
        r0 = r1;
        goto L_0x002e;
    L_0x0056:
        r3 = r2.string;
        if (r3 == 0) goto L_0x008a;
    L_0x005a:
        r3 = r2.string;
        r3 = r3.toString();
        r6 = ".xml";
        r3 = r3.endsWith(r6);
        if (r3 == 0) goto L_0x008a;
    L_0x0068:
        r3 = r0.getXml(r11);	 Catch:{ Exception -> 0x0082 }
        r6 = android.util.Xml.asAttributeSet(r3);	 Catch:{ Exception -> 0x0082 }
    L_0x0070:
        r0 = r3.next();	 Catch:{ Exception -> 0x0082 }
        if (r0 == r8) goto L_0x0078;
    L_0x0076:
        if (r0 != r7) goto L_0x0070;
    L_0x0078:
        if (r0 == r8) goto L_0x0095;
    L_0x007a:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0082 }
        r2 = "No start tag found";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0082 }
        throw r0;	 Catch:{ Exception -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        r2 = "AppCompatDrawableManager";
        r3 = "Exception while inflating drawable";
        android.util.Log.e(r2, r3, r0);
    L_0x008a:
        r0 = r1;
    L_0x008b:
        if (r0 != 0) goto L_0x002e;
    L_0x008d:
        r1 = r9.f24993l;
        r2 = "appcompat_skip_skip";
        r1.m30611c(r11, r2);
        goto L_0x002e;
    L_0x0095:
        r0 = r3.getName();	 Catch:{ Exception -> 0x0082 }
        r7 = r9.f24993l;	 Catch:{ Exception -> 0x0082 }
        r7.m30611c(r11, r0);	 Catch:{ Exception -> 0x0082 }
        r7 = r9.f24992k;	 Catch:{ Exception -> 0x0082 }
        r0 = r7.get(r0);	 Catch:{ Exception -> 0x0082 }
        r0 = (p000.ot.C5651c) r0;	 Catch:{ Exception -> 0x0082 }
        if (r0 == 0) goto L_0x00b0;
    L_0x00a8:
        r7 = r10.getTheme();	 Catch:{ Exception -> 0x0082 }
        r1 = r0.mo5408a(r10, r3, r6, r7);	 Catch:{ Exception -> 0x0082 }
    L_0x00b0:
        if (r1 == 0) goto L_0x00bd;
    L_0x00b2:
        r0 = r2.changingConfigurations;	 Catch:{ Exception -> 0x0082 }
        r1.setChangingConfigurations(r0);	 Catch:{ Exception -> 0x0082 }
        r0 = r9.m33362a(r10, r4, r1);	 Catch:{ Exception -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00bd:
        r0 = r1;
        goto L_0x008b;
    L_0x00bf:
        r0 = r1;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private Drawable m33354a(Context r5, long r6) {
        /*
        r4 = this;
        r2 = 0;
        r3 = r4.f24994m;
        monitor-enter(r3);
        r0 = r4.f24995n;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002b }
        r0 = (p000.hm) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.m30589a(r6);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0031;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r5.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r0.m30594b(r6);	 Catch:{ all -> 0x002b }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private boolean m33362a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f24994m) {
            hm hmVar = (hm) this.f24995n.get(context);
            if (hmVar == null) {
                hmVar = new hm();
                this.f24995n.put(context, hmVar);
            }
            hmVar.m30595b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    Drawable m33375a(Context context, qh qhVar, int i) {
        Drawable d = m33369d(context, i);
        if (d == null) {
            d = qhVar.m33843a(i);
        }
        if (d != null) {
            return m33353a(context, i, false, d);
        }
        return null;
    }

    /* renamed from: a */
    static boolean m33361a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = f24982a;
        if (ot.m33364a(f24985d, i)) {
            i2 = C5568a.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (ot.m33364a(f24987f, i)) {
            i2 = C5568a.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (ot.m33364a(f24988g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == C5572e.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C5572e.abc_dialog_material_background) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (pi.m33602c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(ot.m33351a(qa.m33765a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    /* renamed from: a */
    private void m33359a(String str, C5651c c5651c) {
        if (this.f24992k == null) {
            this.f24992k = new hh();
        }
        this.f24992k.put(str, c5651c);
    }

    /* renamed from: a */
    private static boolean m33364a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static Mode m33350a(int i) {
        if (i == C5572e.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: b */
    ColorStateList m33377b(Context context, int i) {
        ColorStateList e = m33370e(context, i);
        if (e == null) {
            if (i == C5572e.abc_edit_text_material) {
                e = na.m32936a(context, C5570c.abc_tint_edittext);
            } else if (i == C5572e.abc_switch_track_mtrl_alpha) {
                e = na.m32936a(context, C5570c.abc_tint_switch_track);
            } else if (i == C5572e.abc_switch_thumb_material) {
                e = na.m32936a(context, C5570c.abc_tint_switch_thumb);
            } else if (i == C5572e.abc_btn_default_mtrl_shape) {
                e = m33365b(context);
            } else if (i == C5572e.abc_btn_borderless_material) {
                e = m33366c(context);
            } else if (i == C5572e.abc_btn_colored_material) {
                e = m33368d(context);
            } else if (i == C5572e.abc_spinner_mtrl_am_alpha || i == C5572e.abc_spinner_textfield_background_material) {
                e = na.m32936a(context, C5570c.abc_tint_spinner);
            } else if (ot.m33364a(f24986e, i)) {
                e = qa.m33768b(context, C5568a.colorControlNormal);
            } else if (ot.m33364a(f24989h, i)) {
                e = na.m32936a(context, C5570c.abc_tint_default);
            } else if (ot.m33364a(f24990i, i)) {
                e = na.m32936a(context, C5570c.abc_tint_btn_checkable);
            } else if (i == C5572e.abc_seekbar_thumb_material) {
                e = na.m32936a(context, C5570c.abc_tint_seek_thumb);
            }
            if (e != null) {
                m33356a(context, i, e);
            }
        }
        return e;
    }

    /* renamed from: e */
    private ColorStateList m33370e(Context context, int i) {
        if (this.f24991j == null) {
            return null;
        }
        hs hsVar = (hs) this.f24991j.get(context);
        if (hsVar != null) {
            return (ColorStateList) hsVar.m30604a(i);
        }
        return null;
    }

    /* renamed from: a */
    private void m33356a(Context context, int i, ColorStateList colorStateList) {
        if (this.f24991j == null) {
            this.f24991j = new WeakHashMap();
        }
        hs hsVar = (hs) this.f24991j.get(context);
        if (hsVar == null) {
            hsVar = new hs();
            this.f24991j.put(context, hsVar);
        }
        hsVar.m30611c(i, colorStateList);
    }

    /* renamed from: b */
    private ColorStateList m33365b(Context context) {
        return m33372f(context, qa.m33765a(context, C5568a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m33366c(Context context) {
        return m33372f(context, 0);
    }

    /* renamed from: d */
    private ColorStateList m33368d(Context context) {
        return m33372f(context, qa.m33765a(context, C5568a.colorAccent));
    }

    /* renamed from: f */
    private ColorStateList m33372f(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int a = qa.m33765a(context, C5568a.colorControlHighlight);
        int c = qa.m33769c(context, C5568a.colorButtonNormal);
        r0[0] = qa.f25182a;
        r1[0] = c;
        r0[1] = qa.f25185d;
        r1[1] = fo.m30183a(a, i);
        r0[2] = qa.f25183b;
        r1[2] = fo.m30183a(a, i);
        r0[3] = qa.f25189h;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    /* renamed from: a */
    static void m33358a(Drawable drawable, qd qdVar, int[] iArr) {
        if (!pi.m33602c(drawable) || drawable.mutate() == drawable) {
            if (qdVar.f25199d || qdVar.f25198c) {
                drawable.setColorFilter(ot.m33352a(qdVar.f25199d ? qdVar.f25196a : null, qdVar.f25198c ? qdVar.f25197b : f24982a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m33352a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return ot.m33351a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m33351a(int i, Mode mode) {
        PorterDuffColorFilter a = f24984c.m33346a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        f24984c.m33347a(i, mode, a);
        return a;
    }

    /* renamed from: a */
    private static void m33357a(Drawable drawable, int i, Mode mode) {
        if (pi.m33602c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f24982a;
        }
        drawable.setColorFilter(ot.m33351a(i, mode));
    }

    /* renamed from: e */
    private void m33371e(Context context) {
        if (!this.f24997p) {
            this.f24997p = true;
            Drawable a = m33373a(context, C5572e.abc_vector_test);
            if (a == null || !ot.m33363a(a)) {
                this.f24997p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    private static boolean m33363a(Drawable drawable) {
        return (drawable instanceof bb) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
