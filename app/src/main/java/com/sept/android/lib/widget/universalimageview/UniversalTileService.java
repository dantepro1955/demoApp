package com.sept.android.lib.widget.universalimageview;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.dly;

public class UniversalTileService extends Service {
    /* renamed from: a */
    ThreadPoolExecutor f19853a;
    /* renamed from: b */
    private LinkedBlockingQueue<Runnable> f19854b;

    /* renamed from: com.sept.android.lib.widget.universalimageview.UniversalTileService$a */
    static class C4514a implements Runnable {
        /* renamed from: a */
        private WeakReference<UniversalTileService> f19851a;
        /* renamed from: b */
        private Runnable f19852b;

        private C4514a(UniversalTileService universalTileService, Runnable runnable) {
            this.f19851a = new WeakReference(universalTileService);
            this.f19852b = runnable;
        }

        public void run() {
            this.f19852b.run();
            UniversalTileService universalTileService = (UniversalTileService) this.f19851a.get();
            if (universalTileService != null) {
                universalTileService.stopSelf();
            }
        }
    }

    public void onCreate() {
        this.f19854b = new LinkedBlockingQueue();
        this.f19853a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19854b);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m24198a(intent);
        return 1;
    }

    /* renamed from: a */
    private void m24198a(Intent intent) {
        if (intent != null) {
            this.f19853a.execute(new C4514a(new dly(this, intent.getStringExtra("image_path"))));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
