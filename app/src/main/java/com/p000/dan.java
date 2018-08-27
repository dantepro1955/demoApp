package com.p000;

import android.R.drawable;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.facebook.ads.AdError;
import com.facebook.share.internal.ShareConstants;
import com.onesignal.NotificationOpenedActivity;
import com.onesignal.NotificationOpenedReceiver;
import com.under9.android.lib.network.model.Constants;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ed.C5261q;
import p000.ed.C5262b;
import p000.ed.C5263c;
import p000.ed.C5264d;
import p000.ed.C5266f;

/* compiled from: GenerateNotification */
/* renamed from: dan */
class dan {
    /* renamed from: a */
    private static Context f20941a = null;
    /* renamed from: b */
    private static String f20942b = null;
    /* renamed from: c */
    private static Resources f20943c = null;
    /* renamed from: d */
    private static Class<?> f20944d;
    /* renamed from: e */
    private static boolean f20945e;

    /* renamed from: a */
    static void m26056a(Context context) {
        f20941a = context;
        f20942b = f20941a.getPackageName();
        f20943c = f20941a.getResources();
        PackageManager packageManager = f20941a.getPackageManager();
        Intent intent = new Intent(f20941a, NotificationOpenedReceiver.class);
        intent.setPackage(f20941a.getPackageName());
        if (packageManager.queryBroadcastReceivers(intent, 0).size() > 0) {
            f20945e = true;
            f20944d = NotificationOpenedReceiver.class;
            return;
        }
        f20944d = NotificationOpenedActivity.class;
    }

    /* renamed from: a */
    public static int m26049a(Context context, Bundle bundle, boolean z) {
        dan.m26056a(context);
        JSONObject b = daq.m26091b(bundle);
        if (!z || dae.f20925b == null) {
            return dan.m26065c(b);
        }
        return dan.m26050a(b, dae.f20925b);
    }

