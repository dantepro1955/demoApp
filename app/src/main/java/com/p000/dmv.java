package com.p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;

/* compiled from: LaunchImageUI */
/* renamed from: dmv */
public abstract class dmv implements OnClickListener {
    /* renamed from: a */
    private ApiBroadcast f22276a;
    /* renamed from: b */
    private C4094a f22277b;

    /* compiled from: LaunchImageUI */
    /* renamed from: dmv$a */
    public interface C4094a {
        void onClose();

        void onOpen(ApiBroadcast apiBroadcast);
    }

    /* compiled from: LaunchImageUI */
    /* renamed from: dmv$1 */
    class C49941 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dmv f22275a;

        C49941(dmv dmv) {
            this.f22275a = dmv;
        }

        public void run() {
            if (this.f22275a.f22277b != null) {
                this.f22275a.f22277b.onClose();
            }
        }
    }

    /* renamed from: a */
    protected abstract int m28115a();

    /* renamed from: a */
    protected abstract ImageView m28117a(View view);

    /* renamed from: a */
    protected abstract void m28118a(ImageView imageView, ApiBroadcast apiBroadcast);

    public dmv(ApiBroadcast apiBroadcast, C4094a c4094a) {
        this.f22276a = apiBroadcast;
        this.f22277b = c4094a;
    }

    /* renamed from: a */
    public View m28116a(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(m28115a(), null);
        ImageView a = m28117a(inflate);
        m28118a(a, this.f22276a);
        a.setOnClickListener(this);
        long j = (long) (this.f22276a.launch_image.dismissAfterTime * 1000);
        if (j <= 0) {
            j = 3000;
        }
        inflate.postDelayed(new C49941(this), j);
        return inflate;
    }

    public void onClick(View view) {
        if (this.f22277b != null) {
            this.f22277b.onOpen(this.f22276a);
        }
    }
}
