package com.p000;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.common.util.UriUtil;
import com.under9.android.lib.network.model.Constants;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000.mx.C5568a;
import p000.mx.C5573f;

/* compiled from: SuggestionsAdapter */
/* renamed from: pz */
public class pz extends lv implements OnClickListener {
    /* renamed from: j */
    private final SearchManager f25167j = ((SearchManager) this.d.getSystemService("search"));
    /* renamed from: k */
    private final SearchView f25168k;
    /* renamed from: l */
    private final SearchableInfo f25169l;
    /* renamed from: m */
    private final Context f25170m;
    /* renamed from: n */
    private final WeakHashMap<String, ConstantState> f25171n;
    /* renamed from: o */
    private final int f25172o;
    /* renamed from: p */
    private boolean f25173p = false;
    /* renamed from: q */
    private int f25174q = 1;
    /* renamed from: r */
    private ColorStateList f25175r;
    /* renamed from: s */
    private int f25176s = -1;
    /* renamed from: t */
    private int f25177t = -1;
    /* renamed from: u */
    private int f25178u = -1;
    /* renamed from: v */
    private int f25179v = -1;
    /* renamed from: w */
    private int f25180w = -1;
    /* renamed from: x */
    private int f25181x = -1;

    /* compiled from: SuggestionsAdapter */
    /* renamed from: pz$a */
    static final class C5682a {
        /* renamed from: a */
        public final TextView f25162a;
        /* renamed from: b */
        public final TextView f25163b;
        /* renamed from: c */
        public final ImageView f25164c;
        /* renamed from: d */
        public final ImageView f25165d;
        /* renamed from: e */
        public final ImageView f25166e;

        public C5682a(View view) {
            this.f25162a = (TextView) view.findViewById(16908308);
            this.f25163b = (TextView) view.findViewById(16908309);
            this.f25164c = (ImageView) view.findViewById(16908295);
            this.f25165d = (ImageView) view.findViewById(16908296);
            this.f25166e = (ImageView) view.findViewById(C5573f.edit_query);
        }
    }

    public pz(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f25168k = searchView;
        this.f25169l = searchableInfo;
        this.f25172o = searchView.getSuggestionCommitIconResId();
        this.f25170m = context;
        this.f25171n = weakHashMap;
    }

