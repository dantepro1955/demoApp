package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzzm;
import p000.bpl.C1395a;

/* renamed from: bpm */
public interface bpm extends IInterface {

    /* renamed from: bpm$a */
    public static abstract class C1401a extends Binder implements bpm {

        /* renamed from: bpm$a$a */
        static class C1400a implements bpm {
            /* renamed from: a */
            private IBinder f7373a;

            C1400a(IBinder iBinder) {
                this.f7373a = iBinder;
            }

            /* renamed from: a */
            public void mo1389a(bpl bpl) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (bpl != null) {
                        iBinder = bpl.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7373a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1390a(bpl bpl, zzzm zzzm) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (bpl != null) {
                        iBinder = bpl.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (zzzm != null) {
                        obtain.writeInt(1);
                        zzzm.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7373a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7373a;
            }

            /* renamed from: b */
            public void mo1391b(bpl bpl) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (bpl != null) {
                        iBinder = bpl.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7373a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1392c(bpl bpl) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (bpl != null) {
                        iBinder = bpl.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7373a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo1393d(bpl bpl) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (bpl != null) {
                        iBinder = bpl.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7373a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static bpm m10342a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bpm)) ? new C1400a(iBinder) : (bpm) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    mo1390a(C1395a.m10298a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzzm) zzzm.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    mo1389a(C1395a.m10298a(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    mo1391b(C1395a.m10298a(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    mo1392c(C1395a.m10298a(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    mo1393d(C1395a.m10298a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1389a(bpl bpl) throws RemoteException;

    /* renamed from: a */
    void mo1390a(bpl bpl, zzzm zzzm) throws RemoteException;

    /* renamed from: b */
    void mo1391b(bpl bpl) throws RemoteException;

    /* renamed from: c */
    void mo1392c(bpl bpl) throws RemoteException;

    /* renamed from: d */
    void mo1393d(bpl bpl) throws RemoteException;
}
