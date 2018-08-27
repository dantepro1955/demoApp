package com.p000;

@Deprecated
/* renamed from: acx */
public final class acx {

    /* renamed from: acx$a */
    public enum C0073a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        /* renamed from: e */
        private final String f415e;

        private C0073a(String str) {
            this.f415e = str;
        }

        public String toString() {
            return this.f415e;
        }
    }

    /* renamed from: acx$b */
    public enum C0074b {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
