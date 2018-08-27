package com.p000;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.app.ui.fragments.dialogs.DeleteConfirmDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.DisableAllNotifConfirmDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.MoreActionDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.OverlayTitleDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.ReportReasonDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.share.ShareGagDialogFragmentV3;
import com.ninegag.android.app.ui.fragments.dialogs.support.SupportDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.upload.UploadDraftCancelConfirmDialogFragment;
import com.ninegag.android.app.ui.fragments.dialogs.upload.UploadQuotaExceededDialogFragment;
import p000.ctx.C4597a;

/* compiled from: AppDialogHelper */
/* renamed from: cnx */
public class cnx {
    /* renamed from: a */
    AppCompatActivity f9900a;

    public cnx(AppCompatActivity appCompatActivity) {
        this.f9900a = appCompatActivity;
    }

    /* renamed from: a */
    public void m14931a(String str, String str2, boolean z, String str3) {
        try {
            if (m14936c()) {
                DialogFragment a = MoreActionDialogFragment.a(str, str2, z);
                Bundle bundle = new Bundle();
                bundle.putString("scope", str);
                bundle.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
                bundle.putBoolean("is_owner", z);
                a.setArguments(bundle);
                a.show(m14932b(), str3);
                m14932b().executePendingTransactions();
            }
        } catch (Exception e) {
            chn.m13376a("showMoreActionDialog", e);
        }
    }

    /* renamed from: a */
    public void m14928a(String str) {
        try {
            if (m14936c()) {
                OverlayTitleDialogFragment.b(str).show(m14932b(), null);
                m14932b().executePendingTransactions();
            }
        } catch (Exception e) {
            chn.m13376a("showTitleDialog", e);
        }
    }

    /* renamed from: a */
    public void m14930a(String str, String str2, String str3) {
        try {
            if (m14936c()) {
                DialogFragment a = ShareGagDialogFragmentV3.a(str, str2);
                Bundle bundle = new Bundle();
                bundle.putString("scope", str);
                bundle.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
                a.setArguments(bundle);
                a.show(m14932b(), str3);
                m14932b().executePendingTransactions();
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m14929a(String str, String str2) {
        try {
            if (m14936c()) {
                DialogFragment reportReasonDialogFragment = new ReportReasonDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("scope", str);
                bundle.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
                reportReasonDialogFragment.setArguments(bundle);
                reportReasonDialogFragment.show(m14932b(), "report_post");
            }
        } catch (Exception e) {
            chn.m13376a("showReportPostDialog", e);
        }
    }

    /* renamed from: b */
    public void m14934b(String str, String str2) {
        try {
            if (m14936c()) {
                DialogFragment deleteConfirmDialogFragment = new DeleteConfirmDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("scope", str);
                bundle.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
                deleteConfirmDialogFragment.setArguments(bundle);
                deleteConfirmDialogFragment.show(m14932b(), "delete_post");
            }
        } catch (Exception e) {
            chn.m13376a("showDeletePostDialog", e);
        }
    }

    /* renamed from: b */
    public void m14933b(String str) {
        try {
            if (m14936c()) {
                DialogFragment disableAllNotifConfirmDialogFragment = new DisableAllNotifConfirmDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("scope", str);
                disableAllNotifConfirmDialogFragment.setArguments(bundle);
                disableAllNotifConfirmDialogFragment.show(m14932b(), "disable_all_notif");
            }
        } catch (Exception e) {
            chn.m13376a("showDisableAllNotifDialog", e);
        }
    }

    /* renamed from: c */
    public void m14935c(String str) {
        try {
            if (m14936c()) {
                C4597a c4597a = new C4597a();
                c4597a.b(true).a(true).c(false).d(caf.m12046a().m12087q().m14410s()).e(caf.m12046a().m12087q().m14404p());
                ctx ctx = new ctx(this.f9900a, c4597a);
                ctx.a(str);
                ctx.a();
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m14927a() {
        try {
            if (m14936c()) {
                caf.m12046a().m12084n();
                DialogFragment supportDialogFragment = new SupportDialogFragment();
                supportDialogFragment.setArguments(new Bundle());
                supportDialogFragment.show(m14932b(), null);
                m14932b().executePendingTransactions();
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: d */
    public void m14937d(String str) {
        try {
            if (m14936c()) {
                UploadQuotaExceededDialogFragment.b(str).show(m14932b(), null);
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: e */
    public void m14938e(String str) {
        try {
            if (m14936c()) {
                UploadDraftCancelConfirmDialogFragment.b(str).show(m14932b(), null);
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public FragmentManager m14932b() {
        return this.f9900a.getSupportFragmentManager();
    }

    /* renamed from: c */
    public boolean m14936c() {
        return (this.f9900a == null || this.f9900a.isFinishing()) ? false : true;
    }
}
