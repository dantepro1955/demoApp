package com.p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor */
/* renamed from: daq */
public class daq {
    /* renamed from: a */
    public static void m26089a(Context context, final Bundle bundle) {
        boolean z = true;
        if (!dat.a(context, bundle)) {
            boolean z2;
            boolean e = dat.e(context);
            boolean z3 = dat.f16712d && dat.c();
            if (dat.d(context) || e || !z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            daq.m26092c(bundle);
            dal.m26046a(context, bundle, z3);
            if (bundle.getString("alert") != null && !"".equals(bundle.getString("alert"))) {
                int a;
                if (z2) {
                    z3 = e && z3;
                    a = dan.m26049a(context, bundle, z3);
                } else {
                    new Thread(new Runnable() {
                        public void run() {
                            dat.a(daq.m26087a(bundle));
                        }
                    }).start();
                    a = -1;
                }
                if (z2) {
                    z = false;
                }
                daq.m26090a(context, bundle, z, a);
            }
        }
    }

    /* renamed from: a */
    private static void m26090a(Context context, Bundle bundle, boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
            SQLiteDatabase writableDatabase = new dau(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_id", jSONObject.getString("i"));
            if (bundle.containsKey("grp")) {
                contentValues.put("group_id", bundle.getString("grp"));
            }
            contentValues.put("opened", Integer.valueOf(z ? 1 : 0));
            if (!z) {
                contentValues.put("android_notification_id", Integer.valueOf(i));
            }
            if (bundle.containsKey("title")) {
                contentValues.put("title", bundle.getString("title"));
            }
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, bundle.getString("alert"));
            contentValues.put("full_data", daq.m26091b(bundle).toString());
            writableDatabase.insert("notification", null, contentValues);
            writableDatabase.delete("notification", "created_time < " + ((System.currentTimeMillis() / 1000) - 604800) + " AND " + "(" + "dismissed" + " = 1 OR " + "opened" + " = 1" + ")", null);
            if (!z) {
                dam.m26048a(writableDatabase, context);
            }
            writableDatabase.close();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static JSONArray m26088a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m26087a(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(daq.m26091b(bundle));
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONObject m26091b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static void m26092c(Bundle bundle) {
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject;
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object string;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string2 = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        String str = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionSelected", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
