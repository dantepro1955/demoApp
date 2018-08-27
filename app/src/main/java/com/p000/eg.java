package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.eh.C5259a;

@TargetApi(24)
/* compiled from: NotificationCompatApi24 */
/* renamed from: eg */
class eg {

    /* compiled from: NotificationCompatApi24 */
    /* renamed from: eg$a */
    public static class C5280a implements eb, ec {
        /* renamed from: a */
        private Builder f23598a;

        public C5280a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f23598a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            if (remoteViews2 != null) {
                this.f23598a.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.f23598a.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.f23598a.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f23598a.addPerson((String) it.next());
            }
        }

        /* renamed from: a */
        public void mo4693a(C5259a c5259a) {
            Bundle bundle;
            Action.Builder builder = new Action.Builder(c5259a.mo4683a(), c5259a.mo4684b(), c5259a.mo4685c());
            if (c5259a.mo4688g() != null) {
                for (RemoteInput addRemoteInput : ep.m30075a(c5259a.mo4688g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (c5259a.mo4686d() != null) {
                bundle = new Bundle(c5259a.mo4686d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", c5259a.mo4687e());
            builder.addExtras(bundle);
            builder.setAllowGeneratedReplies(c5259a.mo4687e());
            this.f23598a.addAction(builder.build());
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23598a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            return this.f23598a.build();
        }
    }

    /* renamed from: a */
    public static void m30017a(ec ecVar, CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, List<Long> list2, List<CharSequence> list3, List<String> list4, List<Uri> list5) {
        MessagingStyle conversationTitle = new MessagingStyle(charSequence).setConversationTitle(charSequence2);
        for (int i = 0; i < list.size(); i++) {
            Message message = new Message((CharSequence) list.get(i), ((Long) list2.get(i)).longValue(), (CharSequence) list3.get(i));
            if (list4.get(i) != null) {
                message.setData((String) list4.get(i), (Uri) list5.get(i));
            }
            conversationTitle.addMessage(message);
        }
        conversationTitle.setBuilder(ecVar.mo4692a());
    }
}
