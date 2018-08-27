package com.p000;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bqf */
public interface bqf extends IInterface {

    /* renamed from: bqf$a */
    public static abstract class C0843a extends Binder implements bqf {

        /* renamed from: bqf$a$a */
        static class C1408a implements bqf {
            /* renamed from: a */
            private IBinder f7391a;

            C1408a(IBinder iBinder) {
                this.f7391a = iBinder;
            }

            /* renamed from: a */
            public void mo778a(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7391a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7391a;
            }
        }

        /* renamed from: a */
        public static bqf m5885a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bqf)) ? new C1408a(iBinder) : (bqf) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                    mo778a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.ILocationListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo778a(Location location) throws RemoteException;
}
