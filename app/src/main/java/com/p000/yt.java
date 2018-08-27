package com.p000;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.util.ByteConstants;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.lib.network.model.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yt */
public class yt {
    /* renamed from: a */
    private final zi f26068a;
    /* renamed from: b */
    private final vm f26069b;
    /* renamed from: c */
    private final String f26070c = "FileManager";
    /* renamed from: d */
    private final Object f26071d;

    yt(zl zlVar) {
        this.f26069b = (vm) zlVar;
        this.f26068a = zlVar.mo5561g();
        this.f26071d = new Object();
    }

    /* renamed from: a */
    long m34926a(long j) {
        return j / 1048576;
    }

    /* renamed from: a */
    public File m34927a(String str, Context context, boolean z) {
        if (zn.m34841d(str)) {
            this.f26068a.mo5606a("FileManager", "Looking up cached resource: " + str);
            if (!m34932a(context) && !z) {
                return null;
            }
            File file;
            if (str.contains("icon")) {
                str = str.replace(Constants.SEP, "_").replace(".", "_");
            }
            synchronized (this.f26071d) {
                File b = m34938b(context);
                file = new File(b, str);
                try {
                    b.mkdirs();
                } catch (Exception e) {
                    return null;
                }
            }
            return file;
        }
        this.f26069b.mo5561g().mo5606a("FileManager", "Nothing to look up, skipping...");
        return null;
    }

    /* renamed from: a */
    String m34928a(Context context, String str) {
        return m34929a(context, str, false);
    }

    /* renamed from: a */
    String m34929a(Context context, String str, boolean z) {
        if (str == null || str.equals("")) {
            this.f26069b.mo5561g().mo5606a("FileManager", "Nothing to cache, skipping...");
            return "";
        }
        this.f26069b.mo5561g().mo5606a("FileManager", "Starting caching of resource " + str);
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        File a = m34927a(lastPathSegment, context, false);
        return (a == null || !a.exists()) ? m34935a(a, str) ? z ? Uri.fromFile(a).toString() : lastPathSegment : null : z ? Uri.fromFile(a).toString() : lastPathSegment;
    }

    /* renamed from: a */
    void m34930a(long j, Context context) {
        long c = (long) m34940c();
        if (c == -1) {
            this.f26068a.mo5606a("FileManager", "Cache has no maximum size set; skipping drop...");
        } else if (m34926a(j) > c) {
            this.f26068a.mo5606a("FileManager", "Cache has exceeded maximum size; dropping...");
            m34945g(context);
            this.f26069b.m34408m().m34703a("cache_drop_count");
        } else {
            this.f26068a.mo5606a("FileManager", "Cache is present but under size limit; not dropping...");
        }
    }

    /* renamed from: a */
    boolean m34931a() {
        return ((Boolean) this.f26069b.m34391a(wp.an)).booleanValue();
    }

    /* renamed from: a */
    protected boolean m34932a(Context context) {
        if (yi.m34895a("android.permission.WRITE_EXTERNAL_STORAGE", context)) {
            return true;
        }
        if (yi.m34897c() && !((Boolean) this.f26069b.m34391a(wp.bi)).booleanValue()) {
            return true;
        }
        this.f26069b.mo5561g().mo5610c("FileManager", "Application lacks required WRITE_EXTERNAL_STORAGE manifest permission.");
        return false;
    }

