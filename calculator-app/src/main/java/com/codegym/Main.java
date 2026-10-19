package com.codegym;

import java.security.NoSuchAlgorithmException;

public final class Main {
    public static void main(String[] args) throws Exception {
        verify(Calculator.sum(5, 9) == 14, "sum");
        verify(Calculator.sub(5, 9) == -4, "sub");
        verify(Calculator.mul(5, 9) == 45, "mul");
        verify(Calculator.divide(10, 5) == 2, "divide");
        verify(Calculator.divide(-9, 2) == -4, "integer division");
        try {
            Calculator.divide(10, 0);
            throw new AssertionError("Expected division-by-zero exception");
        } catch (NoSuchAlgorithmException expected) {
            System.out.println("Division by zero correctly rejected.");
        }
        System.out.println("All 6 checks passed using external math-lib JAR.");
    }
    private static void verify(boolean condition, String operation) {
        if (!condition) throw new AssertionError(operation);
    }
}
