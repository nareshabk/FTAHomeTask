package com.naresh.ftaJavaCode;


public class DuplicateString {
    public static void main(String[] args) {
        String inputstring="HimaBindu";
        int count=0;
        for(int i=0;i<inputstring.length();i++)
        {
            for(int j=i+1;j<inputstring.length();j++)
            {
                if(inputstring.charAt(i)==inputstring.charAt(j))
                {
                    System.out.println(inputstring.charAt(j));
                    count++;
                }
            }
        }
    }
}

