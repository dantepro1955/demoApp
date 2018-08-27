package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.model.api.ApiUploadMedia;
import com.under9.android.comments.otto.UploadMediaEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UploadMediaTask */
/* renamed from: deg */
public class deg extends ddn {
    /* renamed from: a */
    protected String f21344a = "";
    /* renamed from: b */
    protected String f21345b;
    /* renamed from: c */
    protected String f21346c = "";

    public deg(String str, String str2, String str3) {
        this.f21344a = str;
        this.f21345b = str2;
        this.f21346c = str3;
        if (m26645b()) {
            Log.d("UploadMediaTask", "UploadMediaTask() mAuthHash=" + this.f21344a);
        }
        if (m26645b()) {
            Log.d("UploadMediaTask", "UploadMediaTask() mMediaPath=" + this.f21345b);
        }
        if (m26645b()) {
            Log.d("UploadMediaTask", "UploadMediaTask() mUrl=" + this.f21346c);
        }
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        if (m26645b()) {
            Log.d("UploadMediaTask", "parseJson() result=" + str);
        }
        return (ApiResponse) djm.m27592a(str, ApiUploadMedia.class);
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/media.json";
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        Map hashMap = new HashMap();
        hashMap.put("auth", this.f21344a);
        hashMap.put("appId", dda.m26492a().m26526c());
        if (m26645b()) {
            Log.d("UploadMediaTask", "setupUrlRequest() auth=" + this.f21344a);
        }
        dft b = dft.m27074b(m26654i(context), hashMap, true);
        m26642a(b, context);
        File file = new File(this.f21345b);
        boolean exists = file.exists();
        if (m26645b()) {
            Log.d("UploadMediaTask", "setupUrlRequest() f.exists=" + exists + ", mMediaPath=" + this.f21345b);
        }
        if (exists) {
            b.m27088a("blob", this.f21345b.substring(this.f21345b.lastIndexOf(".")), file);
        }
        return b;
    }

    /* renamed from: a */
    private String m26760a(ApiUploadMedia apiUploadMedia) {
        if (apiUploadMedia.isError() || apiUploadMedia.payload == null || apiUploadMedia.payload.data == null) {
            return null;
        }
        return djm.m27593a(apiUploadMedia.payload.data.sourceMeta);
    }

    /* renamed from: b */
    private String m26761b(ApiUploadMedia apiUploadMedia) {
        if (apiUploadMedia.isError() || apiUploadMedia.payload == null || apiUploadMedia.payload.data == null) {
            return null;
        }
        return apiUploadMedia.payload.data.hash;
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
            ApiUploadMedia apiUploadMedia = (ApiUploadMedia) apiResponse;
            String a = m26760a(apiUploadMedia);
            String b = m26761b(apiUploadMedia);
            if (apiResponse.isError()) {
                dct.m26398a(this.f21346c, new UploadMediaEvent(this.f21345b, a, b, false, TextUtils.isEmpty(apiResponse.error) ? null : apiResponse.error));
            } else {
                dct.m26398a(this.f21346c, new UploadMediaEvent(this.f21345b, a, b, true));
            }
        }
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        dct.m26398a(this.f21346c, new UploadMediaEvent(this.f21345b, "", "", false, ""));
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
    }
}
