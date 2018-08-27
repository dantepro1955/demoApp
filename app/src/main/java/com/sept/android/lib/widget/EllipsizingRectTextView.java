package com.sept.android.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p000.dke;
import p000.dke.C4947a;

public class EllipsizingRectTextView extends TextView {
    /* renamed from: a */
    private static final Pattern f19436a = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    /* renamed from: k */
    private static int f19437k = 0;
    /* renamed from: b */
    private final List<C4431a> f19438b;
    /* renamed from: c */
    private boolean f19439c;
    /* renamed from: d */
    private boolean f19440d;
    /* renamed from: e */
    private boolean f19441e;
    /* renamed from: f */
    private String f19442f;
    /* renamed from: g */
    private String f19443g;
    /* renamed from: h */
    private int f19444h;
    /* renamed from: i */
    private float f19445i;
    /* renamed from: j */
    private float f19446j;
    /* renamed from: l */
    private int f19447l;
    /* renamed from: m */
    private Layout f19448m;
    /* renamed from: n */
    private dke f19449n;
    /* renamed from: o */
    private Pattern f19450o;

    /* renamed from: com.sept.android.lib.widget.EllipsizingRectTextView$a */
    public interface C4431a {
        /* renamed from: a */
        void m23825a(boolean z);
    }

    public EllipsizingRectTextView(Context context) {
        this(context, null);
    }

