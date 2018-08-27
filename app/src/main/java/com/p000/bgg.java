package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bgf.C0212a;

/* renamed from: bgg */
public interface bgg extends IInterface {

    /* renamed from: bgg$a */
    public static abstract class C1166a extends Binder implements bgg {

        /* renamed from: bgg$a$a */
        static class C1165a implements bgg {
            /* renamed from: a */
            private IBinder f6077a;

            C1165a(IBinder iBinder) {
                this.f6077a = iBinder;
            }

            /* renamed from: a */
            public void mo1174a(bgf bgf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeStrongBinder(bgf != null ? bgf.asBinder() : null);
                    this.f6077a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo1175a(String str) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeString(str);
                    this.f6077a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6077a;
            }
        }

        public C1166a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }

        /* renamed from: a */
        public static bgg m8294a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bgg)) ? new C1165a(iBinder) : (bgg) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    boolean a = mo1175a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    mo1174a(C0212a.m1890a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1174a(bgf bgf) throws RemoteException;

    /* renamed from: a */
    boolean mo1175a(String str) throws RemoteException;
}
