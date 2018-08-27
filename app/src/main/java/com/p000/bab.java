package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bab */
public interface bab extends IInterface {

    /* renamed from: bab$a */
    public static abstract class C0940a extends Binder implements bab {

        /* renamed from: bab$a$a */
        static class C0954a implements bab {
            /* renamed from: a */
            private IBinder f5199a;

            C0954a(IBinder iBinder) {
                this.f5199a = iBinder;
            }

            /* renamed from: a */
            public long mo870a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    this.f5199a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5199a;
            }
        }

        /* renamed from: a */
        public static bab m6794a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bab)) ? new C0954a(iBinder) : (bab) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    long a = mo870a();
                    parcel2.writeNoException();
                    parcel2.writeLong(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    long mo870a() throws RemoteException;
}
