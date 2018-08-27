package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.under9.android.comments.service.TaskQueueService;

/* compiled from: TaskFactory */
/* renamed from: ded */
public class ded {
    /* renamed from: a */
    private Context f21343a;

    public ded(Context context) {
        this.f21343a = context;
    }

    /* renamed from: a */
    public deb m26753a(Intent intent) {
        if (intent == null) {
            return null;
        }
        switch (intent.getIntExtra(TaskQueueService.f19251a, -1)) {
            case 100:
                return m26747j(intent);
            case 101:
                return m26742e(intent);
            case 102:
                return m26743f(intent);
            case 103:
                return m26744g(intent);
            case 104:
                return m26746i(intent);
            case 105:
                return m26745h(intent);
            case 106:
                return m26749l(intent);
            case 110:
                return m26741d(intent);
            case 111:
                return m26739b(intent);
            case 112:
                return m26740c(intent);
            case 113:
                return m26752o(intent);
            case InterstitialErrorStatus.EXPIRED /*201*/:
                return m26748k(intent);
            case InterstitialErrorStatus.NOT_LOADED /*202*/:
                return m26751n(intent);
            case GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION /*300*/:
                return m26750m(intent);
            default:
                return null;
        }
    }

    /* renamed from: b */
    private deb m26739b(Intent intent) {
        deb ddp = new ddp(intent.getStringExtra("auth"), intent.getStringExtra("url"), intent.getStringExtra("comment_id"));
        ddp.m26635a(intent);
        return ddp;
    }

    /* renamed from: c */
    private deb m26740c(Intent intent) {
        deb ddz = new ddz(intent.getStringExtra("auth"), intent.getStringExtra("url"), intent.getStringExtra("comment_id"));
        ddz.m26635a(intent);
        return ddz;
    }

    /* renamed from: d */
    private deb m26741d(Intent intent) {
        deb ddm = new ddm(intent.getStringExtra("auth"), intent.getLongExtra("item_id", -1));
        ddm.m26635a(intent);
        return ddm;
    }

    /* renamed from: e */
    private deb m26742e(Intent intent) {
        deb ddx = new ddx(intent.getStringExtra("auth"), intent.getStringExtra("comment_id"));
        ddx.m26635a(intent);
        return ddx;
    }

    /* renamed from: f */
    private deb m26743f(Intent intent) {
        deb ddq = new ddq(intent.getStringExtra("auth"), intent.getStringExtra("comment_id"));
        ddq.m26635a(intent);
        return ddq;
    }

    /* renamed from: g */
    private deb m26744g(Intent intent) {
        deb def = new def(intent.getStringExtra("auth"), intent.getStringExtra("comment_id"));
        def.m26635a(intent);
        return def;
    }

    /* renamed from: h */
    private deb m26745h(Intent intent) {
        deb ddu = new ddu(intent.getStringExtra("auth"), intent.getStringExtra("comment_ids"), intent.getStringExtra("url"), intent.getIntExtra("order", 0));
        ddu.m26635a(intent);
        return ddu;
    }

    /* renamed from: i */
    private deb m26746i(Intent intent) {
        deb dds = new dds(intent.getStringExtra("auth"), intent.getStringExtra("url"), intent.getStringExtra("comment_ids"));
        dds.m26635a(intent);
        return dds;
    }

    /* renamed from: j */
    private deb m26747j(Intent intent) {
        String stringExtra = intent.getStringExtra("url");
        int intExtra = intent.getIntExtra("order", 0);
        int intExtra2 = intent.getIntExtra("count", 0);
        int intExtra3 = intent.getIntExtra("level", 0);
        String stringExtra2 = intent.getStringExtra("ref");
        deb ddt = new ddt(intent.getStringExtra("auth"), stringExtra, intExtra, intent.getStringExtra("comment_id"), intExtra2, intExtra3, intent.getBooleanExtra("clear_data", false), stringExtra2, intent.getStringExtra("parent_id"), intent.getStringExtra("after_id"));
        ddt.m26635a(intent);
        return ddt;
    }

    /* renamed from: k */
    private deb m26748k(Intent intent) {
        deb ddo = new ddo();
        ddo.m26635a(intent);
        return ddo;
    }

    /* renamed from: l */
    private deb m26749l(Intent intent) {
        deb ddy = new ddy(intent.getStringExtra("url"), intent.getIntExtra("order", 1), intent.getIntExtra("commentL1", 5), intent.getIntExtra("commentL2", 3));
        ddy.m26635a(intent);
        return ddy;
    }

    /* renamed from: m */
    private deb m26750m(Intent intent) {
        deb ddv = new ddv(intent.getStringExtra("auth"));
        ddv.m26635a(intent);
        return ddv;
    }

    /* renamed from: n */
    private deb m26751n(Intent intent) {
        deb deg = new deg(intent.getStringExtra("auth"), intent.getStringExtra("mediaPath"), intent.getStringExtra("url"));
        deg.m26635a(intent);
        return deg;
    }

    /* renamed from: o */
    private deb m26752o(Intent intent) {
        deb ddw = new ddw(intent.getStringExtra("auth"), intent.getStringExtra("url"), intent.getStringExtra("comment_id"));
        ddw.m26635a(intent);
        return ddw;
    }
}
