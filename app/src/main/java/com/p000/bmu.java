package com.p000;

/* renamed from: bmu */
public abstract class bmu extends bms {
    private boolean zzadP;

    protected bmu(bmw bmw) {
        super(bmw);
    }

    public void initialize() {
        zzmS();
        this.zzadP = true;
    }

    public boolean isInitialized() {
        return this.zzadP;
    }

    public abstract void zzmS();

    protected void zzob() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
