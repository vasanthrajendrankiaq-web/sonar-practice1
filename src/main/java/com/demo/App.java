package com.demo;
public class App {
   public static void main (string[] args) {
      string username = "demo";
      int a = 100;
      int b = 0;
      int unusedvalue = 50;
      system.out.println(username);
      try {
          int result = a / b;
          system.out.println(result);
      } catch (Exception e) {
      }
      system.out.println("Application started");
    }
}
