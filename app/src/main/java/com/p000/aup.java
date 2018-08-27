package com.p000;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aup */
public interface aup extends IInterface {

    /* renamed from: aup$a */
    public static abstract class C0833a extends Binder implements aup {

        /* renamed from: aup$a$a */
        static class C0832a implements aup {
            /* renamed from: a */
            private IBinder f4615a;

            C0832a(IBinder iBinder) {
                this.f4615a = iBinder;
            }

            /* renamed from: a */
            public void mo737a(int i, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4615a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo738a(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f4615a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4615a;
            }

            /* renamed from: b */
            public void mo739b(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f4615a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static aup m5799a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aup)) ? new C0832a(iBinder) : (aup) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    mo738a(parcel.readInt(), parcel.createStringArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    mo739b(parcel.readInt(), parcel.createStringArray());
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    mo737a(parcel.readInt(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo737a(int i, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo738a(int i, String[] strArr) throws RemoteException;

    /* renamed from: b */
    void mo739b(int i, String[] strArr) throws RemoteException;
}
