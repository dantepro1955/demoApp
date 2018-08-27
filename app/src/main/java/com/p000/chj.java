package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.share.internal.ShareConstants;
import com.millennialmedia.NativeAd.NativeErrorStatus;
import com.ninegag.android.app.R;
import java.io.File;

/* compiled from: DownloadController */
/* renamed from: chj */
public class chj implements dhu {
    /* renamed from: a */
    private static caf f9215a = caf.m12046a();
    /* renamed from: b */
    private static chj f9216b = new chj();
    /* renamed from: c */
    private Context f9217c;
    /* renamed from: d */
    private long f9218d;
    /* renamed from: e */
    private dhs f9219e = new dhs(2, 2, this);
    /* renamed from: f */
    private dhs f9220f = new dhs(1, 1, this);
    /* renamed from: g */
    private dhs f9221g = new dhs(1, 1, this);
    /* renamed from: h */
    private dhs f9222h;
    /* renamed from: i */
    private cac f9223i = f9215a.m12068d();
    /* renamed from: j */
    private hm<C1726a> f9224j;

    /* compiled from: DownloadController */
    /* renamed from: chj$a */
    public static class C1726a {
        /* renamed from: a */
        int f9200a = chj.f9215a.m12068d().m12029h();
        /* renamed from: b */
        String f9201b;
        /* renamed from: c */
        String f9202c;
        /* renamed from: d */
        String f9203d;
        /* renamed from: e */
        int f9204e;
        /* renamed from: f */
        int f9205f;
        /* renamed from: g */
        long f9206g;
        /* renamed from: h */
        boolean f9207h;
        /* renamed from: i */
        boolean f9208i;
        /* renamed from: j */
        boolean f9209j;
        /* renamed from: k */
        boolean f9210k;
        /* renamed from: l */
        boolean f9211l;
        /* renamed from: m */
        boolean f9212m;
        /* renamed from: n */
        int f9213n;
        /* renamed from: o */
        String f9214o;

        C1726a(int i, int i2, String str, String str2, int i3, long j) {
            this.f9213n = i;
            this.f9203d = str;
            this.f9202c = str2;
            this.f9204e = i3;
            this.f9205f = i2;
            this.f9206g = j;
            this.f9210k = false;
            this.f9209j = false;
            this.f9208i = false;
            this.f9207h = false;
        }

        public String toString() {
            return "id=" + this.f9200a + ", pool=" + this.f9213n + ", url=" + this.f9203d + ", path=" + this.f9202c + ", priority=" + this.f9204e + ", command=" + this.f9205f + ", callbackId=" + this.f9206g;
        }
    }

    /* renamed from: a */
    public static chj m13268a() {
        return f9216b;
    }

    public chj() {
        this.f9221g.a(true);
        this.f9222h = new dhs(1, 1, this);
        this.f9218d = 1001;
        this.f9224j = new hm();
    }

    /* renamed from: a */
    public void m13287a(Context context) {
        this.f9217c = context;
    }

    /* renamed from: b */
    public boolean m13291b() {
        return this.f9219e.e() && this.f9220f.e() && this.f9221g.e();
    }

    /* renamed from: a */
    public void m13283a(long j) {
    }

