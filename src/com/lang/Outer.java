package com.lang;

public class Outer {
    public  void doSth() {
        int a = 10;
        class  Inner {
            public void seeOuter() {
                System.out.println(a);
            }
        }

        Inner in = new Inner();
        in.seeOuter();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doSth();
    }
}
