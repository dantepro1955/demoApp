package com.p000;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import p000.dax.C4749a;

/* compiled from: PushRegistratorADM */
/* renamed from: day */
public class day implements dax {
    /* renamed from: a */
    private static C4749a f21000a;
    /* renamed from: b */
    private static boolean f21001b = false;

    /* renamed from: a */
    public void mo4304a(final Context context, String str, final C4749a c4749a) {
        f21000a = c4749a;
        new Thread(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ day f20999c;

            public void run() {
                ADM adm = new ADM(context);
                String registrationId = adm.getRegistrationId();
                if (registrationId == null) {
                    adm.startRegister();
                } else {
                    dat.a(dat$c.DEBUG, "ADM Already registed with ID:" + registrationId);
                    c4749a.mo4300a(registrationId);
                }
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                }
                if (!day.f21001b) {
                    dat.a(dat$c.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the reciever, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                    day.m26170a(null);
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static void m26170a(String str) {
        f21001b = true;
        f21000a.mo4300a(str);
    }
}
