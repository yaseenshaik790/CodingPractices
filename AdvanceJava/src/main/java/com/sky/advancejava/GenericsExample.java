/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.advancejava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaseen
 */
public class GenericsExample {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Jack");
        l.add("Tel");

        String output = (String) l.get(0);
        System.out.println("Without Generics " + output);

        List<String> l1 = new ArrayList();
        l1.add("Jack");
        l1.add("Tel");

        String output1 = l1.get(0);
        System.out.println("With Generics " + output1);
    }
}
