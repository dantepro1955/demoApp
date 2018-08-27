package com.p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import p000.dax.C4749a;

/* compiled from: PushRegistratorGPS */
/* renamed from: daz */
public class daz implements dax {
    /* renamed from: c */
    private static int f21008c = 5;
    /* renamed from: a */
    private Context f21009a;
    /* renamed from: b */
    private C4749a f21010b;

    /* renamed from: a */
    public void mo4304a(Context context, String str, C4749a c4749a) {
        this.f21009a = context;
        this.f21010b = c4749a;
        try {
            if (m26179c()) {
                m26176a(str);
                return;
            }
            dat.a(dat$c.ERROR, "No valid Google Play services APK found.");
            this.f21010b.mo4300a(null);
        } catch (Throwable th) {
            dat.a(dat$c.ERROR, "Could not register with GCM due to an error with the AndroidManifest.xml file or with 'Google Play services'.", th);
            this.f21010b.mo4300a(null);
        }
    }

    /* renamed from: b */
    private boolean m26178b() {
        try {
            PackageManager packageManager = this.f21009a.getPackageManager();
            String str = (String) packageManager.getPackageInfo("com.android.vending", 1).applicationInfo.loadLabel(packageManager);
            if (str == null || str.equals("Market")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m26179c() {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f21009a);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(isGooglePlayServicesAvailable) && m26178b()) {
            dat.a(dat$c.INFO, "Google Play services Recoverable Error: " + isGooglePlayServicesAvailable);
            if (dat.f(this.f21009a).getBoolean("GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                return false;
            }
            try {
                m26175a(isGooglePlayServicesAvailable);
                return false;
            } catch (Throwable th) {
                return false;
            }
        }
        dat.a(dat$c.WARN, "Google Play services error: This device is not supported. Code:" + isGooglePlayServicesAvailable);
        return false;
    }

    /* renamed from: a */
    private void m26175a(final int i) {
        ((Activity) this.f21009a).runOnUiThread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ daz f21005b;

            /* compiled from: PushRegistratorGPS */
            /* renamed from: daz$1$1 */
            class C47591 implements OnClickListener {
                /* renamed from: a */
                final /* synthetic */ C47611 f21002a;

                C47591(C47611 c47611) {
                    this.f21002a = c47611;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Editor edit = dat.f(this.f21002a.f21005b.f21009a).edit();
                    edit.putBoolean("GT_DO_NOT_SHOW_MISSING_GPS", true);
                    edit.commit();
                }
            }

            /* compiled from: PushRegistratorGPS */
            /* renamed from: daz$1$2 */
            class C47602 implements OnClickListener {
                /* renamed from: a */
                final /* synthetic */ C47611 f21003a;

                C47602(C47611 c47611) {
                    this.f21003a = c47611;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        GooglePlayServicesUtil.getErrorPendingIntent(i, this.f21003a.f21005b.f21009a, 0).send();
                    } catch (CanceledException e) {
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }

            public void run() {
                new Builder(this.f21005b.f21009a).setMessage("To receive push notifications please press 'Update' to enable 'Google Play services'.").setPositiveButton("Update", new C47602(this)).setNegativeButton("Skip", new C47591(this)).setNeutralButton("Close", null).create().show();
            }
        });
    }

    /* renamed from: a */
    private void m26176a(final String str) {
        new Thread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ daz f21007b;

            public void run() {
                Object obj = null;
                int i = 0;
                while (i < daz.f21008c) {
                    try {
                        String register = GoogleCloudMessaging.getInstance(this.f21007b.f21009a).register(new String[]{str});
                        dat.a(dat$c.INFO, "Device registered, Google Registration ID = " + register);
                        this.f21007b.f21010b.mo4300a(register);
                        return;
                    } catch (Throwable e) {
                        if (!GoogleCloudMessaging.ERROR_SERVICE_NOT_AVAILABLE.equals(e.getMessage())) {
                            dat.a(dat$c.ERROR, "Error Getting Google Registration ID", e);
                            if (obj == null) {
                                this.f21007b.f21010b.mo4300a(null);
                                return;
                            }
                            return;
                        } else if (i >= daz.f21008c - 1) {
                            dat.a(dat$c.ERROR, "GCM_RETRY_COUNT of " + daz.f21008c + " exceed! Could not get a Google Registration Id", e);
                        } else {
                            dat.a(dat$c.INFO, "Google Play services returned SERVICE_NOT_AVAILABLE error. Current retry count: " + i, e);
                            if (i == 2) {
                                this.f21007b.f21010b.mo4300a(null);
                                obj = 1;
                            }
                            Thread.sleep((long) ((i + 1) * 10000));
                        }
                    } catch (Throwable th) {
                    }
                }
                return;
                i++;
            }
        }).start();
    }
}
