package com.p000;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bne */
public class bne extends bmu {
    /* renamed from: a */
    private volatile String f7097a;
    /* renamed from: b */
    private Future<String> f7098b;

    /* renamed from: bne$1 */
    class C13531 implements Callable<String> {
        /* renamed from: a */
        final /* synthetic */ bne f7095a;

        C13531(bne bne) {
            this.f7095a = bne;
        }

        /* renamed from: a */
        public String m9914a() throws Exception {
            return this.f7095a.m9922c();
        }

        public /* synthetic */ Object call() throws Exception {
            return m9914a();
        }
    }

    /* renamed from: bne$2 */
    class C13542 implements Callable<String> {
        /* renamed from: a */
        final /* synthetic */ bne f7096a;

        C13542(bne bne) {
            this.f7096a = bne;
        }

        /* renamed from: a */
        public String m9915a() throws Exception {
            return this.f7096a.m9918e();
        }

        public /* synthetic */ Object call() throws Exception {
            return m9915a();
        }
    }

    protected bne(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    private boolean m9917a(Context context, String str) {
        aoi.m4681a(str);
        aoi.m4691c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            zza("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    zze("Failed to close clientId writing stream", e);
                }
            }
            return true;
        } catch (FileNotFoundException e2) {
            zze("Error creating clientId file", e2);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException e3) {
                zze("Failed to close clientId writing stream", e3);
                return false;
            }
        } catch (IOException e32) {
            zze("Error writing to clientId file", e32);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException e322) {
                zze("Failed to close clientId writing stream", e322);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3222) {
                    zze("Failed to close clientId writing stream", e3222);
                }
            }
        }
    }

    /* renamed from: e */
    private String m9918e() {
        String d = m9923d();
        try {
            return !m9917a(zznU().m2518c(), d) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : d;
        } catch (Exception e) {
            zze("Error saving clientId file", e);
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
    }

    /* renamed from: a */
    public String m9919a() {
        String str;
        zzob();
        synchronized (this) {
            if (this.f7097a == null) {
                this.f7098b = zznU().m2513a(new C13531(this));
            }
            if (this.f7098b != null) {
                try {
                    this.f7097a = (String) this.f7098b.get();
                } catch (InterruptedException e) {
                    zzd("ClientId loading or generation was interrupted", e);
                    this.f7097a = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                } catch (ExecutionException e2) {
                    zze("Failed to load or generate client id", e2);
                    this.f7097a = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                if (this.f7097a == null) {
                    this.f7097a = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                zza("Loaded clientId", this.f7097a);
                this.f7098b = null;
            }
            str = this.f7097a;
        }
        return str;
    }

    /* renamed from: a */
    protected String m9920a(Context context) {
        FileInputStream fileInputStream;
        Object e;
        Throwable th;
        aoi.m4691c("ClientId should be loaded from worker thread");
        FileInputStream openFileInput;
        try {
            openFileInput = context.openFileInput("gaClientId");
            try {
                byte[] bArr = new byte[36];
                int read = openFileInput.read(bArr, 0, 36);
                if (openFileInput.available() > 0) {
                    zzbS("clientId file seems corrupted, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2) {
                        zze("Failed to close client id reading stream", e2);
                        return null;
                    }
                } else if (read < 14) {
                    zzbS("clientId file is empty, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e22) {
                        zze("Failed to close client id reading stream", e22);
                        return null;
                    }
                } else {
                    openFileInput.close();
                    String str = new String(bArr, 0, read);
                    zza("Read client id from disk", str);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e3) {
                            zze("Failed to close client id reading stream", e3);
                        }
                    }
                    return str;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream = openFileInput;
                if (fileInputStream != null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (IOException e222) {
                    zze("Failed to close client id reading stream", e222);
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                try {
                    zze("Error reading client id file, deleting it", e);
                    context.deleteFile("gaClientId");
                    if (openFileInput != null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2222) {
                        zze("Failed to close client id reading stream", e2222);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e22222) {
                            zze("Failed to close client id reading stream", e22222);
                        }
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e6) {
            fileInputStream = null;
            if (fileInputStream != null) {
                return null;
            }
            fileInputStream.close();
            return null;
        } catch (IOException e7) {
            e = e7;
            openFileInput = null;
            zze("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            if (openFileInput != null) {
                return null;
            }
            openFileInput.close();
            return null;
        } catch (Throwable th3) {
            openFileInput = null;
            th = th3;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    String m9921b() {
        synchronized (this) {
            this.f7097a = null;
            this.f7098b = zznU().m2513a(new C13542(this));
        }
        return m9919a();
    }

    /* renamed from: c */
    String m9922c() {
        String a = m9920a(zznU().m2518c());
        return a == null ? m9918e() : a;
    }

    /* renamed from: d */
    protected String m9923d() {
        return UUID.randomUUID().toString().toLowerCase();
    }

    protected void zzmS() {
    }
}
