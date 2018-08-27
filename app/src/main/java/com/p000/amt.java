package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p000.ams.C0295a;

/* renamed from: amt */
public interface amt extends IInterface {

    /* renamed from: amt$a */
    public static abstract class C0311a extends Binder implements amt {

        /* renamed from: amt$a$a */
        static class C0310a implements amt {
            /* renamed from: a */
            private IBinder f2086a;

            C0310a(IBinder iBinder) {
                this.f2086a = iBinder;
            }

            /* renamed from: a */
            public void mo353a(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(ams != null ? ams.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2086a.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2086a;
            }

            /* renamed from: b */
            public void mo354b(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(ams != null ? ams.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2086a.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo355c(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(ams != null ? ams.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2086a.transact(103, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static amt m2740a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amt)) ? new C0310a(iBinder) : (amt) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            GoogleSignInOptions googleSignInOptions = null;
            ams a;
            switch (i) {
                case 101:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    a = C0295a.m2582a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    mo353a(a, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 102:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    a = C0295a.m2582a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    mo354b(a, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 103:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    a = C0295a.m2582a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    mo355c(a, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo353a(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException;

    /* renamed from: b */
    void mo354b(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException;

    /* renamed from: c */
    void mo355c(ams ams, GoogleSignInOptions googleSignInOptions) throws RemoteException;
}
