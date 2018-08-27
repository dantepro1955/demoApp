package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p000.aje.C0208a;

@TargetApi(14)
@bhd
/* renamed from: ajf */
public class ajf extends Thread implements C0208a, OnFrameAvailableListener {
    /* renamed from: a */
    private static final float[] f1629a = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    /* renamed from: A */
    private volatile boolean f1630A;
    /* renamed from: B */
    private volatile boolean f1631B;
    /* renamed from: b */
    private final aje f1632b;
    /* renamed from: c */
    private final float[] f1633c;
    /* renamed from: d */
    private final float[] f1634d;
    /* renamed from: e */
    private final float[] f1635e;
    /* renamed from: f */
    private final float[] f1636f;
    /* renamed from: g */
    private final float[] f1637g;
    /* renamed from: h */
    private final float[] f1638h;
    /* renamed from: i */
    private final float[] f1639i;
    /* renamed from: j */
    private float f1640j;
    /* renamed from: k */
    private float f1641k;
    /* renamed from: l */
    private float f1642l;
    /* renamed from: m */
    private int f1643m;
    /* renamed from: n */
    private int f1644n;
    /* renamed from: o */
    private SurfaceTexture f1645o;
    /* renamed from: p */
    private SurfaceTexture f1646p;
    /* renamed from: q */
    private int f1647q;
    /* renamed from: r */
    private int f1648r;
    /* renamed from: s */
    private int f1649s;
    /* renamed from: t */
    private FloatBuffer f1650t = ByteBuffer.allocateDirect(f1629a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    /* renamed from: u */
    private final CountDownLatch f1651u;
    /* renamed from: v */
    private final Object f1652v;
    /* renamed from: w */
    private EGL10 f1653w;
    /* renamed from: x */
    private EGLDisplay f1654x;
    /* renamed from: y */
    private EGLContext f1655y;
    /* renamed from: z */
    private EGLSurface f1656z;

    public ajf(Context context) {
        super("SphericalVideoProcessor");
        this.f1650t.put(f1629a).position(0);
        this.f1633c = new float[9];
        this.f1634d = new float[9];
        this.f1635e = new float[9];
        this.f1636f = new float[9];
        this.f1637g = new float[9];
        this.f1638h = new float[9];
        this.f1639i = new float[9];
        this.f1640j = Float.NaN;
        this.f1632b = new aje(context);
        this.f1632b.m1814a((C0208a) this);
        this.f1651u = new CountDownLatch(1);
        this.f1652v = new Object();
    }

    /* renamed from: a */
    private float m1819a(float[] fArr) {
        float[] a = m1824a(fArr, new float[]{0.0f, 1.0f, 0.0f});
        return ((float) Math.atan2((double) a[1], (double) a[0])) - 1.5707964f;
    }

    /* renamed from: a */
    private int m1820a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m1821a("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m1821a("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m1821a("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m1821a("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m1821a("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    private void m1821a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
        }
    }

    /* renamed from: a */
    private void m1822a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = (float) (-Math.sin((double) f));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin((double) f);
        fArr[8] = (float) Math.cos((double) f);
    }

    /* renamed from: a */
    private void m1823a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private float[] m1824a(float[] fArr, float[] fArr2) {
        return new float[]{((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]), ((fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[5] * fArr2[2]), ((fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1])) + (fArr[8] * fArr2[2])};
    }

    /* renamed from: b */
    private void m1825b(float[] fArr, float f) {
        fArr[0] = (float) Math.cos((double) f);
        fArr[1] = (float) (-Math.sin((double) f));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin((double) f);
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: h */
    private void m1826h() {
        GLES20.glViewport(0, 0, this.f1644n, this.f1643m);
        m1821a("viewport");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f1647q, "uFOVx");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f1647q, "uFOVy");
        if (this.f1644n > this.f1643m) {
            GLES20.glUniform1f(glGetUniformLocation, 0.87266463f);
            GLES20.glUniform1f(glGetUniformLocation2, (((float) this.f1643m) * 0.87266463f) / ((float) this.f1644n));
            return;
        }
        GLES20.glUniform1f(glGetUniformLocation, (((float) this.f1644n) * 0.87266463f) / ((float) this.f1643m));
        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
    }

