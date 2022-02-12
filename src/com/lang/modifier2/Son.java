package com.lang.modifier2;

import com.lang.modifier.Father;

public class Son extends Father {
    public   void func2() {
        func();
        Father f = new Father();

    }
    public static  void main(String args[]) {
        Father f = new Father();

    }
}
