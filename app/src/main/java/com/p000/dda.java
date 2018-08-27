package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.share.internal.ShareConstants;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.CommentDao;
import com.under9.android.comments.model.CommentListItem;
import com.under9.android.comments.model.CommentListItemDao;
import com.under9.android.comments.model.CommentListItemDao.Properties;
import com.under9.android.comments.model.CommentMeta;
import com.under9.android.comments.model.CommentMetaDao;
import com.under9.android.comments.model.DaoMaster;
import com.under9.android.comments.model.DaoSession;
import com.under9.android.comments.model.ModelFactory;
import com.under9.android.comments.model.PendingCommentListItem;
import com.under9.android.comments.model.PendingCommentListItemDao;
import com.under9.android.comments.model.PreloadComments;
import com.under9.android.comments.model.PreloadCommentsDao;
import com.under9.android.comments.model.User;
import com.under9.android.comments.model.UserDao;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiCommentData.ApiCommentStatus;
import com.under9.android.comments.model.api.ApiCommentInfo.ApiSimpleComment;
import com.under9.android.comments.model.api.ApiRawComments.ApiUrlCommentsItem;
import com.under9.android.comments.model.api.ApiUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: DataController */
/* renamed from: dda */
public class dda {
    /* renamed from: a */
    private static dda f21212a = new dda();
    /* renamed from: b */
    private Context f21213b;
    /* renamed from: c */
    private String f21214c;
    /* renamed from: d */
    private String f21215d;
    /* renamed from: e */
    private ddf f21216e;
    /* renamed from: f */
    private SQLiteDatabase f21217f;
    /* renamed from: g */
    private DaoSession f21218g;
    /* renamed from: h */
    private djt f21219h;

    /* compiled from: DataController */
    /* renamed from: dda$3 */
    class C48113 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dda f21210a;

        C48113(dda dda) {
            this.f21210a = dda;
        }

