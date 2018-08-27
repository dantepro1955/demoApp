package com.p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

/* compiled from: IMediaControllerCallback */
/* renamed from: gj */
public interface gj extends IInterface {

    /* compiled from: IMediaControllerCallback */
    /* renamed from: gj$a */
    public static abstract class C5339a extends Binder implements gj {

        /* compiled from: IMediaControllerCallback */
        /* renamed from: gj$a$a */
        static class C5338a implements gj {
            /* renamed from: a */
            private IBinder f23745a;

            C5338a(IBinder iBinder) {
                this.f23745a = iBinder;
            }

            public IBinder asBinder() {
                return this.f23745a;
            }

            /* renamed from: a */
            public void mo4757a(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4750a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f23745a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4755a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4753a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4758a(List<QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f23745a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4756a(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4752a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4754a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23745a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4751a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f23745a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4759a(boolean z) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f23745a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C5339a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: a */
        public static gj m30357a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof gj)) {
                return new C5338a(iBinder);
            }
            return (gj) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ParcelableVolumeInfo parcelableVolumeInfo = null;
            Bundle bundle;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo4757a(readString, bundle);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo4750a();
                    return true;
                case 3:
                    PlaybackStateCompat playbackStateCompat;
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    mo4755a(playbackStateCompat);
                    return true;
                case 4:
                    MediaMetadataCompat mediaMetadataCompat;
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    mo4753a(mediaMetadataCompat);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo4758a(parcel.createTypedArrayList(QueueItem.CREATOR));
                    return true;
                case 6:
                    CharSequence charSequence;
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    mo4756a(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo4752a(bundle);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    mo4754a(parcelableVolumeInfo);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo4751a(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo4759a(parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo4750a() throws RemoteException;

    /* renamed from: a */
    void mo4751a(int i) throws RemoteException;

    /* renamed from: a */
    void mo4752a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo4753a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: a */
    void mo4754a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: a */
    void mo4755a(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: a */
    void mo4756a(CharSequence charSequence) throws RemoteException;

    /* renamed from: a */
    void mo4757a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo4758a(List<QueueItem> list) throws RemoteException;

    /* renamed from: a */
    void mo4759a(boolean z) throws RemoteException;
}
