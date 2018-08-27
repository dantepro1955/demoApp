package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bin.C1236a;

/* renamed from: biq */
public interface biq extends IInterface {

    /* renamed from: biq$a */
    public static abstract class C1077a extends Binder implements biq {

        /* renamed from: biq$a$a */
        static class C1244a implements biq {
            /* renamed from: a */
            private IBinder f6467a;

            C1244a(IBinder iBinder) {
                this.f6467a = iBinder;
            }

            /* renamed from: a */
            public void mo1009a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.f6467a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1010a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    obtain.writeInt(i);
                    this.f6467a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1011a(bin bin) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    obtain.writeStrongBinder(bin != null ? bin.asBinder() : null);
                    this.f6467a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6467a;
            }

            /* renamed from: b */
            public void mo1012b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.f6467a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1013c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.f6467a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo1014d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.f6467a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo1015e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.f6467a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1077a() {
            attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        }

        /* renamed from: a */
        public static biq m7656a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof biq)) ? new C1244a(iBinder) : (biq) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1009a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1012b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1013c();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1014d();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1011a(C1236a.m8673a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1015e();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    mo1010a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1009a() throws RemoteException;

    /* renamed from: a */
    void mo1010a(int i) throws RemoteException;

    /* renamed from: a */
    void mo1011a(bin bin) throws RemoteException;

    /* renamed from: b */
    void mo1012b() throws RemoteException;

    /* renamed from: c */
    void mo1013c() throws RemoteException;

    /* renamed from: d */
    void mo1014d() throws RemoteException;

    /* renamed from: e */
    void mo1015e() throws RemoteException;
}
