package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.ninegag.android.tv.model.DaoMaster;
import com.ninegag.android.tv.model.DaoSession;
import com.ninegag.android.tv.model.Option;
import com.ninegag.android.tv.model.OptionDao;
import com.ninegag.android.tv.model.Post;
import com.ninegag.android.tv.model.PostDao;
import com.ninegag.android.tv.model.PostList;
import com.ninegag.android.tv.model.PostListDao.Properties;
import com.ninegag.android.tv.model.PostListItem;
import com.ninegag.android.tv.model.PostListItemDao;
import com.ninegag.android.tv.model.PostVideo;
import com.ninegag.android.tv.model.PostVideoDao;
import com.ninegag.android.tv.model.api.ApiAvailableList;
import com.ninegag.android.tv.model.api.ApiPostList.ApiPosts;
import com.ninegag.android.tv.model.api.ApiPostList.ApiVideo;
import com.ninegag.android.tv.model.constant.PostVideoConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TVDataController */
/* renamed from: cvv */
public class cvv {
    /* renamed from: b */
    private static cvv f20338b = new cvv();
    /* renamed from: a */
    public C4618a f20339a;
    /* renamed from: c */
    private Context f20340c;
    /* renamed from: d */
    private cvx f20341d;
    /* renamed from: e */
    private SQLiteDatabase f20342e;
    /* renamed from: f */
    private DaoMaster f20343f;
    /* renamed from: g */
    private DaoSession f20344g;
    /* renamed from: h */
    private HashMap<String, String> f20345h = null;

    /* compiled from: TVDataController */
    /* renamed from: cvv$a */
    public class C4618a {
        /* renamed from: a */
        final /* synthetic */ cvv f20337a;

        public C4618a(cvv cvv) {
            this.f20337a = cvv;
        }

        /* renamed from: a */
        public PostList m25130a(String str) {
            List d = this.f20337a.f20344g.m23023b().queryBuilder().m28479a(Properties.ListKey.m28328a((Object) str), new dos[0]).m28487d();
            if (d.size() == 0) {
                return null;
            }
            return (PostList) d.get(0);
        }

        /* renamed from: b */
        public PostList m25139b(String str) {
            PostList a = m25130a(str);
            if (a != null) {
                return a;
            }
            a = new PostList();
            a.m23105b(str);
            a.m23107c("");
            a.m23100a(Boolean.valueOf(true));
            this.f20337a.f20344g.m23023b().insert(a);
            return a;
        }

        /* renamed from: a */
        public List<PostList> m25132a() {
            return this.f20337a.f20344g.m23023b().queryBuilder().m28480a(Properties.Id).m28487d();
        }

        /* renamed from: a */
        public void m25138a(ApiAvailableList.List[] listArr) {
            List<PostList> loadAll = this.f20337a.f20344g.m23023b().loadAll();
            HashMap hashMap = new HashMap();
            for (PostList postList : loadAll) {
                PostList postList2;
                hashMap.put(postList2.m23106c(), postList2);
            }
            Iterable arrayList = new ArrayList();
            for (ApiAvailableList.List list : listArr) {
                PostList postList3 = new PostList();
                postList3.m23103a(list.name);
                postList3.m23105b(list.list_key);
                if (hashMap.containsKey(list.list_key)) {
                    postList2 = (PostList) hashMap.get(list.list_key);
                    postList3.m23100a(postList2.m23109e());
                    postList3.m23107c(postList2.m23108d());
                } else {
                    postList3.m23100a(Boolean.valueOf(true));
                    postList3.m23107c("");
                }
                arrayList.add(postList3);
            }
            this.f20337a.f20344g.m23023b().deleteAll();
            this.f20337a.f20344g.m23023b().insertInTx(arrayList);
        }

        /* renamed from: c */
        public String m25140c(String str) {
            return m25139b(str).m23108d();
        }

