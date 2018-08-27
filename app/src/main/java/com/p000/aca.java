package com.p000;

/* compiled from: MiddleOutStrategy */
/* renamed from: aca */
class aca implements ack {
    /* renamed from: a */
    private final int f307a;

    public aca(int i) {
        this.f307a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo27a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f307a) {
            return stackTraceElementArr;
        }
        int i = this.f307a / 2;
        int i2 = this.f307a - i;
        Object obj = new StackTraceElement[this.f307a];
        System.arraycopy(stackTraceElementArr, 0, obj, 0, i2);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i, obj, i2, i);
        return obj;
    }
}
