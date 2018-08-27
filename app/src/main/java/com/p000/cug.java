package com.p000;

import android.os.AsyncTask;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.io.File;
import java.io.IOException;

/* compiled from: BaseProcessor */
/* renamed from: cug */
public abstract class cug {
    /* renamed from: a */
    private C4521a f20255a;

    /* compiled from: BaseProcessor */
    /* renamed from: cug$a */
    public interface C4521a {
        /* renamed from: a */
        void mo4100a(String str, int i);

        /* renamed from: a */
        void mo4101a(String str, int i, Exception exception);
    }

    /* renamed from: a */
    public abstract MediaMeta mo4157a(File file);

    /* renamed from: a */
    protected abstract void mo4158a(String str, MediaMeta mediaMeta) throws IOException, NullPointerException;

    /* renamed from: a */
    public void m25010a(C4521a c4521a) {
        this.f20255a = c4521a;
    }

    /* renamed from: a */
    public void m25009a(final MediaMeta mediaMeta, final String str) {
        gp.m30481a(new AsyncTask<Void, Object, Object>(this) {
            /* renamed from: a */
            Exception f20251a;
            /* renamed from: d */
            final /* synthetic */ cug f20254d;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m25006a((Void[]) objArr);
            }

            /* renamed from: a */
            protected Void m25006a(Void... voidArr) {
                Exception e;
                try {
                    this.f20254d.mo4158a(str, mediaMeta);
                } catch (IOException e2) {
                    e = e2;
                    this.f20251a = e;
                    return null;
                } catch (NullPointerException e3) {
                    e = e3;
                    this.f20251a = e;
                    return null;
                }
                return null;
            }

            protected void onPostExecute(Object obj) {
                if (this.f20251a != null) {
                    if (this.f20254d.f20255a != null) {
                        this.f20254d.f20255a.mo4101a(str, mediaMeta.f18786i, this.f20251a);
                    }
                } else if (this.f20254d.f20255a != null) {
                    this.f20254d.f20255a.mo4100a(str, mediaMeta.f18786i);
                }
            }
        }, new Void[0]);
    }
}