    public EllipsizingRectTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingRectTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19438b = new ArrayList();
        this.f19445i = 1.0f;
        this.f19446j = 0.0f;
        this.f19447l = 0;
        super.setEllipsize(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, MoPubClientPositioning.NO_REPEAT));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(f19436a);
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.f19450o = pattern;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f19444h = i;
        this.f19440d = true;
    }

    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.f19444h;
    }

    /* renamed from: a */
    public boolean m23833a() {
        return this.f19444h == MoPubClientPositioning.NO_REPEAT;
    }

    public void setLineSpacing(float f, float f2) {
        this.f19446j = f;
        this.f19445i = f2;
        super.setLineSpacing(f, f2);
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f19441e) {
            this.f19442f = charSequence.toString();
            this.f19440d = true;
            m23829c();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (m23833a()) {
            this.f19440d = true;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (m23833a()) {
            this.f19440d = true;
        }
    }

    protected void onDraw(Canvas canvas) {
        if (m23835b()) {
            m23827a(canvas);
            return;
        }
        if (this.f19440d) {
            m23829c();
        }
        super.onDraw(canvas);
    }

    private void setEllipsizedText(String str) {
        if (str == null) {
            str = "";
        }
        if (this.f19443g != null) {
            onTextChanged(str, 0, this.f19443g.length(), str.length());
        } else {
            onTextChanged(str, 0, 0, str.length());
        }
        this.f19443g = str;
    }

    private String getEllipsizedText() {
        return this.f19443g;
    }

    public void setCacheProvider(dke dke) {
        this.f19449n = dke;
    }

    /* renamed from: a */
    protected C4947a m23830a(String str) {
        if (this.f19449n != null) {
            return this.f19449n.m27689a(str);
        }
        return null;
    }

    /* renamed from: a */
    protected void m23832a(String str, C4947a c4947a) {
        if (this.f19449n != null) {
            this.f19449n.m27690a(str, c4947a);
        }
    }

    private void setTextLayout(C4947a c4947a) {
        if (!(c4947a.f21837b == null || c4947a.f21837b.equals(getEllipsizedText()))) {
            this.f19441e = true;
            try {
                setEllipsizedText(c4947a.f21837b);
            } finally {
                this.f19441e = false;
            }
        }
        this.f19440d = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public p000.dke.C4947a m23834b(String r11) {
        /*
        r10 = this;
        r2 = 0;
        r0 = r10.m23828c(r11);
        r4 = r10.getLinesCount();
        r0 = r0.getLineCount();
        if (r0 <= r4) goto L_0x00e5;
    L_0x000f:
        r5 = 5;
        r3 = r11.length();
        r6 = r3 / r0;
        r7 = r6 * 3;
        r1 = r2;
        r0 = r2;
    L_0x001a:
        if (r1 >= r3) goto L_0x002b;
    L_0x001c:
        r8 = r11.charAt(r1);
        r9 = 10;
        if (r8 == r9) goto L_0x0028;
    L_0x0024:
        r9 = 13;
        if (r8 != r9) goto L_0x00cb;
    L_0x0028:
        r0 = r0 + r6;
    L_0x0029:
        if (r0 <= r7) goto L_0x00cf;
    L_0x002b:
        r0 = java.lang.Math.min(r0, r3);
        r1 = r11.substring(r2, r0);
    L_0x0033:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r6 = r6.append(r1);
        r7 = "…";
        r6 = r6.append(r7);
        r6 = r6.toString();
        r6 = r10.m23828c(r6);
        r6 = r6.getLineCount();
        if (r6 > r4) goto L_0x0055;
    L_0x0050:
        r0 = r0 + r5;
        if (r0 <= r3) goto L_0x00d3;
    L_0x0053:
        r0 = r3;
        r1 = r11;
    L_0x0055:
        if (r0 < 0) goto L_0x0074;
    L_0x0057:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5 = r5.append(r1);
        r6 = "…";
        r5 = r5.append(r6);
        r5 = r5.toString();
        r5 = r10.m23828c(r5);
        r5 = r5.getLineCount();
        if (r5 > r4) goto L_0x00d9;
    L_0x0074:
        r5 = r0 + 3;
        if (r5 >= r3) goto L_0x00e3;
    L_0x0078:
        r0 = r0 + 3;
        r0 = r11.substring(r2, r0);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2 = r2.append(r0);
        r3 = "…";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = r10.m23828c(r2);
        r2 = r2.getLineCount();
        if (r2 > r4) goto L_0x00e3;
    L_0x009b:
        r1 = r10.f19450o;
        r0 = r1.matcher(r0);
        r1 = "";
        r0 = r0.replaceFirst(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = "…";
        r0 = r0.append(r1);
        r1 = r0.toString();
        r0 = 1;
    L_0x00bb:
        r2 = r10.m23835b();
        if (r2 == 0) goto L_0x00e1;
    L_0x00c1:
        r2 = r10.m23828c(r1);
    L_0x00c5:
        r3 = new dke$a;
        r3.<init>(r11, r1, r0, r2);
        return r3;
    L_0x00cb:
        r0 = r0 + 1;
        goto L_0x0029;
    L_0x00cf:
        r1 = r1 + 1;
        goto L_0x001a;
    L_0x00d3:
        r1 = r11.substring(r2, r0);
        goto L_0x0033;
    L_0x00d9:
        r1 = r11.substring(r2, r0);
        r0 = r0 + -2;
        goto L_0x0055;
    L_0x00e1:
        r2 = 0;
        goto L_0x00c5;
    L_0x00e3:
        r0 = r1;
        goto L_0x009b;
    L_0x00e5:
        r0 = r2;
        r1 = r11;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sept.android.lib.widget.EllipsizingRectTextView.b(java.lang.String):dke$a");
    }

    /* renamed from: c */
    private C4947a m23829c() {
        return m23826a(true);
    }

    /* renamed from: a */
    private C4947a m23826a(boolean z) {
        if (getWidth() == 0) {
            return null;
        }
        System.currentTimeMillis();
        C4947a a = m23830a(this.f19442f);
        if (a == null) {
            a = m23834b(this.f19442f);
            m23832a(this.f19442f, a);
        }
        if (z) {
            setTextLayout(a);
        }
        this.f19440d = false;
        if (a.f21838c != this.f19439c) {
            this.f19439c = a.f21838c;
            for (C4431a a2 : this.f19438b) {
                a2.m23825a(this.f19439c);
            }
        }
        return a;
    }

    private int getLinesCount() {
        if (!m23833a()) {
            return this.f19444h;
        }
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / m23828c("").getLineBottom(0);
    }

    /* renamed from: c */
    private Layout m23828c(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Alignment.ALIGN_NORMAL, this.f19445i, this.f19446j, false);
    }

    public void setEllipsize(TruncateAt truncateAt) {
    }

    protected void onMeasure(int i, int i2) {
        if (m23835b()) {
            m23831a(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: b */
    protected boolean m23835b() {
        return true;
    }

    public void setTextLayout(Layout layout) {
        this.f19448m = layout;
        requestLayout();
    }

    /* renamed from: a */
    protected void m23831a(int i, int i2) {
        System.currentTimeMillis();
        super.onMeasure(i, i2);
        if (this.f19448m != null) {
            setMeasuredDimension((getPaddingLeft() + getPaddingRight()) + this.f19448m.getWidth(), (getPaddingTop() + getPaddingBottom()) + this.f19448m.getHeight());
        }
        System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m23827a(Canvas canvas) {
        System.currentTimeMillis();
        super.onDraw(canvas);
        canvas.save();
        if (this.f19448m != null) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.f19448m.getPaint().setColor(getCurrentTextColor());
            this.f19448m.draw(canvas);
        }
        canvas.restore();
        System.currentTimeMillis();
    }
}
