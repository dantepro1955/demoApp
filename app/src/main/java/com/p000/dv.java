package com.p000;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel */
/* renamed from: dv */
public interface dv extends IInterface {

    /* compiled from: INotificationSideChannel */
    /* renamed from: dv$a */
    public static abstract class C5124a extends Binder implements dv {

        /* compiled from: INotificationSideChannel */
        /* renamed from: dv$a$a */
        static class C5123a implements dv {
            /* renamed from: a */
            private IBinder f23014a;

            C5123a(IBinder iBinder) {
                this.f23014a = iBinder;
            }

            public IBinder asBinder() {
                return this.f23014a;
            }

            /* renamed from: a */
            public void mo4654a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23014a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4653a(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f23014a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4652a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f23014a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static dv m29462a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof dv)) {
                return new C5123a(iBinder);
            }
            return (dv) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    Notification notification;
                    parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                    } else {
                        notification = null;
                    }
                    mo4654a(readString, readInt, readString2, notification);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                    mo4653a(parcel.readString(), parcel.readInt(), parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                    mo4652a(parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo4652a(String str) throws RemoteException;

    /* renamed from: a */
    void mo4653a(String str, int i, String str2) throws RemoteException;

    /* renamed from: a */
    void mo4654a(String str, int i, String str2, Notification notification) throws RemoteException;
}
