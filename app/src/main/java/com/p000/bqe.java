package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: bqe */
public interface bqe extends IInterface {

    /* renamed from: bqe$a */
    public static abstract class C0840a extends Binder implements bqe {

        /* renamed from: bqe$a$a */
        static class C1407a implements bqe {
            /* renamed from: a */
            private IBinder f7390a;

            C1407a(IBinder iBinder) {
                this.f7390a = iBinder;
            }

            /* renamed from: a */
            public void mo776a(LocationAvailability locationAvailability) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (locationAvailability != null) {
                        obtain.writeInt(1);
                        locationAvailability.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7390a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo777a(LocationResult locationResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (locationResult != null) {
                        obtain.writeInt(1);
                        locationResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7390a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7390a;
            }
        }

        /* renamed from: a */
        public static bqe m5878a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bqe)) ? new C1407a(iBinder) : (bqe) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            LocationAvailability locationAvailability = null;
            switch (i) {
                case 1:
                    LocationResult locationResult;
                    parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if (parcel.readInt() != 0) {
                        locationResult = (LocationResult) LocationResult.CREATOR.createFromParcel(parcel);
                    }
                    mo777a(locationResult);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if (parcel.readInt() != 0) {
                        locationAvailability = (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(parcel);
                    }
                    mo776a(locationAvailability);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.ILocationCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo776a(LocationAvailability locationAvailability) throws RemoteException;

    /* renamed from: a */
    void mo777a(LocationResult locationResult) throws RemoteException;
}
