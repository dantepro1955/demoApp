package com.p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.ahs.C0181c;

@bhd
/* renamed from: bkj */
public class bkj {
    /* renamed from: a */
    private final Context f6726a;
    /* renamed from: b */
    private String f6727b;
    /* renamed from: c */
    private String f6728c;
    /* renamed from: d */
    private String f6729d;
    /* renamed from: e */
    private final float f6730e;
    /* renamed from: f */
    private float f6731f;
    /* renamed from: g */
    private float f6732g;
    /* renamed from: h */
    private float f6733h;
    /* renamed from: i */
    private int f6734i;

    /* renamed from: bkj$3 */
    class C12963 implements OnClickListener {
        C12963(bkj bkj) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: bkj$4 */
    class C12974 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bkj f6724a;

        C12974(bkj bkj) {
            this.f6724a = bkj;
        }

        public void run() {
            ako.m2351m().m9222a(this.f6724a.f6726a, this.f6724a.f6728c, this.f6724a.f6729d);
        }
    }

    /* renamed from: bkj$5 */
    class C12985 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bkj f6725a;

        C12985(bkj bkj) {
            this.f6725a = bkj;
        }

        public void run() {
            ako.m2351m().m9227b(this.f6725a.f6726a, this.f6725a.f6728c, this.f6725a.f6729d);
        }
    }

    public bkj(Context context) {
        this.f6734i = 0;
        this.f6726a = context;
        this.f6730e = context.getResources().getDisplayMetrics().density;
    }

    public bkj(Context context, String str) {
        this(context);
        this.f6727b = str;
    }

    /* renamed from: a */
    private int m9200a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: b */
    private void m9202b() {
        if (this.f6726a instanceof Activity) {
            CharSequence string;
            Resources t = ako.m2347i().m8965t();
            if (t != null) {
                string = t.getString(C0181c.debug_menu_title);
            } else {
                Object obj = "Select a Debug Mode";
            }
            String string2 = t != null ? t.getString(C0181c.debug_menu_ad_information) : "Ad Information";
            String string3 = t != null ? t.getString(C0181c.debug_menu_creative_preview) : "Creative Preview";
            String string4 = t != null ? t.getString(C0181c.debug_menu_troubleshooting) : "Troubleshooting";
            List arrayList = new ArrayList();
            final int a = m9200a(arrayList, string2, true);
            final int a2 = m9200a(arrayList, string3, ((Boolean) bbb.df.m7064c()).booleanValue());
            final int a3 = m9200a(arrayList, string4, ((Boolean) bbb.dg.m7064c()).booleanValue());
            new Builder(this.f6726a).setTitle(string).setItems((CharSequence[]) arrayList.toArray(new String[0]), new OnClickListener(this) {
                /* renamed from: d */
                final /* synthetic */ bkj f6721d;

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == a) {
                        this.f6721d.m9204c();
                    } else if (i == a2 && ((Boolean) bbb.df.m7064c()).booleanValue()) {
                        this.f6721d.m9208d();
                    } else if (i == a3 && ((Boolean) bbb.dg.m7064c()).booleanValue()) {
                        this.f6721d.m9210e();
                    }
                }
            }).create().show();
            return;
        }
        bky.m9010d("Can not create dialog without Activity Context");
    }

    /* renamed from: c */
    private void m9204c() {
        if (this.f6726a instanceof Activity) {
            final Object d = bkj.m9207d(this.f6727b);
            Builder builder = new Builder(this.f6726a);
            builder.setMessage(d);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ bkj f6723b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    ako.m2343e().m9098a(this.f6723b.f6726a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", d), "Share via"));
                }
            });
            builder.setNegativeButton("Close", new C12963(this));
            builder.create().show();
            return;
        }
        bky.m9010d("Can not create dialog without Activity Context");
    }

    /* renamed from: d */
    static String m9207d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map a = ako.m2343e().m9092a(build);
        for (String str2 : a.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) a.get(str2)).append("\n\n");
        }
        Object trim = stringBuilder.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    /* renamed from: d */
    private void m9208d() {
        bky.m9006b("Debug mode [Creative Preview] selected.");
        bkf.m9059a(new C12974(this));
    }

    /* renamed from: e */
    private void m9210e() {
        bky.m9006b("Debug mode [Troubleshooting] selected.");
        bkf.m9059a(new C12985(this));
    }

    /* renamed from: a */
    public void m9212a() {
        if (((Boolean) bbb.dg.m7064c()).booleanValue() || ((Boolean) bbb.df.m7064c()).booleanValue()) {
            m9202b();
        } else {
            m9204c();
        }
    }

    /* renamed from: a */
    void m9213a(int i, float f, float f2) {
        if (i == 0) {
            this.f6734i = 0;
            this.f6731f = f;
            this.f6732g = f2;
            this.f6733h = f2;
        } else if (this.f6734i == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f6732g) {
                    this.f6732g = f2;
                } else if (f2 < this.f6733h) {
                    this.f6733h = f2;
                }
                if (this.f6732g - this.f6733h > 30.0f * this.f6730e) {
                    this.f6734i = -1;
                    return;
                }
                if (this.f6734i == 0 || this.f6734i == 2) {
                    if (f - this.f6731f >= 50.0f * this.f6730e) {
                        this.f6731f = f;
                        this.f6734i++;
                    }
                } else if ((this.f6734i == 1 || this.f6734i == 3) && f - this.f6731f <= -50.0f * this.f6730e) {
                    this.f6731f = f;
                    this.f6734i++;
                }
                if (this.f6734i == 1 || this.f6734i == 3) {
                    if (f > this.f6731f) {
                        this.f6731f = f;
                    }
                } else if (this.f6734i == 2 && f < this.f6731f) {
                    this.f6731f = f;
                }
            } else if (i == 1 && this.f6734i == 4) {
                m9212a();
            }
        }
    }

    /* renamed from: a */
    public void m9214a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m9213a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m9213a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public void m9215a(String str) {
        this.f6728c = str;
    }

    /* renamed from: b */
    public void m9216b(String str) {
        this.f6729d = str;
    }

    /* renamed from: c */
    public void m9217c(String str) {
        this.f6727b = str;
    }
}
