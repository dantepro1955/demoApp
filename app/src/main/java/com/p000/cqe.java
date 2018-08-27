package com.p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.facebook.ads.AdError;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.app.R;
import com.ninegag.android.app.push.PushNotificationEntryPointActivity;
import com.ninegag.android.app.ui.PostCommentsActivity;
import com.ninegag.android.app.ui.SplashScreenActivity;
import p000.ed.C5262b;
import p000.ed.C5263c;
import p000.ed.C5264d;

/* compiled from: NotificationHelper */
/* renamed from: cqe */
public class cqe {
    /* renamed from: a */
    public static void m24427a(Context context, String str, String str2, Bitmap bitmap, String str3, String str4) {
        C5264d a = new C5264d(context).m29953a((int) R.drawable.ic_stat_notify).m29959a(bitmap).m29968b(true).m29962a((CharSequence) str).m29967b((CharSequence) str2).m29971c((CharSequence) str).m29961a(new C5263c().m29948a(str).m29949b(str2));
        Intent intent = new Intent(context, PushNotificationEntryPointActivity.class);
        intent.putExtra("from_notification", true);
        intent.putExtra("is_link", true);
        intent.putExtra("link", str3);
        intent.putExtra("priority_url", str4);
        a.m29958a(PendingIntent.getActivity(context, 0, intent, 134217728));
        cqe.m24431c(context).notify(6550, a.m29952a());
    }

    /* renamed from: a */
    public static void m24421a(Context context, int i, String str, Spanned spanned, Bitmap bitmap, Bundle bundle) {
        C5264d a = new C5264d(context).m29953a((int) R.drawable.ic_stat_notify).m29959a(bitmap).m29968b(true).m29962a((CharSequence) str).m29967b((CharSequence) spanned).m29971c((CharSequence) str).m29961a(new C5263c().m29948a(str).m29949b(spanned));
        Intent intent = new Intent(context, PushNotificationEntryPointActivity.class);
        intent.putExtra("from_notification", true);
        intent.putExtra("notif_id", bundle.getString("notif_id"));
        intent.putExtra("type", bundle.getString("type"));
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, bundle.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
        intent.putExtra("comment_id", bundle.getString("comment_id"));
        a.m29958a(PendingIntent.getActivity(context, 0, intent, 134217728));
        cqe.m24431c(context).notify(i + 5550, a.m29952a());
    }

