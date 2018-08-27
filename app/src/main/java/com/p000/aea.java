package com.p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: DrmInitData */
/* renamed from: aea */
public interface aea {

    /* compiled from: DrmInitData */
    /* renamed from: aea$a */
    public static final class C0120a implements aea {
        /* renamed from: a */
        private final Map<UUID, C0121b> f736a = new HashMap();

        /* renamed from: a */
        public void m926a(UUID uuid, C0121b c0121b) {
            this.f736a.put(uuid, c0121b);
        }
    }

    /* compiled from: DrmInitData */
    /* renamed from: aea$b */
    public static final class C0121b {
        /* renamed from: a */
        public final String f737a;
        /* renamed from: b */
        public final byte[] f738b;

        public C0121b(String str, byte[] bArr) {
            this.f737a = (String) ahb.m1512a((Object) str);
            this.f738b = (byte[]) ahb.m1512a((Object) bArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0121b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C0121b c0121b = (C0121b) obj;
            if (this.f737a.equals(c0121b.f737a) && Arrays.equals(this.f738b, c0121b.f738b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f737a.hashCode() + (Arrays.hashCode(this.f738b) * 31);
        }
    }

    /* compiled from: DrmInitData */
    /* renamed from: aea$c */
    public static final class C0122c implements aea {
        /* renamed from: a */
        private C0121b f739a;

        public C0122c(C0121b c0121b) {
            this.f739a = c0121b;
        }
    }
}