        /* renamed from: d */
        public boolean m25141d(String str) {
            return m25139b(str).m23109e().booleanValue();
        }

        /* renamed from: a */
        public void m25136a(String str, String str2, boolean z) {
            PostList b = m25139b(str);
            b.m23107c(str2);
            b.m23100a(Boolean.valueOf(z));
            this.f20337a.f20344g.m23023b().update(b);
        }

        /* renamed from: a */
        public List<PostListItem> m25133a(String str, int i) {
            return this.f20337a.f20344g.m23025d().queryBuilder().m28479a(PostListItemDao.Properties.ListKey.m28328a((Object) str), new dos[0]).m28480a(PostListItemDao.Properties.Id).m28483b(i).m28477a(998).m28487d();
        }

        /* renamed from: e */
        public void m25142e(String str) {
            this.f20337a.f20344g.m23025d().queryBuilder().m28479a(PostListItemDao.Properties.ListKey.m28328a((Object) str), new dos[0]).m28482b().m28458c();
            m25136a(str, "", true);
        }

        /* renamed from: a */
        public void m25137a(String str, ApiPosts[] apiPostsArr) {
            for (ApiPosts apiPosts : apiPostsArr) {
                Post a = m25129a(apiPosts);
                m25135a(a, apiPosts.video);
                PostListItem postListItem = new PostListItem();
                postListItem.m23126a(str);
                postListItem.m23124a(a);
                postListItem.m23130b(apiPosts.id);
                this.f20337a.f20344g.m23025d().insert(postListItem);
            }
        }

        /* renamed from: a */
        public Post m25129a(ApiPosts apiPosts) {
            Post post;
            int i;
            Post f = m25143f(apiPosts.id);
            if (f == null) {
                post = new Post();
                i = 1;
            } else {
                post = f;
                i = 0;
            }
            post.m23048a(apiPosts.id);
            post.m23052b(apiPosts.title);
            post.m23055c(apiPosts.description);
            post.m23058d(apiPosts.og_title);
            post.m23061e(apiPosts.og_description);
            post.m23049a(new Date((long) (apiPosts.created * 1000)));
            post.m23064f(apiPosts.content);
            post.m23066g(apiPosts.url);
            post.m23068h(apiPosts.shorten_url);
            post.m23070i(apiPosts.embed_url);
            post.m23045a(Boolean.valueOf(apiPosts.nsfw));
            post.m23046a(Integer.valueOf(1));
            post.m23054c(Integer.valueOf(apiPosts.social.external_views));
            post.m23057d(Integer.valueOf(apiPosts.social.tweets));
            post.m23060e(Integer.valueOf(apiPosts.social.fb_likes));
            post.m23063f(Integer.valueOf(apiPosts.social.fb_shares));
            post.m23072j(apiPosts.thumbnails.thumbnail_720w);
            post.m23074k(apiPosts.thumbnails.thumbnail_480w);
            post.m23076l(apiPosts.thumbnails.thumbnail_360w);
            post.m23078m(apiPosts.thumbnails.thumbnail_240w);
            post.m23051b(Integer.valueOf(0));
            if (i != 0) {
                this.f20337a.f20344g.m23024c().insert(post);
            } else {
                this.f20337a.f20344g.m23024c().update(post);
            }
            return post;
        }

        /* renamed from: a */
        public void m25135a(Post post, ApiVideo apiVideo) {
            PostVideo g = m25144g(post.m23050b());
            PostVideo a = m25131a(apiVideo, post, g);
            if (g != null) {
                this.f20337a.f20344g.m23026e().update(g);
            } else {
                this.f20337a.f20344g.m23026e().insert(a);
            }
        }

        /* renamed from: f */
        public Post m25143f(String str) {
            List d = this.f20337a.f20344g.m23024c().queryBuilder().m28479a(PostDao.Properties.PostId.m28328a((Object) str), new dos[0]).m28487d();
            if (d.size() == 0) {
                return null;
            }
            return (Post) d.get(0);
        }

