package com.lang;

public class MyDemo {
    public void test(Demo demo) {
        demo.method();
    }

    public static void main(String[] args) {
        MyDemo myDemo = new MyDemo();
        myDemo.test(new Demo() {
            @Override
            public void method() {
                System.out.println("impl");
            }
        });
    }
}
