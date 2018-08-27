package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: btg */
public interface btg extends IInterface {

    /* renamed from: btg$a */
    public static abstract class C1467a extends Binder implements btg {

        /* renamed from: btg$a$a */
        static class C1466a implements btg {
            /* renamed from: a */
            private IBinder f7583a;

            C1466a(IBinder iBinder) {
                this.f7583a = iBinder;
            }

            /* renamed from: a */
            public final void mo1498a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f7583a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1499a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    obtain.writeString(str);
                    this.f7583a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1500a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f7583a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7583a;
            }

            /* renamed from: b */
            public final void mo1501b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f7583a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo1502c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f7583a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo1503d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f7583a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static btg m10854a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof btg)) ? new C1466a(iBinder) : (btg) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1499a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1500a(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1498a();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1501b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1502c();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    mo1503d();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1498a() throws RemoteException;

    /* renamed from: a */
    void mo1499a(String str) throws RemoteException;

    /* renamed from: a */
    void mo1500a(String str, int i) throws RemoteException;

    /* renamed from: b */
    void mo1501b() throws RemoteException;

    /* renamed from: c */
    void mo1502c() throws RemoteException;

    /* renamed from: d */
    void mo1503d() throws RemoteException;
}
