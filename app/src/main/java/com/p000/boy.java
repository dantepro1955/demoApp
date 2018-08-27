package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.zza;
import p000.box.C1382a;

/* renamed from: boy */
public interface boy extends IInterface {

    /* renamed from: boy$a */
    public static abstract class C1384a extends Binder implements boy {

        /* renamed from: boy$a$a */
        static class C1383a implements boy {
            /* renamed from: a */
            private IBinder f7274a;

            C1383a(IBinder iBinder) {
                this.f7274a = iBinder;
            }

            /* renamed from: a */
            public void mo1377a(box box) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(box != null ? box.asBinder() : null);
                    this.f7274a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1378a(box box, ProxyRequest proxyRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(box != null ? box.asBinder() : null);
                    if (proxyRequest != null) {
                        obtain.writeInt(1);
                        proxyRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7274a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1379a(box box, zza zza) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(box != null ? box.asBinder() : null);
                    if (zza != null) {
                        obtain.writeInt(1);
                        zza.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7274a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7274a;
            }
        }

        /* renamed from: a */
        public static boy m10224a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof boy)) ? new C1383a(iBinder) : (boy) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zza zza = null;
            box a;
            switch (i) {
                case 1:
                    ProxyRequest proxyRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a = C1382a.m10217a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        proxyRequest = (ProxyRequest) ProxyRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1378a(a, proxyRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a = C1382a.m10217a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zza = (zza) zza.CREATOR.createFromParcel(parcel);
                    }
                    mo1379a(a, zza);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    mo1377a(C1382a.m10217a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1377a(box box) throws RemoteException;

    /* renamed from: a */
    void mo1378a(box box, ProxyRequest proxyRequest) throws RemoteException;

    /* renamed from: a */
    void mo1379a(box box, zza zza) throws RemoteException;
}
