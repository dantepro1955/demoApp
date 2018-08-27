package com.p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.ninegag.android.app.R;
import java.util.List;

/* compiled from: DebugEventArrayAdapter */
/* renamed from: cad */
public class cad<T> extends ArrayAdapter<T> {
    /* renamed from: a */
    private Animation f8430a = AnimationUtils.loadAnimation(getContext(), 17432576);

    public cad(Context context, int i, List<T> list) {
        super(context, i, list);
        this.f8430a.setDuration(500);
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(R.id.simple_text_item);
        if (textView.getText().toString().startsWith("category")) {
            textView.setTextColor(-65536);
        } else if (textView.getText().toString().startsWith("screenName")) {
            textView.setTextColor(-16711936);
        }
        if (i == 3) {
            textView.startAnimation(this.f8430a);
        }
        textView.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ cad f8429b;

            public void onClick(View view) {
                new cqd(this.f8429b.getContext().getApplicationContext()).e();
            }
        });
        return view2;
    }
}