        public void run() {
            List c = this.f21210a.f21218g.m23557d().queryBuilder().m28484b(Properties.Id).m28477a(1).m28483b(1000).m28476a().m28465b().m28467c();
            if (c.size() > 0) {
                CommentListItem commentListItem = (CommentListItem) c.get(0);
                Object c2 = commentListItem.m23509c();
                int intValue = commentListItem.m23505b().intValue();
                this.f21210a.f21218g.m23557d().queryBuilder().m28479a(Properties.Id.m28335d(commentListItem.m23499a()), new dos[0]).m28482b().m28457b().m28458c();
                this.f21210a.f21218g.m23557d().queryBuilder().m28479a(Properties.Url.m28328a(c2), Properties.SortingType.m28328a(Integer.valueOf(intValue))).m28482b().m28457b().m28458c();
            }
            Collection g = this.f21210a.m26545g();
            if (g.size() > 0) {
                this.f21210a.f21218g.m23555b().queryBuilder().m28479a(CommentDao.Properties.Url.m28332b(g), new dos[0]).m28482b().m28457b().m28458c();
            }
            this.f21210a.f21218g.m22967h().execSQL("DELETE FROM USER WHERE " + UserDao.Properties.Id.f22370e + " NOT IN (" + "SELECT " + CommentDao.Properties._userId.f22370e + " FROM " + CommentDao.TABLENAME + ")");
        }
    }

    /* compiled from: DataController */
    /* renamed from: dda$4 */
    class C48124 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dda f21211a;

        C48124(dda dda) {
            this.f21211a = dda;
        }

        public void run() {
            this.f21211a.f21218g.m23557d().deleteAll();
            this.f21211a.f21218g.m23555b().deleteAll();
            this.f21211a.f21218g.m23558e().deleteAll();
            this.f21211a.f21218g.m23556c().deleteAll();
        }
    }

    /* renamed from: a */
    public static dda m26492a() {
        return f21212a;
    }

    private dda() {
    }

    /* renamed from: a */
    public void m26506a(Context context) {
        if (this.f21213b == null) {
            this.f21213b = context.getApplicationContext();
            this.f21219h = new djt(context);
            this.f21214c = dct.m26395a().m26408d().m26393i();
            this.f21215d = dct.m26395a().m26408d().m26386b();
            if (this.f21216e == null) {
                this.f21216e = new ddf(context, this.f21214c);
            }
            if (this.f21217f == null) {
                this.f21217f = this.f21216e.getWritableDatabase();
            }
            if (this.f21218g == null) {
                this.f21218g = new DaoMaster(this.f21217f).m23552a();
            }
        }
    }

    /* renamed from: b */
    public void m26522b() {
        if (this.f21216e != null && this.f21217f != null) {
            this.f21216e.m26584a(this.f21217f);
        }
    }

    /* renamed from: c */
    public String m26526c() {
        return this.f21215d;
    }

    /* renamed from: a */
    public User m26503a(String str) {
        if (str == null) {
            return null;
        }
        List c = this.f21218g.m23556c().queryBuilder().m28479a(UserDao.Properties.UserId.m28328a((Object) str), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() != 0) {
            return (User) c.get(0);
        }
        return null;
    }

    /* renamed from: f */
    private int m26494f(Comment comment) {
        return comment.m23465k() == null ? 0 : comment.m23465k().intValue();
    }

    /* renamed from: a */
    public void m26507a(Comment comment) {
        if (comment != null && dct.m26395a().m26410f()) {
            int f = m26494f(comment);
            if (f == 0) {
                comment.m23445d(Integer.valueOf(comment.m23456h().intValue() + 1));
            } else if (f == -1) {
                comment.m23445d(Integer.valueOf(comment.m23456h().intValue() + 1));
                comment.m23448e(Integer.valueOf(comment.m23459i().intValue() - 1));
            }
            comment.m23454g(Integer.valueOf(1));
        }
    }

    /* renamed from: b */
    public void m26523b(Comment comment) {
        if (comment != null && dct.m26395a().m26410f()) {
            int f = m26494f(comment);
            if (f == 0) {
                comment.m23448e(Integer.valueOf(comment.m23459i().intValue() + 1));
            } else if (f == 1) {
                comment.m23445d(Integer.valueOf(comment.m23456h().intValue() - 1));
                comment.m23448e(Integer.valueOf(comment.m23459i().intValue() + 1));
            }
            comment.m23454g(Integer.valueOf(-1));
        }
    }

    /* renamed from: c */
    public void m26528c(Comment comment) {
        if (comment != null && dct.m26395a().m26410f()) {
            int f = m26494f(comment);
            if (f == 1) {
                comment.m23445d(Integer.valueOf(comment.m23456h().intValue() - 1));
            } else if (f == -1) {
                comment.m23448e(Integer.valueOf(comment.m23459i().intValue() - 1));
            }
            comment.m23454g(Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public void m26524b(String str) {
        Comment f = m26542f(str);
        if (f != null) {
            m26507a(f);
            this.f21218g.m23555b().update(f);
        }
    }

    /* renamed from: c */
    public void m26529c(String str) {
        Comment f = m26542f(str);
        if (f != null) {
            m26523b(f);
            this.f21218g.m23555b().update(f);
        }
    }

    /* renamed from: d */
    public void m26534d(String str) {
        Comment f = m26542f(str);
        if (f != null) {
            m26528c(f);
            this.f21218g.m23555b().update(f);
        }
    }

    /* renamed from: e */
    public void m26539e(String str) {
        m26533d(m26542f(str));
    }

    /* renamed from: d */
    public void m26533d(final Comment comment) {
        if (comment != null) {
            m26509a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ dda f21207b;

                public void run() {
                    for (Comment d : comment.m23422G()) {
                        this.f21207b.m26533d(d);
                    }
                    this.f21207b.f21218g.m23555b().delete(comment);
                    List<CommentListItem> a = this.f21207b.m26504a(comment.m23426a().longValue());
                    if (a != null) {
                        for (CommentListItem j : a) {
                            j.m23518j();
                        }
                    }
                    List<PendingCommentListItem> b = this.f21207b.m26521b(comment.m23426a().longValue());
                    if (b != null) {
                        for (PendingCommentListItem m : b) {
                            m.m23591m();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public Comment m26542f(String str) {
        if (str == null) {
            return null;
        }
        List c = this.f21218g.m23555b().queryBuilder().m28479a(CommentDao.Properties.CommentId.m28328a((Object) str), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() != 0) {
            return (Comment) c.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public List<CommentListItem> m26504a(long j) {
        List<CommentListItem> c = this.f21218g.m23557d().queryBuilder().m28479a(Properties._commentId.m28328a(Long.valueOf(j)), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() == 0) {
            return null;
        }
        return c;
    }

    /* renamed from: b */
    public List<PendingCommentListItem> m26521b(long j) {
        List<PendingCommentListItem> c = this.f21218g.m23558e().queryBuilder().m28479a(PendingCommentListItemDao.Properties._commentId.m28328a(Long.valueOf(j)), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() == 0) {
            return null;
        }
        return c;
    }

    /* renamed from: a */
    public CommentListItem m26496a(long j, String str, int i) {
        List c = this.f21218g.m23557d().queryBuilder().m28479a(Properties._commentId.m28328a(Long.valueOf(j)), Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i))).m28476a().m28465b().m28467c();
        if (c.size() == 0) {
            return null;
        }
        return (CommentListItem) c.get(0);
    }

    /* renamed from: a */
    public CommentListItem m26499a(String str, String str2, int i) {
        List c = this.f21218g.m23557d().queryBuilder().m28479a(Properties.Url.m28328a((Object) str2), Properties.SortingType.m28328a(Integer.valueOf(i)), Properties.CommentId.m28328a((Object) str)).m28476a().m28465b().m28467c();
        if (c.size() > 0) {
            return (CommentListItem) c.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public CommentListItem m26498a(String str, int i) {
        List c = this.f21218g.m23557d().queryBuilder().m28479a(Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i))).m28484b(Properties.Rgt).m28477a(1).m28476a().m28465b().m28467c();
        if (c.size() == 0) {
            return null;
        }
        return (CommentListItem) c.get(0);
    }

    /* renamed from: b */
    public PreloadComments m26520b(String str, int i) {
        Object obj;
        if (str == null) {
            obj = "";
        }
        List c = this.f21218g.m23559f().queryBuilder().m28479a(PreloadCommentsDao.Properties.Url.m28328a(obj), new dos[0]).m28479a(PreloadCommentsDao.Properties.Order.m28328a(Integer.valueOf(i)), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() == 0) {
            return null;
        }
        return (PreloadComments) c.get(0);
    }

    /* renamed from: a */
    public boolean m26515a(String str, int i, ApiUrlCommentsItem apiUrlCommentsItem) {
        PreloadComments b = m26520b(str, i);
        boolean z = b != null;
        if (b == null) {
            b = new PreloadComments();
        }
        b.m23609a(str);
        b.m23612b(apiUrlCommentsItem.json);
        b.m23607a(Integer.valueOf(i));
        b.m23611b(Long.valueOf(System.currentTimeMillis() / 1000));
        if (z) {
            this.f21218g.m23559f().update(b);
        } else {
            this.f21218g.m23559f().insert(b);
        }
        return true;
    }

    /* renamed from: a */
    public boolean m26514a(ApiSimpleComment apiSimpleComment) {
        boolean z = false;
        Comment f = m26542f(apiSimpleComment.commentId);
        if (f == null) {
            return false;
        }
        f.m23436b(Integer.valueOf(apiSimpleComment.status));
        f.m23445d(Integer.valueOf(apiSimpleComment.likeCount));
        f.m23448e(Integer.valueOf(apiSimpleComment.dislikeCount));
        if (dct.m26395a().m26410f()) {
            if (apiSimpleComment.isLike == null) {
                f.m23454g(Integer.valueOf(0));
            } else {
                f.m23454g(Integer.valueOf(apiSimpleComment.isLike.value));
            }
        }
        if (apiSimpleComment.isCollapsed == 1) {
            z = true;
        }
        f.m23435b(Boolean.valueOf(z));
        f.m23457h(Integer.valueOf(apiSimpleComment.childrenTotal));
        this.f21218g.m23555b().update(f);
        return true;
    }

    /* renamed from: a */
    public boolean m26513a(ApiCommentStatus apiCommentStatus) {
        Comment f = m26542f(apiCommentStatus.commentId);
        if (f == null) {
            return false;
        }
        f.m23436b(Integer.valueOf(apiCommentStatus.status));
        f.m23455g(apiCommentStatus.embedMediaMeta.toString());
        if (ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(apiCommentStatus.type)) {
            f.m23460i(Integer.valueOf(1));
        } else if ("userMedia".equals(apiCommentStatus.type)) {
            f.m23460i(Integer.valueOf(2));
        } else {
            f.m23460i(Integer.valueOf(0));
        }
        this.f21218g.m23555b().update(f);
        return true;
    }

    /* renamed from: c */
    public boolean m26530c(String str, int i) {
        if (this.f21218g.m23557d().queryBuilder().m28479a(Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i))).m28486c().m28451b().m28452c() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public CommentListItem m26519b(String str, String str2, int i) {
        if (str == null) {
            return null;
        }
        List c = this.f21218g.m23557d().queryBuilder().m28479a(Properties.OrderKey.m28328a((Object) str), Properties.Url.m28328a((Object) str2), Properties.SortingType.m28328a(Integer.valueOf(i))).m28476a().m28465b().m28467c();
        if (c.size() != 0) {
            return (CommentListItem) c.get(0);
        }
        return null;
    }

    /* renamed from: g */
    public PendingCommentListItem[] m26547g(String str) {
        List c = this.f21218g.m23558e().queryBuilder().m28479a(PendingCommentListItemDao.Properties.Url.m28328a((Object) str), new dos[0]).m28480a(PendingCommentListItemDao.Properties.After).m28476a().m28465b().m28467c();
        return (PendingCommentListItem[]) c.toArray(new PendingCommentListItem[c.size()]);
    }

    /* renamed from: d */
    public void m26532d() {
        this.f21218g.m23554a();
    }

    /* renamed from: a */
    public CommentListItem[] m26516a(String str, int i, String str2) {
        doq queryBuilder = this.f21218g.m23557d().queryBuilder();
        CommentListItem b = m26519b(str2, str, i);
        if (b == null) {
            queryBuilder = queryBuilder.m28479a(Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i)));
        } else {
            queryBuilder = queryBuilder.m28479a(Properties.Id.m28334c(b.m23499a()), Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i)));
        }
        if (i == 1) {
            queryBuilder = queryBuilder.m28480a(Properties.Lft);
        } else {
            queryBuilder = queryBuilder.m28484b(Properties.OrderKey);
        }
        List c = queryBuilder.m28476a().m28465b().m28467c();
        return (CommentListItem[]) c.toArray(new CommentListItem[c.size()]);
    }

    /* renamed from: a */
    public CommentListItem[] m26517a(String str, int i, String str2, String str3) {
        CommentListItem a;
        boolean z;
        boolean z2;
        boolean z3;
        CommentListItem commentListItem = null;
        try {
            doq queryBuilder = this.f21218g.m23557d().queryBuilder();
            CommentListItem a2 = m26499a(str2, str, i);
            try {
                a = m26499a(str3, str, i);
                try {
                    List c = queryBuilder.m28479a(Properties.Lft.m28334c(a.m23514f()), Properties.Rgt.m28335d(a2.m23515g()), Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i))).m28480a(Properties.Lft).m28476a().m28465b().m28467c();
                    return (CommentListItem[]) c.toArray(new CommentListItem[c.size()]);
                } catch (Exception e) {
                    commentListItem = a;
                    a = a2;
                }
            } catch (Exception e2) {
                a = a2;
                z = this.f21218g == null;
                if (a != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (commentListItem != null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                ddc.m26569a("session: " + m26493a(z) + "; " + "parent: " + m26493a(z2) + "; " + "after: " + m26493a(z3));
                return new CommentListItem[0];
            }
        } catch (Exception e3) {
            a = null;
            if (this.f21218g == null) {
            }
            if (a != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (commentListItem != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ddc.m26569a("session: " + m26493a(z) + "; " + "parent: " + m26493a(z2) + "; " + "after: " + m26493a(z3));
            return new CommentListItem[0];
        }
    }

    /* renamed from: a */
    private String m26493a(boolean z) {
        return z ? "T" : "F";
    }

    /* renamed from: d */
    public void m26535d(String str, int i) {
        this.f21218g.m23557d().queryBuilder().m28479a(Properties.Url.m28328a((Object) str), Properties.SortingType.m28328a(Integer.valueOf(i))).m28482b().m28457b().m28458c();
    }

    /* renamed from: h */
    public void m26549h(final String str) {
        m26509a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ dda f21209b;

            public void run() {
                this.f21209b.f21218g.m23558e().queryBuilder().m28479a(PendingCommentListItemDao.Properties.Url.m28328a(str), new dos[0]).m28479a(PendingCommentListItemDao.Properties.Status.m28328a(Integer.valueOf(3)), new dos[0]).m28482b().m28457b().m28458c();
            }
        });
    }

    /* renamed from: c */
    public void m26527c(long j) {
        PendingCommentListItem d = m26531d(j);
        if (d != null) {
            d.m23591m();
        }
    }

    /* renamed from: e */
    public void m26538e(Comment comment) {
        this.f21218g.m23555b().update(comment);
    }

    /* renamed from: d */
    public PendingCommentListItem m26531d(long j) {
        return (PendingCommentListItem) this.f21218g.m23558e().load(Long.valueOf(j));
    }

    /* renamed from: e */
    public Comment m26536e(long j) {
        return (Comment) this.f21218g.m23555b().load(Long.valueOf(j));
    }

    /* renamed from: f */
    public void m26544f(long j) {
        PendingCommentListItem d = m26531d(j);
        if (d != null) {
            d.m23573b(Integer.valueOf(2));
            this.f21218g.m23558e().update(d);
        }
    }

    /* renamed from: a */
    public void m26508a(PendingCommentListItem pendingCommentListItem, Comment comment) {
        if (pendingCommentListItem.m23590l() != null) {
            pendingCommentListItem.m23590l().m23424I();
        }
        pendingCommentListItem.m23567a(comment);
        this.f21218g.m23558e().update(pendingCommentListItem);
    }

    /* renamed from: g */
    public void m26546g(long j) {
        PendingCommentListItem d = m26531d(j);
        if (d != null) {
            d.m23573b(Integer.valueOf(3));
            this.f21218g.m23558e().update(d);
        }
    }

    /* renamed from: e */
    public String m26537e() {
        return m26552j("logged_in_user");
    }

    /* renamed from: f */
    public User m26543f() {
        return m26503a(m26537e());
    }

    /* renamed from: a */
    public PendingCommentListItem m26501a(String str, int i, long j, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        long j2 = -1;
        int i2 = 1;
        String str9 = "";
        int q = m26561q();
        if (j != -1 || q <= 1) {
            Comment comment = (Comment) this.f21218g.m23555b().load(Long.valueOf(j));
            if (comment == null) {
                j = -1;
                str8 = str9;
            } else {
                int min = Math.min(comment.m23444d().intValue() + 1, q);
                if (q == 1) {
                    j2 = -1;
                } else {
                    j2 = j;
                }
                str8 = q == 1 ? "" : comment.m23439c();
                i2 = min;
            }
        } else {
            str8 = str9;
        }
        User f = m26543f();
        Comment comment2 = new Comment();
        comment2.m23438b("");
        comment2.m23443c(str2);
        comment2.m23433a(str);
        comment2.m23442c(Long.valueOf(j));
        comment2.m23446d(str8);
        comment2.m23431a(Integer.valueOf(i2));
        comment2.m23436b(Integer.valueOf(0));
        comment2.m23441c(Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        comment2.m23429a(f);
        comment2.m23445d(Integer.valueOf(0));
        comment2.m23448e(Integer.valueOf(0));
        comment2.m23454g(Integer.valueOf(0));
        comment2.m23435b(Boolean.valueOf(false));
        comment2.m23430a(Boolean.valueOf(z));
        comment2.m23449e("");
        comment2.m23455g("");
        comment2.m23466k(str7);
        comment2.m23460i(Integer.valueOf(0));
        comment2.m23468l(str3);
        comment2.m23470m(str4);
        comment2.m23472n("");
        this.f21218g.m23555b().insertInTx((Object[]) new Comment[]{comment2});
        PendingCommentListItem a = m26500a(comment2, str, i, j2, 1);
        a.m23575b(str3);
        a.m23578c(str4);
        a.m23581d(str5);
        a.m23583e(str6);
        return a;
    }

    /* renamed from: a */
    public PendingCommentListItem m26500a(Comment comment, String str, int i, long j, int i2) {
        PendingCommentListItem a = ModelFactory.m23564a(comment, str, i, j, i2, null);
        this.f21218g.m23558e().insert(a);
        return a;
    }

    /* renamed from: a */
    public CommentListItem m26497a(Comment comment, String str, String str2, int i, int i2, int i3) {
        CommentListItem a = m26496a(comment.m23426a().longValue(), str2, i);
        if (a == null) {
            a = ModelFactory.m23562a(comment, str, i, null, i2, i3);
            this.f21218g.m23557d().insert(a);
            return a;
        }
        a.m23506b(Integer.valueOf(i2));
        a.m23510c(Integer.valueOf(i3));
        this.f21218g.m23557d().update(a);
        return a;
    }

    /* renamed from: a */
    public Comment m26495a(ApiComment apiComment, Comment comment, String str, User user) {
        Comment f = m26542f(apiComment.commentId);
        boolean f2 = dct.m26395a().m26410f();
        if (f == null) {
            f = ModelFactory.m23561a(apiComment, str, user, comment, null, f2);
            this.f21218g.m23555b().insert(f);
            return f;
        }
        ModelFactory.m23561a(apiComment, str, user, comment, f, f2);
        this.f21218g.m23555b().update(f);
        return f;
    }

    /* renamed from: a */
    public User m26502a(ApiUser apiUser) {
        User a = m26503a(apiUser.userId);
        if (a == null) {
            a = ModelFactory.m23565a(apiUser, this.f21215d, null);
            this.f21218g.m23556c().insert(a);
            return a;
        }
        ModelFactory.m23565a(apiUser, this.f21215d, a);
        this.f21218g.m23556c().update(a);
        return a;
    }

    /* renamed from: g */
    public List<String> m26545g() {
        String str = "SELECT DISTINCT " + Properties.Url.f22370e + " FROM " + CommentListItemDao.TABLENAME;
        List arrayList = new ArrayList();
        Cursor rawQuery = this.f21218g.m22967h().rawQuery(str, null);
        if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(rawQuery.getString(0));
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: h */
    public void m26548h() {
        m26509a(new C48113(this));
    }

    /* renamed from: i */
    public CommentMeta m26550i(String str) {
        List c = this.f21218g.m23560g().queryBuilder().m28479a(CommentMetaDao.Properties.Url.m28328a((Object) str), new dos[0]).m28476a().m28465b().m28467c();
        if (c.size() > 0) {
            return (CommentMeta) c.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public void m26512a(String str, String str2) {
        CommentMeta i = m26550i(str);
        if (i == null) {
            this.f21218g.m23560g().insert(ModelFactory.m23563a(str, str2, null));
            return;
        }
        this.f21218g.m23560g().update(i);
    }

    /* renamed from: a */
    public void m26510a(String str, int i, int i2, int i3) {
        String str2 = Properties.Lft.f22370e;
        String str3 = Properties.Rgt.f22370e;
        str2 = "UPDATE COMMENT_LIST_ITEM SET " + str2 + "=" + str2 + "+" + i3 + " WHERE " + str2 + ">=" + i2 + " AND " + Properties.Url.f22370e + " = ?" + " AND " + Properties.SortingType.f22370e + " = ?";
        this.f21217f.execSQL(str2, new Object[]{str, Integer.valueOf(i)});
        str2 = "UPDATE COMMENT_LIST_ITEM SET " + str3 + "=" + str3 + "+" + i3 + " WHERE " + str3 + ">=" + i2 + " AND " + Properties.Url.f22370e + " = ?" + " AND " + Properties.SortingType.f22370e + " = ?";
        this.f21217f.execSQL(str2, new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: i */
    public void m26551i() {
        m26509a(new C48124(this));
    }

    /* renamed from: a */
    public void m26509a(Runnable runnable) {
        this.f21218g.m22964a(runnable);
    }

    /* renamed from: j */
    public boolean m26553j() {
        return m26541f("allowAnonymousVote", 0) == 1;
    }

    /* renamed from: k */
    public boolean m26555k() {
        return m26541f("allow_anonymous_comment", 0) == 1;
    }

    /* renamed from: l */
    public boolean m26556l() {
        return m26541f("user_name_clickable", 0) == 1;
    }

    /* renamed from: m */
    public String m26557m() {
        return m26552j("anonymous_avatar_url");
    }

    /* renamed from: n */
    public boolean m26558n() {
        return m26541f("enable_op_label_feature", 0) == 1;
    }

    /* renamed from: o */
    public boolean m26559o() {
        return m26541f("enable_op_hide_comment_feature", 0) == 1;
    }

    /* renamed from: p */
    public boolean m26560p() {
        return m26541f("allow_image_upload_feature", 0) == 1;
    }

    /* renamed from: q */
    public int m26561q() {
        return m26541f("max_display_level", 2);
    }

    /* renamed from: r */
    public int m26562r() {
        return m26541f("comment_quota", 1);
    }

    /* renamed from: s */
    public long m26563s() {
        return m26518b("comment_quota_wait_until", 0);
    }

    /* renamed from: a */
    public void m26505a(int i, int i2) {
        m26540e("comment_quota", i);
        m26540e("comment_quota_wait", i2);
        m26511a("comment_quota_wait_until", System.currentTimeMillis() + ((long) (i2 * 1000)));
    }

    /* renamed from: b */
    public void m26525b(String str, String str2) {
        this.f21219h.m27622a(str, str2);
    }

    /* renamed from: j */
    public String m26552j(String str) {
        return this.f21219h.m27619a(str);
    }

    /* renamed from: e */
    public void m26540e(String str, int i) {
        this.f21219h.m27620a(str, i);
    }

    /* renamed from: f */
    public int m26541f(String str, int i) {
        return this.f21219h.m27624b(str, i);
    }

    /* renamed from: a */
    public void m26511a(String str, long j) {
        this.f21219h.m27621a(str, j);
    }

    /* renamed from: k */
    public long m26554k(String str) {
        return m26518b(str, 0);
    }

    /* renamed from: b */
    public long m26518b(String str, long j) {
        return this.f21219h.m27625b(str, j);
    }
}
