package com.naresh.ftaJavaCode;

public class shareDigit {
    static int a, b;
    public static void main(String[] args) {
        Boolean DigitResult= Digit(12,23);
        System.out.println(DigitResult);

    }

    public static boolean Digit(int a,int b) {

        if ((a / 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b / 10) || (a % 10 == b % 10)) {
            return true;
        }
        else {
            return false;
        }
    }

}
