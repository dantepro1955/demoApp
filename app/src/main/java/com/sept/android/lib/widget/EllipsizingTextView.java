package com.sept.android.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EllipsizingTextView extends TextView {
    /* renamed from: a */
    private static final Pattern f19451a = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    /* renamed from: j */
    private static int f19452j = 0;
    /* renamed from: b */
    private final List<C4432a> f19453b;
    /* renamed from: c */
    private boolean f19454c;
    /* renamed from: d */
    private boolean f19455d;
    /* renamed from: e */
    private boolean f19456e;
    /* renamed from: f */
    private String f19457f;
    /* renamed from: g */
    private int f19458g;
    /* renamed from: h */
    private float f19459h;
    /* renamed from: i */
    private float f19460i;
    /* renamed from: k */
    private Pattern f19461k;

    /* renamed from: com.sept.android.lib.widget.EllipsizingTextView$a */
    public interface C4432a {
        /* renamed from: a */
        void m23836a(boolean z);
    }

    public EllipsizingTextView(Context context) {
        this(context, null);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19453b = new ArrayList();
        this.f19459h = 1.0f;
        this.f19460i = 0.0f;
        super.setEllipsize(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, MoPubClientPositioning.NO_REPEAT));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(f19451a);
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.f19461k = pattern;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f19458g = i;
        this.f19455d = true;
    }

    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.f19458g;
    }

    /* renamed from: a */
    public boolean m23840a() {
        return this.f19458g == MoPubClientPositioning.NO_REPEAT;
    }

    public void setLineSpacing(float f, float f2) {
        this.f19460i = f;
        this.f19459h = f2;
        super.setLineSpacing(f, f2);
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f19456e) {
            this.f19457f = charSequence.toString();
            this.f19455d = true;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (m23840a()) {
            this.f19455d = true;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (m23840a()) {
            this.f19455d = true;
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.f19455d) {
            m23838b();
        }
        super.onDraw(canvas);
    }

    /* renamed from: b */
    private void m23838b() {
        boolean z;
        CharSequence charSequence = this.f19457f;
        Layout a = m23837a(charSequence);
        int linesCount = getLinesCount();
        if (a.getLineCount() > linesCount) {
            charSequence = this.f19457f.substring(0, a.getLineEnd(linesCount - 1)).trim();
            while (m23837a(charSequence + "…").getLineCount() > linesCount) {
                int lastIndexOf = charSequence.lastIndexOf(32);
                if (lastIndexOf == -1) {
                    break;
                }
                charSequence = charSequence.substring(0, lastIndexOf);
            }
            charSequence = this.f19461k.matcher(charSequence).replaceFirst("") + "…";
            z = true;
        } else {
            z = false;
        }
        if (!charSequence.equals(getText())) {
            this.f19456e = true;
            try {
                setText(charSequence);
            } finally {
                this.f19456e = false;
            }
        }
        this.f19455d = false;
        if (z != this.f19454c) {
            this.f19454c = z;
            for (C4432a a2 : this.f19453b) {
                a2.m23836a(z);
            }
        }
    }

    private int getLinesCount() {
        if (!m23840a()) {
            return this.f19458g;
        }
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / m23837a("").getLineBottom(0);
    }

    /* renamed from: a */
    private Layout m23837a(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Alignment.ALIGN_NORMAL, this.f19459h, this.f19460i, false);
    }

    public void setEllipsize(TruncateAt truncateAt) {
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (f19452j != 0 || getMeasuredWidth() <= 0) {
            setMaxLines(f19452j);
        } else {
            f19452j = m23839a(getPaint(), getTypeface(), getMeasuredWidth());
            setMaxLines(f19452j);
        }
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    /* renamed from: a */
    public int m23839a(TextPaint textPaint, Typeface typeface, int i) {
        TextPaint textPaint2 = new TextPaint();
        textPaint2.set(textPaint);
        textPaint2.setTextSize(getTextSize());
        textPaint2.setTypeface(typeface);
        int height = i / new StaticLayout("a", textPaint2, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
        if (height > 2) {
            return height - 2;
        }
        return height;
    }
}