    /* renamed from: i */
    private int m1827i() {
        int a = m1820a(35633, m1829k());
        if (a == 0) {
            return 0;
        }
        int a2 = m1820a(35632, m1830l());
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        m1821a("createProgram");
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a);
            m1821a("attachShader");
            GLES20.glAttachShader(glCreateProgram, a2);
            m1821a("attachShader");
            GLES20.glLinkProgram(glCreateProgram);
            m1821a("linkProgram");
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            m1821a("getProgramiv");
            if (iArr[0] != 1) {
                Log.e("SphericalVideoRenderer", "Could not link program: ");
                Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                m1821a("deleteProgram");
                return 0;
            }
            GLES20.glValidateProgram(glCreateProgram);
            m1821a("validateProgram");
        }
        return glCreateProgram;
    }

    /* renamed from: j */
    private EGLConfig m1828j() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        return !this.f1653w.eglChooseConfig(this.f1654x, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) ? null : iArr[0] > 0 ? eGLConfigArr[0] : null;
    }

    /* renamed from: k */
    private String m1829k() {
        baw baw = bbb.bi;
        return !((String) baw.m7064c()).equals(baw.m7063b()) ? (String) baw.m7064c() : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    }

    /* renamed from: l */
    private String m1830l() {
        baw baw = bbb.bj;
        return !((String) baw.m7064c()).equals(baw.m7063b()) ? (String) baw.m7064c() : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    }

    /* renamed from: a */
    public void mo214a() {
        synchronized (this.f1652v) {
            this.f1652v.notifyAll();
        }
    }

    /* renamed from: a */
    public void m1832a(float f, float f2) {
        float f3;
        float f4;
        if (this.f1644n > this.f1643m) {
            f3 = (1.7453293f * f) / ((float) this.f1644n);
            f4 = (1.7453293f * f2) / ((float) this.f1644n);
        } else {
            f3 = (1.7453293f * f) / ((float) this.f1643m);
            f4 = (1.7453293f * f2) / ((float) this.f1643m);
        }
        this.f1641k -= f3;
        this.f1642l -= f4;
        if (this.f1642l < -1.5707964f) {
            this.f1642l = -1.5707964f;
        }
        if (this.f1642l > 1.5707964f) {
            this.f1642l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public void m1833a(int i, int i2) {
        synchronized (this.f1652v) {
            this.f1644n = i;
            this.f1643m = i2;
            this.f1630A = true;
            this.f1652v.notifyAll();
        }
    }

    /* renamed from: a */
    public void m1834a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1644n = i;
        this.f1643m = i2;
        this.f1646p = surfaceTexture;
    }

    /* renamed from: b */
    public void m1835b() {
        synchronized (this.f1652v) {
            this.f1631B = true;
            this.f1646p = null;
            this.f1652v.notifyAll();
        }
    }

    /* renamed from: c */
    public SurfaceTexture m1836c() {
        if (this.f1646p == null) {
            return null;
        }
        try {
            this.f1651u.await();
        } catch (InterruptedException e) {
        }
        return this.f1645o;
    }

    /* renamed from: d */
    void m1837d() {
        while (this.f1649s > 0) {
            this.f1645o.updateTexImage();
            this.f1649s--;
        }
        if (this.f1632b.m1817b(this.f1633c)) {
            if (Float.isNaN(this.f1640j)) {
                this.f1640j = -m1819a(this.f1633c);
            }
            m1825b(this.f1638h, this.f1640j + this.f1641k);
        } else {
            m1822a(this.f1633c, -1.5707964f);
            m1825b(this.f1638h, this.f1641k);
        }
        m1822a(this.f1634d, 1.5707964f);
        m1823a(this.f1635e, this.f1638h, this.f1634d);
        m1823a(this.f1636f, this.f1633c, this.f1635e);
        m1822a(this.f1637g, this.f1642l);
        m1823a(this.f1639i, this.f1637g, this.f1636f);
        GLES20.glUniformMatrix3fv(this.f1648r, 1, false, this.f1639i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m1821a("drawArrays");
        GLES20.glFinish();
        this.f1653w.eglSwapBuffers(this.f1654x, this.f1656z);
    }

    /* renamed from: e */
    int m1838e() {
        this.f1647q = m1827i();
        GLES20.glUseProgram(this.f1647q);
        m1821a("useProgram");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f1647q, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.f1650t);
        m1821a("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        m1821a("enableVertexAttribArray");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m1821a("genTextures");
        glGetAttribLocation = iArr[0];
        GLES20.glBindTexture(36197, glGetAttribLocation);
        m1821a("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m1821a("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m1821a("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m1821a("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m1821a("texParameteri");
        this.f1648r = GLES20.glGetUniformLocation(this.f1647q, "uVMat");
        GLES20.glUniformMatrix3fv(this.f1648r, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        return glGetAttribLocation;
    }

    /* renamed from: f */
    boolean m1839f() {
        this.f1653w = (EGL10) EGLContext.getEGL();
        this.f1654x = this.f1653w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f1654x == EGL10.EGL_NO_DISPLAY) {
            return false;
        }
        if (!this.f1653w.eglInitialize(this.f1654x, new int[2])) {
            return false;
        }
        EGLConfig j = m1828j();
        if (j == null) {
            return false;
        }
        this.f1655y = this.f1653w.eglCreateContext(this.f1654x, j, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        if (this.f1655y == null || this.f1655y == EGL10.EGL_NO_CONTEXT) {
            return false;
        }
        this.f1656z = this.f1653w.eglCreateWindowSurface(this.f1654x, j, this.f1646p, null);
        return (this.f1656z == null || this.f1656z == EGL10.EGL_NO_SURFACE) ? false : this.f1653w.eglMakeCurrent(this.f1654x, this.f1656z, this.f1656z, this.f1655y);
    }

    /* renamed from: g */
    boolean m1840g() {
        boolean z = false;
        if (!(this.f1656z == null || this.f1656z == EGL10.EGL_NO_SURFACE)) {
            z = (this.f1653w.eglMakeCurrent(this.f1654x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | 0) | this.f1653w.eglDestroySurface(this.f1654x, this.f1656z);
            this.f1656z = null;
        }
        if (this.f1655y != null) {
            z |= this.f1653w.eglDestroyContext(this.f1654x, this.f1655y);
            this.f1655y = null;
        }
        if (this.f1654x == null) {
            return z;
        }
        z |= this.f1653w.eglTerminate(this.f1654x);
        this.f1654x = null;
        return z;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f1649s++;
        synchronized (this.f1652v) {
            this.f1652v.notifyAll();
        }
    }

    public void run() {
        Object obj = 1;
        if (this.f1646p == null) {
            bky.m9008c("SphericalVideoProcessor started with no output texture.");
            this.f1651u.countDown();
            return;
        }
        boolean f = m1839f();
        int e = m1838e();
        if (this.f1647q == 0) {
            obj = null;
        }
        if (!f || r0 == null) {
            String str = "EGL initialization failed: ";
            String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f1653w.eglGetError()));
            valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            bky.m9008c(valueOf);
            ako.m2347i().m8934a(new Throwable(valueOf), "SphericalVideoProcessor.run.1");
            m1840g();
            this.f1651u.countDown();
            return;
        }
        this.f1645o = new SurfaceTexture(e);
        this.f1645o.setOnFrameAvailableListener(this);
        this.f1651u.countDown();
        this.f1632b.m1816b();
        try {
            this.f1630A = true;
            while (!this.f1631B) {
                m1837d();
                if (this.f1630A) {
                    m1826h();
                    this.f1630A = false;
                }
                try {
                    synchronized (this.f1652v) {
                        if (!(this.f1631B || this.f1630A || this.f1649s != 0)) {
                            this.f1652v.wait();
                        }
                    }
                } catch (InterruptedException e2) {
                }
            }
        } catch (IllegalStateException e3) {
            bky.m9011e("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th) {
            bky.m9007b("SphericalVideoProcessor died.", th);
            ako.m2347i().m8934a(th, "SphericalVideoProcessor.run.2");
        } finally {
            this.f1632b.m1818c();
            this.f1645o.setOnFrameAvailableListener(null);
            this.f1645o = null;
            m1840g();
        }
    }
}
