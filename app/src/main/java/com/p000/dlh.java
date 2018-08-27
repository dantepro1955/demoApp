package com.p000;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* compiled from: BaseWebSocketClientModule */
/* renamed from: dlh */
public abstract class dlh implements dli {
    /* renamed from: a */
    private int f21257a = 0;
    /* renamed from: b */
    private HandlerThread f21258b;
    /* renamed from: c */
    private Handler f21259c;
    /* renamed from: d */
    private Runnable f21260d = new C49681(this);
    /* renamed from: e */
    private OkHttpClient f21261e;
    /* renamed from: f */
    private WebSocket f21262f;
    /* renamed from: g */
    private Call f21263g;
    /* renamed from: h */
    private WebSocketListener f21264h = new C49692(this);

    /* compiled from: BaseWebSocketClientModule */
    /* renamed from: dlh$1 */
    class C49681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dlh f21991a;

        C49681(dlh dlh) {
            this.f21991a = dlh;
        }

        public void run() {
            if (this.f21991a.f21257a >= 5) {
                this.f21991a.mo4333c();
            } else {
                this.f21991a.mo4334d();
            }
        }
    }

    /* compiled from: BaseWebSocketClientModule */
    /* renamed from: dlh$2 */
    class C49692 extends WebSocketListener {
        /* renamed from: a */
        final /* synthetic */ dlh f21992a;

        C49692(dlh dlh) {
            this.f21992a = dlh;
        }

        public void onOpen(WebSocket webSocket, Response response) {
            this.f21992a.f21262f = webSocket;
        }

        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            this.f21992a.mo4332b("");
        }

        public void onMessage(WebSocket webSocket, String str) {
            this.f21992a.mo4330a(str);
        }

        public void onClosed(WebSocket webSocket, int i, String str) {
            this.f21992a.mo4329a(i, str);
        }
    }

    /* compiled from: BaseWebSocketClientModule */
    /* renamed from: dlh$3 */
    class C49703 implements Callback {
        /* renamed from: a */
        final /* synthetic */ dlh f21993a;

        C49703(dlh dlh) {
            this.f21993a = dlh;
        }

        public void onFailure(Call call, IOException iOException) {
            this.f21993a.f21264h.onFailure(this.f21993a.f21262f, iOException, null);
        }

        public void onResponse(Call call, Response response) throws IOException {
            this.f21993a.f21264h.onMessage(this.f21993a.f21262f, response.body().string());
        }
    }

    public dlh(OkHttpClient okHttpClient) {
        this.f21261e = okHttpClient;
        this.f21258b = new HandlerThread("ws-retry-timer", 10);
        this.f21258b.start();
        this.f21259c = new Handler(this.f21258b.getLooper());
    }

    /* renamed from: b */
    public void mo4331b() {
        this.f21263g = this.f21261e.newCall(new Builder().url(mo4328a()).build());
        this.f21263g.enqueue(new C49703(this));
    }

    /* renamed from: c */
    public void mo4333c() {
        try {
            this.f21259c.removeCallbacks(this.f21260d);
            this.f21258b.quit();
            this.f21262f.close(1000, "Close");
            this.f21261e.dispatcher().executorService().shutdown();
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public void mo4332b(String str) {
        this.f21257a++;
        int pow = ((int) Math.pow(2.0d, (double) this.f21257a)) * 1000;
        if (!this.f21258b.isAlive()) {
            this.f21258b = new HandlerThread("ws-retry-timer", 10);
            this.f21258b.start();
            this.f21259c = new Handler(this.f21258b.getLooper());
        }
        this.f21259c.postDelayed(this.f21260d, (long) pow);
    }

    /* renamed from: d */
    public void mo4334d() {
        if (!this.f21261e.dispatcher().executorService().isShutdown()) {
            mo4331b();
        }
    }
}
