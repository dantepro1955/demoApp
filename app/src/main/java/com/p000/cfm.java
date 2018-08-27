package com.p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.upload.CancelUploadEvent;
import com.ninegag.android.app.upload.RetryUploadReceiver;
import java.util.List;
import p000.coq.C4520a;
import p000.coq.C4520a.C4519a;

/* compiled from: UploadItemListRenderer */
/* renamed from: cfm */
public class cfm {
    /* renamed from: a */
    static final Handler f9059a = new Handler();
    /* renamed from: b */
    private List<C4520a> f9060b;
    /* renamed from: c */
    private com f9061c;
    /* renamed from: d */
    private String f9062d;

    /* compiled from: UploadItemListRenderer */
    /* renamed from: cfm$a */
    public static class C1713a extends ccd implements OnClickListener {
        /* renamed from: a */
        String f9048a;
        /* renamed from: b */
        public SimpleDraweeView f9049b;
        /* renamed from: c */
        public ProgressBar f9050c;
        /* renamed from: d */
        public TextView f9051d;
        /* renamed from: f */
        public TextView f9052f;
        /* renamed from: g */
        public Button f9053g;
        /* renamed from: h */
        public Button f9054h;
        /* renamed from: i */
        public View f9055i;
        /* renamed from: j */
        public View f9056j;
        /* renamed from: k */
        public C4520a f9057k;
        /* renamed from: l */
        public C4519a f9058l;

        public C1713a(String str, final View view, cnt cnt) {
            super(view, cnt);
            this.f9048a = str;
            this.f9049b = (SimpleDraweeView) view.findViewById(R.id.thumbnail);
            this.f9050c = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f9051d = (TextView) view.findViewById(R.id.title);
            this.f9052f = (TextView) view.findViewById(R.id.uploadStatus);
            this.f9053g = (Button) view.findViewById(R.id.btnRetry);
            this.f9054h = (Button) view.findViewById(R.id.btnCancel);
            this.f9055i = view.findViewById(R.id.headerPlaceholder);
            this.f9056j = view.findViewById(R.id.footerPlaceholder);
            this.f9053g.setOnClickListener(this);
            this.f9054h.setOnClickListener(this);
            this.f9058l = new C4519a(this) {
                /* renamed from: b */
                final /* synthetic */ C1713a f9047b;

                /* compiled from: UploadItemListRenderer */
                /* renamed from: cfm$a$1$2 */
                class C17092 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C17121 f9042a;

                    C17092(C17121 c17121) {
                        this.f9042a = c17121;
                    }

                    public void run() {
                        this.f9042a.f9047b.f9052f.setText(view.getContext().getString(R.string.notification_ticker_uploading));
                        this.f9042a.f9047b.f9053g.setVisibility(8);
                        this.f9042a.f9047b.f9054h.setVisibility(0);
                    }
                }

                /* compiled from: UploadItemListRenderer */
                /* renamed from: cfm$a$1$3 */
                class C17103 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C17121 f9043a;

                    C17103(C17121 c17121) {
                        this.f9043a = c17121;
                    }

                    public void run() {
                        this.f9043a.f9047b.f9052f.setText(view.getContext().getString(R.string.upload_finished));
                        this.f9043a.f9047b.f9053g.setVisibility(8);
                        this.f9043a.f9047b.f9054h.setVisibility(8);
                    }
                }