    /* renamed from: a */
    public static void m24418a(Context context) {
        Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_stat_notify)).getBitmap();
        CharSequence string = context.getString(R.string.notification_fun_reminder_title);
        CharSequence c = djo.m27605c(context, R.array.notification_fun_reminders_content);
        C5264d a = new C5264d(context).m29953a((int) R.drawable.ic_stat_notify).m29959a(bitmap).m29968b(true).m29971c(string).m29962a(string).m29967b(c).m29961a(new C5263c().m29948a(string).m29949b(c));
        Intent intent = new Intent(context, SplashScreenActivity.class);
        intent.putExtra("from_notification", true);
        intent.putExtra("noti_message", c);
        a.m29958a(PendingIntent.getActivity(context, 0, intent, 134217728));
        cqe.m24431c(context).notify(1000, a.m29952a());
    }

    /* renamed from: b */
    public static void m24428b(Context context) {
        Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_stat_notify)).getBitmap();
        CharSequence string = context.getString(R.string.notificaiton_upload_quota_refilled_title);
        CharSequence string2 = context.getString(R.string.notification_upload_quota_refilled_content);
        C5264d a = new C5264d(context).m29953a((int) R.drawable.ic_stat_notify).m29959a(bitmap).m29968b(true).m29971c(string).m29962a(string).m29967b(string2).m29961a(new C5263c().m29948a(string).m29949b(string2));
        Intent intent = new Intent(context, SplashScreenActivity.class);
        intent.putExtra("from_notification", true);
        a.m29958a(PendingIntent.getActivity(context, 0, intent, 134217728));
        cqe.m24431c(context).notify(1500, a.m29952a());
    }

    /* renamed from: a */
    public static void m24426a(Context context, Uri uri, Bitmap bitmap) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, "image/*");
        intent.setFlags(268435457);
        String string = context.getString(R.string.notification_photo_saved);
        PackageManager packageManager = context.getPackageManager();
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setType("image/*");
        intent2.putExtra("android.intent.extra.STREAM", uri);
        cqe.m24425a(context, uri, AdError.SERVER_ERROR_CODE, string, bitmap, intent, true, true, djs.m27612a(packageManager, intent2, context.getString(R.string.action_share), "com.ninegag."));
    }

    /* renamed from: a */
    private static void m24425a(Context context, Uri uri, int i, String str, Bitmap bitmap, Intent intent, boolean z, boolean z2, Intent intent2) {
        C5264d b = new C5264d(context).m29953a((int) R.drawable.ic_notification_save_image).m29959a(((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_stat_notify)).getBitmap()).m29968b(z).m29962a((CharSequence) str).m29967b(context.getString(R.string.notification_click_to_view_photo));
        b.m29961a(new C5262b().m29946a(bitmap));
        b.m29971c((CharSequence) str);
        b.m29958a(PendingIntent.getActivity(context, 0, intent, 134217728));
        if (z2) {
            b.m29956a((int) R.drawable.ic_ab_share, context.getString(R.string.action_share), PendingIntent.getActivity(context, 0, intent2, 134217728));
        }
        cqe.m24431c(context).notify(i, b.m29952a());
    }

    /* renamed from: a */
    public static void m24419a(Context context, int i, String str, int i2) {
        int i3 = i + AdError.SERVER_ERROR_CODE;
        if (djy.m27641a()) {
            cqe.m24431c(context).notify(i3, new C5264d(context).m29953a((int) R.drawable.ic_notification_save_image).m29962a((CharSequence) str).m29955a(100, i2, false).m29952a());
            return;
        }
        cqe.m24420a(context, i3, str, i2, str);
    }

    /* renamed from: a */
    public static void m24424a(Context context, int i, String str, String str2, int i2, String str3, Bitmap bitmap) {
        if (djy.m27641a()) {
            cqe.m24430b(context, i, str, str2, i2, str3, bitmap);
        } else {
            cqe.m24429b(context, i, str, str2, i2, str3);
        }
    }

    /* renamed from: a */
    public static void m24423a(Context context, int i, String str, String str2, int i2, String str3) {
        cqe.m24424a(context, i, str, str2, i2, str3, null);
    }

    /* renamed from: b */
    public static void m24429b(Context context, int i, String str, String str2, int i2, String str3) {
        if (i2 > 100) {
            cqe.m24433d(context, i, str, str2, i2, str3);
        } else {
            cqe.m24432c(context, i, str, str2, i2, str3);
        }
    }

    /* renamed from: c */
    public static void m24432c(Context context, int i, String str, String str2, int i2, String str3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_upload_progress_compat);
        remoteViews.setTextViewText(R.id.notification_title, context.getString(R.string.uploading));
        remoteViews.setProgressBar(R.id.progress, 100, i2, false);
        Notification notification = new Notification();
        notification.tickerText = context.getString(R.string.notification_ticker_uploading);
        notification.icon = R.drawable.ic_notification_logo;
        notification.contentIntent = null;
        notification.contentView = remoteViews;
        cqe.m24431c(context).notify(i, notification);
    }

    /* renamed from: d */
    public static void m24433d(Context context, int i, String str, String str2, int i2, String str3) {
        Intent intent = new Intent(context, PostCommentsActivity.class);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
        intent.putExtra("embed_post", true);
        intent.putExtra("external", true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_upload_finish_compat);
        remoteViews.setTextViewText(R.id.notification_title, context.getString(R.string.upload_finished));
        remoteViews.setTextViewText(R.id.notification_content, context.getString(R.string.notification_upload_finished_share));
        Notification notification = new Notification();
        notification.tickerText = context.getString(R.string.notification_ticker_uploading);
        notification.icon = R.drawable.ic_notification_logo;
        notification.contentIntent = activity;
        notification.contentView = remoteViews;
        cqe.m24431c(context).notify(i, notification);
    }

    /* renamed from: b */
    public static void m24430b(Context context, int i, String str, String str2, int i2, String str3, Bitmap bitmap) {
        Intent intent = new Intent(context, PostCommentsActivity.class);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
        intent.putExtra("embed_post", true);
        intent.putExtra("external", true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Intent a = djs.m27614a(null, String.format("http://9gag.com/gag/%s?ref=android", new Object[]{str2}));
        C5264d a2 = new C5264d(context).m29953a((int) R.drawable.ic_stat_notify).m29958a(activity);
        if (i2 > 100) {
            CharSequence string = context.getString(R.string.notification_upload_finished_share);
            a2.m29955a(0, 0, false);
            a2.m29962a(context.getString(R.string.upload_finished));
            a2.m29968b(true);
            a2.m29967b(string);
            if (djy.m27641a()) {
                a2.m29956a((int) R.drawable.ic_ab_share, context.getString(R.string.action_share), PendingIntent.getActivity(context, 0, a, 134217728));
                if (bitmap != null) {
                    a2.m29961a(new C5262b().m29946a(bitmap).m29947a(string));
                }
            }
        } else {
            a2.m29955a(100, i2, false);
            a2.m29962a(context.getString(R.string.uploading));
            a2.m29968b(false);
            a2.m29971c(context.getString(R.string.notification_ticker_uploading));
        }
        cqe.m24431c(context).notify(i, a2.m29952a());
    }

    /* renamed from: a */
    public static void m24422a(Context context, int i, String str, String str2) {
        C5264d a = new C5264d(context).m29968b(false).m29953a((int) R.drawable.ic_stat_notify);
        if (TextUtils.isEmpty(str2)) {
            a.m29962a(context.getString(R.string.upload_failed));
        } else {
            a.m29962a((CharSequence) str2);
        }
        a.m29967b(context.getString(R.string.upload_no_retry));
        cqe.m24431c(context).notify(i, a.m29952a());
    }

    /* renamed from: c */
    private static NotificationManager m24431c(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static void m24420a(Context context, int i, String str, int i2, String str2) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_upload_progress_compat);
        remoteViews.setTextViewText(R.id.notification_title, str);
        remoteViews.setProgressBar(R.id.progress, 100, i2, false);
        Notification notification = new Notification();
        notification.tickerText = str;
        notification.icon = R.drawable.ic_notification_logo;
        notification.contentIntent = null;
        notification.contentView = remoteViews;
        cqe.m24431c(context).notify(i, notification);
    }
}
