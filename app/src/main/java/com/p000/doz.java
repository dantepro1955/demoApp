package com.p000;

import com.facebook.internal.ServerProtocol;
import java.util.Vector;
import p000.dnm.C5007a;

/* renamed from: doz */
public class doz extends dnl implements dot {
    /* renamed from: c */
    private static final rk f22463c = dnn.m28258a(doz.class);
    /* renamed from: b */
    public String f22464b;
    /* renamed from: d */
    private dpa f22465d;
    /* renamed from: e */
    private Object f22466e;
    /* renamed from: f */
    private sp f22467f;

    public doz(String str, short s, String str2, byte[] bArr, String str3, rg rgVar, rg rgVar2, String str4, Vector vector, dov dov) {
        super(str, s, str3, rgVar, rgVar2);
        if (str2 == null) {
            throw new IllegalArgumentException(" application id is null.");
        }
        this.f22464b = str2;
        if (bArr == null) {
            throw new IllegalArgumentException(" application key is null");
        }
        Vector vector2;
        long j;
        String str5;
        int i;
        Object obj;
        Object obj2 = 1;
        long j2 = 5242880;
        int i2 = 7;
        String str6 = null;
        if (vector == null || vector.size() == 0) {
            vector2 = new Vector();
            j = 5242880;
            str5 = null;
            i = 7;
            obj = 1;
        } else {
            Vector vector3 = new Vector(vector.size());
            for (int i3 = 0; i3 < vector.size(); i3++) {
                dnm dnm = (dnm) vector.elementAt(i3);
                if (dnm.m28251d() == C5007a.f22310a) {
                    if (dnm.m28248a().equals("DEVICE_CMD_LOG_TO_SERVER_ENABLED")) {
                        this.f22466e = new Vector();
                    } else if (dnm.m28248a().equals("Calllog_Disable")) {
                        if (new String(dnm.m28249b()).equals("TRUE") || new String(dnm.m28249b()).equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                            obj2 = null;
                        } else if (new String(dnm.m28249b()).equals("FALSE") || new String(dnm.m28249b()).equals("false")) {
                            obj2 = 1;
                        }
                    } else if (dnm.m28248a().equals("Calllog_Root_Id")) {
                        str6 = new String(dnm.m28249b());
                    } else if (dnm.m28248a().equals("Calllog_Size_Limit")) {
                        j2 = Long.parseLong(new String(dnm.m28249b()));
                    } else if (dnm.m28248a().equals("Calllog_Retention_Days")) {
                        i2 = Integer.parseInt(new String(dnm.m28249b()));
                    }
                }
                vector3.addElement(dnm);
            }
            j = j2;
            str5 = str6;
            i = i2;
            obj = obj2;
            vector2 = vector3;
        }
        if (str4 == null && obj != null) {
            f22463c.mo4281e("NullPointerException calllogFileName is NULL.");
            throw new NullPointerException("calllogFileName can not be null!");
        } else if (j < 0) {
            f22463c.mo4281e("NMSP_DEFINES_CALLLOG_FILE_SIZE_LIMIT can not be negative!");
            throw new NullPointerException("NMSP_DEFINES_CALLLOG_FILE_SIZE_LIMIT can not be negative!");
        } else {
            this.f22465d = new dpa(m28240b(), m28242c(), str2, bArr, str3, vector2, z_(), dov);
            if (obj != null) {
                this.f22467f = new st(str4, j, i, str5, this.a, this.f22464b, z_(), this.f22465d.m28543b());
                this.f22465d.m28539a(((st) this.f22467f).m34138b());
            }
        }
    }

    /* renamed from: a */
    public final sp mo4507a() {
        return this.f22467f;
    }

    /* renamed from: h */
    public final dpa m28513h() {
        return this.f22465d;
    }

    /* renamed from: i */
    public final Object m28514i() {
        return this.f22466e;
    }

    public final void y_() {
        f22463c.mo4275b((Object) "shutdown");
        if (this.f22467f != null) {
            sq b = ((st) this.f22467f).m34138b();
            if (b != null) {
                b.mo5518a("NMSP_ShutDown").mo5521a();
            }
        }
        this.f22465d.m28548e();
    }
}
