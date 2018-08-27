package com.p000;

import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiUser;

/* compiled from: UserGagPostListRenderer */
/* renamed from: cfk */
public class cfk extends cdn {
    /* renamed from: d */
    private boolean f9035d;
    /* renamed from: e */
    private ApiUser f9036e;

    public cfk(cdl cdl, String str, com com, boolean z, ApiUser apiUser, boolean z2, cco cco) {
        super(str, com, z2, cco);
        this.f9035d = z;
        this.f9036e = apiUser;
    }

    /* renamed from: a */
    protected String mo1710a(String str) {
        int i;
        int i2 = -1;
        if (this.f9035d) {
            switch (str.hashCode()) {
                case -1495015618:
                    if (str.equals("commented")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case -894112266:
                    if (str.equals("uploaded and upvoted")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case -217389825:
                    if (str.equals("upvoted")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 148261588:
                    if (str.equals("upvoted and commented")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 1009747573:
                    if (str.equals("uploaded and commented")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1419717504:
                    if (str.equals("uploaded, upvoted and commented")) {
                        i2 = 6;
                        break;
                    }
                    break;
                case 1563991648:
                    if (str.equals("uploaded")) {
                        i2 = 0;
                        break;
                    }
                    break;
            }
            switch (i2) {
                case 0:
                    i2 = R.string.feed_action_uploaded;
                    break;
                case 1:
                    i2 = R.string.feed_action_upvoted;
                    break;
                case 2:
                    i2 = R.string.feed_action_commented;
                    break;
                case 3:
                    i2 = R.string.feed_action_uploaded_n_upvoted;
                    break;
                case 4:
                    i2 = R.string.feed_action_uploaded_n_commented;
                    break;
                case 5:
                    i2 = R.string.feed_action_upvoted_n_commented;
                    break;
                case 6:
                    i2 = R.string.feed_action_uploaded_n_upvoted_n_commented;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i = i2;
        } else if (this.f9036e != null) {
            switch (str.hashCode()) {
                case -1495015618:
                    if (str.equals("commented")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case -894112266:
                    if (str.equals("uploaded and upvoted")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case -217389825:
                    if (str.equals("upvoted")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 148261588:
                    if (str.equals("upvoted and commented")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 1009747573:
                    if (str.equals("uploaded and commented")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1419717504:
                    if (str.equals("uploaded, upvoted and commented")) {
                        i2 = 6;
                        break;
                    }
                    break;
                case 1563991648:
                    if (str.equals("uploaded")) {
                        i2 = 0;
                        break;
                    }
                    break;
            }
            switch (i2) {
                case 0:
                    i = R.string.feed_action_uploaded_with_name;
                    break;
                case 1:
                    i = R.string.feed_action_upvoted_with_name;
                    break;
                case 2:
                    i = R.string.feed_action_commented_with_name;
                    break;
                case 3:
                    i = R.string.feed_action_uploaded_n_upvoted_with_name;
                    break;
                case 4:
                    i = R.string.feed_action_uploaded_n_commented_with_name;
                    break;
                case 5:
                    i = R.string.feed_action_upvoted_n_commented_with_name;
                    break;
                case 6:
                    i = R.string.feed_action_uploaded_n_upvoted_n_commented_with_name;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            return str;
        }
        if (i == 0) {
            return str;
        }
        if (this.f9035d) {
            return String.format(djo.a(this.c.f8449a, i), new Object[]{""});
        }
        String str2;
        if (this.f9036e.loginName == null) {
            str2 = this.f9036e.userName;
        } else {
            str2 = this.f9036e.loginName;
        }
        return String.format(djo.a(this.c.f8449a, i), new Object[]{str2, ""});
    }
}
