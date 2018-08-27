package com.p000;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.eq.C5301a;

@TargetApi(9)
/* compiled from: NotificationCompatBase */
/* renamed from: eh */
public class eh {
    /* renamed from: a */
    private static Method f23599a;

    /* compiled from: NotificationCompatBase */
    /* renamed from: eh$a */
    public static abstract class C5259a {

        /* compiled from: NotificationCompatBase */
        /* renamed from: eh$a$a */
        public interface C5257a {
        }

        /* renamed from: a */
        public abstract int mo4683a();

        /* renamed from: b */
        public abstract CharSequence mo4684b();

        /* renamed from: c */
        public abstract PendingIntent mo4685c();

        /* renamed from: d */
        public abstract Bundle mo4686d();

        /* renamed from: e */
        public abstract boolean mo4687e();

        /* renamed from: g */
        public abstract C5301a[] mo4688g();
    }

    /* renamed from: a */
    public static Notification m30018a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (f23599a == null) {
            try {
                f23599a = Notification.class.getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class});
            } catch (Throwable e) {
                Throwable e2;
                throw new RuntimeException(e2);
            }
        }
        try {
            f23599a.invoke(notification, new Object[]{context, charSequence, charSequence2, pendingIntent});
            notification.fullScreenIntent = pendingIntent2;
            return notification;
        } catch (IllegalAccessException e3) {
            e2 = e3;
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            e2 = e4;
            throw new RuntimeException(e2);
        }
    }
}
