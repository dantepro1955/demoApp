package com.p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.zzaaz;
import com.google.android.gms.internal.zzaaz.C0724a;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;
import p000.ahs.C0180b;
import p000.ahs.C0181c;
import p000.ed.C5263c;
import p000.ed.C5264d;

/* renamed from: anj */
public class anj extends aqm {
    /* renamed from: a */
    public static final int f3775a = aqm.f3774b;
    /* renamed from: c */
    private static final anj f3776c = new anj();

    @SuppressLint({"HandlerLeak"})
    /* renamed from: anj$a */
    class C0643a extends Handler {
        /* renamed from: a */
        final /* synthetic */ anj f3771a;
        /* renamed from: b */
        private final Context f3772b;

        public C0643a(anj anj, Context context) {
            this.f3771a = anj;
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f3772b = context.getApplicationContext();
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    int a = this.f3771a.mo565a(this.f3772b);
                    if (this.f3771a.mo568a(a)) {
                        this.f3771a.m4540a(this.f3772b, a);
                        return;
                    }
                    return;
                default:
                    Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
                    return;
            }
        }
    }

    anj() {
    }

    /* renamed from: a */
    public static anj m4530a() {
        return f3776c;
    }

    /* renamed from: a */
    public int mo565a(Context context) {
        return super.mo565a(context);
    }

    /* renamed from: a */
    public Dialog m4532a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m4534a((Context) activity, i, aow.m4765a(activity, mo571b(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public Dialog m4533a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(aov.m4762c(activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        m4539a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    public Dialog m4534a(Context context, int i, aow aow, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(aov.m4762c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = aov.m4764e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, aow);
        }
        e = aov.m4758a(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    public PendingIntent mo566a(Context context, int i, int i2) {
        return super.mo566a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo567a(Context context, int i, int i2, String str) {
        return super.mo567a(context, i, i2, str);
    }

    /* renamed from: a */
    public PendingIntent m4537a(Context context, ConnectionResult connectionResult) {
        return connectionResult.m19504a() ? connectionResult.m19507d() : mo566a(context, connectionResult.m19506c(), 0);
    }

    /* renamed from: a */
    public zzaaz m4538a(Context context, C0724a c0724a) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(BaseUploadSourceActivity.KEY_PACKAGE);
        BroadcastReceiver zzaaz = new zzaaz(c0724a);
        context.registerReceiver(zzaaz, intentFilter);
        zzaaz.m19616a(context);
        if (m4523a(context, "com.google.android.gms")) {
            return zzaaz;
        }
        c0724a.mo629a();
        zzaaz.m19615a();
        return null;
    }

    /* renamed from: a */
    public void m4539a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        boolean z;
        try {
            z = activity instanceof FragmentActivity;
        } catch (NoClassDefFoundError e) {
            z = false;
        }
        if (z) {
            SupportErrorDialogFragment.m19512a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        ani.m4516a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: a */
    public void m4540a(Context context, int i) {
        m4541a(context, i, null);
    }

    /* renamed from: a */
    public void m4541a(Context context, int i, String str) {
        m4542a(context, i, str, mo567a(context, i, 0, "n"));
    }

    @TargetApi(20)
    /* renamed from: a */
    void m4542a(Context context, int i, String str, PendingIntent pendingIntent) {
        if (i == 18) {
            m4552c(context);
        } else if (pendingIntent != null) {
            Notification build;
            int i2;
            CharSequence b = aov.m4761b(context, i);
            CharSequence d = aov.m4763d(context, i);
            Resources resources = context.getResources();
            if (apw.m4891b(context)) {
                aoi.m4684a(aqd.m4918h());
                build = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b).setStyle(new BigTextStyle().bigText(d)).addAction(C0180b.common_full_open_on_phone, resources.getString(C0181c.common_open_on_phone), pendingIntent).build();
            } else {
                build = new C5264d(context).a(17301642).c(resources.getString(C0181c.common_google_play_services_notification_ticker)).a(System.currentTimeMillis()).b(true).a(pendingIntent).a(b).b(d).c(true).a(new C5263c().b(d)).a();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    aqo.zzayB.set(false);
                    i2 = 10436;
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (str == null) {
                notificationManager.notify(i2, build);
            } else {
                notificationManager.notify(str, i2, build);
            }
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: a */
    public final boolean mo568a(int i) {
        return super.mo568a(i);
    }

    /* renamed from: a */
    public boolean m4544a(Activity activity, ash ash, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m4534a((Context) activity, i, aow.m4767a(ash, mo571b(activity, i, "d"), i2), onCancelListener);
        if (a == null) {
            return false;
        }
        m4539a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public boolean m4545a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = m4537a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m4542a(context, connectionResult.m19506c(), null, GoogleApiActivity.zza(context, a, i));
        return true;
    }

    /* renamed from: b */
    public int mo569b(Context context) {
        return super.mo569b(context);
    }

    @Deprecated
    /* renamed from: b */
    public Intent mo570b(int i) {
        return super.mo570b(i);
    }

    /* renamed from: b */
    public Intent mo571b(Context context, int i, String str) {
        return super.mo571b(context, i, str);
    }

    /* renamed from: b */
    public boolean m4549b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m4532a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m4539a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: b */
    public boolean mo572b(Context context, int i) {
        return super.mo572b(context, i);
    }

    /* renamed from: c */
    public final String mo573c(int i) {
        return super.mo573c(i);
    }

    /* renamed from: c */
    public void m4552c(Context context) {
        new C0643a(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
