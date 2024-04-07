/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code;

import java.util.Scanner;

/**
 *
 * @author Computer
 */
public class NewClass {
public static void soNT(int n) {
    boolean co = true;
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            System.out.println(i);
            co = false;
            break;
        }
    }
    if (n != 1 && co == true) {
        System.out.print("là số nguyên tố ");
    } else {
        System.out.print("không phải là nguyên tố");
    }
}
    public static void main(String[] args) {
        soNT(4);
        
    }
}