    /* renamed from: a */
    boolean m34933a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        boolean z;
        Throwable e;
        this.f26068a.mo5606a("FileManager", "Writing resource to filesystem: " + file.getName());
        synchronized (this.f26071d) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    z = true;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        this.f26068a.mo5609b("FileManager", "Unable to write data to file", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                z = false;
                            }
                        }
                        z = false;
                        return z;
                    } catch (Throwable th) {
                        e = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e5) {
                            }
                        }
                        throw e;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream = null;
                this.f26068a.mo5609b("FileManager", "Unable to write data to file", e);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                z = false;
                return z;
            } catch (Throwable th2) {
                e = th2;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e;
            }
        }
        return z;
    }

    /* renamed from: a */
    boolean m34934a(File file) {
        boolean delete;
        this.f26068a.mo5606a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        synchronized (this.f26071d) {
            try {
                delete = file.delete();
            } catch (Throwable e) {
                this.f26068a.mo5609b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                delete = false;
            }
        }
        return delete;
    }

    /* renamed from: a */
    boolean m34935a(File file, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        HttpURLConnection httpURLConnection;
        Throwable e;
        HttpURLConnection httpURLConnection2;
        ByteArrayOutputStream byteArrayOutputStream2;
        InputStream inputStream = null;
        this.f26068a.mo5606a("FileManager", "Starting caching of " + str + " into " + file.getAbsoluteFile());
        if (((Boolean) this.f26069b.m34391a(wp.aX)).booleanValue() && !str.contains("https://")) {
            this.f26069b.mo5561g().mo5610c("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            str = str.replace("http://", "https://");
        }
        InputStream inputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (IOException e2) {
                e = e2;
                httpURLConnection2 = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    this.f26068a.mo5609b("FileManager", "Failed to cache \"" + str + "\" into \"" + file.getAbsolutePath() + "\"", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e4) {
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception e5) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    e = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception e8) {
                        }
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                httpURLConnection2 = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw e;
            }
            try {
                httpURLConnection.setConnectTimeout(((Integer) this.f26069b.m34391a(wp.f25911o)).intValue());
                httpURLConnection.setReadTimeout(((Integer) this.f26069b.m34391a(wp.f25913q)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < HttpStatus.HTTP_OK || responseCode >= GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION) {
                    if (null != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e9) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e10) {
                        }
                    }
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e11) {
                        }
                    }
                    return false;
                }
                inputStream = httpURLConnection.getInputStream();
                byte[] bArr = new byte[ByteConstants.KB];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read < 0) {
                        break;
                    }
                    try {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Exception e12) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e13) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e14) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e15) {
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e16) {
                            }
                        }
                        return false;
                    }
                }
                if (m34933a(byteArrayOutputStream, file)) {
                    this.f26068a.mo5606a("FileManager", "Caching completed for " + file);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e17) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e18) {
                        }
                    }
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e19) {
                        }
                    }
                    return true;
                }
                this.f26068a.mo5612d("FileManager", "Failed to cache \"" + str + "\" into \"" + file.getAbsolutePath() + "\"");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e20) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e21) {
                    }
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e22) {
                    }
                }
                return false;
            } catch (Throwable e23) {
                byteArrayOutputStream2 = byteArrayOutputStream;
                HttpURLConnection httpURLConnection3 = httpURLConnection;
                e = e23;
                httpURLConnection2 = httpURLConnection3;
                this.f26068a.mo5609b("FileManager", "Failed to cache \"" + str + "\" into \"" + file.getAbsolutePath() + "\"", e);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable e232) {
                Throwable th3 = e232;
                httpURLConnection2 = httpURLConnection;
                e = th3;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw e;
            }
        } catch (IOException e24) {
            e = e24;
            httpURLConnection2 = null;
            byteArrayOutputStream2 = null;
            this.f26068a.mo5609b("FileManager", "Failed to cache \"" + str + "\" into \"" + file.getAbsolutePath() + "\"", e);
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return false;
        } catch (Throwable th4) {
            e = th4;
            httpURLConnection2 = null;
            byteArrayOutputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw e;
        }
    }

    /* renamed from: a */
    public boolean m34936a(String str, Context context) {
        boolean b;
        synchronized (this.f26071d) {
            b = m34939b(str, context, false);
        }
        return b;
    }

    /* renamed from: b */
    long m34937b() {
        long longValue = ((Long) this.f26069b.m34391a(wp.ao)).longValue();
        return (longValue < 0 || !m34931a()) ? -1 : longValue;
    }

    /* renamed from: b */
    File m34938b(Context context) {
        return m34932a(context) ? new File(context.getExternalFilesDir(null), "al") : new File(context.getCacheDir(), "al");
    }

    /* renamed from: b */
    public boolean m34939b(String str, Context context, boolean z) {
        boolean z2;
        synchronized (this.f26071d) {
            File a = m34927a(str, context, z);
            z2 = (a == null || !a.exists() || a.isDirectory()) ? false : true;
        }
        return z2;
    }

    /* renamed from: c */
    int m34940c() {
        int intValue = ((Integer) this.f26069b.m34391a(wp.ap)).intValue();
        return (intValue < 0 || !m34931a()) ? -1 : intValue;
    }

    /* renamed from: c */
    public List m34941c(Context context) {
        File b = m34938b(context);
        if (!b.isDirectory()) {
            return new ArrayList(0);
        }
        List asList;
        synchronized (this.f26071d) {
            asList = Arrays.asList(b.listFiles());
        }
        return asList;
    }

    /* renamed from: d */
    public boolean m34942d(Context context) {
        if (((Boolean) this.f26069b.m34391a(wp.bj)).booleanValue()) {
            try {
                m34927a(".nomedia", context, false);
                File file = new File(m34938b(context), ".nomedia");
                if (file != null) {
                    if (file.exists()) {
                        return true;
                    }
                    this.f26069b.mo5561g().mo5606a("FileManager", "Dropping .nomedia file at " + file.getAbsolutePath());
                    return file.createNewFile();
                }
            } catch (Throwable e) {
                this.f26069b.mo5561g().mo5607a("FileManager", "Failed to create nomedia file", e);
            }
        }
        return false;
    }

    /* renamed from: e */
    void m34943e(Context context) {
        try {
            if (!m34931a()) {
                return;
            }
            if (this.f26069b.m34397b()) {
                this.f26068a.mo5612d("FileManager", "Cannot empty file cache after SDK has completed initialization and ad loads are in progress!");
                return;
            }
            this.f26068a.mo5606a("FileManager", "Compacting cache...");
            synchronized (this.f26071d) {
                m34930a(m34944f(context), context);
            }
        } catch (Throwable e) {
            this.f26068a.mo5609b("FileManager", "Caught exception while compacting cache!", e);
            this.f26069b.m34403h().m34657a(wp.an, Boolean.valueOf(false));
            this.f26069b.m34403h().m34659b();
        }
    }

    /* renamed from: f */
    long m34944f(Context context) {
        long j = 0;
        long b = m34937b();
        Object obj = b != -1 ? 1 : null;
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        synchronized (this.f26071d) {
            for (File file : m34941c(context)) {
                Object obj2 = null;
                if (obj != null && toSeconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > b) {
                    this.f26068a.mo5606a("FileManager", "File " + file.getName() + " has expired, removing...");
                    m34934a(file);
                    obj2 = 1;
                }
                if (obj2 != null) {
                    this.f26069b.m34408m().m34703a("cached_files_expired");
                } else {
                    j += file.length();
                }
            }
        }
        return j;
    }

    /* renamed from: g */
    void m34945g(Context context) {
        synchronized (this.f26071d) {
            for (File a : m34941c(context)) {
                m34934a(a);
            }
        }
    }
}
