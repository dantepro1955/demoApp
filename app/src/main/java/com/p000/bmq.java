package com.p000;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

/* renamed from: bmq */
public class bmq extends bmu {
    /* renamed from: a */
    public static boolean f7004a;
    /* renamed from: b */
    private Info f7005b;
    /* renamed from: c */
    private final bod f7006c;
    /* renamed from: d */
    private String f7007d;
    /* renamed from: e */
    private boolean f7008e = false;
    /* renamed from: f */
    private Object f7009f = new Object();

    bmq(bmw bmw) {
        super(bmw);
        this.f7006c = new bod(bmw.m9769d());
    }

    /* renamed from: a */
    private static String m9741a(String str) {
        if (bof.m10140b("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, bof.m10140b("MD5").digest(str.getBytes()))});
    }

    /* renamed from: a */
    private boolean m9742a(Info info, Info info2) {
        Object obj = null;
        CharSequence id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        String a = zznX().m9919a();
        synchronized (this.f7009f) {
            String valueOf;
            String valueOf2;
            if (!this.f7008e) {
                this.f7007d = m9748d();
                this.f7008e = true;
            } else if (TextUtils.isEmpty(this.f7007d)) {
                if (info != null) {
                    obj = info.getId();
                }
                if (obj == null) {
                    valueOf = String.valueOf(id);
                    String valueOf3 = String.valueOf(a);
                    boolean b = m9743b(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
                    return b;
                }
                valueOf2 = String.valueOf(obj);
                valueOf = String.valueOf(a);
                this.f7007d = bmq.m9741a(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
            }
            valueOf2 = String.valueOf(id);
            valueOf = String.valueOf(a);
            obj = bmq.m9741a(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
            if (TextUtils.isEmpty(obj)) {
                return false;
            } else if (obj.equals(this.f7007d)) {
                return true;
            } else {
                if (TextUtils.isEmpty(this.f7007d)) {
                    valueOf = a;
                } else {
                    zzbP("Resetting the client id because Advertising Id changed.");
                    obj = zznX().m9921b();
                    zza("New client Id", obj);
                }
                String valueOf4 = String.valueOf(id);
                valueOf3 = String.valueOf(obj);
                b = m9743b(valueOf3.length() != 0 ? valueOf4.concat(valueOf3) : new String(valueOf4));
                return b;
            }
        }
    }

    /* renamed from: b */
    private boolean m9743b(String str) {
        try {
            String a = bmq.m9741a(str);
            zzbP("Storing hashed adid.");
            FileOutputStream openFileOutput = getContext().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f7007d = a;
            return true;
        } catch (IOException e) {
            zze("Error creating hash file", e);
            return false;
        }
    }

    /* renamed from: e */
    private synchronized Info m9744e() {
        if (this.f7006c.m10113a(1000)) {
            this.f7006c.m10112a();
            Info c = m9747c();
            if (m9742a(this.f7005b, c)) {
                this.f7005b = c;
            } else {
                zzbT("Failed to reset client id on adid change. Not using adid");
                this.f7005b = new Info("", false);
            }
        }
        return this.f7005b;
    }

    /* renamed from: a */
    public boolean m9745a() {
        zzob();
        Info e = m9744e();
        return (e == null || e.isLimitAdTrackingEnabled()) ? false : true;
    }

    /* renamed from: b */
    public String m9746b() {
        zzob();
        Info e = m9744e();
        CharSequence id = e != null ? e.getId() : null;
        return TextUtils.isEmpty(id) ? null : id;
    }

    /* renamed from: c */
    protected Info m9747c() {
        Info info = null;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
        } catch (IllegalStateException e) {
            zzbS("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        } catch (Throwable th) {
            if (!f7004a) {
                f7004a = true;
                zzd("Error getting advertiser id", th);
            }
        }
        return info;
    }

    /* renamed from: d */
    protected String m9748d() {
        Object obj;
        String str = null;
        try {
            FileInputStream openFileInput = getContext().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                zzbS("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                getContext().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                zzbP("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    return str2;
                } catch (FileNotFoundException e) {
                    return str2;
                } catch (IOException e2) {
                    IOException iOException = e2;
                    str = str2;
                    IOException iOException2 = iOException;
                    zzd("Error reading Hash file, deleting it", obj);
                    getContext().deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
            return null;
        } catch (IOException e4) {
            obj = e4;
            zzd("Error reading Hash file, deleting it", obj);
            getContext().deleteFile("gaClientIdData");
            return str;
        }
    }

    protected void zzmS() {
    }
}
