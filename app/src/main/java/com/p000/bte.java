package com.p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bsy.C1451a.C1450a;

/* renamed from: bte */
public interface bte extends IInterface {

    /* renamed from: bte$a */
    public static abstract class C1463a extends Binder implements bte {

        /* renamed from: bte$a$a */
        static class C1462a implements bte {
            /* renamed from: a */
            private IBinder f7581a;

            C1462a(IBinder iBinder) {
                this.f7581a = iBinder;
            }

            /* renamed from: a */
            public final void mo1495a(bsy bsy, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(bsy != null ? bsy.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7581a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7581a;
            }
        }

        /* renamed from: a */
        public static bte m10837a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bte)) ? new C1462a(iBinder) : (bte) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle = null;
            switch (i) {
                case 1:
                    bsy bsy;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IServiceBroker");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        bsy = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                        bsy = (queryLocalInterface == null || !(queryLocalInterface instanceof bsy)) ? new C1450a(readStrongBinder) : (bsy) queryLocalInterface;
                    }
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo1495a(bsy, readInt, readString, readString2, readString3, bundle);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IServiceBroker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1495a(bsy bsy, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;
}
