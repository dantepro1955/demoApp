package com.p000;

import android.annotation.TargetApi;
import android.os.AsyncTask;

@TargetApi(11)
/* compiled from: AsyncTaskCompatHoneycomb */
/* renamed from: gq */
class gq {
    /* renamed from: a */
    static <Params, Progress, Result> void m30482a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
