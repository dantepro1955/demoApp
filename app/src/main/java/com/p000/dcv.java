package com.p000;

import android.database.DataSetObserver;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.under9.android.comments.model.User;
import com.under9.android.comments.otto.RequestStartWriteCommentEvent;
import com.under9.android.comments.otto.integration.AuthorNameClickedEvent;
import p000.dew.C4862f;
import p000.dew.C4863g;

/* compiled from: BaseCommentAddonAdapter */
/* renamed from: dcv */
public class dcv extends BaseAdapter implements dcw, dev {
    /* renamed from: a */
    protected dcu f21171a;
    /* renamed from: b */
    DataSetObserver f21172b = new C48012(this);
    /* renamed from: c */
    private boolean f21173c = false;
    /* renamed from: d */
    private boolean f21174d = true;
    /* renamed from: e */
    private boolean f21175e = false;
    /* renamed from: f */
    private boolean f21176f = false;
    /* renamed from: g */
    private boolean f21177g = true;
    /* renamed from: h */
    private deu f21178h;
    /* renamed from: i */
    private String f21179i;
    /* renamed from: j */
    private User f21180j;
    /* renamed from: k */
    private OnClickListener f21181k = new C48001(this);

    /* compiled from: BaseCommentAddonAdapter */
    /* renamed from: dcv$1 */
    class C48001 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ dcv f21165a;

        C48001(dcv dcv) {
            this.f21165a = dcv;
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C4862f.avatar) {
                String str = (String) view.getTag(C4862f.username);
                if (!TextUtils.isEmpty(str)) {
                    dhe.m27287c(this.f21165a.f21179i, new AuthorNameClickedEvent(str));
                }
            } else if (id == C4862f.input_container_hits_box) {
                dhe.m27287c(this.f21165a.f21179i, new RequestStartWriteCommentEvent());
            }
        }
    }

    /* compiled from: BaseCommentAddonAdapter */
    /* renamed from: dcv$2 */
    class C48012 extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ dcv f21166a;

        C48012(dcv dcv) {
            this.f21166a = dcv;
        }

        public void onChanged() {
            this.f21166a.notifyDataSetChanged();
        }
    }

    /* compiled from: BaseCommentAddonAdapter */
    /* renamed from: dcv$a */
    public static class C4802a {
        /* renamed from: a */
        public SimpleDraweeView f21167a;
        /* renamed from: b */
        public View f21168b;

        public C4802a(View view) {
            this.f21168b = view.findViewById(C4862f.input_container_hits_box);
            this.f21167a = (SimpleDraweeView) view.findViewById(C4862f.avatar);
        }
    }

    /* compiled from: BaseCommentAddonAdapter */
    /* renamed from: dcv$b */
    class C4803b {
        /* renamed from: a */
        ProgressBar f21169a;
        /* renamed from: b */
        final /* synthetic */ dcv f21170b;

        private C4803b(dcv dcv) {
            this.f21170b = dcv;
        }
    }

    public dcv(dcu dcu) {
        this.f21171a = dcu;
        this.f21171a.registerDataSetObserver(this.f21172b);
    }

    /* renamed from: a */
    public void m26437a(String str) {
        this.f21179i = str;
    }

    /* renamed from: a */
    public boolean m26440a() {
        return this.f21173c;
    }

    /* renamed from: d */
    private int m26432d() {
        return m26440a() ? 1 : 0;
    }

    public int getCount() {
        if (this.f21177g) {
            return (m26432d() + this.f21171a.getCount()) + 1;
        }
        return (this.f21174d ? 1 : 0) + (this.f21171a.getCount() + m26432d());
    }

    public boolean isEmpty() {
        return getCount() - m26432d() == 0;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: b */
    public boolean m26442b() {
        return this.f21177g;
    }

    /* renamed from: b */
    public void m26441b(boolean z) {
        this.f21177g = z;
        notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) == 0) {
            C4802a c4802a;
            String c;
            if (view == null) {
                view = m26434a((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater"));
                C4802a c4802a2 = new C4802a(view);
                view.setTag(c4802a2);
                c4802a = c4802a2;
            } else {
                c4802a = (C4802a) view.getTag();
            }
            if (this.f21180j != null) {
                c = this.f21180j.m23632c();
                c4802a.f21167a.setTag(C4862f.username, this.f21180j.m23634d());
            } else {
                c4802a.f21167a.setTag(C4862f.username, "");
                c = null;
            }
            if (TextUtils.isEmpty(c)) {
                c4802a.f21167a.setImageURI((Uri) null);
                c4802a.f21167a.setTag(C4862f.logged_in_user_avatar_url, null);
            } else if (c4802a.f21167a.getTag(C4862f.logged_in_user_avatar_url) != null && !c4802a.f21167a.getTag(C4862f.logged_in_user_avatar_url).equals(c)) {
                c4802a.f21167a.setTag(C4862f.logged_in_user_avatar_url, c);
                c4802a.f21167a.setImageURI(Uri.parse(c));
            } else if (c4802a.f21167a.getTag(C4862f.logged_in_user_avatar_url) == null) {
                c4802a.f21167a.setTag(C4862f.logged_in_user_avatar_url, c);
                c4802a.f21167a.setImageURI(Uri.parse(c));
            }
            c4802a.f21167a.setOnClickListener(this.f21181k);
            c4802a.f21168b.setOnClickListener(this.f21181k);
            return view;
        } else if (getItemViewType(i) != 1) {
            return this.f21171a.getView(m26444c(m26433a(i)), view, viewGroup);
        } else {
            C4803b c4803b;
            if (view == null) {
                view = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C4863g.post_list_pending, null);
                C4803b c4803b2 = new C4803b();
                c4803b2.f21169a = (ProgressBar) view.findViewById(C4862f.throbber);
                view.setTag(c4803b2);
                c4803b = c4803b2;
            } else {
                c4803b = (C4803b) view.getTag();
            }
            if (this.f21174d) {
                c4803b.f21169a.setVisibility(0);
                return view;
            }
            c4803b.f21169a.setVisibility(8);
            return view;
        }
    }

    /* renamed from: a */
    protected View m26434a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C4863g.comment_input, null);
    }

    public int getViewTypeCount() {
        return (m26440a() ? 1 : 0) + (this.f21171a.getViewTypeCount() + 2);
    }

    public int getItemViewType(int i) {
        if (m26432d() > 0 && i == 0) {
            return 0;
        }
        if (m26443b(i)) {
            return 1;
        }
        return this.f21171a.getItemViewType(m26444c(m26433a(i))) + 2;
    }

    /* renamed from: a */
    protected int m26433a(int i) {
        return i - m26432d();
    }

    /* renamed from: c */
    public void m26445c(boolean z) {
        m26439a(z, true);
    }

    /* renamed from: a */
    public void m26439a(boolean z, boolean z2) {
        this.f21174d = z;
        if (z2) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public boolean m26446c() {
        return this.f21174d;
    }

    /* renamed from: b */
    public boolean m26443b(int i) {
        if (i == m26432d() + this.f21171a.getCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4321a(deu deu) {
        this.f21178h = deu;
        this.f21171a.mo4321a(deu);
    }

    /* renamed from: c */
    protected int m26444c(int i) {
        return i;
    }

    /* renamed from: a */
    public void mo4322a(boolean z) {
        this.f21176f = z;
        this.f21171a.mo4322a(z);
    }

    /* renamed from: a */
    public void m26435a(User user) {
        this.f21180j = user;
        notifyDataSetChanged();
    }
}
