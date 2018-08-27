package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.ads.AdError;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.share.internal.ShareConstants;
import com.facebook.stetho.server.http.HttpStatus;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.millennialmedia.android.MMSDK$Event;
import com.ninegag.android.app.service.ClearCacheService;
import com.ninegag.android.app.service.TaskQueueService;

/* compiled from: TaskQueueController */
/* renamed from: chr */
public class chr {
    /* renamed from: a */
    private static chr f9270a = new chr();
    /* renamed from: b */
    private static caf f9271b = caf.m12046a();
    /* renamed from: c */
    private Context f9272c;
    /* renamed from: d */
    private long f9273d = 0;

    /* renamed from: a */
    public static chr m13522a() {
        return f9270a;
    }

    private chr() {
    }

    /* renamed from: a */
    public void m13536a(Context context) {
        this.f9272c = context;
    }

    /* renamed from: a */
    public void m13543a(String str, long j) {
        long a = cqw.a();
        if (a - this.f9273d >= 2000) {
            if (cpm.a() || cpm.b()) {
                this.f9273d = a;
                Intent f = m13528f();
                f.putExtra("command", 112);
                f.putExtra("pushToken", str);
                f.putExtra("callback_key", j);
                m13524a(f);
            }
        }
    }

    /* renamed from: a */
    public void m13548a(String str, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 100);
        f.putExtra("data", str);
        f.putExtra("pushToken", str2);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13560b(String str, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 101);
        f.putExtra("data", str);
        f.putExtra("pushToken", str2);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13535a(long j) {
        Intent f = m13528f();
        f.putExtra("command", HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13555b(long j) {
        Intent f = m13528f();
        f.putExtra("command", HttpStatus.HTTP_NOT_IMPLEMENTED);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13566c(long j) {
        Intent f = m13528f();
        f.putExtra("command", 503);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: d */
    public void m13574d(long j) {
        Intent f = m13528f();
        f.putExtra("command", 113);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: e */
    public void m13578e(long j) {
        Intent f = m13528f();
        f.putExtra("command", 128);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13550a(String str, String str2, String str3, String str4) {
        m13551a(str, str2, str4, str3, 0);
    }

    /* renamed from: b */
    public void m13562b(String str, String str2, String str3, String str4) {
        m13551a(str, str2, str4, str3, 1);
    }

    /* renamed from: a */
    public void m13551a(String str, String str2, String str3, String str4, int i) {
        Intent f = m13528f();
        f.putExtra("command", 126);
        cne.m14704a(f, str, str2, str3, str4, i);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13534a(int i, String str, String str2, String str3) {
        m13523a(i, str, str2, str3, 0);
    }

    /* renamed from: b */
    public void m13554b(int i, String str, String str2, String str3) {
        m13523a(i, str, str2, str3, 1);
    }

    /* renamed from: a */
    private void m13523a(int i, String str, String str2, String str3, int i2) {
        Intent f = m13528f();
        f.putExtra("command", 119);
        cmq.m14598a(f, i, str, str2, str3, i2);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13565c(int i, String str, String str2, String str3) {
        m13526b(i, str, str2, str3, 0);
    }

    /* renamed from: d */
    public void m13573d(int i, String str, String str2, String str3) {
        Intent f = m13528f();
        f.putExtra("command", 119);
        f.putExtra("list_type", i);
        f.putExtra(AccessToken.USER_ID_KEY, str);
        f.putExtra("scope", str3);
        f.putExtra("type", 0);
        f.putExtra("list_key", str2);
        f.putExtra("limit", 40);
        m13524a(f);
    }

    /* renamed from: e */
    public void m13577e(int i, String str, String str2, String str3) {
        m13526b(i, str, str2, str3, 1);
    }

    /* renamed from: b */
    private void m13526b(int i, String str, String str2, String str3, int i2) {
        Intent f = m13528f();
        f.putExtra("command", 119);
        cmq.m14599b(f, i, str, str2, str3, i2);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13549a(String str, String str2, String str3) {
        m13525a(str, str2, str3, 0);
    }

    /* renamed from: b */
    public void m13561b(String str, String str2, String str3) {
        m13525a(str, str2, str3, 1);
    }

    /* renamed from: a */
    private void m13525a(String str, String str2, String str3, int i) {
        Intent f = m13528f();
        f.putExtra("command", 127);
        cmw.m14648a(f, str, str2, str3, i);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13544a(String str, String str2) {
        Intent f = m13528f();
        f.putExtra("command", 152);
        f.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        f.putExtra("scope", str2);
        m13524a(f);
    }

    @Deprecated
    /* renamed from: a */
    public void m13532a(int i, String str, long j) {
        Intent f = m13528f();
        f.putExtra("command", 115);
        f.putExtra("list_type", i);
        f.putExtra("group_id", str);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13541a(String str, int i, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 115);
        f.putExtra("scope", str);
        f.putExtra("list_type", i);
        f.putExtra("group_id", str2);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: f */
    public void m13580f(long j) {
        Intent f = m13528f();
        f.putExtra("command", 116);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13546a(String str, String str2, int i, int i2, long j) {
        m13545a(str, str2, i, i2, f9271b.m12068d().f8420q, f9271b.m12068d().f8419p, true, j);
    }

    /* renamed from: a */
    public void m13538a(String str, int i, int i2, long j) {
        m13539a(str, i, i2, true, false, true, j);
    }

    /* renamed from: a */
    public void m13545a(String str, String str2, int i, int i2, int i3, int i4, boolean z, long j) {
        Intent f = m13528f();
        f.putExtra("gag_id", str);
        f.putExtra("url", str2);
        f.putExtra("priority", i2);
        f.putExtra("src_size", i);
        f.putExtra("save_after", z);
        f.putExtra("send_notif_progress", true);
        f.putExtra("command", 102);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13539a(String str, int i, int i2, boolean z, boolean z2, boolean z3, long j) {
        Intent f = m13528f();
        f.putExtra("gag_id", str);
        f.putExtra("priority", i2);
        f.putExtra("src_size", i);
        f.putExtra("command", GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION);
        f.putExtra("callback_key", j);
        f.putExtra("save_after", z);
        f.putExtra("send_ui_progress", z2);
        f.putExtra("send_notif_progress", z3);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13547a(String str, String str2, int i, long j, Bundle bundle) {
        Intent f = m13528f();
        f.putExtra("url", str);
        f.putExtra("path", str2);
        f.putExtra("priority", i);
        f.putExtra("command", 104);
        f.putExtra("callback_key", j);
        if (bundle != null) {
            f.putExtras(bundle);
        }
        m13524a(f);
    }

    /* renamed from: a */
    public void m13542a(String str, int i, String str2, boolean z, long j) {
        Intent f = m13528f();
        f.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        f.putExtra("score", i);
        f.putExtra("view", str2);
        f.putExtra("forced", z);
        f.putExtra("command", 131);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13558b(String str, int i, String str2, boolean z, long j) {
        Intent f = m13528f();
        f.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        f.putExtra("reason", i);
        f.putExtra("view", str2);
        f.putExtra("forced", z);
        f.putExtra("command", 141);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13559b(String str, long j) {
        Intent f = m13528f();
        f.putExtra("command", 151);
        f.putExtra("callback_key", j);
        f.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13557b(String str, int i, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 125);
        f.putExtra("callback_key", j);
        f.putExtra(AccessToken.USER_ID_KEY, str);
        f.putExtra("install_timestamp", i);
        f.putExtra("push_token", str2);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13568c(String str, long j) {
        Intent f = m13528f();
        f.putExtra("command", 122);
        f.putExtra("callback_key", j);
        f.putExtra(MMSDK$Event.INTENT_EMAIL, str);
        m13524a(f);
    }

    /* renamed from: g */
    public void m13582g(long j) {
        Intent f = m13528f();
        f.putExtra("command", 107);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13533a(int i, String str, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 121);
        f.putExtra("callback_key", j);
        f.putExtra("bind", i);
        f.putExtra("platform", str);
        f.putExtra("token", str2);
        m13524a(f);
    }

    /* renamed from: h */
    public void m13584h(long j) {
        m13533a(0, "google-plus", null, j);
    }

    /* renamed from: i */
    public void m13585i(long j) {
        m13533a(0, "facebook", null, j);
    }

    /* renamed from: d */
    public void m13575d(String str, long j) {
        m13533a(1, "google-plus", str, j);
    }

    /* renamed from: e */
    public void m13579e(String str, long j) {
        m13533a(1, "facebook", str, j);
    }

    /* renamed from: f */
    public void m13581f(String str, long j) {
        Intent f = m13528f();
        f.putExtra("command", 109);
        f.putExtra("callback_key", j);
        f.putExtra(MMSDK$Event.INTENT_EMAIL, str);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13570c(String str, String str2, String str3) {
        Intent f = m13528f();
        f.putExtra("command", 700);
        f.putExtra("callback_key", -1);
        f.putExtra("oldPW", str);
        f.putExtra("newPW", str2);
        f.putExtra("repeatPW", str3);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13553b() {
        m13529a(1);
    }

    /* renamed from: c */
    public void m13564c() {
        m13529a(0);
    }

    /* renamed from: a */
    public void m13537a(String str) {
        m13531a(2, str);
    }

    /* renamed from: a */
    public void m13529a(int i) {
        m13531a(i, null);
    }

    /* renamed from: a */
    public void m13531a(int i, String str) {
        Intent f = m13528f();
        f.putExtra("command", 701);
        f.putExtra("callback_key", -1);
        f.putExtra("type", i);
        f.putExtra("path", str);
        m13524a(f);
    }

    /* renamed from: j */
    public void m13586j(long j) {
        Intent f = m13528f();
        f.putExtra("command", 123);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: k */
    public void m13587k(long j) {
        Intent f = m13528f();
        f.putExtra("command", 124);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: l */
    public void m13588l(long j) {
        Intent f = m13528f();
        f.putExtra("command", HttpStatus.HTTP_OK);
        f.putExtra("callback_key", j);
        m13524a(f);
    }

    /* renamed from: m */
    public void m13589m(long j) {
        m13530a(1, j);
    }

    /* renamed from: n */
    public void m13590n(long j) {
        m13530a(0, j);
    }

    /* renamed from: a */
    public void m13530a(int i, long j) {
        Intent f = m13528f();
        f.putExtra("command", InterstitialErrorStatus.NOT_LOADED);
        f.putExtra("callback_key", j);
        f.putExtra("type", i);
        m13524a(f);
    }

    /* renamed from: a */
    public void m13540a(String str, int i, long j) {
        Intent f = m13528f();
        f.putExtra("command", InterstitialErrorStatus.ALREADY_LOADED);
        f.putExtra("callback_key", j);
        f.putExtra("id", str);
        f.putExtra("read_state", i);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13569c(String str, String str2, long j) {
        Intent f = m13528f();
        f.putExtra("command", 118);
        f.putExtra("callback_key", j);
        f.putExtra(AccessToken.USER_ID_KEY, str);
        f.putExtra("username", str2);
        f.putExtra("use_account_id", false);
        m13524a(f);
    }

    /* renamed from: g */
    public void m13583g(String str, long j) {
        Intent f = m13528f();
        f.putExtra("command", 118);
        f.putExtra("callback_key", j);
        f.putExtra("account_id", str);
        f.putExtra("use_account_id", true);
        m13524a(f);
    }

    /* renamed from: b */
    public void m13556b(String str) {
        Intent f = m13528f();
        f.putExtra("command", 400);
        f.putExtra("gag_id", str);
        m13524a(f);
    }

    /* renamed from: c */
    public void m13567c(String str) {
        Intent f = m13528f();
        f.putExtra("command", 401);
        f.putExtra("gag_id", str);
        m13524a(f);
    }

    /* renamed from: d */
    public void m13572d() {
        Intent e = m13527e();
        e.putExtra("callback_key", -1);
        e.putExtra("command", 997);
        m13524a(e);
    }

    /* renamed from: a */
    public void m13552a(boolean z, long j) {
        Intent e = m13527e();
        e.putExtra("callback_key", j);
        e.putExtra("command", 998);
        e.putExtra("clear_all", z);
        m13524a(e);
    }

    /* renamed from: b */
    public void m13563b(boolean z, long j) {
        Intent e = m13527e();
        e.putExtra("callback_key", j);
        e.putExtra("command", 998);
        e.putExtra("clear_all", z);
        e.putExtra("external", true);
        m13524a(e);
    }

    /* renamed from: c */
    public void m13571c(boolean z, long j) {
        Intent e = m13527e();
        e.putExtra("callback_key", j);
        e.putExtra("command", 998);
        e.putExtra("clear_all", z);
        e.putExtra("internal", true);
        m13524a(e);
    }

    /* renamed from: d */
    public void m13576d(String str, String str2, String str3) {
        Intent f = m13528f();
        f.putExtra("command", AdError.SERVER_ERROR_CODE);
        f.putExtra("package_name", str);
        f.putExtra("product_id", str2);
        f.putExtra("token", str3);
        m13524a(f);
    }

    /* renamed from: e */
    private Intent m13527e() {
        return new Intent(this.f9272c, ClearCacheService.class);
    }

    /* renamed from: f */
    private Intent m13528f() {
        return new Intent(this.f9272c, TaskQueueService.class);
    }

    /* renamed from: a */
    private void m13524a(Intent intent) {
        try {
            this.f9272c.startService(intent);
        } catch (Exception e) {
        }
    }
}
