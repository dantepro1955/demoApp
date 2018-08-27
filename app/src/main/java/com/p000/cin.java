package com.p000;

import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse.Separator;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.model.newdb.GagItemDao;
import com.ninegag.android.app.model.newdb.GagListDao.Properties;
import com.ninegag.android.app.model.newdb.GagListItemDao;
import com.ninegag.android.app.model.newdb.UserDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: GagPostListDB */
/* renamed from: cin */
public class cin {
    /* renamed from: a */
    private clc f9387a;
    /* renamed from: b */
    private int f9388b;

    public cin(clc clc) {
        this.f9387a = clc;
    }

    /* renamed from: a */
    public cle m13814a(String str) {
        List d = this.f9387a.m14234d().queryBuilder().a(Properties.f18249b.a(str), new dos[0]).d();
        if (d.size() == 0) {
            return null;
        }
        return (cle) d.get(0);
    }

    /* renamed from: b */
    public cle m13824b(String str) {
        cle a = m13814a(str);
        if (a != null) {
            return a;
        }
        a = new cle();
        a.m14238a(str);
        a.m14243c("");
        a.m14241b("");
        a.m14240b(Boolean.valueOf(true));
        this.f9387a.m14234d().insert(a);
        return a;
    }

    /* renamed from: c */
    public String m13826c(String str) {
        return m13824b(str).m14244d();
    }

    /* renamed from: d */
    public boolean m13827d(String str) {
        return m13824b(str).m14248f().booleanValue();
    }

    /* renamed from: e */
    public String m13828e(String str) {
        return m13824b(str).m14242c();
    }

