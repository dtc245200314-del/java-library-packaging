package com.codegym;

import java.security.NoSuchAlgorithmException;

/** Integer arithmetic library. The checked exception follows activity 538's API. */
public final class Calculator {
    private Calculator() {}
    public static int sum(int a, int b) { return a + b; }
    public static int sub(int a, int b) { return a - b; }
    public static int mul(int a, int b) { return a * b; }
    public static int divide(int a, int b) throws NoSuchAlgorithmException {
        if (b == 0) throw new NoSuchAlgorithmException("Cannot divide by zero");
        return a / b;
    }
}
