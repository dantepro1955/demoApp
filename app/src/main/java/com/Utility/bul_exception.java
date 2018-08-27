package com.Utility;

public class bul_exception extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public bul_exception(String str) {
        super(str);
    }

    public bul_exception(String str, Throwable th) {
        super(str, th);
    }

    public bul_exception(Throwable th) {
        super(th);
    }
}