package com.p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Base64;
import android.util.Log;
import com.facebook.GraphResponse;
import com.facebook.ads.AdError;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.ctf.C4578a;

/* compiled from: TileCreationTask */
/* renamed from: cni */
public class cni extends cnf implements C4578a {
    /* renamed from: l */
    private static caf f9839l = caf.m12046a();
    /* renamed from: a */
    private String f9840a;
    /* renamed from: b */
    private String f9841b;
    /* renamed from: c */
    private int f9842c;
    /* renamed from: d */
    private String f9843d;
    /* renamed from: e */
    private String f9844e;
    /* renamed from: f */
    private boolean f9845f;
    /* renamed from: g */
    private boolean f9846g;
    /* renamed from: h */
    private boolean f9847h;
    /* renamed from: i */
    private boolean f9848i;
    /* renamed from: j */
    private boolean f9849j = false;
    /* renamed from: k */
    private boolean f9850k = false;

    /* renamed from: e */
    int mo1797e() {
        return 2;
    }

    /* renamed from: a */
    public void m14763a(String str, String str2, int i, String str3, String str4) {
        this.f9840a = str;
        this.f9841b = str2;
        this.f9842c = i;
        this.f9843d = str3;
        this.f9844e = str4;
    }

    /* renamed from: a */
    public void m14764a(boolean z) {
        this.f9850k = z;
    }

