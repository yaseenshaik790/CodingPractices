/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.advancejava;

/**
 *
 * @author Yaseen
 */
public class VarArgsExample {

    public static void main(String[] args) {
        String[] values = new String[]{"Jack", "David", "Wade"};
        String message = "Yaseen is Good";
        pringMessages(message);
        pringMessages(values);
    }

    static void pringMessages(String... args) {

        System.out.println("Print Message");
        for (String s : args) {
            System.out.println(s);
        }
    }
}
