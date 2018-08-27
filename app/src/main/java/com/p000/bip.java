package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;
import p000.bex.C1124a;

/* renamed from: bip */
public interface bip extends IInterface {

    /* renamed from: bip$a */
    public static abstract class C1243a extends Binder implements bip {

        /* renamed from: bip$a$a */
        static class C1242a implements bip {
            /* renamed from: a */
            private IBinder f6466a;

            C1242a(IBinder iBinder) {
                this.f6466a = iBinder;
            }

            /* renamed from: a */
            public IBinder mo1222a(aqq aqq, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f6466a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6466a;
            }
        }

        /* renamed from: a */
        public static bip m8742a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bip)) ? new C1242a(iBinder) : (bip) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    IBinder a = mo1222a(C0701a.m4966a(parcel.readStrongBinder()), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo1222a(aqq aqq, bex bex, int i) throws RemoteException;
}
