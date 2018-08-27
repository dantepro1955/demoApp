package com.p000;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import com.facebook.share.internal.ShareConstants;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p000.del.C4411a;
import p000.dew.C4862f;

/* compiled from: BaseCommentAdapter */
/* renamed from: dcu */
public class dcu extends BaseAdapter implements dcw, dev {
    /* renamed from: a */
    private static final ThreadLocal<SimpleDateFormat> f21156a = new C47991();
    /* renamed from: b */
    private List<CommentWrapper> f21157b;
    /* renamed from: c */
    private String f21158c;
    /* renamed from: d */
    private deu f21159d;
    /* renamed from: e */
    private deo f21160e;
    /* renamed from: f */
    private den f21161f;
    /* renamed from: g */
    private den f21162g;
    /* renamed from: h */
    private C4411a f21163h;
    /* renamed from: i */
    private boolean f21164i;

    /* compiled from: BaseCommentAdapter */
    /* renamed from: dcu$1 */
    static class C47991 extends ThreadLocal<SimpleDateFormat> {
        C47991() {
        }

        protected /* synthetic */ Object initialValue() {
            return m26417a();
        }

        /* renamed from: a */
        protected SimpleDateFormat m26417a() {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
    }

    public dcu(List<CommentWrapper> list) {
        this(list, 0.0f, null);
    }

    public dcu(List<CommentWrapper> list, float f, String str) {
        int i = 0;
        this.f21158c = null;
        this.f21164i = false;
        this.f21157b = list;
        this.f21159d = new det();
        this.f21160e = m26421a(f, str);
        this.f21161f = m26428b(f, str);
        this.f21162g = m26430c(f, str);
        del[] delArr = new del[]{this.f21160e, this.f21161f, this.f21162g};
        int length = delArr.length;
        while (i < length) {
            del del = delArr[i];
            del.m26790a(this.f21157b);
            del.m26772a(this.f21159d);
            i++;
        }
    }

    /* renamed from: a */
    protected deo m26421a(float f, String str) {
        return new deo();
    }

    /* renamed from: b */
    protected den m26428b(float f, String str) {
        return new den();
    }

    /* renamed from: c */
    protected den m26430c(float f, String str) {
        return new deq();
    }

    /* renamed from: a */
    private String m26420a(long j) {
        return ((SimpleDateFormat) f21156a.get()).format(new Date(j));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View getView(int r9, View r10, android.view.ViewGroup r11) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r4 = r8.getItemViewType(r9);
        r0 = r8.f21157b;
        r0 = r0.get(r9);
        r0 = (com.under9.android.comments.model.wrapper.CommentWrapper) r0;
        if (r9 <= 0) goto L_0x003c;
    L_0x0010:
        r1 = r8.f21157b;
        r5 = r9 + -1;
        r1 = r1.get(r5);
        r1 = (com.under9.android.comments.model.wrapper.CommentWrapper) r1;
        r6 = r0.getTime();
        r5 = r8.m26420a(r6);
        r6 = r1.getTime();
        r6 = r8.m26420a(r6);
        r5 = android.text.TextUtils.equals(r5, r6);
        if (r5 != 0) goto L_0x0083;
    L_0x0030:
        r0 = r0.isPending();
        if (r0 == 0) goto L_0x003c;
    L_0x0036:
        r0 = r1.isPending();
        if (r0 != 0) goto L_0x003c;
    L_0x003c:
        r5 = new der;
        r5.<init>(r2, r3);
        switch(r4) {
            case 1: goto L_0x0059;
            case 2: goto L_0x006e;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = r8.f21160e;
        r4 = r8.getItem(r9);
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r0 = r0.m26804a(r1, r2, r3, r4, r5);
        r1 = p000.dew.C4862f.comment_type;
        r2 = "text";
        r0.setTag(r1, r2);
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = r8.f21161f;
        r4 = r8.getItem(r9);
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r0 = r0.m26804a(r1, r2, r3, r4, r5);
        r1 = p000.dew.C4862f.comment_type;
        r2 = "media";
        r0.setTag(r1, r2);
        goto L_0x0058;
    L_0x006e:
        r0 = r8.f21162g;
        r4 = r8.getItem(r9);
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r0 = r0.m26804a(r1, r2, r3, r4, r5);
        r1 = p000.dew.C4862f.comment_type;
        r2 = "user-media";
        r0.setTag(r1, r2);
        goto L_0x0058;
    L_0x0083:
        r2 = r3;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: dcu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.f21157b.size();
    }

    public Object getItem(int i) {
        return this.f21157b.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: a */
    public void m26424a(C4411a c4411a) {
        this.f21163h = c4411a;
        this.f21160e.m26787a(c4411a);
        this.f21161f.m26787a(c4411a);
        this.f21162g.m26787a(c4411a);
    }

    /* renamed from: a */
    public void mo4322a(boolean z) {
        boolean z2;
        boolean z3 = false;
        deo deo = this.f21160e;
        if (VERSION.SDK_INT >= 16 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        deo.m26791a(z2);
        den den = this.f21161f;
        if (VERSION.SDK_INT >= 16 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        den.m26791a(z2);
        den den2 = this.f21162g;
        if (VERSION.SDK_INT >= 16 || z) {
            z3 = true;
        }
        den2.m26791a(z3);
    }

    /* renamed from: a */
    public void mo4321a(deu deu) {
        this.f21159d = deu;
        this.f21160e.m26772a(deu);
        this.f21161f.m26772a(deu);
        this.f21162g.m26772a(deu);
    }

    /* renamed from: a */
    public void m26426a(String str) {
        this.f21158c = str;
    }

    /* renamed from: a */
    public String m26422a() {
        if (!TextUtils.isEmpty(this.f21158c)) {
            return this.f21158c;
        }
        for (int i = 0; i < this.f21157b.size(); i++) {
            CommentWrapper commentWrapper = (CommentWrapper) this.f21157b.get(i);
            if (commentWrapper.getLevel() == 1) {
                return commentWrapper.getOrderKey();
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m26429b() {
        if (!TextUtils.isEmpty(this.f21158c)) {
            return this.f21158c;
        }
        for (int size = this.f21157b.size() - 1; size >= 0; size--) {
            CommentWrapper commentWrapper = (CommentWrapper) this.f21157b.get(size);
            if (commentWrapper.getLevel() == 1) {
                return commentWrapper.getOrderKey();
            }
        }
        return null;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public int getItemViewType(int i) {
        CommentWrapper commentWrapper = (CommentWrapper) this.f21157b.get(i);
        if (commentWrapper.getType() == 1) {
            return 1;
        }
        if (commentWrapper.getType() == 2) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public void m26423a(View view) {
        Object tag = view.getTag(C4862f.comment_type);
        if (tag != null && (tag instanceof String)) {
            String str = (String) tag;
            if (ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(str)) {
                this.f21161f.mo4353c(view);
            } else if ("user-media".equals(str)) {
                this.f21162g.mo4353c(view);
            } else if ("text".equals(str)) {
                this.f21160e.mo4353c(view);
            }
        }
    }
}
