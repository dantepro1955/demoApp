package com.p000;

import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiGagVideo;
import com.ninegag.android.app.model.api.ApiGagYouTubeVideo;
import com.ninegag.android.app.model.api.ApiUrlInfoResponse;
import com.ninegag.android.app.model.api.ApiUrlInfoResponse.UrlInfoObject;
import com.ninegag.android.library.upload.model.DefaultRemoteMediaMeta;
import com.ninegag.android.library.upload.model.MediaMeta;
import com.ninegag.android.library.upload.model.YouTubeMediaMeta;
import java.util.regex.Pattern;
import p000.caq.C1641a;
import rx.schedulers.Schedulers;

/* compiled from: UrlInfoFetchPresenter */
/* renamed from: cou */
public class cou extends cap<C4131a> {
    /* renamed from: a */
    private cjg f19903a;
    /* renamed from: b */
    private dyt f19904b;
    /* renamed from: c */
    private MediaMeta f19905c;
    /* renamed from: d */
    private String f19906d;
    /* renamed from: e */
    private final Pattern f19907e = Pattern.compile("^((?:https?:)?\\/\\/)?((?:www|m)\\.)?((?:youtube\\.com|youtu.be))(\\/(?:[\\w-]+\\?v=|embed\\/|v\\/)?)([\\w-]+)(\\S+)?$");
    /* renamed from: f */
    private final Pattern f19908f = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:www.)?(?:instagram.com|instagr.am)\\/p\\/([A-Za-z0-9-_]+)");

    /* compiled from: UrlInfoFetchPresenter */
    /* renamed from: cou$a */
    public interface C4131a extends C1641a {
        /* renamed from: a */
        void mo3744a();

        /* renamed from: a */
        void mo3810a(int i);

        /* renamed from: a */
        void mo3811a(MediaMeta mediaMeta);

        /* renamed from: a */
        void mo3812a(String str);

        /* renamed from: b */
        void mo3813b();

        /* renamed from: b */
        void mo3814b(int i);

        /* renamed from: c */
        void mo3815c();

        /* renamed from: d */
        void mo3816d();

        /* renamed from: d */
        void mo3817d(int i);

        /* renamed from: e */
        void mo3819e();

        /* renamed from: f */
        void mo3820f();

        /* renamed from: g */
        void mo3821g();

        /* renamed from: h */
        void mo3822h();

        /* renamed from: i */
        String mo3823i();

        /* renamed from: s */
        dtp<Void> mo3824s();

        /* renamed from: t */
        dtp<bwp> mo3825t();

        /* renamed from: u */
        dtp<Void> mo3826u();
    }

    public cou(cjg cjg, String str) {
        this.f19903a = cjg;
        this.f19906d = str;
    }

    /* renamed from: a */
    public void m24238a(C4131a c4131a) {
        super.a(c4131a);
        c4131a.mo3814b(R.string.upload_url_toolbar_title);
        c4131a.mo3817d(R.string.next);
        c4131a.mo3822h();
        c4131a.mo3820f();
        c4131a.mo3744a();
        m24228a(c4131a, this.f19906d);
        this.f19904b = new dyt();
        this.f19904b.m29887a(c4131a.mo3825t().m29329a(cov.m24239a(c4131a)).m29337b(cow.m24240a(c4131a)));
        this.f19904b.m29887a(c4131a.mo3824s().m29337b(cox.m24241a(c4131a)));
        this.f19904b.m29887a(c4131a.mo3826u().m29329a(coy.m24242a(this, c4131a)).m29326a(Schedulers.io()).m29334b(coz.m24244a(this, c4131a)).m29340c(cpa.m24249a(this, c4131a)).m29326a(dua.m29393a()).m29332a(cpb.m24251a(this, c4131a), cpc.m24252a()));
    }

    /* renamed from: b */
    static /* synthetic */ void m24234b(C4131a c4131a, bwp bwp) {
        if (bwp.b().length() > 0) {
            c4131a.mo3819e();
            return;
        }
        c4131a.mo3820f();
        c4131a.mo3822h();
    }

    /* renamed from: a */
    static /* synthetic */ void m24227a(C4131a c4131a, bwp bwp) {
        if (bwp.b().length() > 0) {
            c4131a.mo3821g();
            c4131a.mo3819e();
            return;
        }
        c4131a.mo3822h();
        c4131a.mo3820f();
    }

    /* renamed from: c */
    static /* synthetic */ void m24235c(cou cou, C4131a c4131a, Void voidR) {
        if (cou.m24232a(c4131a.mo3823i())) {
            c4131a.mo3813b();
            return;
        }
        c4131a.mo3815c();
        c4131a.mo3810a((int) R.string.upload_url_not_supported);
    }

    /* renamed from: a */
    static /* synthetic */ void m24230a(cou cou, C4131a c4131a, ApiUrlInfoResponse apiUrlInfoResponse) {
        cou.f19905c = cou.m24225a(c4131a.mo3823i(), apiUrlInfoResponse);
        c4131a.mo3815c();
        if (cou.f19905c != null) {
            c4131a.mo3821g();
            c4131a.mo3811a(cou.f19905c);
            chn.q("UploadAction", "UploadAction");
            return;
        }
        c4131a.mo3810a((int) R.string.upload_url_not_supported);
    }

    /* renamed from: a */
    static /* synthetic */ void m24231a(Throwable th) {
    }

    /* renamed from: a */
    public void m24236a() {
        super.a();
        this.f19904b.unsubscribe();
    }

    /* renamed from: a */
    private MediaMeta m24225a(String str, ApiUrlInfoResponse apiUrlInfoResponse) {
        if (apiUrlInfoResponse == null || apiUrlInfoResponse.data == null || apiUrlInfoResponse.data.urlInfos == null) {
            return null;
        }
        UrlInfoObject urlInfoObject = (UrlInfoObject) apiUrlInfoResponse.data.urlInfos.get(str);
        if (urlInfoObject == null) {
            return null;
        }
        String str2 = urlInfoObject.platform;
        int i = -1;
        switch (str2.hashCode()) {
            case -991745245:
                if (str2.equals(UrlInfoObject.PLATFORM_YOUTUBE)) {
                    i = 0;
                    break;
                }
                break;
            case 28903346:
                if (str2.equals(UrlInfoObject.PLATFORM_INSTAGRAM)) {
                    i = 1;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                ApiGagYouTubeVideo apiGagYouTubeVideo = (ApiGagYouTubeVideo) urlInfoObject.youtubeVideos.get(0);
                return new YouTubeMediaMeta(urlInfoObject.title, str, apiGagYouTubeVideo.thumbnail.url, apiGagYouTubeVideo.duration.longValue(), apiGagYouTubeVideo.width, apiGagYouTubeVideo.height, apiGagYouTubeVideo.id, apiGagYouTubeVideo.startTs);
            case 1:
                ApiGagVideo apiGagVideo = (ApiGagVideo) urlInfoObject.videos.get(0);
                return new DefaultRemoteMediaMeta(null, apiGagVideo.url, str, apiGagVideo.thumbnail.url, apiGagVideo.duration.longValue(), apiGagVideo.width, apiGagVideo.height, 101);
            default:
                return null;
        }
    }

    /* renamed from: a */
    private boolean m24232a(String str) {
        return this.f19907e.matcher(str).find() || this.f19908f.matcher(str).find();
    }

    /* renamed from: a */
    private void m24228a(C4131a c4131a, String str) {
        if (str != null && !str.isEmpty() && m24232a(str)) {
            c4131a.mo3812a(str);
        }
    }
}
