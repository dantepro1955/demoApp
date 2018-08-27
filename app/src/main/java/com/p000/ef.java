package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import p000.eh.C5259a;

@TargetApi(21)
/* compiled from: NotificationCompatApi21 */
/* renamed from: ef */
class ef {

    /* compiled from: NotificationCompatApi21 */
    /* renamed from: ef$a */
    public static class C5279a implements eb, ec {
        /* renamed from: a */
        private Builder f23593a;
        /* renamed from: b */
        private Bundle f23594b;
        /* renamed from: c */
        private RemoteViews f23595c;
        /* renamed from: d */
        private RemoteViews f23596d;
        /* renamed from: e */
        private RemoteViews f23597e;

        public C5279a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f23593a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
            this.f23594b = new Bundle();
            if (bundle != null) {
                this.f23594b.putAll(bundle);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f23593a.addPerson((String) it.next());
            }
            this.f23595c = remoteViews2;
            this.f23596d = remoteViews3;
            this.f23597e = remoteViews4;
        }

        /* renamed from: a */
        public void mo4693a(C5259a c5259a) {
            ee.m30010a(this.f23593a, c5259a);
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23593a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            this.f23593a.setExtras(this.f23594b);
            Notification build = this.f23593a.build();
            if (this.f23595c != null) {
                build.contentView = this.f23595c;
            }
            if (this.f23596d != null) {
                build.bigContentView = this.f23596d;
            }
            if (this.f23597e != null) {
                build.headsUpContentView = this.f23597e;
            }
            return build;
        }
    }
}
