package com.study;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable r = ()-> System.out.println("无参，只有一行代码，无返回值");
        r.run();
        System.out.println("ceshi");
    }
}