        /* renamed from: a */
        public Map<String, PostVideo> m25134a(List<String> list) {
            List<PostVideo> d = this.f20337a.f20344g.m23026e().queryBuilder().m28479a(PostVideoDao.Properties.PostId.m28329a((Collection) list), new dos[0]).m28487d();
            Map hashMap = new HashMap();
            for (PostVideo postVideo : d) {
                hashMap.put(postVideo.m23163h(), postVideo);
            }
            return hashMap;
        }

        /* renamed from: g */
        public PostVideo m25144g(String str) {
            List d = this.f20337a.f20344g.m23026e().queryBuilder().m28479a(PostVideoDao.Properties.PostId.m28328a((Object) str), new dos[0]).m28487d();
            if (d.size() > 0) {
                return (PostVideo) d.get(0);
            }
            return null;
        }

        /* renamed from: a */
        public PostVideo m25131a(ApiVideo apiVideo, Post post, PostVideo postVideo) {
            if (postVideo == null) {
                postVideo = new PostVideo();
            }
            if (apiVideo != null) {
                postVideo.m23149a(Integer.valueOf(PostVideoConst.m23175a(apiVideo.type)));
                postVideo.m23151a(apiVideo.id);
                postVideo.m23154b(apiVideo.external_id);
                postVideo.m23153b(Integer.valueOf(apiVideo.duration));
                postVideo.m23156c(Integer.valueOf(apiVideo.starttime));
                postVideo.m23159d(Integer.valueOf(apiVideo.endtime));
            }
            postVideo.m23157c(post.m23050b());
            return postVideo;
        }
    }

    /* renamed from: a */
    public static cvv m25146a() {
        return f20338b;
    }

    /* renamed from: a */
    public void m25151a(Context context) {
        this.f20340c = context;
        m25147c();
        this.f20339a = new C4618a(this);
    }

    /* renamed from: c */
    private void m25147c() {
        if (this.f20341d == null) {
            this.f20341d = new cvx(this.f20340c);
        }
        if (this.f20342e == null) {
            this.f20342e = this.f20341d.getWritableDatabase();
        }
        if (this.f20343f == null) {
            this.f20343f = new DaoMaster(this.f20342e);
        }
        if (this.f20344g == null) {
            this.f20344g = this.f20343f.m23020a();
        }
        m25148d();
    }

    /* renamed from: d */
    private void m25148d() {
        if (this.f20345h == null) {
            this.f20345h = new HashMap();
            for (Option option : this.f20344g.m23022a().loadAll()) {
                this.f20345h.put(option.m23030b(), option.m23032c());
            }
        }
    }

    /* renamed from: b */
    public void m25154b() {
        this.f20341d.m25160a();
    }

    /* renamed from: a */
    public String m25150a(String str) {
        return (String) this.f20345h.get(str);
    }

    /* renamed from: a */
    public void m25153a(String str, String str2) {
        this.f20345h.put(str, str2);
        List c = this.f20344g.m23022a().queryBuilder().m28479a(OptionDao.Properties.Key.m28328a((Object) str), new dos[0]).m28476a().m28467c();
        if (c.size() > 0) {
            Option option = (Option) c.get(0);
            option.m23031b(str2);
            this.f20344g.m22966b((Object) option);
            return;
        }
        option = new Option();
        option.m23029a(str);
        option.m23031b(str2);
        this.f20344g.m22961a((Object) option);
    }

    /* renamed from: a */
    public long m25149a(String str, long j) {
        String a = m25150a(str);
        return a == null ? j : Long.parseLong(a);
    }

    /* renamed from: b */
    public void m25155b(String str, long j) {
        m25153a(str, Long.toString(j));
    }

    /* renamed from: a */
    public void m25152a(Runnable runnable) {
        this.f20344g.m22964a(runnable);
    }
}
