package com.p000;

@bhd
/* renamed from: bir */
public class bir implements akt {
    /* renamed from: a */
    private final bin f6468a;

    public bir(bin bin) {
        this.f6468a = bin;
    }

    public int getAmount() {
        int i = 0;
        if (this.f6468a != null) {
            try {
                i = this.f6468a.mo1204b();
            } catch (Throwable e) {
                bky.m9009c("Could not forward getAmount to RewardItem", e);
            }
        }
        return i;
    }

    public String getType() {
        String str = null;
        if (this.f6468a != null) {
            try {
                str = this.f6468a.mo1203a();
            } catch (Throwable e) {
                bky.m9009c("Could not forward getType to RewardItem", e);
            }
        }
        return str;
    }
}
