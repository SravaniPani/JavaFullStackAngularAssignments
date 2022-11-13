package com.strings;

public class StringBufferEx {
    public static void main(String[] args) {
        /*StringBuffer sb=new StringBuffer("StringBuffer ");
        sb.append("is a peer class of string");
        //System.out.println(sb);
        sb.append(" that provides much of");
        //System.out.println(sb);
        sb.append(" the functionality of strings");
        System.out.println(sb);*/
        /*StringBuffer sb=new StringBuffer("It is used to _ at the specified index position");
        sb.insert(15,"insert text");
        System.out.println(sb);*/
        StringBuffer sb = new StringBuffer("This method returns the reversed object on which it was called");
        sb.reverse();
        System.out.println(sb);
    }
}
