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
public class test1 {
    public static void main(String[] args) {
        Pro pro = new Pro();
        pro.name = "Arif";
        pro.gender = "male";
        pro.age = 21;
        pro.phone = 1703468954;
        System.out.println("name "+pro.name);
        System.out.println("gender "+pro.gender);
        System.out.println("age "+pro.age);
        System.out.println("phone "+pro.phone);
    }
}
