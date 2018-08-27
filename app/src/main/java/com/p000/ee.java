package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import p000.eh.C5259a;

@TargetApi(20)
/* compiled from: NotificationCompatApi20 */
/* renamed from: ee */
class ee {

    /* compiled from: NotificationCompatApi20 */
    /* renamed from: ee$a */
    public static class C5278a implements eb, ec {
        /* renamed from: a */
        private Builder f23589a;
        /* renamed from: b */
        private Bundle f23590b;
        /* renamed from: c */
        private RemoteViews f23591c;
        /* renamed from: d */
        private RemoteViews f23592d;

        public C5278a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f23589a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            this.f23590b = new Bundle();
            if (bundle != null) {
                this.f23590b.putAll(bundle);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                this.f23590b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.f23591c = remoteViews2;
            this.f23592d = remoteViews3;
        }

        /* renamed from: a */
        public void mo4693a(C5259a c5259a) {
            ee.m30010a(this.f23589a, c5259a);
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23589a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            this.f23589a.setExtras(this.f23590b);
            Notification build = this.f23589a.build();
            if (this.f23591c != null) {
                build.contentView = this.f23591c;
            }
            if (this.f23592d != null) {
                build.bigContentView = this.f23592d;
            }
            return build;
        }
    }

    /* renamed from: a */
    public static void m30010a(Builder builder, C5259a c5259a) {
        Bundle bundle;
        Action.Builder builder2 = new Action.Builder(c5259a.mo4683a(), c5259a.mo4684b(), c5259a.mo4685c());
        if (c5259a.mo4688g() != null) {
            for (RemoteInput addRemoteInput : ep.m30075a(c5259a.mo4688g())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        if (c5259a.mo4686d() != null) {
            bundle = new Bundle(c5259a.mo4686d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c5259a.mo4687e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}