    /* renamed from: a */
    public void m13285a(long j, long j2, long j3) {
        C1726a c1726a = (C1726a) this.f9224j.a(j);
        if (c1726a != null && j3 > 0) {
            double d = ((double) j2) / ((double) j3);
            if (c1726a.f9209j) {
                m13274a(c1726a.f9201b, d);
            }
            if (c1726a.f9210k) {
                try {
                    m13270a(c1726a.f9200a, d);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: b */
    public void m13289b(long j) {
    }

    /* renamed from: a */
    public void m13284a(long j, long j2) {
        C1726a c1726a = (C1726a) this.f9224j.a(j);
        if (c1726a != null) {
            cld i;
            cct a;
            if (c1726a.f9211l) {
                i = f9215a.m12075g().f9370c.m13832i(c1726a.f9201b);
                if (i != null) {
                    a = cct.m12254a(i);
                    if (a.m12287j()) {
                        cqg.b(f9215a.f8449a, a);
                    } else {
                        cqg.a(f9215a.f8449a, a);
                    }
                } else {
                    return;
                }
            }
            if (c1726a.f9212m) {
                i = f9215a.m12075g().f9370c.m13832i(c1726a.f9201b);
                if (i != null) {
                    a = cct.m12254a(i);
                    if (a.m12287j()) {
                        cqg.b(f9215a.f8449a, a);
                    } else {
                        cqg.a(f9215a.f8449a, a, false, false);
                    }
                } else {
                    return;
                }
            }
            synchronized (this.f9224j) {
                this.f9224j.c(j);
            }
            m13271a(c1726a.f9205f, c1726a.f9201b, c1726a.f9206g);
        }
    }

    /* renamed from: b */
    public void m13290b(long j, long j2, long j3) {
        if (((C1726a) this.f9224j.a(j)) != null) {
        }
    }

    /* renamed from: a */
    public void m13286a(long j, String str) {
        C1726a c1726a = (C1726a) this.f9224j.a(j);
        if (c1726a != null) {
            chn.m13436n(c1726a.f9203d, str + " extra: " + c1726a.f9214o + "; parent writable: " + new File(c1726a.f9202c).getParentFile().canWrite());
            this.f9224j.c(j);
            boolean z = str != null && str.contains("ENOSPC");
            m13272a(c1726a.f9205f, c1726a.f9201b, z, c1726a.f9206g);
        }
    }

    /* renamed from: a */
    private void m13272a(int i, String str, boolean z, long j) {
        Intent intent = new Intent();
        intent.setAction("com.9gag.android.app.IMAGE_DOWNLOAD_CALLBACK");
        intent.putExtra(GraphResponse.SUCCESS_KEY, false);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        intent.putExtra("command", i);
        intent.putExtra("not_enough_space", z);
        intent.putExtra("callback_key", j);
        fg.a(this.f9217c).a(intent);
    }

    /* renamed from: a */
    private void m13271a(int i, String str, long j) {
        Intent intent = new Intent();
        intent.setAction("com.9gag.android.app.IMAGE_DOWNLOAD_CALLBACK");
        intent.putExtra(GraphResponse.SUCCESS_KEY, true);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        intent.putExtra("command", i);
        intent.putExtra("callback_key", j);
        fg.a(this.f9217c).a(intent);
    }

    /* renamed from: a */
    private void m13274a(String str, double d) {
        m13275a("com.9gag.android.app.IMAGE_DOWNLOAD_CALLBACK", str, d);
    }

    /* renamed from: a */
    private void m13270a(int i, double d) {
        cqe.a(this.f9217c, 0, this.f9217c.getString(R.string.post_action_save_photo_downloading), (int) (100.0d * d));
    }

    /* renamed from: a */
    private void m13275a(String str, String str2, double d) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("command", NativeErrorStatus.EXPIRED);
        intent.putExtra("progress", d);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
        fg.a(this.f9217c).a(intent);
    }

    /* renamed from: a */
    public void m13288a(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 102:
                m13279c(intent);
                return;
            case 104:
                m13282f(intent);
                return;
            case GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION /*300*/:
                m13280d(intent);
                return;
            case 302:
                m13277b(intent);
                return;
            case 303:
                m13281e(intent);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m13277b(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        int intExtra = intent.getIntExtra("priority", 0);
        long longExtra = intent.getLongExtra("callback_key", -1);
        ckb a = f9215a.m12075g().m13696a(stringExtra);
        if (a != null) {
            String a2 = f9215a.m12073f().m13498a(this.f9217c, a.f9492b, a.f9505o, this.f9223i.f8408e, a.f9506p);
            String a3 = a.m14149a();
            C1726a c1726a = new C1726a(1, 302, a3, a2, intExtra, longExtra);
            c1726a.f9201b = stringExtra;
            c1726a.f9209j = true;
            c1726a.f9208i = a3.equals(a.m14151c());
            m13273a(c1726a);
        }
    }

    /* renamed from: c */
    private void m13279c(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        int intExtra = intent.getIntExtra("priority", 0);
        int intExtra2 = intent.getIntExtra("src_size", this.f9223i.f8408e);
        boolean booleanExtra = intent.getBooleanExtra("save_after", false);
        boolean booleanExtra2 = intent.getBooleanExtra("share_after", false);
        boolean booleanExtra3 = intent.getBooleanExtra("send_ui_progress", true);
        boolean booleanExtra4 = intent.getBooleanExtra("send_notif_progress", false);
        long longExtra = intent.getLongExtra("callback_key", -1);
        if (stringExtra != null) {
            cld i = f9215a.m12075g().f9370c.m13832i(stringExtra);
            cct a = cct.m12254a(i);
            if (i == null || a == null) {
                chn.m13355Q("processDownloadPostImageIntent " + stringExtra);
                return;
            }
            String a2 = f9215a.m12073f().m13497a(this.f9217c, a.m12282e(), a.m12283f(), intExtra2);
            C1726a c1726a = new C1726a(booleanExtra ? 3 : 1, 102, a.m12299v(), a2, intExtra, longExtra);
            c1726a.f9201b = stringExtra;
            c1726a.f9209j = booleanExtra3;
            c1726a.f9210k = booleanExtra4;
            c1726a.f9208i = true;
            c1726a.f9211l = booleanExtra;
            c1726a.f9212m = booleanExtra2;
            m13273a(c1726a);
        }
    }

    /* renamed from: d */
    private void m13280d(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        int intExtra = intent.getIntExtra("priority", 0);
        int intExtra2 = intent.getIntExtra("src_size", this.f9223i.f8408e);
        boolean booleanExtra = intent.getBooleanExtra("save_after", false);
        intent.getBooleanExtra("share_after", false);
        boolean booleanExtra2 = intent.getBooleanExtra("send_ui_progress", true);
        boolean booleanExtra3 = intent.getBooleanExtra("send_notif_progress", true);
        long longExtra = intent.getLongExtra("callback_key", -1);
        cct a = cct.m12254a(f9215a.m12075g().f9370c.m13832i(stringExtra));
        if (a.R() == null) {
            chn.m13355Q("processDownloadGifIntent " + stringExtra);
            return;
        }
        C1726a c1726a = new C1726a(3, GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, a.m12258B(), f9215a.m12073f().m13505b(this.f9217c, a.m12282e(), a.m12283f(), intExtra2), intExtra, longExtra);
        c1726a.f9209j = booleanExtra2;
        c1726a.f9210k = booleanExtra3;
        c1726a.f9207h = true;
        c1726a.f9201b = stringExtra;
        c1726a.f9211l = booleanExtra;
        m13273a(c1726a);
    }

    /* renamed from: e */
    private void m13281e(Intent intent) {
        String stringExtra = intent.getStringExtra("gag_id");
        int intExtra = intent.getIntExtra("priority", 0);
        int intExtra2 = intent.getIntExtra("src_size", this.f9223i.f8408e);
        long longExtra = intent.getLongExtra("callback_key", -1);
        boolean booleanExtra = intent.getBooleanExtra("preload", false);
        if (stringExtra != null) {
            cct a = cct.m12254a(f9215a.m12075g().f9370c.m13832i(stringExtra));
            if (a.R() == null) {
                chn.m13355Q("processDownloadMp4Intent " + stringExtra);
                return;
            }
            String b = f9215a.m12073f().m13505b(this.f9217c, a.m12282e(), a.m12283f(), intExtra2);
            String B = a.m12258B();
            int i = 2;
            if (booleanExtra) {
                i = 4;
            }
            C1726a c1726a = new C1726a(i, 303, B, b, intExtra, longExtra);
            c1726a.f9209j = true;
            c1726a.f9207h = true;
            c1726a.f9201b = stringExtra;
            m13273a(c1726a);
        }
    }

    /* renamed from: f */
    private void m13282f(Intent intent) {
        int intExtra = intent.getIntExtra("priority", 0);
        String stringExtra = intent.getStringExtra("url");
        String stringExtra2 = intent.getStringExtra("path");
        String stringExtra3 = intent.getStringExtra("rlog.extraKey");
        long longExtra = intent.getLongExtra("callback_key", -1);
        if (stringExtra2 == null) {
            stringExtra2 = f9215a.m12073f().m13509c(this.f9217c, stringExtra);
        }
        C1726a c1726a = new C1726a(1, 104, stringExtra, stringExtra2, intExtra, longExtra);
        c1726a.f9214o = stringExtra3;
        m13273a(c1726a);
    }

    /* renamed from: a */
    private void m13273a(C1726a c1726a) {
        long j = this.f9218d;
        synchronized (this.f9224j) {
            this.f9224j.b(Long.valueOf(j).longValue(), c1726a);
            this.f9218d++;
        }
        try {
            dft b;
            if (c1726a.f9207h) {
                b = m13276b(c1726a.f9203d);
            } else {
                b = m13269a(c1726a.f9203d);
            }
            if (c1726a.f9213n == 2) {
                this.f9222h.a(c1726a.f9203d);
                if (!this.f9221g.b(c1726a.f9203d) && !this.f9222h.b(c1726a.f9203d)) {
                    this.f9221g.f();
                    this.f9221g.a(j, c1726a.f9203d, b, c1726a.f9202c, c1726a.f9204e);
                }
            } else if (c1726a.f9213n == 4) {
                if (!this.f9221g.b(c1726a.f9203d)) {
                    this.f9222h.a(j, c1726a.f9203d, b, c1726a.f9202c, c1726a.f9204e);
                }
            } else if (c1726a.f9213n == 1) {
                this.f9219e.a(j, c1726a.f9203d, b, c1726a.f9202c, c1726a.f9204e);
            } else if (c1726a.f9213n == 3) {
                this.f9220f.a(j, c1726a.f9203d, b, c1726a.f9202c, c1726a.f9204e);
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private dft m13269a(String str) {
        dft b = dft.b(str);
        b.a(false);
        b.b(5000);
        b.a(30000);
        b.d(this.f9223i.f8410g);
        return b;
    }

    /* renamed from: b */
    private dft m13276b(String str) {
        dft b = dft.b(str);
        b.a(false);
        b.d(this.f9223i.f8410g);
        return b;
    }
}
