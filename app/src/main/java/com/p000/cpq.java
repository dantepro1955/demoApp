package com.p000;

import android.content.Context;
import android.media.ExifInterface;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import com.facebook.common.util.ByteConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: DeviceUtils */
/* renamed from: cpq */
public final class cpq {
    /* renamed from: a */
    private static final File[] f19944a = new File[]{Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), new File("/sdcard/Android/data"), new File("/Android/data")};
    /* renamed from: b */
    private static final File f19945b = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    /* renamed from: c */
    private static Context f19946c;
    /* renamed from: d */
    private static boolean f19947d;

    /* compiled from: DeviceUtils */
    /* renamed from: cpq$1 */
    static class C45221 extends AsyncTask<String, Void, Void> {
        C45221() {
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m24314a((String[]) objArr);
        }

        /* renamed from: a */
        protected Void m24314a(String... strArr) {
            cpq.m24320b(cpq.f19946c, strArr[0]);
            cpq.m24323c(strArr[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static void m24315a(Context context) {
        f19946c = context;
    }

    /* renamed from: a */
    public static boolean m24318a() {
        return f19947d;
    }

    /* renamed from: b */
    public static String m24319b() {
        if (ew.b(f19946c, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return cpq.m24326f();
        }
        String d = cpq.m24324d();
        if (d != null) {
            return d;
        }
        d = cpq.m24325e();
        if (d != null) {
            return d;
        }
        d = cpq.m24326f();
        cpq.m24317a(d);
        return d;
    }

    /* renamed from: d */
    private static String m24324d() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Throwable th;
        for (File file : f19944a) {
            try {
                File file2 = new File(new File(file2, ".9gag"), ".nomedia");
                if (file2.exists()) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file2));
                        try {
                            String readLine = bufferedReader.readLine();
                            if (!TextUtils.isEmpty(readLine) && readLine.length() > 10) {
                                cpq.m24317a(readLine);
                                if (bufferedReader == null) {
                                    return readLine;
                                }
                                bufferedReader.close();
                                return readLine;
                            } else if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (IOException e) {
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e2) {
                        bufferedReader2 = null;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } else {
                    continue;
                }
            } catch (Exception e3) {
            }
        }
        return null;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }

    /* renamed from: e */
    private static String m24325e() {
        try {
            File file = new File(new File(f19945b, ".9gag"), ".nomedia");
            if (file.exists()) {
                String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("UserComment");
                if (!TextUtils.isEmpty(attribute) && attribute.length() > 10) {
                    cpq.m24317a(attribute);
                    return attribute;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    /* renamed from: f */
    private static String m24326f() {
        caf.a().h().c(true);
        return (VERSION.SDK_INT >= 23 ? "v6" : "v1") + "-" + cqw.m24520a() + "-" + UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static void m24317a(String str) {
        if (ew.b(f19946c, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            try {
                new C45221().executeOnExecutor(djx.m27634a(), new String[]{str});
            } catch (RejectedExecutionException e) {
            }
        }
    }

    /* renamed from: b */
    private static void m24320b(Context context, String str) {
        InputStream open;
        OutputStream bufferedOutputStream;
        InputStream inputStream;
        ExifInterface exifInterface;
        Throwable th;
        OutputStream outputStream = null;
        try {
            File file = new File(f19945b, ".9gag");
            File file2 = new File(file, ".nomedia");
            if (!file2.exists()) {
                file.mkdirs();
                try {
                    open = context.getResources().getAssets().open("logo.jpg");
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        try {
                            byte[] bArr = new byte[ByteConstants.KB];
                            while (true) {
                                int read = open.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (open != null) {
                                open.close();
                            }
                        } catch (IOException e) {
                            inputStream = open;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            exifInterface = new ExifInterface(file2.getAbsolutePath());
                            exifInterface.setAttribute("UserComment", str);
                            exifInterface.saveAttributes();
                            f19947d = true;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            outputStream = bufferedOutputStream;
                            th = th3;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (open != null) {
                                open.close();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        bufferedOutputStream = null;
                        inputStream = open;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        exifInterface = new ExifInterface(file2.getAbsolutePath());
                        exifInterface.setAttribute("UserComment", str);
                        exifInterface.saveAttributes();
                        f19947d = true;
                    } catch (Throwable th4) {
                        th = th4;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    bufferedOutputStream = null;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    exifInterface = new ExifInterface(file2.getAbsolutePath());
                    exifInterface.setAttribute("UserComment", str);
                    exifInterface.saveAttributes();
                    f19947d = true;
                } catch (Throwable th5) {
                    th = th5;
                    open = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                    throw th;
                }
            }
            exifInterface = new ExifInterface(file2.getAbsolutePath());
            exifInterface.setAttribute("UserComment", str);
            exifInterface.saveAttributes();
            f19947d = true;
        } catch (Exception e4) {
        }
    }

    /* renamed from: c */
    private static void m24323c(String str) {
        Writer bufferedWriter;
        Throwable th;
        for (File file : f19944a) {
            try {
                File file2 = new File(file, ".9gag");
                File file3 = new File(file2, ".nomedia");
                if (file3.exists()) {
                    continue;
                } else {
                    file2.mkdirs();
                    Writer writer = null;
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file3));
                        try {
                            bufferedWriter.write(str);
                            f19947d = true;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                        } catch (IOException e) {
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            writer = bufferedWriter;
                            th = th3;
                        }
                    } catch (IOException e2) {
                        bufferedWriter = null;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Exception e3) {
            }
        }
        return;
        if (writer != null) {
            writer.close();
        }
        throw th;
    }
}
