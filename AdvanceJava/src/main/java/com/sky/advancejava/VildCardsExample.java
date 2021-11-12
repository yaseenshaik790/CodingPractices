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
class Product {

    public String toString() {
        return ("Product");
    }
}

class OpenProduct extends Product {

    public String toString() {
        return ("OpenProduct");
    }
}

class Closedproduct extends Product {

    public String toString() {
        return ("Closedproduct");
    }
}

public class VildCardsExample {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product());
        List<OpenProduct> openProducts = new ArrayList<>();
        openProducts.add(new OpenProduct());
        List<Closedproduct> closedproducts = new ArrayList<>();
        closedproducts.add(new Closedproduct());
        printProducts(products);
        printProducts(openProducts);
        printProducts(closedproducts);
    }

    static void printProducts(List<? extends Product> productList) {
        System.out.println("Product List: " + productList);
    }
}
