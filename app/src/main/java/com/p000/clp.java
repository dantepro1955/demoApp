package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiNotifResponse.Item;
import com.ninegag.android.app.otto.noti.NotiUserClickEvent;
import com.ninegag.android.app.otto.noti.NotifItemClickEvent;
import com.under9.android.comments.model.CommentDao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: NotifItemWrapper */
/* renamed from: clp */
public class clp extends dgf {
    /* renamed from: a */
    private static caf f9681a = caf.m12046a();
    /* renamed from: o */
    private static final Pattern f9682o = Pattern.compile("\\[(.*?)\\]");
    /* renamed from: b */
    private ckp f9683b;
    /* renamed from: c */
    private Item f9684c;
    /* renamed from: d */
    private String f9685d;
    /* renamed from: e */
    private String f9686e;
    /* renamed from: f */
    private String f9687f;
    /* renamed from: g */
    private String f9688g;
    /* renamed from: h */
    private String f9689h;
    /* renamed from: i */
    private Bundle f9690i;
    /* renamed from: j */
    private Bundle f9691j;
    /* renamed from: k */
    private Spanned f9692k;
    /* renamed from: l */
    private String f9693l;
    /* renamed from: m */
    private int f9694m = m14324q();
    /* renamed from: n */
    private OnClickListener f9695n = new C17571(this);

    /* compiled from: NotifItemWrapper */
    /* renamed from: clp$1 */
    class C17571 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ clp f9679a;

        C17571(clp clp) {
            this.f9679a = clp;
        }

