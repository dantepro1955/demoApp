package com.p000;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: bcc */
public interface bcc extends IInterface {

    /* renamed from: bcc$a */
    public static abstract class C0995a extends Binder implements bcc {

        /* renamed from: bcc$a$a */
        static class C1017a implements bcc {
            /* renamed from: a */
            private IBinder f5568a;

            C1017a(IBinder iBinder) {
                this.f5568a = iBinder;
            }

            /* renamed from: a */
            public aqq mo921a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    this.f5568a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5568a;
            }

            /* renamed from: b */
            public Uri mo922b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    this.f5568a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    Uri uri = obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return uri;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public double mo923c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    this.f5568a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    double readDouble = obtain2.readDouble();
                    return readDouble;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0995a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        }

        /* renamed from: a */
        public static bcc m7208a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bcc)) ? new C1017a(iBinder) : (bcc) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    aqq a = mo921a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    Uri b = mo922b();
                    parcel2.writeNoException();
                    if (b != null) {
                        parcel2.writeInt(1);
                        b.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    double c = mo923c();
                    parcel2.writeNoException();
                    parcel2.writeDouble(c);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    aqq mo921a() throws RemoteException;

    /* renamed from: b */
    Uri mo922b() throws RemoteException;

    /* renamed from: c */
    double mo923c() throws RemoteException;
}
