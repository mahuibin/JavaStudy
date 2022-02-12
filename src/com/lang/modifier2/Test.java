package com.lang.modifier2;

import com.lang.modifier.Father;
import com.lang.modifier.TestClass;

public class Test {
    public  static void main(String args[] ) {
    //    Son son  = new Son();
        //son.func();
   //     Father father = new Father();
        new TestClass() {
            void callParentTest() {
                super.test();
            }
        }.callParentTest();
    }

}
