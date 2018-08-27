package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.ads.AdError;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.millennialmedia.android.MMSDK$Event;

/* compiled from: TaskFactory */
/* renamed from: cng */
public class cng {
    /* renamed from: a */
    private Context f9835a;

    public cng(Context context) {
        this.f9835a = context;
    }

    /* renamed from: a */
    public boolean m14743a(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 100:
            case 101:
            case 105:
            case 107:
            case 108:
            case 109:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 131:
            case 141:
            case 151:
            case 152:
            case HttpStatus.HTTP_OK /*200*/:
            case InterstitialErrorStatus.NOT_LOADED /*202*/:
            case InterstitialErrorStatus.ALREADY_LOADED /*203*/:
            case HttpStatus.HTTP_INTERNAL_SERVER_ERROR /*500*/:
            case HttpStatus.HTTP_NOT_IMPLEMENTED /*501*/:
            case 503:
            case 600:
            case 700:
            case 701:
            case AdError.SERVER_ERROR_CODE /*2000*/:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public boolean m14744b(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 102:
            case 104:
            case GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION /*300*/:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public boolean m14745c(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 400:
            case 401:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public cnf m14746d(Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 100:
                return m14723h(intent);
            case 101:
                return m14724i(intent);
            case 105:
                return m14739x(intent);
            case 107:
                return m14727l(intent);
            case 109:
                return m14732q(intent);
            case 111:
                return m14741z(intent);
            case 112:
                return m14722g(intent);
            case 113:
                return m14733r(intent);
            case 114:
                return m14725j(intent);
            case 115:
                return m14734s(intent);
            case 116:
                return m14735t(intent);
            case 118:
                return m14712F(intent);
            case 119:
                return m14736u(intent);
            case 120:
                return m14728m(intent);
            case 121:
                return m14731p(intent);
            case 122:
                return m14729n(intent);
            case 123:
                return m14717K(intent);
            case 124:
                return m14718L(intent);
            case 125:
                return m14730o(intent);
            case 126:
                return m14737v(intent);
            case 127:
                return m14738w(intent);
            case 128:
                return m14726k(intent);
            case 131:
                return m14707A(intent);
            case 141:
                return m14708B(intent);
            case 151:
                return m14709C(intent);
            case 152:
                return m14740y(intent);
            case HttpStatus.HTTP_OK /*200*/:
                return m14710D(intent);
            case InterstitialErrorStatus.NOT_LOADED /*202*/:
                return m14711E(intent);
            case InterstitialErrorStatus.ALREADY_LOADED /*203*/:
                return m14716J(intent);
            case HttpStatus.HTTP_INTERNAL_SERVER_ERROR /*500*/:
                return m14748f(intent);
            case HttpStatus.HTTP_NOT_IMPLEMENTED /*501*/:
                return m14742a();
            case 503:
                return m14747e(intent);
            case 600:
                return m14715I(intent);
            case 700:
                return m14713G(intent);
            case 701:
                return m14714H(intent);
            case 997:
                return m14719M(intent);
            case 998:
                return m14721O(intent);
            case AdError.SERVER_ERROR_CODE /*2000*/:
                return m14720N(intent);
            default:
                return null;
        }
    }

    /* renamed from: e */
    public cnf m14747e(Intent intent) {
        cnf f = cmi.m14513f(cip.m13967a().m14012q());
        f.m14460a(intent);
        return f;
    }

    /* renamed from: a */
    public cnf m14742a() {
        if (caf.m12046a().m12094x().m12104c()) {
            return m14723h(null);
        }
        return m14722g(null);
    }

    /* renamed from: f */
    public cnf m14748f(Intent intent) {
        cnf e = cmi.m14512e(cip.m13967a().m14012q());
        e.m14460a(intent);
        return e;
    }

    /* renamed from: g */
    private cmh m14722g(Intent intent) {
        cmh cmh = new cmh();
        if (intent != null) {
            cmh.m14501c(intent.getStringExtra("pushToken"));
        }
        cmh.m14460a(intent);
        return cmh;
    }

    /* renamed from: h */
    private cmi m14723h(Intent intent) {
        String q;
        String str = null;
        boolean z = false;
        if (intent == null) {
            q = cip.m13967a().m14012q();
            z = true;
        } else {
            q = intent.getStringExtra("data");
            str = intent.getStringExtra("pushToken");
        }
        cmi c = cmi.m14510c(q);
        c.m14526a(z);
        c.m14534g(str);
        c.m14460a(intent);
        return c;
    }

    /* renamed from: i */
    private cmi m14724i(Intent intent) {
        cmi d = cmi.m14511d(intent.getStringExtra("data"));
        if (intent != null) {
            d.m14534g(intent.getStringExtra("pushToken"));
        }
        d.m14460a(intent);
        return d;
    }

    /* renamed from: j */
    private cnf m14725j(Intent intent) {
        cnf cmo = new cmo();
        cmo.m14460a(intent);
        return cmo;
    }

    /* renamed from: k */
    private cnf m14726k(Intent intent) {
        cnf cmx = new cmx();
        cmx.m14460a(intent);
        return cmx;
    }

    /* renamed from: l */
    private cnf m14727l(Intent intent) {
        cnf cnn = new cnn();
        cnn.m14798a(cij.m13687a().m13729g());
        cnn.m14460a(intent);
        return cnn;
    }

    /* renamed from: m */
    private cnf m14728m(Intent intent) {
        cnf cnm = new cnm(intent.getStringExtra("new_password"));
        cnm.m14460a(intent);
        return cnm;
    }

    /* renamed from: n */
    private cnf m14729n(Intent intent) {
        cnf cnk = new cnk(intent.getStringExtra(MMSDK$Event.INTENT_EMAIL));
        cnk.m14460a(intent);
        return cnk;
    }

    /* renamed from: o */
    private cnf m14730o(Intent intent) {
        String stringExtra = intent.getStringExtra(AccessToken.USER_ID_KEY);
        int intExtra = intent.getIntExtra("install_timestamp", -1);
        String stringExtra2 = intent.getStringExtra("push_token");
        if (intExtra <= 0) {
            intExtra = (int) (cqw.a() / 1000);
        }
        cnf cnj = new cnj(stringExtra, intExtra, stringExtra2);
        cnj.m14460a(intent);
        return cnj;
    }

    /* renamed from: p */
    private cnf m14731p(Intent intent) {
        cnf cno = new cno(intent.getIntExtra("bind", 0), intent.getStringExtra("platform"), intent.getStringExtra("token"));
        cno.m14460a(intent);
        return cno;
    }

    /* renamed from: q */
    private cnf m14732q(Intent intent) {
        cnf cmn = new cmn(intent.getStringExtra(MMSDK$Event.INTENT_EMAIL));
        cmn.m14460a(intent);
        return cmn;
    }

    /* renamed from: r */
    private cmr m14733r(Intent intent) {
        cmr cmr = new cmr();
        cmr.m14460a(intent);
        return cmr;
    }

    /* renamed from: s */
    private cnf m14734s(Intent intent) {
        cnf cms = new cms(intent.getStringExtra("scope"), intent.getIntExtra("list_type", 1), intent.getStringExtra("group_id"));
        cms.m14460a(intent);
        return cms;
    }

    /* renamed from: t */
    private cnf m14735t(Intent intent) {
        cnf cmp = new cmp();
        cmp.m14460a(intent);
        return cmp;
    }

    /* renamed from: u */
    private cmq m14736u(Intent intent) {
        return new cmq(intent);
    }

    /* renamed from: v */
    private cne m14737v(Intent intent) {
        return new cne(intent);
    }

    /* renamed from: w */
    private cmw m14738w(Intent intent) {
        return new cmw(intent);
    }

    /* renamed from: x */
    private cmv m14739x(Intent intent) {
        cmv cmv = new cmv(intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
        cmv.m14460a(intent);
        return cmv;
    }

    /* renamed from: y */
    private cmu m14740y(Intent intent) {
        cmu cmu = new cmu(intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID), intent.getStringExtra("scope"));
        cmu.m14460a(intent);
        return cmu;
    }

    /* renamed from: z */
    private cni m14741z(Intent intent) {
        String stringExtra = intent.getStringExtra("path");
        String stringExtra2 = intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
        int intExtra = intent.getIntExtra(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, 1);
        int intExtra2 = intent.getIntExtra("priority", 0);
        String stringExtra3 = intent.getStringExtra("from");
        boolean booleanExtra = intent.getBooleanExtra("rlog_log_extra", false);
        String stringExtra4 = intent.getStringExtra("rlog_url");
        cni cni = new cni();
        cni.m14763a(stringExtra, stringExtra2, intExtra, stringExtra3, stringExtra4);
        cni.m14764a(booleanExtra);
        cni.m14461b(intExtra2);
        cni.m14460a(intent);
        return cni;
    }

    /* renamed from: A */
    private cnr m14707A(Intent intent) {
        int i = 0;
        String stringExtra = intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
        int intExtra = intent.getIntExtra("score", 0);
        String stringExtra2 = intent.getStringExtra("view");
        boolean booleanExtra = intent.getBooleanExtra("forced", true);
        if (stringExtra != null) {
            cij.m13687a().m13706a(new cks(stringExtra, intExtra, stringExtra2));
        }
        int i2 = cij.m13687a().m13733i();
        if (i2 < 10 && (!booleanExtra || i2 <= 0)) {
            return null;
        }
        cks[] j = cij.m13687a().m13735j();
        cnr cnr = new cnr();
        int length = j.length;
        while (i < length) {
            cks cks = j[i];
            cnr.m14830a(cks.f9608b, cks.f9611e, cks.f9609c);
            i++;
        }
        cnr.m14460a(intent);
        return cnr;
    }

    /* renamed from: B */
    private cnd m14708B(Intent intent) {
        int i = 0;
        String stringExtra = intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
        int intExtra = intent.getIntExtra("reason", 0);
        String stringExtra2 = intent.getStringExtra("view");
        boolean booleanExtra = intent.getBooleanExtra("forced", true);
        if (stringExtra != null) {
            cij.m13687a().m13705a(new ckq(stringExtra, intExtra, stringExtra2));
        }
        int k = cij.m13687a().m13736k();
        if (k < 10 && (!booleanExtra || k <= 0)) {
            return null;
        }
        ckq[] l = cij.m13687a().m13737l();
        cnd cnd = new cnd();
        int length = l.length;
        while (i < length) {
            ckq ckq = l[i];
            cnd.m14700a(ckq.f9599b, ckq.f9602e, ckq.f9600c);
            i++;
        }
        cnd.m14460a(intent);
        return cnd;
    }

    /* renamed from: C */
    private cmm m14709C(Intent intent) {
        String stringExtra = intent.getStringExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
        if (stringExtra == null) {
            return null;
        }
        cmm cmm = new cmm(stringExtra);
        cmm.m14460a(intent);
        return cmm;
    }

    /* renamed from: D */
    private cmy m14710D(Intent intent) {
        cmy cmy = new cmy();
        cmy.m14460a(intent);
        return cmy;
    }

    /* renamed from: E */
    private cmt m14711E(Intent intent) {
        cmt cmt = new cmt(intent.getIntExtra("type", 0));
        cmt.m14460a(intent);
        return cmt;
    }

    /* renamed from: F */
    private cmz m14712F(Intent intent) {
        cmz cmz = new cmz();
        cmz.m14460a(intent);
        if (intent.getBooleanExtra("use_account_id", true)) {
            cmz.m14671e(intent.getStringExtra("account_id"));
        } else {
            String stringExtra = intent.getStringExtra(AccessToken.USER_ID_KEY);
            String stringExtra2 = intent.getStringExtra("username");
            cmz.m14668c(stringExtra);
            cmz.m14670d(stringExtra2);
        }
        return cmz;
    }

    /* renamed from: G */
    private cnq m14713G(Intent intent) {
        return new cnq(intent.getStringExtra("oldPW"), intent.getStringExtra("newPW"), intent.getStringExtra("repeatPW"));
    }

    /* renamed from: H */
    private cmj m14714H(Intent intent) {
        return new cmj(intent.getIntExtra("type", 0), intent.getStringExtra("path"));
    }

    /* renamed from: I */
    private cnb m14715I(Intent intent) {
        cnb cnb = new cnb(intent.getStringExtra(AccessToken.USER_ID_KEY));
        cnb.m14460a(intent);
        return cnb;
    }

    /* renamed from: J */
    private cnl m14716J(Intent intent) {
        cnl cnl = new cnl();
        cnl.m14460a(intent);
        cnl.m14786a(intent.getStringExtra("id"), intent.getIntExtra("read_state", 0));
        return cnl;
    }

    /* renamed from: K */
    private cna m14717K(Intent intent) {
        cna cna = new cna();
        cna.m14460a(intent);
        return cna;
    }

    /* renamed from: L */
    private cnp m14718L(Intent intent) {
        cnp cnp = new cnp();
        cnp.m14460a(intent);
        return cnp;
    }

    /* renamed from: M */
    private cmk m14719M(Intent intent) {
        cmk cmk = new cmk();
        cmk.m14460a(intent);
        return cmk;
    }

    /* renamed from: N */
    private cnc m14720N(Intent intent) {
        return new cnc(intent.getStringExtra("package_name"), intent.getStringExtra("product_id"), intent.getStringExtra("token"));
    }

    /* renamed from: O */
    private cml m14721O(Intent intent) {
        cml cml;
        boolean booleanExtra = intent.getBooleanExtra("clear_all", false);
        boolean booleanExtra2 = intent.getBooleanExtra("tile_only", false);
        boolean booleanExtra3 = intent.getBooleanExtra("external", false);
        boolean booleanExtra4 = intent.getBooleanExtra("internal", false);
        if (booleanExtra3) {
            cml = new cml(booleanExtra, booleanExtra2, true);
        } else if (booleanExtra4) {
            cml = new cml(booleanExtra, booleanExtra2, false);
        } else {
            cml = new cml(booleanExtra, booleanExtra2);
        }
        cml.m14460a(intent);
        return cml;
    }
}
