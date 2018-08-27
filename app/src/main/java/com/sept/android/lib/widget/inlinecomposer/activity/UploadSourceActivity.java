package com.sept.android.lib.widget.inlinecomposer.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;
import java.io.File;
import p000.dfs;
import p000.djv;
import p000.dnb.C5003f;

public class UploadSourceActivity extends BaseUploadSourceActivity {
    private static final boolean DEBUG = false;
    public static final int REQUEST_IMAGE = 30000;
    private static final String TAG = "UploadSourceActivity";
    private static dfs sSFC;
    private static int sStorageState = 0;

    public void setContentView(int i) {
        super.setContentView(C5003f.transparent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        sSFC = null;
    }

    protected boolean canUpload() {
        return true;
    }

    protected static boolean isUsingExternalStorage() {
        if (sStorageState == 0) {
            sStorageState = djv.m27629a() ? 1 : -1;
        }
        if (sStorageState == 1) {
            return true;
        }
        return false;
    }

    public static dfs getSFC() {
        if (sSFC == null) {
            sSFC = new dfs(isUsingExternalStorage());
        }
        return sSFC;
    }

    protected String getUploadDirectoryPath() {
        getSFC().m27054a(getApplicationContext());
        return getSFC().m27058c(getApplicationContext());
    }

    protected String getTmpFilePath(int i) {
        return createTmpFile(getUploadDirectoryPath(), i);
    }

    public static String createTmpFile(String str, int i) {
        String str2 = "jpg";
        if (i == 2) {
            str2 = "gif";
        }
        if (i == 5) {
            str2 = "mp4";
        }
        return String.format("%s%s%s." + str2, new Object[]{str, File.separator, Long.valueOf(System.currentTimeMillis())});
    }

    protected Intent nextStepIntent() {
        return null;
    }

    public void onSelectedGallery() {
        super.onSelectedGallery();
    }

    public void onSelectedCapture() {
        super.onSelectedCapture();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public boolean onSelected3rdParty(String str) {
        boolean onSelected3rdParty = super.onSelected3rdParty(str);
        if (!onSelected3rdParty) {
            finish();
            Intent intent = new Intent();
            intent.setData(Uri.parse("market://details?id=" + str));
            try {
                startActivity(intent);
            } catch (Exception e) {
            }
        }
        return onSelected3rdParty;
    }
}
