package com.p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p000.ape.C0657a;

/* renamed from: aog */
public class aog extends C0657a {
    /* renamed from: a */
    int f3817a;

    /* renamed from: a */
    public static Account m4672a(ape ape) {
        Account account = null;
        if (ape != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = ape.mo588a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    /* renamed from: a */
    public Account mo588a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f3817a) {
            if (aqo.zzf(null, callingUid)) {
                this.f3817a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        Account account = null;
        return this == obj ? true : !(obj instanceof aog) ? false : account.equals(account);
    }
}
