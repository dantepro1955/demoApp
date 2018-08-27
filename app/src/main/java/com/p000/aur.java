package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aur */
public interface aur extends IInterface {

    /* renamed from: aur$a */
    public static abstract class C0837a extends Binder implements aur {

        /* renamed from: aur$a$a */
        static class C0836a implements aur {
            /* renamed from: a */
            private IBinder f4617a;

            C0836a(IBinder iBinder) {
                this.f4617a = iBinder;
            }

            /* renamed from: a */
            public void mo773a(LocationSettingsResult locationSettingsResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
                    if (locationSettingsResult != null) {
                        obtain.writeInt(1);
                        locationSettingsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4617a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4617a;
            }
        }

        /* renamed from: a */
        public static aur m5869a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aur)) ? new C0836a(iBinder) : (aur) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                    mo773a(parcel.readInt() != 0 ? (LocationSettingsResult) LocationSettingsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo773a(LocationSettingsResult locationSettingsResult) throws RemoteException;
}
