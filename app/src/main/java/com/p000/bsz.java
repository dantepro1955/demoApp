package com.p000;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import java.util.List;
import p000.bta.C1455a.C1454a;
import p000.btb.C1457a.C1456a;
import p000.btc.C1459a.C1458a;
import p000.btd.C1461a.C1460a;
import p000.bto.C1482a;

/* renamed from: bsz */
public interface bsz extends IInterface {

    /* renamed from: bsz$a */
    public static abstract class C1453a extends Binder implements bsz {

        /* renamed from: bsz$a$a */
        static class C1452a implements bsz {
            /* renamed from: a */
            private IBinder f7576a;

            C1452a(IBinder iBinder) {
                this.f7576a = iBinder;
            }

            /* renamed from: a */
            public final void mo1437a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1438a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f7576a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1439a(Configuration configuration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7576a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1440a(bta bta) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(bta != null ? bta.asBinder() : null);
                    this.f7576a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1441a(btb btb) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(btb != null ? btb.asBinder() : null);
                    this.f7576a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1442a(btc btc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(btc != null ? btc.asBinder() : null);
                    this.f7576a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1443a(btd btd) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(btd != null ? btd.asBinder() : null);
                    this.f7576a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1444a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    this.f7576a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1445a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f7576a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1446a(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f7576a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1447a(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f7576a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1448a(boolean z) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f7576a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo1449a(int i, KeyEvent keyEvent) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7576a.transact(41, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final boolean mo1450a(Bundle bundle) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7576a.transact(40, obtain, obtain2, 0);
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

            public final IBinder asBinder() {
                return this.f7576a;
            }

            /* renamed from: b */
            public final void mo1451b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1452b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f7576a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1453b(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f7576a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1454b(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f7576a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1455b(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f7576a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1456b(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7576a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo1457b(int i, KeyEvent keyEvent) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7576a.transact(42, obtain, obtain2, 0);
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

            /* renamed from: c */
            public final void mo1458c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f7576a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo1459c(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7576a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo1460c() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(10, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final void mo1461d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f7576a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo1462d(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7576a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final boolean mo1463d() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(11, obtain, obtain2, 0);
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

            /* renamed from: e */
            public final void mo1464e(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7576a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final boolean mo1465e() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(12, obtain, obtain2, 0);
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

            /* renamed from: f */
            public final void mo1466f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo1467g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final int mo1468h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final int mo1469i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final int mo1470j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo1471k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo1472l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo1473m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final void mo1474n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final void mo1475o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo1476p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final void mo1477q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final Bundle mo1478r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(39, obtain, obtain2, 0);
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

            /* renamed from: s */
            public final bto mo1479s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f7576a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    bto a = C1482a.m10943a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static bsz m10804a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bsz)) ? new C1452a(iBinder) : (bsz) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            int i3 = 0;
            boolean c;
            int h;
            boolean z;
            IBinder readStrongBinder;
            IInterface queryLocalInterface;
            Bundle r;
            int readInt;
            KeyEvent keyEvent;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1448a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1445a(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1453b(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1446a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1454b(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1447a(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1455b(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1437a();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1451b();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    c = mo1460c();
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    c = mo1463d();
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    c = mo1465e();
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1466f();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1467g();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    h = mo1468h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    h = mo1469i();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1438a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1452b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1456b(z);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1458c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    h = mo1470j();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1461d(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1444a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1459c(z);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1462d(z);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    bta c1454a;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                        c1454a = (queryLocalInterface == null || !(queryLocalInterface instanceof bta)) ? new C1454a(readStrongBinder) : (bta) queryLocalInterface;
                    }
                    mo1440a(c1454a);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    btd c1460a;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                        c1460a = (queryLocalInterface == null || !(queryLocalInterface instanceof btd)) ? new C1460a(readStrongBinder) : (btd) queryLocalInterface;
                    }
                    mo1443a(c1460a);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    btc c1458a;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        c1458a = (queryLocalInterface == null || !(queryLocalInterface instanceof btc)) ? new C1458a(readStrongBinder) : (btc) queryLocalInterface;
                    }
                    mo1442a(c1458a);
                    parcel2.writeNoException();
                    return true;
                case 29:
                    btb c1456a;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        c1456a = (queryLocalInterface == null || !(queryLocalInterface instanceof btb)) ? new C1456a(readStrongBinder) : (btb) queryLocalInterface;
                    }
                    mo1441a(c1456a);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1471k();
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1472l();
                    parcel2.writeNoException();
                    return true;
                case 32:
                    Configuration configuration;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        configuration = (Configuration) Configuration.CREATOR.createFromParcel(parcel);
                    }
                    mo1439a(configuration);
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1473m();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1474n();
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1475o();
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1476p();
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1464e(z);
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    mo1477q();
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    r = mo1478r();
                    parcel2.writeNoException();
                    if (r != null) {
                        parcel2.writeInt(1);
                        r.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (parcel.readInt() != 0) {
                        r = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    c = mo1450a(r);
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    c = mo1449a(readInt, keyEvent);
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    c = mo1457b(readInt, keyEvent);
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bto s = mo1479s();
                    parcel2.writeNoException();
                    if (s != null) {
                        iBinder = s.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1437a() throws RemoteException;

    /* renamed from: a */
    void mo1438a(int i) throws RemoteException;

    /* renamed from: a */
    void mo1439a(Configuration configuration) throws RemoteException;

    /* renamed from: a */
    void mo1440a(bta bta) throws RemoteException;

    /* renamed from: a */
    void mo1441a(btb btb) throws RemoteException;

    /* renamed from: a */
    void mo1442a(btc btc) throws RemoteException;

    /* renamed from: a */
    void mo1443a(btd btd) throws RemoteException;

    /* renamed from: a */
    void mo1444a(String str) throws RemoteException;

    /* renamed from: a */
    void mo1445a(String str, int i) throws RemoteException;

    /* renamed from: a */
    void mo1446a(String str, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo1447a(List<String> list, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo1448a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo1449a(int i, KeyEvent keyEvent) throws RemoteException;

    /* renamed from: a */
    boolean mo1450a(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo1451b() throws RemoteException;

    /* renamed from: b */
    void mo1452b(int i) throws RemoteException;

    /* renamed from: b */
    void mo1453b(String str, int i) throws RemoteException;

    /* renamed from: b */
    void mo1454b(String str, int i, int i2) throws RemoteException;

    /* renamed from: b */
    void mo1455b(List<String> list, int i, int i2) throws RemoteException;

    /* renamed from: b */
    void mo1456b(boolean z) throws RemoteException;

    /* renamed from: b */
    boolean mo1457b(int i, KeyEvent keyEvent) throws RemoteException;

    /* renamed from: c */
    void mo1458c(int i) throws RemoteException;

    /* renamed from: c */
    void mo1459c(boolean z) throws RemoteException;

    /* renamed from: c */
    boolean mo1460c() throws RemoteException;

    /* renamed from: d */
    void mo1461d(int i) throws RemoteException;

    /* renamed from: d */
    void mo1462d(boolean z) throws RemoteException;

    /* renamed from: d */
    boolean mo1463d() throws RemoteException;

    /* renamed from: e */
    void mo1464e(boolean z) throws RemoteException;

    /* renamed from: e */
    boolean mo1465e() throws RemoteException;

    /* renamed from: f */
    void mo1466f() throws RemoteException;

    /* renamed from: g */
    void mo1467g() throws RemoteException;

    /* renamed from: h */
    int mo1468h() throws RemoteException;

    /* renamed from: i */
    int mo1469i() throws RemoteException;

    /* renamed from: j */
    int mo1470j() throws RemoteException;

    /* renamed from: k */
    void mo1471k() throws RemoteException;

    /* renamed from: l */
    void mo1472l() throws RemoteException;

    /* renamed from: m */
    void mo1473m() throws RemoteException;

    /* renamed from: n */
    void mo1474n() throws RemoteException;

    /* renamed from: o */
    void mo1475o() throws RemoteException;

    /* renamed from: p */
    void mo1476p() throws RemoteException;

    /* renamed from: q */
    void mo1477q() throws RemoteException;

    /* renamed from: r */
    Bundle mo1478r() throws RemoteException;

    /* renamed from: s */
    bto mo1479s() throws RemoteException;
}
