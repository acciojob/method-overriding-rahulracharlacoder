package com.driver;

public class Main {
  public class B extends A{
    public String meth() {return "Method is overridden in Extended class B";}
}
  public static void main(String[] args) {
    B b = new B();
    System.out.println(b.meth());
  }
}
