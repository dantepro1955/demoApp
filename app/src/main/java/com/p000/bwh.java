package com.p000;

import android.annotation.SuppressLint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: Journal */
/* renamed from: bwh */
class bwh {
    /* renamed from: a */
    static final Charset f7995a = Charset.forName("US-ASCII");
    /* renamed from: b */
    private static final String f7996b = bwh.class.getSimpleName();
    /* renamed from: c */
    private final File f7997c;
    /* renamed from: d */
    private final File f7998d;
    /* renamed from: e */
    private final File f7999e;
    /* renamed from: f */
    private final File f8000f;
    /* renamed from: g */
    private final bwg f8001g;
    /* renamed from: h */
    private final Executor f8002h;
    /* renamed from: i */
    private Writer f8003i;
    /* renamed from: j */
    private int f8004j = 0;

    /* compiled from: Journal */
    /* renamed from: bwh$1 */
    class C15591 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bwh f7992a;

        C15591(bwh bwh) {
            this.f7992a = bwh;
        }

        public void run() {
            if (this.f7992a.f8004j > 1000) {
                this.f7992a.m11536b();
            }
        }
    }

    @SuppressLint({"EmptyCatchBlock"})
    /* compiled from: Journal */
    /* renamed from: bwh$a */
    class C1560a implements Runnable {
        /* renamed from: a */
        final String f7993a;
        /* renamed from: b */
        final /* synthetic */ bwh f7994b;

        public C1560a(bwh bwh, String str) {
            this.f7994b = bwh;
            this.f7993a = str;
        }

        public void run() {
            try {
                if (this.f7994b.f8003i != null) {
                    this.f7994b.f8003i.write(this.f7993a);
                    this.f7994b.f8003i.flush();
                    this.f7994b.f8004j = this.f7994b.f8004j + 1;
                    this.f7994b.m11537c();
                }
            } catch (IOException e) {
            }
        }
    }

    bwh(File file, bwg bwg, Executor executor) {
        this.f7998d = new File(file, "journal");
        this.f7999e = new File(file, "journal.tmp");
        this.f8000f = new File(file, "journal.bkp");
        this.f7997c = file;
        this.f8001g = bwg;
        this.f8002h = executor;
    }

    @SuppressLint({"EmptyCatchBlock"})
    /* renamed from: a */
    LinkedHashMap<String, bwf> m11533a() {
        Closeable closeable;
        Throwable th;
        bwh.m11527a(this.f7997c);
        File file = new File(this.f7997c, "journal");
        if (file.exists()) {
            LinkedHashMap<String, bwf> linkedHashMap = new LinkedHashMap();
            Closeable bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String readLine;
                    Object obj;
                    bwf bwf;
                    Set<String> hashSet = new HashSet();
                    while (true) {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(" ");
                        obj = split[0];
                        String str = split[1];
                        if ("CLEAN".equals(obj) && split.length == 3) {
                            bwf bwf2 = (bwf) linkedHashMap.get(str);
                            if (bwf2 == null) {
                                bwf2 = new bwf(this.f7997c, str);
                                linkedHashMap.put(str, bwf2);
                            }
                            bwf2.m11501a(Long.parseLong(split[2]));
                            hashSet.remove(str);
                        } else if ("DIRTY".equals(obj) && split.length == 2) {
                            hashSet.add(str);
                        } else {
                            obj = 1;
                        }
                        this.f8004j++;
                        if (obj != null) {
                            for (String readLine2 : hashSet) {
                                bwf = (bwf) linkedHashMap.get(readLine2);
                                if (bwf != null) {
                                    bwh.m11531c(bwf.m11500a());
                                    bwh.m11531c(bwf.m11503b());
                                }
                                linkedHashMap.remove(readLine2);
                            }
                            m11532d();
                            bwh.m11526a(bufferedReader);
                            return linkedHashMap;
                        }
                        bwh.m11526a(bufferedReader);
                    }
                    obj = null;
                    if (obj != null) {
                        bwh.m11526a(bufferedReader);
                    } else {
                        for (String readLine22 : hashSet) {
                            bwf = (bwf) linkedHashMap.get(readLine22);
                            if (bwf != null) {
                                bwh.m11531c(bwf.m11500a());
                                bwh.m11531c(bwf.m11503b());
                            }
                            linkedHashMap.remove(readLine22);
                        }
                        m11532d();
                        bwh.m11526a(bufferedReader);
                        return linkedHashMap;
                    }
                } catch (IOException e) {
                    closeable = bufferedReader;
                } catch (IndexOutOfBoundsException e2) {
                    closeable = bufferedReader;
                } catch (NumberFormatException e3) {
                    closeable = bufferedReader;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                closeable = null;
                bwh.m11526a(closeable);
                bwh.m11529b(this.f7997c);
                return null;
            } catch (IndexOutOfBoundsException e5) {
                closeable = null;
                bwh.m11526a(closeable);
                bwh.m11529b(this.f7997c);
                return null;
            } catch (NumberFormatException e6) {
                closeable = null;
                bwh.m11526a(closeable);
                bwh.m11529b(this.f7997c);
                return null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                bwh.m11526a(bufferedReader);
                throw th;
            }
        }
        bwh.m11529b(this.f7997c);
        return null;
    }

    /* renamed from: a */
    private static void m11527a(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                file2.renameTo(file3);
            }
        }
    }

    /* renamed from: d */
    private void m11532d() {
        try {
            this.f8003i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7998d, true), f7995a));
        } catch (IOException e) {
            bwh.m11526a(this.f8003i);
            this.f8003i = null;
        }
    }

    @SuppressLint({"EmptyCatchBlock"})
    /* renamed from: b */
    void m11536b() {
        Closeable bufferedWriter;
        Throwable th;
        if (this.f8003i != null) {
            bwh.m11526a(this.f8003i);
        }
        Closeable closeable = null;
        try {
            ArrayList b = this.f8001g.m11522b();
            this.f8004j = b.size();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7999e), f7995a));
            try {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    bwf bwf = (bwf) it.next();
                    if (bwf.m11505d()) {
                        bufferedWriter.write("CLEAN " + bwf.m11507f() + ' ' + String.valueOf(bwf.m11504c()) + '\n');
                    } else {
                        bufferedWriter.write("DIRTY " + bwf.m11507f() + '\n');
                    }
                }
                bufferedWriter.flush();
                if (this.f7998d.exists()) {
                    this.f7998d.renameTo(this.f8000f);
                }
                this.f7999e.renameTo(this.f7998d);
                m11532d();
                this.f8000f.delete();
                bwh.m11526a(bufferedWriter);
            } catch (IOException e) {
                closeable = bufferedWriter;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            bwh.m11526a(closeable);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedWriter = null;
            th = th4;
            bwh.m11526a(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: a */
    void m11534a(String str) {
        this.f8002h.execute(new C1560a(this, "DIRTY " + str + '\n'));
    }

    /* renamed from: a */
    void m11535a(String str, long j) {
        this.f8002h.execute(new C1560a(this, "CLEAN " + str + ' ' + String.valueOf(j) + '\n'));
    }

    /* renamed from: c */
    void m11537c() {
        if (this.f8004j > 1000) {
            this.f8002h.execute(new C15591(this));
        }
    }

    /* renamed from: a */
    static void m11526a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: b */
    private static void m11529b(File file) {
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    if (name.endsWith(".clean") || name.endsWith(".tmp")) {
                        bwh.m11531c(file2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m11531c(File file) {
        if (file.exists()) {
            file.delete();
        }
    }
}
