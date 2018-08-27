package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import p000.eh.C5259a;

@TargetApi(19)
/* compiled from: NotificationCompatKitKat */
/* renamed from: el */
class el {

    /* compiled from: NotificationCompatKitKat */
    /* renamed from: el$a */
    public static class C5283a implements eb, ec {
        /* renamed from: a */
        private Builder f23610a;
        /* renamed from: b */
        private Bundle f23611b;
        /* renamed from: c */
        private List<Bundle> f23612c = new ArrayList();
        /* renamed from: d */
        private RemoteViews f23613d;
        /* renamed from: e */
        private RemoteViews f23614e;

        public C5283a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f23610a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            this.f23611b = new Bundle();
            if (bundle != null) {
                this.f23611b.putAll(bundle);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                this.f23611b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.f23611b.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f23611b.putString("android.support.groupKey", str);
                if (z5) {
                    this.f23611b.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f23611b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f23611b.putString("android.support.sortKey", str2);
            }
            this.f23613d = remoteViews2;
            this.f23614e = remoteViews3;
        }

        /* renamed from: a */
        public void mo4693a(C5259a c5259a) {
            this.f23612c.add(ek.m30025a(this.f23610a, c5259a));
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23610a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            SparseArray a = ek.m30027a(this.f23612c);
            if (a != null) {
                this.f23611b.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f23610a.setExtras(this.f23611b);
            Notification build = this.f23610a.build();
            if (this.f23613d != null) {
                build.contentView = this.f23613d;
            }
            if (this.f23614e != null) {
                build.bigContentView = this.f23614e;
            }
            return build;
        }
    }

    /* renamed from: a */
    public static Bundle m30034a(Notification notification) {
        return notification.extras;
    }
}
