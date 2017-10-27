/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

/**
 *
 * @author kazuma
 */
    

 class Human {
 
     public String name = "";
     public Integer age = 0;
     public void setHuman(String n, int a) { 
         this.name = n;
         this.age = a;
 
         printHuman(n, a);
     }
 
     public void printHuman(String n, int a) {
 
         System.out.println("クリアする前");
         System.out.println(n);
         System.out.println(a);
 
     }
 }
 
 class ClearHuman extends Human{
 
     public void clear() {
         this.name = null;
         this.age = null;
 
         System.out.println("クリアした後");
 
         System.out.println(this.name);
         System.out.println(this.age);
     }
 }
 
 public class java13_2_1 {
 
     public static void main(String[] args) {
 
         ClearHuman wada = new ClearHuman();
 
         wada.setHuman("和田　和磨", 27);
 
         wada.age = 30;
 
         wada.clear();
     }
 }
