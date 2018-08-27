package com.p000;

import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* compiled from: PsshAtomUtil */
/* renamed from: aff */
public final class aff {
    /* renamed from: a */
    public static UUID m1242a(byte[] bArr) {
        Pair b = aff.m1243b(bArr);
        if (b == null) {
            return null;
        }
        return (UUID) b.first;
    }

    /* renamed from: b */
    private static Pair<UUID, byte[]> m1243b(byte[] bArr) {
        ahk ahk = new ahk(bArr);
        if (ahk.m1565c() < 32) {
            return null;
        }
        ahk.m1564b(0);
        if (ahk.m1575k() != ahk.m1563b() + 4 || ahk.m1575k() != afa.f950Q) {
            return null;
        }
        int a = afa.m1169a(ahk.m1575k());
        if (a > 1) {
            Log.w("PsshAtomUtil", "Unsupported pssh version: " + a);
            return null;
        }
        UUID uuid = new UUID(ahk.m1576l(), ahk.m1576l());
        if (a == 1) {
            ahk.m1566c(ahk.m1579o() * 16);
        }
        a = ahk.m1579o();
        if (a != ahk.m1563b()) {
            return null;
        }
        Object obj = new byte[a];
        ahk.m1562a(obj, 0, a);
        return Pair.create(uuid, obj);
    }
}
