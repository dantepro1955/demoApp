package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import p000.bhp.C1208a;

/* renamed from: bho */
public interface bho extends IInterface {

    /* renamed from: bho$a */
    public static abstract class C1210a extends Binder implements bho {

        /* renamed from: bho$a$a */
        static class C1209a implements bho {
            /* renamed from: a */
            private IBinder f6259a;

            C1209a(IBinder iBinder) {
                this.f6259a = iBinder;
            }

            /* renamed from: a */
            public zzmn mo1193a(zzmk zzmk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (zzmk != null) {
                        obtain.writeInt(1);
                        zzmk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6259a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzmn zzmn = obtain2.readInt() != 0 ? (zzmn) zzmn.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return zzmn;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1194a(zzmk zzmk, bhp bhp) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (zzmk != null) {
                        obtain.writeInt(1);
                        zzmk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bhp != null ? bhp.asBinder() : null);
                    this.f6259a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6259a;
            }
        }

        public C1210a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        /* renamed from: a */
        public static bho m8509a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bho)) ? new C1209a(iBinder) : (bho) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzmk zzmk = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        zzmk = (zzmk) zzmk.CREATOR.createFromParcel(parcel);
                    }
                    zzmn a = mo1193a(zzmk);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        zzmk = (zzmk) zzmk.CREATOR.createFromParcel(parcel);
                    }
                    mo1194a(zzmk, C1208a.m8494a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    zzmn mo1193a(zzmk zzmk) throws RemoteException;

    /* renamed from: a */
    void mo1194a(zzmk zzmk, bhp bhp) throws RemoteException;
}
