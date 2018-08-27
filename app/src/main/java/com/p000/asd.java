package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: asd */
public interface asd extends IInterface {

    /* renamed from: asd$a */
    public static abstract class C0768a extends Binder implements asd {

        /* renamed from: asd$a$a */
        static class C0767a implements asd {
            /* renamed from: a */
            private IBinder f4239a;

            C0767a(IBinder iBinder) {
                this.f4239a = iBinder;
            }

            /* renamed from: a */
            public void mo704a(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4239a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4239a;
            }
        }

        /* renamed from: a */
        public static asd m5464a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof asd)) ? new C0767a(iBinder) : (asd) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    mo704a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.api.internal.IStatusCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo704a(Status status) throws RemoteException;
}
