package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.SafeModeChangedEvent;
import com.ninegag.android.app.ui.ExclusiveAuthActivity;

/* compiled from: UserLoginHelper */
/* renamed from: cre */
public class cre {
    /* renamed from: a */
    public static int m24539a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 3;
            case 6:
            case 7:
                return 5;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
                return 10;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static String m24540a(int i, String str) {
        String str2;
        switch (i) {
            case 1:
                str2 = "upvote";
                break;
            case 2:
                str2 = "downvote";
                break;
            case 3:
                str2 = "report";
                break;
            case 4:
                str2 = "profile";
                break;
            case 5:
                str2 = "upload";
                break;
            case 6:
                str2 = "nsfw";
                break;
            case 7:
                str2 = "nsfw";
                break;
            case 11:
                str2 = "polling";
                break;
            case 12:
                str2 = "notification";
                break;
            case 13:
                str2 = "setting-safemode";
                break;
            case 14:
                str2 = "setting-socialaccount";
                break;
            case 17:
                str2 = "comment-create";
                break;
            case 18:
                str2 = "comment-reply";
                break;
            case 19:
                str2 = "comment-upvote";
                break;
            case 20:
                str2 = "comment-downvote";
                break;
            case 21:
                str2 = "comment-report";
                break;
            default:
                str2 = null;
                break;
        }
        if (str != null) {
            return str2 + "-" + str;
        }
        return str2;
    }

    /* renamed from: a */
    public static void m24547a(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setClass(context, ExclusiveAuthActivity.class);
        context.startActivity(intent2);
    }

    /* renamed from: a */
    public static void m24542a(Activity activity, Intent intent) {
        if (intent == null) {
            new cqd(activity).m24400f();
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            new cqd(activity).m24400f();
            return;
        }
        int i = extras.getInt(NativeProtocol.WEB_DIALOG_ACTION, 0);
        chn.a(cre.m24539a(i), true);
        switch (i) {
            case 1:
                cre.m24556c((Context) activity, intent);
                return;
            case 2:
                cre.m24558d(activity, intent);
                return;
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 4:
                cre.m24555c(activity);
                return;
            case 6:
                cre.m24550b(activity, intent);
                return;
            case 11:
                cre.m24551b(activity);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private static void m24551b(Context context) {
        new cqd(context).m24364a();
    }

    /* renamed from: b */
    public static void m24552b(Context context, Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                chn.a(cre.m24539a(extras.getInt(NativeProtocol.WEB_DIALOG_ACTION, 0)), false);
            }
        }
    }

    /* renamed from: c */
    private static void m24556c(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        cre.m24557c(context, extras.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID), extras.getInt("user_score"), extras.getString("view_tag"), extras.getBoolean("forced"), extras.getInt("up_vote_count"), extras.getInt("down_vote_count"));
    }

    /* renamed from: c */
    private static void m24557c(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        cqg.m24461b(context, str, i, str2, z, i2, i3);
    }

    /* renamed from: a */
    public static void m24549a(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 1);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        intent.putExtra("user_score", i);
        intent.putExtra("view_tag", str2);
        intent.putExtra("forced", z);
        intent.putExtra("up_vote_count", i2);
        intent.putExtra("down_vote_count", i3);
        cre.m24547a(context, intent);
    }

    /* renamed from: d */
    private static void m24558d(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        cre.m24559d(context, extras.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID), extras.getInt("user_score"), extras.getString("view_tag"), extras.getBoolean("forced"), extras.getInt("up_vote_count"), extras.getInt("down_vote_count"));
    }

    /* renamed from: d */
    private static void m24559d(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        cqg.m24453a(context, str, i, str2, z, i2, i3);
    }

    /* renamed from: b */
    public static void m24553b(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 2);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        intent.putExtra("user_score", i);
        intent.putExtra("view_tag", str2);
        intent.putExtra("forced", z);
        intent.putExtra("up_vote_count", i2);
        intent.putExtra("down_vote_count", i3);
        cre.m24547a(context, intent);
    }

    /* renamed from: a */
    public static void m24548a(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 3);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        cre.m24547a(context, intent);
    }

    /* renamed from: c */
    private static void m24555c(Context context) {
        new cqd(context).m24385b();
    }

    /* renamed from: a */
    public static void m24546a(Context context) {
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 5);
        cre.m24547a(context, intent);
    }

    /* renamed from: a */
    private static void m24541a(Activity activity) {
        cij.a().b(false);
        if (activity != null && !activity.isFinishing()) {
            Toast.makeText(activity, R.string.safe_mode_turned_off, 1).show();
        }
    }

    /* renamed from: a */
    public static void m24543a(Activity activity, cct cct, cco cco, int i) {
        cre.m24544a(activity, cct, cco, i, false);
    }

    /* renamed from: a */
    public static void m24544a(Activity activity, cct cct, cco cco, int i, boolean z) {
        if (caf.a().x().c()) {
            if (z) {
                cre.m24541a(activity);
            }
            if (cco.f8733e != null) {
                new cqd(activity).m24388b(cct, cco.f8731c, cco.f8733e, i);
            } else if (cco.f8734f != null && cco.f8731c == 12) {
                new cqd(activity).m24371a(cct, cco.f8734f, i, 12);
            } else if (cco.f8734f == null || cco.f8731c != 16) {
                new cqd(activity).m24370a(cct, cco.f8731c, cco.f8732d, i);
            } else {
                new cqd(activity).m24371a(cct, cco.f8734f, i, 16);
            }
            dhe.m27287c(cco.f8730b, new SafeModeChangedEvent(cct));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 6);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cct.e());
        intent.putExtra("list_type", cco.f8731c);
        intent.putExtra(AccessToken.USER_ID_KEY, cco.f8733e);
        intent.putExtra("group_id", cco.f8732d);
        intent.putExtra("search_key", cco.f8734f);
        intent.putExtra("scope", cco.f8730b);
        intent.putExtra("curr_pos", i);
        cre.m24547a((Context) activity, intent);
    }

    /* renamed from: b */
    private static void m24550b(Activity activity, Intent intent) {
        cre.m24541a(activity);
        cre.m24554c(activity, intent);
    }

    /* renamed from: a */
    public static void m24545a(Activity activity, cct cct, String str, int i, String str2, boolean z) {
        if (caf.a().x().c()) {
            if (z) {
                cre.m24541a(activity);
            }
            dhe.m27287c(str2, new SafeModeChangedEvent(cct));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, 7);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cct.e());
        intent.putExtra("list_type", i);
        intent.putExtra("group_id", str);
        cre.m24547a((Context) activity, intent);
    }

    /* renamed from: c */
    private static void m24554c(Activity activity, Intent intent) {
        caf a = caf.a();
        Bundle extras = intent.getExtras();
        cld i = a.g().f9370c.i(extras.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
        if (i != null) {
            cct a2 = cct.a(i);
            dhe.m27287c(extras.getString("scope"), new SafeModeChangedEvent(a2));
            new cqd(activity).m24370a(a2, extras.getInt("list_type"), extras.getString("group_id"), extras.getInt("curr_pos"));
        }
    }
}
