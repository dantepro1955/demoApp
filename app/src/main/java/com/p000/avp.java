package com.p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.internal.zzban;
import com.google.android.gms.internal.zzbar;
import com.google.android.gms.internal.zzbau;
import p000.ape.C0657a;
import p000.apj.C0688a;
import p000.avo.C0749a;

/* renamed from: avp */
public interface avp extends IInterface {

    /* renamed from: avp$a */
    public static abstract class C0854a extends Binder implements avp {

        /* renamed from: avp$a$a */
        static class C0853a implements avp {
            /* renamed from: a */
            private IBinder f4684a;

            C0853a(IBinder iBinder) {
                this.f4684a = iBinder;
            }

            /* renamed from: a */
            public void mo786a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    this.f4684a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo787a(int i, Account account, avo avo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(avo != null ? avo.asBinder() : null);
                    this.f4684a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo788a(ape ape, int i, boolean z) throws RemoteException {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(ape != null ? ape.asBinder() : null);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f4684a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo789a(avo avo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(avo != null ? avo.asBinder() : null);
                    this.f4684a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo790a(zzad zzad, apj apj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (zzad != null) {
                        obtain.writeInt(1);
                        zzad.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(apj != null ? apj.asBinder() : null);
                    this.f4684a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo791a(zzd zzd, avo avo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (zzd != null) {
                        obtain.writeInt(1);
                        zzd.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(avo != null ? avo.asBinder() : null);
                    this.f4684a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo792a(zzban zzban) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (zzban != null) {
                        obtain.writeInt(1);
                        zzban.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4684a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo793a(zzbar zzbar, avo avo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (zzbar != null) {
                        obtain.writeInt(1);
                        zzbar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(avo != null ? avo.asBinder() : null);
                    this.f4684a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo794a(zzbau zzbau, avo avo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (zzbau != null) {
                        obtain.writeInt(1);
                        zzbau.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(avo != null ? avo.asBinder() : null);
                    this.f4684a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo795a(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f4684a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4684a;
            }

            /* renamed from: b */
            public void mo796b(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f4684a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static avp m6040a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof avp)) ? new C0853a(iBinder) : (avp) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            zzbau zzbau = null;
            switch (i) {
                case 2:
                    zzd zzd;
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        zzd = (zzd) zzd.CREATOR.createFromParcel(parcel);
                    }
                    mo791a(zzd, C0749a.m5275a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    zzban zzban;
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        zzban = (zzban) zzban.CREATOR.createFromParcel(parcel);
                    }
                    mo792a(zzban);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    mo795a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    zzad zzad;
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        zzad = (zzad) zzad.CREATOR.createFromParcel(parcel);
                    }
                    mo790a(zzad, C0688a.m4847a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    mo786a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Account account;
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        account = (Account) Account.CREATOR.createFromParcel(parcel);
                    }
                    mo787a(readInt, account, C0749a.m5275a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    ape a = C0657a.m4671a(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo788a(a, readInt2, z);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    zzbar zzbar;
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        zzbar = (zzbar) zzbar.CREATOR.createFromParcel(parcel);
                    }
                    mo793a(zzbar, C0749a.m5275a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    mo789a(C0749a.m5275a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        zzbau = (zzbau) zzbau.CREATOR.createFromParcel(parcel);
                    }
                    mo794a(zzbau, C0749a.m5275a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo796b(z);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo786a(int i) throws RemoteException;

    /* renamed from: a */
    void mo787a(int i, Account account, avo avo) throws RemoteException;

    /* renamed from: a */
    void mo788a(ape ape, int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo789a(avo avo) throws RemoteException;

    /* renamed from: a */
    void mo790a(zzad zzad, apj apj) throws RemoteException;

    /* renamed from: a */
    void mo791a(zzd zzd, avo avo) throws RemoteException;

    /* renamed from: a */
    void mo792a(zzban zzban) throws RemoteException;

    /* renamed from: a */
    void mo793a(zzbar zzbar, avo avo) throws RemoteException;

    /* renamed from: a */
    void mo794a(zzbau zzbau, avo avo) throws RemoteException;

    /* renamed from: a */
    void mo795a(boolean z) throws RemoteException;

    /* renamed from: b */
    void mo796b(boolean z) throws RemoteException;
}
