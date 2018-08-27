package com.p000;

import android.util.Log;

/* compiled from: ANRWatchDog */
/* renamed from: cri$2 */
class cri$2 implements cri$b {
    cri$2() {
    }

    /* renamed from: a */
    public void mo4120a(InterruptedException interruptedException) {
        Log.d("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
    }
}
