package com.naresh.ftaJavaCode;

public class WithoutString {
    public static void main(String[] args) {
        String WithoutStringResult=withoutString("Hello there", "llo");
        System.out.println(WithoutStringResult);
    }
    public static String withoutString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length(); i++) {
            if (i > base.length() - remove.length()) {
                result += base.substring(i, base.length());
                break;
            } else {
                String substring = base.substring(i, i + remove.length());
                if (!(substring.equalsIgnoreCase(remove))) {
                    result += base.charAt(i);
                } else {
                    i = i + remove.length() - 1;
                }
            }
        }
        return result;
    }

}