                /* renamed from: a */
                public void m12979a(final String str) {
                    cfm.f9059a.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C17121 f9041b;

                        public void run() {
                            this.f9041b.f9047b.f9052f.setText(TextUtils.isEmpty(str) ? view.getContext().getString(R.string.upload_failed) : str);
                            this.f9041b.f9047b.f9053g.setVisibility(0);
                            this.f9041b.f9047b.f9054h.setVisibility(0);
                        }
                    });
                }

                /* renamed from: a */
                public void m12977a() {
                    cfm.f9059a.post(new C17092(this));
                }

                /* renamed from: b */
                public void m12980b() {
                    cfm.f9059a.post(new C17103(this));
                }

                /* renamed from: a */
                public void m12978a(final int i) {
                    cfm.f9059a.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C17121 f9045b;

                        public void run() {
                            this.f9045b.f9047b.f9050c.setProgress(i);
                        }
                    });
                }
            };
        }

        /* renamed from: a */
        public void m12982a(C4520a c4520a) {
            m12984c();
            this.f9057k = c4520a;
            this.f9050c.setProgress(c4520a.f19896d);
            this.f9051d.setText(c4520a.f19894b);
            if (c4520a.f19897e == -1) {
                if (TextUtils.isEmpty(c4520a.f19898f)) {
                    this.f9052f.setText(this.itemView.getContext().getString(R.string.upload_failed));
                } else {
                    this.f9052f.setText(c4520a.f19898f);
                }
                this.f9053g.setVisibility(0);
            } else {
                this.f9053g.setVisibility(8);
            }
            m12983b();
        }

        /* renamed from: b */
        public void m12983b() {
            if (this.f9057k != null) {
                this.f9057k.a(this.f9058l);
            }
        }

        /* renamed from: c */
        public void m12984c() {
            if (this.f9057k != null && this.f9058l != null) {
                this.f9057k.b(this.f9058l);
            }
        }

        public void onClick(View view) {
            C4520a c4520a = (C4520a) view.getTag();
            if (view.getId() == R.id.btnCancel) {
                CancelUploadEvent cancelUploadEvent = new CancelUploadEvent();
                cancelUploadEvent.f18358a = c4520a.f19893a;
                dhe.c(this.f9048a, cancelUploadEvent);
            } else if (view.getId() == R.id.btnRetry) {
                String str = c4520a.f19893a;
                c4520a.a(0, 0, null);
                Intent intent = new Intent(caf.m12046a().f8449a, RetryUploadReceiver.class);
                intent.addFlags(268435456);
                intent.putExtra("upload_id", str);
                try {
                    caf.m12046a().f8449a.sendBroadcast(intent);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: a */
        protected void mo1630a() {
            this.f9051d.setTextColor(m12158a(this.e.mo1821b()));
            this.f9052f.setTextColor(m12158a(this.e.mo1822c()));
            this.f9055i.setBackgroundColor(m12158a(this.e.mo1823d()));
            this.f9056j.setBackgroundColor(m12158a(this.e.mo1823d()));
            this.f9050c.setProgressDrawable(this.e.m14846G().a(this.f9050c.getContext()));
        }
    }

    public cfm(String str, List<C4520a> list, com com) {
        this.f9060b = list;
        this.f9061c = com;
        this.f9062d = str;
    }

    /* renamed from: a */
    public C1713a m12985a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.upload_pending_item, viewGroup, false);
        C1713a c1713a = new C1713a(this.f9062d, inflate, this.f9061c.f16683a);
        c1713a.mo1630a();
        inflate.setTag(c1713a);
        return c1713a;
    }

    /* renamed from: a */
    public void m12986a(C1713a c1713a, int i) {
        C4520a c4520a = (C4520a) this.f9060b.get(i);
        c1713a.f9053g.setTag(c4520a);
        c1713a.f9054h.setTag(c4520a);
        c1713a.f9051d.setText(c4520a.f19894b);
        if (c4520a.f19895c != null) {
            c1713a.f9049b.setImageURI(Uri.parse("file://" + c4520a.f19895c));
        }
        if (i == 0) {
            c1713a.f9055i.setVisibility(0);
        } else {
            c1713a.f9055i.setVisibility(8);
        }
        if (i == this.f9060b.size() - 1) {
            c1713a.f9056j.setVisibility(0);
        } else {
            c1713a.f9056j.setVisibility(8);
        }
        c1713a.m12982a(c4520a);
    }
}
