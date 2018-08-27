package com.p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: aof */
public class aof {
    /* renamed from: a */
    public static int m4644a(Parcel parcel) {
        return aof.m4665b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m4645a(Parcel parcel, int i) {
        aof.m4668c(parcel, i);
    }

    /* renamed from: a */
    public static void m4646a(Parcel parcel, int i, double d) {
        aof.m4666b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m4647a(Parcel parcel, int i, float f) {
        aof.m4666b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m4648a(Parcel parcel, int i, int i2) {
        aof.m4666b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m4649a(Parcel parcel, int i, long j) {
        aof.m4666b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m4650a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeBundle(bundle);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4651a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4652a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = aof.m4665b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4653a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            aof.m4666b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4654a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            aof.m4666b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4655a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeString(str);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4656a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int b = aof.m4665b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4657a(Parcel parcel, int i, short s) {
        aof.m4666b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m4658a(Parcel parcel, int i, boolean z) {
        aof.m4666b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m4659a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeByteArray(bArr);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4660a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeIntArray(iArr);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m4661a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    aof.m4664a(parcel, parcelable, i2);
                }
            }
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4662a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeStringArray(strArr);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m4663a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        int i2 = 0;
        if (bArr != null) {
            int b = aof.m4665b(parcel, i);
            int length = bArr.length;
            parcel.writeInt(length);
            while (i2 < length) {
                parcel.writeByteArray(bArr[i2]);
                i2++;
            }
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m4664a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m4665b(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m4666b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    /* renamed from: b */
    public static void m4667b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = aof.m4665b(parcel, i);
            parcel.writeStringList(list);
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }

    /* renamed from: c */
    private static void m4668c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m4669c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int b = aof.m4665b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    aof.m4664a(parcel, parcelable, 0);
                }
            }
            aof.m4668c(parcel, b);
        } else if (z) {
            aof.m4666b(parcel, i, 0);
        }
    }
}
