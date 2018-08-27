package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ara */
public interface ara extends IInterface {

    /* renamed from: ara$a */
    public static abstract class C0717a extends Binder implements ara {

        /* renamed from: ara$a$a */
        static class C0716a implements ara {
            /* renamed from: a */
            private IBinder f3991a;

            C0716a(IBinder iBinder) {
                this.f3991a = iBinder;
            }

            /* renamed from: a */
            public void mo618a(Message message) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
                    if (message != null) {
                        obtain.writeInt(1);
                        message.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3991a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3991a;
            }
        }

        /* renamed from: a */
        public static ara m5022a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ara)) ? new C0716a(iBinder) : (ara) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                    mo618a(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo618a(Message message) throws RemoteException;
}
