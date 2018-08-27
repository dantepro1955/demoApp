package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.facebook.stetho.common.Utf8Charset;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: ActivityChooserModel */
/* renamed from: op */
public class op extends DataSetObservable {
    /* renamed from: a */
    static final String f24942a = op.class.getSimpleName();
    /* renamed from: e */
    private static final Object f24943e = new Object();
    /* renamed from: f */
    private static final Map<String, op> f24944f = new HashMap();
    /* renamed from: b */
    final Context f24945b;
    /* renamed from: c */
    final String f24946c;
    /* renamed from: d */
    boolean f24947d;
    /* renamed from: g */
    private final Object f24948g;
    /* renamed from: h */
    private final List<C5643a> f24949h;
    /* renamed from: i */
    private final List<C5645c> f24950i;
    /* renamed from: j */
    private Intent f24951j;
    /* renamed from: k */
    private C5644b f24952k;
    /* renamed from: l */
    private int f24953l;
    /* renamed from: m */
    private boolean f24954m;
    /* renamed from: n */
    private boolean f24955n;
    /* renamed from: o */
    private boolean f24956o;
    /* renamed from: p */
    private C5646d f24957p;

    /* compiled from: ActivityChooserModel */
    /* renamed from: op$a */
    public final class C5643a implements Comparable<C5643a> {
        /* renamed from: a */
        public final ResolveInfo f24935a;
        /* renamed from: b */
        public float f24936b;
        /* renamed from: c */
        final /* synthetic */ op f24937c;

        public /* synthetic */ int compareTo(Object obj) {
            return m33268a((C5643a) obj);
        }

