package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.internal.Throwables;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.lib.network.model.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: ObjectDownloadManager */
/* renamed from: dln */
public class dln {
    /* renamed from: a */
    private static dln f22094a;
    /* renamed from: f */
    private static HashMap<String, C4974a> f22095f = new HashMap();
    /* renamed from: b */
    private OkHttpClient f22096b;
    /* renamed from: c */
    private bwg f22097c;
    /* renamed from: d */
    private Context f22098d;
    /* renamed from: e */
    private dfs f22099e = new dfs(true);

    /* compiled from: ObjectDownloadManager */
    /* renamed from: dln$a */
    public static class C4974a {
        /* renamed from: a */
        public long f22092a;
        /* renamed from: b */
        public long f22093b;
    }

    /* renamed from: b */
    private OkHttpClient m27892b() {
        if (this.f22096b == null) {
            this.f22096b = new Builder().readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();
        }
        return this.f22096b;
    }

    private dln(Context context) {
        this.f22098d = context;
    }

    /* renamed from: a */
    public static dln m27888a(Context context) {
        if (f22094a == null) {
            synchronized (dln.class) {
                if (f22094a == null) {
                    f22094a = new dln(context);
                }
            }
        }
        return f22094a;
    }

    /* renamed from: a */
    public static boolean m27890a(String str, String str2) {
        if (f22095f.get(str) != null) {
            return false;
        }
        return new File(str2).exists();
    }

    /* renamed from: a */
    public static C4974a m27887a(String str) {
        return (C4974a) f22095f.get(str);
    }

    /* renamed from: a */
    public void m27895a(String str, String str2, dfz dfz) {
        final File file = new File(str2);
        final File file2 = new File(str2 + ".tmp");
        Request build = new Request.Builder().url(str).build();
        if (!file.exists() && !file2.exists()) {
            try {
                file2.createNewFile();
                f22095f.put(str, new C4974a());
                final String str3 = str;
                final dfz dfz2 = dfz;
                m27892b().newCall(build).enqueue(new Callback(this) {
                    /* renamed from: e */
                    final /* synthetic */ dln f22091e;

                    public void onFailure(Call call, IOException iOException) {
                        file2.delete();
                        dln.f22095f.remove(str3);
                        if (dfz2 != null) {
                            String str = "DOWNLOAD_FAIL";
                            if (iOException instanceof UnknownHostException) {
                                str = "UNKNOWN_HOST";
                            } else if (iOException instanceof FileNotFoundException) {
                                str = "FILE_NOT_FOUND";
                            }
                            dfz2.log(str, "USER_EXPERIENCE", iOException.getMessage() + " url : " + str3);
                        }
                    }

                    public void onResponse(Call call, Response response) throws IOException {
                        Throwable th;
                        Exception e;
                        String message;
                        if (response.isSuccessful()) {
                            InputStream byteStream = response.body().byteStream();
                            bwi b;
                            bwi a;
                            try {
                                long contentLength = response.body().contentLength();
                                C4974a c4974a = (C4974a) dln.f22095f.get(str3);
                                if (c4974a == null) {
                                    file2.delete();
                                    return;
                                }
                                c4974a.f22092a = contentLength;
                                c4974a.f22093b = 0;
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(byteStream);
                                byte[] bArr = new byte[4096];
                                b = this.f22091e.m27893c().b(dln.m27894c(str3));
                                if (b.a()) {
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        c4974a.f22093b += (long) read;
                                        ((bwe) b.b()).write(bArr, 0, read);
                                    }
                                    ((bwe) b.b()).a();
                                    ((bwe) b.b()).c();
                                }
                                bufferedInputStream.close();
                                a = this.f22091e.m27893c().a(dln.m27894c(str3));
                                if (a.a()) {
                                    new File(((bwj) a.b()).a()).renameTo(file);
                                    ((bwj) a.b()).close();
                                }
                                dln.f22095f.remove(str3);
                                return;
                            } catch (NumberFormatException e2) {
                                e = e2;
                                dln.f22095f.remove(str3);
                                file2.delete();
                                if (dfz2 == null) {
                                    message = e.getMessage();
                                    if (e instanceof NumberFormatException) {
                                        message = message + "Content-Length : " + response.header(HttpHeaders.CONTENT_LENGTH) + " url : " + str3;
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message);
                                    }
                                    if (!(e instanceof ProtocolException)) {
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message + "  url : " + str3 + " content-len=" + response.header(HttpHeaders.CONTENT_LENGTH) + " code=" + response.code());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (IOException e3) {
                                e = e3;
                                dln.f22095f.remove(str3);
                                file2.delete();
                                if (dfz2 == null) {
                                    message = e.getMessage();
                                    if (e instanceof NumberFormatException) {
                                        message = message + "Content-Length : " + response.header(HttpHeaders.CONTENT_LENGTH) + " url : " + str3;
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message);
                                    }
                                    if (!(e instanceof ProtocolException)) {
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message + "  url : " + str3 + " content-len=" + response.header(HttpHeaders.CONTENT_LENGTH) + " code=" + response.code());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (IllegalStateException e4) {
                                e = e4;
                                dln.f22095f.remove(str3);
                                file2.delete();
                                if (dfz2 == null) {
                                    message = e.getMessage();
                                    if (e instanceof NumberFormatException) {
                                        message = message + "Content-Length : " + response.header(HttpHeaders.CONTENT_LENGTH) + " url : " + str3;
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message);
                                    }
                                    if (!(e instanceof ProtocolException)) {
                                        dfz2.log("UNEXPECTED_CONTENT_LENGTH", "USER_EXPERIENCE", message + "  url : " + str3 + " content-len=" + response.header(HttpHeaders.CONTENT_LENGTH) + " code=" + response.code());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                ((bwe) b.b()).c();
                            }
                        }
                        file2.delete();
                        dln.f22095f.remove(str3);
                        if (dfz2 != null) {
                            message = "Response is not success : " + response.code() + " url : " + str3;
                            String str = "RESPONSE_NOT_SUCCESS";
                            if (response.code() == HttpStatus.HTTP_NOT_FOUND) {
                                str = "FILE_NOT_FOUND";
                            }
                            dfz2.log(str, "USER_EXPERIENCE", message);
                        }
                    }
                });
            } catch (Throwable e) {
                f22095f.remove(str);
                if (dfz != null) {
                    String str4 = "FAILED_TO_CREATE_FILE";
                    String str5 = "USER_EXPERIENCE";
                    dfz.log(str4, str5, Throwables.getStackTraceAsString(e) + "\nFailed to create file : " + str2 + " url : " + str + "\n" + e.getMessage());
                }
            }
        }
    }

    /* renamed from: c */
    private static String m27894c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(str.lastIndexOf(Constants.SEP) + 1, str.lastIndexOf(".")).toLowerCase();
    }

    /* renamed from: c */
    private bwg m27893c() {
        if (this.f22097c == null) {
            this.f22097c = new bwg(new File(this.f22099e.m27056b(this.f22098d)));
        }
        return this.f22097c;
    }
}