    /* renamed from: a */
    public void m33760a(int i) {
        this.f25174q = i;
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: a */
    public Cursor m33757a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f25168k.getVisibility() != 0 || this.f25168k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = m33756a(this.f25169l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m33752d(a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m33752d(a());
    }

    /* renamed from: d */
    private void m33752d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    public void m33761a(Cursor cursor) {
        if (this.f25173p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f25176s = cursor.getColumnIndex("suggest_text_1");
                this.f25177t = cursor.getColumnIndex("suggest_text_2");
                this.f25178u = cursor.getColumnIndex("suggest_text_2_url");
                this.f25179v = cursor.getColumnIndex("suggest_icon_1");
                this.f25180w = cursor.getColumnIndex("suggest_icon_2");
                this.f25181x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public View m33759a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.a(context, cursor, viewGroup);
        a.setTag(new C5682a(a));
        ((ImageView) a.findViewById(C5573f.edit_query)).setImageResource(this.f25172o);
        return a;
    }

    /* renamed from: a */
    public void m33762a(View view, Context context, Cursor cursor) {
        C5682a c5682a = (C5682a) view.getTag();
        int i;
        if (this.f25181x != -1) {
            i = cursor.getInt(this.f25181x);
        } else {
            i = 0;
        }
        if (c5682a.f25162a != null) {
            m33746a(c5682a.f25162a, pz.m33743a(cursor, this.f25176s));
        }
        if (c5682a.f25163b != null) {
            CharSequence a = pz.m33743a(cursor, this.f25178u);
            if (a != null) {
                a = m33751b(a);
            } else {
                a = pz.m33743a(cursor, this.f25177t);
            }
            if (TextUtils.isEmpty(a)) {
                if (c5682a.f25162a != null) {
                    c5682a.f25162a.setSingleLine(false);
                    c5682a.f25162a.setMaxLines(2);
                }
            } else if (c5682a.f25162a != null) {
                c5682a.f25162a.setSingleLine(true);
                c5682a.f25162a.setMaxLines(1);
            }
            m33746a(c5682a.f25163b, a);
        }
        if (c5682a.f25164c != null) {
            m33745a(c5682a.f25164c, m33753e(cursor), 4);
        }
        if (c5682a.f25165d != null) {
            m33745a(c5682a.f25165d, m33754f(cursor), 8);
        }
        if (this.f25174q == 2 || (this.f25174q == 1 && (r1 & 1) != 0)) {
            c5682a.f25166e.setVisibility(0);
            c5682a.f25166e.setTag(c5682a.f25162a.getText());
            c5682a.f25166e.setOnClickListener(this);
            return;
        }
        c5682a.f25166e.setVisibility(8);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f25168k.a((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private CharSequence m33751b(CharSequence charSequence) {
        if (this.f25175r == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(C5568a.textColorSearchUrl, typedValue, true);
            this.f25175r = this.d.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f25175r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private void m33746a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: e */
    private Drawable m33753e(Cursor cursor) {
        if (this.f25179v == -1) {
            return null;
        }
        Drawable a = m33742a(cursor.getString(this.f25179v));
        return a == null ? m33755g(cursor) : a;
    }

    /* renamed from: f */
    private Drawable m33754f(Cursor cursor) {
        if (this.f25180w == -1) {
            return null;
        }
        return m33742a(cursor.getString(this.f25180w));
    }

    /* renamed from: a */
    private void m33745a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: c */
    public CharSequence m33763c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = pz.m33744a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f25169l.shouldRewriteQueryFromData()) {
            a = pz.m33744a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (!this.f25169l.shouldRewriteQueryFromText()) {
            return null;
        }
        a = pz.m33744a(cursor, "suggest_text_1");
        if (a != null) {
            return a;
        }
        return null;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = m33759a(this.d, this.c, viewGroup);
            if (a != null) {
                ((C5682a) a.getTag()).f25162a.setText(e.toString());
            }
            return a;
        }
    }

    /* renamed from: a */
    private Drawable m33742a(String str) {
        if (str == null || str.length() == 0 || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str)) {
            return null;
        }
        Drawable b;
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f25170m.getPackageName() + Constants.SEP + parseInt;
            b = m33750b(str2);
            if (b != null) {
                return b;
            }
            b = ew.a(this.f25170m, parseInt);
            m33747a(str2, b);
            return b;
        } catch (NumberFormatException e) {
            b = m33750b(str);
            if (b != null) {
                return b;
            }
            b = m33749b(Uri.parse(str));
            m33747a(str, b);
            return b;
        } catch (NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m33749b(Uri uri) {
        InputStream openInputStream;
        try {
            if (UriUtil.QUALIFIED_RESOURCE_SCHEME.equals(uri.getScheme())) {
                return m33758a(uri);
            }
            openInputStream = this.f25170m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e4) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
            }
        }
    }

    /* renamed from: b */
    private Drawable m33750b(String str) {
        ConstantState constantState = (ConstantState) this.f25171n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m33747a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f25171n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: g */
    private Drawable m33755g(Cursor cursor) {
        Drawable a = m33741a(this.f25169l.getSearchActivity());
        return a != null ? a : this.d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    private Drawable m33741a(ComponentName componentName) {
        Object obj = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f25171n.containsKey(flattenToShortString)) {
            ConstantState constantState = (ConstantState) this.f25171n.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.f25170m.getResources());
        } else {
            Drawable b = m33748b(componentName);
            if (b != null) {
                obj = b.getConstantState();
            }
            this.f25171n.put(flattenToShortString, obj);
            return b;
        }
    }

    /* renamed from: b */
    private Drawable m33748b(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m33744a(Cursor cursor, String str) {
        return pz.m33743a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m33743a(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        return str;
    }

    /* renamed from: a */
    Drawable m33758a(Uri uri) throws FileNotFoundException {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    size = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                size = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (size != 0) {
                return resourcesForApplication.getDrawable(size);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    Cursor m33756a(SearchableInfo searchableInfo, String str, int i) {
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        String[] strArr;
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }
}
