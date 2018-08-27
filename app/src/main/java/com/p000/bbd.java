package com.p000;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@bhd
/* renamed from: bbd */
public class bbd {
    /* renamed from: a */
    BlockingQueue<bbj> f5427a;
    /* renamed from: b */
    ExecutorService f5428b;
    /* renamed from: c */
    LinkedHashMap<String, String> f5429c = new LinkedHashMap();
    /* renamed from: d */
    Map<String, bbg> f5430d = new HashMap();
    /* renamed from: e */
    String f5431e;
    /* renamed from: f */
    final Context f5432f;
    /* renamed from: g */
    final String f5433g;
    /* renamed from: h */
    private AtomicBoolean f5434h;
    /* renamed from: i */
    private File f5435i;

    /* renamed from: bbd$1 */
    class C09861 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bbd f5426a;

        C09861(bbd bbd) {
            this.f5426a = bbd;
        }

        public void run() {
            this.f5426a.m7135a();
        }
    }

    public bbd(Context context, String str, String str2, Map<String, String> map) {
        this.f5432f = context;
        this.f5433g = str;
        this.f5431e = str2;
        this.f5434h = new AtomicBoolean(false);
        this.f5434h.set(((Boolean) bbb.f5389V.m7064c()).booleanValue());
        if (this.f5434h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f5435i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f5429c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f5427a = new ArrayBlockingQueue(30);
        this.f5428b = Executors.newSingleThreadExecutor();
        this.f5428b.execute(new C09861(this));
        this.f5430d.put(NativeProtocol.WEB_DIALOG_ACTION, bbg.f5437b);
        this.f5430d.put("ad_format", bbg.f5437b);
        this.f5430d.put("e", bbg.f5438c);
    }

    /* renamed from: a */
    private void m7135a() {
        while (true) {
            try {
                bbj bbj = (bbj) this.f5427a.take();
                String c = bbj.m7169c();
                if (!TextUtils.isEmpty(c)) {
                    m7138a(m7141a(this.f5429c, bbj.m7170d()), c);
                }
            } catch (Throwable e) {
                bky.m9009c("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m7137a(File file, String str) {
        FileOutputStream fileOutputStream;
        Throwable e;
        if (file != null) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (Throwable e2) {
                        bky.m9009c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                        return;
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        bky.m9009c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (Throwable e22) {
                                bky.m9009c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        e22 = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e4) {
                                bky.m9009c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw e22;
                    }
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream = null;
                bky.m9009c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                e22 = th2;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e22;
            }
        }
        bky.m9011e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    /* renamed from: a */
    private void m7138a(Map<String, String> map, String str) {
        String a = m7140a(this.f5431e, map, str);
        if (this.f5434h.get()) {
            m7137a(this.f5435i, a);
        } else {
            ako.m2343e().m9122b(this.f5432f, this.f5433g, a);
        }
    }

    /* renamed from: a */
    public bbg m7139a(String str) {
        bbg bbg = (bbg) this.f5430d.get(str);
        return bbg != null ? bbg : bbg.f5436a;
    }

    /* renamed from: a */
    String m7140a(String str, Map<String, String> map, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
        stringBuilder.append("&").append("it").append("=").append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    Map<String, String> m7141a(Map<String, String> map, Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m7139a(str).mo914a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public void m7142a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f5429c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public boolean m7143a(bbj bbj) {
        return this.f5427a.offer(bbj);
    }
}
