package com.p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: aoe */
public class aoe {

    /* renamed from: aoe$a */
    public static class C0656a extends RuntimeException {
        public C0656a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            super(new StringBuilder(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(dataPosition).append(" size=").append(parcel.dataSize()).toString());
        }
    }

    /* renamed from: a */
    public static int m4617a(int i) {
        return 65535 & i;
    }

    /* renamed from: a */
    public static int m4618a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m4619a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4620a(Parcel parcel, int i, Creator<T> creator) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    /* renamed from: a */
    private static void m4621a(Parcel parcel, int i, int i2) {
        int a = aoe.m4619a(parcel, i);
        if (a != i2) {
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C0656a(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m4622a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw new C0656a(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i3).append(" got ").append(i2).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m4623b(Parcel parcel) {
        int a = aoe.m4618a(parcel);
        int a2 = aoe.m4619a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (aoe.m4617a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C0656a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new C0656a("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    /* renamed from: b */
    public static void m4624b(Parcel parcel, int i) {
        parcel.setDataPosition(aoe.m4619a(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static <T> T[] m4625b(Parcel parcel, int i, Creator<T> creator) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m4626c(Parcel parcel, int i, Creator<T> creator) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m4627c(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static short m4628d(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: e */
    public static int m4629e(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: f */
    public static Integer m4630f(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        if (a == 0) {
            return null;
        }
        aoe.m4622a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: g */
    public static long m4631g(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: h */
    public static Long m4632h(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        if (a == 0) {
            return null;
        }
        aoe.m4622a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: i */
    public static float m4633i(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static double m4634j(Parcel parcel, int i) {
        aoe.m4621a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: k */
    public static String m4635k(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    /* renamed from: l */
    public static IBinder m4636l(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: m */
    public static Bundle m4637m(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    /* renamed from: n */
    public static byte[] m4638n(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    /* renamed from: o */
    public static byte[][] m4639o(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    /* renamed from: p */
    public static int[] m4640p(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    /* renamed from: q */
    public static String[] m4641q(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList<Integer> m4642r(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: s */
    public static ArrayList<String> m4643s(Parcel parcel, int i) {
        int a = aoe.m4619a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }
}