    /* renamed from: a */
    public void mo1796a(final Context context) {
        System.currentTimeMillis();
        File file = new File(this.f9840a);
        final File e = f9839l.m12073f().m13512e(context, this.f9841b);
        if (file.exists()) {
            if (!e.exists()) {
                try {
                    e.createNewFile();
                } catch (IOException e2) {
                }
            }
            try {
                InputStream fileInputStream = new FileInputStream(file);
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                if (options.outHeight == -1) {
                    m14753a(file);
                    m14759b(context);
                    file.delete();
                    return;
                }
                if (f9839l.m12068d().m12026e()) {
                    if (dju.b() < 2) {
                        this.f9848i = true;
                    }
                } else if (dju.a() < 2) {
                    this.f9848i = true;
                }
                int d = f9839l.m12068d().m12025d();
                int i = f9839l.m12068d().f8408e;
                Context context2 = context;
                cqi cqi = new cqi(context2, this.f9841b, f9839l.m12068d().f8420q, f9839l.m12068d().f8419p, this.f9842c, d, i);
                cqi.a(this.f9850k);
                cqi.a(this);
                if (options.outHeight > f9839l.m12068d().m12022b()) {
                    cqi.a(this.f9840a, options.outWidth, options.outHeight);
                } else {
                    Bitmap decodeFile = BitmapFactory.decodeFile(this.f9840a);
                    if (decodeFile == null) {
                        m14758b(options.outWidth, options.outHeight);
                        m14759b(context);
                        file.delete();
                        new Thread(this) {
                            /* renamed from: c */
                            final /* synthetic */ cni f9838c;

                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                }
                                if (e.exists()) {
                                    e.delete();
                                    if (!this.f9838c.f9849j) {
                                        this.f9838c.m14751a(context, false);
                                    }
                                }
                            }
                        }.start();
                        return;
                    }
                    cqi.a(decodeFile);
                }
                m14751a(context, true);
                /* anonymous class already generated */.start();
            } catch (Exception e3) {
                this.f9845f = true;
                m14754a(e3);
                file.delete();
                m14759b(context);
            } catch (Exception e32) {
                m14754a(e32);
                file.delete();
                m14759b(context);
            } finally {
                /* anonymous class already generated */.start();
            }
        }
    }

    /* renamed from: a */
    public void m14761a(int i, int i2) {
    }

    /* renamed from: m */
    public String mo1806m() {
        return this.f9841b;
    }

    /* renamed from: a */
    private void m14751a(Context context, boolean z) {
        Intent g = mo1798g();
        g.setAction("com.9gag.android.app.TILE_CREATION_CALLBACK");
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        g.putExtra("command", 111);
        g.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, this.f9841b);
        g.putExtra("completed", z);
        m14750a(context, g);
        this.f9849j = true;
    }

    /* renamed from: b */
    private void m14759b(Context context) {
        Intent g = mo1798g();
        g.setAction("com.9gag.android.app.TILE_CREATION_CALLBACK");
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        g.putExtra("command", 111);
        g.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, this.f9841b);
        g.putExtra("completed", false);
        g.putExtra("failed", true);
        g.putExtra("file_not_found", this.f9845f);
        g.putExtra("adult_filter", this.f9847h);
        g.putExtra("network_filter", this.f9846g);
        g.putExtra("not_enough_space", this.f9848i);
        m14750a(context, g);
        this.f9849j = true;
    }

    /* renamed from: a */
    private void m14753a(File file) {
        String b = m14757b(file);
        String str = String.format("Fail in just decode bounds - File exist:%s; File size: %d;\nPost info: %s (%d);\nUrl: %s;\nFrom: %s;\nTime:%d;", new Object[]{Boolean.valueOf(file.exists()), Long.valueOf(file.length()), this.f9841b, Integer.valueOf(this.f9842c), this.f9844e, this.f9843d, Long.valueOf(System.currentTimeMillis())}) + "\nUSE_EXTERNAL_STORAGE:" + f9839l.m12068d().m12026e() + "\n" + Base64.encodeToString(b.getBytes(), 0);
        this.f9847h = m14756a(b);
        this.f9846g = m14760b(b);
        if (this.f9847h) {
            chn.m13466z(str);
        } else if (this.f9846g) {
            chn.m13323A(str);
        } else {
            chn.m13464y(str);
        }
    }

    /* renamed from: b */
    private void m14758b(int i, int i2) {
        File file = new File(this.f9840a);
        StringBuilder append = new StringBuilder().append("Got dimension but fail to decode - dimen: ").append(i).append("x").append(i2).append(";\n").append(" From: ").append(this.f9843d).append(";\n").append(" Time: ").append(System.currentTimeMillis()).append(";\n").append(" Path null or empty? ");
        boolean z = this.f9840a == null || "".equals(this.f9840a);
        chn.m13464y(append.append(z).append(";\n").append(" File size: ").append(file.length()).append(";\n").append(" Post info: ").append(this.f9841b).append("(").append(this.f9842c).append(");\n").append(" Url: ").append(this.f9844e).append(";\n").append(" Mem: ").append(m14749a()).append("KB").toString() + "\nUSE_EXTERNAL_STORAGE:" + f9839l.m12068d().m12026e());
    }

    /* renamed from: a */
    private void m14754a(Exception exception) {
        chn.m13464y((String.format("From: %s;\nTime: %d;\nException: %s; Post info: %s(%d)\n; Url: %s\n;", new Object[]{this.f9843d, Long.valueOf(System.currentTimeMillis()), exception.getMessage(), this.f9841b, Integer.valueOf(this.f9842c), this.f9844e}) + "\nUSE_EXTERNAL_STORAGE:" + f9839l.m12068d().m12026e() + "Mem: " + m14749a() + "KB") + "\nStacktrace: " + Log.getStackTraceString(exception));
    }

    /* renamed from: a */
    private long m14749a() {
        return Runtime.getRuntime().freeMemory() / 1024;
    }

    /* renamed from: b */
    private String m14757b(File file) {
        if (file == null) {
            return "(File is null)";
        }
        String str = "";
        if (file.length() <= 0) {
            return "(f.length()==0)";
        }
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        try {
            new FileInputStream(file).read(bArr);
            return new String(bArr);
        } catch (Throwable e) {
            return Log.getStackTraceString(e);
        } catch (Throwable e2) {
            return Log.getStackTraceString(e2);
        }
    }

    /* renamed from: a */
    private boolean m14756a(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.toLowerCase().trim();
        if (trim.contains("sex")) {
            return true;
        }
        if (trim.contains("adult")) {
            return true;
        }
        if (trim.contains("parental")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m14760b(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.toLowerCase().trim();
        if (trim.contains("connection")) {
            return true;
        }
        if (trim.contains("redirect")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m14750a(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
        }
    }
}
