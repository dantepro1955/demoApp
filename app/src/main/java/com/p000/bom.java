package com.p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bol.C1373a;

/* renamed from: bom */
public interface bom extends IInterface {

    /* renamed from: bom$a */
    public static abstract class C1375a extends Binder implements bom {

        /* renamed from: bom$a$a */
        static class C1374a implements bom {
            /* renamed from: a */
            private IBinder f7263a;

            C1374a(IBinder iBinder) {
                this.f7263a = iBinder;
            }

            /* renamed from: a */
            public void mo1366a(Account account, int i, bol bol) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(bol != null ? bol.asBinder() : null);
                    this.f7263a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7263a;
            }
        }

        /* renamed from: a */
        public static bom m10169a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bom)) ? new C1374a(iBinder) : (bom) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    mo1366a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), C1373a.m10166a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1366a(Account account, int i, bol bol) throws RemoteException;
}
