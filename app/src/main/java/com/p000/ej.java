package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

@TargetApi(14)
/* compiled from: NotificationCompatIceCreamSandwich */
/* renamed from: ej */
class ej {

    /* compiled from: NotificationCompatIceCreamSandwich */
    /* renamed from: ej$a */
    public static class C5281a implements ec {
        /* renamed from: a */
        private Builder f23600a;

        public C5281a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
            this.f23600a = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23600a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            return this.f23600a.getNotification();
        }
    }
}
