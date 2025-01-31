/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturetutorial;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Lecturetutorial {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is my first Java Program");
        Scanner s = new Scanner(System.in);        
	System.out.println("Insert your name:");
        String s1 = s.next();
        System.out.println("Hello" + s1);
        String s2 = s.next();
        System.out.println("Hello: " + s1 + " " + s2);
    }
}
