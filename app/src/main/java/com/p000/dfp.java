package com.p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: BitmapManager */
/* renamed from: dfp */
public class dfp {
    /* renamed from: a */
    private static dfp f21503a = new dfp();
    /* renamed from: b */
    private int f21504b = (((int) (Runtime.getRuntime().maxMemory() / 1024)) / 4);
    /* renamed from: c */
    private dfq f21505c = new dfq(this.f21504b);
    /* renamed from: d */
    private boolean f21506d = false;
    /* renamed from: e */
    private HandlerThread f21507e = new C4875b();
    /* renamed from: f */
    private Handler f21508f;
    /* renamed from: g */
    private boolean f21509g = false;
    /* renamed from: h */
    private boolean f21510h = false;
    /* renamed from: i */
    private boolean f21511i = true;

    /* compiled from: BitmapManager */
    /* renamed from: dfp$a */
    public static class C4874a extends Handler {
        /* renamed from: a */
        private dfq f21498a;

        public C4874a(Looper looper, dfq dfq) {
            super(looper);
            this.f21498a = dfq;
        }

        public void handleMessage(Message message) {
            m27042a((C4876c) message.obj);
        }

        /* renamed from: a */
        private void m27042a(C4876c c4876c) {
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2;
            Throwable th;
            String str = c4876c.f21499a;
            int i = c4876c.f21502d;
            Handler handler = c4876c.f21500b;
            Bundle bundle = c4876c.f21501c;
            if (i > 1) {
                str = str + "-" + i;
            }
            if (this.f21498a.get(str) == null) {
                File file = new File(str);
                if (file.exists()) {
                    if (c4876c.f21501c != null) {
                        String string = c4876c.f21501c.getString("lock");
                        if (string != null && new File(string).exists()) {
                            return;
                        }
                    }
                    try {
                        Options options = new Options();
                        options.inSampleSize = i;
                        System.currentTimeMillis();
                        fileInputStream = new FileInputStream(file);
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                            if (decodeStream == null) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                    }
                                }
                                file.delete();
                            } else {
                                synchronized (this.f21498a) {
                                    this.f21498a.put(str + (i > 1 ? "-" + i : ""), decodeStream);
                                }
                                if (handler != null) {
                                    handler.sendMessage(m27041a(0, bundle));
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        return;
                                    } catch (IOException e2) {
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (FileNotFoundException e3) {
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e5) {
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e6) {
                            }
                        }
                        file.delete();
                        if (handler != null) {
                            handler.sendMessage(m27041a(1, bundle));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                if (handler != null) {
                    handler.sendMessage(m27041a(1, bundle));
                }
            }
        }

        /* renamed from: a */
        private Message m27041a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.setData(bundle);
            obtain.what = i;
            return obtain;
        }
    }

    /* compiled from: BitmapManager */
    /* renamed from: dfp$b */
    public static class C4875b extends HandlerThread {
        public C4875b() {
            super("BitmapMananger");
        }
    }

    /* compiled from: BitmapManager */
    /* renamed from: dfp$c */
    static class C4876c {
        /* renamed from: a */
        String f21499a;
        /* renamed from: b */
        Handler f21500b;
        /* renamed from: c */
        Bundle f21501c;
        /* renamed from: d */
        int f21502d;

        C4876c(String str, Handler handler, Bundle bundle, int i) {
            this.f21499a = str;
            this.f21500b = handler;
            this.f21501c = bundle;
            this.f21502d = i;
        }
    }

    /* renamed from: a */
    public static dfp m27043a() {
        return f21503a;
    }

    private dfp() {
        this.f21507e.start();
        this.f21508f = new C4874a(this.f21507e.getLooper(), this.f21505c);
    }

    /* renamed from: a */
    public void m27045a(int i) {
        this.f21504b = i;
        this.f21505c = new dfq(this.f21504b);
        this.f21508f = new C4874a(this.f21507e.getLooper(), this.f21505c);
    }

    /* renamed from: a */
    public Bitmap m27044a(String str, Handler handler, Bundle bundle, int i) {
        if (i > 1) {
            str = str + "-" + i;
        }
        Bitmap bitmap = (Bitmap) this.f21505c.get(str);
        if (bitmap == null) {
            Message obtain = Message.obtain();
            obtain.obj = new C4876c(str, handler, bundle, i);
            this.f21508f.sendMessage(obtain);
        }
        return bitmap;
    }
}