    /* renamed from: a */
    public void m13819a(long j, boolean z) {
        for (clf clf : this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18257b.a(Long.valueOf(j)), new dos[0]).d()) {
            clf.m14254a(Boolean.valueOf(z));
            clf.m14270j();
        }
    }

    /* renamed from: a */
    public void m13821a(String str, String str2, boolean z, String str3) {
        cle b = m13824b(str);
        b.m14243c(str2);
        b.m14240b(Boolean.valueOf(z));
        b.m14247e(str3);
        this.f9387a.m14234d().update(b);
    }

    /* renamed from: a */
    public void m13822a(String str, String str2, boolean z, Separator[] separatorArr, String str3) {
        String a;
        cle b = m13824b(str);
        String g = b.m14249g();
        if (separatorArr == null) {
            g = null;
        }
        if (g == null || g.isEmpty()) {
            if (separatorArr != null) {
                a = cpy.a(separatorArr, 1);
            }
            a = g;
        } else {
            Separator[] separatorArr2 = (Separator[]) dfa.a(b.m14249g(), Separator[].class);
            if (separatorArr2 != null && separatorArr.length > 0) {
                ArrayList arrayList = new ArrayList(Arrays.asList(separatorArr2));
                for (Object add : separatorArr) {
                    arrayList.add(add);
                }
                a = cpy.a(arrayList, 1);
            }
            a = g;
        }
        b.m14243c(str2);
        b.m14240b(Boolean.valueOf(z));
        b.m14245d(a);
        b.m14247e(str3);
        this.f9387a.m14234d().update(b);
    }

    /* renamed from: f */
    public Separator[] m13829f(String str) {
        return (Separator[]) cpy.a(caf.m12046a().m12075g().f9370c.m13824b(str).m14249g(), Separator[].class, 1);
    }

    /* renamed from: b */
    public void m13825b(String str, String str2, boolean z, String str3) {
        cle b = m13824b(str);
        b.m14241b(str2);
        b.m14236a(Boolean.valueOf(z));
        b.m14247e(str3);
        this.f9387a.m14234d().update(b);
    }

    /* renamed from: a */
    public List<clf> m13817a(String str, int i, boolean z) {
        if (i == 0) {
            return this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[]{GagListItemDao.Properties.f18259d.a(Integer.valueOf(1))}).a(GagListItemDao.Properties.f18261f.a(), GagListItemDao.Properties.f18261f.b(Boolean.valueOf(true)), new dos[0]).a(new dnz[]{GagListItemDao.Properties.f18256a}).b(i).a(1000).d();
        }
        return this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[]{GagListItemDao.Properties.f18259d.a(Integer.valueOf(1))}).a(GagListItemDao.Properties.f18261f.a(), GagListItemDao.Properties.f18261f.b(Boolean.valueOf(true)), new dos[0]).a(new dnz[]{GagListItemDao.Properties.f18256a}).b(this.f9388b + i).a(1000).d();
    }

    /* renamed from: a */
    public List<String> m13816a(String str, int i) {
        List<clf> d = this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[0]).a(GagListItemDao.Properties.f18261f.b(Boolean.valueOf(true)), GagListItemDao.Properties.f18261f.a(), new dos[0]).b(new dnz[]{GagListItemDao.Properties.f18260e}).a(i).d();
        List arrayList = new ArrayList();
        for (clf b : d) {
            List d2 = this.f9387a.m14232b().queryBuilder().a(GagItemDao.Properties.f18223a.a(b.m14258b()), new dos[0]).d();
            if (d2 != null) {
                arrayList.add(((cld) d2.get(0)).m12623c());
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public long m13830g(String str) {
        return this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[]{GagListItemDao.Properties.f18259d.a(Integer.valueOf(1))}).a(GagListItemDao.Properties.f18261f.a(), GagListItemDao.Properties.f18261f.b(Boolean.valueOf(true)), new dos[0]).e();
    }

    /* renamed from: h */
    public void m13831h(String str) {
        this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[0]).a(GagListItemDao.Properties.f18261f.b(Boolean.valueOf(true)), GagListItemDao.Properties.f18261f.a(), new dos[0]).b().c();
        this.f9388b = 0;
        m13822a(str, "", true, null, null);
        m13825b(str, "", true, null);
    }

    /* renamed from: a */
    public void m13818a() {
        for (cld cld : this.f9387a.m14232b().loadAll()) {
            cld.m12639h(Integer.valueOf(0));
            cld.m12609A();
        }
    }

    /* renamed from: a */
    public void m13823a(String str, ApiGag[] apiGagArr) {
        for (ApiGag apiGag : apiGagArr) {
            cld a = m13813a(apiGag);
            if (this.f9387a.m14233c().queryBuilder().a(GagListItemDao.Properties.f18258c.a(str), new dos[0]).a(GagListItemDao.Properties.f18257b.a(a.m12619b()), new dos[0]).a(GagListItemDao.Properties.f18261f.a(Boolean.valueOf(true)), new dos[0]).e() == 0) {
                clf clf = new clf();
                clf.m14257a(str);
                clf.m14253a(a);
                clf.m14255a(Integer.valueOf(1));
                clf.m14262c(Long.valueOf(apiGag.orderId));
                if (apiGag.postUser != null) {
                    clf.m14260b(apiGag.postUser.actionsText);
                    clf.m14263c(apiGag.postUser.commentId);
                }
                this.f9387a.m14233c().insert(clf);
            }
        }
    }

    /* renamed from: a */
    public cld m13813a(ApiGag apiGag) {
        cld i = m13832i(apiGag.id);
        int i2 = 0;
        if (i == null) {
            i = new cld();
            i2 = 1;
        }
        i.m12618a(apiGag.id);
        i.m12622b(apiGag.title);
        i.m12628d(apiGag.type);
        i.m12631e(apiGag.commentOpClientId);
        i.m12634f(apiGag.commentOpSignature);
        i.m12616a(Integer.valueOf(apiGag.commentsCount));
        i.m12620b(Integer.valueOf(apiGag.upVoteCount));
        i.m12624c(Integer.valueOf(apiGag.downVoteCount));
        i.m12627d(Integer.valueOf(apiGag.nsfw));
        i.m12630e(Integer.valueOf(apiGag.version));
        i.m12633f(Integer.valueOf(apiGag.hasLongPostCover));
        i.m12636g(Integer.valueOf(apiGag.hasImageTile));
        i.m12639h(Integer.valueOf(apiGag.userScore));
        i.m12637g(apiGag.albumWebUrl);
        i.m12640h(apiGag.sourceDomain);
        i.m12642i(apiGag.sourceUrl);
        i.m12644j(cpy.a(apiGag.images, 1));
        i.m12646k(cpy.a(apiGag.postTile, 1));
        i.m12615a(m13815a(apiGag.creator));
        i.m12650m(cpy.a(apiGag.targetedAdTags, 1));
        i.m12625c(apiGag.description);
        if (ApiGag.TYPE_VIDEO.equals(apiGag.type)) {
            cke cke = new cke();
            cke.f9526i = apiGag.postVideo.id;
            cke.f9521d = 4;
            cke.f9522e = cke.m14163a(apiGag.postVideo.source);
            cke.f9523f = apiGag.postVideo.startTs;
            cke.f9524g = apiGag.postVideo.endTs;
            i.m12648l(cpy.a(cke, 1));
        }
        i.m12652n(cpy.a(apiGag.tags, 1));
        if (i2 != 0) {
            this.f9387a.m14232b().insert(i);
        } else {
            this.f9387a.m14232b().update(i);
        }
        return i;
    }

    /* renamed from: i */
    public cld m13832i(String str) {
        List d = this.f9387a.m14232b().queryBuilder().a(GagItemDao.Properties.f18224b.a(str), new dos[0]).d();
        if (d.size() == 0) {
            return null;
        }
        return (cld) d.get(0);
    }

    /* renamed from: a */
    public void m13820a(cld cld) {
        this.f9387a.m14232b().update(cld);
    }

    /* renamed from: j */
    public clg m13833j(String str) {
        List d = this.f9387a.m14231a().queryBuilder().a(UserDao.Properties.f18266b.a(str), new dos[0]).d();
        if (d.size() == 0) {
            return null;
        }
        return (clg) d.get(0);
    }

    /* renamed from: k */
    public clg m13834k(String str) {
        List d = this.f9387a.m14231a().queryBuilder().a(UserDao.Properties.f18267c.a(str), new dos[0]).d();
        if (d.size() == 0) {
            return null;
        }
        return (clg) d.get(0);
    }

    /* renamed from: a */
    public clg m13815a(ApiUser apiUser) {
        clg j;
        if (apiUser.accountId == null) {
            j = m13833j(apiUser.userId);
        } else {
            j = m13834k(apiUser.accountId);
            if (j == null) {
                j = m13833j(apiUser.userId);
            }
        }
        Object obj = null;
        if (j == null) {
            obj = 1;
            j = new clg();
        }
        j.m14273a(apiUser.userId);
        j.m14275b(apiUser.accountId);
        j.m14281e(apiUser.avatarUrlSmall);
        j.m14279d(apiUser.profileUrl);
        j.m14277c(apiUser.getUsername());
        if (obj != null) {
            this.f9387a.m14231a().insert(j);
        } else {
            this.f9387a.m14231a().update(j);
        }
        return j;
    }
}
