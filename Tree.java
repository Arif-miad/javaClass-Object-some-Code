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
public class Tree {
String name,gender;
int age,phone;
void display(String n,String m,int a,int p)
{
    name = n;
    gender = m;
    age = a;
    phone = p; 
   
}
    void display()
    {
        System.out.println("name " +name);
        System.out.println("gender " +gender);
        System.out.println("age " +age);
        System.out.println("phone "+phone);
    }
}
