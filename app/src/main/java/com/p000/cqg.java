package com.p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.content.FileProvider;
import android.text.ClipboardManager;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.GraphResponse;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.ninegag.android.app.R;
import com.ninegag.android.app.ui.OverlayActivity;
import com.ninegag.android.app.ui.PostCommentsActivity;
import java.io.File;
import java.io.IOException;

/* compiled from: PostActionUtil */
/* renamed from: cqg */
public class cqg {
    /* renamed from: a */
    private static caf f19973a = caf.a();

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m24447a(Activity activity, cct cct) {
        cqg.m24448a(activity, cct.e());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m24448a(Activity activity, String str) {
        CharSequence format = String.format("http://9gag.com/gag/%s?ref=android", new Object[]{str});
        diu diu = new diu();
        if (activity instanceof OverlayActivity) {
            diu.m27495a(2, "TriggeredFrom", "Overlay");
        } else if (activity instanceof PostCommentsActivity) {
            diu.m27495a(2, "TriggeredFrom", "SinglePostWithCommentView");
        } else {
            diu.m27495a(2, "TriggeredFrom", "PostList");
        }
        diu.m27495a(3, "PostKey", str);
        chn.a("PostAction", "CopyLink", str, null, diu);
        chn.e(str, "copy_link");
        chn.i();
        if (VERSION.SDK_INT < 11) {
            ((ClipboardManager) activity.getSystemService("clipboard")).setText(format);
        } else {
            ((android.content.ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("9GAG", format));
        }
        if (activity != null && !activity.isFinishing()) {
            Toast.makeText(activity, R.string.post_action_copy_link_done, 1).show();
        }
    }

    /* renamed from: a */
    public static void m24449a(Activity activity, String str, cti cti, final cth cth) {
        cqg.m24446a(activity, (int) R.string.deleting_post);
        cth c45241 = new cth() {
            public void run() {
                chr.a().l(-1);
                if (cth != null) {
                    cth.m22514a(m22513a());
                    cth.run();
                    cth.m22515a(true);
                }
            }
        };
        cti.m24877a(c45241);
        chr.a().b(str, c45241.m22517c());
    }

    /* renamed from: b */
    public static void m24458b(final Activity activity, final cct cct) {
        String str = clt.f9698b[0];
        if (!bww.a() && activity != null) {
            final dhi a = dhj.m27298a((ViewGroup) activity.findViewById(16908290), R.string.permission_save_photo_never_asked, str);
            bww.a(new bxm(new bxo[]{new bxo() {
                /* renamed from: a */
                public void m24438a(bxi bxi) {
                    cqg.m24466f(activity, cct);
                }

                /* renamed from: a */
                public void m24437a(bxh bxh) {
                    a.m27297a(bxh);
                }

                /* renamed from: a */
                public void m24439a(bxj bxj, bxe bxe) {
                    bxe.a();
                }
            }}), str);
        }
    }

    /* renamed from: f */
    private static void m24466f(Activity activity, cct cct) {
        if (cqg.m24455a(cct.e(), cct.f())) {
            diu diu = new diu();
            if (activity instanceof OverlayActivity) {
                diu.m27495a(2, "TriggeredFrom", "Overlay");
            } else if (activity instanceof PostCommentsActivity) {
                diu.m27495a(2, "TriggeredFrom", "SinglePostWithCommentView");
            } else {
                diu.m27495a(2, "TriggeredFrom", "PostList");
            }
            diu.m27495a(3, "PostKey", cct.e());
            chn.a("PostAction", "Save", cct.e(), null, diu);
            chn.e(cct.e(), "save");
            chn.g();
            try {
                String a = cqg.m24444a(cct);
                cqg.m24459b(activity, activity.getString(R.string.post_action_save_photo_done_no_path));
                djl.m27585a((Context) activity, a);
                cqg.m24454a(activity, a, cct);
                return;
            } catch (IOException e) {
                cqg.m24446a(activity, (int) R.string.error_save_photo_fail);
                return;
            }
        }
        cqg.m24459b(activity, activity.getString(R.string.post_action_save_photo_downloading));
        f19973a.i().a(cct.e(), cct.v(), f19973a.d().f8408e, 2, -1);
    }

    /* renamed from: a */
    public static void m24451a(Context context, cct cct) {
        cqg.m24452a(context, cct, true, true);
    }

    /* renamed from: a */
    public static void m24452a(Context context, cct cct, boolean z, boolean z2) {
        if (cqg.m24455a(cct.e(), cct.f())) {
            try {
                String a = cqg.m24445a(cct, z2);
                djl.m27585a(context, a);
                if (z) {
                    cqg.m24454a(context, a, cct);
                }
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static String m24444a(cct cct) throws IOException {
        return cqg.m24445a(cct, true);
    }

    /* renamed from: a */
    public static String m24445a(cct cct, boolean z) throws IOException {
        String a = f19973a.f().a(f19973a.f8449a, cct.e(), cct.f(), f19973a.d().f8408e);
        String a2 = f19973a.f().a(f19973a.f8449a, djl.m27583a(cct.d()), cct.e(), "jpg");
        if (!z) {
            return a;
        }
        djl.m27587a(new File(a), new File(a2));
        return a2;
    }

    /* renamed from: b */
    private static String m24457b(cct cct) throws IOException {
        String b = f19973a.f().b(f19973a.f8449a, cct.e(), cct.f(), f19973a.d().f8408e);
        String a = f19973a.f().a(f19973a.f8449a, djl.m27583a(cct.d()), cct.e(), "mp4");
        djl.m27587a(new File(b), new File(a));
        return a;
    }

    /* renamed from: c */
    public static void m24463c(final Activity activity, final cct cct) {
        if (!bww.a()) {
            String str = clt.f9698b[0];
            if (activity != null) {
                final dhi a = dhj.m27298a((ViewGroup) activity.findViewById(16908290), R.string.permission_save_photo_never_asked, str);
                bww.a(new bxm(new bxo[]{new bxo() {
                    /* renamed from: a */
                    public void m24441a(bxi bxi) {
                        cqg.m24467g(activity, cct);
                    }

                    /* renamed from: a */
                    public void m24440a(bxh bxh) {
                        a.m27297a(bxh);
                    }

                    /* renamed from: a */
                    public void m24442a(bxj bxj, bxe bxe) {
                        bxe.a();
                    }
                }}), str);
            }
        }
    }

    /* renamed from: g */
    private static void m24467g(Activity activity, cct cct) {
        if (!f19973a.h().aO()) {
            f19973a.h().v(true);
            cqg.m24459b(activity, activity.getString(R.string.toast_gif_hints));
        }
        diu diu = new diu();
        if (activity instanceof OverlayActivity) {
            diu.m27495a(2, "TriggeredFrom", "Overlay");
        } else if (activity instanceof PostCommentsActivity) {
            diu.m27495a(2, "TriggeredFrom", "SinglePostWithCommentView");
        } else {
            diu.m27495a(2, "TriggeredFrom", "PostList");
        }
        diu.m27495a(3, "PostKey", cct.e());
        chn.a("PostAction", "Save", cct.e(), null, diu);
        chn.K("trigger");
        if (cqg.m24462b(cct.e(), cct.f())) {
            chn.h();
            try {
                String b = cqg.m24457b(cct);
                djl.m27585a((Context) activity, b);
                chn.K(GraphResponse.SUCCESS_KEY);
                cqg.m24450a((Context) activity, 0, b, cct);
                cqg.m24459b(activity, activity.getString(R.string.post_action_save_photo_done_no_path));
                return;
            } catch (IOException e) {
                cqg.m24446a(activity, (int) R.string.error_save_photo_fail);
                return;
            }
        }
        f19973a.i().a(cct.e(), f19973a.d().f8408e, 2, -1);
    }

    /* renamed from: b */
    public static void m24460b(Context context, cct cct) {
        if (cqg.m24462b(cct.e(), cct.f())) {
            try {
                djl.m27585a(context, cqg.m24457b(cct));
                chn.K(GraphResponse.SUCCESS_KEY);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private static void m24454a(final Context context, final String str, cct cct) {
        ImageRequest build;
        ckh D = cct.D();
        if (!cct.q() || D.f9533a == null || D.f9533a.f9529c == null) {
            build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(cct.v())).setLowestPermittedRequestLevel(RequestLevel.DISK_CACHE).build();
        } else {
            try {
                if (D.f9533a.f9529c[0] == null || D.f9533a.f9529c[0].f9530a == null) {
                    build = null;
                } else {
                    build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(D.f9533a.f9529c[0].f9530a)).setLowestPermittedRequestLevel(RequestLevel.DISK_CACHE).build();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                build = null;
            }
        }
        if (build != null) {
            Fresco.getImagePipeline().fetchDecodedImage(build, CallerThreadExecutor.getInstance()).subscribe(new BaseBitmapDataSubscriber() {
                protected void onNewResultImpl(Bitmap bitmap) {
                    cqe.m24426a(context, cqg.m24456b(context, new File(str)), bitmap);
                }

                protected void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                    cqe.m24426a(context, cqg.m24456b(context, new File(str)), null);
                }
            }, CallerThreadExecutor.getInstance());
        } else {
            cqe.m24426a(context, cqg.m24456b(context, new File(str)), null);
        }
    }

    /* renamed from: a */
    private static void m24450a(final Context context, int i, final String str, cct cct) {
        ImageRequest build;
        int i2 = f19973a.d().f8408e;
        String str2 = "";
        if (cip.a().ak()) {
            if (cct.C() != null) {
                build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(cct.C())).setLowestPermittedRequestLevel(RequestLevel.DISK_CACHE).build();
            }
            build = null;
        } else {
            if (cct.v() != null) {
                build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(cct.v())).setLowestPermittedRequestLevel(RequestLevel.DISK_CACHE).build();
            }
            build = null;
        }
        if (build != null) {
            Fresco.getImagePipeline().fetchDecodedImage(build, CallerThreadExecutor.getInstance()).subscribe(new BaseBitmapDataSubscriber() {
                protected void onNewResultImpl(Bitmap bitmap) {
                    cqe.m24426a(context, cqg.m24456b(context, new File(str)), bitmap);
                }

                protected void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                    cqe.m24426a(context, cqg.m24456b(context, new File(str)), null);
                }
            }, CallerThreadExecutor.getInstance());
        } else {
            cqe.m24426a(context, cqg.m24456b(context, new File(str)), null);
        }
    }

    /* renamed from: b */
    private static Uri m24456b(Context context, File file) {
        if (VERSION.SDK_INT >= 24) {
            return FileProvider.a(context, context.getApplicationContext().getPackageName() + ".fileprovider", file);
        }
        return Uri.fromFile(file);
    }

    /* renamed from: a */
    public static boolean m24455a(String str, int i) {
        return f19973a.f().b(str, i, f19973a.d().f8408e);
    }

    /* renamed from: b */
    public static boolean m24462b(String str, int i) {
        return f19973a.f().c(str, i, f19973a.d().f8408e).exists();
    }

    /* renamed from: a */
    public static void m24453a(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        chn.a(str, i);
        chr.a().a(str, i, str2, z, -1);
    }

    /* renamed from: b */
    public static void m24461b(Context context, String str, int i, String str2, boolean z, int i2, int i3) {
        chn.a(str, i);
        chr.a().a(str, i, str2, z, -1);
    }

    /* renamed from: b */
    private static void m24459b(Activity activity, String str) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    chn.b("PostActionHelper showToast", activity.toString());
                    Toast.makeText(activity, str, 1).show();
                }
            } catch (Exception e) {
                chn.a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m24446a(Activity activity, int i) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    chn.b("PostActionHelper showToast", activity.toString());
                    Toast.makeText(activity, i, 1).show();
                }
            } catch (Exception e) {
                chn.a(e);
            }
        }
    }
}
