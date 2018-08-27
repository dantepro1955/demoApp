package com.p000;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: dqi */
final class dqi extends dqc {
    /* renamed from: c */
    private AudioManager f22600c = ((AudioManager) this.a.getSystemService("audio"));

    public dqi(Context context) {
        super(context);
    }

    /* renamed from: d */
    public final void mo4546d() {
        if (!dqa.f22562c) {
            this.f22600c.startBluetoothSco();
        }
    }

    /* renamed from: e */
    public final void mo4547e() {
        if (!dqa.f22562c) {
            this.f22600c.stopBluetoothSco();
        }
    }

    /* renamed from: f */
    public final int mo4548f() {
        return m28690b() ? 0 : 3;
    }

    /* renamed from: g */
    public final int mo4549g() {
        return m28690b() ? dqb.f22566a : 6;
    }
}
