package com.lang.modifier;

public class Sun extends Father{
    String mem = "son";
    public     static void func(){
        System.out.println("son static");
    }
    public  void func3() {
        System.out.println("son non static");
        String a = super.mem;
    }

    public  static void main(String[] args) {
        Sun son = new Sun();
        Father father = new Father();
        Father father1 = new Sun();
        System.out.println(father1.mem);
        System.out.println(son.mem);

        father1.func3();
    }
}
