package com.p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aqj */
public class aqj implements ServiceConnection {
    /* renamed from: a */
    boolean f3949a = false;
    /* renamed from: b */
    private final BlockingQueue<IBinder> f3950b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m4943a() throws InterruptedException {
        aoi.m4691c("BlockingServiceConnection.getService() called on main thread");
        if (this.f3949a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3949a = true;
        return (IBinder) this.f3950b.take();
    }

    /* renamed from: a */
    public IBinder m4944a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        aoi.m4691c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3949a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3949a = true;
        IBinder iBinder = (IBinder) this.f3950b.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3950b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
