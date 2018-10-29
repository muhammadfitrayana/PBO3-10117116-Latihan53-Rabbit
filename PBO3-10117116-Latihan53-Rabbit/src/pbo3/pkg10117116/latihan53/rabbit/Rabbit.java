/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan53.rabbit;

/**
 *
 * @author Muhammad Fitrayana
 */
public class Rabbit extends Animal {
    private String color;
    private String name;

    public Rabbit(String color, String name, boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
