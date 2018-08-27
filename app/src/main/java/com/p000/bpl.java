package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpl */
public interface bpl extends IInterface {

    /* renamed from: bpl$a */
    public static abstract class C1395a extends Binder implements bpl {

        /* renamed from: bpl$a$a */
        static class C1399a implements bpl {
            /* renamed from: a */
            private IBinder f7372a;

            C1399a(IBinder iBinder) {
                this.f7372a = iBinder;
            }

            /* renamed from: a */
            public void mo1383a(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7372a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1384a(Status status, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f7372a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7372a;
            }

            /* renamed from: b */
            public void mo1385b(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7372a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1386b(Status status, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f7372a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1387c(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7372a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C1395a() {
            attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        }

        /* renamed from: a */
        public static bpl m10298a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bpl)) ? new C1399a(iBinder) : (bpl) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Status status = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1383a(status);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1385b(status);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1384a(status, parcel.readLong());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1387c(status);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1386b(status, parcel.readLong());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1383a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo1384a(Status status, long j) throws RemoteException;

    /* renamed from: b */
    void mo1385b(Status status) throws RemoteException;

    /* renamed from: b */
    void mo1386b(Status status, long j) throws RemoteException;

    /* renamed from: c */
    void mo1387c(Status status) throws RemoteException;
}
