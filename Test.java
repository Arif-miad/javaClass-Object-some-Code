/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Arif Miad
 */
public class Test {
    public static void main(String[] args) {
         Teacher Teacher1 = new Teacher();
         Teacher1.name = "Tanim";
         Teacher1.gender = "Male";
         Teacher1.age = 25;
        Teacher1.phone = 1703468954;
/*        System.out.println("name"+Teacher1); */
        System.out.println("name "+Teacher1.name);
        System.out.println("gender "+Teacher1.gender);
        System.out.println("age "+Teacher1.age);
        System.out.println("phone "+Teacher1.phone);
         System.out.println();
         Teacher Teacher2 = new Teacher();
         Teacher2.name = "Tanim";
         Teacher2.gender = "Male";
         Teacher2.age = 25;
        Teacher2.phone = 1703468954;
/*        System.out.println("name"+Teacher1); */
        System.out.println("name "+Teacher2.name);
        System.out.println("gender "+Teacher2.gender);
        System.out.println("age "+Teacher2.age);
        System.out.println("phone "+Teacher2.phone);
    }
   
}
