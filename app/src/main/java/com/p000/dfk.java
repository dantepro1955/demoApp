package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.under9.android.feedback.api.model.ApiFeedbackType;
import com.under9.android.feedback.api.model.ApiGetFeedbackTypesResponse;
import com.under9.android.feedback.api.model.ApiPostFeedbackResponse;
import com.under9.android.feedback.otto.FeedbackTypesUpdatedEvent;
import com.under9.android.feedback.service.FeedbackService;
import com.under9.android.feedback.ui.dialogs.FeedbackRateDialog;
import com.under9.android.feedback.ui.dialogs.FeedbackRateOnStorePromptDialog;
import com.under9.android.feedback.ui.dialogs.FeedbackTypeChooserDialog;
import com.under9.android.feedback.ui.dialogs.GiveFeedbackDialog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: FeedbackController */
/* renamed from: dfk */
public class dfk {
    /* renamed from: a */
    private djt f21495a;

    /* compiled from: FeedbackController */
    /* renamed from: dfk$1 */
    class C48731 extends bvz<Map<String, ApiFeedbackType>> {
        /* renamed from: d */
        final /* synthetic */ dfk f21494d;

        C48731(dfk dfk) {
            this.f21494d = dfk;
        }
    }

    /* renamed from: a */
    public void m27014a(FragmentManager fragmentManager) {
        try {
            new FeedbackTypeChooserDialog().show(fragmentManager, null);
            fragmentManager.executePendingTransactions();
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public void m27016b(FragmentManager fragmentManager) {
        try {
            new FeedbackRateDialog().show(fragmentManager, null);
            fragmentManager.executePendingTransactions();
        } catch (Exception e) {
        }
    }

    /* renamed from: c */
    public void m27017c(FragmentManager fragmentManager) {
        try {
            new FeedbackRateOnStorePromptDialog().show(fragmentManager, null);
            fragmentManager.executePendingTransactions();
        } catch (Exception e) {
        }
    }

    /* renamed from: d */
    public void m27018d(FragmentManager fragmentManager) {
        try {
            new GiveFeedbackDialog().show(fragmentManager, null);
            fragmentManager.executePendingTransactions();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m27010a(Context context, dfd dfd) {
        try {
            String a = djm.m27593a(((ApiGetFeedbackTypesResponse) djm.m27592a(dfg.m26970a(dfd), ApiGetFeedbackTypesResponse.class)).payload.feedbackTypes);
            if (this.f21495a == null) {
                this.f21495a = new djt(context);
            }
            this.f21495a.m27622a("feedback-types", a);
            m27015a(dfd, a);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m27015a(dfd dfd, String str) {
        try {
            Map map = (Map) new bub().a(str, new C48731(this).b());
            if (map != null) {
                if (map.containsKey("1")) {
                    dfd.m26960d().m26964a(dfo.m27039a(((ApiFeedbackType) map.get("1")).reportTypes));
                }
                if (map.containsKey("2")) {
                    dfd.m26960d().m26966b(dfo.m27039a(((ApiFeedbackType) map.get("2")).reportTypes));
                }
                if (map.containsKey("3")) {
                    dfd.m26960d().m26968c(dfo.m27039a(((ApiFeedbackType) map.get("3")).reportTypes));
                }
                dhe.m27286c(new FeedbackTypesUpdatedEvent());
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m27011a(Context context, dfd dfd, String str, String[] strArr, Bundle bundle) {
        HashMap a = djb.m27563a(bundle, true);
        a.put("feedbackTypeId", str);
        a.put("appId", dfd.m26958b().m26980g());
        a.put("platformId", dfd.m26958b().m26982i());
        djn.m27596a(a, dfd.m26959c().m27029c(context));
        a.put("signature", dfo.m27037a(dfd, a));
        String str2 = ((ApiPostFeedbackResponse) djm.m27592a(dfg.m26974a(dfd, a), ApiPostFeedbackResponse.class)).feedbackId;
        for (String a2 : strArr) {
            try {
                dfg.m26972a(dfd, str2, a2);
            } catch (Exception e) {
            }
        }
        dgr b = dfd.m26958b().m26975b();
        if (b != null) {
            List c = b.m27231c();
            if (c != null) {
                dfg.m26973a(dfd, str2, c);
            }
        }
    }

    /* renamed from: a */
    public void m27013a(Context context, String str, Bundle bundle, String[] strArr) {
        Intent intent = new Intent(context, FeedbackService.class);
        intent.putExtra("command", 1);
        intent.putExtra("feedback_type", str);
        intent.putExtra("attachments", strArr);
        intent.putExtra("data", bundle);
        context.startService(intent);
    }

    /* renamed from: a */
    public void m27012a(Context context, String str) {
        Intent intent = new Intent(context, FeedbackService.class);
        intent.putExtra("command", 1);
        intent.putExtra("feedback_type", str);
        context.startService(intent);
    }
}
