package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import com.facebook.internal.NativeProtocol;
import java.util.List;

@bhd
/* renamed from: bbp */
public class bbp implements axn {
    /* renamed from: a */
    private CustomTabsSession f5458a;
    /* renamed from: b */
    private CustomTabsClient f5459b;
    /* renamed from: c */
    private CustomTabsServiceConnection f5460c;
    /* renamed from: d */
    private C0994a f5461d;

    /* renamed from: bbp$a */
    public interface C0994a {
    }

    /* renamed from: a */
    public static boolean m7192a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(axl.m6366a(context));
            }
        }
        return false;
    }

    /* renamed from: a */
    public CustomTabsSession m7193a() {
        if (this.f5459b == null) {
            this.f5458a = null;
        } else if (this.f5458a == null) {
            this.f5458a = this.f5459b.newSession(null);
        }
        return this.f5458a;
    }

    /* renamed from: a */
    public void m7194a(Activity activity) {
        if (this.f5460c != null) {
            activity.unbindService(this.f5460c);
            this.f5459b = null;
            this.f5458a = null;
            this.f5460c = null;
        }
    }

    /* renamed from: a */
    public void m7195a(C0994a c0994a) {
        this.f5461d = c0994a;
    }

    /* renamed from: b */
    public void m7196b(Activity activity) {
        if (this.f5459b == null) {
            String a = axl.m6366a(activity);
            if (a != null) {
                this.f5460c = new axm(this);
                CustomTabsClient.bindCustomTabsService(activity, a, this.f5460c);
            }
        }
    }
}
