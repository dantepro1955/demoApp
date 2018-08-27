package com.p000;

import android.view.KeyEvent;
import com.facebook.imageutils.JfifUtil;

/* compiled from: KeyEventCompat */
/* renamed from: ib$a */
class ib$a implements ib$c {
    ib$a() {
    }

    /* renamed from: a */
    private static int m30743a(int i, int i2, int i3, int i4, int i5) {
        Object obj = 1;
        Object obj2 = (i2 & i3) != 0 ? 1 : null;
        int i6 = i4 | i5;
        if ((i2 & i6) == 0) {
            obj = null;
        }
        if (obj2 != null) {
            if (obj == null) {
                return i & (i6 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        } else if (obj != null) {
            return i & (i3 ^ -1);
        } else {
            return i;
        }
    }

    /* renamed from: a */
    public int mo4855a(int i) {
        int i2;
        if ((i & JfifUtil.MARKER_SOFn) != 0) {
            i2 = i | 1;
        } else {
            i2 = i;
        }
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    /* renamed from: a */
    public boolean mo4852a(int i, int i2) {
        if (ib$a.m30743a(ib$a.m30743a(mo4855a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo4854b(int i) {
        return (mo4855a(i) & 247) == 0;
    }

    /* renamed from: a */
    public boolean mo4853a(KeyEvent keyEvent) {
        return false;
    }
}
