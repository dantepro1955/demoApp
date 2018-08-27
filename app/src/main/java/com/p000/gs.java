package com.p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IResultReceiver */
/* renamed from: gs */
public interface gs extends IInterface {

    /* compiled from: IResultReceiver */
    /* renamed from: gs$a */
    public static abstract class C5348a extends Binder implements gs {

        /* compiled from: IResultReceiver */
        /* renamed from: gs$a$a */
        static class C5347a implements gs {
            /* renamed from: a */
            private IBinder f23748a;

            C5347a(IBinder iBinder) {
                this.f23748a = iBinder;
            }

            public IBinder asBinder() {
                return this.f23748a;
            }

            /* renamed from: a */
            public void mo4804a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23748a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C5348a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static gs m30486a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof gs)) {
                return new C5347a(iBinder);
            }
            return (gs) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    Bundle bundle;
                    parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    mo4804a(readInt, bundle);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.os.IResultReceiver");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo4804a(int i, Bundle bundle) throws RemoteException;
}
