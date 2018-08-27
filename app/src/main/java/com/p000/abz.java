package com.p000;

/* compiled from: MiddleOutFallbackStrategy */
/* renamed from: abz */
class abz implements ack {
    /* renamed from: a */
    private final int f302a;
    /* renamed from: b */
    private final ack[] f303b;
    /* renamed from: c */
    private final aca f304c;

    public abz(int i, ack... ackArr) {
        this.f302a = i;
        this.f303b = ackArr;
        this.f304c = new aca(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo27a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f302a) {
            return stackTraceElementArr;
        }
        ack[] ackArr = this.f303b;
        int length = ackArr.length;
        int i = 0;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        while (i < length) {
            ack ack = ackArr[i];
            if (stackTraceElementArr2.length <= this.f302a) {
                break;
            }
            i++;
            stackTraceElementArr2 = ack.mo27a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f302a) {
            stackTraceElementArr2 = this.f304c.mo27a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
