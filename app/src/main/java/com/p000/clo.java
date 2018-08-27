package com.p000;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.Log;
import com.ninegag.android.app.model.api.ApiNotifResponse.Item;
import com.under9.android.comments.model.CommentDao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GagNotifHelper */
/* renamed from: clo */
public class clo {
    /* renamed from: a */
    private static caf f9677a = caf.m12046a();
    /* renamed from: b */
    private static final Pattern f9678b = Pattern.compile("\\[(.*?)\\]");

    /* renamed from: a */
    public static void m14313a(Context context) {
        if (context != null && f9677a.m12094x().m12104c()) {
            chr.m13522a().m13590n(-1);
        }
    }

    /* renamed from: b */
    public static void m14317b(Context context) {
        if (context != null && f9677a.m12094x().m12104c()) {
            chr.m13522a().m13589m(-1);
        }
    }

    /* renamed from: a */
    public static void m14315a(String str) {
        clo.m14316a(str, ckp.f9591c);
    }

    /* renamed from: a */
    public static void m14316a(String str, int i) {
        cij.m13687a().m13708a(str, i);
        chr.m13522a().m13540a(str, i, -1);
    }

    /* renamed from: b */
    public static boolean m14318b(String str) {
        return CommentDao.TABLENAME.equals(str) || "COMMENT_REPLY".equals(str) || "COMMENT_MENTION".equals(str) || "COMMENT_UPVOTE".equals(str);
    }

    /* renamed from: c */
    public static boolean m14319c(String str) {
        return "JOINED_APP".equals(str);
    }

    /* renamed from: a */
    public static Spanned m14311a(Item item) {
        return Html.fromHtml(item.wrapMessage == null ? "" : item.wrapMessage);
    }

    /* renamed from: a */
    public static CharSequence m14312a(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        Matcher matcher = f9678b.matcher(spannableStringBuilder.toString());
        while (matcher.find()) {
            int start = matcher.start() - (i * 2);
            int end = matcher.end() - (i * 2);
            try {
                spannableStringBuilder.setSpan(new StyleSpan(1), start, end, 33);
                spannableStringBuilder.delete(start, start + 1);
                spannableStringBuilder.delete((end - 1) - 1, end - 1);
                i++;
            } catch (Exception e) {
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static void m14314a(Context context, int i) {
        try {
            dcl.a(context, i);
        } catch (Throwable e) {
            chn.m13423j(e.getMessage() + "\n" + Log.getStackTraceString(e));
        }
    }
}
