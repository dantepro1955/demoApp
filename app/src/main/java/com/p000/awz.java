package com.p000;

import java.io.IOException;

/* renamed from: awz */
public abstract class awz<M extends awz<M>> extends axf {
    protected axb ag;

    /* renamed from: a */
    private void m5623a(int i, axh axh) {
        axc axc = null;
        if (this.ag == null) {
            this.ag = new axb();
        } else {
            axc = this.ag.m6275a(i);
        }
        if (axc == null) {
            axc = new axc();
            this.ag.m6276a(i, axc);
        }
        axc.m6283a(axh);
    }

    /* renamed from: a */
    protected int mo718a() {
        int i = 0;
        if (this.ag == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.ag.m6274a()) {
            i2 += this.ag.m6277b(i).m6281a();
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo719a(awy awy) throws IOException {
        if (this.ag != null) {
            for (int i = 0; i < this.ag.m6274a(); i++) {
                this.ag.m6277b(i).m6282a(awy);
            }
        }
    }

    /* renamed from: a */
    protected final boolean m5626a(awx awx, int i) throws IOException {
        int p = awx.m6200p();
        if (!awx.m6182b(i)) {
            return false;
        }
        m5623a(axi.m6312b(i), new axh(i, awx.m6180a(p, awx.m6200p() - p)));
        return true;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo820d();
    }

    /* renamed from: d */
    public M mo820d() throws CloneNotSupportedException {
        awz awz = (awz) super.mo721e();
        axd.m6289a(this, awz);
        return awz;
    }

    /* renamed from: e */
    public /* synthetic */ axf mo721e() throws CloneNotSupportedException {
        return (awz) clone();
    }
}
