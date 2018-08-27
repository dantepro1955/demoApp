package com.p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import p000.mx.C5577j;

/* compiled from: AppCompatViewInflater */
/* renamed from: mr */
class mr {
    /* renamed from: a */
    private static final Class<?>[] f24598a = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: b */
    private static final int[] f24599b = new int[]{16843375};
    /* renamed from: c */
    private static final String[] f24600c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f24601d = new hh();
    /* renamed from: e */
    private final Object[] f24602e = new Object[2];

    /* compiled from: AppCompatViewInflater */
    /* renamed from: mr$a */
    static class C5556a implements OnClickListener {
        /* renamed from: a */
        private final View f24594a;
        /* renamed from: b */
        private final String f24595b;
        /* renamed from: c */
        private Method f24596c;
        /* renamed from: d */
        private Context f24597d;

        public C5556a(View view, String str) {
            this.f24594a = view;
            this.f24595b = str;
        }

        public void onClick(View view) {
            if (this.f24596c == null) {
                m32805a(this.f24594a.getContext(), this.f24595b);
            }
            try {
                this.f24596c.invoke(this.f24597d, new Object[]{view});
            } catch (Throwable e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (Throwable e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        private void m32805a(Context context, String str) {
            String str2;
            Context context2 = context;
            while (context2 != null) {
                try {
                    if (!context2.isRestricted()) {
                        Method method = context2.getClass().getMethod(this.f24595b, new Class[]{View.class});
                        if (method != null) {
                            this.f24596c = method;
                            this.f24597d = context2;
                            return;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    context2 = null;
                }
            }
            int id = this.f24594a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f24594a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f24595b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f24594a.getClass() + str2);
        }
    }

    mr() {
    }

    /* renamed from: a */
    public final View m32810a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = mr.m32806a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = qc.m33772a(context2);
        }
        View view3 = null;
        Object obj = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    obj = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    obj = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    obj = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    obj = null;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    obj = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    obj = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    obj = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    obj = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    obj = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    obj = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    obj = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    obj = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                view3 = new AppCompatTextView(context2, attributeSet);
                break;
            case 1:
                view3 = new AppCompatImageView(context2, attributeSet);
                break;
            case 2:
                view3 = new AppCompatButton(context2, attributeSet);
                break;
            case 3:
                view3 = new AppCompatEditText(context2, attributeSet);
                break;
            case 4:
                view3 = new AppCompatSpinner(context2, attributeSet);
                break;
            case 5:
                view3 = new AppCompatImageButton(context2, attributeSet);
                break;
            case 6:
                view3 = new AppCompatCheckBox(context2, attributeSet);
                break;
            case 7:
                view3 = new AppCompatRadioButton(context2, attributeSet);
                break;
            case 8:
                view3 = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case 9:
                view3 = new AppCompatAutoCompleteTextView(context2, attributeSet);
                break;
            case 10:
                view3 = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view3 = new AppCompatRatingBar(context2, attributeSet);
                break;
            case 12:
                view3 = new AppCompatSeekBar(context2, attributeSet);
                break;
        }
        if (view3 != null || context == context2) {
            view2 = view3;
        } else {
            view2 = m32807a(context2, str, attributeSet);
        }
        if (view2 != null) {
            m32809a(view2, attributeSet);
        }
        return view2;
    }

    /* renamed from: a */
    private View m32807a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f24602e[0] = context;
            this.f24602e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : f24600c) {
                    a = m32808a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.f24602e[0] = null;
                this.f24602e[1] = null;
                return null;
            }
            a = m32808a(context, str, null);
            this.f24602e[0] = null;
            this.f24602e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.f24602e[0] = null;
            this.f24602e[1] = null;
        }
    }

    /* renamed from: a */
    private void m32809a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || jd.K(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24599b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C5556a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private View m32808a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        Constructor constructor = (Constructor) f24601d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f24598a);
                f24601d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f24602e);
    }

    /* renamed from: a */
    private static Context m32806a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5577j.View, 0, 0);
        if (z) {
            resourceId = obtainStyledAttributes.getResourceId(C5577j.View_android_theme, 0);
        } else {
            resourceId = 0;
        }
        if (z2 && r0 == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C5577j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if ((context instanceof nk) && ((nk) context).m32963a() == i) {
            return context;
        }
        return new nk(context, i);
    }
}
