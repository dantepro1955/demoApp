package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.zzvg;
import com.google.android.gms.internal.zzvi;
import com.google.android.gms.internal.zzvm;
import p000.bot.C1378a;

/* renamed from: bou */
public interface bou extends IInterface {

    /* renamed from: bou$a */
    public static abstract class C1380a extends Binder implements bou {

        /* renamed from: bou$a$a */
        static class C1379a implements bou {
            /* renamed from: a */
            private IBinder f7271a;

            C1379a(IBinder iBinder) {
                this.f7271a = iBinder;
            }

            /* renamed from: a */
            public void mo1370a(bot bot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(bot != null ? bot.asBinder() : null);
                    this.f7271a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1371a(bot bot, CredentialRequest credentialRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(bot != null ? bot.asBinder() : null);
                    if (credentialRequest != null) {
                        obtain.writeInt(1);
                        credentialRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7271a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1372a(bot bot, zzvg zzvg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(bot != null ? bot.asBinder() : null);
                    if (zzvg != null) {
                        obtain.writeInt(1);
                        zzvg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7271a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1373a(bot bot, zzvi zzvi) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(bot != null ? bot.asBinder() : null);
                    if (zzvi != null) {
                        obtain.writeInt(1);
                        zzvi.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7271a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1374a(bot bot, zzvm zzvm) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(bot != null ? bot.asBinder() : null);
                    if (zzvm != null) {
                        obtain.writeInt(1);
                        zzvm.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7271a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7271a;
            }
        }

        /* renamed from: a */
        public static bou m10203a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bou)) ? new C1379a(iBinder) : (bou) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzvi zzvi = null;
            bot a;
            switch (i) {
                case 1:
                    CredentialRequest credentialRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = C1378a.m10192a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        credentialRequest = (CredentialRequest) CredentialRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1371a(a, credentialRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    zzvm zzvm;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = C1378a.m10192a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzvm = (zzvm) zzvm.CREATOR.createFromParcel(parcel);
                    }
                    mo1374a(a, zzvm);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    zzvg zzvg;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = C1378a.m10192a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzvg = (zzvg) zzvg.CREATOR.createFromParcel(parcel);
                    }
                    mo1372a(a, zzvg);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    mo1370a(C1378a.m10192a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a = C1378a.m10192a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzvi = (zzvi) zzvi.CREATOR.createFromParcel(parcel);
                    }
                    mo1373a(a, zzvi);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1370a(bot bot) throws RemoteException;

    /* renamed from: a */
    void mo1371a(bot bot, CredentialRequest credentialRequest) throws RemoteException;

    /* renamed from: a */
    void mo1372a(bot bot, zzvg zzvg) throws RemoteException;

    /* renamed from: a */
    void mo1373a(bot bot, zzvi zzvi) throws RemoteException;

    /* renamed from: a */
    void mo1374a(bot bot, zzvm zzvm) throws RemoteException;
}
