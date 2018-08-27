package com.p000;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: RtlSpacingHelper */
/* renamed from: pw */
public class pw {
    /* renamed from: a */
    private int f25154a = 0;
    /* renamed from: b */
    private int f25155b = 0;
    /* renamed from: c */
    private int f25156c = LinearLayoutManager.INVALID_OFFSET;
    /* renamed from: d */
    private int f25157d = LinearLayoutManager.INVALID_OFFSET;
    /* renamed from: e */
    private int f25158e = 0;
    /* renamed from: f */
    private int f25159f = 0;
    /* renamed from: g */
    private boolean f25160g = false;
    /* renamed from: h */
    private boolean f25161h = false;

    /* renamed from: a */
    public int m33731a() {
        return this.f25154a;
    }

    /* renamed from: b */
    public int m33734b() {
        return this.f25155b;
    }

    /* renamed from: c */
    public int m33736c() {
        return this.f25160g ? this.f25155b : this.f25154a;
    }

    /* renamed from: d */
    public int m33737d() {
        return this.f25160g ? this.f25154a : this.f25155b;
    }

    /* renamed from: a */
    public void m33732a(int i, int i2) {
        this.f25156c = i;
        this.f25157d = i2;
        this.f25161h = true;
        if (this.f25160g) {
            if (i2 != LinearLayoutManager.INVALID_OFFSET) {
                this.f25154a = i2;
            }
            if (i != LinearLayoutManager.INVALID_OFFSET) {
                this.f25155b = i;
                return;
            }
            return;
        }
        if (i != LinearLayoutManager.INVALID_OFFSET) {
            this.f25154a = i;
        }
        if (i2 != LinearLayoutManager.INVALID_OFFSET) {
            this.f25155b = i2;
        }
    }

    /* renamed from: b */
    public void m33735b(int i, int i2) {
        this.f25161h = false;
        if (i != LinearLayoutManager.INVALID_OFFSET) {
            this.f25158e = i;
            this.f25154a = i;
        }
        if (i2 != LinearLayoutManager.INVALID_OFFSET) {
            this.f25159f = i2;
            this.f25155b = i2;
        }
    }

    /* renamed from: a */
    public void m33733a(boolean z) {
        if (z != this.f25160g) {
            this.f25160g = z;
            if (!this.f25161h) {
                this.f25154a = this.f25158e;
                this.f25155b = this.f25159f;
            } else if (z) {
                this.f25154a = this.f25157d != LinearLayoutManager.INVALID_OFFSET ? this.f25157d : this.f25158e;
                this.f25155b = this.f25156c != LinearLayoutManager.INVALID_OFFSET ? this.f25156c : this.f25159f;
            } else {
                this.f25154a = this.f25156c != LinearLayoutManager.INVALID_OFFSET ? this.f25156c : this.f25158e;
                this.f25155b = this.f25157d != LinearLayoutManager.INVALID_OFFSET ? this.f25157d : this.f25159f;
            }
        }
    }
}
