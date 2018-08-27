package com.p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;

@bhd
/* renamed from: aje */
class aje implements SensorEventListener {
    /* renamed from: a */
    private final SensorManager f1621a;
    /* renamed from: b */
    private final Object f1622b = new Object();
    /* renamed from: c */
    private final Display f1623c;
    /* renamed from: d */
    private final float[] f1624d = new float[9];
    /* renamed from: e */
    private final float[] f1625e = new float[9];
    /* renamed from: f */
    private float[] f1626f;
    /* renamed from: g */
    private Handler f1627g;
    /* renamed from: h */
    private C0208a f1628h;

    /* renamed from: aje$1 */
    class C02071 implements Runnable {
        C02071(aje aje) {
        }

        public void run() {
            Looper.myLooper().quit();
        }
    }

    /* renamed from: aje$a */
    interface C0208a {
        /* renamed from: a */
        void mo214a();
    }

    aje(Context context) {
        this.f1621a = (SensorManager) context.getSystemService("sensor");
        this.f1623c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private void m1812a(int i, int i2) {
        float f = this.f1625e[i];
        this.f1625e[i] = this.f1625e[i2];
        this.f1625e[i2] = f;
    }

    /* renamed from: a */
    int m1813a() {
        return this.f1623c.getRotation();
    }

    /* renamed from: a */
    void m1814a(C0208a c0208a) {
        this.f1628h = c0208a;
    }

    /* renamed from: a */
    void m1815a(float[] fArr) {
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f1622b) {
                if (this.f1626f == null) {
                    this.f1626f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f1624d, fArr);
            switch (m1813a()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f1624d, 2, 129, this.f1625e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f1624d, 129, 130, this.f1625e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f1624d, 130, 1, this.f1625e);
                    break;
                default:
                    System.arraycopy(this.f1624d, 0, this.f1625e, 0, 9);
                    break;
            }
            m1812a(1, 3);
            m1812a(2, 6);
            m1812a(5, 7);
            synchronized (this.f1622b) {
                System.arraycopy(this.f1625e, 0, this.f1626f, 0, 9);
            }
            if (this.f1628h != null) {
                this.f1628h.mo214a();
            }
        }
    }

    /* renamed from: b */
    void m1816b() {
        if (this.f1627g == null) {
            Sensor defaultSensor = this.f1621a.getDefaultSensor(11);
            if (defaultSensor == null) {
                bky.m9008c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f1627g = new Handler(handlerThread.getLooper());
            if (!this.f1621a.registerListener(this, defaultSensor, 0, this.f1627g)) {
                bky.m9008c("SensorManager.registerListener failed.");
                m1818c();
            }
        }
    }

    /* renamed from: b */
    boolean m1817b(float[] fArr) {
        boolean z = false;
        synchronized (this.f1622b) {
            if (this.f1626f == null) {
            } else {
                System.arraycopy(this.f1626f, 0, fArr, 0, this.f1626f.length);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    void m1818c() {
        if (this.f1627g != null) {
            this.f1621a.unregisterListener(this);
            this.f1627g.post(new C02071(this));
            this.f1627g = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        m1815a(sensorEvent.values);
    }
}
