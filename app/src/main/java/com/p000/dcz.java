package com.p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.AccessToken;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.under9.android.comments.service.TaskQueueService;
import java.util.HashMap;

/* compiled from: CommentSystemTaskQueueController */
/* renamed from: dcz */
public class dcz {
    /* renamed from: a */
    private Activity f21200a;
    /* renamed from: b */
    private HashMap<Integer, dec> f21201b = new HashMap();
    /* renamed from: c */
    private String f21202c = "";
    /* renamed from: d */
    private boolean f21203d = false;
    /* renamed from: e */
    private BroadcastReceiver f21204e = new C48061(this);

    /* compiled from: CommentSystemTaskQueueController */
    /* renamed from: dcz$1 */
    class C48061 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ dcz f21199a;

        C48061(dcz dcz) {
            this.f21199a = dcz;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(deb.f21275l, -1);
                if (this.f21199a.f21201b.containsKey(Integer.valueOf(intExtra))) {
                    ((dec) this.f21199a.f21201b.get(Integer.valueOf(intExtra))).mo3773a(intent);
                    this.f21199a.f21201b.remove(Integer.valueOf(intExtra));
                }
            }
        }
    }

    public dcz(String str) {
        this.f21202c = str;
    }

    /* renamed from: a */
    public void m26466a(Activity activity) {
        this.f21200a = activity;
        this.f21200a.registerReceiver(this.f21204e, new IntentFilter(dct.m26395a().f21149b));
        this.f21200a.registerReceiver(this.f21204e, new IntentFilter(dct.m26395a().f21150c));
        this.f21203d = true;
    }

    /* renamed from: a */
    public void m26464a() {
        if (this.f21203d) {
            this.f21200a.unregisterReceiver(this.f21204e);
            this.f21203d = false;
        }
        this.f21200a = null;
    }

    /* renamed from: a */
    public void m26468a(String str) {
        this.f21202c = str;
    }

    /* renamed from: a */
    private void m26461a(Intent intent, dec dec) {
        if (dec != null) {
            this.f21201b.put(Integer.valueOf(dec.m22588a()), dec);
            intent.putExtra(deb.f21275l, dec.m22588a());
        }
    }

    /* renamed from: b */
    private dcs m26462b() {
        return dct.m26395a().m26408d();
    }

    /* renamed from: a */
    public void m26471a(String str, int i, String str2, String str3, String str4, dec dec) {
        m26469a(str, i, str2, m26462b().m26392h(), dda.m26492a().m26561q(), false, str3, str4, null, dec);
    }

    /* renamed from: b */
    public void m26477b(String str, int i, String str2, String str3, String str4, dec dec) {
        m26469a(str, i, str2, m26462b().m26392h(), dda.m26492a().m26561q(), false, str3, null, str4, dec);
    }

    /* renamed from: a */
    public void m26470a(String str, int i, String str2, dec dec) {
        m26469a(str, i, str2, m26462b().m26392h(), dda.m26492a().m26561q(), true, null, null, null, dec);
    }

    /* renamed from: a */
    public void m26469a(String str, int i, String str2, int i2, int i3, boolean z, String str3, String str4, String str5, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 100);
            c.putExtra("auth", this.f21202c);
            c.putExtra("url", str);
            c.putExtra("order", i);
            c.putExtra("comment_id", str2);
            c.putExtra("count", i2);
            c.putExtra("level", i3);
            c.putExtra("clear_data", z);
            c.putExtra("ref", str3);
            c.putExtra("parent_id", str4);
            c.putExtra("after_id", str5);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: a */
    public void m26473a(String str, String str2, int i, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 105);
            c.putExtra("url", str);
            c.putExtra("order", i);
            c.putExtra("auth", this.f21202c);
            c.putExtra("comment_ids", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: a */
    public void m26474a(String str, String str2, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 104);
            c.putExtra("auth", this.f21202c);
            c.putExtra("url", str);
            c.putExtra("comment_ids", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: a */
    public void m26465a(long j, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 110);
            c.putExtra("auth", this.f21202c);
            c.putExtra("item_id", j);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: a */
    public void m26472a(String str, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 101);
            c.putExtra("auth", this.f21202c);
            c.putExtra("comment_id", str);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: b */
    public void m26478b(String str, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 102);
            c.putExtra("auth", this.f21202c);
            c.putExtra("comment_id", str);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: c */
    public void m26480c(String str, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 103);
            c.putExtra("auth", this.f21202c);
            c.putExtra("comment_id", str);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: a */
    public void m26467a(dec dec) {
        m26475a(null, true, dec);
    }

    /* renamed from: d */
    public void m26482d(String str, dec dec) {
        m26475a(str, false, dec);
    }

    /* renamed from: a */
    public void m26475a(String str, boolean z, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, HttpStatus.HTTP_OK);
            c.putExtra(AccessToken.USER_ID_KEY, str);
            c.putExtra("is_anonymous", z);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: b */
    public void m26479b(String str, String str2, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 112);
            c.putExtra("auth", this.f21202c);
            c.putExtra("url", str);
            c.putExtra("comment_id", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: c */
    public void m26481c(String str, String str2, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 111);
            c.putExtra("auth", this.f21202c);
            c.putExtra("url", str);
            c.putExtra("comment_id", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: d */
    public void m26483d(String str, String str2, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, 113);
            c.putExtra("auth", this.f21202c);
            c.putExtra("url", str);
            c.putExtra("comment_id", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: b */
    public void m26476b(dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION);
            c.putExtra("auth", this.f21202c);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: e */
    public void m26484e(String str, String str2, dec dec) {
        if (this.f21200a != null) {
            Intent c = m26463c();
            m26461a(c, dec);
            c.putExtra(TaskQueueService.f19251a, InterstitialErrorStatus.NOT_LOADED);
            c.putExtra("url", str);
            c.putExtra("auth", this.f21202c);
            c.putExtra("mediaPath", str2);
            this.f21200a.startService(c);
        }
    }

    /* renamed from: c */
    private Intent m26463c() {
        if (this.f21200a == null) {
            return null;
        }
        return new Intent(this.f21200a, TaskQueueService.class);
    }
}
