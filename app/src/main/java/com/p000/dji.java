package com.p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: EmailUtil */
/* renamed from: dji */
public class dji {
    /* renamed from: a */
    public static ArrayList<String> m27574a(Context context) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        Account[] accounts = AccountManager.get(context).getAccounts();
        Collection hashSet = new HashSet();
        for (Account account : accounts) {
            if (pattern.matcher(account.name).matches()) {
                hashSet.add(account.name);
            }
        }
        return new ArrayList(hashSet);
    }
}
