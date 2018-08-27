package com.p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import java.util.List;
import p000.aqq.C0701a;
import p000.bez.C1116a;
import p000.bfb.C1131a;
import p000.bfc.C1133a;
import p000.bjf.C1249a;

/* renamed from: bey */
public interface bey extends IInterface {

    /* renamed from: bey$a */
    public static abstract class C1127a extends Binder implements bey {

        /* renamed from: bey$a$a */
        static class C1126a implements bey {
            /* renamed from: a */
            private IBinder f5918a;

            C1126a(IBinder iBinder) {
                this.f5918a = iBinder;
            }

            /* renamed from: a */
            public aqq mo1054a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1055a(aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f5918a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1056a(aqq aqq, bjf bjf, List<String> list) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (bjf != null) {
                        iBinder = bjf.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeStringList(list);
                    this.f5918a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1057a(aqq aqq, zzec zzec, String str, bez bez) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bez != null) {
                        iBinder = bez.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5918a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1058a(aqq aqq, zzec zzec, String str, bjf bjf, String str2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bjf != null) {
                        iBinder = bjf.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str2);
                    this.f5918a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1059a(aqq aqq, zzec zzec, String str, String str2, bez bez) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bez != null) {
                        iBinder = bez.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5918a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1060a(aqq aqq, zzec zzec, String str, String str2, bez bez, zzhc zzhc, List<String> list) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bez != null) {
                        iBinder = bez.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (zzhc != null) {
                        obtain.writeInt(1);
                        zzhc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    this.f5918a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1061a(aqq aqq, zzeg zzeg, zzec zzec, String str, bez bez) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzeg != null) {
                        obtain.writeInt(1);
                        zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bez != null) {
                        iBinder = bez.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5918a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1062a(aqq aqq, zzeg zzeg, zzec zzec, String str, String str2, bez bez) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzeg != null) {
                        obtain.writeInt(1);
                        zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bez != null) {
                        iBinder = bez.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5918a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1063a(zzec zzec, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f5918a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1064a(zzec zzec, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if (zzec != null) {
                        obtain.writeInt(1);
                        zzec.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f5918a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5918a;
            }

            /* renamed from: b */
            public void mo1065b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1066c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo1067d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo1068e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo1069f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public boolean mo1070g() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public bfb mo1071h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    bfb a = C1131a.m8029a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public bfc mo1072i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    bfc a = C1133a.m8060a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public Bundle mo1073j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public Bundle mo1074k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public Bundle mo1075l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public boolean mo1076m() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f5918a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1127a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }

        /* renamed from: a */
        public static bey m7974a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bey)) ? new C1126a(iBinder) : (bey) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = 0;
            IBinder iBinder = null;
            boolean g;
            Bundle j;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1061a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzeg) zzeg.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1116a.m7858a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    aqq a = mo1054a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1057a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1116a.m7858a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1065b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1066c();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1062a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzeg) zzeg.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), C1116a.m7858a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1059a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), C1116a.m7858a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1067d();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1068e();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1058a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1249a.m8814a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1063a(parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1069f();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    g = mo1070g();
                    parcel2.writeNoException();
                    if (g) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    zzhc zzhc;
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    aqq a2 = C0701a.m4966a(parcel.readStrongBinder());
                    zzec zzec = parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    bez a3 = C1116a.m7858a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzhc = (zzhc) zzhc.CREATOR.createFromParcel(parcel);
                    }
                    mo1060a(a2, zzec, readString, readString2, a3, zzhc, parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    bfb h = mo1071h();
                    parcel2.writeNoException();
                    if (h != null) {
                        iBinder = h.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    bfc i4 = mo1072i();
                    parcel2.writeNoException();
                    if (i4 != null) {
                        iBinder = i4.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    j = mo1073j();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        j.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    j = mo1074k();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        j.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    j = mo1075l();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        j.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1064a(parcel.readInt() != 0 ? (zzec) zzec.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1055a(C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    g = mo1076m();
                    parcel2.writeNoException();
                    if (g) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    mo1056a(C0701a.m4966a(parcel.readStrongBinder()), C1249a.m8814a(parcel.readStrongBinder()), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    aqq mo1054a() throws RemoteException;

    /* renamed from: a */
    void mo1055a(aqq aqq) throws RemoteException;

    /* renamed from: a */
    void mo1056a(aqq aqq, bjf bjf, List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo1057a(aqq aqq, zzec zzec, String str, bez bez) throws RemoteException;

    /* renamed from: a */
    void mo1058a(aqq aqq, zzec zzec, String str, bjf bjf, String str2) throws RemoteException;

    /* renamed from: a */
    void mo1059a(aqq aqq, zzec zzec, String str, String str2, bez bez) throws RemoteException;

    /* renamed from: a */
    void mo1060a(aqq aqq, zzec zzec, String str, String str2, bez bez, zzhc zzhc, List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo1061a(aqq aqq, zzeg zzeg, zzec zzec, String str, bez bez) throws RemoteException;

    /* renamed from: a */
    void mo1062a(aqq aqq, zzeg zzeg, zzec zzec, String str, String str2, bez bez) throws RemoteException;

    /* renamed from: a */
    void mo1063a(zzec zzec, String str) throws RemoteException;

    /* renamed from: a */
    void mo1064a(zzec zzec, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo1065b() throws RemoteException;

    /* renamed from: c */
    void mo1066c() throws RemoteException;

    /* renamed from: d */
    void mo1067d() throws RemoteException;

    /* renamed from: e */
    void mo1068e() throws RemoteException;

    /* renamed from: f */
    void mo1069f() throws RemoteException;

    /* renamed from: g */
    boolean mo1070g() throws RemoteException;

    /* renamed from: h */
    bfb mo1071h() throws RemoteException;

    /* renamed from: i */
    bfc mo1072i() throws RemoteException;

    /* renamed from: j */
    Bundle mo1073j() throws RemoteException;

    /* renamed from: k */
    Bundle mo1074k() throws RemoteException;

    /* renamed from: l */
    Bundle mo1075l() throws RemoteException;

    /* renamed from: m */
    boolean mo1076m() throws RemoteException;
}
