package com.p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ninegag.android.app.R;

/* compiled from: PollingLeaderboardRenderer */
/* renamed from: cbw */
public class cbw extends cse<cbn> {

    /* compiled from: PollingLeaderboardRenderer */
    /* renamed from: cbw$a */
    public static class C1664a extends C0605t {
        public C1664a(View view) {
            super(view);
        }

        /* renamed from: a */
        public void m12395a(String str) {
            m12394a(R.id.languageNativeName, str);
        }

        /* renamed from: b */
        public void m12396b(String str) {
            m12394a(R.id.languageEnglishName, str);
        }

        /* renamed from: c */
        public void m12397c(String str) {
            m12394a(R.id.languagePoints, str);
        }

        /* renamed from: d */
        public void m12398d(String str) {
            m12394a(R.id.languagRanking, str);
        }

        /* renamed from: a */
        private void m12394a(int i, String str) {
            ((TextView) this.itemView.findViewById(i)).setText(str);
        }
    }

    /* renamed from: a */
    public C0605t m12399a(ViewGroup viewGroup, int i) {
        return new C1664a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.polling_leaderboard_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m12400a(C0605t c0605t, int i, cbn cbn) {
        C1664a c1664a = (C1664a) c0605t;
        Context context = caf.m12046a().f8449a;
        int s = cbn.m12296s();
        c1664a.m12395a(cbn.mo1639a());
        c1664a.m12396b(cbn.m12307b());
        c1664a.m12397c(String.format(djo.a(context, R.plurals.points_count, s), new Object[]{djo.a(s)}));
        c1664a.m12398d(Integer.toString(cbn.m12308c()));
    }
}
