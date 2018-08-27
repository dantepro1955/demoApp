package com.p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

/* renamed from: aow */
public abstract class aow implements OnClickListener {

    /* renamed from: aow$1 */
    class C06731 extends aow {
        /* renamed from: a */
        final /* synthetic */ Intent f3853a;
        /* renamed from: b */
        final /* synthetic */ Activity f3854b;
        /* renamed from: c */
        final /* synthetic */ int f3855c;

        C06731(Intent intent, Activity activity, int i) {
            this.f3853a = intent;
            this.f3854b = activity;
            this.f3855c = i;
        }

        /* renamed from: a */
        public void mo596a() {
            if (this.f3853a != null) {
                this.f3854b.startActivityForResult(this.f3853a, this.f3855c);
            }
        }
    }

    /* renamed from: aow$2 */
    class C06742 extends aow {
        /* renamed from: a */
        final /* synthetic */ Intent f3856a;
        /* renamed from: b */
        final /* synthetic */ Fragment f3857b;
        /* renamed from: c */
        final /* synthetic */ int f3858c;

        C06742(Intent intent, Fragment fragment, int i) {
            this.f3856a = intent;
            this.f3857b = fragment;
            this.f3858c = i;
        }

        /* renamed from: a */
        public void mo596a() {
            if (this.f3856a != null) {
                this.f3857b.startActivityForResult(this.f3856a, this.f3858c);
            }
        }
    }

    /* renamed from: aow$3 */
    class C06753 extends aow {
        /* renamed from: a */
        final /* synthetic */ Intent f3859a;
        /* renamed from: b */
        final /* synthetic */ ash f3860b;
        /* renamed from: c */
        final /* synthetic */ int f3861c;

        C06753(Intent intent, ash ash, int i) {
            this.f3859a = intent;
            this.f3860b = ash;
            this.f3861c = i;
        }

        /* renamed from: a */
        public void mo596a() {
            if (this.f3859a != null) {
                this.f3860b.startActivityForResult(this.f3859a, this.f3861c);
            }
        }
    }

    /* renamed from: a */
    public static aow m4765a(Activity activity, Intent intent, int i) {
        return new C06731(intent, activity, i);
    }

    /* renamed from: a */
    public static aow m4766a(Fragment fragment, Intent intent, int i) {
        return new C06742(intent, fragment, i);
    }

    /* renamed from: a */
    public static aow m4767a(ash ash, Intent intent, int i) {
        return new C06753(intent, ash, i);
    }

    /* renamed from: a */
    protected abstract void mo596a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo596a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
