package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bck.C1001a;

/* renamed from: bcn */
public interface bcn extends IInterface {

    /* renamed from: bcn$a */
    public static abstract class C1029a extends Binder implements bcn {

        /* renamed from: bcn$a$a */
        static class C1028a implements bcn {
            /* renamed from: a */
            private IBinder f5588a;

            C1028a(IBinder iBinder) {
                this.f5588a = iBinder;
            }

            /* renamed from: a */
            public void mo1001a(bck bck, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    obtain.writeStrongBinder(bck != null ? bck.asBinder() : null);
                    obtain.writeString(str);
                    this.f5588a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5588a;
            }
        }

        /* renamed from: a */
        public static bcn m7497a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bcn)) ? new C1028a(iBinder) : (bcn) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    mo1001a(C1001a.m7288a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1001a(bck bck, String str) throws RemoteException;
}
