package com.p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"NewApi"})
/* compiled from: AnimatedVectorDrawableCompat */
/* renamed from: ax */
public class ax extends ba implements aw {
    /* renamed from: a */
    final Callback f4813a;
    /* renamed from: c */
    private C0863a f4814c;
    /* renamed from: d */
    private Context f4815d;
    /* renamed from: e */
    private ArgbEvaluator f4816e;
    /* renamed from: f */
    private AnimatorListener f4817f;
    /* renamed from: g */
    private ArrayList<Object> f4818g;

    /* compiled from: AnimatedVectorDrawableCompat */
    /* renamed from: ax$1 */
    class C08621 implements Callback {
        /* renamed from: a */
        final /* synthetic */ ax f4805a;

        C08621(ax axVar) {
            this.f4805a = axVar;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f4805a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f4805a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f4805a.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    /* renamed from: ax$a */
    static class C0863a extends ConstantState {
        /* renamed from: a */
        int f4806a;
        /* renamed from: b */
        bb f4807b;
        /* renamed from: c */
        AnimatorSet f4808c;
        /* renamed from: d */
        hh<Animator, String> f4809d;
        /* renamed from: e */
        private ArrayList<Animator> f4810e;

        public C0863a(Context context, C0863a c0863a, Callback callback, Resources resources) {
            int i = 0;
            if (c0863a != null) {
                this.f4806a = c0863a.f4806a;
                if (c0863a.f4807b != null) {
                    ConstantState constantState = c0863a.f4807b.getConstantState();
                    if (resources != null) {
                        this.f4807b = (bb) constantState.newDrawable(resources);
                    } else {
                        this.f4807b = (bb) constantState.newDrawable();
                    }
                    this.f4807b = (bb) this.f4807b.mutate();
                    this.f4807b.setCallback(callback);
                    this.f4807b.setBounds(c0863a.f4807b.getBounds());
                    this.f4807b.m7122a(false);
                }
                if (c0863a.f4810e != null) {
                    int size = c0863a.f4810e.size();
                    this.f4810e = new ArrayList(size);
                    this.f4809d = new hh(size);
                    while (i < size) {
                        Animator animator = (Animator) c0863a.f4810e.get(i);
                        Animator clone = animator.clone();
                        String str = (String) c0863a.f4809d.get(animator);
                        clone.setTarget(this.f4807b.m7121a(str));
                        this.f4810e.add(clone);
                        this.f4809d.put(clone, str);
                        i++;
                    }
                    m6258a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f4806a;
        }

        /* renamed from: a */
        public void m6258a() {
            if (this.f4808c == null) {
                this.f4808c = new AnimatorSet();
            }
            this.f4808c.playTogether(this.f4810e);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    /* renamed from: ax$b */
    static class C0864b extends ConstantState {
        /* renamed from: a */
        private final ConstantState f4811a;

        public C0864b(ConstantState constantState) {
            this.f4811a = constantState;
        }

        public Drawable newDrawable() {
            Drawable axVar = new ax();
            axVar.b = this.f4811a.newDrawable();
            axVar.b.setCallback(axVar.f4813a);
            return axVar;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable axVar = new ax();
            axVar.b = this.f4811a.newDrawable(resources);
            axVar.b.setCallback(axVar.f4813a);
            return axVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable axVar = new ax();
            axVar.b = this.f4811a.newDrawable(resources, theme);
            axVar.b.setCallback(axVar.f4813a);
            return axVar;
        }

        public boolean canApplyTheme() {
            return this.f4811a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4811a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    ax() {
        this(null, null, null);
    }

    private ax(Context context) {
        this(context, null, null);
    }

    private ax(Context context, C0863a c0863a, Resources resources) {
        this.f4816e = null;
        this.f4817f = null;
        this.f4818g = null;
        this.f4813a = new C08621(this);
        this.f4815d = context;
        if (c0863a != null) {
            this.f4814c = c0863a;
        } else {
            this.f4814c = new C0863a(context, c0863a, this.f4813a, resources);
        }
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static ax m6260a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        ax axVar = new ax(context);
        axVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return axVar;
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new C0864b(this.b.getConstantState());
        }
        return null;
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4814c.f4806a;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f4814c.f4807b.draw(canvas);
        if (this.f4814c.f4808c.isStarted()) {
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f4814c.f4807b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return this.f4814c.f4807b.setState(iArr);
    }

    protected boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.f4814c.f4807b.setLevel(i);
    }

    public int getAlpha() {
        if (this.b != null) {
            return fp.m21155c(this.b);
        }
        return this.f4814c.f4807b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f4814c.f4807b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f4814c.f4807b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.b != null) {
            fp.m21146a(this.b, i);
        } else {
            this.f4814c.f4807b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            fp.m21148a(this.b, colorStateList);
        } else {
            this.f4814c.f4807b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            fp.m21151a(this.b, mode);
        } else {
            this.f4814c.f4807b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f4814c.f4807b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return this.f4814c.f4807b.isStateful();
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return this.f4814c.f4807b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return this.f4814c.f4807b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return this.f4814c.f4807b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return fp.m21153b(this.b);
        }
        return this.f4814c.f4807b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            this.b.setAutoMirrored(z);
        } else {
            this.f4814c.f4807b.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.b != null) {
            fp.m21150a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray a;
                if ("animated-vector".equals(name)) {
                    a = ba.m6259a(resources, theme, attributeSet, av.f4645e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        bb a2 = bb.m7115a(resources, resourceId, theme);
                        a2.m7122a(false);
                        a2.setCallback(this.f4813a);
                        if (this.f4814c.f4807b != null) {
                            this.f4814c.f4807b.setCallback(null);
                        }
                        this.f4814c.f4807b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, av.f4646f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f4815d != null) {
                            m6262a(string, AnimatorInflater.loadAnimator(this.f4815d, resourceId2));
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4814c.m6258a();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            fp.m21149a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            return fp.m21156d(this.b);
        }
        return false;
    }

    /* renamed from: a */
    private void m6261a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m6261a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4816e == null) {
                    this.f4816e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4816e);
            }
        }
    }

    /* renamed from: a */
    private void m6262a(String str, Animator animator) {
        animator.setTarget(this.f4814c.f4807b.m7121a(str));
        if (VERSION.SDK_INT < 21) {
            m6261a(animator);
        }
        if (this.f4814c.f4810e == null) {
            this.f4814c.f4810e = new ArrayList();
            this.f4814c.f4809d = new hh();
        }
        this.f4814c.f4810e.add(animator);
        this.f4814c.f4809d.put(animator, str);
    }

    public boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        return this.f4814c.f4808c.isRunning();
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f4814c.f4808c.isStarted()) {
            this.f4814c.f4808c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f4814c.f4808c.end();
        }
    }
}
