package com.p000;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.common.media.MediaUtils;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.ctu.C4581b;
import p000.ctu.C4582c;
import p000.djl.C4586a;

/* compiled from: UploadSourceChooserDialog */
/* renamed from: ctx */
public class ctx implements dbo, dbp, dbq {
    /* renamed from: d */
    private static final List<MediaMeta> f20234d = new ArrayList();
    /* renamed from: a */
    private dbg f20235a;
    /* renamed from: b */
    private String f20236b;
    /* renamed from: c */
    private final Context f20237c;
    /* renamed from: e */
    private C4597a f20238e;

    /* compiled from: UploadSourceChooserDialog */
    /* renamed from: ctx$a */
    public static class C4597a {
        /* renamed from: a */
        boolean f20228a = false;
        /* renamed from: b */
        boolean f20229b = true;
        /* renamed from: c */
        boolean f20230c = true;
        /* renamed from: d */
        boolean f20231d = false;
        /* renamed from: e */
        boolean f20232e = false;
        /* renamed from: f */
        int f20233f;

        /* renamed from: a */
        public C4597a m24939a(boolean z) {
            this.f20229b = z;
            return this;
        }

        /* renamed from: b */
        public C4597a m24940b(boolean z) {
            this.f20230c = z;
            return this;
        }

        /* renamed from: c */
        public C4597a m24941c(boolean z) {
            this.f20231d = z;
            return this;
        }

        /* renamed from: a */
        public C4597a m24938a(int i) {
            this.f20233f = i;
            return this;
        }

        /* renamed from: d */
        public C4597a m24942d(boolean z) {
            this.f20228a = z;
            return this;
        }

        /* renamed from: e */
        public C4597a m24943e(boolean z) {
            this.f20232e = z;
            return this;
        }
    }

    /* renamed from: a */
    public static void m24948a(final Context context) {
        djl.m27585a(context, null);
        new Thread() {
            public void run() {
                synchronized (ctx.f20234d) {
                    final Collection arrayList = new ArrayList();
                    djl.m27589b(context, 20, new C4586a(this) {
                        /* renamed from: b */
                        final /* synthetic */ C45881 f20208b;

                        /* renamed from: a */
                        public void mo4153a(String str, String str2) {
                            Object mediaMeta;
                            if (djq.m27610b(str2)) {
                                mediaMeta = new MediaMeta(str, 1);
                            } else {
                                mediaMeta = new MediaMeta(str, 0);
                            }
                            arrayList.add(mediaMeta);
                        }
                    });
                    ctx.f20234d.clear();
                    ctx.f20234d.addAll(arrayList);
                }
            }
        }.start();
    }

    /* renamed from: b */
    public static void m24949b(final Context context) {
        djl.m27585a(context, null);
        new Thread() {
            public void run() {
                synchronized (ctx.f20234d) {
                    final Collection arrayList = new ArrayList();
                    final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    djl.m27584a(context, 20, new C4586a(this) {
                        /* renamed from: c */
                        final /* synthetic */ C45902 f20212c;

                        /* renamed from: a */
                        public void mo4153a(String str, String str2) {
                            MediaMeta mediaMeta;
                            if (MediaUtils.isVideo(str2)) {
                                try {
                                    mediaMeta = new MediaMeta(str, djq.m27609a(str, mediaMetadataRetriever), 2);
                                } catch (Throwable e) {
                                    Log.e("SourceChooserDialog", "onMediaLoaded: ", e);
                                    mediaMeta = null;
                                }
                            } else if (djq.m27610b(str2)) {
                                mediaMeta = new MediaMeta(str, 1);
                            } else {
                                mediaMeta = new MediaMeta(str, 0);
                            }
                            if (mediaMeta != null && mediaMeta.f18781d != null && !mediaMeta.f18781d.isEmpty()) {
                                arrayList.add(mediaMeta);
                            }
                        }
                    });
                    ctx.f20234d.clear();
                    ctx.f20234d.addAll(arrayList);
                    Log.d("SourceChooserDialog", "loadPhotos() called with: mImageUrls = [" + ctx.f20234d + "]");
                }
            }
        }.start();
    }

    public ctx(Context context, C4597a c4597a) {
        this.f20237c = context;
        djl.m27585a(context, null);
        this.f20238e = c4597a;
        View inflate = LayoutInflater.from(context).inflate(C4582c.uploadlib_bottom_sheet, null);
        this.f20235a = dbg.m26216a(context).m26240a(new dbw(inflate)).m26239a(80).m26242a((dbp) this).m26241a((dbo) this).m26243a((dbq) this).m26238a();
        m24953a(inflate);
    }

