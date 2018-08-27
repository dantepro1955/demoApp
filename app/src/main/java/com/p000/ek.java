package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.facebook.applinks.AppLinkData;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.eh.C5259a;

@TargetApi(16)
/* compiled from: NotificationCompatJellybean */
/* renamed from: ek */
class ek {
    /* renamed from: a */
    private static final Object f23606a = new Object();
    /* renamed from: b */
    private static Field f23607b;
    /* renamed from: c */
    private static boolean f23608c;
    /* renamed from: d */
    private static final Object f23609d = new Object();

    /* compiled from: NotificationCompatJellybean */
    /* renamed from: ek$a */
    public static class C5282a implements eb, ec {
        /* renamed from: a */
        private Builder f23601a;
        /* renamed from: b */
        private final Bundle f23602b;
        /* renamed from: c */
        private List<Bundle> f23603c = new ArrayList();
        /* renamed from: d */
        private RemoteViews f23604d;
        /* renamed from: e */
        private RemoteViews f23605e;

        public C5282a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f23601a = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            this.f23602b = new Bundle();
            if (bundle != null) {
                this.f23602b.putAll(bundle);
            }
            if (z3) {
                this.f23602b.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f23602b.putString("android.support.groupKey", str);
                if (z4) {
                    this.f23602b.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f23602b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f23602b.putString("android.support.sortKey", str2);
            }
            this.f23604d = remoteViews2;
            this.f23605e = remoteViews3;
        }

        /* renamed from: a */
        public void mo4693a(C5259a c5259a) {
            this.f23603c.add(ek.m30025a(this.f23601a, c5259a));
        }

        /* renamed from: a */
        public Builder mo4692a() {
            return this.f23601a;
        }

        /* renamed from: b */
        public Notification mo4694b() {
            Notification build = this.f23601a.build();
            Bundle a = ek.m30026a(build);
            Bundle bundle = new Bundle(this.f23602b);
            for (String str : this.f23602b.keySet()) {
                if (a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a.putAll(bundle);
            SparseArray a2 = ek.m30027a(this.f23603c);
            if (a2 != null) {
                ek.m30026a(build).putSparseParcelableArray("android.support.actionExtras", a2);
            }
            if (this.f23604d != null) {
                build.contentView = this.f23604d;
            }
            if (this.f23605e != null) {
                build.bigContentView = this.f23605e;
            }
            return build;
        }
    }

    /* renamed from: a */
    public static void m30029a(ec ecVar, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(ecVar.mo4692a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m30028a(ec ecVar, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(ecVar.mo4692a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m30030a(ec ecVar, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        InboxStyle bigContentTitle = new InboxStyle(ecVar.mo4692a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m30027a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m30026a(Notification notification) {
        synchronized (f23606a) {
            if (f23608c) {
                return null;
            }
            try {
                if (f23607b == null) {
                    Field declaredField = Notification.class.getDeclaredField(AppLinkData.ARGUMENTS_EXTRAS_KEY);
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f23607b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f23608c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f23607b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f23607b.set(notification, bundle);
                }
                return bundle;
            } catch (Throwable e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f23608c = true;
                return null;
            } catch (Throwable e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f23608c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m30025a(Builder builder, C5259a c5259a) {
        builder.addAction(c5259a.mo4683a(), c5259a.mo4684b(), c5259a.mo4685c());
        Bundle bundle = new Bundle(c5259a.mo4686d());
        if (c5259a.mo4688g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", er.m30077a(c5259a.mo4688g()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c5259a.mo4687e());
        return bundle;
    }
}