        public void onClick(View view) {
            if (view.getId() == R.id.container) {
                dhe.a().c(new NotifItemClickEvent(this.f9679a));
            }
        }
    }

    /* compiled from: NotifItemWrapper */
    /* renamed from: clp$a */
    static class C1758a extends ClickableSpan {
        /* renamed from: a */
        private String f9680a;

        public C1758a(String str) {
            this.f9680a = str;
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }

        public void onClick(View view) {
            TextView textView = (TextView) view;
            dhe.a().c(new NotiUserClickEvent(this.f9680a));
        }
    }

    public clp(Context context, ckp ckp) {
        this.f9683b = ckp;
        this.f9684c = (Item) djm.a(ckp.f9593e, Item.class);
        m14321d(context);
        m14322e(context);
    }

    /* renamed from: a */
    public String m14326a() {
        return this.f9683b.f9592d;
    }

    /* renamed from: b */
    public String m14328b() {
        return this.f9685d;
    }

    /* renamed from: c */
    public String m14329c() {
        return this.f9684c.post.commentSystem;
    }

    /* renamed from: d */
    public String m14331d() {
        return this.f9684c.suppData.highlightCommentId;
    }

    /* renamed from: e */
    public String m14332e() {
        return this.f9684c.type;
    }

    /* renamed from: f */
    public int m14333f() {
        String str = this.f9684c.type;
        if ("UPVOTE".equals(str)) {
            return 0;
        }
        if ("JOINED_APP".equals(str)) {
            return 1;
        }
        if ("FEATURED".equals(str)) {
            return 2;
        }
        if (CommentDao.TABLENAME.equals(str)) {
            return 3;
        }
        if ("COMMENT_REPLY".equals(str)) {
            return 4;
        }
        if ("COMMENT_UPVOTE".equals(str)) {
            return 5;
        }
        if ("COMMENT_MENTION".equals(str)) {
            return 6;
        }
        if ("MILESTONE_POST_UPVOTE".equals(str)) {
            return 7;
        }
        if ("MILESTONE_POST_COMMENT".equals(str)) {
            return 8;
        }
        if ("MILESTONE_COMMENT_UPVOTE".equals(str)) {
            return 9;
        }
        if ("MILESTONE_COMMENT_REPLY".equals(str)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: d */
    private void m14321d(Context context) {
        this.f9689h = null;
        this.f9687f = null;
        this.f9688g = null;
        this.f9686e = null;
        if (this.f9684c.users.length > 0) {
            this.f9688g = this.f9684c.users[0].avatarUrlSmall;
            this.f9686e = f9681a.m12073f().m13509c(context, this.f9688g);
        }
        if (cll.m14303a(this.f9684c.type)) {
            this.f9688g = this.f9684c.suppData.image;
            this.f9686e = f9681a.m12073f().m13509c(context, this.f9688g);
        }
        if (this.f9684c.post != null) {
            this.f9685d = this.f9684c.post.id;
            int i = this.f9684c.post.version;
            if (ApiGag.TYPE_VIDEO.equals(this.f9684c.post.type)) {
                this.f9689h = this.f9684c.post.imageUrlVideoPreview;
                this.f9687f = f9681a.m12073f().m13496a(context, this.f9685d, i);
            } else {
                try {
                    this.f9689h = this.f9684c.post.images.imageFbThumbnail.url;
                    this.f9687f = f9681a.m12073f().m13496a(context, this.f9685d, i);
                } catch (Exception e) {
                }
            }
        }
        this.f9690i = new Bundle();
        this.f9690i.putString("url", this.f9688g);
        this.f9690i.putString("path", this.f9686e);
        this.f9691j = new Bundle();
        this.f9691j.putString("url", this.f9689h);
        this.f9691j.putString("path", this.f9687f);
    }

    /* renamed from: e */
    private void m14322e(Context context) {
        this.f9692k = clo.m14311a(this.f9684c);
        m14323f(context);
    }

    /* renamed from: f */
    private void m14323f(Context context) {
        long j = 5;
        if (this.f9693l == null) {
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.f9684c.timestamp;
            if (currentTimeMillis >= 5) {
                j = currentTimeMillis;
            }
            if (context != null) {
                this.f9693l = ctn.c(context, j);
            }
        }
    }

    /* renamed from: a */
    public CharSequence m14325a(Context context) {
        Matcher matcher = f9682o.matcher(this.f9692k);
        CharSequence spannableStringBuilder = new SpannableStringBuilder(this.f9692k);
        int i = 0;
        while (matcher.find()) {
            m14320a(spannableStringBuilder, matcher.start(), matcher.end(), i, matcher.group(1));
            i++;
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public CharSequence m14327b(Context context) {
        m14323f(context);
        return this.f9693l == null ? "" : this.f9693l;
    }

    /* renamed from: g */
    public boolean m14334g() {
        if ("JOINED_APP".equals(this.f9683b.f9594f)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public String m14330c(Context context) {
        return this.f9684c.type;
    }

    /* renamed from: h */
    public OnClickListener m14335h() {
        return this.f9695n;
    }

    /* renamed from: i */
    public void m14336i() {
        this.f9683b.f9597i = ckp.f9591c;
    }

    /* renamed from: j */
    public boolean m14337j() {
        return this.f9683b.f9597i == ckp.f9591c;
    }

    /* renamed from: q */
    private int m14324q() {
        if ("JOINED_APP".equals(this.f9683b.f9594f)) {
            return R.drawable.morpheus_ic_people;
        }
        if (CommentDao.TABLENAME.equals(this.f9683b.f9594f) || "COMMENT_UPVOTE".equals(this.f9683b.f9594f) || "COMMENT_REPLY".equals(this.f9683b.f9594f)) {
            return R.drawable.morpheus_ic_comment;
        }
        return R.drawable.morpheus_ic_upvote;
    }

    /* renamed from: a */
    private void m14320a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, String str) {
        int i4 = i - (i3 * 2);
        int i5 = i2 - (i3 * 2);
        try {
            spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, 33);
            spannableStringBuilder.setSpan(new C1758a(str), i4, i5, 33);
            spannableStringBuilder.delete(i4, i4 + 1);
            spannableStringBuilder.delete((i5 - 1) - 1, i5 - 1);
        } catch (Exception e) {
        }
    }

    /* renamed from: k */
    public String m14338k() {
        String str = "";
        if (cll.m14303a(this.f9684c.type) || this.f9684c.users.length <= 0) {
            return str;
        }
        return this.f9684c.users[0].loginName;
    }

    /* renamed from: l */
    public String m14339l() {
        return this.f9688g;
    }

    /* renamed from: m */
    public String m14340m() {
        return this.f9689h;
    }

    /* renamed from: n */
    public String m14341n() {
        return this.f9686e;
    }

    /* renamed from: o */
    public Item m14342o() {
        return this.f9684c;
    }
}
