package com.p000;

import android.os.AsyncTask;
import android.os.Build.VERSION;

/* compiled from: AsyncTaskCompat */
/* renamed from: gp */
public final class gp {
    /* renamed from: a */
    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> m30481a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (VERSION.SDK_INT >= 11) {
            gq.m30482a(asyncTask, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }
}
