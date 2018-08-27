package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzarz;

/* renamed from: auo */
public interface auo extends IInterface {

    /* renamed from: auo$a */
    public static abstract class C0831a extends Binder implements auo {

        /* renamed from: auo$a$a */
        static class C0830a implements auo {
            /* renamed from: a */
            private IBinder f4614a;

            C0830a(IBinder iBinder) {
                this.f4614a = iBinder;
            }

            /* renamed from: a */
            public void mo736a(zzarz zzarz) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    if (zzarz != null) {
                        obtain.writeInt(1);
                        zzarz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4614a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4614a;
            }
        }

        /* renamed from: a */
        public static auo m5792a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof auo)) ? new C0830a(iBinder) : (auo) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    mo736a(parcel.readInt() != 0 ? (zzarz) zzarz.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo736a(zzarz zzarz) throws RemoteException;
}