    /* renamed from: a */
    private static int m26050a(final JSONObject jSONObject, final Activity activity) {
        final int nextInt = new Random().nextInt();
        activity.runOnUiThread(new Runnable() {
            public void run() {
                Builder builder = new Builder(activity);
                builder.setTitle(dan.m26063b(jSONObject));
                try {
                    builder.setMessage(jSONObject.getString("alert"));
                } catch (Throwable th) {
                }
                List arrayList = new ArrayList();
                final List arrayList2 = new ArrayList();
                dan.m26064b(jSONObject, arrayList, arrayList2);
                final Intent a = dan.m26061b(nextInt);
                a.putExtra("action_button", true);
                a.putExtra("from_alert", true);
                a.putExtra("onesignal_data", jSONObject.toString());
                try {
                    if (jSONObject.has("grp")) {
                        a.putExtra("grp", jSONObject.getString("grp"));
                    }
                } catch (JSONException e) {
                }
                OnClickListener c47421 = new OnClickListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ C47441 f20935c;

                    public void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = i + 3;
                        if (arrayList2.size() > 1) {
                            try {
                                JSONObject jSONObject = new JSONObject(jSONObject.getString("custom"));
                                jSONObject.getJSONObject("a").put("actionSelected", arrayList2.get(i2));
                                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                jSONObject2.put("custom", jSONObject.toString());
                                a.putExtra("onesignal_data", jSONObject2.toString());
                                dar.m26097b(activity, a);
                                return;
                            } catch (Throwable th) {
                                return;
                            }
                        }
                        dar.m26097b(activity, a);
                    }
                };
                builder.setOnCancelListener(new OnCancelListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C47441 f20937b;

                    public void onCancel(DialogInterface dialogInterface) {
                        dar.m26097b(activity, a);
                    }
                });
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i == 0) {
                        builder.setNeutralButton((CharSequence) arrayList.get(i), c47421);
                    } else if (i == 1) {
                        builder.setNegativeButton((CharSequence) arrayList.get(i), c47421);
                    } else if (i == 2) {
                        builder.setPositiveButton((CharSequence) arrayList.get(i), c47421);
                    }
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            }
        });
        return nextInt;
    }

    /* renamed from: b */
    private static CharSequence m26063b(JSONObject jSONObject) {
        CharSequence charSequence = null;
        try {
            charSequence = jSONObject.getString("title");
        } catch (Throwable th) {
        }
        if (charSequence != null) {
            return charSequence;
        }
        return f20941a.getPackageManager().getApplicationLabel(f20941a.getApplicationInfo());
    }

    /* renamed from: a */
    private static PendingIntent m26051a(int i, Intent intent) {
        if (f20945e) {
            return PendingIntent.getBroadcast(f20941a, i, intent, 134217728);
        }
        return PendingIntent.getActivity(f20941a, i, intent, 134217728);
    }

    /* renamed from: b */
    private static Intent m26061b(int i) {
        Intent putExtra = new Intent(f20941a, f20944d).putExtra("notificationId", i);
        return f20945e ? putExtra : putExtra.addFlags(603979776);
    }

    /* renamed from: c */
    private static Intent m26066c(int i) {
        Intent putExtra = new Intent(f20941a, f20944d).putExtra("notificationId", i).putExtra("dismissed", true);
        return f20945e ? putExtra : putExtra.addFlags(402718720);
    }

    /* renamed from: a */
    private static C5264d m26054a(JSONObject jSONObject, boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        int f = dan.m26072f(jSONObject);
        if (dat.b(f20941a)) {
            i = 2;
        } else {
            i = 0;
        }
        CharSequence charSequence = null;
        try {
            charSequence = jSONObject.getString("alert");
        } catch (Throwable th) {
        }
        C5264d b = new C5264d(f20941a).m29968b(true).m29953a(f).m29962a(dan.m26063b(jSONObject)).m29961a(new C5263c().m29949b(charSequence)).m29967b(charSequence);
        if (z) {
            b.m29971c(charSequence);
        }
        try {
            BigInteger h = dan.m26074h(jSONObject);
            if (h != null) {
                b.m29977e(h.intValue());
            }
        } catch (Throwable th2) {
        }
        if (z && jSONObject.has("ledc")) {
            try {
                b.m29954a(new BigInteger(jSONObject.getString("ledc"), 16).intValue(), (int) AdError.SERVER_ERROR_CODE, 5000);
            } catch (Throwable th3) {
                i |= 4;
            }
        } else {
            i |= 4;
        }
        try {
            if (jSONObject.has("vis")) {
                i2 = Integer.parseInt(jSONObject.getString("vis"));
            }
            b.m29978f(i2);
        } catch (Throwable th4) {
        }
        Bitmap e = dan.m26071e(jSONObject);
        if (e != null) {
            b.m29959a(e);
        }
        e = dan.m26053a(jSONObject, "bicon");
        if (e != null) {
            b.m29961a(new C5262b().m29946a(e).m29947a(charSequence));
        }
        if (z && dat.c(f20941a)) {
            Uri g = dan.m26073g(jSONObject);
            if (g != null) {
                b.m29960a(g);
            } else {
                i |= 1;
            }
        }
        if (z) {
            i3 = i;
        }
        b.m29970c(i3);
        return b;
    }

    /* renamed from: c */
    private static int m26065c(JSONObject jSONObject) {
        String string;
        Random random = new Random();
        try {
            string = jSONObject.getString("grp");
        } catch (Throwable th) {
            string = null;
        }
        int nextInt = random.nextInt();
        C5264d a = dan.m26054a(jSONObject, true);
        dan.m26058a(jSONObject, a, nextInt, null);
        if (string != null) {
            a.m29958a(dan.m26051a(random.nextInt(), dan.m26061b(nextInt).putExtra("onesignal_data", jSONObject.toString()).putExtra("grp", string)));
            a.m29966b(dan.m26051a(random.nextInt(), dan.m26066c(nextInt).putExtra("grp", string)));
            a.m29963a(string);
            dan.m26069d(jSONObject);
        } else {
            a.m29958a(dan.m26051a(random.nextInt(), dan.m26061b(nextInt).putExtra("onesignal_data", jSONObject.toString())));
            a.m29966b(dan.m26051a(random.nextInt(), dan.m26066c(nextInt)));
        }
        if (string == null || VERSION.SDK_INT > 17) {
            try {
                em.m30055a(f20941a).m30060a(nextInt, a.m29952a());
            } catch (Exception e) {
            }
        }
        return nextInt;
    }

    /* renamed from: d */
    private static void m26069d(JSONObject jSONObject) {
        dan.m26057a(null, false, jSONObject);
    }

    /* renamed from: a */
    static void m26057a(Context context, boolean z, JSONObject jSONObject) {
        String string;
        String string2;
        int i;
        Notification a;
        if (z) {
            dan.m26056a(context);
        }
        String str = null;
        try {
            string = jSONObject.getString("grp");
        } catch (Throwable th) {
            string = str;
        }
        Random random = new Random();
        PendingIntent a2 = dan.m26051a(random.nextInt(), dan.m26066c(0).putExtra("summary", string));
        SQLiteDatabase writableDatabase = new dau(f20941a).getWritableDatabase();
        Cursor query = writableDatabase.query("notification", new String[]{"android_notification_id", "full_data", "is_summary", "title", ShareConstants.WEB_DIALOG_PARAM_MESSAGE}, "group_id = ? AND dismissed = 0 AND opened = 0", new String[]{string}, null, null, "_id DESC");
        int nextInt = random.nextInt();
        String str2 = null;
        Collection arrayList;
        if (query.moveToFirst()) {
            arrayList = new ArrayList();
            do {
                if (query.getInt(query.getColumnIndex("is_summary")) == 1) {
                    nextInt = query.getInt(query.getColumnIndex("android_notification_id"));
                } else {
                    string2 = query.getString(query.getColumnIndex("title"));
                    if (string2 == null) {
                        string2 = "";
                    } else {
                        string2 = string2 + " ";
                    }
                    SpannableString spannableString = new SpannableString(string2 + query.getString(query.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)));
                    if (string2.length() > 0) {
                        spannableString.setSpan(new StyleSpan(1), 0, string2.length(), 0);
                    }
                    arrayList.add(spannableString);
                    if (str2 == null) {
                        str2 = query.getString(query.getColumnIndex("full_data"));
                    }
                }
            } while (query.moveToNext());
            if (z) {
                try {
                    i = nextInt;
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            i = nextInt;
        } else {
            arrayList = null;
            i = nextInt;
        }
        if (r4 == null || (z && r4.size() <= 1)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", Integer.valueOf(i));
            contentValues.put("group_id", string);
            contentValues.put("is_summary", Integer.valueOf(1));
            writableDatabase.insert("notification", null, contentValues);
            C5264d a3 = dan.m26054a(jSONObject, !z);
            PendingIntent a4 = dan.m26051a(random.nextInt(), dan.m26061b(i).putExtra("onesignal_data", jSONObject.toString()).putExtra("summary", string));
            dan.m26058a(jSONObject, a3, i, string);
            a3.m29958a(a4).m29966b(a2).m29964a(z).m29963a(string).m29975d(true);
            a = a3.m29952a();
        } else {
            CharSequence charSequence;
            int size = r4.size() + (z ? 0 : 1);
            str2 = null;
            if (jSONObject.has("grp_msg")) {
                try {
                    str2 = jSONObject.getString("grp_msg").replace("$[notif_count]", "" + size);
                } catch (Throwable th2) {
                }
            }
            if (str2 == null) {
                charSequence = size + " new messages";
            } else {
                Object obj = str2;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("alert", charSequence);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            PendingIntent a5 = dan.m26051a(random.nextInt(), dan.m26061b(i).putExtra("summary", string).putExtra("onesignal_data", jSONObject2.toString()));
            C5264d a6 = dan.m26054a(jSONObject, !z);
            a6.m29958a(a5).m29966b(a2).m29962a(f20941a.getPackageManager().getApplicationLabel(f20941a.getApplicationInfo())).m29967b(charSequence).m29965b(size).m29964a(z).m29963a(string).m29975d(true);
            if (!z) {
                a6.m29971c(charSequence);
            }
            C5261q c5266f = new C5266f();
            str2 = null;
            if (!z) {
                try {
                    str2 = jSONObject.getString("title");
                } catch (Throwable th3) {
                }
                if (str2 == null) {
                    str2 = "";
                } else {
                    str2 = str2 + " ";
                }
                string2 = "";
                try {
                    string2 = jSONObject.getString("alert");
                } catch (Throwable th4) {
                }
                CharSequence spannableString2 = new SpannableString(str2 + string2);
                if (str2.length() > 0) {
                    spannableString2.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                }
                c5266f.m29981b(spannableString2);
            }
            for (SpannableString b : r4) {
                c5266f.m29981b(b);
            }
            c5266f.m29980a(charSequence);
            a6.m29961a(c5266f);
            a = a6.m29952a();
        }
        try {
            em.m30055a(f20941a).m30060a(i, a);
        } catch (Exception e3) {
        }
        query.close();
        writableDatabase.close();
    }

    /* renamed from: a */
    private static boolean m26060a(String str) {
        return (str == null || str.matches("^[0-9]")) ? false : true;
    }

    /* renamed from: e */
    private static Bitmap m26071e(JSONObject jSONObject) {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Bitmap a = dan.m26053a(jSONObject, "licon");
        if (a == null) {
            a = dan.m26062b("ic_onesignal_large_icon_default");
        }
        if (a == null) {
            a = dan.m26062b("ic_gamethrive_large_icon_default");
        }
        if (a == null) {
            return null;
        }
        try {
            int dimension = (int) f20943c.getDimension(17104902);
            int dimension2 = (int) f20943c.getDimension(17104901);
            int height = a.getHeight();
            int width = a.getWidth();
            if (width > dimension2 || height > dimension) {
                if (height > width) {
                    dimension2 = (int) ((((float) width) / ((float) height)) * ((float) dimension));
                } else if (width > height) {
                    dimension = (int) ((((float) height) / ((float) width)) * ((float) dimension2));
                }
                return Bitmap.createScaledBitmap(a, dimension2, dimension, true);
            }
        } catch (Throwable th) {
        }
        return a;
    }

    /* renamed from: b */
    private static Bitmap m26062b(String str) {
        Bitmap decodeStream;
        try {
            decodeStream = BitmapFactory.decodeStream(f20941a.getAssets().open(str));
        } catch (Throwable th) {
            decodeStream = null;
        }
        if (decodeStream != null) {
            return decodeStream;
        }
        try {
            Bitmap bitmap = decodeStream;
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    decodeStream = BitmapFactory.decodeStream(f20941a.getAssets().open(str + str2));
                } catch (Throwable th2) {
                    decodeStream = bitmap;
                }
                if (decodeStream != null) {
                    return decodeStream;
                }
                bitmap = decodeStream;
            }
            int d = dan.m26068d(str);
            if (d != 0) {
                return BitmapFactory.decodeResource(f20943c, d);
            }
        } catch (Throwable th3) {
        }
        return null;
    }

    /* renamed from: c */
    private static Bitmap m26067c(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m26053a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (!jSONObject.has(str)) {
            return str2;
        }
        try {
            str2 = jSONObject.getString(str);
        } catch (Throwable th) {
        }
        if (str2.startsWith("http://") || str2.startsWith("https://")) {
            return dan.m26067c(str2);
        }
        return dan.m26062b(str2);
    }

    /* renamed from: d */
    private static int m26068d(String str) {
        int i = 0;
        if (!dan.m26060a(str)) {
            return i;
        }
        int e = dan.m26070e(str);
        if (e != 0) {
            return e;
        }
        try {
            return drawable.class.getField(str).getInt(null);
        } catch (Throwable th) {
            return i;
        }
    }

    /* renamed from: f */
    private static int m26072f(JSONObject jSONObject) {
        int i = 0;
        if (jSONObject.has("sicon")) {
            try {
                i = dan.m26068d(jSONObject.getString("sicon"));
            } catch (Throwable th) {
            }
            if (i != 0) {
                return i;
            }
        }
        i = dan.m26070e("ic_stat_onesignal_default");
        if (i != 0) {
            return i;
        }
        i = dan.m26070e("ic_stat_gamethrive_default");
        if (i != 0) {
            return i;
        }
        i = dan.m26070e("corona_statusbar_icon_default");
        if (i != 0) {
            return i;
        }
        i = f20941a.getApplicationInfo().icon;
        return i == 0 ? 17301651 : i;
    }

    /* renamed from: e */
    private static int m26070e(String str) {
        return f20943c.getIdentifier(str, "drawable", f20942b);
    }

    /* renamed from: g */
    private static Uri m26073g(JSONObject jSONObject) {
        try {
            String string;
            int identifier;
            if (jSONObject.has("sound")) {
                string = jSONObject.getString("sound");
            } else {
                string = null;
            }
            if (dan.m26060a(string)) {
                identifier = f20943c.getIdentifier(string, "raw", f20942b);
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + f20942b + Constants.SEP + identifier);
                }
            }
            identifier = f20943c.getIdentifier("onesignal_default_sound", "raw", f20942b);
            if (identifier != 0) {
                return Uri.parse("android.resource://" + f20942b + Constants.SEP + identifier);
            }
            identifier = f20943c.getIdentifier("gamethrive_default_sound", "raw", f20942b);
            if (identifier != 0) {
                return Uri.parse("android.resource://" + f20942b + Constants.SEP + identifier);
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: h */
    private static BigInteger m26074h(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.getString("bgac"), 16);
            }
        } catch (Throwable th) {
        }
        try {
            String a = das.m26099a(f20941a, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (a != null) {
                return new BigInteger(a, 16);
            }
        } catch (Throwable th2) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m26058a(JSONObject jSONObject, C5264d c5264d, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        int d;
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                        jSONObject3.put("actionSelected", jSONObject4.getString("id"));
                        JSONObject jSONObject5 = new JSONObject(jSONObject.toString());
                        jSONObject5.put("custom", jSONObject2.toString());
                        Intent b = dan.m26061b(i);
                        b.setAction("" + i2);
                        b.putExtra("action_button", true);
                        b.putExtra("onesignal_data", jSONObject5.toString());
                        if (str != null) {
                            b.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            b.putExtra("grp", jSONObject.getString("grp"));
                        }
                        PendingIntent a = dan.m26051a(i, b);
                        if (jSONObject4.has("icon")) {
                            d = dan.m26068d(jSONObject4.getString("icon"));
                        } else {
                            d = 0;
                        }
                        c5264d.m29956a(d, jSONObject4.getString("text"), a);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m26064b(JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("a")) {
                jSONObject2 = jSONObject2.getJSONObject("a");
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        list.add(jSONObject3.getString("text"));
                        list2.add(jSONObject3.getString("id"));
                    }
                }
            }
            if (list.size() < 3) {
                list.add("Close");
                list2.add("__DEFAULT__");
            }
        } catch (Throwable e) {
            dat.a(dat$c.ERROR, "Failed to parse buttons for alert dialog.", e);
        }
    }
}