    /* renamed from: j */
    private C4597a m24951j() {
        if (this.f20238e == null) {
            this.f20238e = new C4597a();
        }
        return this.f20238e;
    }

    /* renamed from: a */
    public void m24952a() {
        this.f20235a.m26232a();
    }

    /* renamed from: b */
    public void m24957b() {
        ctw.m24923a(this.f20236b, new cuw(this.f20236b));
    }

    /* renamed from: c */
    public void m24959c() {
        ctw.m24923a(this.f20236b, new cux(this.f20236b));
    }

    /* renamed from: d */
    public void m24960d() {
        ctw.m24923a(this.f20236b, new cva(this.f20236b, m24951j().f20228a));
    }

    /* renamed from: e */
    public void m24961e() {
        ctw.m24923a(this.f20236b, new cuy(this.f20236b));
    }

    /* renamed from: f */
    public void m24962f() {
        ctw.m24923a(this.f20236b, new cvc(this.f20236b, djc.m27565b(this.f20237c)));
    }

    /* renamed from: a */
    public void m24953a(View view) {
        int i = 0;
        synchronized (f20234d) {
            int i2;
            final Context context = view.getContext();
            View findViewById = view.findViewById(C4581b.bottom_sheet_container);
            if (findViewById != null && this.f20238e.f20233f > 0) {
                findViewById.setBackgroundColor(ew.c(context, this.f20238e.f20233f));
            }
            view.findViewById(C4581b.btn_camera).setVisibility(m24951j().f20229b ? 0 : 8);
            View findViewById2 = view.findViewById(C4581b.btn_gallery);
            if (m24951j().f20230c) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
            findViewById2 = view.findViewById(C4581b.btn_custom_camera);
            if (m24951j().f20231d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
            findViewById2 = view.findViewById(C4581b.btn_video_link);
            if (m24951j().f20228a && m24951j().f20232e) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
            final RecyclerView recyclerView = (RecyclerView) view.findViewById(C4581b.recycler_view);
            recyclerView.addItemDecoration(new ctt((int) TypedValue.applyDimension(1, 4.0f, view.getResources().getDisplayMetrics())));
            final C0581a ctv = new ctv(f20234d, this);
            LayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(ctv);
            if (f20234d.isEmpty()) {
                i = 8;
            }
            recyclerView.setVisibility(i);
            if (!f20234d.isEmpty()) {
                new AsyncTask<Void, MediaMeta, Void>(this) {
                    /* renamed from: d */
                    final /* synthetic */ ctx f20219d;

                    /* compiled from: UploadSourceChooserDialog */
                    /* renamed from: ctx$3$1 */
                    class C45911 implements C4586a {
                        /* renamed from: a */
                        final /* synthetic */ C45933 f20214a;

                        C45911(C45933 c45933) {
                            this.f20214a = c45933;
                        }

                        /* renamed from: a */
                        public void mo4153a(String str, String str2) {
                            MediaMeta mediaMeta;
                            if (MediaUtils.isVideo(str2)) {
                                mediaMeta = new MediaMeta(str, djq.m27608a(str), 2);
                            } else if (djq.m27610b(str2)) {
                                mediaMeta = new MediaMeta(str, 1);
                            } else {
                                mediaMeta = new MediaMeta(str, 0);
                            }
                            this.f20214a.publishProgress(new MediaMeta[]{mediaMeta});
                        }
                    }

                    /* compiled from: UploadSourceChooserDialog */
                    /* renamed from: ctx$3$2 */
                    class C45922 implements C4586a {
                        /* renamed from: a */
                        final /* synthetic */ C45933 f20215a;

                        C45922(C45933 c45933) {
                            this.f20215a = c45933;
                        }

                        /* renamed from: a */
                        public void mo4153a(String str, String str2) {
                            MediaMeta mediaMeta;
                            if (djq.m27610b(str2)) {
                                mediaMeta = new MediaMeta(str, 1);
                            } else {
                                mediaMeta = new MediaMeta(str, 0);
                            }
                            this.f20215a.publishProgress(new MediaMeta[]{mediaMeta});
                        }
                    }

                    protected /* synthetic */ Object doInBackground(Object[] objArr) {
                        return m24932a((Void[]) objArr);
                    }

                    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
                        m24933a((MediaMeta[]) objArr);
                    }

                    /* renamed from: a */
                    protected Void m24932a(Void... voidArr) {
                        Log.d("SourceChooserDialog", "doInBackground: " + System.currentTimeMillis());
                        if (this.f20219d.m24951j().f20228a) {
                            djl.m27584a(context, 20, new C45911(this));
                        } else {
                            djl.m27589b(context, 20, new C45922(this));
                        }
                        return null;
                    }

                    /* renamed from: a */
                    protected void m24933a(MediaMeta... mediaMetaArr) {
                        int i = 0;
                        Log.d("SourceChooserDialog", "doInBackground: " + System.currentTimeMillis());
                        MediaMeta mediaMeta = mediaMetaArr[0];
                        if (8 == recyclerView.getVisibility()) {
                            RecyclerView recyclerView = recyclerView;
                            if (mediaMeta == null) {
                                i = 8;
                            }
                            recyclerView.setVisibility(i);
                        }
                        ctv.m24921a(mediaMeta);
                    }
                }.execute(new Void[0]);
            } else if (!f20234d.isEmpty()) {
                new AsyncTask<Void, Void, MediaMeta>(this) {
                    /* renamed from: d */
                    final /* synthetic */ ctx f20227d;

                    protected /* synthetic */ Object doInBackground(Object[] objArr) {
                        return m24936a((Void[]) objArr);
                    }

                    protected /* synthetic */ void onPostExecute(Object obj) {
                        m24937a((MediaMeta) obj);
                    }

                    /* renamed from: a */
                    protected MediaMeta m24936a(Void... voidArr) {
                        final List arrayList = new ArrayList();
                        if (this.f20227d.m24951j().f20228a) {
                            djl.m27584a(context, 1, new C4586a(this) {
                                /* renamed from: b */
                                final /* synthetic */ C45964 f20221b;

                                /* renamed from: a */
                                public void mo4153a(String str, String str2) {
                                    Object mediaMeta;
                                    if (MediaUtils.isVideo(str2)) {
                                        mediaMeta = new MediaMeta(str, djq.m27608a(str), 2);
                                    } else if (djq.m27610b(str2)) {
                                        mediaMeta = new MediaMeta(str, 1);
                                    } else {
                                        mediaMeta = new MediaMeta(str, 0);
                                    }
                                    arrayList.add(mediaMeta);
                                }
                            });
                        } else {
                            djl.m27589b(context, 1, new C4586a(this) {
                                /* renamed from: b */
                                final /* synthetic */ C45964 f20223b;

                                /* renamed from: a */
                                public void mo4153a(String str, String str2) {
                                    Object mediaMeta;
                                    if (djq.m27610b(str2)) {
                                        mediaMeta = new MediaMeta(str, 1);
                                    } else {
                                        mediaMeta = new MediaMeta(str, 0);
                                    }
                                    arrayList.add(mediaMeta);
                                }
                            });
                        }
                        return (MediaMeta) arrayList.get(0);
                    }

                    /* renamed from: a */
                    protected void m24937a(MediaMeta mediaMeta) {
                        if (!((MediaMeta) ctx.f20234d.get(0)).f18781d.equals(mediaMeta.f18781d)) {
                            ctv.m24920a(0, mediaMeta);
                            recyclerView.scrollToPosition(0);
                        }
                    }
                }.execute(new Void[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo4155a(dbg dbg, View view) {
        if (C4581b.btn_camera == view.getId()) {
            m24959c();
            dbg.m26235c();
        } else if (C4581b.btn_gallery == view.getId()) {
            m24960d();
            dbg.m26235c();
        } else if (C4581b.btn_custom_camera == view.getId()) {
            m24961e();
            dbg.m26235c();
        } else if (C4581b.btn_video_link == view.getId()) {
            m24962f();
            dbg.m26235c();
        }
    }

    /* renamed from: a */
    public void mo4154a(dbg dbg) {
        m24957b();
    }

    /* renamed from: a */
    public void m24956a(String str) {
        this.f20236b = str;
    }

    /* renamed from: g */
    public String m24963g() {
        return this.f20236b;
    }

    /* renamed from: h */
    public void m24964h() {
        this.f20235a.m26235c();
    }

    /* renamed from: b */
    public void mo4156b(dbg dbg) {
        ctw.m24923a(this.f20236b, new cuv());
    }
}
