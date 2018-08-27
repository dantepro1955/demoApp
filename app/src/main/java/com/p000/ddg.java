package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.User;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.otto.DeleteCommentDoneEvent;
import com.under9.android.comments.otto.DeleteCommentEvent;
import com.under9.android.comments.otto.HideCommentEvent;
import com.under9.android.comments.otto.ReportCommentDoneEvent;
import com.under9.android.comments.otto.ReportCommentEvent;
import com.under9.android.comments.ui.fragment.dialog.BaseConfirmDialogFragment.C4414a;
import com.under9.android.comments.ui.fragment.dialog.CommentMediaSourceDialogFragment;
import com.under9.android.comments.ui.fragment.dialog.DeleteConfirmDialogFragment;
import com.under9.android.comments.ui.fragment.dialog.HideConfirmDialogFragment;
import com.under9.android.comments.ui.fragment.dialog.ReportConfirmDialogFragment;

/* compiled from: CommentActionHelper */
/* renamed from: ddg */
public class ddg {
    /* renamed from: a */
    public static void m26593a(Context context, FragmentManager fragmentManager, dcz dcz, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("comment_system_action");
            if ("like".equals(string)) {
                ddg.m26595a(dcz, bundle.getString("comment_id"), bundle.getString("scope"));
            } else if ("unlike".equals(string)) {
                ddg.m26599b(dcz, bundle.getString("comment_id"), bundle.getString("scope"));
            } else if ("dislike".equals(string)) {
                ddg.m26604c(dcz, bundle.getString("comment_id"), bundle.getString("scope"));
            } else if ("delete".equals(string)) {
                ddg.m26600b(context, fragmentManager, dcz, bundle.getString("url"), bundle.getString("comment_id"), bundle.getString("scope"));
            } else if ("report".equals(string)) {
                ddg.m26596a(context, fragmentManager, dcz, bundle.getString("url"), bundle.getString("comment_id"), bundle.getString("scope"));
            } else if ("hide".equals(string)) {
                ddg.m26605c(context, fragmentManager, dcz, bundle.getString("url"), bundle.getString("comment_id"), bundle.getString("scope"));
            }
        }
    }

    /* renamed from: a */
    public static String m26592a(String str) {
        Comment f = dda.m26492a().m26542f(str);
        if (f == null) {
            return "";
        }
        if (TextUtils.isEmpty(f.m23476r())) {
            return f.m23434b() + "#cs_comment_id=" + f.m23439c();
        }
        return f.m23476r();
    }

    /* renamed from: a */
    public static Bundle m26591a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("comment_system_action", "like");
        bundle.putString("comment_id", str);
        bundle.putString("scope", str2);
        bundle.putString("login_referrer_type", "comment-upvote");
        bundle.putString("login_referrer_object_id", str);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m26598b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("comment_system_action", "dislike");
        bundle.putString("comment_id", str);
        bundle.putString("scope", str2);
        bundle.putString("login_referrer_type", "comment-downvote");
        bundle.putString("login_referrer_object_id", str);
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m26603c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("comment_system_action", "unlike");
        bundle.putString("comment_id", str);
        bundle.putString("scope", str2);
        bundle.putString("login_referrer_type", "comment-unvote");
        bundle.putString("login_referrer_object_id", str);
        return bundle;
    }

    /* renamed from: a */
    public static void m26595a(dcz dcz, final String str, String str2) {
        if (dda.m26492a().m26553j() || dct.m26395a().m26410f()) {
            ddc.m26576e("upvote");
            dda.m26492a().m26509a(new Runnable() {
                public void run() {
                    dda.m26492a().m26524b(str);
                }
            });
            dcz.m26472a(str, null);
            return;
        }
        dct.m26397a(ddg.m26591a(str, str2));
    }

    /* renamed from: b */
    public static void m26599b(dcz dcz, final String str, String str2) {
        if (dda.m26492a().m26553j() || dct.m26395a().m26410f()) {
            dda.m26492a().m26509a(new Runnable() {
                public void run() {
                    dda.m26492a().m26534d(str);
                }
            });
            dcz.m26480c(str, null);
            return;
        }
        dct.m26397a(ddg.m26603c(str, str2));
    }

    /* renamed from: c */
    public static void m26604c(dcz dcz, final String str, String str2) {
        if (dda.m26492a().m26553j() || dct.m26395a().m26410f()) {
            ddc.m26576e("downvote");
            dda.m26492a().m26509a(new Runnable() {
                public void run() {
                    dda.m26492a().m26529c(str);
                }
            });
            dcz.m26478b(str, null);
            return;
        }
        dct.m26397a(ddg.m26598b(str, str2));
    }

    /* renamed from: a */
    public static boolean m26596a(Context context, FragmentManager fragmentManager, final dcz dcz, final String str, final String str2, String str3) {
        if (dct.m26395a().m26410f()) {
            ReportConfirmDialogFragment a = ReportConfirmDialogFragment.m23771a(str2);
            a.show(fragmentManager, "report");
            a.m23728a(new C4414a() {

                /* compiled from: CommentActionHelper */
                /* renamed from: ddg$4$1 */
                class C48181 extends dec {
                    /* renamed from: a */
                    final /* synthetic */ C48194 f21236a;

                    C48181(C48194 c48194) {
                        this.f21236a = c48194;
                    }

                    /* renamed from: a */
                    public void mo3773a(Intent intent) {
                        dct.m26398a(str, new ReportCommentDoneEvent(str2));
                    }
                }

                /* renamed from: a */
                public void mo4327a() {
                    try {
                        dct.m26398a(str, new ReportCommentEvent(str2));
                        ddc.m26576e("report");
                        dda.m26492a().m26539e(str2);
                        dcz.m26479b(str, str2, new C48181(this));
                    } catch (Exception e) {
                    }
                }
            });
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("comment_system_action", "report");
        bundle.putString("url", str);
        bundle.putString("scope", str3);
        bundle.putString("comment_id", str2);
        bundle.putString("login_referrer_type", "comment-report");
        bundle.putString("login_referrer_object_id", str2);
        dct.m26397a(bundle);
        return false;
    }

    /* renamed from: b */
    public static boolean m26602b(String str) {
        Comment f = dda.m26492a().m26542f(str);
        User f2 = dda.m26492a().m26543f();
        if (f2 == null || !ddg.m26601b(f, f2.m23630b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26600b(Context context, FragmentManager fragmentManager, final dcz dcz, final String str, final String str2, String str3) {
        if (dct.m26395a().m26410f()) {
            DeleteConfirmDialogFragment a = DeleteConfirmDialogFragment.m23734a(str2);
            a.show(fragmentManager, "delete");
            a.m23728a(new C4414a() {

                /* compiled from: CommentActionHelper */
                /* renamed from: ddg$5$1 */
                class C48201 extends dec {
                    /* renamed from: a */
                    final /* synthetic */ C48215 f21240a;

                    C48201(C48215 c48215) {
                        this.f21240a = c48215;
                    }

                    /* renamed from: a */
                    public void mo3773a(Intent intent) {
                        dct.m26398a(str, new DeleteCommentDoneEvent(str2));
                    }
                }

                /* renamed from: a */
                public void mo4327a() {
                    try {
                        Comment f = dda.m26492a().m26542f(str2);
                        User f2 = dda.m26492a().m26543f();
                        if (f2 != null && ddg.m26601b(f, f2.m23630b())) {
                            ddc.m26576e("delete");
                            dda.m26492a().m26539e(str2);
                            dcz.m26481c(str, str2, new C48201(this));
                        }
                        dct.m26398a(str, new DeleteCommentEvent(str2));
                    } catch (Exception e) {
                    }
                }
            });
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("comment_system_action", "delete");
            bundle.putString("url", str);
            bundle.putString("comment_id", str2);
            bundle.putString("scope", str3);
            dct.m26397a(bundle);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m26605c(Context context, FragmentManager fragmentManager, final dcz dcz, final String str, final String str2, String str3) {
        if (dct.m26395a().m26410f()) {
            HideConfirmDialogFragment a = HideConfirmDialogFragment.m23737a(str2);
            a.show(fragmentManager, "hide");
            a.m23728a(new C4414a() {

                /* compiled from: CommentActionHelper */
                /* renamed from: ddg$6$1 */
                class C48221 extends dec {
                    /* renamed from: a */
                    final /* synthetic */ C48236 f21244a;

                    C48221(C48236 c48236) {
                        this.f21244a = c48236;
                    }

                    /* renamed from: a */
                    public void mo3773a(Intent intent) {
                        dct.m26398a(str, new HideCommentEvent(str2));
                    }
                }

                /* renamed from: a */
                public void mo4327a() {
                    try {
                        if (dda.m26492a().m26543f() != null) {
                            ddc.m26576e("hide");
                            dda.m26492a().m26539e(str2);
                            dcz.m26483d(str, str2, new C48221(this));
                        }
                        dct.m26398a(str, new HideCommentEvent(str2));
                    } catch (Exception e) {
                    }
                }
            });
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("comment_system_action", "hide");
            bundle.putString("url", str);
            bundle.putString("comment_id", str2);
            bundle.putString("scope", str3);
            dct.m26397a(bundle);
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m26601b(Comment comment, String str) {
        if (!CommentWrapper.isCommentCreator(comment, str)) {
            return false;
        }
        for (Comment b : comment.m23422G()) {
            if (!ddg.m26601b(b, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m26594a(FragmentManager fragmentManager, String str) {
        try {
            CommentMediaSourceDialogFragment.m23733a(str).show(fragmentManager, "Comment Image Source");
        } catch (Exception e) {
        }
    }
}
