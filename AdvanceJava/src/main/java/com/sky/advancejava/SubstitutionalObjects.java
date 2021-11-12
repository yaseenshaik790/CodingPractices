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
class Building {

    public String toString() {
        return ("Building");
    }
}

class House extends Building {

    public String toString() {
        return ("House");
    }
}

class Hotel extends Building {

    public String toString() {
        return ("Hotem");
    }
}

public class SubstitutionalObjects {

    public static void main(String[] args) {

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new House());
        buildings.add(new Hotel());
        System.out.println("List: " + buildings);

    }
}
