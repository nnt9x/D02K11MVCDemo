package com.bkacad.nnt.d02k11mvcdemo.utils;

public final class MyUtils {

    private MyUtils(){};

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
