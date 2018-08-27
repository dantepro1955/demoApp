package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.List;

@TargetApi(21)
/* compiled from: MediaControllerCompatApi21 */
/* renamed from: gl */
public class gl {

    /* compiled from: MediaControllerCompatApi21 */
    /* renamed from: gl$a */
    public interface C5342a {
        /* renamed from: a */
        void m30447a();

        /* renamed from: a */
        void m30448a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void m30449a(Bundle bundle);

        /* renamed from: a */
        void m30450a(CharSequence charSequence);

        /* renamed from: a */
        void m30451a(Object obj);

        /* renamed from: a */
        void m30452a(String str, Bundle bundle);

        /* renamed from: a */
        void m30453a(List<?> list);

        /* renamed from: b */
        void m30454b(Object obj);
    }

    /* compiled from: MediaControllerCompatApi21 */
    /* renamed from: gl$b */
    static class C5343b<T extends C5342a> extends Callback {
        /* renamed from: a */
        protected final T f23747a;

        public C5343b(T t) {
            this.f23747a = t;
        }

        public void onSessionDestroyed() {
            this.f23747a.m30447a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f23747a.m30452a(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f23747a.m30451a((Object) playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f23747a.m30454b(mediaMetadata);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f23747a.m30453a((List) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f23747a.m30450a(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f23747a.m30449a(bundle);
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f23747a.m30448a(playbackInfo.getPlaybackType(), C5344c.m30457b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    /* compiled from: MediaControllerCompatApi21 */
    /* renamed from: gl$c */
    public static class C5344c {
        /* renamed from: a */
        public static AudioAttributes m30456a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m30457b(Object obj) {
            return C5344c.m30455a(C5344c.m30456a(obj));
        }

        /* renamed from: a */
        private static int m30455a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m30459a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static Object m30460a(C5342a c5342a) {
        return new C5343b(c5342a);
    }

    /* renamed from: a */
    public static void m30462a(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: a */
    public static Object m30458a(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: a */
    public static Object m30461a(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: a */
    public static void m30463a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