        public C5643a(op opVar, ResolveInfo resolveInfo) {
            this.f24937c = opVar;
            this.f24935a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f24936b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            if (Float.floatToIntBits(this.f24936b) != Float.floatToIntBits(((C5643a) obj).f24936b)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public int m33268a(C5643a c5643a) {
            return Float.floatToIntBits(c5643a.f24936b) - Float.floatToIntBits(this.f24936b);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:").append(this.f24935a.toString());
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f24936b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: ActivityChooserModel */
    /* renamed from: op$b */
    public interface C5644b {
        /* renamed from: a */
        void m33269a(Intent intent, List<C5643a> list, List<C5645c> list2);
    }

    /* compiled from: ActivityChooserModel */
    /* renamed from: op$c */
    public static final class C5645c {
        /* renamed from: a */
        public final ComponentName f24938a;
        /* renamed from: b */
        public final long f24939b;
        /* renamed from: c */
        public final float f24940c;

        public C5645c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C5645c(ComponentName componentName, long j, float f) {
            this.f24938a = componentName;
            this.f24939b = j;
            this.f24940c = f;
        }

        public int hashCode() {
            return (((((this.f24938a == null ? 0 : this.f24938a.hashCode()) + 31) * 31) + ((int) (this.f24939b ^ (this.f24939b >>> 32)))) * 31) + Float.floatToIntBits(this.f24940c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C5645c c5645c = (C5645c) obj;
            if (this.f24938a == null) {
                if (c5645c.f24938a != null) {
                    return false;
                }
            } else if (!this.f24938a.equals(c5645c.f24938a)) {
                return false;
            }
            if (this.f24939b != c5645c.f24939b) {
                return false;
            }
            if (Float.floatToIntBits(this.f24940c) != Float.floatToIntBits(c5645c.f24940c)) {
                return false;
            }
            return true;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:").append(this.f24938a);
            stringBuilder.append("; time:").append(this.f24939b);
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f24940c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: ActivityChooserModel */
    /* renamed from: op$d */
    public interface C5646d {
        /* renamed from: a */
        boolean m33270a(op opVar, Intent intent);
    }

    /* compiled from: ActivityChooserModel */
    /* renamed from: op$e */
    final class C5647e extends AsyncTask<Object, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ op f24941a;

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            return m33271a(objArr);
        }

        C5647e(op opVar) {
            this.f24941a = opVar;
        }

        /* renamed from: a */
        public Void m33271a(Object... objArr) {
            int i = 0;
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                OutputStream openFileOutput = this.f24941a.f24945b.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(Utf8Charset.NAME, Boolean.valueOf(true));
                    newSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    while (i < size) {
                        C5645c c5645c = (C5645c) list.remove(0);
                        newSerializer.startTag(null, "historical-record");
                        newSerializer.attribute(null, "activity", c5645c.f24938a.flattenToString());
                        newSerializer.attribute(null, "time", String.valueOf(c5645c.f24939b));
                        newSerializer.attribute(null, "weight", String.valueOf(c5645c.f24940c));
                        newSerializer.endTag(null, "historical-record");
                        i++;
                    }
                    newSerializer.endTag(null, "historical-records");
                    newSerializer.endDocument();
                    this.f24941a.f24947d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable e2) {
                    Log.e(op.f24942a, "Error writing historical record file: " + this.f24941a.f24946c, e2);
                    this.f24941a.f24947d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable e22) {
                    Log.e(op.f24942a, "Error writing historical record file: " + this.f24941a.f24946c, e22);
                    this.f24941a.f24947d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (Throwable e222) {
                    Log.e(op.f24942a, "Error writing historical record file: " + this.f24941a.f24946c, e222);
                    this.f24941a.f24947d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th) {
                    this.f24941a.f24947d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (Throwable e2222) {
                Log.e(op.f24942a, "Error writing historical record file: " + str, e2222);
            }
            return null;
        }
    }

    /* renamed from: a */
    public int m33280a() {
        int size;
        synchronized (this.f24948g) {
            m33274e();
            size = this.f24949h.size();
        }
        return size;
    }

    /* renamed from: a */
    public ResolveInfo m33282a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f24948g) {
            m33274e();
            resolveInfo = ((C5643a) this.f24949h.get(i)).f24935a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public int m33281a(ResolveInfo resolveInfo) {
        synchronized (this.f24948g) {
            m33274e();
            List list = this.f24949h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C5643a) list.get(i)).f24935a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public Intent m33283b(int i) {
        synchronized (this.f24948g) {
            if (this.f24951j == null) {
                return null;
            }
            m33274e();
            C5643a c5643a = (C5643a) this.f24949h.get(i);
            ComponentName componentName = new ComponentName(c5643a.f24935a.activityInfo.packageName, c5643a.f24935a.activityInfo.name);
            Intent intent = new Intent(this.f24951j);
            intent.setComponent(componentName);
            if (this.f24957p != null) {
                if (this.f24957p.m33270a(this, new Intent(intent))) {
                    return null;
                }
            }
            m33272a(new C5645c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo m33284b() {
        synchronized (this.f24948g) {
            m33274e();
            if (this.f24949h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C5643a) this.f24949h.get(0)).f24935a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void m33286c(int i) {
        synchronized (this.f24948g) {
            float f;
            m33274e();
            C5643a c5643a = (C5643a) this.f24949h.get(i);
            C5643a c5643a2 = (C5643a) this.f24949h.get(0);
            if (c5643a2 != null) {
                f = (c5643a2.f24936b - c5643a.f24936b) + 5.0f;
            } else {
                f = 1.0f;
            }
            m33272a(new C5645c(new ComponentName(c5643a.f24935a.activityInfo.packageName, c5643a.f24935a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* renamed from: d */
    private void m33273d() {
        if (!this.f24954m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f24955n) {
            this.f24955n = false;
            if (!TextUtils.isEmpty(this.f24946c)) {
                gp.m30481a(new C5647e(this), new ArrayList(this.f24950i), this.f24946c);
            }
        }
    }

    /* renamed from: c */
    public int m33285c() {
        int size;
        synchronized (this.f24948g) {
            m33274e();
            size = this.f24950i.size();
        }
        return size;
    }

    /* renamed from: e */
    private void m33274e() {
        int g = m33276g() | m33277h();
        m33278i();
        if (g != 0) {
            m33275f();
            notifyChanged();
        }
    }

    /* renamed from: f */
    private boolean m33275f() {
        if (this.f24952k == null || this.f24951j == null || this.f24949h.isEmpty() || this.f24950i.isEmpty()) {
            return false;
        }
        this.f24952k.m33269a(this.f24951j, this.f24949h, Collections.unmodifiableList(this.f24950i));
        return true;
    }

    /* renamed from: g */
    private boolean m33276g() {
        if (!this.f24956o || this.f24951j == null) {
            return false;
        }
        this.f24956o = false;
        this.f24949h.clear();
        List queryIntentActivities = this.f24945b.getPackageManager().queryIntentActivities(this.f24951j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f24949h.add(new C5643a(this, (ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: h */
    private boolean m33277h() {
        if (!this.f24947d || !this.f24955n || TextUtils.isEmpty(this.f24946c)) {
            return false;
        }
        this.f24947d = false;
        this.f24954m = true;
        m33279j();
        return true;
    }

    /* renamed from: a */
    private boolean m33272a(C5645c c5645c) {
        boolean add = this.f24950i.add(c5645c);
        if (add) {
            this.f24955n = true;
            m33278i();
            m33273d();
            m33275f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: i */
    private void m33278i() {
        int size = this.f24950i.size() - this.f24953l;
        if (size > 0) {
            this.f24955n = true;
            for (int i = 0; i < size; i++) {
                C5645c c5645c = (C5645c) this.f24950i.remove(0);
            }
        }
    }

    /* renamed from: j */
    private void m33279j() {
        try {
            InputStream openFileInput = this.f24945b.openFileInput(this.f24946c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, Utf8Charset.NAME);
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.f24950i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new C5645c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (Throwable e2) {
                Log.e(f24942a, "Error reading historical recrod file: " + this.f24946c, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable e22) {
                Log.e(f24942a, "Error reading historical recrod file: " + this.f24946c, e22);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            }
        } catch (FileNotFoundException e6) {
        }
    }
}
