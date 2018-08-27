package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;
import p000.bex.C1124a;

/* renamed from: azw */
public interface azw extends IInterface {

    /* renamed from: azw$a */
    public static abstract class C0946a extends Binder implements azw {

        /* renamed from: azw$a$a */
        static class C0945a implements azw {
            /* renamed from: a */
            private IBinder f5194a;

            C0945a(IBinder iBinder) {
                this.f5194a = iBinder;
            }

            /* renamed from: a */
            public IBinder mo876a(aqq aqq, String str, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f5194a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5194a;
            }
        }

        /* renamed from: a */
        public static azw m6815a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azw)) ? new C0945a(iBinder) : (azw) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    IBinder a = mo876a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo876a(aqq aqq, String str, bex bex, int i) throws RemoteException;
}
