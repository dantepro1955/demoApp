package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import p000.ahs.C0181c;

/* renamed from: aov */
public final class aov {
    /* renamed from: a */
    private static final hr<String, String> f3852a = new hr();

    /* renamed from: a */
    public static String m4757a(Context context) {
        String str = context.getApplicationInfo().name;
        if (TextUtils.isEmpty(str)) {
            str = context.getPackageName();
            try {
                str = ato.m5611b(context).m5610b(context.getPackageName()).toString();
            } catch (NameNotFoundException e) {
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m4758a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0181c.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0181c.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0181c.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return aov.m4759a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return aov.m4759a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return aov.m4759a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return aov.m4759a(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    /* renamed from: a */
    private static String m4759a(Context context, String str) {
        synchronized (f3852a) {
            String str2 = (String) f3852a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                str2 = String.valueOf(str);
                Log.w(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
                return null;
            }
            Object string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                str3 = "GoogleApiAvailability";
                str4 = "Got empty resource: ";
                str2 = String.valueOf(str);
                Log.w(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
                return null;
            }
            f3852a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    private static String m4760a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = aov.m4759a(context, str);
        if (a == null) {
            a = resources.getString(C0181c.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m4761b(Context context, int i) {
        String a = i == 6 ? aov.m4759a(context, "common_google_play_services_resolution_required_title") : aov.m4758a(context, i);
        return a == null ? context.getResources().getString(C0181c.common_google_play_services_notification_ticker) : a;
    }

    /* renamed from: c */
    public static String m4762c(Context context, int i) {
        Resources resources = context.getResources();
        String a = aov.m4757a(context);
        switch (i) {
            case 1:
                return resources.getString(C0181c.common_google_play_services_install_text, new Object[]{a});
            case 2:
                if (apw.m4891b(context)) {
                    return resources.getString(C0181c.common_google_play_services_wear_update_text);
                }
                return resources.getString(C0181c.common_google_play_services_update_text, new Object[]{a});
            case 3:
                return resources.getString(C0181c.common_google_play_services_enable_text, new Object[]{a});
            case 5:
                return aov.m4760a(context, "common_google_play_services_invalid_account_text", a);
            case 7:
                return aov.m4760a(context, "common_google_play_services_network_error_text", a);
            case 9:
                return resources.getString(C0181c.common_google_play_services_unsupported_text, new Object[]{a});
            case 16:
                return aov.m4760a(context, "common_google_play_services_api_unavailable_text", a);
            case 17:
                return aov.m4760a(context, "common_google_play_services_sign_in_failed_text", a);
            case 18:
                return resources.getString(C0181c.common_google_play_services_updating_text, new Object[]{a});
            case 20:
                return aov.m4760a(context, "common_google_play_services_restricted_profile_text", a);
            default:
                return resources.getString(C0181c.common_google_play_services_unknown_issue, new Object[]{a});
        }
    }

    /* renamed from: d */
    public static String m4763d(Context context, int i) {
        return i == 6 ? aov.m4760a(context, "common_google_play_services_resolution_required_text", aov.m4757a(context)) : aov.m4762c(context, i);
    }

    /* renamed from: e */
    public static String m4764e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0181c.common_google_play_services_install_button);
            case 2:
                return resources.getString(C0181c.common_google_play_services_update_button);
            case 3:
                return resources.getString(C0181c.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }
}
