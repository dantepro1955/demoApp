package com.p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import java.util.concurrent.CountDownLatch;

/* compiled from: CrashPromptDialog */
/* renamed from: abh */
class abh {
    /* renamed from: a */
    private final C0015b f185a;
    /* renamed from: b */
    private final Builder f186b;

    /* compiled from: CrashPromptDialog */
    /* renamed from: abh$a */
    interface C0014a {
        /* renamed from: a */
        void mo10a(boolean z);
    }

    /* compiled from: CrashPromptDialog */
    /* renamed from: abh$b */
    static class C0015b {
        /* renamed from: a */
        private boolean f183a;
        /* renamed from: b */
        private final CountDownLatch f184b;

        private C0015b() {
            this.f183a = false;
            this.f184b = new CountDownLatch(1);
        }

        /* renamed from: a */
        void m212a(boolean z) {
            this.f183a = z;
            this.f184b.countDown();
        }

        /* renamed from: a */
        boolean m213a() {
            return this.f183a;
        }

        /* renamed from: b */
        void m214b() {
            try {
                this.f184b.await();
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: a */
    public static abh m216a(Activity activity, PromptSettingsData promptSettingsData, final C0014a c0014a) {
        final C0015b c0015b = new C0015b();
        abt abt = new abt(activity, promptSettingsData);
        Builder builder = new Builder(activity);
        View a = abh.m217a(activity, abt.m363b());
        builder.setView(a).setTitle(abt.m362a()).setCancelable(false).setNeutralButton(abt.m364c(), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                c0015b.m212a(true);
                dialogInterface.dismiss();
            }
        });
        if (promptSettingsData.f24224d) {
            builder.setNegativeButton(abt.m366e(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    c0015b.m212a(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (promptSettingsData.f24226f) {
            builder.setPositiveButton(abt.m365d(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    c0014a.mo10a(true);
                    c0015b.m212a(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new abh(builder, c0015b);
    }

    /* renamed from: a */
    private static ScrollView m217a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = abh.m215a(f, 5);
        View textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(abh.m215a(f, 14), abh.m215a(f, 2), abh.m215a(f, 10), abh.m215a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    /* renamed from: a */
    private static int m215a(float f, int i) {
        return (int) (((float) i) * f);
    }

    private abh(Builder builder, C0015b c0015b) {
        this.f185a = c0015b;
        this.f186b = builder;
    }

    /* renamed from: a */
    public void m218a() {
        this.f186b.show();
    }

    /* renamed from: b */
    public void m219b() {
        this.f185a.m214b();
    }

    /* renamed from: c */
    public boolean m220c() {
        return this.f185a.m213a();
    }
}
